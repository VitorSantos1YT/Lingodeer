package com.lingodeer.database.model;

import com.google.android.material.datepicker.d;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class BillingStatusEntity {
    private final String expiredDate;
    private final String expiredDateMs;
    private final String orderId;
    private final String productId;
    private final String purchaseFrom;
    private final String purchaseType;
    private final String transactionId;
    private final String webOrderLineItemId;

    public BillingStatusEntity(String orderId, String webOrderLineItemId, String transactionId, String productId, String purchaseType, String purchaseFrom, String expiredDate, String expiredDateMs) {
        m.f(orderId, "orderId");
        m.f(webOrderLineItemId, "webOrderLineItemId");
        m.f(transactionId, "transactionId");
        m.f(productId, "productId");
        m.f(purchaseType, "purchaseType");
        m.f(purchaseFrom, "purchaseFrom");
        m.f(expiredDate, "expiredDate");
        m.f(expiredDateMs, "expiredDateMs");
        this.orderId = orderId;
        this.webOrderLineItemId = webOrderLineItemId;
        this.transactionId = transactionId;
        this.productId = productId;
        this.purchaseType = purchaseType;
        this.purchaseFrom = purchaseFrom;
        this.expiredDate = expiredDate;
        this.expiredDateMs = expiredDateMs;
    }

    public static /* synthetic */ BillingStatusEntity copy$default(BillingStatusEntity billingStatusEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = billingStatusEntity.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = billingStatusEntity.webOrderLineItemId;
        }
        if ((i11 & 4) != 0) {
            str3 = billingStatusEntity.transactionId;
        }
        if ((i11 & 8) != 0) {
            str4 = billingStatusEntity.productId;
        }
        if ((i11 & 16) != 0) {
            str5 = billingStatusEntity.purchaseType;
        }
        if ((i11 & 32) != 0) {
            str6 = billingStatusEntity.purchaseFrom;
        }
        if ((i11 & 64) != 0) {
            str7 = billingStatusEntity.expiredDate;
        }
        if ((i11 & 128) != 0) {
            str8 = billingStatusEntity.expiredDateMs;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return billingStatusEntity.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component2() {
        return this.webOrderLineItemId;
    }

    public final String component3() {
        return this.transactionId;
    }

    public final String component4() {
        return this.productId;
    }

    public final String component5() {
        return this.purchaseType;
    }

    public final String component6() {
        return this.purchaseFrom;
    }

    public final String component7() {
        return this.expiredDate;
    }

    public final String component8() {
        return this.expiredDateMs;
    }

    public final BillingStatusEntity copy(String orderId, String webOrderLineItemId, String transactionId, String productId, String purchaseType, String purchaseFrom, String expiredDate, String expiredDateMs) {
        m.f(orderId, "orderId");
        m.f(webOrderLineItemId, "webOrderLineItemId");
        m.f(transactionId, "transactionId");
        m.f(productId, "productId");
        m.f(purchaseType, "purchaseType");
        m.f(purchaseFrom, "purchaseFrom");
        m.f(expiredDate, "expiredDate");
        m.f(expiredDateMs, "expiredDateMs");
        return new BillingStatusEntity(orderId, webOrderLineItemId, transactionId, productId, purchaseType, purchaseFrom, expiredDate, expiredDateMs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingStatusEntity)) {
            return false;
        }
        BillingStatusEntity billingStatusEntity = (BillingStatusEntity) obj;
        return m.a(this.orderId, billingStatusEntity.orderId) && m.a(this.webOrderLineItemId, billingStatusEntity.webOrderLineItemId) && m.a(this.transactionId, billingStatusEntity.transactionId) && m.a(this.productId, billingStatusEntity.productId) && m.a(this.purchaseType, billingStatusEntity.purchaseType) && m.a(this.purchaseFrom, billingStatusEntity.purchaseFrom) && m.a(this.expiredDate, billingStatusEntity.expiredDate) && m.a(this.expiredDateMs, billingStatusEntity.expiredDateMs);
    }

    public final String getExpiredDate() {
        return this.expiredDate;
    }

    public final String getExpiredDateMs() {
        return this.expiredDateMs;
    }

    public final long getExpiredDateMsLong() {
        if (this.expiredDateMs.length() == 0) {
            return 0L;
        }
        return Long.parseLong(this.expiredDateMs);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPurchaseFrom() {
        return this.purchaseFrom;
    }

    public final String getPurchaseType() {
        return this.purchaseType;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getWebOrderLineItemId() {
        return this.webOrderLineItemId;
    }

    public int hashCode() {
        return this.expiredDateMs.hashCode() + e.d(e.d(e.d(e.d(e.d(e.d(this.orderId.hashCode() * 31, 31, this.webOrderLineItemId), 31, this.transactionId), 31, this.productId), 31, this.purchaseType), 31, this.purchaseFrom), 31, this.expiredDate);
    }

    public String toString() {
        String str = this.orderId;
        String str2 = this.webOrderLineItemId;
        String str3 = this.transactionId;
        String str4 = this.productId;
        String str5 = this.purchaseType;
        String str6 = this.purchaseFrom;
        String str7 = this.expiredDate;
        String str8 = this.expiredDateMs;
        StringBuilder sbS = e.s("BillingStatusEntity(orderId=", str, ", webOrderLineItemId=", str2, ", transactionId=");
        d.w(sbS, str3, ", productId=", str4, ", purchaseType=");
        d.w(sbS, str5, ", purchaseFrom=", str6, ", expiredDate=");
        return e.p(sbS, str7, ", expiredDateMs=", str8, ")");
    }
}
