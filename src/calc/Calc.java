package calc;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;

public class Calc extends JFrame{
	
	/**Version
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;	
	private JRadioButton rdbtnOnp;
	Calculate calculator = new Calculate();
	//ConvertToOnp convertToOnp = new ConvertToOnp();
	
	public Calc() {
		getContentPane().setBackground(Color.BLUE);		
		
		setBounds(100, 100, 300, 360);
		
		MyActionListener mAL = new MyActionListener();
		
		JButton button = new JButton("0");		
		button.addActionListener(mAL);
		
		JButton button_1 = new JButton("1");		
		button_1.addActionListener(mAL);
		
		JButton button_2 = new JButton("2");		
		button_2.addActionListener(mAL);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(mAL);
		
		JButton button_4 = new JButton("4");		
		button_4.addActionListener(mAL);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(mAL);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(mAL);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(mAL);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(mAL);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(mAL);
		
		textArea = new JTextArea();
		textArea.setBackground(new Color(240, 230, 140));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 22));
		
		JButton button_x = new JButton("X");
		button_x.addActionListener(mAL);
		
		JButton button_minus = new JButton("-");
		button_minus.addActionListener(mAL);
		
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(mAL);
		
		JButton button_Equals = new JButton("=");
		button_Equals.setBackground(Color.ORANGE);
		button_Equals.addActionListener(mAL);
		
		JButton button_10 = new JButton("(");
		button_10.addActionListener(mAL);
		
		JButton button_11 = new JButton(")");
		button_11.addActionListener(mAL);
		
		rdbtnOnp = new JRadioButton("ONP");
		
		JButton button_divide = new JButton("/");
		button_divide.addActionListener(mAL);
		
		JButton button_dot = new JButton(".");
		button_dot.addActionListener(mAL);
		
		JButton button_clr = new JButton("Clear");
		button_clr.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_clr.addActionListener(mAL);
		
		JButton button_p = new JButton("^");
		button_p.addActionListener(mAL);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textArea, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
										.addComponent(button, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
										.addComponent(button_dot, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(button_3, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
										.addComponent(button_Equals, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(button_10, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
										.addComponent(button_7, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
										.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(button_5, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
										.addComponent(button_8, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
										.addComponent(button_11, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(3)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(rdbtnOnp)
												.addComponent(button_clr, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(button_6, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
												.addComponent(button_9, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_minus, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
								.addComponent(button_x, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
								.addComponent(button_divide, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
								.addComponent(button_p, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
								.addComponent(button_plus, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button_clr)
							.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
							.addComponent(rdbtnOnp, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_p, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(button_11, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(button_10, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_divide, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(button_7, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(button_8, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(button_9, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(button_x, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(button_5, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(button_6, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button_minus, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(button_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(button_dot, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(button_plus, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
							.addComponent(button_Equals, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(button, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			System.out.println(info + " - " + info.getName()); //wyœwietlenie dostêpnych opcji!
			//ustawienie Nimbus
			if ("Nimbus".equals(info.getName())) {
				UIManager.setLookAndFeel(info.getClassName());
				break;
			}
		}
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}			
		});
	}
	
	public class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String co = ((JButton)e.getSource()).getText();
			switch(co){
			case "Clear":				
				textArea.setText("");
				break;			
			case "1":				
				textArea.append("1");
				break;				
			case "2":	
				textArea.append("2");
				break;
			case "3":	
				textArea.append("3");
				break;
			case "4":	
				textArea.append("4");
				break;
			case "5":	
				textArea.append("5");
				break;
			case "6":	
				textArea.append("6");
				break;
			case "7":	
				textArea.append("7");
				break;
			case "8":	
				textArea.append("8");
				break;
			case "9":	
				textArea.append("9");
				break;
			case "0":	
				textArea.append("0");
				break;
			case "+":	
				textArea.append("+");
				break;
			case "-":	
				textArea.append("-");
				break;
			case "X":	
				textArea.append("x");
				break;
			case "/":	
				textArea.append("/");
				break;
			case "^":	
				textArea.append("^");
				break;
			case "(":	
				textArea.append("(");
				break;	
			case ")":	
				textArea.append(")");
				break;
			case ".":	
				textArea.append(".");
				break;
			case "=":	
				textArea.append("=");
				
				if(rdbtnOnp.isSelected()){
					double tmp = calculator.calc(textArea.getText());
					textArea.append(" " + Double.toString(tmp));
				}else{
					ConvertToOnp convertToOnp = new ConvertToOnp();
					String onp = convertToOnp.convert(textArea.getText());
					textArea.append("\n" + onp);
					double tmp = calculator.calc(onp);
					textArea.append(" " + Double.toString(tmp));
				}
				break;
			}
		}
		
	}
}
