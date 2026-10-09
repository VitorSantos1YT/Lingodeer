package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustEvent f7336c;

    public /* synthetic */ e(ActivityHandler activityHandler, AdjustEvent adjustEvent, int i11) {
        this.f7334a = i11;
        this.f7335b = activityHandler;
        this.f7336c = adjustEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7334a) {
            case 0:
                this.f7335b.lambda$trackEvent$3(this.f7336c);
                break;
            default:
                this.f7335b.lambda$trackEvent$4(this.f7336c);
                break;
        }
    }
}
