package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzafz {
    public abstract void a(long j11, Object obj, int i11);

    public abstract void b(int i11, int i12, Object obj);

    public abstract void c(long j11, Object obj, int i11);

    public abstract void d(Object obj, int i11, zzacr zzacrVar);

    public abstract void e(int i11, Object obj, Object obj2);

    public abstract zzaga f();

    public abstract zzaga g(Object obj);

    public abstract zzaga h(Object obj);

    public abstract void i(Object obj, Object obj2);

    public abstract void j(Object obj);

    public final boolean k(int i11, zzacw zzacwVar, Object obj) throws zzaeh {
        int i12 = zzacwVar.f11233b;
        int i13 = i12 >>> 3;
        int i14 = i12 & 7;
        if (i14 == 0) {
            a(zzacwVar.B(), obj, i13);
            return true;
        }
        if (i14 == 1) {
            c(zzacwVar.D(), obj, i13);
            return true;
        }
        if (i14 == 2) {
            d(obj, i13, zzacwVar.K());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                if (i11 != 0) {
                    return false;
                }
                throw new zzaeh("Protocol message end-group tag did not match expected tag.");
            }
            if (i14 != 5) {
                throw new zzaeg();
            }
            b(i13, zzacwVar.E(), obj);
            return true;
        }
        zzaga zzagaVarF = f();
        int i15 = i13 << 3;
        int i16 = i11 + 1;
        if (i16 >= 100) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzacwVar.x() != Integer.MAX_VALUE && k(i16, zzacwVar, zzagaVarF)) {
        }
        if ((i15 | 4) != zzacwVar.f11233b) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
        e(i13, obj, g(zzagaVarF));
        return true;
    }
}
