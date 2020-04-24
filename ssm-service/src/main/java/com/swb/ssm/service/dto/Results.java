package com.swb.ssm.service.dto;

import com.swb.ssm.service.enums.EnumerableError;

public class Results {
    public Results() {
    }

    public static Result ok(Object data) {
        return new Result(0, null, data);
    }
    public static Result ok() {
        return new Result(0, null, null);
    }

    public static Result fail(EnumerableError error) {
        return new Result(error.getCode(), error.getMsg());
    }


}
