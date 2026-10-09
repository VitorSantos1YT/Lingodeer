package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustDeeplink f7359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7360d;

    public /* synthetic */ m(ActivityHandler activityHandler, AdjustDeeplink adjustDeeplink, long j11, int i11) {
        this.f7357a = i11;
        this.f7358b = activityHandler;
        this.f7359c = adjustDeeplink;
        this.f7360d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7357a) {
            case 0:
                this.f7358b.lambda$processDeeplink$13(this.f7359c, this.f7360d);
                break;
            case 1:
                this.f7358b.lambda$processDeeplink$12(this.f7359c, this.f7360d);
                break;
            case 2:
                this.f7358b.lambda$processAndResolveDeeplink$14(this.f7359c, this.f7360d);
                break;
            default:
                this.f7358b.lambda$processAndResolveDeeplink$15(this.f7359c, this.f7360d);
                break;
        }
    }
}
