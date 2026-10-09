package com.google.android.datatransport.cct.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_BatchedLogRequest extends BatchedLogRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7898a;

    public AutoValue_BatchedLogRequest(ArrayList arrayList) {
        this.f7898a = arrayList;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    public final List b() {
        return this.f7898a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.f7898a.equals(((BatchedLogRequest) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f7898a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f7898a + "}";
    }
}
