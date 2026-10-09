package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_TransportContext extends TransportContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Priority f8006c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends TransportContext.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f8008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Priority f8009c;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext a() {
            String strConcat = this.f8007a == null ? " backendName" : com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
            if (this.f8009c == null) {
                strConcat = strConcat.concat(" priority");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_TransportContext(this.f8007a, this.f8008b, this.f8009c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f8007a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder c(byte[] bArr) {
            this.f8008b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder d(Priority priority) {
            if (priority == null) {
                throw new NullPointerException(SemtNwfPgIhi.sUlIi);
            }
            this.f8009c = priority;
            return this;
        }
    }

    public AutoValue_TransportContext(String str, byte[] bArr, Priority priority) {
        this.f8004a = str;
        this.f8005b = bArr;
        this.f8006c = priority;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final String b() {
        return this.f8004a;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final byte[] c() {
        return this.f8005b;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final Priority d() {
        return this.f8006c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.f8004a.equals(transportContext.b())) {
            return Arrays.equals(this.f8005b, transportContext instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) transportContext).f8005b : transportContext.c()) && this.f8006c.equals(transportContext.d());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8004a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8005b)) * 1000003) ^ this.f8006c.hashCode();
    }
}
