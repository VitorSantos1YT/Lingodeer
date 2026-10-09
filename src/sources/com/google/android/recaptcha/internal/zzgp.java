package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Objects;
import oz.a;
import ry.l;
import ry.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i11, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        String strY0;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        int i12 = 0;
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        if (objZza instanceof int[]) {
            int[] iArr = (int[]) objZza;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "[");
            int length = iArr.length;
            int i13 = 0;
            while (i12 < length) {
                int i14 = iArr[i12];
                i13++;
                if (i13 > 1) {
                    sb2.append((CharSequence) ",");
                }
                sb2.append((CharSequence) String.valueOf(i14));
                i12++;
            }
            sb2.append((CharSequence) "]");
            strY0 = sb2.toString();
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, a.f46133a);
            } else if (objZza instanceof long[]) {
                long[] jArr = (long[]) objZza;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length2 = jArr.length;
                int i15 = 0;
                while (i12 < length2) {
                    long j11 = jArr[i12];
                    i15++;
                    if (i15 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf(j11));
                    i12++;
                }
                sb3.append((CharSequence) "]");
                strY0 = sb3.toString();
            } else if (objZza instanceof short[]) {
                short[] sArr = (short[]) objZza;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length3 = sArr.length;
                int i16 = 0;
                while (i12 < length3) {
                    short s3 = sArr[i12];
                    i16++;
                    if (i16 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf((int) s3));
                    i12++;
                }
                sb4.append((CharSequence) "]");
                strY0 = sb4.toString();
            } else if (objZza instanceof float[]) {
                float[] fArr = (float[]) objZza;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length4 = fArr.length;
                int i17 = 0;
                while (i12 < length4) {
                    float f5 = fArr[i12];
                    i17++;
                    if (i17 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(f5));
                    i12++;
                }
                sb5.append((CharSequence) "]");
                strY0 = sb5.toString();
            } else if (objZza instanceof double[]) {
                double[] dArr = (double[]) objZza;
                StringBuilder sb6 = new StringBuilder();
                sb6.append((CharSequence) "[");
                int length5 = dArr.length;
                int i18 = 0;
                while (i12 < length5) {
                    double d5 = dArr[i12];
                    i18++;
                    if (i18 > 1) {
                        sb6.append((CharSequence) ",");
                    }
                    sb6.append((CharSequence) String.valueOf(d5));
                    i12++;
                }
                sb6.append((CharSequence) "]");
                strY0 = sb6.toString();
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strY0 = l.b0((Object[]) objZza, "[", "]", 56);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                strY0 = m.y0((Iterable) objZza, ",", "[", "]", null, 56);
            }
            strY0 = str;
        }
        zzgdVar.zzc().zze(i11, strY0);
    }
}
