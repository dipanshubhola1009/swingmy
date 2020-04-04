package swingmy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class app extends JFrame {
	public static int x=0;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app frame = new app();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public app() {
		setTitle("birthday");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel mylabel = new JLabel("Welcome enter your name!");
		mylabel.setHorizontalAlignment(SwingConstants.CENTER);
		mylabel.setFont(new Font("SansSerif", Font.PLAIN, 22));
		mylabel.setBounds(138, 65, 327, 56);
		contentPane.add(mylabel);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x==0) {
				String s = textField.getText();
				mylabel.setText("Happy Birthday "+ s.toUpperCase() +"!");
				x=1;
				}
				else
				{
					mylabel.setText("Enter your name!");
					x=0;
				    
				}
			}
			}
			);
		btnNewButton.setBounds(206, 209, 203, 62);
		contentPane.add(btnNewButton);
		
	    textField = new JTextField();
		textField.setBounds(206, 144, 203, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
	}
}
