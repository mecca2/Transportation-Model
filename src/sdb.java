import java.util.ArrayList;


public class sdb {
	private ArrayList<roads> roads;
	public ArrayList<roads> getRoads(){
		return roads;
	}
	public sdb(){
		roads=new ArrayList<roads>();
		makeRoads();
		printRoads();
	}
	public void makeRoads(){

		roads.add(new roads(new points(0,370), new points(650,370), 45, 6, "Wilson St"));
		roads.add(new roads(new points(0,22), new points(666,12), 45, 13, "Albion St"));
		roads.add(new roads(new points(119,0), new points(203,610), 55, 2, "Cilynk St"));
		roads.add(new roads(new points(255,84), new points(462,76), 35, 3,"Murray St"));
		roads.add(new roads(new points(459,0), new points(475,636), 45, 2,"Melville Rd"));
		roads.add(new roads(new points(349,16), new points(349,16+202), 35, 4,"Bent St"));
		roads.add(new roads(new points(254,150), new points(254+205,145), 35, 3,"Cumming St"));
		roads.add(new roads(new points(202,213), new points(202+450,208), 35, 11,"Hope St"));
		roads.add(new roads(new points(549,10), new points(555,206+10), 35, 2,"Wallace St"));
		roads.add(new roads(new points(235,324), new points(423+235,315), 35, 9,"Whitby St"));
		roads.add(new roads(new points(505,15), new points(515,218+155), 35, 3,"Burnell St"));
		roads.add(new roads(new points(286,210), new points(290,218+118), 35, 3,"Henderson St"));
		roads.add(new roads(new points(277,412), new points(277+192,412), 35, 4,"Hunter St"));

	}
	public void printPoints(){
		for(int i=0;i<roads.size();i++){
			System.out.println("************************  Interest Point: " + i +" ************************");
			System.out.println("Type: good" );
		}
	}
	public void printRoads(){
		for(int i=0;i<roads.size();i++){
			System.out.println("************************  Road " + roads.get(i).getName() +" ************************");
			System.out.println("Start point: x: " +roads.get(i).getStart().getX() + " y: " +roads.get(i).getStart().getY() + "\tEnd point: x: " +roads.get(i).getEnd().getX() + " y: " +roads.get(i).getEnd().getY()  );
			System.out.print("Maximum Speed: " +roads.get(i).getSpeed() );
			System.out.print("\t\tIntersections: " +roads.get(i).getInter() );
			System.out.println("\n");
		}
	}
}
