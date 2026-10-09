package com.android.billingclient.api;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbq implements e, q, r {
    public static native void nativeOnAcknowledgePurchaseResponse(int i11, String str, long j11);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i11, String str, long j11);

    public static native void nativeOnConsumePurchaseResponse(int i11, String str, String str2, long j11);

    public static native void nativeOnPriceChangeConfirmationResult(int i11, String str, long j11);

    public static native void nativeOnPurchaseHistoryResponse(int i11, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j11);

    public static native void nativeOnPurchasesUpdated(int i11, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i11, String str, Purchase[] purchaseArr, long j11);

    public static native void nativeOnSkuDetailsResponse(int i11, String str, SkuDetails[] skuDetailsArr, long j11);

    @Override // com.android.billingclient.api.q
    public final void a(j jVar, List list) {
        nativeOnQueryPurchasesResponse(jVar.f7519a, jVar.f7521c, (Purchase[]) list.toArray(new Purchase[list.size()]), 0L);
    }

    @Override // com.android.billingclient.api.e
    public final void b(j jVar) {
        nativeOnBillingSetupFinished(jVar.f7519a, jVar.f7521c, 0L);
    }

    @Override // com.android.billingclient.api.e
    public final void c() {
        nativeOnBillingServiceDisconnected();
    }

    @Override // com.android.billingclient.api.r
    public final void d(j jVar, List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        nativeOnPurchasesUpdated(jVar.f7519a, jVar.f7521c, (Purchase[]) list.toArray(new Purchase[list.size()]));
    }
}
