package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzzl implements zzsc {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsc
    public final byte[] a(byte[] bArr, int i11) {
        throw new NoSuchMethodError();
    }

    public static zzsc b(zzsa zzsaVar) {
        zzzw zzzwVar = zzsaVar.f10936b;
        zzcw zzcwVar = zzcw.f10287a;
        zzsd zzsdVar = new zzsd(zzzwVar.c(zzcwVar));
        try {
            zzjb.zza zzaVar = zzsf.f10942c;
            Provider providerA = zzng.a();
            if (providerA == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance(tcppUUQxZjFdy.GCE, providerA);
            return new zzzk(zzsdVar, new zzsf(zzzwVar.c(zzcwVar), providerA));
        } catch (GeneralSecurityException unused) {
            return zzsdVar;
        }
    }
}
