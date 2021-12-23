//��� ��������� �������� ��������
package Movement;
import TypeClasses.*;
import Errors.*;

public class Movement extends AMovement{
	
	public Place WalksTo(String place, Name name) {
		this.place.setPlace(place);
		return this.place;
	}
	public Eyesight CloseEyes(String stuff, Name name) {
		eyesight.setEyesight(false);
		return eyesight;
	}
	public Eyesight OpenEyes() {
		eyesight.setEyesight(true);
		return eyesight;
	}
	public String Count(int count, Name name) throws JokersTrap{
		if (count < 229) {
			String s = Integer.toString(count);
			return name.getName() + ":" + " *ГРОМКО* " + s;
		}
		else {
			throw new JokersTrap("Снифф пытался сосчитать "  + count + " , но он, к сожалению, умеет только до 228");
		}
	}
	
	@Override
	public String changePlace() {
		IKnowWhereAreYou = place;
		place = new Place("Где-то");
		return "Теперь я непонятно где";
	}
	public String goBack() {
		place = new Place(IKnowWhereAreYou.getPlace());
		return place.getPlace();
	}
}
