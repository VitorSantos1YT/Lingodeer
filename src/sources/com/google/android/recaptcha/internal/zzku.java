package com.google.android.recaptcha.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzku {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i11, zzkt zzktVar) throws zznn {
        int iZzi = zzi(bArr, i11, zzktVar);
        int i12 = zzktVar.zza;
        if (i12 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 > bArr.length - iZzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i12 == 0) {
            zzktVar.zzc = zzle.zzb;
            return iZzi;
        }
        zzktVar.zzc = zzle.zzk(bArr, iZzi, i12);
        return iZzi + i12;
    }

    public static int zzb(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public static int zzc(zzow zzowVar, byte[] bArr, int i11, int i12, int i13, zzkt zzktVar) throws zznn {
        Object objZze = zzowVar.zze();
        int iZzm = zzm(objZze, zzowVar, bArr, i11, i12, i13, zzktVar);
        zzowVar.zzf(objZze);
        zzktVar.zzc = objZze;
        return iZzm;
    }

    public static int zzd(zzow zzowVar, byte[] bArr, int i11, int i12, zzkt zzktVar) throws zznn {
        Object objZze = zzowVar.zze();
        int iZzn = zzn(objZze, zzowVar, bArr, i11, i12, zzktVar);
        zzowVar.zzf(objZze);
        zzktVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzow zzowVar, int i11, byte[] bArr, int i12, int i13, zznk zznkVar, zzkt zzktVar) throws zznn {
        int iZzd = zzd(zzowVar, bArr, i12, i13, zzktVar);
        zznkVar.add(zzktVar.zzc);
        while (iZzd < i13) {
            int iZzi = zzi(bArr, iZzd, zzktVar);
            if (i11 != zzktVar.zza) {
                break;
            }
            iZzd = zzd(zzowVar, bArr, iZzi, i13, zzktVar);
            zznkVar.add(zzktVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i11, zznk zznkVar, zzkt zzktVar) throws zznn {
        zzne zzneVar = (zzne) zznkVar;
        int iZzi = zzi(bArr, i11, zzktVar);
        int i12 = zzktVar.zza + iZzi;
        while (iZzi < i12) {
            iZzi = zzi(bArr, iZzi, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        if (iZzi == i12) {
            return iZzi;
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(byte[] bArr, int i11, zzkt zzktVar) throws zznn {
        int iZzi = zzi(bArr, i11, zzktVar);
        int i12 = zzktVar.zza;
        if (i12 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            zzktVar.zzc = BuildConfig.VERSION_NAME;
            return iZzi;
        }
        zzktVar.zzc = new String(bArr, iZzi, i12, zznl.zza);
        return iZzi + i12;
    }

    public static int zzh(int i11, byte[] bArr, int i12, int i13, zzpm zzpmVar, zzkt zzktVar) throws zznn {
        if ((i11 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int iZzl = zzl(bArr, i12, zzktVar);
            zzpmVar.zzj(i11, Long.valueOf(zzktVar.zzb));
            return iZzl;
        }
        if (i14 == 1) {
            zzpmVar.zzj(i11, Long.valueOf(zzp(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int iZzi = zzi(bArr, i12, zzktVar);
            int i15 = zzktVar.zza;
            if (i15 < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - iZzi) {
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                zzpmVar.zzj(i11, zzle.zzb);
            } else {
                zzpmVar.zzj(i11, zzle.zzk(bArr, iZzi, i15));
            }
            return iZzi + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new zznn("Protocol message contained an invalid tag (zero).");
            }
            zzpmVar.zzj(i11, Integer.valueOf(zzb(bArr, i12)));
            return i12 + 4;
        }
        int i16 = (i11 & (-8)) | 4;
        zzpm zzpmVarZzf = zzpm.zzf();
        int i17 = zzktVar.zze + 1;
        zzktVar.zze = i17;
        zzq(i17);
        int i18 = 0;
        while (i12 < i13) {
            int iZzi2 = zzi(bArr, i12, zzktVar);
            int i19 = zzktVar.zza;
            if (i19 == i16) {
                i18 = i19;
                i12 = iZzi2;
                break;
            }
            i12 = zzh(i19, bArr, iZzi2, i13, zzpmVarZzf, zzktVar);
            i18 = i19;
        }
        zzktVar.zze--;
        if (i12 > i13 || i18 != i16) {
            throw new zznn("Failed to parse the message.");
        }
        zzpmVar.zzj(i11, zzpmVarZzf);
        return i12;
    }

    public static int zzi(byte[] bArr, int i11, zzkt zzktVar) {
        int i12 = i11 + 1;
        byte b3 = bArr[i11];
        if (b3 < 0) {
            return zzj(b3, bArr, i12, zzktVar);
        }
        zzktVar.zza = b3;
        return i12;
    }

    public static int zzj(int i11, byte[] bArr, int i12, zzkt zzktVar) {
        byte b3 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b3 >= 0) {
            zzktVar.zza = i14 | (b3 << 7);
            return i13;
        }
        int i15 = i14 | ((b3 & 127) << 7);
        int i16 = i12 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzktVar.zza = i15 | (b11 << 14);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 14);
        int i18 = i12 + 3;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzktVar.zza = i17 | (b12 << 21);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 21);
        int i21 = i12 + 4;
        byte b13 = bArr[i18];
        if (b13 >= 0) {
            zzktVar.zza = i19 | (b13 << 28);
            return i21;
        }
        int i22 = i19 | ((b13 & 127) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzktVar.zza = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    public static int zzk(int i11, byte[] bArr, int i12, int i13, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int iZzi = zzi(bArr, i12, zzktVar);
        zzneVar.zzh(zzktVar.zza);
        while (iZzi < i13) {
            int iZzi2 = zzi(bArr, iZzi, zzktVar);
            if (i11 != zzktVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        return iZzi;
    }

    public static int zzl(byte[] bArr, int i11, zzkt zzktVar) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            zzktVar.zzb = j11;
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
        zzktVar.zzb = j12;
        return i13;
    }

    public static int zzm(Object obj, zzow zzowVar, byte[] bArr, int i11, int i12, int i13, zzkt zzktVar) throws zznn {
        int i14 = zzktVar.zze + 1;
        zzktVar.zze = i14;
        zzq(i14);
        int iZzc = ((zzol) zzowVar).zzc(obj, bArr, i11, i12, i13, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return iZzc;
    }

    public static int zzn(Object obj, zzow zzowVar, byte[] bArr, int i11, int i12, zzkt zzktVar) throws zznn {
        int iZzj = i11 + 1;
        int i13 = bArr[i11];
        if (i13 < 0) {
            iZzj = zzj(i13, bArr, iZzj, zzktVar);
            i13 = zzktVar.zza;
        }
        int i14 = iZzj;
        if (i13 < 0 || i13 > i12 - i14) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = zzktVar.zze + 1;
        zzktVar.zze = i15;
        zzq(i15);
        int i16 = i14 + i13;
        zzowVar.zzi(obj, bArr, i14, i16, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return i16;
    }

    public static int zzo(int i11, byte[] bArr, int i12, int i13, zzkt zzktVar) throws zznn {
        if ((i11 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return zzl(bArr, i12, zzktVar);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return zzi(bArr, i12, zzktVar) + zzktVar.zza;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = zzi(bArr, i12, zzktVar);
            i16 = zzktVar.zza;
            if (i16 == i15) {
                break;
            }
            i12 = zzo(i16, bArr, i12, i13, zzktVar);
        }
        if (i12 > i13 || i16 != i15) {
            throw new zznn("Failed to parse the message.");
        }
        return i12;
    }

    public static long zzp(byte[] bArr, int i11) {
        return (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }

    private static void zzq(int i11) throws zznn {
        if (i11 >= zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
