package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7370d;

    public /* synthetic */ o(ActivityHandler activityHandler, String str, String str2, int i11) {
        this.f7367a = i11;
        this.f7368b = activityHandler;
        this.f7369c = str;
        this.f7370d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7367a) {
            case 0:
                this.f7368b.lambda$addGlobalPartnerParameter$23(this.f7369c, this.f7370d);
                break;
            default:
                this.f7368b.lambda$addGlobalCallbackParameter$21(this.f7369c, this.f7370d);
                break;
        }
    }
}
