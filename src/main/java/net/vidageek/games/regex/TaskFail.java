package net.vidageek.games.regex;

final public class TaskFail implements JudgedTask {

	private final String reason;

	public TaskFail(final String reason) {
		this.reason = reason;
	}

	public boolean ok() {
		return false;
	}

	public String getReason() {
		return reason;
	}

}
