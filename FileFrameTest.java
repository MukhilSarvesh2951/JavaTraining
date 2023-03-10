package Files;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileFrameTest {
	public static void main(String[] args) {
		MyFrame mfr = new MyFrame();
		mfr.setVisible(true);
	}
}
class MyFrame extends JFrame implements ActionListener { //isA
	JLabel label1 = new JLabel("Enter filename"); //hasA
	JTextField filename = new JTextField(20); //hasA

	JLabel label2 = new JLabel("Enter data");//hasA
	JTextArea dataArea = new JTextArea(15,30);//hasA

	JButton save = new JButton("Save"); JButton clear = new JButton("Clear");
	
	MyFrame() {
		setLayout(new FlowLayout());
		setSize(400,500); setLocation(100,100);setTitle("My Notepad");
		add(label1); add(filename);	add(label2); add(dataArea);		
		add(save); add(clear);
		save.addActionListener(this);
		clear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) { //usesA
		if(ae.getSource()==save) {
			System.out.println("Save Button is clicked....");
			try {
				FileOutputStream fout = new FileOutputStream(filename.getText(), true);
				System.out.println("File is ready for editing...");
				
				
				//String str = "this is a SECOND new line now";
				byte barry[] = dataArea.getText().getBytes();
				System.out.println("String is converted into byte array...");
				
				fout.write(barry); //it takes byte as an array
				System.out.println("array is written to the file...");
				
				System.out.println("Closing the file...");
				fout.close();
				System.out.println("file is closed...");
				
				JOptionPane.showMessageDialog(this, "File is saved");
				System.out.println("Closing the file...");
				fout.close();
				System.out.println("File is closed...");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		else
			System.out.println("Clear Button is clicked....");
				
		
	}
	
}