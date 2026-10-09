package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlz {
    public static final void a(final Level level, Executor executor, final Exception exc, final String str, final Object... objArr) {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.measurement.zzly
            @Override // java.lang.Runnable
            public final void run() {
                zzxs zzxsVar = zzlx.f11726a;
                zzzf zzzfVar = zzxsVar.f12145a;
                Level level2 = level;
                boolean zB = zzzfVar.b(level2);
                zzaab.f11129a.c().a(zzzfVar.a(), level2, zB);
                ((zzxp) ((zzxp) (!zB ? zzxs.f12151b : new zzxq(zzxsVar, level2)).b(exc)).zzn()).a(str, objArr);
            }
        };
        int i11 = zzxa.f12143a;
        executor.execute(new zzwz(new y(), zzvy.a(), runnable));
    }
}
