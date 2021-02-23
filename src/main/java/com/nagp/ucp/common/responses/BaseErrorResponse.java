package com.nagp.ucp.common.responses;

public class BaseErrorResponse<T> {

	/** The service which failed. */
	private String serviceWhichFailed;

	/** The error code */
	private String errorCode;

	/** The error code */
	private String message;

	public BaseErrorResponse() {
		super();
	}

	public BaseErrorResponse(String serviceWhichFailed, String errorCode, String message) {
		super();
		this.serviceWhichFailed = serviceWhichFailed;
		this.errorCode = errorCode;
		this.message = message;
	}

	public String getServiceWhichFailed() {
		return serviceWhichFailed;
	}

	public void setServiceWhichFailed(String serviceWhichFailed) {
		this.serviceWhichFailed = serviceWhichFailed;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
