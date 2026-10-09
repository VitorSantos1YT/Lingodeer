package z4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f58861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r4.d[] f58862b;

    public l1() {
        this(new v1((v1) null));
    }

    public final void a() {
        r4.d[] dVarArr = this.f58862b;
        if (dVarArr != null) {
            r4.d dVarG = dVarArr[0];
            r4.d dVarG2 = dVarArr[1];
            v1 v1Var = this.f58861a;
            if (dVarG2 == null) {
                dVarG2 = v1Var.f58905a.g(2);
            }
            if (dVarG == null) {
                dVarG = v1Var.f58905a.g(1);
            }
            g(r4.d.a(dVarG, dVarG2));
            r4.d dVar = this.f58862b[c.a.y(16)];
            if (dVar != null) {
                f(dVar);
            }
            r4.d dVar2 = this.f58862b[c.a.y(32)];
            if (dVar2 != null) {
                d(dVar2);
            }
            r4.d dVar3 = this.f58862b[c.a.y(64)];
            if (dVar3 != null) {
                h(dVar3);
            }
        }
    }

    public abstract v1 b();

    public void c(int i11, r4.d dVar) {
        if (this.f58862b == null) {
            this.f58862b = new r4.d[10];
        }
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i11 & i12) != 0) {
                this.f58862b[c.a.y(i12)] = dVar;
            }
        }
    }

    public abstract void e(r4.d dVar);

    public abstract void g(r4.d dVar);

    public l1(v1 v1Var) {
        this.f58861a = v1Var;
    }

    public void d(r4.d dVar) {
    }

    public void f(r4.d dVar) {
    }

    public void h(r4.d dVar) {
    }
}
