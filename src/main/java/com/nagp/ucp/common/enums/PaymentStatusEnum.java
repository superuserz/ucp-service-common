package com.nagp.ucp.common.enums;

public enum PaymentStatusEnum {

	INITIATED("INITIATED"),

	INPROCESS("INPROCESS"),

	SUCCESS("SUCCESS"),

	FAILED("FAILED");

	private String value;

	private PaymentStatusEnum(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static PaymentStatusEnum parse(final String value) {
		PaymentStatusEnum paymentStatusEnum = null; // Default
		for (PaymentStatusEnum item : PaymentStatusEnum.values()) {
			if (item.getValue().equals(value)) {
				paymentStatusEnum = item;
				break;
			}
		}
		return paymentStatusEnum;
	}
}
