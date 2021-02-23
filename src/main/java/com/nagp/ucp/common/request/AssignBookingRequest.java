package com.nagp.ucp.common.request;

public class AssignBookingRequest {

	int bookingId;

	int providerId;

	public AssignBookingRequest() {
		super();
	}

	public AssignBookingRequest(int bookingId, int providerId) {
		super();
		this.bookingId = bookingId;
		this.providerId = providerId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getProviderId() {
		return providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	@Override
	public String toString() {
		return "AssignBookingRequest [bookingId=" + bookingId + ", providerId=" + providerId + "]";
	}

}
