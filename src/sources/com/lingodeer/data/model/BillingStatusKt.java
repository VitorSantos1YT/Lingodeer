package com.lingodeer.data.model;

import com.lingodeer.database.model.BillingStatusEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class BillingStatusKt {
    public static final BillingStatusEntity asEntityModel(BillingStatus billingStatus) {
        m.f(billingStatus, "<this>");
        return new BillingStatusEntity(billingStatus.getOrderId(), billingStatus.getWebOrderLineItemId(), billingStatus.getTransactionId(), billingStatus.getProductId(), billingStatus.getPurchaseType(), billingStatus.getPurchaseFrom(), billingStatus.getExpiredDate(), billingStatus.m212getExpiredDateMs());
    }

    public static final BillingStatus asExternalModel(BillingStatusEntity billingStatusEntity) {
        m.f(billingStatusEntity, "<this>");
        String orderId = billingStatusEntity.getOrderId();
        String transactionId = billingStatusEntity.getTransactionId();
        return new BillingStatus(orderId, billingStatusEntity.getWebOrderLineItemId(), transactionId, billingStatusEntity.getOrderId(), billingStatusEntity.getPurchaseType(), billingStatusEntity.getPurchaseFrom(), billingStatusEntity.getExpiredDate(), billingStatusEntity.getExpiredDateMs());
    }
}
