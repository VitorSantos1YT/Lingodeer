package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7338b;

    public /* synthetic */ f(String str, int i11) {
        this.f7337a = i11;
        this.f7338b = str;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f7337a) {
            case 0:
                activityHandler.removeGlobalPartnerParameterI(this.f7338b);
                break;
            default:
                activityHandler.removeGlobalCallbackParameterI(this.f7338b);
                break;
        }
    }
}
