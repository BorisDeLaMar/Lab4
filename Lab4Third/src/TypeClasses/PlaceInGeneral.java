package TypeClasses;

public class PlaceInGeneral extends Place{
	protected String PlaceInGeneral;
	
	public PlaceInGeneral(String PlaceInGeneral) {
		this.PlaceInGeneral = PlaceInGeneral;
	}
	
	@Override
	public String getPlace() {
		return PlaceInGeneral;
	}
	@Override
	public void setPlace(String place) {
		this.PlaceInGeneral = place;
	}
}
