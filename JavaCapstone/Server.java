package COP2805;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

class WordSearch{
	//declare var here to be used in class scope
	String file;
	List<String> lines;
	
	WordSearch(){
		file = new String("C:\\Users\\steph\\eclipse-workspace\\Proj Test\\src\\hamlet.txt");
		lines = Collections.EMPTY_LIST;
		try {
			lines = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
			lines.replaceAll(String::toUpperCase);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
 public List<Integer> searchWord(String searchStr) {
		
		List<Integer> returnList = new ArrayList();
		searchStr = searchStr.toUpperCase();
		for(int i = 0; i < lines.size(); i++) {
			String str = lines.get(i);
			if(str.indexOf(searchStr) >= 0) {
				returnList.add(i);
			}
		}
		
		return returnList;
	}
}

public class Server {

	public static void main(String[] args) {
		
		WordSearch search = new WordSearch();
		
		ServerSocket serverSoc = null;
		
		try {
			serverSoc = new ServerSocket(6666);
			System.out.println("Connection made!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Failed to connect");
			System.exit(-1);
		}
		
		boolean shutdown = false;
		while(!shutdown) {
			Socket client = null;
			OutputStream outputObj = null;
			InputStream inputObj = null;
			
			try {
				/*
				 *Setup: client connection, inputStream, and outputstream to accept
				 *and send data  
				 */
				client = serverSoc.accept();//client accept server connect
				inputObj = client.getInputStream();//getting the clients input
				outputObj = client.getOutputStream();//output to client
				
				//Read inputStream from client
				int cMessageSize = inputObj.read(); // store how large message is 
				byte[] data = new byte[cMessageSize];//array store message size as size of array
				inputObj.read(data);//"read()" stores info in byte array
				
				//convert stream to string
				String clientMessage = new String(data, StandardCharsets.UTF_8);
				clientMessage = clientMessage.replace("\n", "");
				
				//Pass String to WordSearcher object, receive List<Integer> output 
				List<Integer> returnList = search.searchWord(clientMessage);
				String convert = returnList.toString();
					outputObj.write(returnList.size());
					outputObj.write(convert.getBytes());

				
				
				//Transmit List<Integer> to client
/*				for(Integer x : returnList) {
					String response = x.toString() + "\n";
					outputObj.write(response.length());
					outputObj.write(response.getBytes());
				}
*/				
				client.close();
				
				if(clientMessage.equalsIgnoreCase("shutdown")) {
					System.out.println("Shutting down...");
					shutdown = true;
				}
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}
		}//end while

	}//main

}
