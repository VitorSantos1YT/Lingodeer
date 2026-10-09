package h1;

import com.lingodeer.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ p2 H;
    public final /* synthetic */ m2 K;
    public final /* synthetic */ i1.w L;
    public final /* synthetic */ t7 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f30719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f30720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f30721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.w f30722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lz.g f30723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1.x f30724f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i1.z f30725t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(Long l9, Long l11, fz.e eVar, l0.w wVar, lz.g gVar, i1.x xVar, i1.z zVar, p2 p2Var, m2 m2Var, i1.w wVar2, t7 t7Var) {
        super(2);
        this.f30719a = l9;
        this.f30720b = l11;
        this.f30721c = eVar;
        this.f30722d = wVar;
        this.f30723e = gVar;
        this.f30724f = xVar;
        this.f30725t = zVar;
        this.H = p2Var;
        this.K = m2Var;
        this.L = wVar2;
        this.M = t7Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0068  */
    /* JADX WARN: Code duplicated, block: B:18:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.s sVar;
        Object objQ;
        l1.g gVar;
        Long l9;
        Long l11;
        fz.e eVar;
        boolean zF;
        Object objQ2;
        fz.c cVar;
        List listL;
        m2 m2Var;
        boolean zF2;
        Object objQ3;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                sVar = (l1.s) nVar;
                objQ = sVar.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    l1.c0 c0Var = new l1.c0(l1.t.q(sVar));
                    sVar.o0(c0Var);
                    objQ = c0Var;
                }
                rz.b0 b0Var = ((l1.c0) objQ).f39245a;
                String strI = i1.p.i(sVar, R.string.m3c_date_range_picker_scroll_to_previous_month);
                String strI2 = i1.p.i(sVar, R.string.m3c_date_range_picker_scroll_to_next_month);
                l9 = this.f30719a;
                boolean zF3 = sVar.f(l9);
                l11 = this.f30720b;
                boolean zF4 = zF3 | sVar.f(l11);
                eVar = this.f30721c;
                zF = zF4 | sVar.f(eVar);
                objQ2 = sVar.Q();
                if (zF || objQ2 == gVar) {
                    objQ2 = new a0.j(l9, l11, eVar, 8);
                    sVar.o0(objQ2);
                }
                cVar = (fz.c) objQ2;
                l0.w wVar = this.f30722d;
                listL = ns.o.L(new g3.f(strI, new q3(1, wVar, b0Var)), new g3.f(strI2, new q3(0, wVar, b0Var)));
                z1.r rVarB = g3.r.b(z1.o.f58481a, false, o0.K);
                boolean zH = sVar.h(this.f30723e) | sVar.h(this.f30724f) | sVar.f(this.f30725t) | sVar.h(this.H) | sVar.h(listL);
                m2Var = this.K;
                zF2 = zH | sVar.f(m2Var) | sVar.f(l9) | sVar.f(l11) | sVar.f(cVar) | sVar.f(this.L) | sVar.f(this.M);
                objQ3 = sVar.Q();
                if (zF2 || objQ3 == gVar) {
                    m3 m3Var = new m3(this.f30723e, this.f30724f, this.f30725t, this.f30719a, this.f30720b, cVar, this.L, this.H, this.M, m2Var, listL);
                    sVar.o0(m3Var);
                    objQ3 = m3Var;
                }
                ue.f.b(rVarB, this.f30722d, null, null, null, null, false, (fz.c) objQ3, sVar, 0);
            }
        } else {
            sVar = (l1.s) nVar;
            objQ = sVar.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                l1.c0 c0Var2 = new l1.c0(l1.t.q(sVar));
                sVar.o0(c0Var2);
                objQ = c0Var2;
            }
            rz.b0 b0Var2 = ((l1.c0) objQ).f39245a;
            String strI3 = i1.p.i(sVar, R.string.m3c_date_range_picker_scroll_to_previous_month);
            String strI4 = i1.p.i(sVar, R.string.m3c_date_range_picker_scroll_to_next_month);
            l9 = this.f30719a;
            boolean zF5 = sVar.f(l9);
            l11 = this.f30720b;
            boolean zF6 = zF5 | sVar.f(l11);
            eVar = this.f30721c;
            zF = zF6 | sVar.f(eVar);
            objQ2 = sVar.Q();
            if (zF) {
                objQ2 = new a0.j(l9, l11, eVar, 8);
                sVar.o0(objQ2);
            } else {
                objQ2 = new a0.j(l9, l11, eVar, 8);
                sVar.o0(objQ2);
            }
            cVar = (fz.c) objQ2;
            l0.w wVar2 = this.f30722d;
            listL = ns.o.L(new g3.f(strI3, new q3(1, wVar2, b0Var2)), new g3.f(strI4, new q3(0, wVar2, b0Var2)));
            z1.r rVarB2 = g3.r.b(z1.o.f58481a, false, o0.K);
            boolean zH2 = sVar.h(this.f30723e) | sVar.h(this.f30724f) | sVar.f(this.f30725t) | sVar.h(this.H) | sVar.h(listL);
            m2Var = this.K;
            zF2 = zH2 | sVar.f(m2Var) | sVar.f(l9) | sVar.f(l11) | sVar.f(cVar) | sVar.f(this.L) | sVar.f(this.M);
            objQ3 = sVar.Q();
            if (zF2) {
                m3 m3Var2 = new m3(this.f30723e, this.f30724f, this.f30725t, this.f30719a, this.f30720b, cVar, this.L, this.H, this.M, m2Var, listL);
                sVar.o0(m3Var2);
                objQ3 = m3Var2;
            } else {
                m3 m3Var3 = new m3(this.f30723e, this.f30724f, this.f30725t, this.f30719a, this.f30720b, cVar, this.L, this.H, this.M, m2Var, listL);
                sVar.o0(m3Var3);
                objQ3 = m3Var3;
            }
            ue.f.b(rVarB2, this.f30722d, null, null, null, null, false, (fz.c) objQ3, sVar, 0);
        }
        return qy.b0.f48488a;
    }
}
