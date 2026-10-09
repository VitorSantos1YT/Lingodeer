package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class zzcg extends zzch {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzcd f9688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Character f9689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile zzch f9690d;

    public zzcg(zzcd zzcdVar, Character ch2) {
        this.f9688b = zzcdVar;
        if (ch2 != null) {
            byte[] bArr = zzcdVar.f9685g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(zzaq.a("Padding character %s was already in alphabet", ch2));
            }
        }
        this.f9689c = ch2;
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public void a(StringBuilder sb2, byte[] bArr, int i11) {
        int i12 = 0;
        zzap.b(0, i11, bArr.length);
        while (i12 < i11) {
            zzcd zzcdVar = this.f9688b;
            e(i12, Math.min(zzcdVar.f9684f, i11 - i12), sb2, bArr);
            i12 += zzcdVar.f9684f;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public final int b(int i11) {
        zzcd zzcdVar = this.f9688b;
        int i12 = zzcdVar.f9683e;
        int i13 = zzcdVar.f9684f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        return zzcj.a(i11, i13) * i12;
    }

    public zzch d(zzcd zzcdVar, Character ch2) {
        return new zzcg(zzcdVar, ch2);
    }

    public final void e(int i11, int i12, StringBuilder sb2, byte[] bArr) {
        zzap.b(i11, i11 + i12, bArr.length);
        zzcd zzcdVar = this.f9688b;
        int i13 = zzcdVar.f9684f;
        int i14 = zzcdVar.f9682d;
        if (i12 > i13) {
            throw new IllegalArgumentException();
        }
        int i15 = 0;
        long j11 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            j11 = (j11 | ((long) (bArr[i11 + i16] & 255))) << 8;
        }
        int i17 = ((i12 + 1) * 8) - i14;
        while (i15 < i12 * 8) {
            sb2.append(zzcdVar.f9680b[zzcdVar.f9681c & ((int) (j11 >>> (i17 - i15)))]);
            i15 += i14;
        }
        if (this.f9689c != null) {
            while (i15 < zzcdVar.f9684f * 8) {
                sb2.append('=');
                i15 += i14;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcg) {
            zzcg zzcgVar = (zzcg) obj;
            if (this.f9688b.equals(zzcgVar.f9688b)) {
                Object obj2 = zzcgVar.f9689c;
                Character ch2 = this.f9689c;
                if (ch2 == obj2) {
                    return true;
                }
                if (ch2 != null && ch2.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9688b.hashCode();
        Character ch2 = this.f9689c;
        return iHashCode ^ (ch2 == null ? 0 : ch2.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        zzcd zzcdVar = this.f9688b;
        sb2.append(zzcdVar);
        if (8 % zzcdVar.f9682d != 0) {
            Character ch2 = this.f9689c;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public zzcg(String str, String str2) {
        this(new zzcd(str, str2.toCharArray()), (Character) '=');
    }
}
