package lab7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.event.*;

public class Framez1 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	String name,address,phno;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Framez1 window = new Framez1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Framez1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(59, 45, 124, 14);
		frame.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(254, 42, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(59, 101, 144, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setBounds(254, 98, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Phone Number");
		lblNewLabel_2.setBounds(59, 160, 157, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				char c = arg0.getKeyChar();
				String phone = t3.getText();
				
				if(Character.isDigit(c) || Character.isISOControl(c))
				{
					t3.setEditable(true);
				}
		       else
		       {
			        
			        JOptionPane.showMessageDialog(frame, " Phone number must contain only digits");
		       }
				if(phone.length()>10)
				{
					t3.setEditable(false);
					JOptionPane.showMessageDialog(frame, "Phone number must contain only 10 digits");
					t3.setEditable(true);
				}

				
		
		}
		});
		t3.setBounds(254, 157, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton submit = new JButton("CLICK");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				name=t1.getText();
				address=t2.getText();
				phno=t3.getText();
				
				if(name.contentEquals(""))
				{
					JOptionPane.showMessageDialog(frame, "name cannot be empty");
				}
				
	
				
				Framez1display fobj = new Framez1display(name,address,phno);
				
			}
		});
		submit.setBounds(160, 210, 89, 23);
		frame.getContentPane().add(submit);
	}
}
