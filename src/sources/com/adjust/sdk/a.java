package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7326b;

    public /* synthetic */ a(ActivityHandler activityHandler, int i11) {
        this.f7325a = i11;
        this.f7326b = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7325a) {
            case 0:
                this.f7326b.lambda$sendPreinstallReferrer$19();
                break;
            case 1:
                this.f7326b.lambda$removeGlobalPartnerParameters$31();
                break;
            case 2:
                this.f7326b.lambda$endFirstSessionDelay$48();
                break;
            case 3:
                this.f7326b.lambda$sendPreinstallReferrer$18();
                break;
            case 4:
                this.f7326b.lambda$sendReftagReferrer$17();
                break;
            case 5:
                this.f7326b.lambda$removeGlobalCallbackParameters$29();
                break;
            case 6:
                this.f7326b.lambda$gdprForgetMe$34();
                break;
            case 7:
                this.f7326b.lambda$gdprForgetMe$35();
                break;
            default:
                this.f7326b.lambda$sendReftagReferrer$16();
                break;
        }
    }
}
