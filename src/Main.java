import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		// Creating the data
		ArrayList<Score> scoreList = new ArrayList<Score>();
		scoreList.add(new Score("John", "Math", "Addition", 4, "2016-05-19 09:01:04"));
		scoreList.add(new Score("Sam", "Math", "Addition", 10, "2016-05-19 09:07:04"));
		scoreList.add(new Score("Pam", "Math", "Addition", 8, "2016-05-19 09:06:04"));
		scoreList.add(new Score("Penny", "Math", "Addition", 4, "2016-05-19 08:01:04"));
		scoreList.add(new Score("Jason", "Math", "Addition", 6, "2016-05-19 08:01:05"));
		scoreList.add(new Score("Joshua", "Math", "Addition", 6, "2016-05-19 08:01:04"));
		scoreList.add(new Score("Dickson", "Math", "Addition", 6, "2016-05-19 08:01:03"));

		System.out.println("\n*******************" + "\nBefore sort" + "\n*******************");

		for (Score s : scoreList) {
			System.out.println("Name: " + s.getName() + "\tScore: " + s.getScore() + "\tDate: " + s.getDate());
		}

		// Call the ScoreComparator to sort the list
		Collections.sort(scoreList, new ScoreComparator());

		System.out.println("\n*******************" + "\nBefore reverse" + "\n*******************");

		for (Score s : scoreList) {
			System.out.println("Name: " + s.getName() + "\tScore: " + s.getScore() + "\tDate: " + s.getDate());
		}

		// Reverse the list as it is from smallest to biggest
		Collections.reverse(scoreList);

		System.out.println();
		System.out.println("\n*******************" + "\nAfter reverse" + "\n*******************");
		
		for (Score s : scoreList) {
			System.out.println("Name: " + s.getName() + "\tScore: " + s.getScore() + "\tDate: " + s.getDate());
		}
	}
}
