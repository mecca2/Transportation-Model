import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class maindriver extends JPanel{

	/**
	 * @param args
	 */
    private URL rUrl;
    private BufferedImage img;
    @Override
    protected void paintComponent(Graphics g) {


        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        sdb temp=new sdb();
	      for(int i=0; i<temp.getRoads().size();i++){
	    	  g.setColor(Color.RED);
	    	  for(int x=-3;x<3;x++){
	    	  g.drawLine(temp.getRoads().get(i).getStart().getX()+x, temp.getRoads().get(i).getStart().getY()+x, temp.getRoads().get(i).getEnd().getX()+x, temp.getRoads().get(i).getEnd().getY()+x);
	    	  }
	    	  g.setFont(new Font("default", Font.BOLD, 14));
	    	  g.setColor(Color.BLACK);
	    	  g.drawString(temp.getRoads().get(i).getName(), temp.getRoads().get(i).getStart().getX()+25, temp.getRoads().get(i).getStart().getY()+30);
	      }
	      g.setColor(Color.BLUE);
	      g.fillOval(460, 570, 30, 30);
	      g.drawString("Start Point", 460, 620);
	      g.setColor(Color.BLACK);

	      g.fillOval(258, 68, 30, 30);
	      g.drawString("End Point", 200, 108);
       // g.drawLine(x1, y1, x2, y2)
    }

	public maindriver(){
		super();
        try {
        	File file=new File("map.jpg");
    		boolean exists = file.exists();
    		if(!exists){
    			System.out.println("Image does not exist!");
    		}
            
            img = ImageIO.read(file);

           
        } catch (IOException ex) {
            Logger.getLogger(PicPane.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("User 3");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.getContentPane().add(new maindriver(), BorderLayout.CENTER);
	      frame.setSize(652, 652);
	      frame.setLocationRelativeTo(null);
	      frame.setResizable(false);
	      frame.setVisible(true);
	}

}
