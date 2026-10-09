package com.google.android.recaptcha.internal;

import com.google.android.material.datepicker.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkl {
    public static void zza(boolean z11, String str, long j11, long j12) {
        if (z11) {
            return;
        }
        StringBuilder sbM = d.m(j11, "overflow: ", str, "(");
        sbM.append(", ");
        sbM.append(j12);
        sbM.append(")");
        throw new ArithmeticException(sbM.toString());
    }

    public static void zzb(boolean z11) {
        if (!z11) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
