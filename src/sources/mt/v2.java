package mt;

import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import rt.gd;
import rt.hd;
import rt.id;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v2 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f41983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41984c;

    public /* synthetic */ v2(int i11, fz.a aVar, l1.b1 b1Var) {
        this.f41982a = i11;
        this.f41983b = aVar;
        this.f41984c = b1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f41982a;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fz.a aVar = this.f41983b;
                    boolean zF = sVar.f(aVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new fu.e(10, aVar, this.f41984c);
                        sVar.o0(objQ);
                    }
                    k7.m((fz.a) objQ, null, false, null, null, null, g.f41457u0, sVar, 805306368, 510);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            default:
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    id idVar = (id) this.f41984c.getValue();
                    if (kotlin.jvm.internal.m.a(idVar, gd.f49798a)) {
                        sVar2.d0(2140612008);
                        z1.r rVarH = d0.n.h(j0.e2.g(j0.c.C(j0.e2.e(z1.o.f58481a, 1.0f), 22, CropImageView.DEFAULT_ASPECT_RATIO, 2), 220), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, r0.f.d(12));
                        w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                        int iHashCode = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL = sVar2.l();
                        z1.r rVarC = z1.a.c(sVar2, rVarH);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                        y2.h hVar = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar2);
                        tv.a.d(0, 1, sVar2, null);
                        sVar2.p(true);
                        sVar2.p(false);
                    } else {
                        if (!(idVar instanceof hd)) {
                            throw nv.p.x(sVar2, 2140609855, false);
                        }
                        sVar2.d0(2140626771);
                        hd hdVar = (hd) idVar;
                        ys.e3.b(hdVar.f49849a, hdVar.f49850b, this.f41983b, sVar2, 0);
                        sVar2.p(false);
                    }
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
        }
    }
}
