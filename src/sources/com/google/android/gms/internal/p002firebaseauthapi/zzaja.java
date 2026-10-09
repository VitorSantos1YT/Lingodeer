package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaja {
    public static int a(int i11, byte[] bArr, int i12, int i13, zzajd zzajdVar) throws zzale {
        if ((i11 >>> 3) == 0) {
            throw zzale.b();
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return k(bArr, i12, zzajdVar);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return j(bArr, i12, zzajdVar) + zzajdVar.f10061a;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            throw zzale.b();
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = j(bArr, i12, zzajdVar);
            i16 = zzajdVar.f10061a;
            if (i16 == i15) {
                break;
            }
            i12 = a(i16, bArr, i12, i13, zzajdVar);
        }
        if (i12 > i13 || i16 != i15) {
            throw zzale.f();
        }
        return i12;
    }

    public static int b(int i11, byte[] bArr, int i12, int i13, zzalb zzalbVar, zzajd zzajdVar) {
        zzakx zzakxVar = (zzakx) zzalbVar;
        int iJ = j(bArr, i12, zzajdVar);
        zzakxVar.d(zzajdVar.f10061a);
        while (iJ < i13) {
            int iJ2 = j(bArr, iJ, zzajdVar);
            if (i11 != zzajdVar.f10061a) {
                break;
            }
            iJ = j(bArr, iJ2, zzajdVar);
            zzakxVar.d(zzajdVar.f10061a);
        }
        return iJ;
    }

    public static int c(int i11, byte[] bArr, int i12, int i13, zzani zzaniVar, zzajd zzajdVar) throws zzale {
        if ((i11 >>> 3) == 0) {
            throw zzale.b();
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int iK = k(bArr, i12, zzajdVar);
            zzaniVar.c(i11, Long.valueOf(zzajdVar.f10062b));
            return iK;
        }
        if (i14 == 1) {
            zzaniVar.c(i11, Long.valueOf(l(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int iJ = j(bArr, i12, zzajdVar);
            int i15 = zzajdVar.f10061a;
            if (i15 < 0) {
                throw zzale.e();
            }
            if (i15 > bArr.length - iJ) {
                throw zzale.g();
            }
            if (i15 == 0) {
                zzaniVar.c(i11, zzaje.f10066b);
            } else {
                zzaniVar.c(i11, zzaje.g(bArr, iJ, i15));
            }
            return iJ + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw zzale.b();
            }
            zzaniVar.c(i11, Integer.valueOf(i(bArr, i12)));
            return i12 + 4;
        }
        zzani zzaniVarE = zzani.e();
        int i16 = (i11 & (-8)) | 4;
        int i17 = zzajdVar.f10065e + 1;
        zzajdVar.f10065e = i17;
        if (i17 >= 100) {
            throw new zzale("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i18 = 0;
        while (i12 < i13) {
            int iJ2 = j(bArr, i12, zzajdVar);
            i18 = zzajdVar.f10061a;
            if (i18 == i16) {
                i12 = iJ2;
                break;
            }
            i12 = c(i18, bArr, iJ2, i13, zzaniVarE, zzajdVar);
        }
        zzajdVar.f10065e--;
        if (i12 > i13 || i18 != i16) {
            throw zzale.f();
        }
        zzaniVar.c(i11, zzaniVarE);
        return i12;
    }

    public static int d(int i11, byte[] bArr, int i12, zzajd zzajdVar) {
        int i13 = i11 & 127;
        int i14 = i12 + 1;
        byte b3 = bArr[i12];
        if (b3 >= 0) {
            zzajdVar.f10061a = i13 | (b3 << 7);
            return i14;
        }
        int i15 = i13 | ((b3 & 127) << 7);
        int i16 = i12 + 2;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzajdVar.f10061a = i15 | (b11 << 14);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 14);
        int i18 = i12 + 3;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzajdVar.f10061a = i17 | (b12 << 21);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 21);
        int i21 = i12 + 4;
        byte b13 = bArr[i18];
        if (b13 >= 0) {
            zzajdVar.f10061a = i19 | (b13 << 28);
            return i21;
        }
        int i22 = i19 | ((b13 & 127) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzajdVar.f10061a = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    public static int e(Object obj, zzamr zzamrVar, byte[] bArr, int i11, int i12, int i13, zzajd zzajdVar) throws zzale {
        zzamc zzamcVar = (zzamc) zzamrVar;
        int i14 = zzajdVar.f10065e + 1;
        zzajdVar.f10065e = i14;
        if (i14 >= 100) {
            throw new zzale("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iK = zzamcVar.k(obj, bArr, i11, i12, i13, zzajdVar);
        zzajdVar.f10065e--;
        zzajdVar.f10063c = obj;
        return iK;
    }

    public static int f(Object obj, zzamr zzamrVar, byte[] bArr, int i11, int i12, zzajd zzajdVar) throws zzale {
        int iD = i11 + 1;
        int i13 = bArr[i11];
        if (i13 < 0) {
            iD = d(i13, bArr, iD, zzajdVar);
            i13 = zzajdVar.f10061a;
        }
        int i14 = iD;
        if (i13 < 0 || i13 > i12 - i14) {
            throw zzale.g();
        }
        int i15 = zzajdVar.f10065e + 1;
        zzajdVar.f10065e = i15;
        if (i15 >= 100) {
            throw new zzale("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = i14 + i13;
        zzamrVar.d(obj, bArr, i14, i16, zzajdVar);
        zzajdVar.f10065e--;
        zzajdVar.f10063c = obj;
        return i16;
    }

    public static int g(byte[] bArr, int i11, zzajd zzajdVar) throws zzale {
        int iJ = j(bArr, i11, zzajdVar);
        int i12 = zzajdVar.f10061a;
        if (i12 < 0) {
            throw zzale.e();
        }
        if (i12 > bArr.length - iJ) {
            throw zzale.g();
        }
        if (i12 == 0) {
            zzajdVar.f10063c = zzaje.f10066b;
            return iJ;
        }
        zzajdVar.f10063c = zzaje.g(bArr, iJ, i12);
        return iJ + i12;
    }

    public static int h(zzamr zzamrVar, int i11, byte[] bArr, int i12, int i13, zzalb zzalbVar, zzajd zzajdVar) throws zzale {
        Object objZza = zzamrVar.zza();
        zzamr zzamrVar2 = zzamrVar;
        byte[] bArr2 = bArr;
        int i14 = i13;
        zzajd zzajdVar2 = zzajdVar;
        int iF = f(objZza, zzamrVar2, bArr2, i12, i14, zzajdVar2);
        zzamrVar2.c(objZza);
        zzajdVar2.f10063c = objZza;
        zzalbVar.add(objZza);
        while (iF < i14) {
            zzajd zzajdVar3 = zzajdVar2;
            int i15 = i14;
            int iJ = j(bArr2, iF, zzajdVar3);
            if (i11 != zzajdVar3.f10061a) {
                break;
            }
            byte[] bArr3 = bArr2;
            zzamr zzamrVar3 = zzamrVar2;
            Object objZza2 = zzamrVar3.zza();
            iF = f(objZza2, zzamrVar3, bArr3, iJ, i15, zzajdVar3);
            zzamrVar2 = zzamrVar3;
            bArr2 = bArr3;
            i14 = i15;
            zzajdVar2 = zzajdVar3;
            zzamrVar2.c(objZza2);
            zzajdVar2.f10063c = objZza2;
            zzalbVar.add(objZza2);
        }
        return iF;
    }

    public static int i(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public static int j(byte[] bArr, int i11, zzajd zzajdVar) {
        int i12 = i11 + 1;
        byte b3 = bArr[i11];
        if (b3 < 0) {
            return d(b3, bArr, i12, zzajdVar);
        }
        zzajdVar.f10061a = b3;
        return i12;
    }

    public static int k(byte[] bArr, int i11, zzajd zzajdVar) {
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        if (j11 >= 0) {
            zzajdVar.f10062b = j11;
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
        zzajdVar.f10062b = j12;
        return i13;
    }

    public static long l(byte[] bArr, int i11) {
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }
}
