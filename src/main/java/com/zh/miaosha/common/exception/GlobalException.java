package com.zh.miaosha.common.exception;

import com.zh.miaosha.common.bean.CodeMsg;

/**
 * 自定义异常
 */
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }

}
