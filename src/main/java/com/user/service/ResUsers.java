package com.user.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResUsers implements Serializable {

    private boolean ok = false;
    private int errNum;
    private String errCode;
    private String errDesc;
    private String errMsg;
    private Object data;

    public ResUsers(UserE userE, Object data) {
        this.ok = !userE.isError();
        this.errNum = userE.getErrNum();
        this.errCode = userE.getErrCode();
        this.errDesc = userE.getErrDesc();
        this.errMsg = userE.getErrMsg();
        this.data = data;
    }

    @JsonProperty("ok")
    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    @JsonProperty("errNum")
    public int getErrNum() {
        return errNum;
    }

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    @JsonProperty("errCode")
    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    @JsonProperty("errDesc")
    public String getErrDesc() {
        return errDesc;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }

    @JsonProperty("errMsg")
    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @JsonProperty("data")
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
