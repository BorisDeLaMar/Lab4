//������ �������� ������� � ��������� ��� �����
package TypeClasses;
import Movement.*;
import Errors.JokersTrap;
import Interfaces.*;
import Errors.*;

public class Moomins implements StandartMethods{
	//����
	protected Name name = new Name();
	protected Place place = new Place();
	protected HideAndSeek game = new HideAndSeek();
	protected Feel feel = new Feel();
	protected Movement move = new Movement();
	protected Eyesight eyesight = new Eyesight(true); 
	protected Feel BrokenNervous = new Feel(false);
	protected boolean AbleToCount = true;
	protected HideAndSeek.Finder player1 = game.new Finder(); 
	protected HideAndSeek.Hider player2 = new HideAndSeek.Hider();
	protected double height = 1.0;
	
	//������������
	public Moomins(String name) {
		this.name = new Name(name);
	}
	
	//����������� ������
	@Override
	public boolean equals(StandartMethods smth) {
		Moomins moomin = (Moomins) smth;
		if (this.name.equals(moomin.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		String s1 = this.name.getName();
		int result = 31*s1.hashCode();
		return result;
	}
	@Override
	public String toString() {
		return "Имя: " + name.getName() + "\n" + "Место: " + place.getPlace() + "\n";
	}

	
	//������, ����������� ��������
	public String WalksTo(String place) {
		this.place = move.WalksTo(place, this.name);
		return name.getName() + " отошел в " + this.place.getPlace();
	}
	public String CloseEyes(String stuff) {
		this.eyesight = move.CloseEyes(stuff, name);
		return name.getName() + " закрыл глаза " + stuff;
	}
	public void OpenEyes() {
		eyesight = move.OpenEyes();
	}
	public String Count(int count) throws InvisibleTrap {
		if (AbleToCount) {
			try {
				return move.Count(count, name);
			}catch(JokersTrap error) {
				AbleToCount = false;
				return error.getMessage();
			}
		}
		else {
			throw new InvisibleTrap("Пам-паМ");
		}
	}
	public String changePlace() {
		return name.getName() + ": " + move.changePlace();
	}
	public String goBack() {
		return name.getName() + ": " + move.goBack();
	}
	
	//Прятки
	public String TriesToFind(String name, String place) {
		return player1.TriesToFind(name, this.name.getName(), place);
	}
	public String TriesToFindGoodPLace(String place) {
		return player2.TriesToFindGoodPlace(place, name);
	}
	public void Hide(String place) {
		this.place = game.Hide(place);
	}
	public void HideSpecially(String place, String stuff, double num) {	
		height = num;
		this.place = game.HideSpecially(place, stuff, name, height);
	}
	public void Hesitate(int HesitateLevel) {
		BrokenNervous.setNervous(feel.Hesitate(HesitateLevel, name));
	}
	
	//��������� ����
	public boolean getNervousCondition() {
		return BrokenNervous.getNervous();
	}	
}
