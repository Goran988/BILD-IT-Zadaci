package zadaci_09_08_2015;

/**
 * Class that contains startTime and endTime data fields. When used they take
 * value of current time in milliseconds.
 * 
 *
 */
public class Stopwatch {
	private long startTime;
	private long endTime;

	public Stopwatch() {

	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public void start() {
		startTime = System.currentTimeMillis();			//method that assigns current time in milliseconds (used to start stopwatch)
	}

	public void stop() {
		endTime = System.currentTimeMillis();			//method that assigns current time in milliseconds (used to stop stopwatch)
	}

	public long elapsedTime() {							//method that gives us time that passed from the moment stopwatch started until it stoped
		return getEndTime() - getStartTime();
	}
}
