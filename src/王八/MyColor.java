package 王八;

	import java.awt.Color;
	import java.awt.Graphics;
	import javax.swing.JFrame;

	public class MyColor extends JFrame{
		public void paint(Graphics g){
			//---------------------定义颜色---------------------
			//背景色
			Color bgColor = new Color( 200 , 255 , 255 ) ;
			//绿色
			Color greenColor = new Color( 80 , 180 , 80 ) ;
			//黑色
			Color whiteColor = new Color( 0 , 0 , 0 ) ;
			//白色
			Color blackColor = new Color( 255 , 255 , 255 ) ;
			
			
			//---------------------背景-------------------------
			g.setColor( bgColor );
			g.fillRect( 0 , 0 , 800 , 600 ) ;
			
			//---------------------尾巴-------------------------
			g.setColor( greenColor ) ;	  
			g.fillOval( 140 , 285 , 150 , 150 ) ; 
			g.setColor( bgColor ); 
			g.fillOval( 155 , 300 , 140 , 140) ; 
			g.fillOval( 195 , 260 , 200 ,240 ) ; 
			
			g.setColor( greenColor ) ; 
			g.fillOval( 145 , 355 , 40 , 40) ;	
			
			g.setColor( bgColor ); 
			g.fillOval( 157 , 367 , 15 , 15) ; 
		
			
			//---------------------脑袋-------------------------
			g.setColor( greenColor ) ;	  
			g.fillOval( 120 , 80 , 60 , 100 ) ; 
			g.setColor( blackColor ) ; 
			g.fillOval( 130 ,90 , 10 ,10 ) ;	 	
			g.fillOval( 160 ,90 , 10 ,10 ) ;	  
			g.setColor( whiteColor ) ;
			
			g.fillOval( 130 ,90 , 8 ,8 ) ;	  
			g.fillOval( 160 ,90 , 8 ,8 ) ;	  
			
			
			//---------------------四肢-------------------------
			g.setColor( greenColor ) ; 
			g.fillOval( 50 ,140 ,50 , 70 ) ;	  
			g.fillOval( 200 ,140 ,50 , 70 ) ;	  
			g.fillOval( 50 ,280 ,50 , 70 ) ;	  
			g.fillOval( 200 ,280 ,50 , 70 ) ;	  
			
			//---------------------身体-------------------------
			g.setColor( new Color(50 ,160 , 50) ) ;	 
			g.fillOval( 60 , 150 , 180 ,200 ) ;	
			g.setColor( new Color(50,200,50) ) ; 
			g.fillOval( 70 , 160 , 160 ,180 ) ;	  

			//---------------------花纹-------------------------
			g.setColor( whiteColor ) ; 
			g.drawLine( 130 , 210 , 170 , 210 ) ;	 
			g.drawLine( 170 , 210 , 200 , 240 ) ; 
			g.drawLine( 200 , 240 , 170 , 270 ) ; 
			g.drawLine( 170 , 270 , 130 , 270 ) ; 
			g.drawLine( 130 , 270 , 100 , 240 ) ; 
			g.drawLine( 100 , 240 , 130 , 210 ) ;	  
			g.drawLine( 100 , 180 , 130 , 210 ) ;	 
			g.drawLine( 170 , 210 , 200 ,180 ) ; 
			g.drawLine( 200 , 240 , 230 ,250 ) ; 
			g.drawLine( 170 , 270 , 200 ,320 ) ; 
			g.drawLine( 130 , 270 , 100 ,320 ) ; 
			g.drawLine( 100 , 240 , 70 ,250 ) ; 
			
		}
	}
