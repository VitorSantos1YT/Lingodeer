package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzhn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzhm f9576a;

    static {
        if (zzhj.f9574e && zzhj.f9573d) {
            int i11 = zzds.f9471a;
        }
        f9576a = new zzhm();
    }

    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i11, int i12) {
        int i13 = i12 - i11;
        byte b3 = bArr[i11 - 1];
        if (i13 == 0) {
            if (b3 > -12) {
                return -1;
            }
            return b3;
        }
        if (i13 == 1) {
            byte b11 = bArr[i11];
            if (b3 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b3;
        }
        if (i13 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i11];
        byte b13 = bArr[i11 + 1];
        if (b3 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b3);
    }
}
