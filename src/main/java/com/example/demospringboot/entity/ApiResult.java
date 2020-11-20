package com.example.demospringboot.entity;

public  class ApiResult<T> {
    private int code;
    private String msg;
    private T data;
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

    public boolean isOk() {//请求成功的判断方法
        return code == 0 ? true : false;
    }

    public static ApiResult getApiResult(int code,String msg){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(code);
        apiResult.setMsg(msg);
        return apiResult;
    }
}