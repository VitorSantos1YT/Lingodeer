package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final enum zzjc extends zzjb.zza {
    public zzjc() {
        super("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzjb.zza
    public final boolean a() {
        Boolean bool;
        if (!zzjb.a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            zzjb.f10569a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }
}
