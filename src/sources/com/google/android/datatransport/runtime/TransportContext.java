package com.google.android.datatransport.runtime;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TransportContext {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Builder {
        public abstract TransportContext a();

        public abstract Builder b(String str);

        public abstract Builder c(byte[] bArr);

        public abstract Builder d(Priority priority);
    }

    public static Builder a() {
        AutoValue_TransportContext.Builder builder = new AutoValue_TransportContext.Builder();
        builder.d(Priority.DEFAULT);
        return builder;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract Priority d();

    public final TransportContext e(Priority priority) {
        Builder builderA = a();
        builderA.b(b());
        builderA.d(priority);
        ((AutoValue_TransportContext.Builder) builderA).f8008b = c();
        return builderA.a();
    }

    public final String toString() {
        String strB = b();
        Priority priorityD = d();
        String strEncodeToString = c() == null ? com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME : Base64.encodeToString(c(), 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(strB);
        sb2.append(", ");
        sb2.append(priorityD);
        sb2.append(", ");
        return a.k(sb2, strEncodeToString, ")");
    }
}
