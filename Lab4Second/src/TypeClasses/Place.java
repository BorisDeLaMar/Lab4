package TypeClasses;
import Interfaces.*;

public class Place implements StandartMethods{
	protected String place;
	
	public Place(String place) {
		this.place = place;
	}
	public Place() {}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	@Override
	public boolean equals(StandartMethods smth) {
		Place place = (Place) smth;
		if (this.place == place.getPlace()) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		Place place = new Place(this.place);
		String s1 = place.toString();
		int result = 31*s1.hashCode();
		return result;
	}
	@Override
	public String toString() {
		return place.toString();
	}
}
