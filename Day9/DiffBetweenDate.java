//16) Find the duration of difference between two dates in Java
//Input: start_date = “10-01-2018 01:10:20”, end_date = “10-06-2020
//06:30:50” Output: 2 years, 152 days, 5 hours, 20 minutes, 30
//seconds Input: start_date = “10-01-2019 01:00:00”, end_date = “10-06-2020
//06:00:00” Output: 1 years, 152 days, 5 hours, 0 minutes, 0 seconds
package day9;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DiffBetweenDate {
	public static void main(String[] args) {
		String start_date = "10-01-2018 01:10:20";
		String end_date = "10-06-2020 06:30:50";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime startTime = LocalDateTime.parse(start_date, formatter);
		LocalDateTime endTime = LocalDateTime.parse(end_date, formatter);

		Duration duration = Duration.between(startTime, endTime);

		long years = duration.toDays() / 365;
		long days = duration.toDays() % 365;
		long hours = duration.toHours() % 24;
		long minutes = duration.toMinutes() % 60;
		long seconds = duration.getSeconds() % 60;

		System.out.println(years + " years, " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds
				+ " seconds");
	}
}
