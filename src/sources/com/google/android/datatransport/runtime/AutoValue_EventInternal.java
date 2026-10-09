package com.google.android.datatransport.runtime;

import defpackage.e;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_EventInternal extends EventInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f7975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EncodedPayload f7976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f7979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f7980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f7982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f7983j;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends EventInternal.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f7985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public EncodedPayload f7986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f7987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f7988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public HashMap f7989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f7990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f7991h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f7992i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f7993j;

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal b() {
            String strM = this.f7984a == null ? " transportName" : com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
            if (this.f7986c == null) {
                strM = strM.concat(" encodedPayload");
            }
            if (this.f7987d == null) {
                strM = e.m(strM, " eventMillis");
            }
            if (this.f7988e == null) {
                strM = e.m(strM, " uptimeMillis");
            }
            if (this.f7989f == null) {
                strM = e.m(strM, " autoMetadata");
            }
            if (strM.isEmpty()) {
                return new AutoValue_EventInternal(this.f7984a, this.f7985b, this.f7986c, this.f7987d.longValue(), this.f7988e.longValue(), this.f7989f, this.f7990g, this.f7991h, this.f7992i, this.f7993j);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM));
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final Map c() {
            HashMap map = this.f7989f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder d(Integer num) {
            this.f7985b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder e(EncodedPayload encodedPayload) {
            if (encodedPayload == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f7986c = encodedPayload;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder f(long j11) {
            this.f7987d = Long.valueOf(j11);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder g(byte[] bArr) {
            this.f7992i = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder h(byte[] bArr) {
            this.f7993j = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder i(Integer num) {
            this.f7990g = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder j(String str) {
            this.f7991h = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder k(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f7984a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder l(long j11) {
            this.f7988e = Long.valueOf(j11);
            return this;
        }
    }

    public AutoValue_EventInternal(String str, Integer num, EncodedPayload encodedPayload, long j11, long j12, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f7974a = str;
        this.f7975b = num;
        this.f7976c = encodedPayload;
        this.f7977d = j11;
        this.f7978e = j12;
        this.f7979f = map;
        this.f7980g = num2;
        this.f7981h = str2;
        this.f7982i = bArr;
        this.f7983j = bArr2;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Map c() {
        return this.f7979f;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Integer d() {
        return this.f7975b;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final EncodedPayload e() {
        return this.f7976c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        if (!this.f7974a.equals(eventInternal.l())) {
            return false;
        }
        Integer num = this.f7975b;
        if (num == null) {
            if (eventInternal.d() != null) {
                return false;
            }
        } else if (!num.equals(eventInternal.d())) {
            return false;
        }
        if (!this.f7976c.equals(eventInternal.e()) || this.f7977d != eventInternal.f() || this.f7978e != eventInternal.m() || !this.f7979f.equals(eventInternal.c())) {
            return false;
        }
        Integer num2 = this.f7980g;
        if (num2 == null) {
            if (eventInternal.j() != null) {
                return false;
            }
        } else if (!num2.equals(eventInternal.j())) {
            return false;
        }
        String str = this.f7981h;
        if (str == null) {
            if (eventInternal.k() != null) {
                return false;
            }
        } else if (!str.equals(eventInternal.k())) {
            return false;
        }
        boolean z11 = eventInternal instanceof AutoValue_EventInternal;
        if (Arrays.equals(this.f7982i, z11 ? ((AutoValue_EventInternal) eventInternal).f7982i : eventInternal.g())) {
            return Arrays.equals(this.f7983j, z11 ? ((AutoValue_EventInternal) eventInternal).f7983j : eventInternal.h());
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long f() {
        return this.f7977d;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final byte[] g() {
        return this.f7982i;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final byte[] h() {
        return this.f7983j;
    }

    public final int hashCode() {
        int iHashCode = (this.f7974a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f7975b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f7976c.hashCode()) * 1000003;
        long j11 = this.f7977d;
        int i11 = (iHashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f7978e;
        int iHashCode3 = (((i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ this.f7979f.hashCode()) * 1000003;
        Integer num2 = this.f7980g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f7981h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f7982i)) * 1000003) ^ Arrays.hashCode(this.f7983j);
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Integer j() {
        return this.f7980g;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final String k() {
        return this.f7981h;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final String l() {
        return this.f7974a;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long m() {
        return this.f7978e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f7974a + ", code=" + this.f7975b + ", encodedPayload=" + this.f7976c + ", eventMillis=" + this.f7977d + ", uptimeMillis=" + this.f7978e + ", autoMetadata=" + this.f7979f + ", productId=" + this.f7980g + ", pseudonymousId=" + this.f7981h + ", experimentIdsClear=" + Arrays.toString(this.f7982i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f7983j) + "}";
    }
}
