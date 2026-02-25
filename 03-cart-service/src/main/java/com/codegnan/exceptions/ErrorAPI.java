package com.codegnan.exceptions;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorAPI {
private String message;
public ErrorAPI() {
	
}
public ErrorAPI(String message, String status, String error, LocalDateTime localDateTime) {
	
	this.message = message;
	this.status = status;
	this.error = error;
	this.localDateTime = localDateTime;
}
private String status;
public String getMessage() {
	return message;
}
public String getStatus() {
	return status;
}
public String getError() {
	return error;
}
public LocalDateTime getLocalDateTime() {
	return localDateTime;
}
public void setMessage(String message) {
	this.message = message;
}
public void setStatus(String status) {
	this.status = status;
}
public void setError(String error) {
	this.error = error;
}
public void setLocalDateTime(LocalDateTime localDateTime) {
	this.localDateTime = localDateTime;
}
private String error;
private LocalDateTime localDateTime;
}
