package com.adriandlph.msrv.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 *
 * @author adriandlph
 * 
 * @param <T> response data type
 * 
 * Response of an API call.
 * 
 */
@JsonRootName(value = "response")
// @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonTypeName("response")
@JsonPropertyOrder({ "code", "msg", "data" })
public class Response<T> {
	public static final String MSG_OK = "Ok";
	
	@JsonProperty("code")
	private int code;
	@JsonProperty("msg")
	private String msg;
	@JsonProperty("data")
	private T data;

	public Response() {
	}

	public Response(int code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public static <T> Response<T> Ok(T data) {
		return new Response<>(0, MSG_OK, data);
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str.append("Response{");
		str.append(" code=");
		str.append(code);
		str.append(" ,msg=");
		str.append(msg);
		str.append(" ,data=");
		str.append(data == null ? data : data.toString());
		str.append(" }");
		
		return str.toString();
	}
	
}
