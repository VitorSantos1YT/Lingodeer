package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zabf implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f8772a;

    public zabf(GoogleApiManager googleApiManager) {
        this.f8772a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void a(boolean z11) {
        Boolean boolValueOf = Boolean.valueOf(z11);
        GoogleApiManager googleApiManager = this.f8772a;
        googleApiManager.P.sendMessage(googleApiManager.P.obtainMessage(1, boolValueOf));
    }
}
