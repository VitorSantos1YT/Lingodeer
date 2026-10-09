package mw;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42306a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42308c;

    public a1(lw.q1 q1Var, x xVar) {
        Preconditions.e("error must not be OK", !q1Var.f());
        this.f42307b = q1Var;
        this.f42308c = xVar;
    }

    @Override // mw.z
    public final w b(lw.e1 e1Var, lw.c1 c1Var, lw.c cVar, lw.j[] jVarArr) {
        int i11 = this.f42306a;
        Object obj = this.f42308c;
        Object obj2 = this.f42307b;
        switch (i11) {
            case 0:
                return new z0((lw.q1) obj2, (x) obj, jVarArr);
            default:
                lw.c cVar2 = lw.c.f40348h;
                Preconditions.k(cVar, "callOptions cannot be null");
                lw.j jVarA = ((lw.h) obj2).a(new lw.i(cVar, 0, false), c1Var);
                Preconditions.p("lb tracer already assigned", jVarArr[jVarArr.length - 1] == k1.f42500o);
                jVarArr[jVarArr.length - 1] = jVarA;
                return ((g3) obj).b(e1Var, c1Var, cVar, jVarArr);
        }
    }

    @Override // lw.e0
    public final lw.f0 d() {
        switch (this.f42306a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((g3) this.f42308c).d();
        }
    }

    public a1(lw.h hVar, g3 g3Var) {
        this.f42307b = hVar;
        this.f42308c = g3Var;
    }
}
