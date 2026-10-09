package com.google.android.play.core.integrity;

import com.google.type.bACG.scNRoQgKSYX;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f16123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f16124c = null;

    public /* synthetic */ ao(String str, Long l9, Object obj, an anVar) {
        this.f16122a = str;
        this.f16123b = l9;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f16123b;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final boolean equals(Object obj) {
        boolean z11;
        Long l9;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (!this.f16122a.equals(integrityTokenRequest.nonce()) || ((l9 = this.f16123b) != null ? !l9.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() != null)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if ((obj instanceof ao) && a()) {
            return z11;
        }
        return z11;
    }

    public final int hashCode() {
        int iHashCode = this.f16122a.hashCode() ^ 1000003;
        Long l9 = this.f16123b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l9 == null ? 0 : l9.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f16122a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f16122a + ", cloudProjectNumber=" + this.f16123b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat(scNRoQgKSYX.KYYUHZuy);
    }
}
