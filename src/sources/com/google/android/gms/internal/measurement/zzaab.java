package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzaad f11129a;

    static {
        zzaad zzaadVar;
        try {
            zzaadVar = zzaak.f11136a;
        } catch (NoClassDefFoundError unused) {
            zzaadVar = null;
        }
        if (zzaadVar == null) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < 3; i11++) {
                String str = zzaad.f11130a[i11];
                try {
                    zzaadVar = (zzaad) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    th = th2;
                    sb2.append('\n');
                    sb2.append(str);
                    sb2.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb2.append(th);
                }
            }
            throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
        }
        f11129a = zzaadVar;
    }
}
