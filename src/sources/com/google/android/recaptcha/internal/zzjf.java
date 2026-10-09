package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjf {
    public static void zza(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z11, String str, char c11) {
        if (!z11) {
            throw new IllegalArgumentException(zzji.zza(str, Character.valueOf(c11)));
        }
    }

    public static void zzd(int i11, int i12, int i13) {
        String strZzf;
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            if (i11 < 0 || i11 > i13) {
                strZzf = zzf(i11, i13, "start index");
            } else {
                strZzf = (i12 < 0 || i12 > i13) ? zzf(i12, i13, "end index") : zzji.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    public static void zze(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i11, int i12, String str) {
        return i11 < 0 ? zzji.zza("%s (%s) must not be negative", str, Integer.valueOf(i11)) : zzji.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
    }
}
