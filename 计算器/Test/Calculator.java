package Test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	private JTextField txtResult;
	Button clearButton;
	private JPanel p;
	private String name[]={"7","8","9","+","4","5","6","-","1","2","3","*","0",".","=","/"};
	private JButton button[]=new JButton[name.length];
	private double result=0;
	String str1="";
	String str2="";
	String str3="";
	String str4="";
	String in="";
	String ls="";
	int ii=0;
	double a=0.0;
	int dy=0;
	double b=0.0;
	String str[]=new String[20];
	private boolean LD=true;
	
	public Calculator(){
		super("»ªÊÏ¼ÆËãÆ÷");
		txtResult=new JTextField(20);
		txtResult.setFocusable(false);
		this.add(txtResult,BorderLayout.NORTH);
		p=new JPanel(new GridLayout(4,4));
		p=new JPanel(new GridLayout(5,4));
		for(int i=0;i<button.length;i++){
			button[i]=new JButton(name[i]);
			p.add(button[i]);
			button[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input=e.getActionCommand();
					String inp=input;
					if(inp!="-"&&inp!="+"&&inp!="*"&&inp!="/"&&inp!="="){
						if(ii==0&&inp!="."){
							str1+=inp;
							in=in+inp;
						}else {
							if(++ii==1){
								str4+=inp;
								in=in+inp;
							}
							if(inp!="."){
								str4+=inp;
								in+=inp;
							}
						}
					}
					if(inp=="-"||inp=="+"||inp=="*"||inp=="/"){
						if(LD==true){
							if(++dy==1){
								if(str1!=""){
									in+=inp;
									result=Double.valueOf(str1+str4).doubleValue();
								}
							}
						}else {
							if(++dy==1){
								in+=inp;
							}
						}
						if(dy!=1){
							if(str1!=""){
								b=Double.valueOf(str1+str4).doubleValue();
								str2=str3;
								in+=inp;
							}
						}
						if(str2=="-"){
							result-=b;
							b=0;
						}
						if(str2=="+"){
							result+=b;
							b=0;
						}
						if(str2=="*"){
							result*=b;
							b=0;
						}
						if(str2=="/"){
							result/=b;
							b=0;
						}
						str1="";
						str4="";
						ii=0;
						str3=inp;
						ls=inp;
						}
					}
			});
		}
		
		this.setSize(500,700);
		this.setResizable(false);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Calculator().setVisible(true);
	}
}
