package bp;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.lingo.lingoskill.object.LanguageExpandableItem2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LanguageExpandableItem2 f4733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ep.c f4735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f4737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4738f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4739t;

    public o0(LanguageExpandableItem2 languageExpandableItem2, boolean z11, ep.c cVar, int i11, fz.c cVar2, l1.b1 b1Var, l1.b1 b1Var2) {
        this.f4733a = languageExpandableItem2;
        this.f4734b = z11;
        this.f4735c = cVar;
        this.f4736d = i11;
        this.f4737e = cVar2;
        this.f4738f = b1Var;
        this.f4739t = b1Var2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z11 = false;
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            z1.r rVarE = j0.e2.e(z1.o.f58481a, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
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
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            ep.c cVar = this.f4735c;
            boolean zH = sVar.h(cVar);
            int i11 = this.f4736d;
            boolean zD = zH | sVar.d(i11);
            Object objQ = sVar.Q();
            if (zD || objQ == l1.m.f39353a) {
                objQ = new k0(cVar, i11);
                sVar.o0(objQ);
            }
            LanguageExpandableItem2 languageExpandableItem2 = this.f4733a;
            boolean z12 = this.f4734b;
            g1.h(languageExpandableItem2, z12, (fz.a) objQ, sVar, 0);
            if (z12) {
                List<MultiItemEntity> subItems = languageExpandableItem2.getSubItems();
                kotlin.jvm.internal.m.e(subItems, "getSubItems(...)");
                if (!subItems.isEmpty()) {
                    z11 = true;
                }
            }
            a0.j0.c(z11, null, a0.f1.e(null, 3).a(a0.f1.d(null, 15)), a0.f1.f(null, 3).a(a0.f1.l(null, 15)), null, t1.e.d(1197435802, new n0(languageExpandableItem2, cVar, this.f4737e, this.f4738f, this.f4739t), sVar), sVar, 1600518, 18);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
