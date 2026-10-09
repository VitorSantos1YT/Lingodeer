package bp;

import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingodeer.R;
import h1.ua;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o5 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f4751b;

    public /* synthetic */ o5(int i11, List list) {
        this.f4750a = i11;
        this.f4751b = list;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f4750a;
        qy.b0 b0Var = qy.b0.f48488a;
        List list = this.f4751b;
        switch (i11) {
            case 0:
                lc.d dialog = (lc.d) obj;
                int iIntValue = ((Integer) obj2).intValue();
                CharSequence text = (CharSequence) obj3;
                int i12 = UpdateLessonActivity.W;
                kotlin.jvm.internal.m.f(dialog, "dialog");
                kotlin.jvm.internal.m.f(text, "text");
                String str = (String) list.get(iIntValue);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.f(str, "<set-?>");
                LingoSkillApplication.f21666c = str;
                hh.p0.w(1, f10.e.b());
                break;
            default:
                j0.v Card = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i13 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar.W();
                } else {
                    z1.r rVarD = j0.e2.d(z1.o.f58481a, 1.0f);
                    j0.u uVarA = j0.t.a(j0.i.f35310h, z1.c.P, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarD);
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
                    String str2 = (String) list.get(0);
                    l1.d0 d0Var = ua.f31167a;
                    ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), se.i.k(sVar, R.color.primary_black), fr.j3.A(16), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 0, 65534);
                    ua.b((String) list.get(1), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), se.i.k(sVar, R.color.second_black), fr.j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 0, 65534);
                    sVar.p(true);
                }
                break;
        }
        return b0Var;
    }
}
