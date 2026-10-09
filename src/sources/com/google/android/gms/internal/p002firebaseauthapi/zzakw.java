package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzakw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f10134a;

    static {
        byte[] bArr = new byte[0];
        f10134a = bArr;
        ByteBuffer.wrap(bArr);
        zzajq.d(bArr, 0, 0);
    }

    public static int a(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    public static int b(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    public static void c() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
