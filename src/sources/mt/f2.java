package mt;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f2 implements fz.c {
    public final /* synthetic */ l1.b1 H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41398a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f41400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j9.v f41401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f41402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41403f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.c f41404t;

    public /* synthetic */ f2(List list, boolean z11, fz.a aVar, j9.v vVar, fz.c cVar, rt.b4 b4Var, l1.b1 b1Var, fz.c cVar2, l1.b1 b1Var2, l1.a1 a1Var) {
        this.K = list;
        this.f41399b = z11;
        this.f41400c = aVar;
        this.f41401d = vVar;
        this.f41402e = cVar;
        this.L = b4Var;
        this.f41403f = b1Var;
        this.f41404t = cVar2;
        this.H = b1Var2;
        this.M = a1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f41398a) {
            case 0:
                final rt.j2 j2Var = (rt.j2) this.K;
                final rz.b0 b0Var = (rz.b0) this.M;
                final fz.a aVar = (fz.a) this.L;
                j9.t NavHost = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                final boolean z11 = this.f41399b;
                final fz.a aVar2 = this.f41400c;
                final j9.v vVar = this.f41401d;
                final l1.b1 b1Var = this.f41403f;
                final l1.b1 b1Var2 = this.H;
                c.a.g(NavHost, "index", null, null, new t1.d(new fz.g() { // from class: mt.g2
                    @Override // fz.g
                    public final Object f(Object obj2, Object obj3, Object obj4, Object obj5) {
                        Object aVar3;
                        a0.r composable = (a0.r) obj2;
                        j9.e it = (j9.e) obj3;
                        l1.n nVar = (l1.n) obj4;
                        ((Integer) obj5).getClass();
                        kotlin.jvm.internal.m.f(composable, "$this$composable");
                        kotlin.jvm.internal.m.f(it, "it");
                        rt.j2 j2Var2 = j2Var;
                        rt.g2 g2Var = (rt.g2) FlowExtKt.collectAsStateWithLifecycle(j2Var2.T, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, nVar, 0, 7).getValue();
                        if (kotlin.jvm.internal.m.a(g2Var, rt.e2.f49665a)) {
                            l1.s sVar = (l1.s) nVar;
                            sVar.d0(-1077698713);
                            tv.a.d(0, 1, sVar, null);
                            sVar.p(false);
                        } else {
                            if (!(g2Var instanceof rt.f2)) {
                                throw nv.p.x((l1.s) nVar, -1077697331, false);
                            }
                            l1.s sVar2 = (l1.s) nVar;
                            sVar2.d0(951280077);
                            rt.f2 f2Var = (rt.f2) g2Var;
                            int size = f2Var.f49711b.size();
                            int size2 = f2Var.f49710a.size();
                            boolean z12 = f2Var.f49714e;
                            boolean z13 = f2Var.f49715f;
                            List list = f2Var.f49713d;
                            boolean z14 = f2Var.f49717h;
                            int i11 = f2Var.f49718i;
                            boolean z15 = f2Var.f49719j;
                            int i12 = f2Var.f49720k;
                            boolean z16 = f2Var.m;
                            q2 q2Var = f2Var.f49716g;
                            rz.b0 b0Var2 = b0Var;
                            boolean zH = sVar2.h(b0Var2) | sVar2.h(j2Var2);
                            j9.v vVar2 = vVar;
                            boolean zH2 = zH | sVar2.h(vVar2);
                            Object objQ = sVar2.Q();
                            l1.g gVar = l1.m.f39353a;
                            if (zH2 || objQ == gVar) {
                                aVar3 = new b0.a(b0Var2, j2Var2, vVar2, b1Var, 23);
                                sVar2.o0(aVar3);
                            } else {
                                aVar3 = objQ;
                            }
                            fz.c cVar = (fz.c) aVar3;
                            boolean zH3 = sVar2.h(vVar2);
                            Object objQ2 = sVar2.Q();
                            if (zH3 || objQ2 == gVar) {
                                objQ2 = new j9.g(vVar2, 11);
                                sVar2.o0(objQ2);
                            }
                            fz.a aVar4 = (fz.a) objQ2;
                            boolean zH4 = sVar2.h(j2Var2);
                            Object objQ3 = sVar2.Q();
                            if (zH4 || objQ3 == gVar) {
                                objQ3 = new i2(j2Var2, 1);
                                sVar2.o0(objQ3);
                            }
                            fz.c cVar2 = (fz.c) objQ3;
                            boolean zH5 = sVar2.h(j2Var2);
                            Object objQ4 = sVar2.Q();
                            if (zH5 || objQ4 == gVar) {
                                objQ4 = new i2(j2Var2, 2);
                                sVar2.o0(objQ4);
                            }
                            fz.c cVar3 = (fz.c) objQ4;
                            boolean zH6 = sVar2.h(j2Var2);
                            Object objQ5 = sVar2.Q();
                            if (zH6 || objQ5 == gVar) {
                                objQ5 = new i2(j2Var2, 3);
                                sVar2.o0(objQ5);
                            }
                            fz.c cVar4 = (fz.c) objQ5;
                            boolean zH7 = sVar2.h(j2Var2);
                            Object objQ6 = sVar2.Q();
                            if (zH7 || objQ6 == gVar) {
                                objQ6 = new i2(j2Var2, 4);
                                sVar2.o0(objQ6);
                            }
                            fz.c cVar5 = (fz.c) objQ6;
                            boolean zH8 = sVar2.h(vVar2);
                            Object objQ7 = sVar2.Q();
                            if (zH8 || objQ7 == gVar) {
                                objQ7 = new j9.g(vVar2, 12);
                                sVar2.o0(objQ7);
                            }
                            fz.a aVar5 = (fz.a) objQ7;
                            boolean zH9 = sVar2.h(vVar2);
                            Object objQ8 = sVar2.Q();
                            if (zH9 || objQ8 == gVar) {
                                objQ8 = new j9.g(vVar2, 13);
                                sVar2.o0(objQ8);
                            }
                            fz.a aVar6 = (fz.a) objQ8;
                            Object objQ9 = sVar2.Q();
                            if (objQ9 == gVar) {
                                objQ9 = new w1(7, b1Var2);
                                sVar2.o0(objQ9);
                            }
                            p2.b(size, size2, list, z12, z13, z11, z14, i11, z15, i12, z16, q2Var, aVar2, cVar, aVar4, aVar, cVar2, cVar3, cVar4, cVar5, aVar5, aVar6, (fz.a) objQ9, sVar2, 0, 0, 384);
                            sVar2.p(false);
                        }
                        return qy.b0.f48488a;
                    }
                }, true, 486028856), 254);
                c.a.g(NavHost, "customize_review", null, null, new t1.d(new br.u(j2Var, vVar, b1Var2, b1Var), true, 530378145), 254);
                fz.c cVar = this.f41402e;
                fz.c cVar2 = this.f41404t;
                c.a.g(NavHost, "test", null, null, new t1.d(new br.u(j2Var, cVar, cVar2, vVar, 6), true, -1211845696), 254);
                c.a.g(NavHost, "srs_test", null, null, new t1.d(new fu.d(j2Var, vVar, cVar, cVar2, b1Var), true, 1340897759), 254);
                c.a.g(NavHost, "explain", null, null, new t1.d(new cs.b(vVar, 8), true, -401326082), 254);
                c.a.g(NavHost, "scheduled_srs", null, null, new t1.d(new bp.b2((Object) j2Var, vVar, (Object) aVar2, 8), true, -2143549923), 254);
                break;
            default:
                final List list = (List) this.K;
                final rt.b4 b4Var = (rt.b4) this.L;
                l1.a1 a1Var = (l1.a1) this.M;
                j9.t NavHost2 = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost2, "$this$NavHost");
                final boolean z12 = this.f41399b;
                final fz.a aVar3 = this.f41400c;
                final j9.v vVar2 = this.f41401d;
                final fz.c cVar3 = this.f41402e;
                final l1.b1 b1Var3 = this.f41403f;
                c.a.g(NavHost2, "review", null, null, new t1.d(new fz.g() { // from class: mt.z1
                    @Override // fz.g
                    public final Object f(Object obj2, Object obj3, Object obj4, Object obj5) {
                        ep.a.A((Integer) obj5, (a0.r) obj2, "$this$composable", (j9.e) obj3, "it");
                        l1.s sVar = (l1.s) ((l1.n) obj4);
                        Object objQ = sVar.Q();
                        if (objQ == l1.m.f39353a) {
                            objQ = new com.lingo.lingoskill.object.a(28);
                            sVar.o0(objQ);
                        }
                        ys.o3.a((fz.c) objQ, null, t1.e.d(775621960, new es.g(list, z12, aVar3, vVar2, cVar3, b4Var, b1Var3), sVar), sVar, 390);
                        return qy.b0.f48488a;
                    }
                }, true, 1459985068), 254);
                fz.c cVar4 = this.f41404t;
                l1.b1 b1Var4 = this.H;
                c.a.g(NavHost2, "finish", null, null, new t1.d(new iv.b0(aVar3, cVar4, b4Var, b1Var4, a1Var, b1Var3), true, -1913341341), 254);
                c.a.g(NavHost2, "customize_srs_suggestions", null, null, new t1.d(new bp.b2(b4Var, b1Var4, vVar2, 7), true, 1316658724), 254);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ f2(rt.j2 j2Var, boolean z11, fz.a aVar, rz.b0 b0Var, j9.v vVar, fz.a aVar2, l1.b1 b1Var, l1.b1 b1Var2, fz.c cVar, fz.c cVar2) {
        this.K = j2Var;
        this.f41399b = z11;
        this.f41400c = aVar;
        this.M = b0Var;
        this.f41401d = vVar;
        this.L = aVar2;
        this.f41403f = b1Var;
        this.H = b1Var2;
        this.f41402e = cVar;
        this.f41404t = cVar2;
    }
}
