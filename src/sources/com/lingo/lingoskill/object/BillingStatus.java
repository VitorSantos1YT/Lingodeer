package com.lingo.lingoskill.object;

import android.text.TextUtils;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BillingStatus {
    private String expired_date_ms;
    private String expired_date_str;
    private String from_type;
    private String grant_type;
    private String languageName;
    private String orderid;
    private String productid;
    private String purchase_date_ms;
    private String purchase_date_str;
    private String transactionid;

    public BillingStatus(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.languageName = str;
        this.orderid = str2;
        this.transactionid = str3;
        this.productid = str4;
        this.purchase_date_ms = str5;
        this.expired_date_ms = str6;
        this.purchase_date_str = str7;
        this.expired_date_str = str8;
        this.from_type = str9;
        this.grant_type = str10;
    }

    public String getExpired_date_ms() {
        return TextUtils.isEmpty(this.expired_date_ms) ? "0" : this.expired_date_ms;
    }

    public String getExpired_date_str() {
        return this.expired_date_str;
    }

    public String getFrom_type() {
        return TextUtils.isEmpty(this.from_type) ? BuildConfig.VERSION_NAME : this.from_type;
    }

    public String getGrant_type() {
        return this.grant_type;
    }

    public String getLanguageName() {
        return this.languageName;
    }

    public String getOrderid() {
        return this.orderid;
    }

    public String getProductid() {
        return this.productid;
    }

    public String getPurchase_date_ms() {
        return TextUtils.isEmpty(this.purchase_date_ms) ? "0" : this.purchase_date_ms;
    }

    public String getPurchase_date_str() {
        return this.purchase_date_str;
    }

    public String getTransactionid() {
        return this.transactionid;
    }

    public void setExpired_date_ms(String str) {
        this.expired_date_ms = str;
    }

    public void setExpired_date_str(String str) {
        this.expired_date_str = str;
    }

    public void setFrom_type(String str) {
        this.from_type = str;
    }

    public void setGrant_type(String str) {
        this.grant_type = str;
    }

    public void setLanguageName(String str) {
        this.languageName = str;
    }

    public void setOrderid(String str) {
        this.orderid = str;
    }

    public void setProductid(String str) {
        this.productid = str;
    }

    public void setPurchase_date_ms(String str) {
        this.purchase_date_ms = str;
    }

    public void setPurchase_date_str(String str) {
        this.purchase_date_str = str;
    }

    public void setTransactionid(String str) {
        this.transactionid = str;
    }

    public BillingStatus() {
    }
}
