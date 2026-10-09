package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements rz.b0, f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f39318d = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vy.i f39319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2 f39320b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile vy.i f39321c;

    public i2(vy.i iVar) {
        this.f39319a = iVar;
    }

    @Override // l1.f2
    public final void a() {
        b();
    }

    public final void b() {
        synchronized (this.f39320b) {
            try {
                vy.i iVar = this.f39321c;
                if (iVar == null) {
                    this.f39321c = f39318d;
                } else {
                    rz.e0.j(iVar, new l0(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l1.f2
    public final void d() {
        b();
    }

    @Override // rz.b0
    public final vy.i getCoroutineContext() {
        vy.i iVarPlus;
        vy.i iVar = this.f39321c;
        if (iVar == null || iVar == f39318d) {
            y1.d dVar = (y1.d) this.f39319a.get(y1.d.f56814b);
            vy.i h2Var = dVar != null ? new h2(dVar, this) : vy.j.f54321a;
            synchronized (this.f39320b) {
                try {
                    vy.i iVar2 = this.f39321c;
                    if (iVar2 == null) {
                        vy.i iVar3 = this.f39319a;
                        iVarPlus = iVar3.plus(new rz.h1((rz.g1) iVar3.get(rz.z.f50978b))).plus(vy.j.f54321a).plus(h2Var);
                    } else if (iVar2 == f39318d) {
                        vy.i iVar4 = this.f39319a;
                        rz.h1 h1Var = new rz.h1((rz.g1) iVar4.get(rz.z.f50978b));
                        h1Var.r(new l0(0));
                        iVarPlus = iVar4.plus(h1Var).plus(vy.j.f54321a).plus(h2Var);
                    } else {
                        iVarPlus = iVar2;
                    }
                    this.f39321c = iVarPlus;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            iVar = iVarPlus;
        }
        kotlin.jvm.internal.m.c(iVar);
        return iVar;
    }

    @Override // l1.f2
    public final void f() {
    }
}
