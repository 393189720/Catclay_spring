package com.catclay.cn.entities;

/**
 * Created by clay on 2015/10/27.
 */
public abstract class BaseEntity {

    private int resultCode;

    /**
     * ²Ù×÷½á¹û
     */
    private boolean result;

    @Override
    public String toString() {
        return "BaseEntity{" +
                "resultCode=" + resultCode +
                ", result=" + result +
                '}';
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
