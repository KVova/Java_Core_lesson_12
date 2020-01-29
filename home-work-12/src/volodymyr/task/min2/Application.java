package volodymyr.task.min2;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Ќатисн≥ть 1, щоб перев≥рити чи Ї такий м≥с€ць");
		System.out.println("Ќатисн≥ть 2, щоб вивести на екран вс≥ м≥с€ц≥ з такою ж порою року");
		System.out.println("Ќатисн≥ть 3, щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 4, щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 5, щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 6, щоб вивести на екран наступну пору року");
		System.out.println("Ќатисн≥ть 7, щоб вивести на екран попередню пору року");
		System.out.println("Ќатисн≥ть 8, щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 9, щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 0, щоб вивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в");
	}

//	public static void main(String[] args) {
//		
//		seasonScanner();
//	
//	}

	public static void main(String[] args) {
		List<Months> monthArr = Arrays.asList(Months.values());
		List<Seasons> seasonArr = Arrays.asList(Seasons.values());
		Scanner season = new Scanner(System.in);

		while (true) {
			menu();
			System.out.println("Enter number from 0 to 9!");
			
			switch (season.next()) {
			case "1": {// ѕерев≥рити чи Ї такий м≥с€ць (м≥с€ць вводимо з консол≥, передбачити, щоб			
					   // рег≥стр букв був не важливим)
				
				System.out.println("Enter month : ");
				season = new Scanner(System.in);
				String sc = season.next().toUpperCase();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.name().equalsIgnoreCase(sc)) {
						System.out.println("Month exists : "+m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;

			}// case 1

			case "2": {// ¬ивести вс≥ м≥с€ц≥ з такою ж порою року

				System.out.println("Enter season : ");
				season = new Scanner(System.in);
				String seso = season.next().toUpperCase();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getSeasons().name().equalsIgnoreCase(seso)) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;

			} // case 2

			case "3": {//¬ивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в

				System.out.println("Enter number 28 - 31 : ");
				season = new Scanner(System.in);
				int mon = season.nextInt();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getinDays() == mon) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;
				
			}// case 3

			case "4": {// ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в

				System.out.println("Enter number : ");
				season = new Scanner(System.in);
				int mo = season.nextInt();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getinDays() < mo) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;
				
			} // case 4

			case "5": {// ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в

				System.out.println("Enter number : ");
				season = new Scanner(System.in);
				int mo = season.nextInt();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getinDays() > mo) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;
				
				}// case 5

			case "6": {// ¬ивести на екран наступну пору року
				
				System.out.println("Enter season : ");
				season = new Scanner(System.in);
				String nSeas = season.next().toUpperCase();
				
				boolean flag = false;
				
				for (Seasons s : seasonArr) {
					if (s.name().equals(nSeas)) {
						//System.out.println("Next season is : "+s);
						flag = true;
					}
				}
				if(flag) {
					Seasons season2 = Seasons.valueOf(nSeas);
					int ordinal = season2.ordinal();
					
					if(ordinal == seasonArr.size() -1) {
						ordinal = 0;
						System.out.println(seasonArr.get(ordinal));
					}else {
						System.out.println(seasonArr.get((ordinal)+1));
					}
				}
				
				if (!flag) {
					System.out.println("Season doesn`t exist");
				}
				break;
				
				}// case 6

			case "7": {// ¬ивести на екран попередню пору року

				System.out.println("Enter season : ");
				season = new Scanner(System.in);
				String uSeas = season.next().toUpperCase();
				
				boolean flag = false;
				
				for (Seasons s : seasonArr) {
					if (s.name().equals(uSeas)) {
						//System.out.println("Next season is : "+s);
						flag = true;
					}
				}
				if(flag) {
					Seasons season3 = Seasons.valueOf(uSeas);
					int ordinal = season3.ordinal();
					
					if(ordinal == seasonArr.size() -1) {
						ordinal = 0;
						System.out.println(seasonArr.get(ordinal));
					}else {
						System.out.println(seasonArr.get(ordinal - 1));
					}
				}
				
				if (!flag) {
					System.out.println("Season doesn`t exist");
				}
				break;
				
			} // case 7

			case "8": {// ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в

				System.out.println("Enter number 28 or 30 : ");
				season = new Scanner(System.in);
				int no = season.nextInt();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getinDays() % 2 == 0) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;
				
			} // case 8
			
			case "9": {// ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в

				System.out.println("Enter number 31 : ");
				season = new Scanner(System.in);
				int nom = season.nextInt();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getinDays() % 2 == 1) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;
				
			} // case 9

			case "0": {// ¬ивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в

				System.out.println("Enter month : ");
				season = new Scanner(System.in);
				String scs = season.next().toUpperCase();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.name().equalsIgnoreCase(scs)) {
						if(m.getinDays() % 2 == 0) {
							System.out.println("Month exists and has an even number of days : "+m);					
						flag = true;
					}else {
						System.out.println("Month exists and has no even number of days : "+m);					
						}
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;

			} // case 10*/

			}// switch
		} // while
	}// seasonScanner
}
