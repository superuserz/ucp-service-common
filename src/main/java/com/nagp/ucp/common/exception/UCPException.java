package com.nagp.ucp.common.exception;

import java.util.List;

/**
 * This class extends the base class {@link UCPBaseException} for providing the
 * framework for checked exception handling. The application should throw this
 * exception in case of business fault.
 */
public class UCPException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1393115699347678628L;

	private Throwable cause;

	private String errorCode;

	private List<ResponseMessage> messages;

	/**
	 * @param message
	 * @param errorCode
	 */
	public UCPException(final String message, final String errorCode) {
		super(message);
		this.errorCode = errorCode;

	}

	/**
	 * @param message
	 * @param cause
	 */
	public UCPException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public UCPException(final String message) {
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 * @param errorCode
	 * @param messages
	 */
	public UCPException(final String message, final Throwable cause, final String errorCode,
			final List<ResponseMessage> messages) {
		super(message, cause);
		this.errorCode = errorCode;
		this.messages = messages;
	}

	/**
	 * @param message
	 * @param cause
	 * @param errorCode
	 */
	public UCPException(final String message, final Throwable cause, final String errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}
}
