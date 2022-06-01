package COP2805;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.nio.charset.*;

 class Client extends Thread{
	
	public DefaultListModel<Integer> listModel = new DefaultListModel();
	JList<Integer> list = new JList<Integer>(listModel);
	String messageSent = "";
	private Socket socket;
	private InputStream input = null;
	private OutputStream output = null;
	private BufferedReader read = null;
	String servMessage;
	JTextField field;
	JTextArea area = new JTextArea(10, 20);
	
	public void actionDone(ActionEvent e, String messageSent) {
		JButton button = (JButton) e.getSource();
		listModel.clear(); 

		try {

			socket = new Socket("localhost", 6666);
			output = socket.getOutputStream();
			input = socket.getInputStream();
			
			messageSent = field.getText() + "\n";
			
			messageSent.toUpperCase();
			
			output.write(messageSent.length());
			output.write(messageSent.getBytes());
			
			//Read input from server
			int size = input.read();
			byte[] data = new byte[size];
			input.read(data);
			
			servMessage = new String(data, StandardCharsets.UTF_8);
			System.out.println("LOOK HERE----->" + servMessage);
			
			area.append(servMessage + "\n");
			
		
			socket.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
	@Override
	public void run() {
		JFrame frame = new JFrame("Word Finder");
		JPanel panel = new JPanel();
		frame.setSize(500, 500);
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel("FIND: ");
		field = new JTextField(10);
		
		JLabel label2 = new JLabel("Response: ");
		
		//add actionListner to button
		JButton button = new JButton();
		button.setText("Button Text Here");
		button.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	actionDone(e, messageSent);
		    }
		}); 
		
			JScrollPane scrollBar = new JScrollPane(area);
			
			panel.add(label); 
			panel.add(label2);
			panel.add(field);
			//panel.add(new JScrollPane(area)); //NOT WORKING
			panel.add(scrollBar);
			//textArea
	        panel.add(button);  
	        frame.add(panel);
	        frame.pack();
			frame.setVisible(true); 
		
	}

	public static void main(String[] args) {
		
		Client client = new Client();
		client.start();
	}
	
}
