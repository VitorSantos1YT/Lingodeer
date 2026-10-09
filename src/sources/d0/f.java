package d0;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import bt.a3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends y2.n implements y2.y1, q2.e, y2.b2, y2.g2, y2.l, y2.o1 {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final p1 f22683l0 = new p1();
    public h0.i S;
    public g1 T;
    public boolean U;
    public String V;
    public g3.k W;
    public boolean X;
    public fz.a Y;
    public final n0 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public g1 f22684a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public s2.m0 f22685b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public y2.m f22686c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public h0.k f22687d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public h0.f f22688e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final y.a0 f22689f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f22690g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public h0.i f22691h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f22692i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public rz.z1 f22693j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final p1 f22694k0;

    public f(h0.i iVar, g1 g1Var, boolean z11, boolean z12, String str, g3.k kVar, fz.a aVar) {
        this.S = iVar;
        this.T = g1Var;
        this.U = z11;
        this.V = str;
        this.W = kVar;
        this.X = z12;
        this.Y = aVar;
        this.Z = new n0(iVar, 0, new a3(1, this, f.class, "onFocusChange", "onFocusChange(Z)V", 0, 10));
        int i11 = y.p.f56747a;
        this.f22689f0 = new y.a0(6);
        this.f22690g0 = 0L;
        h0.i iVar2 = this.S;
        this.f22691h0 = iVar2;
        this.f22692i0 = iVar2 == null;
        this.f22694k0 = f22683l0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // q2.e
    public final boolean B(KeyEvent keyEvent) {
        boolean z11;
        b1();
        long jB = q2.c.b(keyEvent);
        boolean z12 = this.X;
        vy.d dVar = null;
        y.a0 a0Var = this.f22689f0;
        if (z12 && q2.c.c(keyEvent) == 2 && n.s(keyEvent)) {
            if (a0Var.b(jB)) {
                z11 = false;
            } else {
                h0.k kVar = new h0.k(this.f22690g0);
                a0Var.g(jB, kVar);
                if (this.S != null) {
                    rz.e0.B(H0(), null, null, new d(this, kVar, dVar, 1), 3);
                }
                z11 = true;
            }
            if (d1(keyEvent) || z11) {
                return true;
            }
            return false;
        }
        if (this.X && q2.c.c(keyEvent) == 1 && n.s(keyEvent)) {
            h0.k kVar2 = (h0.k) a0Var.f(jB);
            if (kVar2 != null) {
                if (this.S != null) {
                    rz.e0.B(H0(), null, null, new d(this, kVar2, dVar, 2), 3);
                }
                e1(keyEvent);
            }
            if (kVar2 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // y2.b2
    public final boolean C0() {
        return true;
    }

    @Override // y2.y1
    public void G() {
        h0.f fVar;
        h0.i iVar = this.S;
        if (iVar != null && (fVar = this.f22688e0) != null) {
            iVar.b(new h0.g(fVar));
        }
        this.f22688e0 = null;
        s2.m0 m0Var = this.f22685b0;
        if (m0Var != null) {
            m0Var.G();
        }
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // z1.q
    public final void L0() {
        m0();
        if (!this.f22692i0) {
            b1();
        }
        if (this.X) {
            T0(this.Z);
        }
    }

    @Override // z1.q
    public final void M0() {
        Z0();
        if (this.f22691h0 == null) {
            this.S = null;
        }
        y2.m mVar = this.f22686c0;
        if (mVar != null) {
            U0(mVar);
        }
        this.f22686c0 = null;
    }

    public abstract s2.m0 X0();

    public final boolean Y0() {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        y2.f.A(this, f0.o1.R, new com.google.firebase.datastorage.a(uVar, 10));
        if (uVar.f38357a) {
            return true;
        }
        int i11 = a0.f22630b;
        ViewParent parent = y2.f.z(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[LOOP:0: B:13:0x002b->B:23:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[EDGE_INSN: B:27:0x006a->B:24:0x006a BREAK  A[LOOP:0: B:13:0x002b->B:23:0x0067], SYNTHETIC] */
    public final void Z0() {
        h0.i iVar = this.S;
        y.a0 a0Var = this.f22689f0;
        if (iVar != null) {
            h0.k kVar = this.f22687d0;
            if (kVar != null) {
                iVar.b(new h0.j(kVar));
            }
            h0.f fVar = this.f22688e0;
            if (fVar != null) {
                iVar.b(new h0.g(fVar));
            }
            Object[] objArr = a0Var.f56656c;
            long[] jArr = a0Var.f56654a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                iVar.b(new h0.j((h0.k) objArr[(i11 << 3) + i13]));
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        this.f22687d0 = null;
        this.f22688e0 = null;
        a0Var.a();
    }

    public final void a1() {
        h0.i iVar = this.S;
        if (iVar != null) {
            rz.z1 z1Var = this.f22693j0;
            vy.d dVar = null;
            if (z1Var == null || !z1Var.isActive()) {
                h0.k kVar = this.f22687d0;
                if (kVar != null) {
                    rz.e0.B(H0(), null, null, new c(kVar, iVar, dVar, 0), 3);
                }
            } else {
                rz.z1 z1Var2 = this.f22693j0;
                if (z1Var2 != null) {
                    z1Var2.cancel(null);
                }
            }
            this.f22687d0 = null;
        }
    }

    public final void b1() {
        if (this.f22686c0 != null) {
            return;
        }
        g1 g1Var = this.U ? this.f22684a0 : this.T;
        if (g1Var != null) {
            if (this.S == null) {
                this.S = new h0.i();
            }
            this.Z.Y0(this.S);
            h0.i iVar = this.S;
            kotlin.jvm.internal.m.c(iVar);
            y2.m mVarB = g1Var.b(iVar);
            T0(mVarB);
            this.f22686c0 = mVarB;
        }
    }

    public abstract boolean d1(KeyEvent keyEvent);

    public abstract void e1(KeyEvent keyEvent);

    @Override // q2.e
    public final boolean f(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    public final void f1(h0.i iVar, g1 g1Var, boolean z11, boolean z12, String str, g3.k kVar, fz.a aVar) {
        boolean z13;
        boolean z14;
        y2.m mVar;
        if (kotlin.jvm.internal.m.a(this.f22691h0, iVar)) {
            z13 = false;
        } else {
            Z0();
            this.f22691h0 = iVar;
            this.S = iVar;
            z13 = true;
        }
        if (!kotlin.jvm.internal.m.a(this.T, g1Var)) {
            this.T = g1Var;
            z13 = true;
        }
        if (this.U != z11) {
            this.U = z11;
            if (z11) {
                m0();
            }
            z13 = true;
        }
        boolean z15 = this.X;
        n0 n0Var = this.Z;
        if (z15 != z12) {
            if (z12) {
                T0(n0Var);
            } else {
                U0(n0Var);
                Z0();
            }
            y2.f.o(this);
            this.X = z12;
        }
        if (!kotlin.jvm.internal.m.a(this.V, str)) {
            this.V = str;
            y2.f.o(this);
        }
        if (!kotlin.jvm.internal.m.a(this.W, kVar)) {
            this.W = kVar;
            y2.f.o(this);
        }
        this.Y = aVar;
        boolean z16 = this.f22692i0;
        h0.i iVar2 = this.f22691h0;
        if (z16 != (iVar2 == null)) {
            boolean z17 = iVar2 == null;
            this.f22692i0 = z17;
            z14 = (z17 || this.f22686c0 != null) ? z13 : true;
        }
        if (z14 && ((mVar = this.f22686c0) != null || !this.f22692i0)) {
            if (mVar != null) {
                U0(mVar);
            }
            this.f22686c0 = null;
            b1();
        }
        n0Var.Y0(this.S);
    }

    @Override // y2.g2
    public final Object h() {
        return this.f22694k0;
    }

    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
        g3.k kVar = this.W;
        if (kVar != null) {
            g3.z.d(b0Var, kVar.f28656a);
        }
        String str = this.V;
        a aVar = new a(this, 1);
        mz.j[] jVarArr = g3.z.f28737a;
        b0Var.b(g3.n.f28667b, new g3.a(str, aVar));
        if (this.X) {
            this.Z.i0(b0Var);
        } else {
            b0Var.b(g3.x.f28718i, qy.b0.f48488a);
        }
        W0(b0Var);
    }

    @Override // y2.o1
    public final void m0() {
        if (this.U) {
            y2.f.t(this, new a(this, 0));
        }
    }

    @Override // y2.y1
    public void q(s2.l lVar, s2.m mVar, long j11) {
        s2.m0 m0VarX0;
        long jQ = ff.h.q(j11);
        this.f22690g0 = (((long) Float.floatToRawIntBits((int) (jQ & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jQ >> 32))) << 32);
        b1();
        if (this.X && mVar == s2.m.Main) {
            int i11 = lVar.f51332e;
            vy.d dVar = null;
            if (i11 == 4) {
                rz.e0.B(H0(), null, null, new e(this, dVar, 0), 3);
            } else if (i11 == 5) {
                rz.e0.B(H0(), null, null, new e(this, dVar, 1), 3);
            }
        }
        if (this.f22685b0 == null && (m0VarX0 = X0()) != null) {
            T0(m0VarX0);
            this.f22685b0 = m0VarX0;
        }
        s2.m0 m0Var = this.f22685b0;
        if (m0Var != null) {
            m0Var.q(lVar, mVar, j11);
        }
    }

    public void c1() {
    }

    public void W0(g3.b0 b0Var) {
    }
}
