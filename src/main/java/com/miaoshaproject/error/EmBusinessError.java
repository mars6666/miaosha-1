package com.miaoshaproject.error;

/**
 * @author god-jiang
 * @date 2019/12/22 14:31
 * @description 错误类型枚举类
 */
public enum EmBusinessError implements CommonError {

    //通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),

    //20000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001,"用户不存在")
    ;

    private int errCode;

    private String errMsg;

    /**
     * @author god-jiang
     * @date 2019/12/22
     * @param errCode: 错误码
     * @param errMsg: 错误信息
     * @return null
     * @description 这是一个private的构造器，供上面定义的枚举具体类使用
     */
    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
