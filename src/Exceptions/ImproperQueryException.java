package Exceptions;

public class ImproperQueryException extends Exception{
	private String message="";
	public ImproperQueryException(String message){
		this.message=message;
	}
	public String getMessage(){
		return message;
	}
}
