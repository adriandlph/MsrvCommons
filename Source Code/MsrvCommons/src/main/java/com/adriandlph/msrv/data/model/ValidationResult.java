package com.adriandlph.msrv.data.model;

/**
 *
 * @author adriandlph
 * 
 * Represent the result of a validation.
 * 
 * The result can be: valid or not valid. If a result is not valid, a reason 
 * could be defined.
 * 
 */
public class ValidationResult {
	private boolean valid;
	private String reason;

	/**
	 * Don't use default constructor.
	 */
	private ValidationResult() {
	}
	
	/**
	 * This constructor must be used only here.
	 */
	private ValidationResult(boolean valid, String reason) {
		this.valid = valid;
		this.reason = reason;
	}
	
	/**
	 * Gets an instance of a valid result.
	 * 
	 * @return valid result.
	 */
	public static ValidationResult valid() {
		return new ValidationResult(true, "Ok");
	}
	
	/**
	 * Gets an instance of a not valid result.
	 * 
	 * @param reason reason why it is not valid.
	 * 
	 * @return notValid result.
	 */
	public static ValidationResult notValid(String reason) {
		return new ValidationResult(false, reason);
	}

	/**
	 * Get if it is valid.
	 * 
	 * @return if it is valid, return true, else return false.
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * Reason why it is not valid.
	 * 
	 * @return return the reason of why it is not valid.
	 */
	public String getReason() {
		return reason;
	}

	@Override
	public String toString() {
		StringBuffer str;
		
		str = new StringBuffer("ValidityResult{");
		str.append(" valid=");
		str.append(valid);
		if (!valid) {
			str.append(", reason=");
			str.append(reason);
		}
		str.append(" }");
		
		return str.toString();
	}
	
}
