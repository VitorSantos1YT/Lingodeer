package n0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.lingodeer.R;
import mt.n4;
import w2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f42921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f42922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f42923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f42924d;

    public b0(l0 l0Var, z1.r rVar, c0 c0Var, l1.b1 b1Var) {
        this.f42921a = l0Var;
        this.f42922b = rVar;
        this.f42923c = c0Var;
        this.f42924d = b1Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z1.r rVarI;
        w1.b bVar = (w1.b) obj;
        ((Number) obj3).intValue();
        l1.s sVar = (l1.s) ((l1.n) obj2);
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            objQ = new y(bVar, new n4(16, this.f42924d));
            sVar.o0(objQ);
        }
        y yVar = (y) objQ;
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            objQ2 = new p1(new ob.c(yVar));
            sVar.o0(objQ2);
        }
        p1 p1Var = (p1) objQ2;
        l0 l0Var = this.f42921a;
        if (l0Var != null) {
            sVar.d0(1743490539);
            sVar.d0(887527095);
            Object obj4 = c1.f42929a;
            if (obj4 != null) {
                sVar.d0(1345648624);
                sVar.p(false);
            } else {
                sVar.d0(1345697697);
                View view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
                boolean zF = sVar.f(view);
                Object objQ3 = sVar.Q();
                if (zF || objQ3 == gVar) {
                    Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                    objQ3 = tag instanceof a1 ? (a1) tag : null;
                    if (objQ3 == null) {
                        objQ3 = new a(view);
                        view.setTag(R.id.compose_prefetch_scheduler, objQ3);
                    }
                    sVar.o0(objQ3);
                }
                obj4 = (a1) objQ3;
                sVar.p(false);
            }
            Object obj5 = obj4;
            sVar.p(false);
            Object[] objArr = {l0Var, yVar, p1Var, obj5};
            boolean zF2 = sVar.f(l0Var) | sVar.h(yVar) | sVar.h(p1Var) | sVar.h(obj5);
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == gVar) {
                b0.a aVar = new b0.a(l0Var, yVar, p1Var, obj5, 25);
                sVar.o0(aVar);
                objQ4 = aVar;
            }
            l1.t.e(objArr, (fz.c) objQ4, sVar);
            sVar.p(false);
        } else {
            sVar.d0(1744076749);
            sVar.p(false);
        }
        int i11 = m0.f42974a;
        z1.r rVar = this.f42922b;
        if (l0Var != null && (rVarI = rVar.i(new f1(l0Var))) != null) {
            rVar = rVarI;
        }
        boolean zF3 = sVar.f(yVar);
        c0 c0Var = this.f42923c;
        boolean zF4 = zF3 | sVar.f(c0Var);
        Object objQ5 = sVar.Q();
        if (zF4 || objQ5 == gVar) {
            objQ5 = new k9.p(17, yVar, c0Var);
            sVar.o0(objQ5);
        }
        w2.a0.a(p1Var, rVar, (fz.e) objQ5, sVar, 8);
        return qy.b0.f48488a;
    }
}
