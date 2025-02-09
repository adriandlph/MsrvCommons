
package com.adriandlph.msrv.exception;

/**
 *
 * @author adriandlph
 *
 */
public class MsrvException extends Exception implements HasCode {
	private int code;
	
	public MsrvException() {
	}

	public MsrvException(String message) {
		super(message);
	}

	public MsrvException(String message, Throwable cause) {
		super(message, cause);
	}

	public MsrvException(Throwable cause) {
		super(cause);
	}

	public MsrvException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MsrvException(int code) {
		this.code = code;
	}

	public MsrvException(int code, String message) {
		super(message);
		this.code = code;
	}

	public MsrvException(int code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	public MsrvException(int code, Throwable cause) {
		super(cause);
		this.code = code;
	}

	public MsrvException(int code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.code = code;
	}

	@Override
	public int getCode() {
		return code;
	}

	@Override
	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		StringBuilder str;
		
		str = new StringBuilder("MsrvException {\n");
		str.append(super.toString());
		str.append("\n}");
		
		return str.toString();
	}

}
