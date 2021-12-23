package Movement;
import TypeClasses.*;

public abstract class AMovement {
	protected Place place = new Place();
	protected Eyesight eyesight = new Eyesight();
	protected Name name = new Name();
	protected Place IKnowWhereAreYou = new Place(place.getPlace());
	
	public abstract String changePlace();
	public abstract String goBack();
}