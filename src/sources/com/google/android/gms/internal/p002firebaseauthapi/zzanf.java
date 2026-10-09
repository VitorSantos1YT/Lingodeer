package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzanf<T, B> {
    public abstract int a(Object obj);

    public abstract zzani b();

    public abstract zzani c(Object obj, Object obj2);

    public abstract void d(int i11, int i12, Object obj);

    public abstract void e(long j11, Object obj, int i11);

    public abstract void f(Object obj, int i11, zzaje zzajeVar);

    public abstract void g(Object obj, int i11, Object obj2);

    public abstract void h(Object obj, zzake zzakeVar);

    public final boolean i(int i11, zzamo zzamoVar, Object obj) throws zzale {
        int iZzd = zzamoVar.zzd();
        int i12 = iZzd >>> 3;
        int i13 = iZzd & 7;
        if (i13 == 0) {
            k(zzamoVar.zzl(), obj, i12);
            return true;
        }
        if (i13 == 1) {
            e(zzamoVar.zzk(), obj, i12);
            return true;
        }
        if (i13 == 2) {
            f(obj, i12, zzamoVar.zzp());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                if (i11 != 0) {
                    return false;
                }
                throw new zzale("Protocol message end-group tag did not match expected tag.");
            }
            if (i13 != 5) {
                throw zzale.a();
            }
            d(i12, zzamoVar.zzf(), obj);
            return true;
        }
        zzani zzaniVarB = b();
        int i14 = 4 | (i12 << 3);
        int i15 = i11 + 1;
        if (i15 >= 100) {
            throw new zzale("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzamoVar.zzc() != Integer.MAX_VALUE && i(i15, zzamoVar, zzaniVarB)) {
        }
        if (i14 != zzamoVar.zzd()) {
            throw new zzale("Protocol message end-group tag did not match expected tag.");
        }
        g(obj, i12, q(zzaniVarB));
        return true;
    }

    public abstract int j(Object obj);

    public abstract void k(long j11, Object obj, int i11);

    public abstract void l(Object obj, zzake zzakeVar);

    public abstract void m(Object obj, Object obj2);

    public abstract zzani n(Object obj);

    public abstract void o(Object obj, Object obj2);

    public abstract zzani p(Object obj);

    public abstract zzani q(Object obj);

    public abstract void r(Object obj);
}
