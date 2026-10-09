package s0;

import fr.j3;
import java.util.LinkedHashMap;
import java.util.Map;
import z2.q2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f51006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f51007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f51008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f51009e;

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f51005a = i11;
        this.f51006b = obj;
        this.f51007c = obj2;
        this.f51008d = obj3;
        this.f51009e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objF;
        long j11;
        l1.s sVar;
        v3.c cVar;
        LinkedHashMap linkedHashMap;
        vg.a aVar;
        Object objQ;
        v3.l lVar;
        long jA;
        v3.l lVar2;
        long jA2;
        fz.c cVar2;
        v3.l lVar3;
        switch (this.f51005a) {
            case 0:
                z1.r rVar = (z1.r) obj;
                ((Number) obj3).intValue();
                s0 s0Var = (s0) this.f51007c;
                g2.t tVar = (g2.t) this.f51006b;
                o3.w wVar = (o3.w) this.f51008d;
                l1.s sVar2 = (l1.s) ((l1.n) obj2);
                sVar2.d0(-84507373);
                boolean zBooleanValue = ((Boolean) sVar2.j(z2.g1.f58561w)).booleanValue();
                boolean zG = sVar2.g(zBooleanValue);
                Object objQ2 = sVar2.Q();
                l1.g gVar = l1.m.f39353a;
                if (zG || objQ2 == gVar) {
                    objQ2 = new b1.m(zBooleanValue);
                    sVar2.o0(objQ2);
                }
                b1.m mVar = (b1.m) objQ2;
                boolean z11 = ((tVar instanceof g2.y0) && ((g2.y0) tVar).f28628a == 16) ? false : true;
                if (((Boolean) ((z2.u1) ((q2) sVar2.j(z2.g1.f58558t))).f58681c.getValue()).booleanValue() && s0Var.b() && j3.x0.c(wVar.f44705b) && z11) {
                    sVar2.d0(-707487962);
                    j3.h hVar = wVar.f44704a;
                    j3.x0 x0Var = new j3.x0(wVar.f44705b);
                    boolean zH = sVar2.h(mVar);
                    Object objQ3 = sVar2.Q();
                    if (zH || objQ3 == gVar) {
                        objQ3 = new mv.f0(mVar, null, 22);
                        sVar2.o0(objQ3);
                    }
                    l1.t.g(hVar, x0Var, (fz.e) objQ3, sVar2);
                    boolean zF = sVar2.f(tVar) | sVar2.f(wVar) | sVar2.h(mVar) | sVar2.h((o3.p) this.f51009e) | sVar2.h(s0Var);
                    o3.p pVar = (o3.p) this.f51009e;
                    o3.w wVar2 = (o3.w) this.f51008d;
                    g2.t tVar2 = (g2.t) this.f51006b;
                    Object objQ4 = sVar2.Q();
                    if (zF || objQ4 == gVar) {
                        b1.a aVar2 = new b1.a(mVar, pVar, wVar2, s0Var, tVar2);
                        sVar2.o0(aVar2);
                        objQ4 = aVar2;
                    }
                    objF = d2.h.f(rVar, (fz.c) objQ4);
                    sVar2.p(false);
                } else {
                    sVar2.d0(-705473241);
                    sVar2.p(false);
                    objF = z1.o.f58481a;
                }
                sVar2.p(false);
                return objF;
            default:
                j0.s BoxWithConstraints = (j0.s) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.f(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(BoxWithConstraints) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18) {
                    l1.s sVar3 = (l1.s) nVar;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        Map map = (Map) this.f51006b;
                        j11 = BoxWithConstraints.f35407b;
                        sVar = (l1.s) nVar;
                        sVar.d0(1382998036);
                        cVar = (v3.c) sVar.j(z2.g1.f58547h);
                        linkedHashMap = new LinkedHashMap(ry.x.W(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            aVar = (vg.a) entry.getValue();
                            long jB = v3.b.b(v3.a.h(j11), v3.a.g(j11), 5);
                            sVar.d0(-1990137059);
                            sVar.d0(397564499);
                            objQ = sVar.Q();
                            if (objQ == l1.m.f39353a) {
                                cVar2 = aVar.f54016a;
                                if (cVar2 != null) {
                                    lVar3 = (v3.l) cVar2.invoke(cVar);
                                } else {
                                    lVar3 = null;
                                }
                                l1.k1 k1Var = new l1.k1(lVar3, l1.g.f39303t);
                                sVar.o0(k1Var);
                                objQ = k1Var;
                            }
                            l1.b1 b1Var = (l1.b1) objQ;
                            sVar.p(false);
                            lVar = (v3.l) b1Var.getValue();
                            if (lVar != null) {
                                jA = cVar.I((int) (lVar.f53498a >> 32));
                            } else {
                                jA = j3.A(0);
                            }
                            long j12 = jA;
                            lVar2 = (v3.l) b1Var.getValue();
                            if (lVar2 != null) {
                                jA2 = cVar.I((int) (lVar2.f53498a & 4294967295L));
                            } else {
                                jA2 = j3.A(1);
                            }
                            long j13 = jA2;
                            aVar.getClass();
                            k0 k0Var = new k0(new j3.e0(j12, 1, j13), t1.e.d(-877544637, new vg.c(jB, aVar, cVar, b1Var), sVar));
                            sVar.p(false);
                            linkedHashMap.put(key, k0Var);
                        }
                        sVar.p(false);
                        tg.h0.a((tg.i0) this.f51007c, (j3.h) this.f51008d, null, (fz.c) this.f51009e, linkedHashMap, nVar, 0, 2);
                    }
                } else {
                    Map map2 = (Map) this.f51006b;
                    j11 = BoxWithConstraints.f35407b;
                    sVar = (l1.s) nVar;
                    sVar.d0(1382998036);
                    cVar = (v3.c) sVar.j(z2.g1.f58547h);
                    linkedHashMap = new LinkedHashMap(ry.x.W(map2.size()));
                    while (r2.hasNext()) {
                        Object key2 = entry.getKey();
                        aVar = (vg.a) entry.getValue();
                        long jB2 = v3.b.b(v3.a.h(j11), v3.a.g(j11), 5);
                        sVar.d0(-1990137059);
                        sVar.d0(397564499);
                        objQ = sVar.Q();
                        if (objQ == l1.m.f39353a) {
                            cVar2 = aVar.f54016a;
                            if (cVar2 != null) {
                                lVar3 = (v3.l) cVar2.invoke(cVar);
                            } else {
                                lVar3 = null;
                            }
                            l1.k1 k1Var2 = new l1.k1(lVar3, l1.g.f39303t);
                            sVar.o0(k1Var2);
                            objQ = k1Var2;
                        }
                        l1.b1 b1Var2 = (l1.b1) objQ;
                        sVar.p(false);
                        lVar = (v3.l) b1Var2.getValue();
                        if (lVar != null) {
                            jA = cVar.I((int) (lVar.f53498a >> 32));
                        } else {
                            jA = j3.A(0);
                        }
                        long j14 = jA;
                        lVar2 = (v3.l) b1Var2.getValue();
                        if (lVar2 != null) {
                            jA2 = cVar.I((int) (lVar2.f53498a & 4294967295L));
                        } else {
                            jA2 = j3.A(1);
                        }
                        long j15 = jA2;
                        aVar.getClass();
                        k0 k0Var2 = new k0(new j3.e0(j14, 1, j15), t1.e.d(-877544637, new vg.c(jB2, aVar, cVar, b1Var2), sVar));
                        sVar.p(false);
                        linkedHashMap.put(key2, k0Var2);
                    }
                    sVar.p(false);
                    tg.h0.a((tg.i0) this.f51007c, (j3.h) this.f51008d, null, (fz.c) this.f51009e, linkedHashMap, nVar, 0, 2);
                }
                return qy.b0.f48488a;
        }
    }
}
