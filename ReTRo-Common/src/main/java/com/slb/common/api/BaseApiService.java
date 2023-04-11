package com.slb.common.api;

import com.slb.common.api.constans.ApiConstants;
import lombok.Data;

@Data
public class BaseApiService<T> {

    public BaseResponse<T> setResultError(Integer code, String msg) {
        return setResult(code, msg, null);
    }

    public BaseResponse<T> setResultError(String msg) {
        return setResult(ApiConstants.HTTP_RES_CODE_500.getCode(), msg, null);
    }

    public BaseResponse<T> setResultSuccessData(T data) {
        return setResult(ApiConstants.HTTP_RES_CODE_200.getCode(), ApiConstants.HTTP_RES_CODE_200.getValue(), data);
    }

    public BaseResponse<T> setResultSuccess() {
        return setResult(ApiConstants.HTTP_RES_CODE_200.getCode(), ApiConstants.HTTP_RES_CODE_200.getValue(), null);
    }


    public BaseResponse<T> setResult(Integer code, String msg, T data) {
        return new BaseResponse<T>(code, msg, data);
    }

    public BaseResponse<T> setResultDB(int result) {
        if (result > 0) {
            return setResultSuccess();
        } else {
            return setResultError("DB operation failed");
        }
    }
}