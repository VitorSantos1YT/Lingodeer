package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzach {
    public static int a(byte[] bArr, int i11, zzacg zzacgVar) {
        int i12 = i11 + 1;
        byte b3 = bArr[i11];
        if (b3 < 0) {
            return b(b3, bArr, i12, zzacgVar);
        }
        zzacgVar.f11198a = b3;
        return i12;
    }

    public static int b(int i11, byte[] bArr, int i12, zzacg zzacgVar) {
        byte b3 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b3 >= 0) {
            zzacgVar.f11198a = i14 | (b3 << 7);
            return i13;
        }
        int i15 = i14 | ((b3 & 127) << 7);
        int i16 = i12 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzacgVar.f11198a = i15 | (b11 << 14);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 14);
        int i18 = i12 + 3;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzacgVar.f11198a = i17 | (b12 << 21);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 21);
        int i21 = i12 + 4;
        byte b13 = bArr[i18];
        if (b13 >= 0) {
            zzacgVar.f11198a = i19 | (b13 << 28);
            return i21;
        }
        int i22 = i19 | ((b13 & 127) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzacgVar.f11198a = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    public static int c(byte[] bArr, int i11, zzacg zzacgVar) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            zzacgVar.f11199b = j11;
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
        zzacgVar.f11199b = j12;
        return i13;
    }

    public static int d(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public static long e(byte[] bArr, int i11) {
        return (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }

    public static int f(byte[] bArr, int i11, zzacg zzacgVar) throws zzaeh {
        int iA = a(bArr, i11, zzacgVar);
        int i12 = zzacgVar.f11198a;
        if (i12 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            zzacgVar.f11200c = BuildConfig.VERSION_NAME;
            return iA;
        }
        zzacgVar.f11200c = zzagl.d(bArr, iA, i12);
        return iA + i12;
    }

    public static int g(byte[] bArr, int i11, zzacg zzacgVar) throws zzaeh {
        int iA = a(bArr, i11, zzacgVar);
        int i12 = zzacgVar.f11198a;
        if (i12 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 > bArr.length - iA) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i12 == 0) {
            zzacgVar.f11200c = zzacr.f11213b;
            return iA;
        }
        zzacgVar.f11200c = zzacr.k(bArr, iA, i12);
        return iA + i12;
    }

    public static int h(Object obj, zzafp zzafpVar, byte[] bArr, int i11, int i12, zzacg zzacgVar) throws zzaeh {
        int iB = i11 + 1;
        int i13 = bArr[i11];
        if (i13 < 0) {
            iB = b(i13, bArr, iB, zzacgVar);
            i13 = zzacgVar.f11198a;
        }
        int i14 = iB;
        if (i13 < 0 || i13 > i12 - i14) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = zzacgVar.f11202e + 1;
        zzacgVar.f11202e = i15;
        if (i15 >= 100) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = i14 + i13;
        zzafpVar.f(obj, bArr, i14, i16, zzacgVar);
        zzacgVar.f11202e--;
        zzacgVar.f11200c = obj;
        return i16;
    }

    public static int i(Object obj, zzafp zzafpVar, byte[] bArr, int i11, int i12, int i13, zzacg zzacgVar) throws zzaeh {
        zzaff zzaffVar = (zzaff) zzafpVar;
        int i14 = zzacgVar.f11202e + 1;
        zzacgVar.f11202e = i14;
        if (i14 >= 100) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iX = zzaffVar.x(obj, bArr, i11, i12, i13, zzacgVar);
        zzacgVar.f11202e--;
        zzacgVar.f11200c = obj;
        return iX;
    }

    public static int j(int i11, byte[] bArr, int i12, int i13, zzaef zzaefVar, zzacg zzacgVar) {
        zzadv zzadvVar = (zzadv) zzaefVar;
        int iA = a(bArr, i12, zzacgVar);
        zzadvVar.zzh(zzacgVar.f11198a);
        while (iA < i13) {
            int iA2 = a(bArr, iA, zzacgVar);
            if (i11 != zzacgVar.f11198a) {
                break;
            }
            iA = a(bArr, iA2, zzacgVar);
            zzadvVar.zzh(zzacgVar.f11198a);
        }
        return iA;
    }

    public static int k(byte[] bArr, int i11, zzaef zzaefVar, zzacg zzacgVar) throws zzaeh {
        zzadv zzadvVar = (zzadv) zzaefVar;
        int iA = a(bArr, i11, zzacgVar);
        int i12 = zzacgVar.f11198a + iA;
        while (iA < i12) {
            iA = a(bArr, iA, zzacgVar);
            zzadvVar.zzh(zzacgVar.f11198a);
        }
        if (iA == i12) {
            return iA;
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int l(zzafp zzafpVar, int i11, byte[] bArr, int i12, int i13, zzaef zzaefVar, zzacg zzacgVar) throws zzaeh {
        Object objZza = zzafpVar.zza();
        zzafp zzafpVar2 = zzafpVar;
        byte[] bArr2 = bArr;
        int i14 = i13;
        zzacg zzacgVar2 = zzacgVar;
        int iH = h(objZza, zzafpVar2, bArr2, i12, i14, zzacgVar2);
        zzafpVar2.a(objZza);
        zzacgVar2.f11200c = objZza;
        zzaefVar.add(objZza);
        while (iH < i14) {
            zzacg zzacgVar3 = zzacgVar2;
            int i15 = i14;
            int iA = a(bArr2, iH, zzacgVar3);
            if (i11 != zzacgVar3.f11198a) {
                break;
            }
            byte[] bArr3 = bArr2;
            zzafp zzafpVar3 = zzafpVar2;
            Object objZza2 = zzafpVar3.zza();
            iH = h(objZza2, zzafpVar3, bArr3, iA, i15, zzacgVar3);
            zzafpVar2 = zzafpVar3;
            bArr2 = bArr3;
            i14 = i15;
            zzacgVar2 = zzacgVar3;
            zzafpVar2.a(objZza2);
            zzacgVar2.f11200c = objZza2;
            zzaefVar.add(objZza2);
        }
        return iH;
    }

    public static int n(int i11, byte[] bArr, int i12, int i13, zzacg zzacgVar) throws zzaeh {
        if ((i11 >>> 3) == 0) {
            throw new zzaeh("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return c(bArr, i12, zzacgVar);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return a(bArr, i12, zzacgVar) + zzacgVar.f11198a;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            throw new zzaeh("Protocol message contained an invalid tag (zero).");
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = a(bArr, i12, zzacgVar);
            i16 = zzacgVar.f11198a;
            if (i16 == i15) {
                break;
            }
            i12 = n(i16, bArr, i12, i13, zzacgVar);
        }
        if (i12 > i13 || i16 != i15) {
            throw new zzaeh("Failed to parse the message.");
        }
        return i12;
    }

    public static int m(int i11, byte[] bArr, int i12, int i13, zzaga zzagaVar, zzacg zzacgVar) throws zzaeh {
        if ((i11 >>> 3) == 0) {
            throw new zzaeh("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int iC = c(bArr, i12, zzacgVar);
            zzagaVar.d(i11, Long.valueOf(zzacgVar.f11199b));
            return iC;
        }
        if (i14 == 1) {
            zzagaVar.d(i11, Long.valueOf(e(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int iA = a(bArr, i12, zzacgVar);
            int i15 = zzacgVar.f11198a;
            if (i15 < 0) {
                throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - iA) {
                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                zzagaVar.d(i11, zzacr.f11213b);
            } else {
                zzagaVar.d(i11, zzacr.k(bArr, iA, i15));
            }
            return iA + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new zzaeh("Protocol message contained an invalid tag (zero).");
            }
            zzagaVar.d(i11, Integer.valueOf(d(bArr, i12)));
            return i12 + 4;
        }
        int i16 = (i11 & (-8)) | 4;
        zzaga zzagaVarA = zzaga.a();
        int i17 = zzacgVar.f11202e + 1;
        zzacgVar.f11202e = i17;
        if (i17 >= 100) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i18 = 0;
        while (i12 < i13) {
            int iA2 = a(bArr, i12, zzacgVar);
            int i19 = zzacgVar.f11198a;
            if (i19 == i16) {
                i18 = i19;
                i12 = iA2;
                break;
            }
            i12 = m(i19, bArr, iA2, i13, zzagaVarA, zzacgVar);
            i18 = i19;
        }
        zzacgVar.f11202e--;
        if (i12 > i13 || i18 != i16) {
            throw new zzaeh(EHjhWcesDUIsIw.zfgNNHEKdi);
        }
        zzagaVar.d(i11, zzagaVarA);
        return i12;
    }
}
