package com.lzt.utils;

import com.lzt.model.Result;

/**
 * Created by lzt on 2018/7/11.
 */
public class ResponseUtils {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(1);
        result.setMessage("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result fail(Integer code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(null);
        return result;
    }
}
