package localTime;

import java.time.LocalTime;

public class Demo {

	public static void main(String[] args) {
		LocalTime startTime = LocalTime.now();
		LocalTime endTime = startTime.plusMinutes(1);
		
		while(true) {
			LocalTime current = LocalTime.now();
			int hour = current.getHour();
			int minute = current.getMinute();
			int second = current.getSecond();
			if(hour == endTime.getHour() && minute == endTime.getMinute() && second == endTime.getSecond()) {
		        System.out.println("Over");
		        break;
		    }
			else
				System.out.println(current.getSecond());
		}

	}

}
