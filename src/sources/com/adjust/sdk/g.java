package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7341c;

    public /* synthetic */ g(ActivityHandler activityHandler, String str, int i11) {
        this.f7339a = i11;
        this.f7340b = activityHandler;
        this.f7341c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7339a) {
            case 0:
                this.f7340b.lambda$setExternalDeviceIdInDelay$51(this.f7341c);
                break;
            case 1:
                this.f7340b.lambda$removeGlobalPartnerParameter$27(this.f7341c);
                break;
            default:
                this.f7340b.lambda$removeGlobalCallbackParameter$25(this.f7341c);
                break;
        }
    }
}
