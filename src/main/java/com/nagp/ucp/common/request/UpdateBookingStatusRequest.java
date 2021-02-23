package com.nagp.ucp.common.request;

public class UpdateBookingStatusRequest {

	int bookingId;

	String status;

	public UpdateBookingStatusRequest() {
		super();
	}

	public UpdateBookingStatusRequest(int bookingId, String status) {
		super();
		this.bookingId = bookingId;
		this.status = status;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UpdateBookingStatusRequest [bookingId=" + bookingId + ", status=" + status + "]";
	}

}
