package com.google.android.recaptcha.internal;

import com.bumptech.glide.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgc {
    public static final Class zza(Object obj) throws zzce {
        Class cls;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (!(obj instanceof Integer)) {
            if (!(obj instanceof String)) {
                throw new zzce(4, 5, null);
            }
            try {
                String str = (String) obj;
                Class<?> cls2 = Class.forName(str);
                int i11 = zzav.zza;
                if (((zzfu) d.v(zzgb.zza).getValue()).zzb(str)) {
                    return cls2;
                }
                throw new zzce(6, 47, null);
            } catch (Exception e8) {
                throw new zzce(6, 8, e8);
            }
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == 1) {
            cls = Integer.TYPE;
        } else if (iIntValue == 2) {
            cls = Short.TYPE;
        } else if (iIntValue == 3) {
            cls = Byte.TYPE;
        } else if (iIntValue == 4) {
            cls = Long.TYPE;
        } else if (iIntValue == 5) {
            cls = Character.TYPE;
        } else if (iIntValue == 6) {
            cls = Float.TYPE;
        } else if (iIntValue == 7) {
            cls = Double.TYPE;
        } else {
            cls = iIntValue == 8 ? Boolean.TYPE : null;
        }
        if (cls != null) {
            return cls;
        }
        throw new zzce(4, 6, null);
    }
}
