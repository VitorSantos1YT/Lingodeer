package lt;

import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.g7;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.e2;
import j0.t;
import j0.u;
import j0.v;
import kotlin.jvm.internal.m;
import l1.n;
import l1.q1;
import l1.s;
import qy.b0;
import rt.jf;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jf f40316b;

    public /* synthetic */ c(jf jfVar, int i11) {
        this.f40315a = i11;
        this.f40316b = jfVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f40315a) {
            case 0:
                v Card = (v) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                m.f(Card, "$this$Card");
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    o oVar = o.f58481a;
                    r rVarA = j0.c.A(oVar, 16);
                    u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    r rVarC = z1.a.c(sVar, rVarA);
                    k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    jf jfVar = this.f40316b;
                    boolean zH = sVar.h(jfVar);
                    Object objQ = sVar.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        objQ = new e(jfVar, 0);
                        sVar.o0(objQ);
                    }
                    g7.c((fz.a) objQ, e2.e(oVar, 1.0f), 0L, 0L, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
                    j0.c.g(sVar, e2.g(oVar, 4));
                    ua.b(w4.c.f((int) (jfVar.f49951d * 100), "%"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30179l, sVar, 0, 0, 65534);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                l0.c item = (l0.c) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                m.f(item, "$this$item");
                s sVar2 = (s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    k7.d(j0.c.A(e2.e(o.f58481a, 1.0f), 16), null, k7.p(((s1) sVar2.j(v1.f31180a)).f31021c, sVar2, 0), null, null, t1.e.d(1612970216, new c(this.f40316b, 0), sVar2), sVar2, 196614, 26);
                } else {
                    sVar2.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
