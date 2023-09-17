package test.kotlin.application.model;

import com.google.gson.annotations.SerializedName;

public class RegisterResponse{

	@SerializedName("error")
	private String error;

	@SerializedName("message")
	private String message;

	public void setError(String error){
		this.error = error;
	}

	public String getError(){
		return error;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}
}