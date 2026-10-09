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
public final class b implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f47329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f47330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f47331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f47332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f47333e;

    public b(z0 z0Var, boolean z11, boolean z12, k kVar, fz.a aVar) {
        this.f47329a = z0Var;
        this.f47330b = z11;
        this.f47331c = z12;
        this.f47332d = kVar;
        this.f47333e = aVar;
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
        r rVarI = c1.a(o.f58481a, iVar, this.f47329a).i(new a(this.f47330b, iVar, null, false, this.f47331c, this.f47332d, this.f47333e));
        sVar.p(false);
        return rVarI;
    }
}
