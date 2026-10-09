package q0;

import d0.c1;
import d0.z0;
import g3.k;
import l1.m;
import l1.n;
import l1.s;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f47340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3.a f47341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f47342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f47343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f47344e;

    public f(z0 z0Var, fz.a aVar, k kVar, i3.a aVar2, boolean z11) {
        this.f47340a = z0Var;
        this.f47341b = aVar2;
        this.f47342c = z11;
        this.f47343d = kVar;
        this.f47344e = aVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        s sVar = (s) ((n) obj2);
        sVar.d0(-1525724089);
        Object objQ = sVar.Q();
        if (objQ == m.f39353a) {
            objQ = com.google.android.material.datepicker.d.f(sVar);
        }
        h0.i iVar = (h0.i) objQ;
        r rVarI = c1.a(o.f58481a, iVar, this.f47340a).i(new h(this.f47341b, iVar, null, this.f47342c, this.f47343d, this.f47344e));
        sVar.p(false);
        return rVarI;
    }
}
