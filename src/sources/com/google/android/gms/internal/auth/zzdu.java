package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzdu {
    public static int a(byte[] bArr, int i11, zzdt zzdtVar) throws zzfb {
        int iF = f(bArr, i11, zzdtVar);
        int i12 = zzdtVar.f9472a;
        if (i12 < 0) {
            throw zzfb.b();
        }
        if (i12 > bArr.length - iF) {
            throw zzfb.c();
        }
        if (i12 == 0) {
            zzdtVar.f9474c = zzef.f9482b;
            return iF;
        }
        zzdtVar.f9474c = zzef.l(bArr, iF, i12);
        return iF + i12;
    }

    public static int b(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public static int c(zzgi zzgiVar, byte[] bArr, int i11, int i12, int i13, zzdt zzdtVar) {
        zzev zzevVarZzd = zzgiVar.zzd();
        int iJ = j(zzevVarZzd, zzgiVar, bArr, i11, i12, i13, zzdtVar);
        zzgiVar.a(zzevVarZzd);
        zzdtVar.f9474c = zzevVarZzd;
        return iJ;
    }

    public static int d(zzgi zzgiVar, int i11, byte[] bArr, int i12, int i13, zzez zzezVar, zzdt zzdtVar) throws zzfb {
        zzev zzevVarZzd = zzgiVar.zzd();
        zzgi zzgiVar2 = zzgiVar;
        byte[] bArr2 = bArr;
        int i14 = i13;
        zzdt zzdtVar2 = zzdtVar;
        int iK = k(zzevVarZzd, zzgiVar2, bArr2, i12, i14, zzdtVar2);
        zzgiVar2.a(zzevVarZzd);
        zzdtVar2.f9474c = zzevVarZzd;
        zzezVar.add(zzevVarZzd);
        while (iK < i14) {
            zzdt zzdtVar3 = zzdtVar2;
            int i15 = i14;
            int iF = f(bArr2, iK, zzdtVar3);
            if (i11 != zzdtVar3.f9472a) {
                break;
            }
            byte[] bArr3 = bArr2;
            zzgi zzgiVar3 = zzgiVar2;
            zzev zzevVarZzd2 = zzgiVar3.zzd();
            iK = k(zzevVarZzd2, zzgiVar3, bArr3, iF, i15, zzdtVar3);
            zzgiVar2 = zzgiVar3;
            bArr2 = bArr3;
            i14 = i15;
            zzdtVar2 = zzdtVar3;
            zzgiVar2.a(zzevVarZzd2);
            zzdtVar2.f9474c = zzevVarZzd2;
            zzezVar.add(zzevVarZzd2);
        }
        return iK;
    }

    public static int e(int i11, byte[] bArr, int i12, int i13, zzha zzhaVar, zzdt zzdtVar) throws zzfb {
        if ((i11 >>> 3) == 0) {
            throw new zzfb("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int i15 = i(bArr, i12, zzdtVar);
            zzhaVar.b(i11, Long.valueOf(zzdtVar.f9473b));
            return i15;
        }
        if (i14 == 1) {
            zzhaVar.b(i11, Long.valueOf(l(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int iF = f(bArr, i12, zzdtVar);
            int i16 = zzdtVar.f9472a;
            if (i16 < 0) {
                throw zzfb.b();
            }
            if (i16 > bArr.length - iF) {
                throw zzfb.c();
            }
            if (i16 == 0) {
                zzhaVar.b(i11, zzef.f9482b);
            } else {
                zzhaVar.b(i11, zzef.l(bArr, iF, i16));
            }
            return iF + i16;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new zzfb("Protocol message contained an invalid tag (zero).");
            }
            zzhaVar.b(i11, Integer.valueOf(b(bArr, i12)));
            return i12 + 4;
        }
        int i17 = (i11 & (-8)) | 4;
        zzha zzhaVarA = zzha.a();
        int i18 = 0;
        while (i12 < i13) {
            int iF2 = f(bArr, i12, zzdtVar);
            i18 = zzdtVar.f9472a;
            if (i18 == i17) {
                i12 = iF2;
                break;
            }
            i12 = e(i18, bArr, iF2, i13, zzhaVarA, zzdtVar);
        }
        if (i12 > i13 || i18 != i17) {
            throw new zzfb("Failed to parse the message.");
        }
        zzhaVar.b(i11, zzhaVarA);
        return i12;
    }

    public static int f(byte[] bArr, int i11, zzdt zzdtVar) {
        int i12 = i11 + 1;
        byte b3 = bArr[i11];
        if (b3 < 0) {
            return g(b3, bArr, i12, zzdtVar);
        }
        zzdtVar.f9472a = b3;
        return i12;
    }

    public static int g(int i11, byte[] bArr, int i12, zzdt zzdtVar) {
        byte b3 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b3 >= 0) {
            zzdtVar.f9472a = i14 | (b3 << 7);
            return i13;
        }
        int i15 = i14 | ((b3 & 127) << 7);
        int i16 = i12 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzdtVar.f9472a = i15 | (b11 << 14);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 14);
        int i18 = i12 + 3;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzdtVar.f9472a = i17 | (b12 << 21);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 21);
        int i21 = i12 + 4;
        byte b13 = bArr[i18];
        if (b13 >= 0) {
            zzdtVar.f9472a = i19 | (b13 << 28);
            return i21;
        }
        int i22 = i19 | ((b13 & 127) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzdtVar.f9472a = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    public static int h(int i11, byte[] bArr, int i12, int i13, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iF = f(bArr, i12, zzdtVar);
        zzewVar.b(zzdtVar.f9472a);
        while (iF < i13) {
            int iF2 = f(bArr, iF, zzdtVar);
            if (i11 != zzdtVar.f9472a) {
                break;
            }
            iF = f(bArr, iF2, zzdtVar);
            zzewVar.b(zzdtVar.f9472a);
        }
        return iF;
    }

    public static int i(byte[] bArr, int i11, zzdt zzdtVar) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            zzdtVar.f9473b = j11;
            return i12;
        }
        int i13 = i11 + 2;
        byte b3 = bArr[i12];
        long j12 = (j11 & 127) | (((long) (b3 & 127)) << 7);
        int i14 = 7;
        while (b3 < 0) {
            int i15 = i13 + 1;
            byte b11 = bArr[i13];
            i14 += 7;
            j12 |= ((long) (b11 & 127)) << i14;
            b3 = b11;
            i13 = i15;
        }
        zzdtVar.f9473b = j12;
        return i13;
    }

    public static int j(Object obj, zzgi zzgiVar, byte[] bArr, int i11, int i12, int i13, zzdt zzdtVar) {
        int iM = ((zzga) zzgiVar).m(obj, bArr, i11, i12, i13, zzdtVar);
        zzdtVar.f9474c = obj;
        return iM;
    }

    public static int k(Object obj, zzgi zzgiVar, byte[] bArr, int i11, int i12, zzdt zzdtVar) throws zzfb {
        int iG = i11 + 1;
        int i13 = bArr[i11];
        if (i13 < 0) {
            iG = g(i13, bArr, iG, zzdtVar);
            i13 = zzdtVar.f9472a;
        }
        int i14 = iG;
        if (i13 < 0 || i13 > i12 - i14) {
            throw zzfb.c();
        }
        int i15 = i14 + i13;
        zzgiVar.d(obj, bArr, i14, i15, zzdtVar);
        zzdtVar.f9474c = obj;
        return i15;
    }

    public static long l(byte[] bArr, int i11) {
        return (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }
}
