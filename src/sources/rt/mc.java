package rt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f50084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f50085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f50086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f50087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f50088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f50089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f50090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f50091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f50092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f50093k;

    public mc(v7 v7Var, os.a aVar, os.a aVar2, v7 v7Var2, v7 v7Var3, os.a aVar3) {
        this.f50083a = 0;
        this.f50084b = v7Var;
        this.f50085c = aVar;
        this.f50086d = aVar2;
        this.f50087e = v7Var2;
        this.f50088f = v7Var3;
        this.f50089g = aVar3;
        this.f50090h = new Object();
        this.f50091i = new LinkedHashMap();
        this.f50092j = new LinkedHashSet();
        this.f50093k = new aj.e(this, 18);
    }

    public static final void a(mc mcVar, z1.q qVar, y2.k1 k1Var) {
        for (z1.q qVar2 = qVar.f58486e; qVar2 != null; qVar2 = qVar2.f58486e) {
            if (qVar2 == ((y2.g1) mcVar.f50085c)) {
                y2.i0 i0VarW = ((y2.i0) mcVar.f50084b).w();
                k1Var.S = i0VarW != null ? (y2.v) i0VarW.f56892i0.f50086d : null;
                mcVar.f50087e = k1Var;
                return;
            } else {
                if ((qVar2.f58484c & 2) != 0) {
                    return;
                }
                qVar2.S0(k1Var);
            }
        }
    }

    public static final void b(mc mcVar, uv.b bVar, String str) {
        hc hcVar;
        boolean z11;
        kc kcVarH = h(bVar);
        synchronized (mcVar.f50090h) {
            hcVar = (hc) ((LinkedHashMap) mcVar.f50091i).get(kcVarH);
        }
        if (hcVar == null) {
            return;
        }
        if (((Boolean) ((v7) mcVar.f50084b).invoke(kcVarH.f49991b)).booleanValue()) {
            ((v7) mcVar.f50087e).invoke(str + " resolved by existing file: url=" + kcVarH.f49990a);
            mcVar.d(kcVarH);
            return;
        }
        synchronized (mcVar.f50090h) {
            if (hcVar.f49847b) {
                z11 = false;
            } else {
                z11 = true;
                hcVar.f49847b = true;
            }
        }
        if (!z11) {
            ((os.a) mcVar.f50089g).invoke(w4.c.h(str, " recovery exhausted: url=", kcVarH.f49990a, ", path=", kcVarH.f49991b), null);
            mcVar.d(kcVarH);
            return;
        }
        ((v7) mcVar.f50088f).invoke(str + " from conflicting task; taking ownership: url=" + kcVarH.f49990a);
        ((os.a) mcVar.f50086d).invoke(bVar, new mt.l0(mcVar, kcVarH, hcVar, 23));
    }

    public static z1.q e(z1.p pVar, z1.q qVar) {
        z1.q qVarF;
        if (pVar instanceof y2.d1) {
            qVarF = ((y2.d1) pVar).f();
            qVarF.f58484c = y2.l1.f(qVarF);
        } else {
            y2.c cVar = new y2.c();
            cVar.f58484c = y2.l1.d(pVar);
            cVar.Q = pVar;
            cVar.S = new HashSet();
            qVarF = cVar;
        }
        if (qVarF.P) {
            v2.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        qVarF.K = true;
        z1.q qVar2 = qVar.f58487f;
        if (qVar2 != null) {
            qVar2.f58486e = qVarF;
            qVarF.f58487f = qVar2;
        }
        qVar.f58487f = qVarF;
        qVarF.f58486e = qVar;
        return qVarF;
    }

    public static z1.q f(z1.q qVar) {
        boolean z11 = qVar.P;
        if (z11) {
            y.d0 d0Var = y2.l1.f56959a;
            if (!z11) {
                v2.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            y2.l1.a(qVar, -1, 2);
            qVar.Q0();
            qVar.K0();
        }
        z1.q qVar2 = qVar.f58487f;
        z1.q qVar3 = qVar.f58486e;
        if (qVar2 != null) {
            qVar2.f58486e = qVar3;
            qVar.f58487f = null;
        }
        if (qVar3 != null) {
            qVar3.f58487f = qVar2;
            qVar.f58486e = null;
        }
        kotlin.jvm.internal.m.c(qVar3);
        return qVar3;
    }

    public static kc h(uv.b bVar) {
        String str = bVar.f53184e;
        kotlin.jvm.internal.m.e(str, "getUrl(...)");
        String str2 = bVar.f53185f;
        kotlin.jvm.internal.m.e(str2, "getPath(...)");
        return new kc(str, str2);
    }

    public static void l(z1.p pVar, z1.p pVar2, z1.q qVar) {
        if ((pVar instanceof y2.d1) && (pVar2 instanceof y2.d1)) {
            kotlin.jvm.internal.m.d(qVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((y2.d1) pVar2).j(qVar);
            if (qVar.P) {
                y2.l1.c(qVar);
                return;
            } else {
                qVar.L = true;
                return;
            }
        }
        if (!(qVar instanceof y2.c)) {
            v2.a.b("Unknown Modifier.Node type");
            return;
        }
        y2.c cVar = (y2.c) qVar;
        if (cVar.P) {
            cVar.U0();
        }
        cVar.Q = pVar2;
        cVar.f58484c = y2.l1.d(pVar2);
        if (cVar.P) {
            cVar.T0(false);
        }
        if (qVar.P) {
            y2.l1.c(qVar);
        } else {
            qVar.L = true;
        }
    }

    public ArrayList c(kc kcVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((LinkedHashSet) this.f50092j).iterator();
        while (it.hasNext()) {
            jc jcVar = (jc) it.next();
            LinkedHashSet linkedHashSet = jcVar.f49937b;
            LinkedHashSet linkedHashSet2 = jcVar.f49937b;
            LinkedHashSet linkedHashSet3 = jcVar.f49938c;
            if (linkedHashSet.contains(kcVar) && linkedHashSet3.add(kcVar)) {
                boolean z11 = linkedHashSet3.size() == linkedHashSet2.size();
                if (z11) {
                    it.remove();
                }
                arrayList.add(new ic(jcVar.f49939d, jcVar.f49940e, linkedHashSet3.size() / linkedHashSet2.size(), z11));
            }
        }
        return arrayList;
    }

    public void d(kc kcVar) {
        ArrayList arrayListC;
        synchronized (this.f50090h) {
            ((LinkedHashMap) this.f50091i).remove(kcVar);
            arrayListC = c(kcVar);
        }
        int size = arrayListC.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListC.get(i11);
            i11++;
            ic icVar = (ic) obj;
            icVar.f49886a.invoke(Float.valueOf(icVar.f49888c));
            if (icVar.f49889d) {
                icVar.f49887b.invoke();
            }
        }
    }

    public boolean g(int i11) {
        return (i11 & ((z1.q) this.f50089g).f58485d) != 0;
    }

    public void i() {
        for (z1.q qVar = (z1.q) this.f50089g; qVar != null; qVar = qVar.f58487f) {
            qVar.P0();
            if (qVar.K) {
                y.d0 d0Var = y2.l1.f56959a;
                if (!qVar.P) {
                    v2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                y2.l1.a(qVar, -1, 1);
            }
            if (qVar.L) {
                y2.l1.c(qVar);
            }
            qVar.K = false;
            qVar.L = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0142 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a0
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public void j(int r32, n1.e r33, n1.e r34, z1.q r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.mc.j(int, n1.e, n1.e, z1.q, boolean):void");
    }

    public void k() {
        y2.b0 b0Var;
        y2.s1 s1Var;
        y2.i0 i0Var = (y2.i0) this.f50084b;
        y2.k1 k1Var = (y2.v) this.f50086d;
        for (z1.q qVar = ((y2.d2) this.f50088f).f58486e; qVar != null; qVar = qVar.f58486e) {
            y2.z zVarG = y2.f.g(qVar);
            if (zVarG != null) {
                y2.k1 k1Var2 = qVar.H;
                if (k1Var2 != null) {
                    b0Var = (y2.b0) k1Var2;
                    y2.z zVar = b0Var.f56825t0;
                    b0Var.D1(zVarG);
                    if (zVar != qVar && (s1Var = b0Var.f56957n0) != null) {
                        s1Var.invalidate();
                    }
                } else {
                    b0Var = new y2.b0(i0Var, zVarG);
                    qVar.S0(b0Var);
                }
                k1Var.S = b0Var;
                b0Var.R = k1Var;
                k1Var = b0Var;
            } else {
                qVar.S0(k1Var);
            }
        }
        y2.i0 i0VarW = i0Var.w();
        k1Var.S = i0VarW != null ? (y2.v) i0VarW.f56892i0.f50086d : null;
        this.f50087e = k1Var;
    }

    public String toString() {
        switch (this.f50083a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("[");
                z1.q qVar = (z1.q) this.f50089g;
                y2.d2 d2Var = (y2.d2) this.f50088f;
                if (qVar == d2Var) {
                    sb2.append("]");
                } else {
                    while (qVar != null && qVar != d2Var) {
                        sb2.append(String.valueOf(qVar));
                        if (qVar.f58487f == d2Var) {
                            sb2.append("]");
                        } else {
                            sb2.append(",");
                            qVar = qVar.f58487f;
                        }
                    }
                }
                String string = sb2.toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    public mc(y2.i0 i0Var) {
        this.f50083a = 1;
        this.f50084b = i0Var;
        y2.g1 g1Var = new y2.g1();
        g1Var.f58485d = -1;
        this.f50085c = g1Var;
        y2.v vVar = new y2.v(i0Var);
        this.f50086d = vVar;
        this.f50087e = vVar;
        y2.d2 d2Var = vVar.f57011t0;
        this.f50088f = d2Var;
        this.f50089g = d2Var;
        this.f50092j = new n1.e(new z1.r[16]);
    }
}
