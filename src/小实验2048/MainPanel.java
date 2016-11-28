package 小实验2048;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;


public class MainPanel extends JPanel implements KeyListener{

	private JButton[][] button=new JButton[4][4];
	public MainPanel(){
		Font font=new Font("宋体",Font.PLAIN,50);
		this.setLayout(new GridLayout(4,4));
		this.requestFocus();
		this.setFocusable(true);
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				button[i][j]=new JButton("0");
				button[i][j].setFont(font);
				button[i][j].setBackground(new Color(70,90,240));
				button[i][j].setEnabled(false);
				this.add(button[i][j]);
			}
		}
	}
	private boolean dead(){
		boolean flag=false;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(button[i][j].getText().equals("0")){
					flag=true;
				}
			}
		}return flag;
	}
	private void Rmd(){//得到随机数
		Random r=new Random();
		while(dead()){
		int i=r.nextInt(4);
		int j=r.nextInt(4);
		if(button[i][j].getText().equals("0")){
			button[i][j].setText("2");
			break;
		}
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key=e.getKeyCode();
		switch(key){
		case KeyEvent.VK_W:
		case KeyEvent.VK_UP:
			up();
			Rmd();	
			setColor();
		break;
		case KeyEvent.VK_S:
		case KeyEvent.VK_DOWN:
			down();
			Rmd();
			setColor();
		break;
		case KeyEvent.VK_A:
		case KeyEvent.VK_LEFT:
			left();
			Rmd();
			setColor();
		break;
		case KeyEvent.VK_D:
		case KeyEvent.VK_RIGHT:
			right();
			Rmd();	
			setColor();
		break;
		case KeyEvent.VK_G:
			System.exit(0);
		break;
		default:
			break;
		}
	}
	private void up(){
		for(int i=0;i<4;i++){
			String[] in1={"0","0","0","0"};//第一次循环后得到的行
			String[] in2={"0","0","0","0"};//第二行寻后变化的行
			int num=0;
			for(int j=0;j<4;j++){
				if(!button[j][i].getText().equals("0")){
					in1[num]=button[j][i].getText();
					num++;
				}
			}
			
			for(int t=0;t<3;t++){
				if(in1[t].equals("0")){
					continue;
				}else if(in1[t].equals(in1[t+1])){
					in1[t]=Integer.parseInt(in1[t])*2+"";
					in1[t+1]="0";
				}
			}
			int num2=0;
			for(int j=0;j<4;j++){
				if(!in1[j].equals("0")){
					in2[num2]=in1[j];
					num2++;
				}
			}
			for(int j=0;j<4;j++){
				button[j][i].setText(in2[j]);
			}
		}
	}
	private void down(){
		for(int i=3;i>=0;i--){
			String[] in1={"0","0","0","0"};//第一次循环后得到的行
			String[] in2={"0","0","0","0"};//第二行寻后变化的行
			int num=3;
			for(int j=3;j>=0;j--){
				if(!button[j][i].getText().equals("0")){
					in1[num]=button[j][i].getText();
					num--;
				}
			}
			
			for(int t=3;t>0;t--){
				if(in1[t].equals("0")){
					continue;
					
				}else if(in1[t].equals(in1[t-1])){
					in1[t]=Integer.parseInt(in1[t])*2+"";
					in1[t-1]="0";
				}
			}
			int num2=0;
			for(int j=0;j<4;j++){
				if(!in1[j].equals("0")){
					in2[num2]=in1[j];
					num2++;
				}
			}
			for(int j=0;j<4;j++){
				button[j][i].setText(in2[j]);
			}
		}
	}
	private void left(){
		for(int i=0;i<4;i++){
			String[]in1={"0","0","0","0"};//第一次循环后得到的行
			String[]in2={"0","0","0","0"};//第二行寻后变化的行
			int num=0;
			for(int j=0;j<4;j++){
				if(!button[i][j].getText().equals("0")){
					in1[num]=button[i][j].getText();
					num++;
				}
			}
			
			for(int t=0;t<3;t++){
				if(in1[t].equals("0")){
					continue;
					
				}else if(in1[t].equals(in1[t+1])){
					in1[t]=Integer.parseInt(in1[t])*2+"";
					in1[t+1]="0";
				}
			}
			int num2=0;
			for(int j=0;j<4;j++){
				if(!in1[j].equals("0")){
					in2[num2]=in1[j];
					num2++;
				}
			}
			for(int j=0;j<4;j++){
				button[i][j].setText(in2[j]);
			}
		}
	}
	
	//color.getHSBColor()
	private void right(){
		for(int i=3;i>=0;i--){
			String[]in1={"0","0","0","0"};//第一次循环后得到的行
			String[]in2={"0","0","0","0"};//第二行寻后变化的行
			int num=3;
			for(int j=3;j>=0;j--){
				if(!button[i][j].getText().equals("0")){
					in1[num]=button[i][j].getText();
					num--;
				}
			}
			int num2=0;
			for(int j=0;j<4;j++){
				if(!in1[j].equals("0")){
					in2[num2]=in1[j];
					num2++;
				}
			}
			for(int t=3;t>0;t--){
				if(in1[t].equals("0")){
					continue;
					
				}else if(in1[t].equals(in1[t-1])){
					in1[t]=Integer.parseInt(in1[t])*2+"";
					in1[t-1]="0";
				}
			}
			
			for(int j=0;j<4;j++){
				button[i][j].setText(in1[j]);
			}
		}
	}
	public void setColor(){
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(button[i][j].getText().equals("0")){
					button[i][j].setBackground(Color.yellow);
				}else if(button[i][j].getText().equals("2")){
					button[i][j].setBackground(Color.black);
				}else if(button[i][j].getText().equals("4")){
					button[i][j].setBackground(Color.blue);
				}else if(button[i][j].getText().equals("8")){
					button[i][j].setBackground(Color.cyan);
				}else if(button[i][j].getText().equals("16")){
					button[i][j].setBackground(Color.darkGray);
				}else if(button[i][j].getText().equals("32")){
					button[i][j].setBackground(Color.gray);
				}else if(button[i][j].getText().equals("64")){
					button[i][j].setBackground(Color.green);
				}else if(button[i][j].getText().equals("128")){
					button[i][j].setBackground(Color.lightGray);
				}else if(button[i][j].getText().equals("256")){
					button[i][j].setBackground(Color.magenta);
				}else if(button[i][j].getText().equals("512")){
					button[i][j].setBackground(Color.orange);
				}else if(button[i][j].getText().equals("1024")){
					button[i][j].setBackground(Color.pink);
				}else if(button[i][j].getText().equals("2048")){
					button[i][j].setBackground(Color.red);
				}else if(button[i][j].getText().equals("4096")){
					button[i][j].setBackground(Color.white);
				}
			}
		}
		}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
