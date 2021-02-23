package com.nagp.ucp.common.request;

public class AddRatingRequest {

	private int serviceId;

	private String name;

	private double totalRating;

	private String comment;

	public AddRatingRequest() {
		super();
	}

	public AddRatingRequest(int serviceId, String name, double totalRating, String comment) {
		super();
		this.serviceId = serviceId;
		this.name = name;
		this.totalRating = totalRating;
		this.comment = comment;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalRating() {
		return totalRating;
	}

	public void setTotalRating(double totalRating) {
		this.totalRating = totalRating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "AddRatingRequest [serviceId=" + serviceId + ", name=" + name + ", totalRating=" + totalRating
				+ ", comment=" + comment + "]";
	}

}
