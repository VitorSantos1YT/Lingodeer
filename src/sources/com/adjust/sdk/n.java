package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7362b;

    public /* synthetic */ n(boolean z11, int i11) {
        this.f7361a = i11;
        this.f7362b = z11;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f7361a) {
            case 0:
                activityHandler.tryTrackMeasurementConsentI(this.f7362b);
                break;
            default:
                activityHandler.tryTrackMeasurementConsentI(this.f7362b);
                break;
        }
    }
}
