package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f50876a;

    public d(c[] cVarArr) {
        this.f50876a = cVarArr;
    }

    @Override // rz.k
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f50876a) {
            q0 q0Var = cVar.f50871f;
            if (q0Var == null) {
                kotlin.jvm.internal.m.n("handle");
                throw null;
            }
            q0Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f50876a + ']';
    }
}
