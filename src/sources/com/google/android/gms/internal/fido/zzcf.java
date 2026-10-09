package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzcf extends zzcg {
    public zzcf(zzcd zzcdVar, Character ch2) {
        super(zzcdVar, ch2);
        if (zzcdVar.f9680b.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    public final void a(StringBuilder sb2, byte[] bArr, int i11) {
        int i12 = 0;
        zzap.b(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16) | (bArr[i12 + 2] & 255);
            zzcd zzcdVar = this.f9688b;
            char[] cArr = zzcdVar.f9680b;
            char[] cArr2 = zzcdVar.f9680b;
            sb2.append(cArr[i14 >>> 18]);
            sb2.append(cArr2[(i14 >>> 12) & 63]);
            sb2.append(cArr2[(i14 >>> 6) & 63]);
            sb2.append(cArr2[i14 & 63]);
            i12 += 3;
        }
        if (i12 < i11) {
            e(i12, i11 - i12, sb2, bArr);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    public final zzch d(zzcd zzcdVar, Character ch2) {
        return new zzcf(zzcdVar, ch2);
    }

    public zzcf(String str, String str2) {
        this(new zzcd(str, str2.toCharArray()), (Character) '=');
    }
}
