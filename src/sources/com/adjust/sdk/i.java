package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OnIsEnabledListener f7347c;

    public /* synthetic */ i(ActivityHandler activityHandler, OnIsEnabledListener onIsEnabledListener, int i11) {
        this.f7345a = i11;
        this.f7346b = activityHandler;
        this.f7347c = onIsEnabledListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7345a) {
            case 0:
                this.f7346b.lambda$isEnabled$9(this.f7347c);
                break;
            case 1:
                this.f7346b.lambda$isEnabled$11(this.f7347c);
                break;
            default:
                this.f7346b.lambda$isEnabled$10(this.f7347c);
                break;
        }
    }
}
