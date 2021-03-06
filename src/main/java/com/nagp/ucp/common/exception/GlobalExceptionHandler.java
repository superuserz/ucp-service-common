package com.nagp.ucp.common.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.nagp.ucp.common.responses.BaseErrorResponse;

@ControllerAdvice(basePackages = "com.nagp.ucp")
@ResponseStatus(code = HttpStatus.BAD_REQUEST)

public class GlobalExceptionHandler {

	/** The application name. */
	private @Value("${spring.application.name}") String serviceName;

	/**
	 * Instantiates a new exception controller advice.
	 */
	public GlobalExceptionHandler() {
		super();
	}

	@SuppressWarnings("rawtypes")
	@ExceptionHandler({ UCPException.class })
	@ResponseBody
	public BaseErrorResponse handleUCPException(final UCPException ex, final HttpServletRequest request,
			final HttpServletResponse response) {
		return new BaseErrorResponse(serviceName, ex.getErrorCode(), ex.getMessage());

	}
}
