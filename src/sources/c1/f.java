package c1;

import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f6443a = j3.A(14);

    public static final long a(long j11, long j12) {
        if (!v3.o.d(j12)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) v3.o.f(j12)) + '.');
        }
        if (v3.o.d(j11)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) v3.o.f(j12)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        long j13 = j11 & 1095216660480L;
        if (j13 != 0) {
            float fC = v3.o.c(j12);
            j3.i(j11);
            return j3.L(j13, v3.o.c(j11) * fC);
        }
        float fC2 = v3.o.c(j12);
        long j14 = f6443a;
        j3.i(j14);
        return j3.L(1095216660480L & j14, v3.o.c(j14) * fC2);
    }
}
