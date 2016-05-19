import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class ScoreComparator implements Comparator<Score> {

	@Override
	public int compare(Score a, Score b) {

		// Get the score and create the Integer Object for comparing
		Integer myObj1 = new Integer(a.getScore());
		Integer myObj2 = new Integer(b.getScore());

		// Compare the score
		int scoreResult = myObj1.compareTo(myObj2);
		
		// Date time format *Please change to your own format*
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		if (scoreResult == 0) {

			// Score are equal, sort by date
			
			Date date1 = null, date2 = null;
			try {

				date1 = sdf.parse(a.getDate());
				date2 = sdf.parse(b.getDate());

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return date1.compareTo(date1);

		} else {

			return scoreResult;
		}
	}
}
