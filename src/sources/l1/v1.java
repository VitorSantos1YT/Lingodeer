package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f39487a;

    public v1(fz.a aVar) {
        this.f39487a = new v0(aVar);
    }

    public abstract w1 a(Object obj);

    public e3 b() {
        return this.f39487a;
    }

    public final e3 c(w1 w1Var, e3 e3Var) {
        k0 k0Var;
        e3 e3Var2 = null;
        e3Var2 = null;
        e3Var2 = null;
        e3Var2 = null;
        e3Var2 = null;
        e3Var2 = null;
        if (e3Var instanceof k0) {
            if (w1Var.f39491d) {
                k0Var = (k0) e3Var;
                k0Var.f39328a.setValue(w1Var.a());
            }
        } else if (e3Var instanceof d3) {
            if ((w1Var.f39489b || w1Var.f39492e != null) && !w1Var.f39491d) {
                d3 d3Var = (d3) e3Var;
                if (kotlin.jvm.internal.m.a(w1Var.a(), d3Var.f39281a)) {
                    e3Var2 = d3Var;
                }
            }
        } else if (e3Var instanceof e0) {
            w1Var.getClass();
        }
        if (e3Var2 != null) {
            e3Var2 = k0Var;
            return e3Var2;
        }
        if (!w1Var.f39491d) {
            e3Var2 = k0Var;
            return new d3(w1Var.a());
        }
        Object obj = w1Var.f39492e;
        v2 v2Var = w1Var.f39490c;
        if (v2Var == null) {
            e3Var2 = k0Var;
            v2Var = g.f39303t;
        }
        e3Var2 = k0Var;
        return new k0(new k1(obj, v2Var));
    }
}
