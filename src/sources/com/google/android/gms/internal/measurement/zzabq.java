package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzabq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f11189a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzabu f11190b;

    static {
        zzabu zzabvVar;
        for (int i11 = 0; i11 < 2; i11++) {
            zzabvVar = null;
            try {
                zzabvVar = (zzabu) Class.forName(f11189a[i11]).asSubclass(zzabu.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzabvVar != null) {
                f11190b = zzabvVar;
            }
        }
        zzabvVar = new zzabv();
        f11190b = zzabvVar;
    }
}
