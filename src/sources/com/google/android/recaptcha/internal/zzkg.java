package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Objects;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class zzkg extends zzkh {
    final zzkd zza;
    final Character zzb;

    public zzkg(zzkd zzkdVar, Character ch2) {
        this.zza = zzkdVar;
        if (ch2 != null && zzkdVar.zzd('=')) {
            throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", ch2));
        }
        this.zzb = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza) && Objects.equals(this.zzb, zzkgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.zzb;
        return Objects.hashCode(ch2) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzb);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public int zza(byte[] bArr, CharSequence charSequence) throws zzkf {
        zzkd zzkdVar;
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzkf(p.j(charSequenceZze.length(), "Invalid input length "));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceZze.length()) {
            long jZzb = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                zzkdVar = this.zza;
                if (i13 >= zzkdVar.zzc) {
                    break;
                }
                jZzb <<= zzkdVar.zzb;
                if (i11 + i13 < charSequenceZze.length()) {
                    jZzb |= (long) this.zza.zzb(charSequenceZze.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = zzkdVar.zzd;
            int i16 = i14 * zzkdVar.zzb;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((jZzb >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += this.zza.zzc;
        }
        return i12;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public void zzb(Appendable appendable, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        zzjf.zzd(0, i12, bArr.length);
        while (i13 < i12) {
            zzf(appendable, bArr, i13, Math.min(this.zza.zzd, i12 - i13));
            i13 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzc(int i11) {
        return (int) (((((long) this.zza.zzb) * ((long) i11)) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzd(int i11) {
        zzkd zzkdVar = this.zza;
        return zzkdVar.zzc * zzkj.zza(i11, zzkdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i11, int i12) {
        zzjf.zzd(i11, i11 + i12, bArr.length);
        int i13 = 0;
        zzjf.zza(i12 <= this.zza.zzd);
        long j11 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            j11 = (j11 | ((long) (bArr[i11 + i14] & 255))) << 8;
        }
        int i15 = (i12 + 1) * 8;
        zzkd zzkdVar = this.zza;
        while (i13 < i12 * 8) {
            long j12 = j11 >>> ((i15 - zzkdVar.zzb) - i13);
            zzkd zzkdVar2 = this.zza;
            appendable.append(zzkdVar2.zza(((int) j12) & zzkdVar2.zza));
            i13 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i13 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i13 += this.zza.zzb;
            }
        }
    }

    public zzkg(String str, String str2, Character ch2) {
        this(new zzkd(str, str2.toCharArray()), ch2);
    }
}
