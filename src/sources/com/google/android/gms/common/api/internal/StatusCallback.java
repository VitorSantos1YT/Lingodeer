package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class StatusCallback extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseImplementation.ResultHolder f8757a;

    public StatusCallback(BaseImplementation.ResultHolder resultHolder) {
        this.f8757a = resultHolder;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void W(Status status) {
        this.f8757a.a(status);
    }
}
