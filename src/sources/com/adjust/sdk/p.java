package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7374d;

    public /* synthetic */ p(ActivityHandler activityHandler, boolean z11, String str, int i11) {
        this.f7371a = i11;
        this.f7372b = activityHandler;
        this.f7373c = z11;
        this.f7374d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7371a) {
            case 0:
                this.f7372b.lambda$setPushToken$33(this.f7373c, this.f7374d);
                break;
            default:
                this.f7372b.lambda$setPushToken$32(this.f7373c, this.f7374d);
                break;
        }
    }
}
