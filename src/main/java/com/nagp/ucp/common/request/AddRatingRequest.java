package com.nagp.ucp.common.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class AddRatingRequest {

	private int serviceId;

	private String name;

	private double totalRating;

	private String comment;
}
