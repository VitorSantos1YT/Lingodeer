package com.google.android.gms.common.api;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class BatchResult implements Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f8671a;

    public BatchResult(Status status) {
        this.f8671a = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f8671a;
    }
}
