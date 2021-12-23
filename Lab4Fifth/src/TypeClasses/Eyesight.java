package TypeClasses;
import Interfaces.*;
//import TypeClassesLaba.*;
public class Eyesight implements StandartMethods{
	boolean eyesight;
	
	public Eyesight(boolean eyesight) {
		this.eyesight = eyesight;
	}
	public Eyesight() {}
	
	public boolean getEyesight() {
		return eyesight;
	}
	public void setEyesight(boolean eyesight) {
		this.eyesight = eyesight;
	}
	
	@Override
	public boolean equals(StandartMethods smth) {
		Eyesight eyesight = (Eyesight) smth;
		if (this.eyesight == eyesight.getEyesight()) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		Eyesight eyesight = new Eyesight(this.eyesight);
		String s1 = eyesight.toString();
		int result = 31*s1.hashCode();
		return result;
	}
	@Override
	public String toString() {
		if (eyesight == true) {
			return "true";
		}
		else {
			return "false";
		}
	}
}