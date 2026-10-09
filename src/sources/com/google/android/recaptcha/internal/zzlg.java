package com.google.android.recaptcha.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlg extends zzli {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzlg(InputStream inputStream, int i11, zzlh zzlhVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        byte[] bArr = zznl.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzJ(int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i11 > 0) {
            int iMin = Math.min(i11, 4096);
            byte[] bArr = new byte[iMin];
            int i12 = 0;
            while (i12 < iMin) {
                int i13 = this.zze.read(bArr, i12, iMin - i12);
                if (i13 == -1) {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i13;
                i12 += i13;
            }
            i11 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzK() {
        int i11 = this.zzg + this.zzh;
        this.zzg = i11;
        int i12 = this.zzk + i11;
        int i13 = this.zzl;
        if (i12 <= i13) {
            this.zzh = 0;
            return;
        }
        int i14 = i12 - i13;
        this.zzh = i14;
        this.zzg = i11 - i14;
    }

    private final void zzL(int i11) throws zznn {
        if (zzM(i11)) {
            return;
        }
        if (i11 <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean zzM(int i11) throws IOException {
        int i12 = this.zzi;
        int i13 = i12 + i11;
        int i14 = this.zzg;
        if (i13 <= i14) {
            throw new IllegalStateException(p0.h(i11, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i15 = this.zzk;
        if (i11 > (Integer.MAX_VALUE - i15) - i12 || i15 + i12 + i11 > this.zzl) {
            return false;
        }
        if (i12 > 0) {
            if (i14 > i12) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
            }
            i15 = this.zzk + i12;
            this.zzk = i15;
            i14 = this.zzg - i12;
            this.zzg = i14;
            this.zzi = 0;
        }
        try {
            int i16 = this.zze.read(this.zzf, i14, Math.min(4096 - i14, (Integer.MAX_VALUE - i15) - i14));
            if (i16 == 0 || i16 < -1 || i16 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
            }
            if (i16 <= 0) {
                return false;
            }
            this.zzg += i16;
            zzK();
            if (this.zzg >= i11) {
                return true;
            }
            return zzM(i11);
        } catch (zznn e8) {
            e8.zza();
            throw e8;
        }
    }

    private final byte[] zzN(int i11, boolean z11) throws IOException {
        byte[] bArrZzO = zzO(i11);
        if (bArrZzO != null) {
            return bArrZzO;
        }
        int i12 = this.zzi;
        int i13 = this.zzg;
        int i14 = i13 - i12;
        this.zzk += i13;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzJ = zzJ(i11 - i14);
        byte[] bArr = new byte[i11];
        System.arraycopy(this.zzf, i12, bArr, 0, i14);
        for (byte[] bArr2 : listZzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        return bArr;
    }

    private final byte[] zzO(int i11) throws IOException {
        if (i11 == 0) {
            return zznl.zzb;
        }
        int i12 = this.zzk;
        int i13 = this.zzi;
        int i14 = i12 + i13 + i11;
        if ((-2147483647) + i14 > 0) {
            throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i15 = this.zzl;
        if (i14 > i15) {
            zzB((i15 - i12) - i13);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i16 = this.zzg - i13;
        int i17 = i11 - i16;
        if (i17 >= 4096) {
            try {
                if (i17 > this.zze.available()) {
                    return null;
                }
            } catch (zznn e8) {
                e8.zza();
                throw e8;
            }
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i16);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i16 < i11) {
            try {
                int i18 = this.zze.read(bArr, i16, i11 - i16);
                if (i18 == -1) {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i18;
                i16 += i18;
            } catch (zznn e10) {
                e10.zza();
                throw e10;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzA(int i11) {
        this.zzl = i11;
        zzK();
    }

    public final void zzB(int i11) throws zznn {
        int i12 = this.zzg;
        int i13 = this.zzi;
        int i14 = i12 - i13;
        if (i11 <= i14 && i11 >= 0) {
            this.zzi = i13 + i11;
            return;
        }
        if (i11 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i15 = this.zzk;
        int i16 = i15 + i13;
        int i17 = this.zzl;
        if (i16 + i11 > i17) {
            zzB((i17 - i15) - i13);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i16;
        this.zzg = 0;
        this.zzi = 0;
        while (i14 < i11) {
            try {
                long j11 = i11 - i14;
                try {
                    long jSkip = this.zze.skip(j11);
                    if (jSkip < 0 || jSkip > j11) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i14 += (int) jSkip;
                    }
                } catch (zznn e8) {
                    e8.zza();
                    throw e8;
                }
            } catch (Throwable th2) {
                this.zzk += i14;
                zzK();
                throw th2;
            }
        }
        this.zzk += i14;
        zzK();
        if (i14 >= i11) {
            return;
        }
        int i18 = this.zzg;
        int i19 = i18 - this.zzi;
        this.zzi = i18;
        zzL(1);
        while (true) {
            int i21 = i11 - i19;
            int i22 = this.zzg;
            if (i21 <= i22) {
                this.zzi = i21;
                return;
            } else {
                i19 += i22;
                this.zzi = i22;
                zzL(1);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzC() {
        return this.zzi == this.zzg && !zzM(1);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzE(int i11) throws zznn {
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i13 < 10) {
                    if (zza() < 0) {
                        i13++;
                    }
                }
                throw new zznn("CodedInputStream encountered a malformed varint.");
            }
            while (i13 < 10) {
                byte[] bArr = this.zzf;
                int i14 = this.zzi;
                this.zzi = i14 + 1;
                if (bArr[i14] < 0) {
                    i13++;
                }
            }
            throw new zznn("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i12 == 1) {
            zzB(8);
            return true;
        }
        if (i12 == 2) {
            zzB(zzj());
            return true;
        }
        if (i12 == 3) {
            zzI();
            zzz(((i11 >>> 3) << 3) | 4);
            return true;
        }
        if (i12 == 4) {
            return false;
        }
        if (i12 != 5) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        zzB(4);
        return true;
    }

    public final byte zza() throws zznn {
        if (this.zzi == this.zzg) {
            zzL(1);
        }
        byte[] bArr = this.zzf;
        int i11 = this.zzi;
        this.zzi = i11 + 1;
        return bArr[i11];
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zze(int i11) throws zznn {
        if (i11 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i12 = this.zzk + this.zzi + i11;
        if (i12 < 0) {
            throw new zznn("Failed to parse the message.");
        }
        int i13 = this.zzl;
        if (i12 > i13) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i12;
        zzK();
        return i13;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzh() {
        return zzj();
    }

    public final int zzi() throws zznn {
        int i11 = this.zzi;
        if (this.zzg - i11 < 4) {
            zzL(4);
            i11 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i11 + 4;
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public final int zzj() {
        int i11;
        int i12 = this.zzi;
        int i13 = this.zzg;
        if (i13 != i12) {
            byte[] bArr = this.zzf;
            int i14 = i12 + 1;
            byte b3 = bArr[i12];
            if (b3 >= 0) {
                this.zzi = i14;
                return b3;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b3;
                if (i16 < 0) {
                    i11 = i16 ^ (-128);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    if (i18 >= 0) {
                        i11 = i18 ^ 16256;
                    } else {
                        int i19 = i12 + 4;
                        int i21 = i18 ^ (bArr[i17] << 21);
                        if (i21 < 0) {
                            i11 = (-2080896) ^ i21;
                        } else {
                            i17 = i12 + 5;
                            byte b11 = bArr[i19];
                            int i22 = (i21 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i23 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i23;
                                                    i11 = i22;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i22;
                            }
                            i11 = i22;
                        }
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.zzi = i15;
                return i11;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzl() {
        return zzli.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzm() throws zznn {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzj = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw new zznn("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzp() {
        return zzr();
    }

    public final long zzq() throws zznn {
        int i11 = this.zzi;
        if (this.zzg - i11 < 8) {
            zzL(8);
            i11 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i11 + 8;
        long j11 = bArr[i11];
        long j12 = (((long) bArr[i11 + 1]) & 255) << 8;
        long j13 = bArr[i11 + 2];
        long j14 = bArr[i11 + 3];
        return ((((long) bArr[i11 + 6]) & 255) << 48) | (j11 & 255) | j12 | ((j13 & 255) << 16) | ((j14 & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }

    public final long zzr() {
        long j11;
        long j12;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
            int i13 = i11 + 1;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.zzi = i13;
                return b3;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b3;
                if (i15 < 0) {
                    j11 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        j11 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            long j13 = (-2080896) ^ i19;
                            i14 = i18;
                            j11 = j13;
                        } else {
                            i16 = i11 + 5;
                            long j14 = (((long) bArr[i18]) << 28) ^ ((long) i19);
                            if (j14 >= 0) {
                                j11 = j14 ^ 266354560;
                            } else {
                                i14 = i11 + 6;
                                long j15 = (((long) bArr[i16]) << 35) ^ j14;
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    int i21 = i11 + 7;
                                    long j16 = j15 ^ (((long) bArr[i14]) << 42);
                                    if (j16 >= 0) {
                                        j11 = j16 ^ 4363953127296L;
                                    } else {
                                        i14 = i11 + 8;
                                        j15 = j16 ^ (((long) bArr[i21]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i21 = i11 + 9;
                                            long j17 = (j15 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                i14 = i11 + 10;
                                                if (bArr[i21] >= 0) {
                                                    j11 = j17;
                                                }
                                            } else {
                                                j11 = j17;
                                            }
                                        }
                                    }
                                    i14 = i21;
                                }
                                j11 = j15 ^ j12;
                            }
                        }
                    }
                    i14 = i16;
                }
                this.zzi = i14;
                return j11;
            }
        }
        return zzs();
    }

    public final long zzs() throws zznn {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            byte bZza = zza();
            j11 |= ((long) (bZza & 127)) << i11;
            if ((bZza & 128) == 0) {
                return j11;
            }
        }
        throw new zznn("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzu() {
        return zzli.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final zzle zzw() throws IOException {
        int iZzj = zzj();
        int i11 = this.zzg;
        int i12 = this.zzi;
        if (iZzj <= i11 - i12 && iZzj > 0) {
            zzle zzleVarZzk = zzle.zzk(this.zzf, i12, iZzj);
            this.zzi += iZzj;
            return zzleVarZzk;
        }
        if (iZzj == 0) {
            return zzle.zzb;
        }
        if (iZzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzO = zzO(iZzj);
        if (bArrZzO != null) {
            return zzle.zzk(bArrZzO, 0, bArrZzO.length);
        }
        int i13 = this.zzi;
        int i14 = this.zzg;
        int i15 = i14 - i13;
        this.zzk += i14;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzJ = zzJ(iZzj - i15);
        byte[] bArr = new byte[iZzj];
        System.arraycopy(this.zzf, i13, bArr, 0, i15);
        for (byte[] bArr2 : listZzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i15, length);
            i15 += length;
        }
        return new zzlc(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzx() throws zznn {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i11 = this.zzg;
            int i12 = this.zzi;
            if (iZzj <= i11 - i12) {
                String str = new String(this.zzf, i12, iZzj, zznl.zza);
                this.zzi += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iZzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzj > this.zzg) {
            return new String(zzN(iZzj, false), zznl.zza);
        }
        zzL(iZzj);
        String str2 = new String(this.zzf, this.zzi, iZzj, zznl.zza);
        this.zzi += iZzj;
        return str2;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzy() throws IOException {
        byte[] bArrZzN;
        int iZzj = zzj();
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (iZzj <= i12 - i11 && iZzj > 0) {
            bArrZzN = this.zzf;
            this.zzi = i11 + iZzj;
        } else {
            if (iZzj == 0) {
                return BuildConfig.VERSION_NAME;
            }
            if (iZzj < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i11 = 0;
            if (iZzj <= i12) {
                zzL(iZzj);
                bArrZzN = this.zzf;
                this.zzi = iZzj;
            } else {
                bArrZzN = zzN(iZzj, false);
            }
        }
        return zzpv.zzd(bArrZzN, i11, iZzj);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzz(int i11) throws zznn {
        if (this.zzj != i11) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
    }
}
