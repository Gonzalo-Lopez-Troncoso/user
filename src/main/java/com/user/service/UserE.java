package com.user.service;

public enum UserE {

    OK(false, 0, "Err000", "OK", ""),
    SERVER_ERROR(true, 1, "Err001", "Se produjo un error dentro del servicio. Por favor, contactenos.", ""),
    EMAIL_FOUND(true, 2, "Err002", "El correo ya registrado.", "");

    private boolean error;
    private int errNum;
    private String errCode;
    private String errDesc;
    private String errMsg;

    UserE(boolean error, int errNum, String errCode, String errDesc, String errMsg) {
        this.error = error;
        this.errNum = errNum;
        this.errCode = errCode;
        this.errDesc = errDesc;
        this.errMsg = errMsg;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public int getErrNum() {
        return errNum;
    }

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
