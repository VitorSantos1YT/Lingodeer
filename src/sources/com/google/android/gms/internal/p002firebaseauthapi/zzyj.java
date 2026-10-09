package com.google.android.gms.internal.p002firebaseauthapi;

import hh.p0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyj implements zzbp, zzkc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzjb.zza f11015d = zzjb.zza.zza;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f11016e = new byte[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f11017f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f11018g = new zzyi();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzsc f11019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11021c;

    public zzyj(byte[] bArr, zzzv zzzvVar) throws GeneralSecurityException {
        if (!f11015d.a()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (bArr.length != 32 && bArr.length != 64) {
            throw new InvalidKeyException(p0.h(bArr.length, "invalid key size: ", " bytes; key must have 32 or 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f11020b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f11019a = zzzl.b(zzsa.d(zzrz.b(bArrCopyOfRange.length), zzzw.b(bArrCopyOfRange, zzcw.f10287a)));
        this.f11021c = zzzvVar.b();
    }
}
