package com.lc.studentmanager.util;

import lombok.Data;

/**
 * @Classname AjaxResult
 * @Description ajax json 返回数据
 * @Date 2019/6/25 10:21
 * @Created by lc
 */
@Data
public class AjaxResult {
    private boolean success;
    private String message;
    private String imgurl;
    private String type;

}
