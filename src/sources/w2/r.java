package w2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends androidx.datastore.preferences.protobuf.l implements Runnable, z4.u, View.OnAttachStateChangeListener {
    public final y.e0 H;
    public final x1.p K;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z4.v1 f54572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y.i0 f54573f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l1.h1 f54574t;

    public r() {
        super(1);
        y.i0 i0Var = new y.i0(9);
        v1.f54594a.getClass();
        i0Var.m(u1.f54580b, new y1("caption bar"));
        i0Var.m(u1.f54581c, new y1("display cutout"));
        i0Var.m(u1.f54582d, new y1("ime"));
        i0Var.m(u1.f54583e, new y1("mandatory system gestures"));
        i0Var.m(u1.f54584f, new y1("navigation bars"));
        i0Var.m(u1.f54585g, new y1("status bars"));
        i0Var.m(u1.f54586h, new y1("system gestures"));
        i0Var.m(u1.f54587i, new y1("tappable element"));
        i0Var.m(u1.f54588j, new y1("waterfall"));
        this.f54573f = i0Var;
        this.f54574t = new l1.h1(0);
        this.H = new y.e0(4);
        this.K = new x1.p();
    }

    public final void F(z4.v1 v1Var) {
        char c11;
        char c12;
        boolean z11;
        char c13;
        boolean z12;
        boolean z13;
        long j11;
        boolean z14;
        boolean z15;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i11;
        y.x xVar = x1.f54603a;
        int[] iArr2 = xVar.f56737b;
        Object[] objArr3 = xVar.f56738c;
        long[] jArr2 = xVar.f56736a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            z12 = false;
            z13 = false;
            c11 = 16;
            c12 = ' ';
            while (true) {
                long j12 = jArr2[i12];
                z11 = true;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    c13 = '0';
                    while (i15 < i14) {
                        if ((j12 & 255) < 128) {
                            int i16 = (i12 << 3) + i15;
                            int i17 = iArr2[i16];
                            v1 v1Var2 = (v1) objArr3[i16];
                            r4.d dVarG = v1Var.f58905a.g(i17);
                            long j13 = (((long) dVarG.f48793a) << 48) | (((long) dVarG.f48794b) << 32) | (((long) dVarG.f48795c) << 16) | ((long) dVarG.f48796d);
                            Object objG = this.f54573f.g(v1Var2);
                            kotlin.jvm.internal.m.c(objG);
                            y1 y1Var = (y1) objG;
                            if (!a0.g(j13, y1Var.f54613h)) {
                                y1Var.f54613h = j13;
                                z12 = true;
                                if (!a0.g(j13, 0L)) {
                                    z13 = true;
                                }
                            }
                            if (i17 != 8) {
                                r4.d dVarH = v1Var.f58905a.h(i17);
                                objArr2 = objArr3;
                                long j14 = (((long) dVarH.f48794b) << 32) | (((long) dVarH.f48793a) << 48) | (((long) dVarH.f48795c) << 16) | ((long) dVarH.f48796d);
                                if (!a0.g(y1Var.f54614i, j14)) {
                                    y1Var.f54614i = j14;
                                    z12 = true;
                                    if (!a0.g(j14, 0L)) {
                                        z13 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            y1Var.f54606a.setValue(Boolean.valueOf(v1Var.f58905a.q(i17)));
                            i11 = 8;
                        } else {
                            objArr2 = objArr3;
                            i11 = i13;
                        }
                        j12 >>= i11;
                        i15++;
                        i13 = i11;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c13 = '0';
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c11 = 16;
            c12 = ' ';
            z11 = true;
            c13 = '0';
            z12 = false;
            z13 = false;
        }
        z4.j jVarF = v1Var.f58905a.f();
        if (jVarF == null) {
            j11 = 0;
        } else {
            r4.d dVarA = jVarF.a();
            j11 = (((long) dVarA.f48793a) << c13) | (((long) dVarA.f48794b) << c12) | (((long) dVarA.f48795c) << c11) | ((long) dVarA.f48796d);
        }
        y.i0 i0Var = this.f54573f;
        v1.f54594a.getClass();
        Object objG2 = i0Var.g(u1.f54588j);
        kotlin.jvm.internal.m.c(objG2);
        y1 y1Var2 = (y1) objG2;
        y1Var2.f54606a.setValue(Boolean.valueOf(!a0.g(j11, 0L)));
        if (!a0.g(y1Var2.f54613h, j11)) {
            y1Var2.f54613h = j11;
            y1Var2.f54614i = j11;
            z12 = z11;
            if (!a0.g(j11, 0L)) {
                z13 = z12;
            }
        }
        if (jVarF == null) {
            y.e0 e0Var = this.H;
            if (e0Var.f56687b > 0) {
                e0Var.d();
                this.K.clear();
                z12 = z11;
            }
        } else {
            List listI = Build.VERSION.SDK_INT >= 28 ? a2.l.i(jVarF.f58859a) : Collections.EMPTY_LIST;
            int size = listI.size();
            y.e0 e0Var2 = this.H;
            if (size < e0Var2.f56687b) {
                e0Var2.l(listI.size(), this.H.f56687b);
                this.K.e(listI.size(), this.K.size());
                z12 = z11;
            } else {
                int size2 = listI.size() - this.H.f56687b;
                int i18 = 0;
                while (i18 < size2) {
                    y.e0 e0Var3 = this.H;
                    e0Var3.a(l1.t.B(listI.get(e0Var3.f56687b)));
                    this.K.add(new q("display cutout rect " + this.H.f56687b));
                    i18++;
                    z12 = z11;
                }
            }
            int size3 = listI.size();
            for (int i19 = 0; i19 < size3; i19++) {
                Rect rect = (Rect) listI.get(i19);
                l1.b1 b1Var = (l1.b1) this.H.f(i19);
                if (!kotlin.jvm.internal.m.a(b1Var.getValue(), rect)) {
                    b1Var.setValue(rect);
                    z12 = z11;
                }
            }
            if (!listI.isEmpty()) {
                z13 = z11;
            }
        }
        if ((z13 || this.f54574t.l() != 0) && z12) {
            l1.h1 h1Var = this.f54574t;
            h1Var.m(h1Var.l() + 1);
            synchronized (x1.l.f55691c) {
                y.j0 j0Var = x1.l.f55698j.f55643h;
                z14 = (j0Var == null || j0Var.h() != (z15 = z11)) ? false : z15;
            }
            if (z14) {
                x1.l.a();
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void d(z4.g1 g1Var) {
        boolean z11 = false;
        this.f54570c = false;
        int iD = g1Var.f58839a.d();
        this.f54571d &= ~iD;
        this.f54572e = null;
        v1 v1Var = (v1) x1.f54603a.b(iD);
        if (v1Var != null) {
            Object objG = this.f54573f.g(v1Var);
            kotlin.jvm.internal.m.c(objG);
            y1 y1Var = (y1) objG;
            y1Var.f54608c.m(CropImageView.DEFAULT_ASPECT_RATIO);
            y1Var.f54610e.m(1.0f);
            y1Var.f54609d.n(0L);
            y1Var.f54608c.m(CropImageView.DEFAULT_ASPECT_RATIO);
            y1Var.f54607b.setValue(Boolean.FALSE);
            y1Var.f54615j = -1L;
            y1Var.f54616k = -1L;
            l1.h1 h1Var = this.f54574t;
            h1Var.m(h1Var.l() + 1);
            synchronized (x1.l.f55691c) {
                y.j0 j0Var = x1.l.f55698j.f55643h;
                if (j0Var != null && j0Var.h()) {
                    z11 = true;
                }
            }
            if (z11) {
                x1.l.a();
            }
        }
    }

    @Override // z4.u
    public final z4.v1 e(View view, z4.v1 v1Var) {
        if (this.f54570c) {
            this.f54572e = v1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return v1Var;
            }
        } else if (this.f54571d == 0) {
            F(v1Var);
        }
        return v1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void f(z4.g1 g1Var) {
        this.f54570c = true;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final z4.v1 g(z4.v1 v1Var, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            z4.g1 g1Var = (z4.g1) list.get(i11);
            v1 v1Var2 = (v1) x1.f54603a.b(g1Var.f58839a.d());
            if (v1Var2 != null) {
                Object objG = this.f54573f.g(v1Var2);
                kotlin.jvm.internal.m.c(objG);
                y1 y1Var = (y1) objG;
                if (((Boolean) y1Var.f54607b.getValue()).booleanValue()) {
                    z4.f1 f1Var = g1Var.f58839a;
                    y1Var.f54608c.m(f1Var.c());
                    y1Var.f54610e.m(f1Var.a());
                    y1Var.f54609d.n(f1Var.b());
                }
            }
        }
        F(v1Var);
        return v1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final o2 h(z4.g1 g1Var, o2 o2Var) {
        z4.v1 v1Var = this.f54572e;
        boolean z11 = false;
        this.f54570c = false;
        this.f54572e = null;
        if (g1Var.f58839a.b() > 0 && v1Var != null) {
            int iD = g1Var.f58839a.d();
            this.f54571d |= iD;
            v1 v1Var2 = (v1) x1.f54603a.b(iD);
            if (v1Var2 != null) {
                Object objG = this.f54573f.g(v1Var2);
                kotlin.jvm.internal.m.c(objG);
                y1 y1Var = (y1) objG;
                r4.d dVarG = v1Var.f58905a.g(iD);
                long j11 = (((long) dVarG.f48793a) << 48) | (((long) dVarG.f48794b) << 32) | (((long) dVarG.f48795c) << 16) | ((long) dVarG.f48796d);
                long j12 = y1Var.f54613h;
                if (!a0.g(j11, j12)) {
                    y1Var.f54615j = j12;
                    y1Var.f54616k = j11;
                    y1Var.f54607b.setValue(Boolean.TRUE);
                    z4.f1 f1Var = g1Var.f58839a;
                    y1Var.f54608c.m(f1Var.c());
                    y1Var.f54610e.m(f1Var.a());
                    y1Var.f54609d.n(f1Var.b());
                    l1.h1 h1Var = this.f54574t;
                    h1Var.m(h1Var.l() + 1);
                    synchronized (x1.l.f55691c) {
                        y.j0 j0Var = x1.l.f55698j.f55643h;
                        if (j0Var != null && j0Var.h()) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        x1.l.a();
                        return o2Var;
                    }
                }
            }
        }
        return o2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = z4.s0.f58893a;
        z4.j0.m(view, this);
        z4.s0.s(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = z4.s0.f58893a;
        z4.j0.m(view, null);
        z4.s0.s(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f54570c) {
            this.f54571d = 0;
            this.f54570c = false;
            z4.v1 v1Var = this.f54572e;
            if (v1Var != null) {
                F(v1Var);
                this.f54572e = null;
            }
        }
    }
}
