package w2;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.KotlinNothingValueException;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import y2.h2;
import z2.e3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements l1.j {
    public final h0 H;
    public final e0 K;
    public final y.i0 L;
    public final r1 M;
    public final y.i0 N;
    public final n1.e O;
    public int P;
    public int Q;
    public final String R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2.i0 f54542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l1.w f54543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s1 f54544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y.i0 f54547f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y.i0 f54548t;

    public m0(y2.i0 i0Var, s1 s1Var) {
        this.f54542a = i0Var;
        this.f54544c = s1Var;
        long[] jArr = y.r0.f56756a;
        this.f54547f = new y.i0();
        this.f54548t = new y.i0();
        this.H = new h0(this);
        this.K = new e0(this);
        this.L = new y.i0();
        this.M = new r1();
        this.N = new y.i0();
        this.O = new n1.e(new Object[16]);
        this.R = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void d(f0 f0Var) {
        y.j0 j0Var;
        l1.n1 n1Var = f0Var.f54489f;
        if (n1Var != null) {
            n1Var.f39376h.set(l1.o1.Cancelled);
            t1.j jVar = n1Var.f39379k;
            if (jVar.f51996d.h()) {
                j0Var = jVar.f51996d;
                y.j0 j0Var2 = y.s0.f56760a;
                jVar.f51996d = new y.j0();
                jVar.f51995c.h();
            } else {
                j0Var = null;
            }
            jVar.b();
            l1.z zVar = n1Var.f39369a;
            zVar.S = null;
            if (j0Var != null) {
                zVar.W.f52003k = j0Var;
                zVar.Y = 2;
            }
            f0Var.f54489f = null;
            l1.z zVar2 = f0Var.f54486c;
            if (zVar2 != null) {
                zVar2.dispose();
            }
            f0Var.f54486c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // l1.j
    public final void a() {
        l1.z zVar;
        y2.i0 i0Var = this.f54542a;
        i0Var.T = true;
        y.i0 i0Var2 = this.f54547f;
        Object[] objArr = i0Var2.f56715c;
        long[] jArr = i0Var2.f56713a;
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
                        if ((255 & j11) < 128 && (zVar = ((f0) objArr[(i11 << 3) + i13]).f54486c) != null) {
                            zVar.dispose();
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
        i0Var.S();
        i0Var.T = false;
        i0Var2.a();
        this.f54548t.a();
        this.Q = 0;
        this.P = 0;
        this.L.a();
        g();
    }

    @Override // l1.j
    public final void b() {
        h(true);
    }

    public final void c(f0 f0Var, boolean z11) {
        l1.n1 n1Var = f0Var.f54489f;
        if (n1Var != null) {
            x1.f fVarN = re.q.n();
            fz.c cVarE = fVarN != null ? fVarN.e() : null;
            x1.f fVarR = re.q.r(fVarN);
            try {
                y2.i0 i0Var = this.f54542a;
                i0Var.T = true;
                if (z11) {
                    while (!n1Var.c()) {
                        try {
                            n1Var.e(new se.n(21));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                n1Var.a();
                f0Var.f54489f = null;
                i0Var.T = false;
                re.q.t(fVarN, fVarR, cVarE);
            } catch (Throwable th3) {
                re.q.t(fVarN, fVarR, cVarE);
                throw th3;
            }
        }
    }

    public final n1 e(Object obj) {
        return !this.f54542a.I() ? new k0() : new l0(this, obj);
    }

    public final void f(int i11) {
        boolean z11;
        boolean z12 = false;
        this.P = 0;
        List listP = this.f54542a.p();
        n1.b bVar = (n1.b) listP;
        int i12 = (((n1.e) bVar.f43104b).f43114c - this.Q) - 1;
        if (i11 <= i12) {
            this.M.clear();
            if (i11 <= i12) {
                int i13 = i11;
                while (true) {
                    Object objG = this.f54547f.g((y2.i0) bVar.get(i13));
                    kotlin.jvm.internal.m.c(objG);
                    ((y.f0) this.M.f54576b).a(((f0) objG).f54484a);
                    if (i13 == i12) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f54544c.i(this.M);
            x1.f fVarN = re.q.n();
            fz.c cVarE = fVarN != null ? fVarN.e() : null;
            x1.f fVarR = re.q.r(fVarN);
            z11 = false;
            while (i12 >= i11) {
                try {
                    y2.i0 i0Var = (y2.i0) ((n1.b) listP).get(i12);
                    Object objG2 = this.f54547f.g(i0Var);
                    kotlin.jvm.internal.m.c(objG2);
                    f0 f0Var = (f0) objG2;
                    Object obj = f0Var.f54484a;
                    if (((y.f0) this.M.f54576b).c(obj)) {
                        this.P++;
                        if (((Boolean) f0Var.f54490g.getValue()).booleanValue()) {
                            y2.m0 m0Var = i0Var.f56893j0;
                            y2.b1 b1Var = m0Var.f56974p;
                            y2.g0 g0Var = y2.g0.NotUsed;
                            b1Var.N = g0Var;
                            y2.v0 v0Var = m0Var.f56975q;
                            if (v0Var != null) {
                                v0Var.L = g0Var;
                            }
                            k(f0Var, false);
                            if (f0Var.f54491h) {
                                z11 = true;
                            }
                        }
                    } else {
                        y2.i0 i0Var2 = this.f54542a;
                        i0Var2.T = true;
                        this.f54547f.k(i0Var);
                        l1.z zVar = f0Var.f54486c;
                        if (zVar != null) {
                            zVar.dispose();
                        }
                        this.f54542a.T(i12, 1);
                        i0Var2.T = false;
                    }
                    this.f54548t.k(obj);
                    i12--;
                } catch (Throwable th2) {
                    re.q.t(fVarN, fVarR, cVarE);
                    throw th2;
                }
            }
            re.q.t(fVarN, fVarR, cVarE);
        } else {
            z11 = false;
        }
        if (z11) {
            synchronized (x1.l.f55691c) {
                y.j0 j0Var = x1.l.f55698j.f55643h;
                if (j0Var != null && j0Var.h()) {
                    z12 = true;
                }
            }
            if (z12) {
                x1.l.a();
            }
        }
        g();
    }

    public final void h(boolean z11) {
        this.Q = 0;
        this.L.a();
        List listP = this.f54542a.p();
        int i11 = ((n1.e) ((n1.b) listP).f43104b).f43114c;
        if (this.P != i11) {
            this.P = i11;
            x1.f fVarN = re.q.n();
            fz.c cVarE = fVarN != null ? fVarN.e() : null;
            x1.f fVarR = re.q.r(fVarN);
            for (int i12 = 0; i12 < i11; i12++) {
                try {
                    y2.i0 i0Var = (y2.i0) ((n1.b) listP).get(i12);
                    f0 f0Var = (f0) this.f54547f.g(i0Var);
                    if (f0Var != null && ((Boolean) f0Var.f54490g.getValue()).booleanValue()) {
                        y2.m0 m0Var = i0Var.f56893j0;
                        y2.b1 b1Var = m0Var.f56974p;
                        y2.g0 g0Var = y2.g0.NotUsed;
                        b1Var.N = g0Var;
                        y2.v0 v0Var = m0Var.f56975q;
                        if (v0Var != null) {
                            v0Var.L = g0Var;
                        }
                        k(f0Var, z11);
                        f0Var.f54484a = a0.f54471a;
                    }
                } catch (Throwable th2) {
                    re.q.t(fVarN, fVarR, cVarE);
                    throw th2;
                }
            }
            re.q.t(fVarN, fVarR, cVarE);
            this.f54548t.a();
        }
        g();
    }

    public final void i(int i11, int i12) {
        y2.i0 i0Var = this.f54542a;
        i0Var.T = true;
        i0Var.M(i11, i12, 1);
        i0Var.T = false;
    }

    @Override // l1.j
    public final void j() {
        h(false);
    }

    public final void k(f0 f0Var, boolean z11) {
        l1.z zVar;
        if (z11 || !f0Var.f54491h) {
            f0Var.f54490g = l1.t.B(Boolean.FALSE);
        } else {
            f0Var.f54490g.setValue(Boolean.FALSE);
        }
        if (f0Var.f54489f != null) {
            d(f0Var);
            return;
        }
        if (z11) {
            l1.z zVar2 = f0Var.f54486c;
            if (zVar2 != null) {
                zVar2.l();
                return;
            }
            return;
        }
        y2.r1 outOfFrameExecutor = y2.l0.a(this.f54542a).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (f0Var.f54491h || (zVar = f0Var.f54486c) == null) {
                return;
            }
            zVar.l();
            return;
        }
        a0.c0 c0Var = new a0.c0(f0Var, 29);
        AndroidComposeView androidComposeView = (AndroidComposeView) outOfFrameExecutor;
        ry.k kVar = androidComposeView.f1191t;
        boolean zIsEmpty = kVar.isEmpty();
        kVar.addLast(c0Var);
        if (zIsEmpty) {
            Handler handler = androidComposeView.getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(androidComposeView.H);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bd, B:64:0x00d3, B:66:0x00d7, B:72:0x010d, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x010a, B:62:0x00c0, B:56:0x0092, B:58:0x00a0, B:75:0x0117, B:76:0x0121), top: B:79:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bd, B:64:0x00d3, B:66:0x00d7, B:72:0x010d, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x010a, B:62:0x00c0, B:56:0x0092, B:58:0x00a0, B:75:0x0117, B:76:0x0121), top: B:79:0x0076 }] */
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
    public final void l(y2.i0 i0Var, Object obj, boolean z11, fz.e eVar) {
        boolean z12;
        l1.z zVar;
        y.i0 i0Var2 = this.f54547f;
        Object objG = i0Var2.g(i0Var);
        Object obj2 = objG;
        if (objG == null) {
            t1.d dVar = h.f54506a;
            f0 f0Var = new f0();
            f0Var.f54484a = obj;
            f0Var.f54485b = dVar;
            f0Var.f54486c = null;
            f0Var.f54490g = l1.t.B(Boolean.TRUE);
            i0Var2.m(i0Var, f0Var);
            obj2 = f0Var;
        }
        f0 f0Var2 = (f0) obj2;
        boolean z13 = f0Var2.f54485b != eVar;
        if (f0Var2.f54489f != null) {
            if (z13) {
                d(f0Var2);
            } else if (z11) {
                return;
            } else {
                c(f0Var2, true);
            }
        }
        l1.z zVar2 = f0Var2.f54486c;
        if (zVar2 != null) {
            synchronized (zVar2.f39519d) {
                z12 = zVar2.P.f56717e > 0;
            }
        } else {
            z12 = true;
        }
        if (z13 || z12 || f0Var2.f54487d) {
            f0Var2.f54485b = eVar;
            if (f0Var2.f54489f != null) {
                v2.a.a("new subcompose call while paused composition is still active");
            }
            x1.f fVarN = re.q.n();
            fz.c cVarE = fVarN != null ? fVarN.e() : null;
            x1.f fVarR = re.q.r(fVarN);
            try {
                y2.i0 i0Var3 = this.f54542a;
                i0Var3.T = true;
                l1.z zVar3 = f0Var2.f54486c;
                l1.w wVar = this.f54543b;
                if (wVar == null) {
                    v2.a.c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (zVar3 == null) {
                    if (z11) {
                        ViewGroup.LayoutParams layoutParams = e3.f58533a;
                        zVar = new l1.z(wVar, new h2(i0Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = e3.f58533a;
                        zVar = new l1.z(wVar, new h2(i0Var));
                    }
                    zVar3 = zVar;
                } else {
                    if (zVar3.Y == 3) {
                        if (z11) {
                            ViewGroup.LayoutParams layoutParams3 = e3.f58533a;
                            zVar = new l1.z(wVar, new h2(i0Var));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = e3.f58533a;
                            zVar = new l1.z(wVar, new h2(i0Var));
                        }
                        zVar3 = zVar;
                    }
                }
                f0Var2.f54486c = zVar3;
                fz.e dVar2 = f0Var2.f54485b;
                if (y2.l0.a(this.f54542a).getOutOfFrameExecutor() != null) {
                    f0Var2.f54491h = false;
                } else {
                    f0Var2.f54491h = true;
                    dVar2 = new t1.d(new b2.h(10, f0Var2, dVar2), true, 1524156494);
                }
                if (z11) {
                    if (f0Var2.f54488e) {
                        zVar3.i();
                        zVar3.p();
                        f0Var2.f54489f = zVar3.k(true, dVar2);
                    } else {
                        f0Var2.f54489f = zVar3.k(zVar3.i(), dVar2);
                    }
                } else if (f0Var2.f54488e) {
                    zVar3.i();
                    zVar3.p();
                    l1.s sVar = zVar3.X;
                    sVar.f39458z = 100;
                    sVar.f39457y = true;
                    zVar3.f39516a.a(zVar3, dVar2);
                    sVar.u();
                } else {
                    zVar3.A(dVar2);
                }
                f0Var2.f54488e = false;
                i0Var3.T = false;
                re.q.t(fVarN, fVarR, cVarE);
                f0Var2.f54487d = false;
            } catch (Throwable th2) {
                re.q.t(fVarN, fVarR, cVarE);
                throw th2;
            }
        }
    }

    public final y2.i0 m(Object obj) {
        y.i0 i0Var;
        int i11;
        if (this.P == 0) {
            return null;
        }
        n1.b bVar = (n1.b) this.f54542a.p();
        int i12 = ((n1.e) bVar.f43104b).f43114c - this.Q;
        int i13 = i12 - this.P;
        int i14 = i12 - 1;
        int i15 = i14;
        while (true) {
            i0Var = this.f54547f;
            if (i15 < i13) {
                i11 = -1;
                break;
            }
            Object objG = i0Var.g((y2.i0) bVar.get(i15));
            kotlin.jvm.internal.m.c(objG);
            if (kotlin.jvm.internal.m.a(((f0) objG).f54484a, obj)) {
                i11 = i15;
                break;
            }
            i15--;
        }
        if (i11 == -1) {
            while (true) {
                if (i14 < i13) {
                    i15 = i14;
                    break;
                }
                Object objG2 = i0Var.g((y2.i0) bVar.get(i14));
                kotlin.jvm.internal.m.c(objG2);
                f0 f0Var = (f0) objG2;
                Object obj2 = f0Var.f54484a;
                if (obj2 == a0.f54471a || this.f54544c.h(obj, obj2)) {
                    f0Var.f54484a = obj;
                    i15 = i14;
                    i11 = i15;
                    break;
                }
                i14--;
            }
        }
        if (i11 == -1) {
            return null;
        }
        if (i15 != i13) {
            i(i15, i13);
        }
        this.P--;
        y2.i0 i0Var2 = (y2.i0) bVar.get(i13);
        Object objG3 = i0Var.g(i0Var2);
        kotlin.jvm.internal.m.c(objG3);
        f0 f0Var2 = (f0) objG3;
        f0Var2.f54490g = l1.t.B(Boolean.TRUE);
        f0Var2.f54488e = true;
        f0Var2.f54487d = true;
        return i0Var2;
    }

    public final void g() {
        int i11 = ((n1.e) ((n1.b) this.f54542a.p()).f43104b).f43114c;
        y.i0 i0Var = this.f54547f;
        if (i0Var.f56717e != i11) {
            v2.a.a("Inconsistency between the count of nodes tracked by the state (" + i0Var.f56717e + ") and the children count on the SubcomposeLayout (" + i11 + OYAvlbfUyD.sVPKCnOcjvewVVO);
        }
        if ((i11 - this.P) - this.Q < 0) {
            StringBuilder sbI = w4.c.i(i11, "Incorrect state. Total children ", ". Reusable children ");
            sbI.append(this.P);
            sbI.append(". Precomposed children ");
            sbI.append(this.Q);
            v2.a.a(sbI.toString());
        }
        y.i0 i0Var2 = this.L;
        if (i0Var2.f56717e == this.Q) {
            return;
        }
        v2.a.a("Incorrect state. Precomposed children " + this.Q + ". Map size " + i0Var2.f56717e);
    }
}
