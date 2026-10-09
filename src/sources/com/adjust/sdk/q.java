package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustEvent f7377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnPurchaseVerificationFinishedListener f7378d;

    public /* synthetic */ q(ActivityHandler activityHandler, AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i11) {
        this.f7375a = i11;
        this.f7376b = activityHandler;
        this.f7377c = adjustEvent;
        this.f7378d = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7375a) {
            case 0:
                this.f7376b.lambda$verifyAndTrackPlayStorePurchase$46(this.f7377c, this.f7378d);
                break;
            default:
                this.f7376b.lambda$verifyAndTrackPlayStorePurchase$47(this.f7377c, this.f7378d);
                break;
        }
    }
}
