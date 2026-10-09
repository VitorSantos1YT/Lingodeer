package l2;

import a0.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fz.c f39563a;

    public abstract void a(i2.d dVar);

    public fz.c b() {
        return this.f39563a;
    }

    public final void c() {
        fz.c cVarB = b();
        if (cVarB != null) {
            cVarB.invoke(this);
        }
    }

    public void d(o0 o0Var) {
        this.f39563a = o0Var;
    }
}
