package f0;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends n0 implements q2.e, y2.b2, y2.l {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public d0.i f26197b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public t0 f26198c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final r2.d f26199d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final o1 f26200e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final l f26201f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final i2 f26202g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final w1 f26203h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final i f26204i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ch.b0 f26205j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public y1 f26206k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public g1 f26207l0;

    public b2(d0.i iVar, d dVar, t0 t0Var, h1 h1Var, c2 c2Var, h0.i iVar2, boolean z11, boolean z12) {
        super(u1.f26444a, z11, iVar2, h1Var);
        this.f26197b0 = iVar;
        this.f26198c0 = t0Var;
        r2.d dVar2 = new r2.d();
        this.f26199d0 = dVar2;
        o1 o1Var = new o1();
        o1Var.Q = z11;
        T0(o1Var);
        this.f26200e0 = o1Var;
        l lVar = new l(new b0.x(new a0.b2(u1.f26447d)));
        this.f26201f0 = lVar;
        d0.i iVar3 = this.f26197b0;
        t0 t0Var2 = this.f26198c0;
        i2 i2Var = new i2(c2Var, iVar3, t0Var2 == null ? lVar : t0Var2, h1Var, z12, dVar2, this, new cr.n(this, 17));
        this.f26202g0 = i2Var;
        w1 w1Var = new w1(i2Var, z11);
        this.f26203h0 = w1Var;
        i iVar4 = new i(h1Var, i2Var, z12, dVar);
        T0(iVar4);
        this.f26204i0 = iVar4;
        T0(new r2.i(w1Var, dVar2));
        T0(new e2.e0(2, 10, null));
        p0.f fVar = new p0.f();
        fVar.Q = iVar4;
        T0(fVar);
        com.google.firebase.datastorage.a aVar = new com.google.firebase.datastorage.a(this, 20);
        d0.o0 o0Var = new d0.o0();
        o0Var.Q = aVar;
        T0(o0Var);
    }

    @Override // q2.e
    public final boolean B(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.U) {
            return false;
        }
        if ((!q2.a.a(q2.c.b(keyEvent), q2.a.f47407n) && !q2.a.a(q2.c.a(keyEvent.getKeyCode()), q2.a.m)) || q2.c.c(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        h1 h1Var = this.f26202g0.f26308d;
        h1 h1Var2 = h1.Vertical;
        i iVar = this.f26204i0;
        if (h1Var == h1Var2) {
            int i11 = (int) (iVar.Y & 4294967295L);
            float f5 = q2.a.a(q2.c.a(keyEvent.getKeyCode()), q2.a.m) ? i11 : -i11;
            jFloatToRawIntBits = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
            iFloatToRawIntBits = Float.floatToRawIntBits(f5);
        } else {
            int i12 = (int) (iVar.Y >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(q2.a.a(q2.c.a(keyEvent.getKeyCode()), q2.a.m) ? i12 : -i12);
            iFloatToRawIntBits = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        rz.e0.B(H0(), null, null, new y1(this, (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L), null, 1), 3);
        return true;
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // z1.q
    public final void L0() {
        if (this.P) {
            v3.c cVar = y2.f.x(this).f56881b0;
            l lVar = this.f26201f0;
            lVar.getClass();
            lVar.f26345a = new b0.x(new a0.b2(cVar));
        }
        g1 g1Var = this.f26207l0;
        if (g1Var != null) {
            g1Var.f26282e = y2.f.x(this).f56881b0;
        }
    }

    @Override // f0.n0
    public final Object a1(m0 m0Var, m0 m0Var2) {
        i2 i2Var = this.f26202g0;
        Object objF = i2Var.f(d0.l1.UserInput, new a0.e0(25, m0Var, i2Var, (vy.d) null), m0Var2);
        return objF == wy.a.COROUTINE_SUSPENDED ? objF : qy.b0.f48488a;
    }

    @Override // y2.m
    public final void c() {
        G();
        if (this.P) {
            v3.c cVar = y2.f.x(this).f56881b0;
            l lVar = this.f26201f0;
            lVar.getClass();
            lVar.f26345a = new b0.x(new a0.b2(cVar));
        }
        g1 g1Var = this.f26207l0;
        if (g1Var != null) {
            g1Var.f26282e = y2.f.x(this).f56881b0;
        }
    }

    @Override // f0.n0
    public final void c1(long j11) {
        rz.e0.B(this.f26199d0.c(), null, null, new y1(this, j11, null, 0), 3);
    }

    @Override // f0.n0
    public final boolean d1() {
        i2 i2Var = this.f26202g0;
        if (i2Var.f26305a.b()) {
            return true;
        }
        d0.i iVar = i2Var.f26306b;
        if (iVar == null) {
            return false;
        }
        d0.k0 k0Var = iVar.f22722c;
        EdgeEffect edgeEffect = k0Var.f22744d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? d0.l.b(edgeEffect) : 0.0f) != CropImageView.DEFAULT_ASPECT_RATIO) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = k0Var.f22745e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? d0.l.b(edgeEffect2) : 0.0f) != CropImageView.DEFAULT_ASPECT_RATIO) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = k0Var.f22746f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? d0.l.b(edgeEffect3) : 0.0f) != CropImageView.DEFAULT_ASPECT_RATIO) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = k0Var.f22747g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? d0.l.b(edgeEffect4) : 0.0f) != CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return false;
    }

    @Override // q2.e
    public final boolean f(KeyEvent keyEvent) {
        return false;
    }

    public final void f1(d0.i iVar, d dVar, t0 t0Var, h1 h1Var, c2 c2Var, h0.i iVar2, boolean z11, boolean z12) {
        boolean z13;
        boolean z14 = true;
        boolean z15 = false;
        if (this.U != z11) {
            this.f26203h0.f26483b = z11;
            this.f26200e0.Q = z11;
            z13 = true;
        } else {
            z13 = false;
        }
        t0 t0Var2 = t0Var == null ? this.f26201f0 : t0Var;
        i2 i2Var = this.f26202g0;
        if (!kotlin.jvm.internal.m.a(i2Var.f26305a, c2Var)) {
            i2Var.f26305a = c2Var;
            z15 = true;
        }
        i2Var.f26306b = iVar;
        if (i2Var.f26308d != h1Var) {
            i2Var.f26308d = h1Var;
            z15 = true;
        }
        if (i2Var.f26309e != z12) {
            i2Var.f26309e = z12;
        } else {
            z14 = z15;
        }
        i2Var.f26307c = t0Var2;
        i2Var.f26310f = this.f26199d0;
        i iVar3 = this.f26204i0;
        iVar3.Q = h1Var;
        iVar3.S = z12;
        iVar3.T = dVar;
        this.f26197b0 = iVar;
        this.f26198c0 = t0Var;
        dv.e eVar = u1.f26444a;
        h1 h1Var2 = i2Var.f26308d;
        h1 h1Var3 = h1.Vertical;
        if (h1Var2 != h1Var3) {
            h1Var3 = h1.Horizontal;
        }
        e1(eVar, z11, iVar2, h1Var3, z14);
        if (z13) {
            this.f26205j0 = null;
            this.f26206k0 = null;
            y2.f.o(this);
        }
    }

    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
        if (this.U && (this.f26205j0 == null || this.f26206k0 == null)) {
            this.f26205j0 = new ch.b0(this, 6);
            this.f26206k0 = new y1(this, null);
        }
        ch.b0 b0Var2 = this.f26205j0;
        if (b0Var2 != null) {
            mz.j[] jVarArr = g3.z.f28737a;
            b0Var.b(g3.n.f28669d, new g3.a(null, b0Var2));
        }
        y1 y1Var = this.f26206k0;
        if (y1Var != null) {
            mz.j[] jVarArr2 = g3.z.f28737a;
            b0Var.b(g3.n.f28670e, y1Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // f0.n0, y2.y1
    public final void q(s2.l lVar, s2.m mVar, long j11) {
        long j12;
        ?? r9 = lVar.f51328a;
        int size = r9.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((Boolean) this.T.invoke((s2.t) r9.get(i11))).booleanValue()) {
                super.q(lVar, mVar, j11);
                break;
            }
        }
        if (this.U) {
            if (mVar == s2.m.Initial && lVar.f51332e == 6) {
                if (this.f26207l0 == null) {
                    this.f26207l0 = new g1(this.f26202g0, new hd.b(ViewConfiguration.get(y2.f.z(this).getContext()), 11), new x1(2, this, b2.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 0), y2.f.x(this).f56881b0);
                }
                g1 g1Var = this.f26207l0;
                if (g1Var != null) {
                    rz.b0 b0VarH0 = H0();
                    if (((rz.z1) g1Var.f26284g) == null) {
                        g1Var.f26284g = rz.e0.B(b0VarH0, null, null, new e6.q0(g1Var, null, 7), 3);
                    }
                }
            }
            g1 g1Var2 = this.f26207l0;
            if (g1Var2 == null || mVar != s2.m.Main) {
                return;
            }
            int i12 = lVar.f51332e;
            ?? r11 = lVar.f51328a;
            if (i12 == 6) {
                int size2 = r11.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    if (((s2.t) r11.get(i13)).b()) {
                        return;
                    }
                }
                hd.b bVar = (hd.b) g1Var2.f26280c;
                v3.c cVar = (v3.c) g1Var2.f26282e;
                ViewConfiguration viewConfiguration = (ViewConfiguration) bVar.f32184b;
                int i14 = Build.VERSION.SDK_INT;
                float f5 = -(i14 > 26 ? w2.b(viewConfiguration) : cVar.e0(64));
                float f11 = -(i14 > 26 ? w2.a(viewConfiguration) : cVar.e0(64));
                f2.b bVar2 = new f2.b(0L);
                int size3 = r11.size();
                int i15 = 0;
                while (true) {
                    j12 = bVar2.f26570a;
                    if (i15 >= size3) {
                        break;
                    }
                    bVar2 = new f2.b(f2.b.h(j12, ((s2.t) r11.get(i15)).f51352j));
                    i15++;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 >> 32)) * f11)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 & 4294967295L)) * f5)));
                i2 i2Var = (i2) g1Var2.f26279b;
                float fG = i2Var.g(i2Var.e(jFloatToRawIntBits));
                if (fG == CropImageView.DEFAULT_ASPECT_RATIO ? false : fG > CropImageView.DEFAULT_ASPECT_RATIO ? i2Var.f26305a.d() : i2Var.f26305a.c() ? !(((tz.h) g1Var2.f26283f).i(new b1(jFloatToRawIntBits, ((s2.t) ry.m.q0(r11)).f51344b, false)) instanceof tz.n) : g1Var2.f26278a) {
                    int size4 = r11.size();
                    for (int i16 = 0; i16 < size4; i16++) {
                        ((s2.t) r11.get(i16)).a();
                    }
                }
            }
        }
    }

    @Override // f0.n0
    public final void b1(long j11) {
    }
}
