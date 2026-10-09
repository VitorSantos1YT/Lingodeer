package mt;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.yalantis.ucrop.view.CropImageView;
import h1.bc;
import h1.cc;
import h1.p7;
import java.util.List;
import rt.ke;
import rt.ne;
import rt.oe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f41680a = 10;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [r2.d, vy.d] */
    /* JADX WARN: Type inference failed for: r9v16 */
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
    public static final void a(List items, final fz.a onBackClick, rt.a2 a2Var, l1.n nVar, int i11) {
        rt.a2 a2Var2;
        l1.s sVar;
        rt.a2 a2Var3;
        Object yVar;
        l1.b3 b3Var;
        ke keVar;
        ?? r9;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        Object obj;
        int i12;
        ?? r11;
        Object obj2;
        l1.b1 b1Var3;
        Object obj3;
        l1.b1 b1Var4;
        Object obj4;
        kotlin.jvm.internal.m.f(items, "items");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(542027455);
        int i13 = i11 | (sVar2.h(items) ? 4 : 2) | (sVar2.h(onBackClick) ? 32 : 16) | 128;
        if (sVar2.T(i13 & 1, (i13 & 147) != 146)) {
            sVar2.Y();
            if ((i11 & 1) == 0 || sVar2.C()) {
                sVar2.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(rt.a2.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                a2Var3 = (rt.a2) viewModelA;
            } else {
                sVar2.W();
                a2Var3 = a2Var;
            }
            sVar2.q();
            boolean zH = sVar2.h(a2Var3) | sVar2.h(items);
            Object objQ = sVar2.Q();
            Object obj5 = l1.m.f39353a;
            vy.d dVar = null;
            Object obj6 = objQ;
            if (zH || objQ == obj5) {
                Object h0Var = new iv.h0(19, a2Var3, items, dVar);
                sVar2.o0(h0Var);
                obj6 = h0Var;
            }
            l1.t.f((fz.e) obj6, items, sVar2);
            float f5 = h1.e0.f30186a;
            Object[] objArr = new Object[0];
            qp.o2 o2Var = cc.f30109d;
            boolean zC = sVar2.c(-3.4028235E38f) | sVar2.c(CropImageView.DEFAULT_ASPECT_RATIO) | sVar2.c(CropImageView.DEFAULT_ASPECT_RATIO);
            Object objQ2 = sVar2.Q();
            Object obj7 = objQ2;
            if (zC || objQ2 == obj5) {
                Object t1Var = new h1.t1(0, 17);
                sVar2.o0(t1Var);
                obj7 = t1Var;
            }
            final cc ccVar = (cc) w1.j.e(objArr, o2Var, (fz.a) obj7, sVar2, 0, 4);
            float f11 = bc.f30055a;
            h1.t1 t1Var2 = h1.t1.S;
            b0.i1 i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5);
            b0.x xVarA = a0.c2.a(sVar2);
            final a9.i iVar = new a9.i();
            iVar.f517a = ccVar;
            iVar.f518b = i1VarQ;
            iVar.f519c = xVarA;
            iVar.f520d = t1Var2;
            iVar.f521e = new h1.c4(iVar);
            l1.b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(a2Var3.O, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            Object objQ3 = sVar2.Q();
            Object obj8 = objQ3;
            if (objQ3 == obj5) {
                Object objB = l1.t.B(Boolean.FALSE);
                sVar2.o0(objB);
                obj8 = objB;
            }
            l1.b1 b1Var5 = (l1.b1) obj8;
            Object objQ4 = sVar2.Q();
            Object obj9 = objQ4;
            if (objQ4 == obj5) {
                Object objB2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objB2);
                obj9 = objB2;
            }
            l1.b1 b1Var6 = (l1.b1) obj9;
            Object objQ5 = sVar2.Q();
            Object obj10 = objQ5;
            if (objQ5 == obj5) {
                Object objB3 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objB3);
                obj10 = objB3;
            }
            final l1.b1 b1Var7 = (l1.b1) obj10;
            Object objQ6 = sVar2.Q();
            Object objS = objQ6;
            if (objQ6 == obj5) {
                objS = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar2);
            }
            final l1.g1 g1Var = (l1.g1) objS;
            Object objQ7 = sVar2.Q();
            Object objV = objQ7;
            if (objQ7 == obj5) {
                objV = defpackage.e.v(0, sVar2);
            }
            l1.a1 a1Var = (l1.a1) objV;
            final long j11 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p;
            v3.c cVar = (v3.c) sVar2.j(z2.g1.f58547h);
            Integer numValueOf = Integer.valueOf(((rt.o1) b3VarCollectAsStateWithLifecycle.getValue()).f50173k);
            ke keVar2 = ((rt.o1) b3VarCollectAsStateWithLifecycle.getValue()).f50165c;
            boolean zF = sVar2.f(b3VarCollectAsStateWithLifecycle);
            Object objQ8 = sVar2.Q();
            if (zF || objQ8 == obj5) {
                b3Var = b3VarCollectAsStateWithLifecycle;
                keVar = keVar2;
                r9 = 0;
                yVar = new ad.y((Object) b3Var, (Object) b1Var5, (Object) b1Var6, (vy.d) (false ? 1 : 0), 20);
                b1Var = b1Var5;
                b1Var2 = b1Var6;
                sVar2.o0(yVar);
            } else {
                yVar = objQ8;
                b1Var = b1Var5;
                b1Var2 = b1Var6;
                keVar = keVar2;
                r9 = 0;
                b3Var = b3VarCollectAsStateWithLifecycle;
            }
            l1.t.g(numValueOf, keVar, (fz.e) yVar, sVar2);
            Integer numValueOf2 = Integer.valueOf(((rt.o1) b3Var.getValue()).f50173k);
            boolean zF2 = sVar2.f(b3Var);
            Object objQ9 = sVar2.Q();
            Object obj11 = objQ9;
            if (zF2 || objQ9 == obj5) {
                Object h0Var2 = new iv.h0(20, b3Var, a1Var, r9);
                sVar2.o0(h0Var2);
                obj11 = h0Var2;
            }
            l1.t.f((fz.e) obj11, numValueOf2, sVar2);
            boolean zBooleanValue = ((Boolean) b1Var7.getValue()).booleanValue();
            Object objQ10 = sVar2.Q();
            Object obj12 = objQ10;
            if (objQ10 == obj5) {
                Object qVar = new q(18, b1Var7);
                sVar2.o0(qVar);
                obj12 = qVar;
            }
            se.i.a(zBooleanValue, (fz.a) obj12, sVar2, 48, 0);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarD = j0.e2.d(oVar, 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            final l1.b3 b3Var2 = b3Var;
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarD);
            y2.k.J.getClass();
            fz.a aVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(aVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            z1.r rVarA = r2.f.a(oVar, (h1.c4) iVar.f521e, r9);
            final rt.a2 a2Var4 = a2Var3;
            l1.s sVar3 = sVar2;
            t1.d dVarD = t1.e.d(354955017, new fz.e() { // from class: mt.m1
                @Override // fz.e
                public final Object invoke(Object obj13, Object obj14) {
                    l1.n nVar2 = (l1.n) obj13;
                    int iIntValue = ((Integer) obj14).intValue();
                    l1.s sVar4 = (l1.s) nVar2;
                    if (sVar4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z1.r rVarE = j0.e2.e(z1.o.f58481a, 1.0f);
                        g2.r0 r0Var = g2.f0.f28556b;
                        long j12 = j11;
                        z1.r rVarH = d0.n.h(rVarE, j12, r0Var);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
                        int iHashCode2 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL2 = sVar4.l();
                        z1.r rVarC2 = z1.a.c(sVar4, rVarH);
                        y2.k.J.getClass();
                        y2.i iVar2 = y2.j.f56913b;
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA, sVar4);
                        l1.t.J(y2.j.f56916e, q1VarL2, sVar4);
                        y2.h hVar2 = y2.j.f56918g;
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC2, sVar4);
                        t1.d dVar2 = g.f41426e0;
                        rt.a2 a2Var5 = a2Var4;
                        l1.b3 b3Var3 = b3Var2;
                        iu.k.g(onBackClick, null, dVar2, null, t1.e.d(84250878, new at.p(21, a2Var5, b3Var3), sVar4), null, bc.f(j12, j12, sVar4, 28), iVar, sVar4, 24960, 42);
                        a0.j0.c(!((rt.o1) b3Var3.getValue()).f50179r && ccVar.a() < 0.99f, null, null, null, null, t1.e.d(1095415767, new j1(j12, a2Var5, b3Var3, b1Var7, g1Var, 0), sVar4), sVar4, 1572870, 30);
                        sVar4.p(true);
                    } else {
                        sVar4.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar3);
            rt.a2 a2Var5 = a2Var3;
            int i14 = 1;
            p7.a(rVarA, dVarD, t1.e.d(524206602, new bt.v1(b3Var2, a1Var, a2Var5, b1Var, b1Var2), sVar3), null, null, 0, 0L, 0L, null, t1.e.d(-776846124, new defpackage.d(a2Var5, b3Var2, a1Var, 12), sVar3), sVar3, 805306800, 504);
            a0.j0.d(((Boolean) b1Var7.getValue()).booleanValue() && g1Var.l() > CropImageView.DEFAULT_ASPECT_RATIO, j0.e2.d(oVar, 1.0f), null, null, null, t1.e.d(-2128190691, new bp.y((Object) cVar, (Object) a2Var5, (Object) b3Var2, (Object) g1Var, b1Var7, 9), sVar3), sVar3, 196656, 28);
            sVar3.p(true);
            if (!((Boolean) b1Var.getValue()).booleanValue() || ((rt.o1) b3Var2.getValue()).f50173k <= 0 || ((rt.o1) b3Var2.getValue()).f50165c == ke.HIDDEN) {
                obj = obj5;
                i12 = 48;
                r11 = 0;
                sVar3.d0(-1539363965);
            } else {
                sVar3.d0(-1527132450);
                int i15 = ((rt.o1) b3Var2.getValue()).f50173k;
                Object objQ11 = sVar3.Q();
                obj = obj5;
                if (objQ11 == obj) {
                    b1Var4 = b1Var;
                    Object qVar2 = new q(24, b1Var4);
                    sVar3.o0(qVar2);
                    obj4 = qVar2;
                } else {
                    b1Var4 = b1Var;
                    obj4 = objQ11;
                }
                fz.a aVar2 = (fz.a) obj4;
                boolean zH2 = sVar3.h(a2Var5);
                Object objQ12 = sVar3.Q();
                Object obj13 = objQ12;
                if (zH2 || objQ12 == obj) {
                    Object g1Var2 = new g1(a2Var5, b1Var4, i14);
                    sVar3.o0(g1Var2);
                    obj13 = g1Var2;
                }
                i12 = 48;
                g.H(i15, aVar2, (fz.c) obj13, sVar3, 48);
                r11 = 0;
            }
            sVar3.p(r11);
            if (!((Boolean) b1Var2.getValue()).booleanValue() || ((rt.o1) b3Var2.getValue()).f50173k <= 0 || ((rt.o1) b3Var2.getValue()).f50165c == ke.HIDDEN) {
                sVar3.d0(-1539363965);
            } else {
                sVar3.d0(-1526357357);
                int i16 = ((rt.o1) b3Var2.getValue()).f50173k;
                Object objQ13 = sVar3.Q();
                if (objQ13 == obj) {
                    b1Var3 = b1Var2;
                    Object qVar3 = new q(25, b1Var3);
                    sVar3.o0(qVar3);
                    obj3 = qVar3;
                } else {
                    b1Var3 = b1Var2;
                    obj3 = objQ13;
                }
                fz.a aVar3 = (fz.a) obj3;
                boolean zH3 = sVar3.h(a2Var5);
                Object objQ14 = sVar3.Q();
                Object obj14 = objQ14;
                if (zH3 || objQ14 == obj) {
                    Object e1Var = new e1(a2Var5, b1Var3, r11);
                    sVar3.o0(e1Var);
                    obj14 = e1Var;
                }
                g.L(i16, i12, aVar3, (fz.a) obj14, sVar3);
            }
            sVar3.p(r11);
            ne neVar = ((rt.o1) b3Var2.getValue()).f50176o;
            if (neVar != null) {
                sVar3.d0(-1525980707);
                oe oeVar = neVar.f50158a;
                boolean zH4 = sVar3.h(a2Var5);
                Object objQ15 = sVar3.Q();
                if (zH4 || objQ15 == obj) {
                    obj2 = objQ15;
                    Object f1Var = new f1(a2Var5, r11);
                    sVar3.o0(f1Var);
                    obj2 = f1Var;
                }
                fz.a aVar4 = (fz.a) obj2;
                boolean zH5 = sVar3.h(a2Var5);
                Object objQ16 = sVar3.Q();
                Object obj15 = objQ16;
                if (zH5 || objQ16 == obj) {
                    Object i1Var = new i1(a2Var5, r11);
                    sVar3.o0(i1Var);
                    obj15 = i1Var;
                }
                g.G(oeVar, aVar4, (fz.e) obj15, sVar3, r11);
            } else {
                sVar3.d0(-1539363965);
            }
            sVar3.p(r11);
            a2Var2 = a2Var5;
            sVar = sVar3;
        } else {
            sVar2.W();
            a2Var2 = a2Var;
            sVar = sVar2;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e((Object) items, onBackClick, (Object) a2Var2, i11, 27);
        }
    }
}
