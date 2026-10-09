package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmb implements zzbs {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f10713g = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzmf f10714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzmc f10715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzmd f10716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzlz f10717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f10719f;

    public zzmb(zzmf zzmfVar, zzmc zzmcVar, zzmd zzmdVar, zzlz zzlzVar, int i11, zzzv zzzvVar) {
        this.f10714a = zzmfVar;
        this.f10715b = zzmcVar;
        this.f10716c = zzmdVar;
        this.f10717d = zzlzVar;
        this.f10718e = i11;
        this.f10719f = zzzvVar.b();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArrC;
        byte[] bArr2 = this.f10719f;
        int length = bArr2.length + this.f10718e;
        if (bArr.length < length) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        if (!zzqj.b(bArr2, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f10719f.length, length);
        zzmf zzmfVar = this.f10714a;
        zzmc zzmcVar = this.f10715b;
        zzmd zzmdVar = this.f10716c;
        zzlz zzlzVar = this.f10717d;
        byte[] bArrA = zzmcVar.a(bArrCopyOfRange, zzmfVar);
        byte[] bArr3 = zzml.f10729a;
        zzlw zzlwVar = (zzlw) zzmdVar;
        byte[] bArrD = zzyl.d(zzml.f10741n, zzmcVar.zza(), zzlwVar.e(), zzlzVar.zzc());
        byte[] bArr4 = zzml.f10740l;
        byte[] bArr5 = zzly.f10709d;
        byte[] bArrD2 = zzyl.d(bArr3, zzlwVar.b("psk_id_hash", bArr4, bArr5, bArrD), zzlwVar.b("info_hash", bArr4, new byte[0], bArrD));
        byte[] bArrB = zzlwVar.b("secret", bArrA, bArr5, bArrD);
        byte[] bArrD3 = zzlwVar.d(bArrB, bArrD2, "key", bArrD, zzlzVar.zza());
        byte[] bArrD4 = zzlwVar.d(bArrB, bArrD2, "base_nonce", bArrD, 12);
        BigInteger bigInteger = BigInteger.ONE;
        zzly zzlyVar = new zzly(bArrD3, bArrD4, bigInteger.shiftLeft(96).subtract(bigInteger), zzlzVar);
        byte[] bArr6 = f10713g;
        synchronized (zzlyVar) {
            BigInteger bigInteger2 = zzlyVar.f10712c;
            zzlyVar.f10710a.getClass();
            bArrC = zzyl.c(bArrD4, zznh.c(bigInteger2, 12));
            if (zzlyVar.f10712c.compareTo(zzlyVar.f10711b) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            zzlyVar.f10712c = zzlyVar.f10712c.add(bigInteger);
        }
        return zzlyVar.f10710a.a(bArrD3, bArrC, bArr, length, bArr6);
    }
}
