package dt;

import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import mt.f6;
import rt.jf;
import rt.y8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r3 implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24157a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24162f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f24163t;

    public /* synthetic */ r3(CourseWord courseWord, int i11, j3.y0 y0Var, boolean z11, qy.l lVar, boolean z12, int i12) {
        this.f24162f = courseWord;
        this.f24160d = i11;
        this.f24163t = y0Var;
        this.f24158b = z11;
        this.H = lVar;
        this.f24159c = z12;
        this.f24161e = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        int i11 = this.f24157a;
        int i12 = this.f24161e;
        int i13 = this.f24160d;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.H;
        Object obj4 = this.f24163t;
        Object obj5 = this.f24162f;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                d4.c((CourseWord) obj5, this.f24160d, (j3.y0) obj4, this.f24158b, (qy.l) obj3, this.f24159c, (l1.n) obj, l1.t.M(i12 | 1));
                break;
            case 1:
                jf jfVar = (jf) obj5;
                fz.c cVar = (fz.c) obj4;
                l1.b1 b1Var = (l1.b1) obj3;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    if (jfVar.f49950c > 0) {
                        sVar.d0(-1202849363);
                        l1.c3 c3Var = h1.v1.f31180a;
                        long j11 = ((h1.s1) sVar.j(c3Var)).B;
                        g2.r0 r0Var = g2.f0.f28556b;
                        z1.o oVar = z1.o.f58481a;
                        float f5 = 16;
                        z1.r rVarC = j0.c.C(j0.e2.e(j0.c.v(d0.n.h(oVar, j11, r0Var)), 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        float f11 = 12;
                        z1.r rVarE = j0.c.E(rVarC, CropImageView.DEFAULT_ASPECT_RATIO, 20, CropImageView.DEFAULT_ASPECT_RATIO, f11, 5);
                        j0.a2 a2VarA = j0.z1.a(j0.i.g(f5), z1.c.L, sVar, 6);
                        int iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL = sVar.l();
                        z1.r rVarC2 = z1.a.c(sVar, rVarE);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar);
                        y2.h hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC2, sVar);
                        boolean z12 = !jfVar.f49952e && this.f24158b;
                        float f12 = 8;
                        j0.v1 v1Var = new j0.v1(f12, f12, f12, f12);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var = new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        boolean zF = sVar.f(cVar);
                        Object objQ = sVar.Q();
                        l1.g gVar = l1.m.f39353a;
                        if (zF || objQ == gVar) {
                            objQ = new km.x0(cVar, 6);
                            sVar.o0(objQ);
                        }
                        k7.b((fz.a) objQ, i1Var, z12, null, null, null, null, v1Var, t1.e.d(74958458, new gs.s(jfVar, i13, 2), sVar), sVar, 817889280, 376);
                        j0.c.g(sVar, j0.e2.g(oVar, f11));
                        j0.v1 v1Var2 = h1.j0.f30447a;
                        h1.i0 i0VarA = h1.j0.a(((h1.s1) sVar.j(c3Var)).f31042y, ((h1.s1) sVar.j(c3Var)).f31043z, sVar, 12);
                        j0.v1 v1Var3 = new j0.v1(f12, f12, f12, f12);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var2 = new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        Object objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new jt.i0(18, b1Var);
                            sVar.o0(objQ2);
                        }
                        k7.b((fz.a) objQ2, i1Var2, this.f24159c, null, i0VarA, null, null, v1Var3, t1.e.d(1607285795, new fu.b0(i12, 2), sVar), sVar, 817889286, 360);
                        sVar = sVar;
                        sVar.p(true);
                        z11 = false;
                    } else {
                        z11 = false;
                        sVar.d0(-1207596455);
                    }
                    sVar.p(z11);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                f6.g(this.f24158b, (y8) obj5, this.f24159c, (fz.e) obj4, (fz.a) obj3, (l1.n) obj, l1.t.M(i13 | 1), this.f24161e);
                break;
            default:
                ((Integer) obj2).getClass();
                mt.y3.y((String) obj5, (String) obj4, this.f24158b, this.f24159c, (fz.a) obj3, (l1.n) obj, l1.t.M(i13 | 1), this.f24161e);
                break;
        }
        return b0Var;
    }

    public /* synthetic */ r3(String str, String str2, boolean z11, boolean z12, fz.a aVar, int i11, int i12) {
        this.f24162f = str;
        this.f24163t = str2;
        this.f24158b = z11;
        this.f24159c = z12;
        this.H = aVar;
        this.f24160d = i11;
        this.f24161e = i12;
    }

    public /* synthetic */ r3(jf jfVar, boolean z11, fz.c cVar, boolean z12, int i11, l1.b1 b1Var, int i12) {
        this.f24162f = jfVar;
        this.f24158b = z11;
        this.f24163t = cVar;
        this.f24159c = z12;
        this.f24160d = i11;
        this.H = b1Var;
        this.f24161e = i12;
    }

    public /* synthetic */ r3(boolean z11, y8 y8Var, boolean z12, fz.e eVar, fz.a aVar, int i11, int i12) {
        this.f24158b = z11;
        this.f24162f = y8Var;
        this.f24159c = z12;
        this.f24163t = eVar;
        this.H = aVar;
        this.f24160d = i11;
        this.f24161e = i12;
    }
}
