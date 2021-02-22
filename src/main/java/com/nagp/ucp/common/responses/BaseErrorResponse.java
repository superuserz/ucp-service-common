package com.nagp.ucp.common.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BaseErrorResponse<T>{
    private static final long serialVersionUID = 1L;

    /** The service which failed. */
    private String serviceWhichFailed;

    /** The error code */
    private String errorCode;
    
    /** The error code */
    private String message;

}
