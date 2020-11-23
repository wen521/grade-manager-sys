package com.lc.studentmanager.util;

public enum  AjaxResultCode {
    SUCCESS(200),
    FAIL(400),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    public int code;
    AjaxResultCode(int code) {
        this.code= code;
    }
}
