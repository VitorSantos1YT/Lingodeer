package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f39499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f39501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fz.e f39502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.d0 f39504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y.i0 f39505g;

    public x1(z zVar) {
        this.f39499a = zVar;
    }

    public static boolean a(g0 g0Var, y.i0 i0Var) {
        kotlin.jvm.internal.m.d(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        v2 v2Var = g0Var.f39306c;
        if (v2Var == null) {
            v2Var = g.f39303t;
        }
        return !v2Var.a(g0Var.m().f39295f, i0Var.g(g0Var));
    }

    public final boolean b() {
        if (this.f39499a != null) {
            b bVar = this.f39501c;
            if (bVar != null ? bVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final r0 c(Object obj) {
        r0 r0VarR;
        z zVar = this.f39499a;
        return (zVar == null || (r0VarR = zVar.r(this, obj)) == null) ? r0.IGNORED : r0VarR;
    }

    public final void d() {
        z zVar = this.f39499a;
        if (zVar != null) {
            zVar.Q = true;
            zVar.V.g();
        }
        this.f39499a = null;
        this.f39504f = null;
        this.f39505g = null;
        this.f39502d = null;
    }

    public final void e(boolean z11) {
        int i11 = this.f39500b;
        this.f39500b = z11 ? i11 | 32 : i11 & (-33);
    }

    public final void f(fz.e eVar) {
        this.f39502d = eVar;
    }
}
