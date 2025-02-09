package com.adriandlph.msrv.exception;

/**
 *
 * @author adriandlph
 * 
 */
public class NotValidException extends MsrvException {

	public NotValidException() {
	}

	public NotValidException(String message) {
		super(message);
	}

	public NotValidException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotValidException(Throwable cause) {
		super(cause);
	}

	public NotValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NotValidException(int code) {
		super(code);
	}

	public NotValidException(int code, String message) {
		super(code, message);
	}

	public NotValidException(int code, String message, Throwable cause) {
		super(code, message, cause);
	}

	public NotValidException(int code, Throwable cause) {
		super(code, cause);
	}

	public NotValidException(int code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(code, message, cause, enableSuppression, writableStackTrace);
	}
	
}
