
public class MainApp {
public static void main(String[] args) {
	System.out.println("Welcome To Tizpa Online Taxi Service");
	System.out.println("=====================================");
	System.out.println("Choose your prefered service:");
	System.out.println("1.Economic");
	System.out.println("2.VIP");
	System.out.println("3.Bike");
	User user1 = new User();
	user1.menu();
	user1.trip();
}
}
