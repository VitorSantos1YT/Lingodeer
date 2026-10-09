package jl;

import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingodeer.R;
import h1.k7;
import j0.e2;
import j0.t1;
import j0.u;
import kotlin.jvm.internal.m;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import m0.l;
import qy.b0;
import w2.q0;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HINDISyllableIntroductionActivity f36419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ml.a f36420c;

    public /* synthetic */ d(HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity, ml.a aVar, int i11) {
        this.f36418a = i11;
        this.f36419b = hINDISyllableIntroductionActivity;
        this.f36420c = aVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f36418a;
        b0 b0Var = b0.f48488a;
        int i12 = 18;
        o oVar = o.f58481a;
        ml.a aVar = this.f36420c;
        HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity = this.f36419b;
        switch (i11) {
            case 0:
                t1 contentPadding = (t1) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i13 = HINDISyllableIntroductionActivity.K;
                m.f(contentPadding, "contentPadding");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((s) nVar).f(contentPadding) ? 4 : 2;
                }
                s sVar = (s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    sVar.W();
                } else {
                    r rVarZ = j0.c.z(oVar, contentPadding);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    r rVarC = z1.a.c(sVar, rVarZ);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD, sVar);
                    t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    t.J(y2.j.f56915d, rVarC, sVar);
                    hINDISyllableIntroductionActivity.p(aVar, sVar, 0);
                    sVar.p(true);
                }
                break;
            default:
                l item = (l) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i14 = HINDISyllableIntroductionActivity.K;
                m.f(item, "$this$item");
                s sVar2 = (s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar2.W();
                } else {
                    u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    r rVarC2 = z1.a.c(sVar2, oVar);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    t.J(y2.j.f56917f, uVarA, sVar2);
                    t.J(y2.j.f56916e, q1VarL2, sVar2);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                    }
                    t.J(y2.j.f56915d, rVarC2, sVar2);
                    hINDISyllableIntroductionActivity.v(ub.a.e0(sVar2, R.string.hindi_alp_section_content_18), sVar2, 0);
                    hINDISyllableIntroductionActivity.q(ub.a.e0(sVar2, R.string.hindi_alp_section_content_19), sVar2, 0);
                    j0.c.g(sVar2, e2.g(oVar, 8));
                    k7.d(e2.g(e2.e(oVar, 1.0f), 72), null, k7.p(se.i.k(sVar2, R.color.white), sVar2, 0), null, null, t1.e.d(-484594321, new a00.b(aVar, i12), sVar2), sVar2, 196614, 26);
                    sVar2.p(true);
                }
                break;
        }
        return b0Var;
    }
}
