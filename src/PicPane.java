import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class PicPane extends JPanel
{
    private URL rUrl;
    private BufferedImage img;
    public PicPane() {
        super();
        System.out.println("Enter Start point");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        try {
        	File file=new File("map.jpg");
    		boolean exists = file.exists();
    		if(!exists){
    			System.out.println("Map does not exist!");
    		}
            
            img = ImageIO.read(file);

           
        } catch (IOException ex) {
            Logger.getLogger(PicPane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);

        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        sdb temp=new sdb();
	      for(int i=0; i<temp.getRoads().size();i++){
	    	  g.setColor(Color.RED);
	    	  for(int x=-3;x<3;x++){
	    	  g.drawLine(temp.getRoads().get(i).getStart().getX()+x, temp.getRoads().get(i).getStart().getY()+x, temp.getRoads().get(i).getEnd().getX()+x, temp.getRoads().get(i).getEnd().getY()+x);
	      }
	      }
	      g.setColor(Color.BLUE);
	      g.fillOval(110, 5, 30, 30);
	      g.drawString("Start Point", 100, 55);
	      g.setColor(Color.BLACK);
	      g.fillOval(450, 150, 30, 30);
	      g.drawString("End Point", 430, 200);
       // g.drawLine(x1, y1, x2, y2)
    }

}