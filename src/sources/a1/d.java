package a1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import at.p;
import b0.g;
import bp.r0;
import bt.p4;
import cr.m;
import d0.e0;
import d0.f0;
import d0.h;
import d0.i;
import d1.d0;
import dt.u2;
import e2.l;
import f0.a0;
import f0.c0;
import f0.g0;
import f0.i0;
import f0.n0;
import f0.s2;
import f0.t2;
import jt.i2;
import kotlin.jvm.internal.x;
import l1.g1;
import mt.c4;
import n9.q;
import ns.j;
import o0.t;
import qy.b0;
import s0.a1;
import s2.m0;
import s2.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f278b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f277a = i11;
        this.f278b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, vy.d dVar) {
        int i11 = this.f277a;
        int i12 = 17;
        int i13 = 4;
        final int i14 = 1;
        final int i15 = 0;
        vy.d dVar2 = null;
        Object obj = this.f278b;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                Object objC = t2.c(wVar, new c((e) obj, dVar2, i15), dVar);
                return objC == wy.a.COROUTINE_SUSPENDED ? objC : b0Var;
            case 1:
                final i2 i2Var = (i2) obj;
                p4 p4Var = new p4(i2Var, 1);
                fz.a aVar = new fz.a() { // from class: bt.c5
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                jt.i2 i2Var2 = i2Var;
                                i2Var2.f36976a.setValue(null);
                                i2Var2.f36978c.setValue(new f2.b(9205357640488583168L));
                                break;
                            default:
                                jt.i2 i2Var3 = i2Var;
                                i2Var3.f36976a.setValue(null);
                                i2Var3.f36978c.setValue(new f2.b(9205357640488583168L));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                fz.a aVar2 = new fz.a() { // from class: bt.c5
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                jt.i2 i2Var2 = i2Var;
                                i2Var2.f36976a.setValue(null);
                                i2Var2.f36978c.setValue(new f2.b(9205357640488583168L));
                                break;
                            default:
                                jt.i2 i2Var3 = i2Var;
                                i2Var3.f36976a.setValue(null);
                                i2Var3.f36978c.setValue(new f2.b(9205357640488583168L));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                androidx.lifecycle.viewmodel.compose.a aVar3 = new androidx.lifecycle.viewmodel.compose.a(i2Var, i12);
                float f5 = g0.f26277a;
                Object objC2 = t2.c(wVar, new a0(p4Var, aVar, aVar2, aVar3, null), dVar);
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                if (objC2 != aVar4) {
                    objC2 = b0Var;
                }
                return objC2 == aVar4 ? objC2 : b0Var;
            case 2:
                Object objC3 = t2.c(wVar, new h((i) obj, dVar2, i15), dVar);
                return objC3 == wy.a.COROUTINE_SUSPENDED ? objC3 : b0Var;
            case 3:
                f0 f0Var = (f0) obj;
                e0 e0Var = new e0(f0Var, null);
                com.google.firebase.datastorage.a aVar5 = new com.google.firebase.datastorage.a(f0Var, 11);
                ad.a0 a0Var = s2.f26428a;
                Object objL = rz.e0.l(new g(wVar, e0Var, (fz.c) null, (fz.c) null, aVar5, (vy.d) null), dVar);
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                if (objL != aVar6) {
                    objL = b0Var;
                }
                return objL == aVar6 ? objL : b0Var;
            case 4:
                Object objT0 = ((m0) wVar).T0(new d0(i15, (fz.c) obj, dVar2), dVar);
                return objT0 == wy.a.COROUTINE_SUSPENDED ? objT0 : b0Var;
            case 5:
                Object objL2 = rz.e0.l(new qg.e(i13, wVar, (a1) obj, dVar2), dVar);
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                if (objL2 != aVar7) {
                    objL2 = b0Var;
                }
                return objL2 == aVar7 ? objL2 : b0Var;
            case 6:
                g1 g1Var = (g1) obj;
                u2 u2Var = new u2(g1Var, i15);
                ch.b0 b0Var2 = new ch.b0(g1Var, i13);
                float f11 = g0.f26277a;
                Object objC4 = t2.c(wVar, new c0(new dv.e(i12), b0Var2, u2Var, new m(29), null, 1), dVar);
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                if (objC4 != aVar8) {
                    objC4 = b0Var;
                }
                return objC4 == aVar8 ? objC4 : b0Var;
            case 7:
                Object objD = s2.d(wVar, null, null, new r0(i13, (fz.a) obj), dVar, 7);
                return objD == wy.a.COROUTINE_SUSPENDED ? objD : b0Var;
            case 8:
                int i16 = 28;
                q qVar = new q(28);
                x xVar = new x();
                final n0 n0Var = (n0) obj;
                xVar.f38360a = y2.f.w(n0Var).x(0L);
                Object objL3 = rz.e0.l(new i0(wVar, n0Var, new p(8, n0Var, qVar), new aj.c(qVar, wVar, n0Var, i16), new fz.a() { // from class: f0.h0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                tz.h hVar = n0Var.W;
                                if (hVar != null) {
                                    hVar.i(o.f26380a);
                                }
                                return qy.b0.f48488a;
                            default:
                                return Boolean.valueOf(!n0Var.d1());
                        }
                    }
                }, new fz.a() { // from class: f0.h0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                tz.h hVar = n0Var.W;
                                if (hVar != null) {
                                    hVar.i(o.f26380a);
                                }
                                return qy.b0.f48488a;
                            default:
                                return Boolean.valueOf(!n0Var.d1());
                        }
                    }
                }, new at.i(n0Var, xVar, qVar, i16), null, 0), dVar);
                return objL3 == wy.a.COROUTINE_SUSPENDED ? objL3 : b0Var;
            case 9:
                Object objL4 = rz.e0.l(new j(3, wVar, (t) obj, dVar2), dVar);
                return objL4 == wy.a.COROUTINE_SUSPENDED ? objL4 : b0Var;
            case 10:
                Object objD2 = s2.d(wVar, null, null, new uu.i((l) obj, 2), dVar, 7);
                return objD2 == wy.a.COROUTINE_SUSPENDED ? objD2 : b0Var;
            default:
                Object objC5 = t2.c(wVar, new d0(i14, new c4(1, (y0.g) obj, y0.g.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 20), dVar2), dVar);
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                if (objC5 != aVar9) {
                    objC5 = b0Var;
                }
                return objC5 == aVar9 ? objC5 : b0Var;
        }
    }
}
