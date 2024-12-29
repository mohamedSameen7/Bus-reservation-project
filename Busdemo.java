package busResv;

import java.util.Scanner;
import java.util.ArrayList;
public class Busdemo {
public static void main (String[] args) {
	ArrayList <Bus> Buses = new ArrayList <Bus>();
	ArrayList<Booking> bookings = new ArrayList <Booking>();
	
	
	Buses.add(new Bus(1,true,1
			2));
	Buses.add(new Bus(2,false,50));
	Buses.add(new Bus(3,true,48));
	
	
	int useropt = 1;
	Scanner scan = new Scanner(System.in);
	
	for(Bus b:Buses) {
		b.displayBusInfo();
	}
	
	
	while(useropt==1) {
	System.out.println("Enter 1 to book and 2 to Exit");
	useropt = scan.nextInt();
	if(useropt ==1) {
		Booking booking = new Booking();
		if(booking.isAvailable(bookings,Buses)) {
			bookings.add(booking);
			System.out.println("Your booking is confirmed");
		}
		else {
			System.out.println("Sorry. bus is full. try another bus or date");
		}
			
	}
}
}
}








