package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7354c;

    public /* synthetic */ k(String str, String str2, int i11) {
        this.f7352a = i11;
        this.f7353b = str;
        this.f7354c = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f7352a) {
            case 0:
                activityHandler.addGlobalPartnerParameterI(this.f7353b, this.f7354c);
                break;
            default:
                activityHandler.addGlobalCallbackParameterI(this.f7353b, this.f7354c);
                break;
        }
    }
}
