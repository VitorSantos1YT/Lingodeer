package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustPlayStorePurchase f7350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnPurchaseVerificationFinishedListener f7351d;

    public /* synthetic */ j(ActivityHandler activityHandler, AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i11) {
        this.f7348a = i11;
        this.f7349b = activityHandler;
        this.f7350c = adjustPlayStorePurchase;
        this.f7351d = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7348a) {
            case 0:
                this.f7349b.lambda$verifyPlayStorePurchase$44(this.f7350c, this.f7351d);
                break;
            default:
                this.f7349b.lambda$verifyPlayStorePurchase$45(this.f7350c, this.f7351d);
                break;
        }
    }
}
