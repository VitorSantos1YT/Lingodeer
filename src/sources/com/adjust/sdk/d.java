package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustAdRevenue f7333c;

    public /* synthetic */ d(ActivityHandler activityHandler, AdjustAdRevenue adjustAdRevenue, int i11) {
        this.f7331a = i11;
        this.f7332b = activityHandler;
        this.f7333c = adjustAdRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7331a) {
            case 0:
                this.f7332b.lambda$trackAdRevenue$41(this.f7333c);
                break;
            default:
                this.f7332b.lambda$trackAdRevenue$40(this.f7333c);
                break;
        }
    }
}
