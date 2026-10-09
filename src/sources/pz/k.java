package pz;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k implements Comparable {
    public static long a(long j11) {
        long jA = j.a();
        c unit = c.NANOSECONDS;
        m.f(unit, "unit");
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? a.l(f.j(j11)) : f.o(jA, j11, unit);
    }
}
