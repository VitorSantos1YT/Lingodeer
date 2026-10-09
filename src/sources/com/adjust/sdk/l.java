package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustThirdPartySharing f7356b;

    public /* synthetic */ l(AdjustThirdPartySharing adjustThirdPartySharing, int i11) {
        this.f7355a = i11;
        this.f7356b = adjustThirdPartySharing;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f7355a) {
            case 0:
                activityHandler.tryTrackThirdPartySharingI(this.f7356b);
                break;
            default:
                activityHandler.tryTrackThirdPartySharingI(this.f7356b);
                break;
        }
    }
}
