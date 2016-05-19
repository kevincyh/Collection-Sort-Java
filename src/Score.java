import java.util.Date;

public class Score {

	private String name;
	private String subject;
	private String chapter;
	private int score;
	private String date;

	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(String name, String subject, String chapter, int score, String date) {
		super();
		this.name = name;
		this.subject = subject;
		this.chapter = chapter;
		this.score = score;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
