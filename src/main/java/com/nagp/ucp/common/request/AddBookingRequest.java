package com.nagp.ucp.common.request;

public class AddBookingRequest {
	/**
	 * ID from the catalog service for which booking is to be done
	 */
	private int serviceId;

	/**
	 * ID of the User Requesting the service
	 */
	private int userId;

	/**
	 * ID of the User to which service is assigned
	 */
	private int assigneeId;

	/**
	 * Booking Status
	 */
	private String bookingStatus;

	/**
	 * Additional Comments for the Booking
	 */
	private String comment;

	/**
	 * Amount To be Paid by Customer
	 */
	private double serviceAmount;

	/**
	 * Payment Mode for the Booking
	 */
	private String paymentMode;

	public AddBookingRequest() {
		super();
	}

	public AddBookingRequest(int serviceId, int userId, int assigneeId, String bookingStatus, String comment,
			double serviceAmount, String paymentMode) {
		super();
		this.serviceId = serviceId;
		this.userId = userId;
		this.assigneeId = assigneeId;
		this.bookingStatus = bookingStatus;
		this.comment = comment;
		this.serviceAmount = serviceAmount;
		this.paymentMode = paymentMode;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAssigneeId() {
		return assigneeId;
	}

	public void setAssigneeId(int assigneeId) {
		this.assigneeId = assigneeId;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public double getServiceAmount() {
		return serviceAmount;
	}

	public void setServiceAmount(double serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "AddBookingRequest [serviceId=" + serviceId + ", userId=" + userId + ", assigneeId=" + assigneeId
				+ ", bookingStatus=" + bookingStatus + ", comment=" + comment + ", serviceAmount=" + serviceAmount
				+ ", paymentMode=" + paymentMode + "]";
	}

}
