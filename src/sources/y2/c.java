package y2;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.HashSet;
import rt.mc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z1.q implements z, q, b2, y1, x2.e, x2.g, w1, y, r, e2.g, e2.u, e2.x, u1, d2.b {
    public z1.p Q;
    public x2.a R;
    public HashSet S;

    @Override // y2.z
    public final int E(q0 q0Var, w2.p0 p0Var, int i11) {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((w2.c0) pVar).b(new w2.w(q0Var, q0Var.getLayoutDirection()), new w2.k(p0Var, w2.t0.Min, w2.u0.Width, 1), v3.b.b(0, i11, 7)).h();
    }

    @Override // y2.y1
    public final void G() {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ob.i iVar = ((s2.z) pVar).f51376d;
        s2.x xVar = (s2.x) iVar.f44814c;
        s2.z zVar = (s2.z) iVar.f44816e;
        if (xVar == s2.x.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            s2.y yVar = new s2.y(zVar, 0);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
            motionEventObtain.setSource(0);
            yVar.invoke(motionEventObtain);
            motionEventObtain.recycle();
            iVar.f44814c = s2.x.Unknown;
            zVar.f51375c = false;
            iVar.f44815d = null;
        }
    }

    @Override // y2.z
    public final int L(q0 q0Var, w2.p0 p0Var, int i11) {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((w2.c0) pVar).b(new w2.w(q0Var, q0Var.getLayoutDirection()), new w2.k(p0Var, w2.t0.Max, w2.u0.Width, 1), v3.b.b(0, i11, 7)).h();
    }

    @Override // z1.q
    public final void L0() {
        T0(true);
    }

    @Override // z1.q
    public final void M0() {
        U0();
    }

    @Override // y2.q
    public final void N() {
        f.m(this);
    }

    @Override // y2.y1
    public final void P() {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((s2.z) pVar).f51376d.getClass();
    }

    public final void T0(boolean z11) {
        if (!this.P) {
            v2.a.b("initializeModifier called on unattached node");
        }
        z1.p pVar = this.Q;
        if ((this.f58484c & 32) != 0) {
            if (pVar instanceof x2.c) {
                b bVar = new b(this, 0);
                y.e0 e0Var = ((AndroidComposeView) f.y(this)).Y0;
                if (e0Var.g(bVar) < 0) {
                    e0Var.a(bVar);
                }
            }
            if (pVar instanceof x2.f) {
                x2.f fVar = (x2.f) pVar;
                x2.a aVar = this.R;
                if (aVar == null || !aVar.n(fVar.getKey())) {
                    x2.a aVar2 = new x2.a();
                    aVar2.f55752d = fVar;
                    this.R = aVar2;
                    if (f.d(this)) {
                        x2.d modifierLocalManager = f.y(this).getModifierLocalManager();
                        x2.h key = fVar.getKey();
                        modifierLocalManager.f55755b.c(this);
                        modifierLocalManager.f55756c.c(key);
                        modifierLocalManager.a();
                    }
                } else {
                    aVar.f55752d = fVar;
                    x2.d modifierLocalManager2 = f.y(this).getModifierLocalManager();
                    x2.h key2 = fVar.getKey();
                    modifierLocalManager2.f55755b.c(this);
                    modifierLocalManager2.f55756c.c(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f58484c & 4) != 0 && !z11) {
            f.v(this, 2).j1();
        }
        if ((this.f58484c & 2) != 0) {
            if (f.d(this)) {
                k1 k1Var = this.H;
                kotlin.jvm.internal.m.c(k1Var);
                ((b0) k1Var).D1(this);
                s1 s1Var = k1Var.f56957n0;
                if (s1Var != null) {
                    s1Var.invalidate();
                }
            }
            if (!z11) {
                f.v(this, 2).j1();
                f.x(this).F();
            }
        }
        if (pVar instanceof l0.u) {
            l0.u uVar = (l0.u) pVar;
            i0 i0VarX = f.x(this);
            switch (uVar.f39194a) {
                case 0:
                    ((l0.w) uVar.f39195b).f39212k = i0VarX;
                    break;
                case 1:
                    ((m0.x) uVar.f39195b).f40659j = i0VarX;
                    break;
                default:
                    ((o0.t) uVar.f39195b).f44454x.setValue(i0VarX);
                    break;
            }
        }
        if ((this.f58484c & 256) != 0 && (pVar instanceof n0.d) && f.d(this)) {
            f.x(this).F();
        }
        int i11 = this.f58484c;
        if ((i11 & 16) != 0 && (pVar instanceof s2.z)) {
            ((s2.z) pVar).f51376d.f44813b = this.H;
        }
        if ((i11 & 8) != 0) {
            ((AndroidComposeView) f.y(this)).A();
        }
    }

    public final void U0() {
        if (!this.P) {
            v2.a.b("unInitializeModifier called on unattached node");
        }
        z1.p pVar = this.Q;
        if ((this.f58484c & 32) != 0) {
            if (pVar instanceof x2.f) {
                x2.d modifierLocalManager = f.y(this).getModifierLocalManager();
                x2.h key = ((x2.f) pVar).getKey();
                modifierLocalManager.f55757d.c(f.x(this));
                modifierLocalManager.f55758e.c(key);
                modifierLocalManager.a();
            }
            if (pVar instanceof x2.c) {
                ((x2.c) pVar).e(f.f56853a);
            }
        }
        if ((this.f58484c & 8) != 0) {
            ((AndroidComposeView) f.y(this)).A();
        }
    }

    public final void V0() {
        if (this.P) {
            this.S.clear();
            v1 snapshotObserver = f.y(this).getSnapshotObserver();
            snapshotObserver.f57019a.d(this, e.f56844b, new b(this, 1));
        }
    }

    @Override // x2.e
    public final ve.i X() {
        x2.a aVar = this.R;
        return aVar != null ? aVar : x2.b.f55753d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // x2.e, x2.g
    public final Object a(x2.h hVar) {
        mc mcVar;
        this.S.add(hVar);
        if (!this.f58482a.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        z1.q qVar = this.f58482a.f58486e;
        i0 i0VarX = f.x(this);
        while (i0VarX != null) {
            if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 32) != 0) {
                while (qVar != null) {
                    if ((qVar.f58484c & 32) != 0) {
                        ?? F = qVar;
                        ?? eVar = 0;
                        while (F != 0) {
                            if (F instanceof x2.e) {
                                x2.e eVar2 = (x2.e) F;
                                if (eVar2.X().n(hVar)) {
                                    return eVar2.X().q(hVar);
                                }
                            } else if ((F.f58484c & 32) != 0 && (F instanceof n)) {
                                z1.q qVar2 = ((n) F).R;
                                int i11 = 0;
                                F = F;
                                eVar = eVar;
                                while (qVar2 != null) {
                                    if ((qVar2.f58484c & 32) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            eVar = eVar;
                                            F = qVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new n1.e(new z1.q[16]);
                                            }
                                            if (F != 0) {
                                                eVar.c(F);
                                                F = 0;
                                            }
                                            eVar.c(qVar2);
                                        }
                                    }
                                    qVar2 = qVar2.f58487f;
                                    F = F;
                                    eVar = eVar;
                                }
                                if (i11 == 1) {
                                }
                            }
                            F = f.f(eVar);
                        }
                    }
                    qVar = qVar.f58486e;
                }
            }
            i0VarX = i0VarX.w();
            qVar = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
        }
        return hVar.f55760a.invoke();
    }

    @Override // e2.u
    public final void a0(e2.r rVar) {
        z1.p pVar = this.Q;
        v2.a.b("applyFocusProperties called on wrong node");
        pVar.getClass();
        throw new ClassCastException();
    }

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((w2.c0) pVar).b(s0Var, p0Var, j11);
    }

    @Override // y2.m
    public final void c() {
        if (this.Q instanceof s2.z) {
            G();
        }
    }

    @Override // d2.b
    public final long d() {
        return ff.h.P(f.v(this, 128).f54503c);
    }

    @Override // y2.w1
    public final Object g0(v3.c cVar, Object obj) {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((w2.d1) pVar).g();
    }

    @Override // d2.b
    public final v3.c getDensity() {
        return f.x(this).f56881b0;
    }

    @Override // d2.b
    public final v3.m getLayoutDirection() {
        return f.x(this).f56883c0;
    }

    @Override // y2.q
    public final void i(k0 k0Var) {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((d0.d1) pVar).f22657a.b(k0Var);
    }

    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        g3.o oVarH = ((g3.q) pVar).h();
        kotlin.jvm.internal.m.d(b0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        g3.o oVar = (g3.o) b0Var;
        y.i0 i0Var = oVar.f28691a;
        if (oVarH.f28693c) {
            oVar.f28693c = true;
        }
        if (oVarH.f28694d) {
            oVar.f28694d = true;
        }
        y.i0 i0Var2 = oVarH.f28691a;
        Object[] objArr = i0Var2.f56714b;
        Object[] objArr2 = i0Var2.f56715c;
        long[] jArr = i0Var2.f56713a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j11) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        g3.a0 a0Var = (g3.a0) obj;
                        if (!i0Var.b(a0Var)) {
                            i0Var.m(a0Var, obj2);
                        } else if (obj2 instanceof g3.a) {
                            Object objG = i0Var.g(a0Var);
                            kotlin.jvm.internal.m.d(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            g3.a aVar = (g3.a) objG;
                            String str = aVar.f28634a;
                            if (str == null) {
                                str = ((g3.a) obj2).f28634a;
                            }
                            qy.e eVar = aVar.f28635b;
                            if (eVar == null) {
                                eVar = ((g3.a) obj2).f28635b;
                            }
                            i0Var.m(a0Var, new g3.a(str, eVar));
                        }
                    }
                    j11 >>= i12;
                    i14++;
                    i12 = i12;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // y2.r
    public final void m(k1 k1Var) {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        n0.d dVar = (n0.d) pVar;
        ArrayList arrayList = dVar.f42931b;
        if (dVar.f42930a) {
            return;
        }
        dVar.f42930a = true;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((vy.d) arrayList.get(i11)).resumeWith(qy.b0.f48488a);
        }
        arrayList.clear();
    }

    @Override // y2.z
    public final int p(q0 q0Var, w2.p0 p0Var, int i11) {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((w2.c0) pVar).b(new w2.w(q0Var, q0Var.getLayoutDirection()), new w2.k(p0Var, w2.t0.Min, w2.u0.Height, 1), v3.b.b(i11, 0, 13)).f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // y2.y1
    public final void q(s2.l lVar, s2.m mVar, long j11) {
        boolean z11;
        boolean z12;
        boolean z13;
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ob.i iVar = ((s2.z) pVar).f51376d;
        s2.z zVar = (s2.z) iVar.f44816e;
        ?? r9 = lVar.f51328a;
        int size = r9.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z11 = true;
                break;
            }
            s2.t tVar = (s2.t) r9.get(i11);
            if (s2.s.a(tVar) || s2.s.c(tVar)) {
                z11 = false;
                break;
            }
            i11++;
        }
        if (!z11) {
            z12 = false;
            break;
        }
        int size2 = r9.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                z12 = true;
                break;
            } else {
                if (((s2.t) r9.get(i12)).b()) {
                    z12 = false;
                    break;
                }
                i12++;
            }
        }
        if (zVar.f51375c) {
            z13 = true;
            break;
        }
        int size3 = r9.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                if (!z12) {
                    z13 = false;
                    break;
                }
                break;
            } else {
                s2.t tVar2 = (s2.t) r9.get(i13);
                if (!s2.s.a(tVar2) && !s2.s.c(tVar2)) {
                    i13++;
                }
            }
            z13 = true;
            break;
        }
        if (((s2.x) iVar.f44814c) != s2.x.NotDispatching) {
            if (mVar == s2.m.Initial && z13) {
                iVar.f44815d = lVar;
                iVar.h(lVar, !z11 || zVar.f51375c);
            }
            if (mVar == s2.m.Main && z11 && lVar.equals((s2.l) iVar.f44815d) && zVar.f51375c) {
                int size4 = r9.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((s2.t) r9.get(i14)).a();
                }
            }
            if (mVar == s2.m.Final && !z13 && !lVar.equals((s2.l) iVar.f44815d)) {
                iVar.h(lVar, true);
            }
        }
        if (mVar == s2.m.Final) {
            int size5 = r9.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size5) {
                    iVar.f44814c = s2.x.Unknown;
                    ((s2.z) iVar.f44816e).f51375c = false;
                    iVar.f44815d = null;
                    break;
                } else if (!s2.s.c((s2.t) r9.get(i15))) {
                    break;
                } else {
                    i15++;
                }
            }
            if (lVar.equals((s2.l) iVar.f44815d) && z11) {
                int size6 = r9.size();
                for (int i16 = 0; i16 < size6; i16++) {
                    if (((s2.t) r9.get(i16)).b()) {
                        if (zVar.f51375c) {
                            break;
                        }
                        iVar.w(lVar);
                        return;
                    }
                }
                int size7 = r9.size();
                for (int i17 = 0; i17 < size7; i17++) {
                    ((s2.t) r9.get(i17)).a();
                }
            }
        }
    }

    @Override // y2.u1
    public final boolean r() {
        return this.P;
    }

    @Override // y2.y1
    public final boolean s0() {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((s2.z) pVar).f51376d.getClass();
        return true;
    }

    @Override // y2.z
    public final int t(q0 q0Var, w2.p0 p0Var, int i11) {
        z1.p pVar = this.Q;
        kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((w2.c0) pVar).b(new w2.w(q0Var, q0Var.getLayoutDirection()), new w2.k(p0Var, w2.t0.Max, w2.u0.Height, 1), v3.b.b(i11, 0, 13)).f();
    }

    public final String toString() {
        return this.Q.toString();
    }

    @Override // e2.g
    public final void u(e2.z zVar) {
        z1.p pVar = this.Q;
        v2.a.b("onFocusEvent called on wrong node");
        pVar.getClass();
        throw new ClassCastException();
    }

    @Override // y2.y
    public final void F0(w2.x xVar) {
    }

    @Override // y2.y
    public final void l(long j11) {
    }
}
