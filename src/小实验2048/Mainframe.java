package 小实验2048;
import javax.swing.JFrame;


public class Mainframe extends JFrame {

	public Mainframe(){
		
		
		this.setTitle("2048");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);//居中
		MainPanel panel =new MainPanel();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.addKeyListener(panel);
		this.add(panel);
	}
	public static void main(String[] args) {
		new Mainframe().setVisible(true);
	}
}
