package com.ebook.dto;

public class ResultMessage {

    private boolean success;

    private Object data;

    private String error;

    public ResultMessage(){
    }

    public ResultMessage(boolean success, Object data){
        this.success = success;
        this.data = data;
    }

    public ResultMessage(boolean success,String error){
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess(){
        return success;
    }

    public void setSuccess(boolean success){
        this.success = success;
    }

    public Object getData(){
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public String getError(){
        return error;
    }

    public void setError(String error){
        this.error = error;
    }
}
