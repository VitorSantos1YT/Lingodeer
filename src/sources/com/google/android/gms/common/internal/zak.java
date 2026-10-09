package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.internal.ConnectionCallbacks;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zak implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectionCallbacks f8982a;

    public zak(ConnectionCallbacks connectionCallbacks) {
        this.f8982a = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void g(int i11) {
        this.f8982a.g(i11);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void h() {
        this.f8982a.h();
    }
}
