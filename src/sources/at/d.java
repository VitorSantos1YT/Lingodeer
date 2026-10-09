package at;

import bt.j3;
import bt.o0;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.CourseWord;
import h1.k7;
import j0.e2;
import j3.y0;
import java.util.List;
import jt.j0;
import jt.u;
import kv.e0;
import l1.b1;
import l1.q1;
import l1.t;
import mt.f0;
import mt.l6;
import mt.v1;
import mt.y3;
import rt.ae;
import rt.ed;
import rt.ud;
import rt.uf;
import rz.b0;
import ys.a3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2867e;

    public /* synthetic */ d(int i11, Object obj, Object obj2, Object obj3, boolean z11) {
        this.f2863a = i11;
        this.f2865c = obj;
        this.f2864b = z11;
        this.f2866d = obj2;
        this.f2867e = obj3;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2863a) {
            case 0:
                ((Integer) obj2).getClass();
                b.h((uf) this.f2865c, this.f2864b, (ed) this.f2866d, (fz.c) this.f2867e, (l1.n) obj, t.M(1));
                break;
            case 1:
                t1.d dVar = (t1.d) this.f2865c;
                u uVar = (u) this.f2866d;
                b0 b0Var = (b0) this.f2867e;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dVar.invoke(sVar, 0);
                    boolean zH = sVar.h(b0Var) | sVar.h(uVar);
                    Object objQ = sVar.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        objQ = new o0(b0Var, uVar, 1);
                        sVar.o0(objQ);
                    }
                    bt.b.g(uVar, this.f2864b, (fz.c) objQ, sVar, 0);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 2:
                ((Integer) obj2).getClass();
                bt.b.i0((CourseWord) this.f2865c, (y0) this.f2866d, this.f2864b, (fz.c) this.f2867e, (l1.n) obj, t.M(1));
                break;
            case 3:
                b1 b1Var = (b1) this.f2865c;
                b0 b0Var2 = (b0) this.f2866d;
                j0 j0Var = (j0) this.f2867e;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    List list = (List) b1Var.getValue();
                    boolean zH2 = sVar2.h(b0Var2) | sVar2.h(j0Var);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == l1.m.f39353a) {
                        objQ2 = new j3(b0Var2, j0Var, 0);
                        sVar2.o0(objQ2);
                    }
                    bt.b.o(list, this.f2864b, (fz.c) objQ2, sVar2, 0);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 4:
                ((Integer) obj2).getClass();
                dt.e.O((qy.l) this.f2865c, (b1) this.f2866d, this.f2864b, (fz.a) this.f2867e, (l1.n) obj, t.M(49));
                break;
            case 5:
                ((Integer) obj2).getClass();
                dt.e.K(this.f2864b, (fz.a) this.f2865c, (z1.r) this.f2866d, (t1.d) this.f2867e, (l1.n) obj, t.M(3073));
                break;
            case 6:
                ((Integer) obj2).getClass();
                gs.a.t((bs.e) this.f2865c, this.f2864b, (fz.a) this.f2866d, (z1.r) this.f2867e, (l1.n) obj, t.M(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                iv.a.p((e0) this.f2865c, this.f2864b, (z1.r) this.f2866d, (fz.a) this.f2867e, (l1.n) obj, t.M(49));
                break;
            case 8:
                ((Integer) obj2).getClass();
                mt.g.f((String) this.f2865c, (String) this.f2866d, this.f2864b, (fz.a) this.f2867e, (l1.n) obj, t.M(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                f0.a((String) this.f2865c, (String) this.f2866d, this.f2864b, (z1.r) this.f2867e, (l1.n) obj, t.M(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                v1.d((String) this.f2865c, this.f2864b, (fz.a) this.f2866d, (z1.r) this.f2867e, (l1.n) obj, t.M(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                y3.u((ud) this.f2865c, this.f2864b, (fz.a) this.f2866d, (fz.a) this.f2867e, (l1.n) obj, t.M(1));
                break;
            case 12:
                ae aeVar = (ae) this.f2865c;
                fz.a aVar = (fz.a) this.f2866d;
                fz.a aVar2 = (fz.a) this.f2867e;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean z11 = false;
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarB = j0.c.B(j0.c.v(e2.e(oVar, 1.0f)), 16, 12);
                    j0.u uVarA = j0.t.a(j0.i.g(8), z1.c.O, sVar3, 6);
                    int iHashCode = Long.hashCode(sVar3.T);
                    q1 q1VarL = sVar3.l();
                    z1.r rVarC = z1.a.c(sVar3, rVarB);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    t.J(y2.j.f56917f, uVarA, sVar3);
                    t.J(y2.j.f56916e, q1VarL, sVar3);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                    }
                    t.J(y2.j.f56915d, rVarC, sVar3);
                    int iC = aeVar.c();
                    boolean z12 = this.f2864b;
                    if (iC > 0 && !z12) {
                        z11 = true;
                    }
                    iu.k.e(aVar, e2.e(oVar, 1.0f), z11, 0L, null, t1.e.d(-1754305963, new l6(aeVar, 0), sVar3), sVar3, 196656, 24);
                    k7.m(aVar2, e2.e(oVar, 1.0f), !z12, null, null, null, mt.g.L0, sVar3, 805306416, 504);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            default:
                ((Integer) obj2).getClass();
                a3.h((CourseUnit) this.f2865c, this.f2864b, (fz.c) this.f2867e, (z1.r) this.f2866d, (l1.n) obj, t.M(3073));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d(CourseUnit courseUnit, boolean z11, fz.c cVar, z1.r rVar, int i11) {
        this.f2863a = 13;
        this.f2865c = courseUnit;
        this.f2864b = z11;
        this.f2867e = cVar;
        this.f2866d = rVar;
    }

    public /* synthetic */ d(Object obj, Object obj2, boolean z11, Object obj3, int i11, int i12) {
        this.f2863a = i12;
        this.f2865c = obj;
        this.f2866d = obj2;
        this.f2864b = z11;
        this.f2867e = obj3;
    }

    public /* synthetic */ d(Object obj, boolean z11, Object obj2, Object obj3, int i11, int i12) {
        this.f2863a = i12;
        this.f2865c = obj;
        this.f2864b = z11;
        this.f2866d = obj2;
        this.f2867e = obj3;
    }

    public /* synthetic */ d(t1.d dVar, u uVar, boolean z11, b0 b0Var) {
        this.f2863a = 1;
        this.f2865c = dVar;
        this.f2866d = uVar;
        this.f2864b = z11;
        this.f2867e = b0Var;
    }

    public /* synthetic */ d(boolean z11, fz.a aVar, z1.r rVar, t1.d dVar, int i11) {
        this.f2863a = 5;
        this.f2864b = z11;
        this.f2865c = aVar;
        this.f2866d = rVar;
        this.f2867e = dVar;
    }
}
