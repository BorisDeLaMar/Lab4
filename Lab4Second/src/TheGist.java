import TypeClasses.*;
import Errors.*;

public class TheGist{	
	
	public static String someIntro() {
		PlaceInGeneral PlaceInGeneral = new PlaceInGeneral("Муми-дом");
		Weather weather = new Weather("Дождь");
		return "Как-то тихим теплым днем(" + Today.shortInfo() + "), был " + weather.getWeather() + " и обитатели места под названием " +  PlaceInGeneral.getPlace() + " собрались поиграть в бабку Грэнэ.";
	}
	static String s = TheGist.someIntro();
	
	public static void main(String[] args) {
			//Анон
		Name Billy = new Name() {
			@Override
			public String Proclamation(String Van) {
				return "My fellow brothers, I, \u2642" + Van + "\u2642, stand here today, humbled by the task before us, mindful of the sacrifices \nborne by our Nico Nico ancestors...";
			}
		};
		//System.out.println(Billy.Proclamation("BEBR1S"));
		
			//Вступление
		System.out.println(s);
		
		
		Moomins sniff = new Moomins("Снифф");
		Moomins moomintroll = new Moomins("Мумми-тролль");
		System.out.println(sniff.WalksTo("угол"));
		System.out.println(sniff.CloseEyes("лапами"));
		
		for(int c = 1; c <= 10; c++) {
			try {
				System.out.println(sniff.Count(c));
			}catch(InvisibleTrap err) {
				System.out.println(err.getMessage());
				break;
			}
			if (c == 3) {
				moomintroll.Hide("Под столом на веранде");
			}
			if ((c > 3) &&  (moomintroll.getNervousCondition() == false)) {
				moomintroll.Hesitate(c);
			}
			if (moomintroll.getNervousCondition()) {
				System.out.println(moomintroll.TriesToFindGoodPLace("Цилиндр в углу веранды"));
			}		
		}
		
		sniff.OpenEyes();
		sniff.TriesToFind("Мумми-тролль", "Под столом на веранде");
	}
}
