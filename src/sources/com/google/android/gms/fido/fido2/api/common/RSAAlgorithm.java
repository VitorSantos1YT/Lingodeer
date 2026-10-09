package com.google.android.gms.fido.fido2.api.common;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum RSAAlgorithm implements Algorithm {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);

    private final int zzb;

    RSAAlgorithm(int i11) {
        this.zzb = i11;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.Algorithm
    public final int a() {
        return this.zzb;
    }
}
