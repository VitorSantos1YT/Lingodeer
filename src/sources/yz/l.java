package yz;

import java.util.concurrent.TimeUnit;
import wz.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f58395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f58396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f58398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f58399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f58400f;

    static {
        String property;
        int i11 = t.f55545a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f58395a = property;
        f58396b = wz.b.k(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i12 = t.f55545a;
        if (i12 < 2) {
            i12 = 2;
        }
        f58397c = wz.b.l(i12, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f58398d = wz.b.l(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f58399e = TimeUnit.SECONDS.toNanos(wz.b.k(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f58400f = h.f58390a;
    }
}
