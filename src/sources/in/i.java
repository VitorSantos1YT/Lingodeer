package in;

import android.content.Context;
import bp.a1;
import bp.p0;
import bp.y;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import dl.n;
import fr.n2;
import j9.t;
import j9.v;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.b1;
import m0.j;
import qu.s;
import qu.u;
import qy.b0;
import rt.dd;
import rt.ed;
import rt.ee;
import rt.f4;
import rt.g4;
import rt.l9;
import rt.uf;
import ry.r;
import xu.z;
import ys.q2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements fz.c {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f34492f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f34493t;

    public /* synthetic */ i(Object obj, Object obj2, qy.e eVar, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i11) {
        this.f34487a = i11;
        this.f34488b = obj;
        this.f34489c = obj2;
        this.f34490d = eVar;
        this.f34491e = obj3;
        this.f34492f = obj4;
        this.f34493t = obj5;
        this.H = obj6;
        this.K = obj7;
        this.L = obj8;
        this.M = obj9;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.List] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f34487a;
        b0 b0Var = b0.f48488a;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.H;
        Object obj6 = this.f34493t;
        Object obj7 = this.f34492f;
        Object obj8 = this.f34491e;
        Object obj9 = this.f34490d;
        Object obj10 = this.f34489c;
        Object obj11 = this.f34488b;
        int i12 = 1;
        switch (i11) {
            case 0:
                List list = (List) obj11;
                MALSyllableIntroductionActivity mALSyllableIntroductionActivity = (MALSyllableIntroductionActivity) obj3;
                ln.a aVar = (ln.a) obj2;
                List list2 = (List) obj8;
                j LazyVerticalGrid = (j) obj;
                int i13 = MALSyllableIntroductionActivity.Q;
                m.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                j.p(LazyVerticalGrid, new c(i12), new t1.d(new a00.b(mALSyllableIntroductionActivity, 16), true, 846570503), 5);
                LazyVerticalGrid.q(list.size(), null, null, new p0(6, list), new t1.d(new n(list, mALSyllableIntroductionActivity, aVar, i12), true, -1117249557));
                j.p(LazyVerticalGrid, new n2(29), new t1.d(new y(mALSyllableIntroductionActivity, (List) obj10, (List) obj9, list2, aVar, 5), true, 1916350000), 5);
                j.p(LazyVerticalGrid, new c(0), new t1.d(new es.h(mALSyllableIntroductionActivity, (List) obj7, (List) obj6, (List) obj5, (List) obj4, aVar, 2), true, 1745510543), 5);
                j.p(LazyVerticalGrid, null, a.f34467b, 7);
                break;
            case 1:
                g4 g4Var = (g4) obj11;
                ed edVar = (ed) obj10;
                fz.e eVar = (fz.e) obj9;
                fz.a aVar2 = (fz.a) obj8;
                Context context = (Context) obj7;
                b1 b1Var = (b1) obj6;
                b1 b1Var2 = (b1) obj5;
                b1 b1Var3 = (b1) obj4;
                fz.c cVar = (fz.c) obj3;
                fz.c cVar2 = (fz.c) obj2;
                l0.h LazyColumn = (l0.h) obj;
                m.f(LazyColumn, "$this$LazyColumn");
                l0.h.p(LazyColumn, null, new t1.d(new s(edVar, 8), true, 968616311), 3);
                f4 f4Var = (f4) g4Var;
                List list3 = f4Var.f49724b;
                LazyColumn.q(list3.size(), null, new qu.m(20, list3), new t1.d(new a1(list3, edVar, eVar, aVar2, context, b1Var, b1Var2, b1Var3), true, 2039820996));
                uf ufVar = f4Var.f49725c;
                if (ufVar != null) {
                    l0.h.p(LazyColumn, null, new t1.d(new br.j(ufVar, g4Var, edVar, cVar, 21), true, 488182934), 3);
                }
                l0.h.p(LazyColumn, null, new t1.d(new s(g4Var, 9), true, 345634734), 3);
                ?? r9 = f4Var.f49727e;
                LazyColumn.q(r9.size(), null, new z(1, r9), new t1.d(new u(4, r9, cVar2), true, 2039820996));
                ee eeVar = f4Var.f49726d;
                List list4 = eeVar != null ? eeVar.f49702a : r.f50854a;
                LazyColumn.q(list4.size(), null, new qu.m(21, list4), new t1.d(new mt.n(list4, eVar, aVar2, context, b1Var, b1Var2, b1Var3), true, 2039820996));
                break;
            default:
                dd ddVar = (dd) obj11;
                q2 q2Var = (q2) obj8;
                v vVar = (v) obj6;
                t NavHost = (t) obj;
                m.f(NavHost, "$this$NavHost");
                c.a.g(NavHost, "course_test", null, null, new t1.d(new iv.b0(ddVar, (l9) obj10, (fz.c) obj9, q2Var, (fz.a) obj7, vVar), true, -13331955), 254);
                c.a.g(NavHost, "course_test_finish", null, null, new t1.d(new iv.b0(ddVar, (fz.c) obj5, (fz.a) obj4, q2Var, (b1) obj3, (b1) obj2), true, 1942726262), 254);
                break;
        }
        return b0Var;
    }

    public /* synthetic */ i(List list, MALSyllableIntroductionActivity mALSyllableIntroductionActivity, ln.a aVar, List list2, List list3, List list4, List list5, List list6, List list7, List list8) {
        this.f34487a = 0;
        this.f34488b = list;
        this.L = mALSyllableIntroductionActivity;
        this.M = aVar;
        this.f34489c = list2;
        this.f34490d = list3;
        this.f34491e = list4;
        this.f34492f = list5;
        this.f34493t = list6;
        this.H = list7;
        this.K = list8;
    }
}
