package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f10729a = b(1, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f10730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f10731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f10732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f10733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f10734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f10735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f10736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f10737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f10738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f10739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f10740l;
    public static final byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f10741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f10742o;

    static {
        b(1, 2);
        f10730b = b(2, 32);
        f10731c = b(2, 16);
        f10732d = b(2, 17);
        f10733e = b(2, 18);
        f10734f = b(2, 1);
        f10735g = b(2, 2);
        f10736h = b(2, 3);
        f10737i = b(2, 1);
        f10738j = b(2, 2);
        f10739k = b(2, 3);
        f10740l = new byte[0];
        Charset charset = zzqj.f10870a;
        m = "KEM".getBytes(charset);
        f10741n = "HPKE".getBytes(charset);
        f10742o = "HPKE-v1".getBytes(charset);
    }

    public static int a(zzkk.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == zzkk.zzf.f10663f || zzfVar == zzkk.zzf.f10660c) {
            return 32;
        }
        if (zzfVar == zzkk.zzf.f10661d) {
            return 48;
        }
        if (zzfVar == zzkk.zzf.f10662e) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static byte[] b(int i11, int i12) {
        if (i11 > 4 || i11 < 0) {
            throw new IllegalArgumentException("capacity must be between 0 and 4");
        }
        if (i12 < 0 || (i11 < 4 && i12 >= (1 << (i11 << 3)))) {
            throw new IllegalArgumentException("value too large");
        }
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) (i12 >> (((i11 - i13) - 1) * 8));
        }
        return bArr;
    }
}
