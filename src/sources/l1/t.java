package l1;

import bt.e6;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bq.h f39462a = new bq.h(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f39463b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f39464c = new j0();

    public static List A(p2 p2Var, int i11, p2 p2Var2, boolean z11, boolean z12, boolean z13) {
        List list;
        boolean z14;
        int iU = p2Var.u(i11);
        int i12 = i11 + iU;
        int iF = p2Var.f(i11);
        int iF2 = p2Var.f(i12);
        int i13 = iF2 - iF;
        boolean z15 = i11 >= 0 && (p2Var.f39397b[(p2Var.r(i11) * 5) + 1] & 201326592) != 0;
        p2Var2.w(iU);
        p2Var2.x(i13, p2Var2.f39414t);
        if (p2Var.f39402g < i12) {
            p2Var.B(i12);
        }
        if (p2Var.f39406k < iF2) {
            p2Var.C(iF2, i12);
        }
        int[] iArr = p2Var2.f39397b;
        int i14 = p2Var2.f39414t;
        int i15 = i14 * 5;
        ry.l.H(i15, i11 * 5, p2Var.f39397b, iArr, i12 * 5);
        Object[] objArr = p2Var2.f39398c;
        int i16 = p2Var2.f39404i;
        System.arraycopy(p2Var.f39398c, iF, objArr, i16, i13);
        int i17 = p2Var2.f39416v;
        iArr[i15 + 2] = i17;
        int i18 = i14 - i11;
        int i19 = i14 + iU;
        int iG = i16 - p2Var2.g(iArr, i14);
        int i21 = p2Var2.m;
        int i22 = p2Var2.f39407l;
        int length = objArr.length;
        boolean z16 = z15;
        int i23 = i21;
        int i24 = i14;
        while (i24 < i19) {
            if (i24 != i14) {
                int i25 = (i24 * 5) + 2;
                iArr[i25] = iArr[i25] + i18;
            }
            int[] iArr2 = iArr;
            iArr2[(i24 * 5) + 4] = p2.i(p2Var2.g(iArr, i24) + iG, i23 < i24 ? 0 : p2Var2.f39406k, i22, length);
            if (i24 == i23) {
                i23++;
            }
            i24++;
            i14 = i14;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        p2Var2.m = i23;
        int iB = o2.b(p2Var.f39399d, i11, p2Var.p());
        int iB2 = o2.b(p2Var.f39399d, i12, p2Var.p());
        if (iB < iB2) {
            ArrayList arrayList = p2Var.f39399d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i26 = iB; i26 < iB2; i26++) {
                b bVar = (b) arrayList.get(i26);
                bVar.f39235a += i18;
                arrayList2.add(bVar);
            }
            p2Var2.f39399d.addAll(o2.b(p2Var2.f39399d, p2Var2.f39414t, p2Var2.p()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = ry.r.f50854a;
        }
        if (!list.isEmpty()) {
            HashMap map = p2Var.f39400e;
            HashMap map2 = p2Var2.f39400e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i27 = 0; i27 < size; i27++) {
                }
            }
        }
        int i28 = p2Var2.f39416v;
        p2Var2.O(i17);
        int iE = p2Var.E(p2Var.f39397b, i11);
        if (!z13) {
            z14 = false;
        } else if (z11) {
            boolean z17 = iE >= 0;
            if (z17) {
                p2Var.P();
                p2Var.a(iE - p2Var.f39414t);
                p2Var.P();
            }
            p2Var.a(i11 - p2Var.f39414t);
            boolean zH = p2Var.H();
            if (z17) {
                p2Var.M();
                p2Var.j();
                p2Var.M();
                p2Var.j();
            }
            z14 = zH;
        } else {
            boolean zI = p2Var.I(i11, iU);
            p2Var.J(iF, i13, i11 - 1);
            z14 = zI;
        }
        if (z14) {
            u.a("Unexpectedly removed anchors");
        }
        int i29 = p2Var2.f39409o;
        int i30 = iArr3[i15 + 1];
        p2Var2.f39409o = i29 + ((1073741824 & i30) != 0 ? 1 : i30 & 67108863);
        if (z12) {
            p2Var2.f39414t = i19;
            p2Var2.f39404i = i16 + i13;
        }
        if (z16) {
            p2Var2.T(i17);
        }
        return list;
    }

    public static k1 B(Object obj) {
        return new k1(obj, g.f39303t);
    }

    public static final b1 C(fz.e eVar, Object obj, n nVar) {
        s sVar = (s) nVar;
        Object objQ = sVar.Q();
        g gVar = m.f39353a;
        if (objQ == gVar) {
            objQ = B(obj);
            sVar.o0(objQ);
        }
        b1 b1Var = (b1) objQ;
        boolean zH = sVar.h(eVar);
        Object objQ2 = sVar.Q();
        if (zH || objQ2 == gVar) {
            objQ2 = new x2(eVar, b1Var, null, 0);
            sVar.o0(objQ2);
        }
        f((fz.e) objQ2, qy.b0.f48488a, sVar);
        return b1Var;
    }

    public static final b1 D(Object obj, Object obj2, Object obj3, fz.e eVar, n nVar, int i11) {
        s sVar = (s) nVar;
        Object objQ = sVar.Q();
        g gVar = m.f39353a;
        if (objQ == gVar) {
            objQ = B(obj);
            sVar.o0(objQ);
        }
        b1 b1Var = (b1) objQ;
        boolean zH = sVar.h(eVar);
        Object objQ2 = sVar.Q();
        if (zH || objQ2 == gVar) {
            objQ2 = new x2(eVar, b1Var, null, 2);
            sVar.o0(objQ2);
        }
        g(obj2, obj3, (fz.e) objQ2, sVar);
        return b1Var;
    }

    public static final Object E(q1 q1Var, v1 v1Var) {
        kotlin.jvm.internal.m.d(v1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        t1.i iVar = (t1.i) q1Var;
        Object objB = iVar.get(v1Var);
        if (objB == null) {
            objB = v1Var.b();
        }
        return ((e3) objB).a(iVar);
    }

    public static final void F(n nVar, fz.c cVar) {
        ((s) nVar).b(qy.b0.f48488a, new e6(cVar, 8));
    }

    public static final q G(n nVar) {
        s sVar = (s) nVar;
        sVar.Z(206, u.f39478e);
        if (sVar.S) {
            p2.z(sVar.I);
        }
        Object objI = sVar.I();
        g2 j2Var = objI instanceof g2 ? (g2) objI : null;
        if (j2Var == null) {
            j2Var = new j2(new p(new q(sVar, sVar.T, sVar.f39449q, sVar.C, sVar.f39441h.V)), -1);
            sVar.p0(j2Var);
        }
        f2 f2Var = j2Var.f39309a;
        kotlin.jvm.internal.m.d(f2Var, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl.CompositionContextHolder");
        q qVar = ((p) f2Var).f39387a;
        qVar.f39424f.setValue(sVar.l());
        sVar.p(false);
        return qVar;
    }

    public static final b1 H(Object obj, n nVar) {
        s sVar = (s) nVar;
        Object objQ = sVar.Q();
        if (objQ == m.f39353a) {
            objQ = B(obj);
            sVar.o0(objQ);
        }
        b1 b1Var = (b1) objQ;
        b1Var.setValue(obj);
        return b1Var;
    }

    public static final void I(p2 p2Var, int i11, Object obj) {
        int iH = p2Var.h(i11);
        Object[] objArr = p2Var.f39398c;
        Object obj2 = objArr[iH];
        objArr[iH] = m.f39353a;
        if (obj == obj2) {
            return;
        }
        u.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void J(fz.e eVar, Object obj, n nVar) {
        s sVar = (s) nVar;
        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), obj)) {
            sVar.o0(obj);
            sVar.b(obj, eVar);
        }
    }

    public static final gp.r K(fz.a aVar) {
        return new gp.r(new av.e(aVar, null));
    }

    public static final int L(y.w wVar) {
        int iC;
        int i11 = wVar.f56783b;
        int iC2 = wVar.c(0);
        while (wVar.f56783b != 0 && wVar.c(0) == iC2) {
            wVar.g(0, wVar.d());
            wVar.f(wVar.f56783b - 1);
            int i12 = wVar.f56783b;
            int i13 = i12 >>> 1;
            int i14 = 0;
            while (i14 < i13) {
                int iC3 = wVar.c(i14);
                int i15 = (i14 + 1) * 2;
                int i16 = i15 - 1;
                int iC4 = wVar.c(i16);
                if (i15 < i12 && (iC = wVar.c(i15)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    wVar.g(i14, iC);
                    wVar.g(i15, iC3);
                    i14 = i15;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    wVar.g(i14, iC4);
                    wVar.g(i16, iC3);
                    i14 = i16;
                }
            }
        }
        return iC2;
    }

    public static final int M(int i11) {
        int i12 = 306783378 & i11;
        int i13 = 613566756 & i11;
        return (i11 & (-920350135)) | (i13 >> 1) | i12 | ((i12 << 1) & i13);
    }

    public static final t1.i N(w1[] w1VarArr, q1 q1Var, q1 q1Var2) {
        t1.i iVar = t1.i.f51992d;
        t1.h hVar = new t1.h(iVar);
        hVar.f51991t = iVar;
        for (w1 w1Var : w1VarArr) {
            v1 v1Var = w1Var.f39488a;
            if (w1Var.f39493f || !((t1.i) q1Var).containsKey(v1Var)) {
                hVar.put(v1Var, v1Var.c(w1Var, (e3) ((t1.i) q1Var2).get(v1Var)));
            }
        }
        return hVar.build();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(w1 w1Var, fz.e eVar, n nVar, int i11) {
        e3 e3Var;
        boolean z11;
        x1 x1VarT;
        s sVar = (s) nVar;
        sVar.f0(-149765515);
        p0 p0Var = sVar.f39456x;
        q1 q1VarL = sVar.l();
        sVar.Z(201, u.f39475b);
        Object objQ = sVar.Q();
        if (kotlin.jvm.internal.m.a(objQ, m.f39353a)) {
            e3Var = null;
        } else {
            kotlin.jvm.internal.m.d(objQ, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            e3Var = (e3) objQ;
        }
        v1 v1Var = w1Var.f39488a;
        e3 e3VarC = v1Var.c(w1Var, e3Var);
        boolean zEquals = e3VarC.equals(e3Var);
        if (!zEquals) {
            sVar.o0(e3VarC);
        }
        if (!sVar.S) {
            l2 l2Var = sVar.G;
            Object objB = l2Var.b(l2Var.f39341b, l2Var.f39346g);
            kotlin.jvm.internal.m.d(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            q1 q1Var = (q1) objB;
            if (!(sVar.F() && zEquals) && (w1Var.f39493f || !((t1.i) q1VarL).containsKey(v1Var))) {
                q1VarL = ((t1.i) q1VarL).c(v1Var, e3VarC);
            } else if ((zEquals && !sVar.f39455w) || !sVar.f39455w) {
                q1VarL = q1Var;
            }
            if (sVar.f39457y || q1Var != q1VarL) {
                z11 = true;
            }
            if (z11 && !sVar.S) {
                sVar.O(q1VarL);
            }
            p0Var.d(sVar.f39455w ? 1 : 0);
            sVar.f39455w = z11;
            sVar.K = q1VarL;
            sVar.X(u.f39476c, 202, 0, q1VarL);
            eVar.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
            sVar.p(false);
            sVar.p(false);
            sVar.f39455w = p0Var.c() != 0;
            sVar.K = null;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new b0.t1(w1Var, i11, 13, eVar);
            }
        }
        if (w1Var.f39493f || !((t1.i) q1VarL).containsKey(v1Var)) {
            q1VarL = ((t1.i) q1VarL).c(v1Var, e3VarC);
        }
        sVar.J = true;
        z11 = false;
        if (z11) {
            sVar.O(q1VarL);
        }
        p0Var.d(sVar.f39455w ? 1 : 0);
        sVar.f39455w = z11;
        sVar.K = q1VarL;
        sVar.X(u.f39476c, 202, 0, q1VarL);
        eVar.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
        sVar.p(false);
        sVar.p(false);
        sVar.f39455w = p0Var.c() != 0;
        sVar.K = null;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(w1Var, i11, 13, eVar);
        }
    }

    public static final void c(Object obj, fz.c cVar, n nVar) {
        s sVar = (s) nVar;
        boolean zF = sVar.f(obj);
        Object objQ = sVar.Q();
        if (zF || objQ == m.f39353a) {
            objQ = new h0(cVar);
            sVar.o0(objQ);
        }
    }

    public static final void d(Object obj, Object obj2, fz.c cVar, n nVar) {
        s sVar = (s) nVar;
        boolean zF = sVar.f(obj) | sVar.f(obj2);
        Object objQ = sVar.Q();
        if (zF || objQ == m.f39353a) {
            objQ = new h0(cVar);
            sVar.o0(objQ);
        }
    }

    public static final void e(Object[] objArr, fz.c cVar, n nVar) {
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= ((s) nVar).f(obj);
        }
        s sVar = (s) nVar;
        Object objQ = sVar.Q();
        if (zF || objQ == m.f39353a) {
            sVar.o0(new h0(cVar));
        }
    }

    public static final void f(fz.e eVar, Object obj, n nVar) {
        s sVar = (s) nVar;
        vy.i iVar = sVar.R;
        boolean zF = sVar.f(obj);
        Object objQ = sVar.Q();
        if (zF || objQ == m.f39353a) {
            objQ = new u0(iVar, eVar);
            sVar.o0(objQ);
        }
    }

    public static final void g(Object obj, Object obj2, fz.e eVar, n nVar) {
        s sVar = (s) nVar;
        vy.i iVar = sVar.R;
        boolean zF = sVar.f(obj) | sVar.f(obj2);
        Object objQ = sVar.Q();
        if (zF || objQ == m.f39353a) {
            objQ = new u0(iVar, eVar);
            sVar.o0(objQ);
        }
    }

    public static final void h(Object obj, Object obj2, Object obj3, fz.e eVar, n nVar) {
        s sVar = (s) nVar;
        vy.i iVar = sVar.R;
        boolean zF = sVar.f(obj) | sVar.f(obj2) | sVar.f(obj3);
        Object objQ = sVar.Q();
        if (zF || objQ == m.f39353a) {
            objQ = new u0(iVar, eVar);
            sVar.o0(objQ);
        }
    }

    public static final void i(Object[] objArr, fz.e eVar, n nVar) {
        s sVar = (s) nVar;
        vy.i iVar = sVar.R;
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= sVar.f(obj);
        }
        Object objQ = sVar.Q();
        if (zF || objQ == m.f39353a) {
            sVar.o0(new u0(iVar, eVar));
        }
    }

    public static final void j(fz.a aVar, n nVar) {
        m1.l0 l0Var = ((s) nVar).M.f40765b.f40762d;
        l0Var.K(m1.b0.f40776c);
        qx.p.C(l0Var, 0, aVar);
    }

    public static final void k(int i11, int i12, List list) {
        int iU = u(i11, list);
        if (iU < 0) {
            iU = -(iU + 1);
        }
        while (iU < list.size() && ((q0) list.get(iU)).f39427b < i12) {
        }
    }

    public static final void l(y.w wVar, int i11) {
        if (wVar.f56783b == 0 || !(wVar.c(0) == i11 || wVar.c(wVar.f56783b - 1) == i11)) {
            int i12 = wVar.f56783b;
            wVar.a(i11);
            while (i12 > 0) {
                int i13 = ((i12 + 1) >>> 1) - 1;
                int iC = wVar.c(i13);
                if (i11 <= iC) {
                    break;
                }
                wVar.g(i12, iC);
                i12 = i13;
            }
            wVar.g(i12, i11);
        }
    }

    public static void m(p2 p2Var, List list, z zVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iC = p2Var.c((b) list.get(i11));
            int iN = p2Var.N(p2Var.f39397b, p2Var.r(iC));
            Object obj = iN < p2Var.g(p2Var.f39397b, p2Var.r(iC + 1)) ? p2Var.f39398c[p2Var.h(iN)] : m.f39353a;
            x1 x1Var = obj instanceof x1 ? (x1) obj : null;
            if (x1Var != null) {
                x1Var.f39499a = zVar;
            }
        }
    }

    public static final b1 n(uz.i iVar, Object obj, vy.i iVar2, n nVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            iVar2 = vy.j.f54321a;
        }
        vy.i iVar3 = iVar2;
        s sVar = (s) nVar;
        boolean zH = sVar.h(iVar3) | sVar.h(iVar);
        Object objQ = sVar.Q();
        if (zH || objQ == m.f39353a) {
            objQ = new kr.w(5, iVar3, iVar, null);
            sVar.o0(objQ);
        }
        return D(obj, iVar, iVar3, (fz.e) objQ, sVar, ((i11 >> 3) & 14) | (i11 & 896));
    }

    public static final b1 o(uz.g1 g1Var, n nVar) {
        return n(g1Var, g1Var.getValue(), vy.j.f54321a, nVar, 0, 0);
    }

    public static final void p(l2 l2Var, ArrayList arrayList, int i11) {
        boolean zL = l2Var.l(i11);
        int[] iArr = l2Var.f39341b;
        if (zL) {
            arrayList.add(l2Var.n(i11));
            return;
        }
        int i12 = iArr[(i11 * 5) + 3] + i11;
        for (int i13 = i11 + 1; i13 < i12; i13 += iArr[(i13 * 5) + 3]) {
            p(l2Var, arrayList, i13);
        }
    }

    public static final rz.b0 q(n nVar) {
        return new i2(((s) nVar).R);
    }

    public static final n1.e r() {
        m4 m4Var = w2.f39495b;
        n1.e eVar = (n1.e) m4Var.e();
        if (eVar != null) {
            return eVar;
        }
        n1.e eVar2 = new n1.e(new r[0]);
        m4Var.m(eVar2);
        return eVar2;
    }

    public static final g0 s(fz.a aVar) {
        m4 m4Var = w2.f39494a;
        return new g0(aVar, null);
    }

    public static final g0 t(fz.a aVar, v2 v2Var) {
        m4 m4Var = w2.f39494a;
        return new g0(aVar, v2Var);
    }

    public static final int u(int i11, List list) {
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int iH = kotlin.jvm.internal.m.h(((q0) list.get(i13)).f39427b, i11);
            if (iH < 0) {
                i12 = i13 + 1;
            } else {
                if (iH <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int v(n nVar) {
        nVar.getClass();
        return Long.hashCode(((s) nVar).T);
    }

    public static final long w(n nVar) {
        return ((s) nVar).T;
    }

    public static final w0 x(vy.i iVar) {
        w0 w0Var = (w0) iVar.get(g.f39299c);
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void y(n nVar, Integer num, fz.e eVar) {
        s sVar = (s) nVar;
        if (sVar.S) {
            sVar.b(num, eVar);
        }
    }

    public static final void z() {
        throw new IllegalStateException("Invalid applier");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(w1[] w1VarArr, fz.e eVar, n nVar, int i11) {
        q1 q1VarN0;
        boolean z11;
        x1 x1VarT;
        s sVar = (s) nVar;
        sVar.f0(415205898);
        p0 p0Var = sVar.f39456x;
        q1 q1VarL = sVar.l();
        sVar.Z(201, u.f39475b);
        if (sVar.S) {
            q1VarN0 = sVar.n0(q1VarL, N(w1VarArr, q1VarL, t1.i.f51992d));
            sVar.J = true;
        } else {
            l2 l2Var = sVar.G;
            Object objH = l2Var.h(l2Var.f39346g, 0);
            String str = bjXGJ.EFg;
            kotlin.jvm.internal.m.d(objH, str);
            q1 q1Var = (q1) objH;
            l2 l2Var2 = sVar.G;
            Object objH2 = l2Var2.h(l2Var2.f39346g, 1);
            kotlin.jvm.internal.m.d(objH2, str);
            q1 q1Var2 = (q1) objH2;
            t1.i iVarN = N(w1VarArr, q1VarL, q1Var2);
            if (!sVar.F() || sVar.f39457y || !q1Var2.equals(iVarN)) {
                q1VarN0 = sVar.n0(q1VarL, iVarN);
                if (sVar.f39457y || !kotlin.jvm.internal.m.a(q1VarN0, q1Var)) {
                    z11 = true;
                }
                if (z11 && !sVar.S) {
                    sVar.O(q1VarN0);
                }
                p0Var.d(sVar.f39455w ? 1 : 0);
                sVar.f39455w = z11;
                sVar.K = q1VarN0;
                sVar.X(u.f39476c, 202, 0, q1VarN0);
                eVar.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
                sVar.p(false);
                sVar.p(false);
                sVar.f39455w = p0Var.c() != 0;
                sVar.K = null;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new b0.t1(w1VarArr, i11, 14, eVar);
                }
            }
            sVar.f39445l = sVar.G.s() + sVar.f39445l;
            q1VarN0 = q1Var;
        }
        z11 = false;
        if (z11) {
            sVar.O(q1VarN0);
        }
        p0Var.d(sVar.f39455w ? 1 : 0);
        sVar.f39455w = z11;
        sVar.K = q1VarN0;
        sVar.X(u.f39476c, 202, 0, q1VarN0);
        eVar.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
        sVar.p(false);
        sVar.p(false);
        sVar.f39455w = p0Var.c() != 0;
        sVar.K = null;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(w1VarArr, i11, 14, eVar);
        }
    }
}
