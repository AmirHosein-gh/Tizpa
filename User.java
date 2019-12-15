import java.util.Random;
import java.util.Scanner;

public class User {
	Scanner scanner = new Scanner(System.in);
	TripMethod[] tm = new TripMethod[100];
	int travelNumber = 0;
	int lastTrip = 0;

	public void menu() {
		int userChoice = scanner.nextInt();
		switch (userChoice) {
		case 1:
			tm[travelNumber] = new Economic();
			break;
		case 2:
			tm[travelNumber] = new VIP();
			break;
		case 3:
			tm[travelNumber] = new Bike();
			break;
		default:
			System.out.println("Wrong Number!");
			break;
		}
		lastTrip = travelNumber;
		travelNumber++;
	}

	public double trip() {
		double districtPrice = 0;
		double tripPrice = 0;
		Random randomRain = new Random();
		// Generating Random Weather:
		boolean rain = randomRain.nextBoolean();
		// Generating Random Time
		int time = (int) (Math.random() * ((24 - 0) + 1));
		System.out.println("Choose Origin:");
		int origin = scanner.nextInt();
		System.out.println("Choose Destination:");
		int destination = scanner.nextInt();
		districtPrice = tm[lastTrip].district.districtPrice(origin, destination);
		tripPrice = tm[lastTrip].tripConditionPrice(rain, time);
		double finalPrice = districtPrice * tripPrice;
		System.out.println("Time: " + time);
		if (time > 17 && time < 21) {
			System.out.println("Traffic: High");
		} else {
			System.out.println("Traffic: Low");
		}
		if (rain) {
			System.out.println("Weather: Rainy");
		} else {
			System.out.println("Weather: Sunny");
		}
		// System.out.println(districtPrice);
		// System.out.println(tripPrice);
		System.out.print("Trip Price:   " + finalPrice);
		return finalPrice;
	}
}
