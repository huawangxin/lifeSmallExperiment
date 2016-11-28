package ’“≤Á;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Zhao extends JFrame{
	Image leftImage;
	Image rightImage;
	Rectangle rect[];
	Rectangle clear[];
	
	public Zhao(){
		leftImage=new ImageIcon("E:/ftp/left.png").getImage();
		rightImage=new ImageIcon("E:/ftp/right.png").getImage();
		
		clear=new Rectangle[5];
		rect=new Rectangle[5];
		rect[0]=new Rectangle(43,144,14,14);
		rect[1]=new Rectangle(159,243,20,14);
		rect[2]=new Rectangle(232,141,16,16);
		rect[3]=new Rectangle(174,128,14,14);
		rect[4]=new Rectangle(116,200,14,14);
		
		this.enableEvents(16);
	}
	public void paint(Graphics g){
		g.drawImage(leftImage, 0, 0, null);
		g.drawImage(rightImage, leftImage.getWidth(null),0,null);
		
		for(int i=0;i<clear.length;i++){
			if(clear[i]!=null){
				g.setColor(new Color(255,255,255));
				g.drawOval(clear[i].x, clear[i].y, clear[i].width, clear

[i].height);
				
			}
		}
	}
	public void processMouseEvent(MouseEvent e){
		// Û±Íµ„ª˜¡À
		if(e.getID()==502){
			int x=e.getX();
			int y=e.getY();
			for(int i=0;i<rect.length;i++){
				Rectangle r=rect[i];
				if(x>=r.x&&x<=(r.x+r.width)&&y>=r.y &&y<=(r.y+r.height)){
					clear[i]=rect[i];
					rect[i]=null;
					this.repaint();
				}	
			}
		}
	}
}
