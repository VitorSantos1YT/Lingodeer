package com.google.android.datatransport.runtime;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EventInternal {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Builder {
        public final void a(String str, String str2) {
            ((HashMap) c()).put(str, str2);
        }

        public abstract EventInternal b();

        public abstract Map c();

        public abstract Builder d(Integer num);

        public abstract Builder e(EncodedPayload encodedPayload);

        public abstract Builder f(long j11);

        public abstract Builder g(byte[] bArr);

        public abstract Builder h(byte[] bArr);

        public abstract Builder i(Integer num);

        public abstract Builder j(String str);

        public abstract Builder k(String str);

        public abstract Builder l(long j11);
    }

    public static Builder a() {
        AutoValue_EventInternal.Builder builder = new AutoValue_EventInternal.Builder();
        builder.f7989f = new HashMap();
        return builder;
    }

    public final String b(String str) {
        String str2 = (String) c().get(str);
        return str2 == null ? com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME : str2;
    }

    public abstract Map c();

    public abstract Integer d();

    public abstract EncodedPayload e();

    public abstract long f();

    public abstract byte[] g();

    public abstract byte[] h();

    public final int i(String str) {
        String str2 = (String) c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract Integer j();

    public abstract String k();

    public abstract String l();

    public abstract long m();

    public final Builder n() {
        AutoValue_EventInternal.Builder builder = new AutoValue_EventInternal.Builder();
        builder.k(l());
        builder.f7985b = d();
        builder.f7990g = j();
        builder.f7991h = k();
        builder.f7992i = g();
        builder.f7993j = h();
        builder.e(e());
        builder.f(f());
        builder.l(m());
        builder.f7989f = new HashMap(c());
        return builder;
    }
}
