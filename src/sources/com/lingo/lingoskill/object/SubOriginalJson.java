package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SubOriginalJson {
    private boolean autoRenewing;
    private String orderId;
    private String packageName;
    private String productId;
    private int purchaseState;
    private long purchaseTime;
    private String purchaseToken;

    public String getOrderId() {
        return this.orderId;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getProductId() {
        return this.productId;
    }

    public int getPurchaseState() {
        return this.purchaseState;
    }

    public long getPurchaseTime() {
        return this.purchaseTime;
    }

    public String getPurchaseToken() {
        return this.purchaseToken;
    }

    public boolean isAutoRenewing() {
        return this.autoRenewing;
    }

    public void setAutoRenewing(boolean z11) {
        this.autoRenewing = z11;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setPurchaseState(int i11) {
        this.purchaseState = i11;
    }

    public void setPurchaseTime(long j11) {
        this.purchaseTime = j11;
    }

    public void setPurchaseToken(String str) {
        this.purchaseToken = str;
    }
}
