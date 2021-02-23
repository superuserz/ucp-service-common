package com.nagp.ucp.common.request;

public class NotificationPayload {

	private String messageBody;

	private String subject;

	private String from;

	private String to;

	public NotificationPayload() {
		super();
	}

	public NotificationPayload(String messageBody, String subject, String from, String to) {
		super();
		this.messageBody = messageBody;
		this.subject = subject;
		this.from = from;
		this.to = to;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "NotificationPayload [ messageBody=" + messageBody + ", subject=" + subject + ", from=" + from + ", to="
				+ to + "]";
	}

}
