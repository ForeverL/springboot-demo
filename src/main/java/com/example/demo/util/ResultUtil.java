package com.example.demo.util;


import com.example.demo.enums.ResponseStatus;
import com.example.demo.vo.ResponseVo;

public class ResultUtil {

    public static ResponseVo success() {
        return vo(ResponseStatus.SUCCESS.getCode(), ResponseStatus.SUCCESS.getMessage(), null);
    }

    public static ResponseVo success(String msg) {
        return vo(ResponseStatus.SUCCESS.getCode(), msg, null);
    }

    public static ResponseVo success(String msg, Object data) {
        return vo(ResponseStatus.SUCCESS.getCode(), null, data);
    }

    public static ResponseVo error() {
        return vo(ResponseStatus.FAILED.getCode(), ResponseStatus.FAILED.getMessage(), null);
    }

    public static ResponseVo error(String msg) {
        return vo(ResponseStatus.FAILED.getCode(), msg, null);
    }

    public static ResponseVo error(Integer code, String msg) {
        return vo(code, msg, null);
    }

    public static ResponseVo error(String msg, Object data) {
        return vo(ResponseStatus.FAILED.getCode(), msg, data);
    }

    public static ResponseVo vo(Integer status, String message, Object data) {
        return new ResponseVo(status, message, data);
    }

    /**
     * 利用枚举类构造返回体，没有返回data
     *
     * @param responseStatus
     * @date: 2022/11/2 14:25
     * @return: dpi.net.cn.dpiams.vo.ResponseVo
     */
    public static ResponseVo vo(ResponseStatus responseStatus) {
        return new ResponseVo(responseStatus.getCode(), responseStatus.getMessage(), null);
    }

    /**
     * 利用枚举类构造返回体
     *
     * @param responseStatus
     * @date: 2022/11/2 14:25
     * @return: dpi.net.cn.dpiams.vo.ResponseVo
     */
    public static ResponseVo vo(ResponseStatus responseStatus, Object data) {
        return new ResponseVo(responseStatus.getCode(), responseStatus.getMessage(), data);
    }

    /**
     * @param rs
     * @param successMsg
     * @param errorMsg
     * @return
     */
    public static ResponseVo getResponseRs(Integer rs, String successMsg, String errorMsg) {

        ResponseVo responseVo = null;
        if (null != rs) {
            if (rs > 0) {
                responseVo = ResultUtil.success(successMsg);
            } else {
                responseVo = ResultUtil.error(errorMsg);
            }
        } else {
            responseVo = ResultUtil.error("接口调用失败,请检查数据库操作!");
        }

        return responseVo;
    }

}
