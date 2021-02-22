package com.nagp.ucp.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * This class extends the base class {@link UCPBaseException} for providing the
 * framework for checked exception handling. The application should throw this
 * exception in case of business fault.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UCPException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1393115699347678628L;

	private String errorCode;

	private String message;

	private String details;

	public UCPException(String errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

}
