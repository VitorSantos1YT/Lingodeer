package com.google.android.datatransport.cct.internal;

import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_LogResponse extends LogResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7947a;

    public AutoValue_LogResponse(long j11) {
        this.f7947a = j11;
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public final long b() {
        return this.f7947a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.f7947a == ((LogResponse) obj).b();
    }

    public final int hashCode() {
        long j11 = this.f7947a;
        return ((int) ((j11 >>> 32) ^ j11)) ^ 1000003;
    }

    public final String toString() {
        return e.i(this.f7947a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
