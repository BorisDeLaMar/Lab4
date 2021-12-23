package Movement;
import TypeClasses.*;
import java.util.ArrayList;

public class HideAndSeek {
	protected Place placeHider = new Place();
	protected int height = 1;
	protected Feel feel = new Feel();
	protected static ArrayList<String> UsualPlaces = new ArrayList<String>();
	{
	UsualPlaces.add("За диваном в гостинной");
	UsualPlaces.add("В шкафу в спальне");
	UsualPlaces.add("Под кроватью в спальне");
	UsualPlaces.add("Под диваном");
	}
	protected static ArrayList<String> UnusualPlaces = new ArrayList<String>();
	{
	UnusualPlaces.add("На люстре в коридоре");
	UnusualPlaces.add("За занавеской в спальне"); 
	UnusualPlaces.add("Под столом на кухне");
	}
	
	public HideAndSeek() {}
	
	//Вложенные классы
	public class Finder {
		public String TriesToFind(String name, String Finder, String place) {
			Name nameFinder = new Name();
			Name nameHider = new Name();
			nameFinder.setName(Finder);
			nameHider.setName(name);
			placeHider.setPlace(place);
			RandomCount rnd = new RandomCount();
			
			for(int i = 0; i < UsualPlaces.size(); i++) {
				//AddPrint.print(feel.laugh(nameHider));
				if (UsualPlaces.get(i) == placeHider.getPlace()) {
					return nameFinder.getName() + ":" + " Попался " + nameHider.getName() + "!";
				}
				if (i == UsualPlaces.size() - 1) {
					UsualPlaces.add(placeHider.getPlace());
					return nameFinder.getName() + ":" + " ну ты даешь, " + nameHider.getName() + "! Я здесь тебя здесь(" + placeHider.getPlace() + ") никогда не догадался бы проверить!";
				}
				AddPrint.print(nameFinder.getName() + ": Где же этот " + nameHider.getName() + "..." + UsualPlaces.get(i) + " пусто...");
				if (Math.abs(rnd.GetRandomIndex()) > 0.7) {
					AddPrint.print(feel.Annoyed(nameHider.getName()));
				}
			}
			return "";
		}
	}
	public static class Hider {
		public String TriesToFindGoodPlace(String place, Name name) {
			for(int i = 0; i < UsualPlaces.size(); i++) {
				if (UsualPlaces.get(i) == place) {
					return name.getName() + ":" + " Не, тут он меня 100% поймает";
				}
			}
			for(int i = 0; i < UnusualPlaces.size(); i++) {
				if (UnusualPlaces.get(i) == place) {
					return name.getName() + ":" + " Надо бы перепрятаться. " + place + " всяко понадежнее" + "!";
				}
				if (i == UnusualPlaces.size() - 1) {
					UnusualPlaces.add(place);
					return name.getName() + ":" + " " + place + " как вариант\n" + name.getName() + ":" + " Лучше не бывает!";
				}
			}
			return "";
		}
	}
	
	public Place Hide(String place) {
		placeHider.setPlace(place);
		return placeHider;
	}
	public Place HideSpecially(String place, String stuff, Name name, double num) {
		placeHider.setPlace(place);
		String smth = "*" + name.getName() + " " + stuff + " проползает, метясь на " + place + "*";
		AddPrint.print(smth);
		if (height <= (int) 2*num){
			AddPrint.print(placeHider.getPlace() + ", конечно, маловат, но " + name.getName() + " присядет, подберет хвост и будет норм");
		}
		return placeHider;
	}
}
