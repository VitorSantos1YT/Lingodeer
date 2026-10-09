package io.grpc.okhttp.internal;

import hh.p0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f34509e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f34511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f34512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34513d;

    static {
        a[] aVarArr = {a.TLS_AES_128_GCM_SHA256, a.TLS_AES_256_GCM_SHA384, a.TLS_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_AES_128_GCM_SHA256, a.TLS_RSA_WITH_AES_256_GCM_SHA384, a.TLS_RSA_WITH_AES_128_CBC_SHA, a.TLS_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        b bVar = new b(true);
        bVar.a(aVarArr);
        m mVar = m.TLS_1_3;
        m mVar2 = m.TLS_1_2;
        bVar.b(mVar, mVar2);
        bVar.f34508d = true;
        c cVar = new c(bVar);
        f34509e = cVar;
        m[] mVarArr = {mVar, mVar2, m.TLS_1_1, m.TLS_1_0};
        boolean z11 = cVar.f34510a;
        if (!z11) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (mVarArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String[] strArr = new String[mVarArr.length];
        for (int i11 = 0; i11 < mVarArr.length; i11++) {
            strArr[i11] = mVarArr[i11].javaName;
        }
        if (!z11) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
    }

    public c(b bVar) {
        this.f34510a = bVar.f34505a;
        this.f34511b = bVar.f34506b;
        this.f34512c = bVar.f34507c;
        this.f34513d = bVar.f34508d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        boolean z11 = cVar.f34510a;
        boolean z12 = this.f34510a;
        if (z12 != z11) {
            return false;
        }
        if (z12) {
            return Arrays.equals(this.f34511b, cVar.f34511b) && Arrays.equals(this.f34512c, cVar.f34512c) && this.f34513d == cVar.f34513d;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f34510a) {
            return ((((527 + Arrays.hashCode(this.f34511b)) * 31) + Arrays.hashCode(this.f34512c)) * 31) + (!this.f34513d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        m mVar;
        if (!this.f34510a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f34511b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            a[] aVarArr = new a[strArr.length];
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str = strArr[i11];
                aVarArr[i11] = str.startsWith("SSL_") ? a.valueOf("TLS_" + str.substring(4)) : a.valueOf(str);
            }
            String[] strArr2 = n.f34539a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) aVarArr.clone()));
        }
        StringBuilder sbQ = p0.q("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.f34512c;
        m[] mVarArr = new m[strArr3.length];
        for (int i12 = 0; i12 < strArr3.length; i12++) {
            String str2 = strArr3[i12];
            if ("TLSv1.3".equals(str2)) {
                mVar = m.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                mVar = m.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                mVar = m.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                mVar = m.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(ep.a.e("Unexpected TLS version: ", str2));
                }
                mVar = m.SSL_3_0;
            }
            mVarArr[i12] = mVar;
        }
        String[] strArr4 = n.f34539a;
        sbQ.append(Collections.unmodifiableList(Arrays.asList((Object[]) mVarArr.clone())));
        sbQ.append(", supportsTlsExtensions=");
        return p0.p(sbQ, this.f34513d, ")");
    }
}
