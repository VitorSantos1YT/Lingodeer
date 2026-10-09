package com.lingodeer.network.model;

import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SubscriptionResponseDetail {
    private String expired_date;
    private String expired_date_ms;
    private String orderid;
    private String product_id;
    private String purchase_from;
    private String purchase_type;
    private String transaction_id;
    private String web_order_line_item_id;

    public SubscriptionResponseDetail() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ SubscriptionResponseDetail copy$default(SubscriptionResponseDetail subscriptionResponseDetail, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = subscriptionResponseDetail.orderid;
        }
        if ((i11 & 2) != 0) {
            str2 = subscriptionResponseDetail.web_order_line_item_id;
        }
        if ((i11 & 4) != 0) {
            str3 = subscriptionResponseDetail.transaction_id;
        }
        if ((i11 & 8) != 0) {
            str4 = subscriptionResponseDetail.product_id;
        }
        if ((i11 & 16) != 0) {
            str5 = subscriptionResponseDetail.purchase_type;
        }
        if ((i11 & 32) != 0) {
            str6 = subscriptionResponseDetail.purchase_from;
        }
        if ((i11 & 64) != 0) {
            str7 = subscriptionResponseDetail.expired_date;
        }
        if ((i11 & 128) != 0) {
            str8 = subscriptionResponseDetail.expired_date_ms;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return subscriptionResponseDetail.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public final String component1() {
        return this.orderid;
    }

    public final String component2() {
        return this.web_order_line_item_id;
    }

    public final String component3() {
        return this.transaction_id;
    }

    public final String component4() {
        return this.product_id;
    }

    public final String component5() {
        return this.purchase_type;
    }

    public final String component6() {
        return this.purchase_from;
    }

    public final String component7() {
        return this.expired_date;
    }

    public final String component8() {
        return this.expired_date_ms;
    }

    public final SubscriptionResponseDetail copy(String orderid, String web_order_line_item_id, String transaction_id, String product_id, String purchase_type, String purchase_from, String expired_date, String expired_date_ms) {
        m.f(orderid, "orderid");
        m.f(web_order_line_item_id, "web_order_line_item_id");
        m.f(transaction_id, "transaction_id");
        m.f(product_id, "product_id");
        m.f(purchase_type, "purchase_type");
        m.f(purchase_from, "purchase_from");
        m.f(expired_date, "expired_date");
        m.f(expired_date_ms, "expired_date_ms");
        return new SubscriptionResponseDetail(orderid, web_order_line_item_id, transaction_id, product_id, purchase_type, purchase_from, expired_date, expired_date_ms);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionResponseDetail)) {
            return false;
        }
        SubscriptionResponseDetail subscriptionResponseDetail = (SubscriptionResponseDetail) obj;
        return m.a(this.orderid, subscriptionResponseDetail.orderid) && m.a(this.web_order_line_item_id, subscriptionResponseDetail.web_order_line_item_id) && m.a(this.transaction_id, subscriptionResponseDetail.transaction_id) && m.a(this.product_id, subscriptionResponseDetail.product_id) && m.a(this.purchase_type, subscriptionResponseDetail.purchase_type) && m.a(this.purchase_from, subscriptionResponseDetail.purchase_from) && m.a(this.expired_date, subscriptionResponseDetail.expired_date) && m.a(this.expired_date_ms, subscriptionResponseDetail.expired_date_ms);
    }

    public final String getExpired_date() {
        return this.expired_date;
    }

    public final String getExpired_date_ms() {
        return this.expired_date_ms;
    }

    public final String getOrderid() {
        return this.orderid;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getPurchase_from() {
        return this.purchase_from;
    }

    public final String getPurchase_type() {
        return this.purchase_type;
    }

    public final String getTransaction_id() {
        return this.transaction_id;
    }

    public final String getWeb_order_line_item_id() {
        return this.web_order_line_item_id;
    }

    public int hashCode() {
        return this.expired_date_ms.hashCode() + e.d(e.d(e.d(e.d(e.d(e.d(this.orderid.hashCode() * 31, 31, this.web_order_line_item_id), 31, this.transaction_id), 31, this.product_id), 31, this.purchase_type), 31, this.purchase_from), 31, this.expired_date);
    }

    public final void setExpired_date(String str) {
        m.f(str, "<set-?>");
        this.expired_date = str;
    }

    public final void setExpired_date_ms(String str) {
        m.f(str, "<set-?>");
        this.expired_date_ms = str;
    }

    public final void setOrderid(String str) {
        m.f(str, "<set-?>");
        this.orderid = str;
    }

    public final void setProduct_id(String str) {
        m.f(str, "<set-?>");
        this.product_id = str;
    }

    public final void setPurchase_from(String str) {
        m.f(str, "<set-?>");
        this.purchase_from = str;
    }

    public final void setPurchase_type(String str) {
        m.f(str, "<set-?>");
        this.purchase_type = str;
    }

    public final void setTransaction_id(String str) {
        m.f(str, "<set-?>");
        this.transaction_id = str;
    }

    public final void setWeb_order_line_item_id(String str) {
        m.f(str, "<set-?>");
        this.web_order_line_item_id = str;
    }

    public String toString() {
        String str = this.orderid;
        String str2 = this.web_order_line_item_id;
        String str3 = this.transaction_id;
        String str4 = this.product_id;
        String str5 = this.purchase_type;
        String str6 = this.purchase_from;
        String str7 = this.expired_date;
        String str8 = this.expired_date_ms;
        StringBuilder sbS = e.s("SubscriptionResponseDetail(orderid=", str, ", web_order_line_item_id=", str2, ", transaction_id=");
        d.w(sbS, str3, ", product_id=", str4, ", purchase_type=");
        d.w(sbS, str5, ", purchase_from=", str6, ", expired_date=");
        return e.p(sbS, str7, ", expired_date_ms=", str8, ")");
    }

    public SubscriptionResponseDetail(String orderid, String web_order_line_item_id, String transaction_id, String product_id, String purchase_type, String purchase_from, String expired_date, String expired_date_ms) {
        m.f(orderid, "orderid");
        m.f(web_order_line_item_id, "web_order_line_item_id");
        m.f(transaction_id, "transaction_id");
        m.f(product_id, "product_id");
        m.f(purchase_type, "purchase_type");
        m.f(purchase_from, "purchase_from");
        m.f(expired_date, "expired_date");
        m.f(expired_date_ms, "expired_date_ms");
        this.orderid = orderid;
        this.web_order_line_item_id = web_order_line_item_id;
        this.transaction_id = transaction_id;
        this.product_id = product_id;
        this.purchase_type = purchase_type;
        this.purchase_from = purchase_from;
        this.expired_date = expired_date;
        this.expired_date_ms = expired_date_ms;
    }

    public /* synthetic */ SubscriptionResponseDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str5, (i11 & 32) != 0 ? BuildConfig.VERSION_NAME : str6, (i11 & 64) != 0 ? BuildConfig.VERSION_NAME : str7, (i11 & 128) != 0 ? BuildConfig.VERSION_NAME : str8);
    }
}
