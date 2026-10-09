package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import qy.l;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjb {
    public static final Map zza() {
        LinkedHashMap linkedHashMapA0 = x.a0(new l(-4, zzba.zzo), new l(-12, zzba.zzp), new l(-6, zzba.zzk), new l(-11, zzba.zzm), new l(-13, zzba.zzq), new l(-14, zzba.zzr), new l(-2, zzba.zzl), new l(-7, zzba.zzs), new l(-5, zzba.zzt), new l(-9, zzba.zzu), new l(-8, zzba.zzE), new l(-15, zzba.zzn), new l(-1, zzba.zzv), new l(-3, zzba.zzx), new l(-10, zzba.zzy));
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            linkedHashMapA0.put(-16, zzba.zzw);
        }
        if (i11 >= 27) {
            linkedHashMapA0.put(1, zzba.zzA);
            linkedHashMapA0.put(2, zzba.zzB);
            linkedHashMapA0.put(0, zzba.zzC);
            linkedHashMapA0.put(3, zzba.zzD);
        }
        if (i11 >= 29) {
            linkedHashMapA0.put(4, zzba.zzz);
        }
        return linkedHashMapA0;
    }
}
