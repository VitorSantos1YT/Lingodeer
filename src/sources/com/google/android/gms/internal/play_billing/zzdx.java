package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdx {
    public static int a(byte[] bArr, int i11, zzdw zzdwVar) {
        int iF = f(bArr, i11, zzdwVar);
        int i12 = zzdwVar.f12334a;
        if (i12 < 0) {
            throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 > bArr.length - iF) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i12 == 0) {
            zzdwVar.f12336c = zzei.f12350b;
            return iF;
        }
        zzdwVar.f12336c = zzei.k(bArr, iF, i12);
        return iF + i12;
    }

    public static int b(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public static int c(zzgv zzgvVar, int i11, byte[] bArr, int i12, int i13, zzfn zzfnVar, zzdw zzdwVar) {
        Object objZze = zzgvVar.zze();
        zzgv zzgvVar2 = zzgvVar;
        byte[] bArr2 = bArr;
        int i14 = i13;
        zzdw zzdwVar2 = zzdwVar;
        int iK = k(objZze, zzgvVar2, bArr2, i12, i14, zzdwVar2);
        zzgvVar2.zzf(objZze);
        zzdwVar2.f12336c = objZze;
        zzfnVar.add(objZze);
        while (iK < i14) {
            zzdw zzdwVar3 = zzdwVar2;
            int i15 = i14;
            int iF = f(bArr2, iK, zzdwVar3);
            if (i11 != zzdwVar3.f12334a) {
                break;
            }
            byte[] bArr3 = bArr2;
            zzgv zzgvVar3 = zzgvVar2;
            Object objZze2 = zzgvVar3.zze();
            iK = k(objZze2, zzgvVar3, bArr3, iF, i15, zzdwVar3);
            zzgvVar2 = zzgvVar3;
            bArr2 = bArr3;
            i14 = i15;
            zzdwVar2 = zzdwVar3;
            zzgvVar2.zzf(objZze2);
            zzdwVar2.f12336c = objZze2;
            zzfnVar.add(objZze2);
        }
        return iK;
    }

    public static int d(byte[] bArr, int i11, zzfn zzfnVar, zzdw zzdwVar) {
        zzfj zzfjVar = (zzfj) zzfnVar;
        int iF = f(bArr, i11, zzdwVar);
        int i12 = zzdwVar.f12334a + iF;
        while (iF < i12) {
            iF = f(bArr, iF, zzdwVar);
            zzfjVar.d(zzdwVar.f12334a);
        }
        if (iF == i12) {
            return iF;
        }
        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int e(int i11, byte[] bArr, int i12, int i13, zzhi zzhiVar, zzdw zzdwVar) {
        if ((i11 >>> 3) == 0) {
            throw new zzfq("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int i15 = i(bArr, i12, zzdwVar);
            zzhiVar.c(i11, Long.valueOf(zzdwVar.f12335b));
            return i15;
        }
        if (i14 == 1) {
            zzhiVar.c(i11, Long.valueOf(l(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int iF = f(bArr, i12, zzdwVar);
            int i16 = zzdwVar.f12334a;
            if (i16 < 0) {
                throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i16 > bArr.length - iF) {
                throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i16 == 0) {
                zzhiVar.c(i11, zzei.f12350b);
            } else {
                zzhiVar.c(i11, zzei.k(bArr, iF, i16));
            }
            return iF + i16;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new zzfq("Protocol message contained an invalid tag (zero).");
            }
            zzhiVar.c(i11, Integer.valueOf(b(bArr, i12)));
            return i12 + 4;
        }
        int i17 = (i11 & (-8)) | 4;
        zzhi zzhiVarB = zzhi.b();
        int i18 = zzdwVar.f12338e + 1;
        zzdwVar.f12338e = i18;
        if (i18 >= 100) {
            throw new zzfq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i19 = 0;
        while (i12 < i13) {
            int iF2 = f(bArr, i12, zzdwVar);
            int i21 = zzdwVar.f12334a;
            if (i21 == i17) {
                i19 = i21;
                i12 = iF2;
                break;
            }
            i12 = e(i21, bArr, iF2, i13, zzhiVarB, zzdwVar);
            i19 = i21;
        }
        zzdwVar.f12338e--;
        if (i12 > i13 || i19 != i17) {
            throw new zzfq("Failed to parse the message.");
        }
        zzhiVar.c(i11, zzhiVarB);
        return i12;
    }

    public static int f(byte[] bArr, int i11, zzdw zzdwVar) {
        int i12 = i11 + 1;
        byte b3 = bArr[i11];
        if (b3 < 0) {
            return g(b3, bArr, i12, zzdwVar);
        }
        zzdwVar.f12334a = b3;
        return i12;
    }

    public static int g(int i11, byte[] bArr, int i12, zzdw zzdwVar) {
        byte b3 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b3 >= 0) {
            zzdwVar.f12334a = i14 | (b3 << 7);
            return i13;
        }
        int i15 = i14 | ((b3 & 127) << 7);
        int i16 = i12 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzdwVar.f12334a = i15 | (b11 << 14);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 14);
        int i18 = i12 + 3;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzdwVar.f12334a = i17 | (b12 << 21);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 21);
        int i21 = i12 + 4;
        byte b13 = bArr[i18];
        if (b13 >= 0) {
            zzdwVar.f12334a = i19 | (b13 << 28);
            return i21;
        }
        int i22 = i19 | ((b13 & 127) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzdwVar.f12334a = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    public static int h(int i11, byte[] bArr, int i12, int i13, zzfn zzfnVar, zzdw zzdwVar) {
        zzfj zzfjVar = (zzfj) zzfnVar;
        int iF = f(bArr, i12, zzdwVar);
        zzfjVar.d(zzdwVar.f12334a);
        while (iF < i13) {
            int iF2 = f(bArr, iF, zzdwVar);
            if (i11 != zzdwVar.f12334a) {
                break;
            }
            iF = f(bArr, iF2, zzdwVar);
            zzfjVar.d(zzdwVar.f12334a);
        }
        return iF;
    }

    public static int i(byte[] bArr, int i11, zzdw zzdwVar) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            zzdwVar.f12335b = j11;
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
        zzdwVar.f12335b = j12;
        return i13;
    }

    public static int j(Object obj, zzgv zzgvVar, byte[] bArr, int i11, int i12, int i13, zzdw zzdwVar) {
        zzgo zzgoVar = (zzgo) zzgvVar;
        int i14 = zzdwVar.f12338e + 1;
        zzdwVar.f12338e = i14;
        if (i14 >= 100) {
            throw new zzfq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iQ = zzgoVar.q(obj, bArr, i11, i12, i13, zzdwVar);
        zzdwVar.f12338e--;
        zzdwVar.f12336c = obj;
        return iQ;
    }

    public static int k(Object obj, zzgv zzgvVar, byte[] bArr, int i11, int i12, zzdw zzdwVar) {
        int iG = i11 + 1;
        int i13 = bArr[i11];
        if (i13 < 0) {
            iG = g(i13, bArr, iG, zzdwVar);
            i13 = zzdwVar.f12334a;
        }
        int i14 = iG;
        if (i13 < 0 || i13 > i12 - i14) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = zzdwVar.f12338e + 1;
        zzdwVar.f12338e = i15;
        if (i15 >= 100) {
            throw new zzfq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = i14 + i13;
        zzgvVar.e(obj, bArr, i14, i16, zzdwVar);
        zzdwVar.f12338e--;
        zzdwVar.f12336c = obj;
        return i16;
    }

    public static long l(byte[] bArr, int i11) {
        return (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }
}
