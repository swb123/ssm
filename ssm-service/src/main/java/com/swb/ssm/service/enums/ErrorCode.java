package com.swb.ssm.service.enums;

public enum ErrorCode implements EnumerableError{

    USER_SELECT_PARAMS(100, "用户查询失败"),
    USER_INSERT_ERROR(101, "用户插入失败"),
    USER_DELETE_ERROR(102, "用户删除失败"),
    USER_UPDATE_ERROR(103, "用户更新失败"),

    ;

    private int code;
    private String msg;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
