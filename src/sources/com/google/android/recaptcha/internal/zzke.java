package com.google.android.recaptcha.internal;

import java.io.IOException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzke extends zzkg {
    public zzke(String str, String str2, Character ch2) {
        zzkd zzkdVar = new zzkd(str, str2.toCharArray());
        super(zzkdVar, ch2);
        zzjf.zza(zzkdVar.zzf.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzkf {
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzkf(p.j(charSequenceZze.length(), "Invalid input length "));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceZze.length()) {
            int i13 = i12 + 1;
            int iZzb = (this.zza.zzb(charSequenceZze.charAt(i11)) << 18) | (this.zza.zzb(charSequenceZze.charAt(i11 + 1)) << 12);
            bArr[i12] = (byte) (iZzb >>> 16);
            int i14 = i11 + 2;
            if (i14 < charSequenceZze.length()) {
                int i15 = i11 + 3;
                int iZzb2 = iZzb | (this.zza.zzb(charSequenceZze.charAt(i14)) << 6);
                int i16 = i12 + 2;
                bArr[i13] = (byte) ((iZzb2 >>> 8) & 255);
                if (i15 < charSequenceZze.length()) {
                    i11 += 4;
                    i12 += 3;
                    bArr[i16] = (byte) ((iZzb2 | this.zza.zzb(charSequenceZze.charAt(i15))) & 255);
                } else {
                    i12 = i16;
                    i11 = i15;
                }
            } else {
                i11 = i14;
                i12 = i13;
            }
        }
        return i12;
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final void zzb(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        zzjf.zzd(0, i12, bArr.length);
        for (int i14 = i12; i14 >= 3; i14 -= 3) {
            int i15 = bArr[i13] & 255;
            int i16 = ((bArr[i13 + 1] & 255) << 8) | (i15 << 16) | (bArr[i13 + 2] & 255);
            appendable.append(this.zza.zza(i16 >>> 18));
            appendable.append(this.zza.zza((i16 >>> 12) & 63));
            appendable.append(this.zza.zza((i16 >>> 6) & 63));
            appendable.append(this.zza.zza(i16 & 63));
            i13 += 3;
        }
        if (i13 < i12) {
            zzf(appendable, bArr, i13, i12 - i13);
        }
    }
}
