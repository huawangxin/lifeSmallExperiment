package 计算器;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private JTextField txtResult;
	Button clearButton;
	private JPanel p;
	// 定义一个字符数组，将计算器中的文字都放在该数组中
	private String name[] = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2",
			"3", "*", "0", ".", "=", "/" };
	// 声明一个按钮数组，该数组的长度以字符串数组的长度为准
	private JButton button[] = new JButton[name.length];
	// 定义一个存放计算结果的变量，初始为0
	private double result = 0;
	// 存放最后一个操作符，初始为=
	String str1 = "";
	String str2 = "";
	String str3 = "";
	String str4 = "";
	String in = "";
	String ls = "";
	int ii = 0;
	double a = 0.0;
	int dy = 0;
	double b = 0.0;
	String str[] = new String[20];

	private boolean LD = true;

	public Calculator() {
		super("计算器");
		// 实例化文本栏控件
		txtResult = new JTextField(20);

		// 设置文本框不是焦点状态
		txtResult.setFocusable(false);
		// 将文本栏控件放置在窗体框架的上方
		this.add(txtResult, BorderLayout.NORTH);// 实例化面板对象，同时设置此面板布局为4行4列
		p = new JPanel(new GridLayout(4, 4));// 循环实例化按钮
		// 实例化按钮监听对象
		p = new JPanel(new GridLayout(5, 4));

		for (int i = 0; i < button.length; i++) {

			button[i] = new JButton(name[i]);// 注册监听
			p.add(button[i]);

			button[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String input = e.getActionCommand();
					String inp = input;

					if (inp != "-" && inp != "+" && inp != "*" && inp != "/"
							&& inp != "=") {

						if (ii == 0 && inp != ".") {
							str1 += inp;// 取数字
							in = in + inp;
						} else {

							if (++ii == 1) {
								str4 += inp;
								in = in + inp;
							}
							if (inp != ".") {
								str4 += inp;
								in = in + inp;
							}
						}

					}
					//

					if (inp == "-" || inp == "+" || inp == "*" || inp == "/") {
						if (LD == true) {// 用于连等的判断，取第一个被运算数后，false\
							if (++dy == 1) {// ==1 ----单运算符运算，
								if (str1 != "") {
									// System.out.println(str1);
//									 System.out.println(str4);
									in = in + inp;
									result = Double.valueOf(str1 + str4).doubleValue();
								}
							} 
						}else {
							if (++dy == 1) {
								in = in + inp;
							}
						}
						if(dy!=1) {// ！=1 -----多运算符运算-----------
							if (str1 != "") {
								b = Double.valueOf(str1 + str4)
										.doubleValue();
								str2 = str3;
								in = in + inp;
							}
						}
						if (str2 == "-") {

							result -= b;
							b=0;
						}
						if (str2 == "+") {
							
							result += b;
							b=0;
						}
						if (str2 == "*") {

							result *= b;
							b=0;
						}
						if (str2 == "/") {

							result /= b;
							b=0;
						}

						str1 = "";
						str4 = "";
						ii = 0;
						str3 = inp;
						ls = inp;
						// ---------------------------
					}

//					in = in + input;
					if (inp == "=") {
						dy = 0;
						LD = false;
						if (str1 != "") {
							// System.out.println(str1);
							// System.out.println(str4);
							a = Double.valueOf(str1 + str4).doubleValue();

							str1 = "";// 最后一个被运算数-------
						}

						if (ls == "-") {

							result -= a;

						} else if (ls == "+") {

							result += a;

						} else if (ls == "*") {

							result *= a;

						} else if (ls == "/") {
							if (a != 0) {
								result /= a;
							} else {
								in = "error";
							}

						} else {
							result = a;
						}

						if (in != "error") {

							in = "" + result;
						}

					}

					txtResult.setText(in);

				}
			});

		}
		clearButton = new Button("清除");
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("");
				result = 0.0;
				in = "";
				str1 = "";
				str2 = "";
				str4 = "";
				ii = 0;
				ls = "";
				a = 0.0;
				b = 0.0;
				LD = true;

			}
		});
		// clearButton.setBounds(p.getWidth(), p.getHeight(), 80, 30);
		p.add(clearButton);
		this.add(p);
		this.setSize(500, 700);
		this.setResizable(false);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Calculator().setVisible(true);

	}

}
