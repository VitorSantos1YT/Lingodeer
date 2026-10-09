package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustPlayStoreSubscription f7344c;

    public /* synthetic */ h(ActivityHandler activityHandler, AdjustPlayStoreSubscription adjustPlayStoreSubscription, int i11) {
        this.f7342a = i11;
        this.f7343b = activityHandler;
        this.f7344c = adjustPlayStoreSubscription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7342a) {
            case 0:
                this.f7343b.lambda$trackPlayStoreSubscription$42(this.f7344c);
                break;
            default:
                this.f7343b.lambda$trackPlayStoreSubscription$43(this.f7344c);
                break;
        }
    }
}
