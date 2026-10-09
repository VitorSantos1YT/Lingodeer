package com.google.android.datatransport.runtime.backends;

import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_BackendResponse extends BackendResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendResponse.Status f8046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8047b;

    public AutoValue_BackendResponse(BackendResponse.Status status, long j11) {
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.f8046a = status;
        this.f8047b = j11;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long b() {
        return this.f8047b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status c() {
        return this.f8046a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f8046a.equals(backendResponse.c()) && this.f8047b == backendResponse.b();
    }

    public final int hashCode() {
        int iHashCode = (this.f8046a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f8047b;
        return iHashCode ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(this.f8046a);
        sb2.append(", nextRequestWaitMillis=");
        return e.i(this.f8047b, "}", sb2);
    }
}
