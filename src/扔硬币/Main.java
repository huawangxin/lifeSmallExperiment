package ��Ӳ��;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txt1;
	JButton startJButton;
	JPanel p;
	int count = 0;
	boolean flag = true;
	String jg = "";

	public Main() {
		startJButton = new JButton("��ʼ��Ӳ��");
		txt1 = new JTextField(jg, 20);
		txt1.setFocusable(false);
		this.add(txt1);
		p = new JPanel();
		p.add(startJButton);
		p.add(txt1);
		this.add(p);
		this.setLocation(100, 100);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("��Ӳ��");
		this.pack();

		startJButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Rmd();
				if (flag == true) {
						txt1.setText("Ӳ��������");

					} else {
						txt1.setText("Ӳ���Ƿ���");

					}
				}
			

		});

	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}

	// @Override
	// public void run() {
	// // TODO Auto-generated method stub
	// try {
	// Thread.sleep(10);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	public void Rmd() {
		int coin;
		coin = ((int) (Math.random() * 100) + 1) % 2;
		// ���������,��0��1������
		if (coin != 0) {
			flag = false;
		} else {
			flag = true;
		}

	}
}