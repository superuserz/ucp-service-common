package com.nagp.ucp.common.request;

public class BookingCommentRequest {

	int bookingId;

	String comment;

	public BookingCommentRequest() {
		super();
	}

	public BookingCommentRequest(int bookingId, String comment) {
		super();
		this.bookingId = bookingId;
		this.comment = comment;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "BookingCommentRequest [bookingId=" + bookingId + ", comment=" + comment + "]";
	}

}
