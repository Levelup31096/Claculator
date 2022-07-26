package calc;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Calculator {

	protected double first;
	protected double second;
	protected double result;
	protected String operation;
	protected String ans;
		
	public Calculator() {
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame();
		frame.setTitle("Calculator");
		
		//Label
		JLabel l = new JLabel();
		l.setText("Standard");
		l.setFont(new Font("Times new Roman",Font.BOLD,20));
		l.setBounds(10, 15,100, 20);
		frame.add(l);
		
		//TextBox
		JTextArea text = new JTextArea();
		text.setBounds(10, 45, 320, 80);
		text.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(text);
		
		
		//Button Set
		JButton b1 = new JButton("7");
		b1.setBounds(10, 181, 80, 50);
		b1.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b1.getText();
				text.setText(EnterNumber);
			}
		});
		
		JButton b2 = new JButton("8");
		b2.setBounds(90, 181, 80, 50);
		b2.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(b2);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b2.getText();
				text.setText(EnterNumber);
			}
		});
		
		JButton b3 = new JButton("9");
		b3.setBounds(170, 181, 80, 50);
		b3.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(b3);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b3.getText();
				text.setText(EnterNumber);
			}
		});
		
		JButton b4 = new JButton("4");
		b4.setBounds(10, 232, 80, 50);
		b4.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(b4);
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b4.getText();
				text.setText(EnterNumber);
			}
		});
		
		JButton b5 = new JButton("5");
		b5.setBounds(90, 232, 80, 50);
		b5.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(b5);
		
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b5.getText();
				text.setText(EnterNumber);
			}
		});
		
		JButton b6 = new JButton("6");
		b6.setBounds(170, 232, 80, 50);
		b6.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(b6);
		
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b6.getText();
				text.setText(EnterNumber);
			}
		});
		
		JButton b7 = new JButton("1");
		b7.setBounds(10, 283, 80, 50);
		b7.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(b7);
		
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b7.getText();
				text.setText(EnterNumber);
			}
		});
		
		JButton b8 = new JButton("2");
		b8.setBounds(90, 283, 80, 50);
		b8.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(b8);
		
		b8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b8.getText();
				text.setText(EnterNumber);
			}
		});
		
		JButton b9 = new JButton("3");
		b9.setBounds(170, 283, 80, 50);
		b9.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(b9);
		
		b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b9.getText();
				text.setText(EnterNumber);
			}
		});

		JButton b10 = new JButton("0");
		b10.setBounds(90, 334, 80, 50);	
		b10.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(b10);
		
		b10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b10.getText();
				text.setText(EnterNumber);
			}
		});
		
		JButton b11 = new JButton(".");
		b11.setBounds(170, 334, 80, 50);
		b11.setFont(new Font("Arial",Font.BOLD,24));
		frame.add(b11);
		
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b11.getText();
				text.setText(EnterNumber);
			}
		});
		
		JButton b12 = new JButton("00");
		b12.setBounds(10, 334, 80, 50);
		b12.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(b12);
		
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = text.getText() + b12.getText();
				text.setText(EnterNumber);
			}
		});
		
		//Symbol
		JButton c = new JButton("C");
		c.setBounds(170, 130, 80, 50);
		c.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(c);
		
		c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(null);
			}
		});
		
		JButton c1 = new JButton("\uF0E7");
		c1.setBounds(250, 130, 80, 50);	
		c1.setFont(new Font("Wingdings",Font.BOLD,18));
		frame.add(c1);
		
		c1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String c1 = null;
				
				if(text.getText().length() > 0) {
					StringBuilder str = new StringBuilder(text.getText());
					str.deleteCharAt(text.getText().length() - 1);
					c1 = str.toString();
				    text.setText(c1);	
				}
			}
		});

		JButton c3 = new JButton("/");
	    c3.setBounds(90, 130, 80, 50);
	    c3.setFont(new Font("Arial",Font.BOLD,20));
	    frame.add(c3);
	    
		c3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button Submited");
				String c3 = text.getText();
				first = Double.parseDouble(c3);	
				text.setText("");
				operation ="/";
			}
		});
	    
	    JButton c4 = new JButton("*");
		c4.setBounds(250, 181, 80, 50);
		c4.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(c4);
		
		c4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button Submited");
				String c4 = text.getText();
				first = Double.parseDouble(c4);	
				text.setText("");
				operation ="*";
			}
		});
		
		JButton c5 = new JButton("-");
		c5.setBounds(250, 232, 80, 50);
		c5.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(c5);
		
		c5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button Submited");
				String c5 = text.getText();
				first = Double.parseDouble(c5);	
				text.setText("");
				operation ="-";
			}
		});
		
		JButton c6 = new JButton("+");
		c6.setBounds(250, 283, 80, 50);
		c6.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(c6);
		
		c6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button Submited");
				String c6 = text.getText();
				first = Double.parseDouble(c6);	
				text.setText("");
				operation ="+";
			}
		});	
		
		JButton c7 = new JButton("%");
		c7.setBounds(10, 130, 80, 50);
		c7.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(c7);
		
		c7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button Submited");
				String c7 = text.getText();
				first = Double.parseDouble(c7);	
				text.setText("");
				operation ="%";
			}
		});
		
		JButton c9 = new JButton("=");
		c9.setBounds(251, 334, 80, 50);	
		c9.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(c9);
		
		c9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(text.getText());
				if(operation == "+") {
					result = first + second;
					ans = String.format("%.2f",result);
					text.setText(ans);
				}
				else if(operation == "-") {
					result = first - second;
					ans = String.format("%.2f",result);
					text.setText(ans);
				}
				else if(operation == "*") {
					result = first * second;
					ans = String.format("%.2f",result);
					text.setText(ans);
				}
				else if(operation == "%") {
					result = first % second;
					ans = String.format("%.2f",result);
					text.setText(ans);
				}
				else if(operation == "/") {
					result = first / second;
					ans = String.format("%.2f",result);
					text.setText(ans);
				}
			}
		});
		
		frame.setSize(353,450);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}
		public static void main(String args[]) {
			 new Calculator();
		
	}
}
