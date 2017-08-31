
public class roads {
	private points start;
	private points end;
	private int speed;
	private int inter;
	private String name;
	public roads(points start,points end, int speed, int inter, String name){
		this.start=start;
		this.end=end;
		this.speed=speed;
		this.inter=inter;
		this.name=name;
	}
	public points getStart() {
		return start;
	}
	public void setStart(points start) {
		this.start = start;
	}
	public points getEnd() {
		return end;
	}
	public void setEnd(points end) {
		this.end = end;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getInter() {
		return inter;
	}
	public void setInter(int inter) {
		this.inter = inter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
