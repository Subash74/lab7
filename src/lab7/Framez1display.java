package lab7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Framez1display {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton backbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Framez1display window = new Framez1display();
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
	public Framez1display() {
		initialize();
	}
	
	public Framez1display(String name1,String address1,String phno1) {
		initialize(name1,address1,phno1);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize(String name1,String address1,String phno1) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(238, 34, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(name1);
		frame.setVisible(true);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setBounds(238, 100, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(address1);
		frame.setVisible(true);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setBounds(238, 172, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(phno1);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(48, 37, 143, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(48, 103, 161, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone Number");
		lblNewLabel_2.setBounds(48, 175, 190, 17 );
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(44, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);

	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(273, 34, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setBounds(273, 100, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setBounds(273, 172, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(48, 37, 143, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(48, 103, 161, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone Number");
		lblNewLabel_2.setBounds(48, 175, 190, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(44, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
