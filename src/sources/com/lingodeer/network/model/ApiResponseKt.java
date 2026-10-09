package com.lingodeer.network.model;

import com.lingodeer.data.model.BillingStatus;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ApiResponseKt {
    public static final BillingStatus toBillingStatus(SubscriptionResponseDetail subscriptionResponseDetail) {
        m.f(subscriptionResponseDetail, "<this>");
        String orderid = subscriptionResponseDetail.getOrderid();
        String transaction_id = subscriptionResponseDetail.getTransaction_id();
        return new BillingStatus(orderid, subscriptionResponseDetail.getWeb_order_line_item_id(), transaction_id, subscriptionResponseDetail.getProduct_id(), subscriptionResponseDetail.getPurchase_from(), subscriptionResponseDetail.getPurchase_type(), subscriptionResponseDetail.getExpired_date(), subscriptionResponseDetail.getExpired_date_ms());
    }
}
