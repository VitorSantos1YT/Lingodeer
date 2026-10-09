package com.google.android.gms.internal.p002firebaseauthapi;

import hh.p0;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrz extends zzse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10934a;

    public zzrz(int i11) {
        this.f10934a = i11;
    }

    public static zzrz b(int i11) throws InvalidAlgorithmParameterException {
        if (i11 == 16 || i11 == 32) {
            return new zzrz(i11);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i11 << 3)));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzrz) && ((zzrz) obj).f10934a == this.f10934a;
    }

    public final int hashCode() {
        return Objects.hash(zzrz.class, Integer.valueOf(this.f10934a));
    }

    public final String toString() {
        return p0.h(this.f10934a, "AesCmac PRF Parameters (", "-byte key)");
    }
}
