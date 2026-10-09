package bp;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.lingo.lingoskill.object.LanguageExpandableItem2;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingodeer.data.env.Env;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LanguageExpandableItem2 f4714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ep.c f4715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f4716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4718e;

    public n0(LanguageExpandableItem2 languageExpandableItem2, ep.c cVar, fz.c cVar2, l1.b1 b1Var, l1.b1 b1Var2) {
        this.f4714a = languageExpandableItem2;
        this.f4715b = cVar;
        this.f4716c = cVar2;
        this.f4717d = b1Var;
        this.f4718e = b1Var2;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a0.k0 AnimatedVisibility = (a0.k0) obj;
        l1.n nVar = (l1.n) obj2;
        ((Number) obj3).intValue();
        kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, nVar, 0);
        l1.s sVar = (l1.s) nVar;
        int iHashCode = Long.hashCode(sVar.T);
        l1.q1 q1VarL = sVar.l();
        z1.r rVarC = z1.a.c(nVar, z1.o.f58481a);
        y2.k.J.getClass();
        y2.i iVar = y2.j.f56913b;
        sVar.h0();
        if (sVar.S) {
            sVar.k(iVar);
        } else {
            sVar.r0();
        }
        l1.t.J(y2.j.f56917f, uVarA, nVar);
        l1.t.J(y2.j.f56916e, q1VarL, nVar);
        y2.h hVar = y2.j.f56918g;
        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
        }
        l1.t.J(y2.j.f56915d, rVarC, nVar);
        sVar.d0(1025160396);
        List<MultiItemEntity> subItems = this.f4714a.getSubItems();
        kotlin.jvm.internal.m.e(subItems, "getSubItems(...)");
        for (MultiItemEntity multiItemEntity : subItems) {
            kotlin.jvm.internal.m.d(multiItemEntity, "null cannot be cast to non-null type com.lingo.lingoskill.object.LanguageItem");
            LanguageItem languageItem = (LanguageItem) multiItemEntity;
            sVar.d0(-1168520582);
            e20.a aVarA = q10.b.a(nVar);
            sVar.d0(-1633490746);
            boolean zF = sVar.f(null) | sVar.f(aVarA);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = w4.c.e(vt.n0.class, aVarA, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            vt.n0 n0Var = (vt.n0) objQ;
            v3.m mVar = languageItem.getLocate() == 51 ? v3.m.Rtl : v3.m.Ltr;
            boolean zF2 = sVar.f(languageItem);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                fr.o0 o0Var = (fr.o0) n0Var;
                Env env = o0Var.f27733a;
                Env env2 = o0Var.f27733a;
                objQ2 = Boolean.valueOf((env.keyLanguage == languageItem.getKeyLanguage() && env2.locateLanguage == languageItem.getLocate() && env2.fluentLanguage == -1 && env2.scLanguage == -1 && env2.handWriteLanguage == -1) || (env2.fluentLanguage == languageItem.getKeyLanguage() && env2.locateLanguage == languageItem.getLocate()) || ((env2.scLanguage == languageItem.getKeyLanguage() && env2.locateLanguage == languageItem.getLocate()) || (env2.handWriteLanguage == languageItem.getKeyLanguage() && env2.locateLanguage == languageItem.getLocate())));
                sVar.o0(objQ2);
            }
            boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
            int locate = languageItem.getLocate();
            ep.c cVar = this.f4715b;
            boolean zD = sVar.d(locate) | sVar.f(cVar.f25725t);
            Object objQ3 = sVar.Q();
            if (zD || objQ3 == gVar) {
                String str = cVar.f25725t;
                int[] iArr = bq.r.f4959a;
                objQ3 = Boolean.valueOf(!kotlin.jvm.internal.m.a(str, bq.m.x(languageItem.getLocate())));
                sVar.o0(objQ3);
            }
            l1.t.a(z2.g1.f58552n.a(mVar), t1.e.d(1805748748, new m0(multiItemEntity, zBooleanValue, ((Boolean) objQ3).booleanValue(), cVar, this.f4716c, this.f4717d, this.f4718e), nVar), nVar, 56);
        }
        sVar.p(false);
        sVar.p(true);
        return qy.b0.f48488a;
    }
}
