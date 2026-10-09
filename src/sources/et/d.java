package et;

import com.lingodeer.data.model.CourseWord;
import d1.z0;
import j3.u0;
import j3.x0;
import l1.k1;
import s0.h0;
import s0.o0;
import s0.o1;
import s0.s0;
import z2.q2;
import z2.u1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25848a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25853f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25854t;

    public /* synthetic */ d(rz.b0 b0Var, o oVar, boolean z11, x1.p pVar, fz.a aVar, fz.c cVar) {
        this.f25850c = b0Var;
        this.f25851d = oVar;
        this.f25849b = z11;
        this.f25852e = pVar;
        this.f25853f = aVar;
        this.f25854t = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        o3.c0 c0Var;
        w2.x xVar;
        w2.x xVar2;
        switch (this.f25848a) {
            case 0:
                rz.b0 b0Var = (rz.b0) this.f25850c;
                o oVar = (o) this.f25851d;
                x1.p pVar = (x1.p) this.f25852e;
                fz.a aVar = (fz.a) this.f25853f;
                fz.c cVar = (fz.c) this.f25854t;
                CourseWord option = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option, "option");
                rz.e0.B(b0Var, null, null, new g(oVar, this.f25849b, option, pVar, aVar, cVar, b0Var, null), 3);
                break;
            default:
                s0 s0Var = (s0) this.f25850c;
                k1 k1Var = s0Var.f51179o;
                q2 q2Var = (q2) this.f25851d;
                z0 z0Var = (z0) this.f25852e;
                o3.w wVar = (o3.w) this.f25853f;
                o3.p pVar2 = (o3.p) this.f25854t;
                w2.x xVar3 = (w2.x) obj;
                s0Var.f51173h = xVar3;
                o1 o1VarD = s0Var.d();
                if (o1VarD != null) {
                    o1VarD.f51125b = xVar3;
                }
                if (this.f25849b) {
                    if (s0Var.a() == h0.Selection) {
                        if (((Boolean) s0Var.f51177l.getValue()).booleanValue() && ((Boolean) ((u1) q2Var).f58681c.getValue()).booleanValue()) {
                            z0Var.q();
                        } else {
                            z0Var.n();
                        }
                        s0Var.m.setValue(Boolean.valueOf(ve.i.E(z0Var, true)));
                        s0Var.f51178n.setValue(Boolean.valueOf(ve.i.E(z0Var, false)));
                        k1Var.setValue(Boolean.valueOf(x0.c(wVar.f44705b)));
                    } else if (s0Var.a() == h0.Cursor) {
                        k1Var.setValue(Boolean.valueOf(ve.i.E(z0Var, true)));
                    }
                    o0.w(s0Var, wVar, pVar2);
                    o1 o1VarD2 = s0Var.d();
                    if (o1VarD2 != null && (c0Var = s0Var.f51170e) != null && s0Var.b() && (xVar = o1VarD2.f51125b) != null && xVar.k() && (xVar2 = o1VarD2.f51126c) != null) {
                        u0 u0Var = o1VarD2.f51124a;
                        av.t tVar = new av.t(xVar, 9);
                        f2.c cVarN = v10.c.N(xVar);
                        f2.c cVarE = xVar.E(xVar2, false);
                        if (kotlin.jvm.internal.m.a((o3.c0) c0Var.f44668a.f44708b.get(), c0Var)) {
                            c0Var.f44669b.h(wVar, pVar2, u0Var, tVar, cVarN, cVarE);
                        }
                    }
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d(s0 s0Var, boolean z11, q2 q2Var, z0 z0Var, o3.w wVar, o3.p pVar) {
        this.f25850c = s0Var;
        this.f25849b = z11;
        this.f25851d = q2Var;
        this.f25852e = z0Var;
        this.f25853f = wVar;
        this.f25854t = pVar;
    }
}
