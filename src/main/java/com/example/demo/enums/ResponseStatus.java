package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum ResponseStatus {


    /**
     * http返回码
     */
    SUCCESS(200, "操作成功"),
    FORBIDDEN(403, "很抱歉,您没有权限访问！"),
    NOT_FOUND(404, "资源不存在！"),
    ERROR(500, "服务器内部错误！"),

    /**
     * 自定义成功返回码，方便前端统一处理
     */
    OK(0, "操作成功"),


    /**
     * 自定义错误返回码和返回信息
     */
    FAILED(10000, "失败"),
    UNKNOWN_ERROR(10001, "未知错误"),
    DB_ERROR(10002, "数据库报错"),
    PARAM_ERROR(10004, "参数错误"),
    JSON_PARSE_ERROR(10003, "json解析异常"),
    FILE_UPLOAD_ERROR(10005, "文件上传错误"),
    EXCEL_DATA_IMPORT_ERROR(10006, "Excel数据导入错误"),
    AUTH_CODE_ERROR(10007, "验证码错误!"),
    USER_NOT_EXISTS_ERROR(10008, "用户不存在!"),
    PASSWORD_ERROR(10009, "密码错误,请重新输入!"),
    ROLE_ALREADY_EXISTS_ERROR(10010, "角色已存在"),

    USER_ALREADY_EXISTS_ERROR(10011, "用户已存在"),
    UNAUTHORIZED_ACCESS_ERROR(10012, "未授权访问"),

    FORBIDDEN_OPERATE(10013, "禁止操作"),

    ROLE_DELETE_ERROR(10014, "禁止删除，角色有子角色"),
    DEPLOY_FAILED(10015, "部署失败");

    private int code;
    private String message;

    ResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
