package com.hoaxify.hoaxify.error;

import org.springframework.http.HttpStatus;

import java.util.Date;
import java.util.Map;

public class ErrorResponse {

    private long timestap = new Date().getTime();
    private HttpStatus status;
    private String userMessage;
    private String devMessage;
    private String url;
    private Map<String, String> validationErrors;

    public ErrorResponse() {
    }

    public ErrorResponse(HttpStatus status, String userMessage, String devMessage, String url) {
        this.status = status;
        this.userMessage = userMessage;
        this.devMessage = devMessage;
        this.url = url;
    }

    public long getTimestap() {
        return timestap;
    }

    public void setTimestap(long timestap) {
        this.timestap = timestap;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getDevMessage() {
        return devMessage;
    }

    public void setDevMessage(String devMessage) {
        this.devMessage = devMessage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(Map<String, String> validationErrors) {
        this.validationErrors = validationErrors;
    }
}
