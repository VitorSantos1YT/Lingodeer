package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzmx implements zzmc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzlw f10750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzms f10751b;

    public zzmx(zzlw zzlwVar) {
        zzms zzmwVar;
        this.f10750a = zzlwVar;
        try {
            zzmwVar = zzmu.b();
        } catch (GeneralSecurityException unused) {
            zzmwVar = new zzmw(0);
        }
        this.f10751b = zzmwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmc
    public final byte[] a(byte[] bArr, zzmf zzmfVar) throws GeneralSecurityException {
        byte[] bArrA = this.f10751b.a(zzmfVar.f10720a.b(), bArr);
        byte[] bArrD = zzyl.d(bArr, zzmfVar.f10721b.b());
        byte[] bArrD2 = zzyl.d(zzml.m, zzml.f10730b);
        zzlw zzlwVar = this.f10750a;
        int macLength = Mac.getInstance(zzlwVar.f10708a).getMacLength();
        byte[] bArr2 = zzml.f10742o;
        Charset charset = zzqj.f10870a;
        return zzlwVar.a(macLength, zzlwVar.c(zzyl.d(bArr2, bArrD2, "eae_prk".getBytes(charset), bArrA), null), zzyl.d(zzml.b(2, macLength), bArr2, bArrD2, "shared_secret".getBytes(charset), bArrD));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmc
    public final byte[] zza() throws GeneralSecurityException {
        if (Arrays.equals(this.f10750a.e(), zzml.f10734f)) {
            return zzml.f10730b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
