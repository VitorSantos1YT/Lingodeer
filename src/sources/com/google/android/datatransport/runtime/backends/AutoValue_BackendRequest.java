package com.google.android.datatransport.runtime.backends;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_BackendRequest extends BackendRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f8042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8043b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends BackendRequest.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f8044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f8045b;

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest a() {
            String str = this.f8044a == null ? " events" : BuildConfig.VERSION_NAME;
            if (str.isEmpty()) {
                return new AutoValue_BackendRequest(this.f8044a, this.f8045b);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest.Builder b(ArrayList arrayList) {
            this.f8044a = arrayList;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest.Builder c(byte[] bArr) {
            this.f8045b = bArr;
            return this;
        }
    }

    public AutoValue_BackendRequest(ArrayList arrayList, byte[] bArr) {
        this.f8042a = arrayList;
        this.f8043b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public final Iterable b() {
        return this.f8042a;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public final byte[] c() {
        return this.f8043b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRequest)) {
            return false;
        }
        BackendRequest backendRequest = (BackendRequest) obj;
        if (this.f8042a.equals(backendRequest.b())) {
            return Arrays.equals(this.f8043b, backendRequest instanceof AutoValue_BackendRequest ? ((AutoValue_BackendRequest) backendRequest).f8043b : backendRequest.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8042a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8043b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f8042a + ", extras=" + Arrays.toString(this.f8043b) + "}";
    }
}
