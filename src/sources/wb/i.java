package wb;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import com.google.accompanist.drawablepainter.DrawablePainter;
import l1.f2;
import l1.g1;
import l1.k1;
import rz.b2;
import rz.e0;
import rz.o0;
import tp.f0;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends k2.b implements f2 {
    public static final vr.a W = new vr.a(8);
    public g M;
    public k2.b N;
    public fz.c O;
    public fz.c P;
    public w2.j Q;
    public int R;
    public boolean S;
    public final k1 T;
    public final k1 U;
    public final k1 V;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public wz.d f54914f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i1 f54915t = x0.c(new f2.e(0));
    public final k1 H = l1.t.B(null);
    public final g1 K = new g1(1.0f);
    public final k1 L = l1.t.B(null);

    public i(gc.i iVar, vb.f fVar) {
        c cVar = c.f54905a;
        this.M = cVar;
        this.O = W;
        this.Q = w2.i.f54515b;
        this.R = 1;
        this.T = l1.t.B(cVar);
        this.U = l1.t.B(iVar);
        this.V = l1.t.B(fVar);
    }

    @Override // l1.f2
    public final void a() {
        wz.d dVar = this.f54914f;
        if (dVar != null) {
            e0.i(dVar, null);
        }
        this.f54914f = null;
        Object obj = this.N;
        f2 f2Var = obj instanceof f2 ? (f2) obj : null;
        if (f2Var != null) {
            f2Var.a();
        }
    }

    @Override // k2.b
    public final boolean b(float f5) {
        this.K.m(f5);
        return true;
    }

    @Override // k2.b
    public final boolean c(g2.p pVar) {
        this.L.setValue(pVar);
        return true;
    }

    @Override // l1.f2
    public final void d() {
        wz.d dVar = this.f54914f;
        if (dVar != null) {
            e0.i(dVar, null);
        }
        this.f54914f = null;
        Object obj = this.N;
        f2 f2Var = obj instanceof f2 ? (f2) obj : null;
        if (f2Var != null) {
            f2Var.d();
        }
    }

    @Override // l1.f2
    public final void f() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f54914f == null) {
                b2 b2VarE = e0.e();
                yz.f fVar = o0.f50940a;
                wz.d dVarC = e0.c(ew.a.w(b2VarE, wz.m.f55536a.f51961d));
                this.f54914f = dVarC;
                Object obj = this.N;
                vy.d dVar = null;
                f2 f2Var = obj instanceof f2 ? (f2) obj : null;
                if (f2Var != null) {
                    f2Var.f();
                }
                if (this.S) {
                    gc.h hVarA = gc.i.a((gc.i) this.U.getValue());
                    hVarA.f29003b = ((vb.i) ((vb.f) this.V.getValue())).f53829b;
                    hVarA.f29017q = null;
                    hVarA.a().f29042z.getClass();
                    gc.c cVar = kc.f.f38055a;
                    k(new e(null));
                } else {
                    e0.B(dVarC, null, null, new f0(this, dVar, 10), 3);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // k2.b
    public final long h() {
        k2.b bVar = (k2.b) this.H.getValue();
        if (bVar != null) {
            return bVar.h();
        }
        return 9205357640488583168L;
    }

    @Override // k2.b
    public final void i(i2.d dVar) {
        f2.e eVar = new f2.e(dVar.d());
        i1 i1Var = this.f54915t;
        i1Var.getClass();
        i1Var.l(null, eVar);
        k2.b bVar = (k2.b) this.H.getValue();
        if (bVar != null) {
            bVar.g(dVar, dVar.d(), this.K.l(), (g2.p) this.L.getValue());
        }
    }

    public final k2.b j(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? se.k.a(new g2.h(((BitmapDrawable) drawable).getBitmap()), this.R) : new DrawablePainter(drawable.mutate());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final void k(g gVar) {
        gc.j jVar;
        k2.b bVarA;
        fz.c cVar;
        Object objA;
        f2 f2Var;
        f2 f2Var2;
        g gVar2 = this.M;
        g gVar3 = (g) this.O.invoke(gVar);
        this.M = gVar3;
        this.T.setValue(gVar3);
        if (!(gVar3 instanceof f)) {
            if (gVar3 instanceof d) {
                jVar = ((d) gVar3).f54907b;
            } else {
                bVarA = null;
            }
            if (bVarA == null) {
                bVarA = gVar3.a();
            }
            this.N = bVarA;
            this.H.setValue(bVarA);
            if (this.f54914f != null && gVar2.a() != gVar3.a()) {
                objA = gVar2.a();
                if (objA instanceof f2) {
                    f2Var = (f2) objA;
                } else {
                    f2Var = null;
                }
                if (f2Var != null) {
                    f2Var.d();
                }
                Object objA2 = gVar3.a();
                f2Var2 = objA2 instanceof f2 ? (f2) objA2 : null;
                if (f2Var2 != null) {
                    f2Var2.f();
                }
            }
            cVar = this.P;
            if (cVar != null) {
                cVar.invoke(gVar3);
            }
        }
        jVar = ((f) gVar3).f54910b;
        jc.f fVarA = jVar.b().f29024g.a(k.f54916a, jVar);
        if (fVarA instanceof jc.b) {
            bVarA = new q(gVar2 instanceof e ? gVar2.a() : null, gVar3.a(), this.Q, ((jc.b) fVarA).f36298c, ((jVar instanceof gc.o) && ((gc.o) jVar).f29067g) ? false : true);
        } else {
            bVarA = null;
        }
        if (bVarA == null) {
            bVarA = gVar3.a();
        }
        this.N = bVarA;
        this.H.setValue(bVarA);
        if (this.f54914f != null) {
            objA = gVar2.a();
            if (objA instanceof f2) {
                f2Var = (f2) objA;
            } else {
                f2Var = null;
            }
            if (f2Var != null) {
                f2Var.d();
            }
            Object objA3 = gVar3.a();
            if (objA3 instanceof f2) {
            }
            if (f2Var2 != null) {
                f2Var2.f();
            }
        }
        cVar = this.P;
        if (cVar != null) {
            cVar.invoke(gVar3);
        }
    }
}
