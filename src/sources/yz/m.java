package yz;

import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f58401a = new m();

    @Override // rz.y
    public final void dispatch(vy.i iVar, Runnable runnable) {
        f.f58389b.f58391a.b(runnable, true, false);
    }

    @Override // rz.y
    public final void dispatchYield(vy.i iVar, Runnable runnable) {
        f.f58389b.f58391a.b(runnable, true, true);
    }

    @Override // rz.y
    public final y limitedParallelism(int i11, String str) {
        wz.b.a(i11);
        if (i11 >= l.f58398d) {
            return str != null ? new wz.n(this, str) : this;
        }
        return super.limitedParallelism(i11, str);
    }

    @Override // rz.y
    public final String toString() {
        return "Dispatchers.IO";
    }
}
