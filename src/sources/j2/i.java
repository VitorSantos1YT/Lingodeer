package j2;

import a0.o0;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.layer.ViewLayer;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import g2.s;
import g2.v;
import g2.w;
import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements e {
    public static final h A = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DrawChildContainer f35618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f35619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewLayer f35620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f35621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f35622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f35623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f35626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f35628l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f35631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f35633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f35634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f35635t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f35636u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f35637v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f35638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f35639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f35640y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s f35641z;

    public i(DrawChildContainer drawChildContainer) {
        w wVar = new w();
        i2.b bVar = new i2.b();
        this.f35618b = drawChildContainer;
        this.f35619c = wVar;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, wVar, bVar);
        this.f35620d = viewLayer;
        this.f35621e = drawChildContainer.getResources();
        this.f35622f = new Rect();
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.f35626j = 0L;
        View.generateViewId();
        this.f35629n = 3;
        this.f35630o = 0;
        this.f35631p = 1.0f;
        this.f35633r = 1.0f;
        this.f35634s = 1.0f;
        long j11 = x.f28615b;
        this.f35638w = j11;
        this.f35639x = j11;
    }

    @Override // j2.e
    public final void A() {
        Paint paint = this.f35623g;
        if (paint == null) {
            paint = new Paint();
            this.f35623g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // j2.e
    public final void B(float f5) {
        this.f35633r = f5;
        this.f35620d.setScaleX(f5);
    }

    @Override // j2.e
    public final float C() {
        return this.f35620d.getCameraDistance() / this.f35621e.getDisplayMetrics().densityDpi;
    }

    @Override // j2.e
    public final void D(long j11, int i11, int i12) {
        boolean zA = v3.l.a(this.f35626j, j11);
        ViewLayer viewLayer = this.f35620d;
        if (zA) {
            int i13 = this.f35624h;
            if (i13 != i11) {
                viewLayer.offsetLeftAndRight(i11 - i13);
            }
            int i14 = this.f35625i;
            if (i14 != i12) {
                viewLayer.offsetTopAndBottom(i12 - i14);
            }
        } else {
            if (this.m || viewLayer.getClipToOutline()) {
                this.f35627k = true;
            }
            int i15 = (int) (j11 >> 32);
            int i16 = (int) (4294967295L & j11);
            viewLayer.layout(i11, i12, i11 + i15, i12 + i16);
            this.f35626j = j11;
            if (this.f35632q) {
                viewLayer.setPivotX(i15 / 2.0f);
                viewLayer.setPivotY(i16 / 2.0f);
            }
        }
        this.f35624h = i11;
        this.f35625i = i12;
    }

    @Override // j2.e
    public final float E() {
        return this.f35635t;
    }

    @Override // j2.e
    public final void F(boolean z11) {
        boolean z12 = false;
        this.m = z11 && !this.f35628l;
        this.f35627k = true;
        if (z11 && this.f35628l) {
            z12 = true;
        }
        this.f35620d.setClipToOutline(z12);
    }

    @Override // j2.e
    public final float G() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // j2.e
    public final void H(int i11) {
        this.f35630o = i11;
        Q();
    }

    @Override // j2.e
    public final void I(float f5) {
        this.f35635t = f5;
        this.f35620d.setTranslationX(f5);
    }

    @Override // j2.e
    public final void J(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f35639x = j11;
            a2.l.F(this.f35620d, f0.E(j11));
        }
    }

    @Override // j2.e
    public final Matrix K() {
        return this.f35620d.getMatrix();
    }

    @Override // j2.e
    public final void L(float f5) {
        this.f35620d.setCameraDistance(f5 * this.f35621e.getDisplayMetrics().densityDpi);
    }

    @Override // j2.e
    public final float M() {
        return this.f35637v;
    }

    @Override // j2.e
    public final float N() {
        return this.f35634s;
    }

    @Override // j2.e
    public final int O() {
        return this.f35629n;
    }

    public final void P(int i11) {
        ViewLayer viewLayer = this.f35620d;
        boolean z11 = true;
        if (i11 == 1) {
            viewLayer.setLayerType(2, this.f35623g);
        } else if (i11 == 2) {
            viewLayer.setLayerType(0, this.f35623g);
            z11 = false;
        } else {
            viewLayer.setLayerType(0, this.f35623g);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics(z11);
    }

    public final void Q() {
        int i11 = this.f35630o;
        if (i11 != 1 && this.f35629n == 3) {
            P(i11);
        } else {
            P(1);
        }
    }

    @Override // j2.e
    public final float a() {
        return this.f35631p;
    }

    @Override // j2.e
    public final float b() {
        return this.f35633r;
    }

    @Override // j2.e
    public final void c(float f5) {
        this.f35637v = f5;
        this.f35620d.setElevation(f5);
    }

    @Override // j2.e
    public final s d() {
        return this.f35641z;
    }

    @Override // j2.e
    public final void e(float f5) {
        this.f35640y = f5;
        this.f35620d.setRotation(f5);
    }

    @Override // j2.e
    public final void f(float f5) {
        this.f35636u = f5;
        this.f35620d.setTranslationY(f5);
    }

    @Override // j2.e
    public final void g(Outline outline, long j11) {
        ViewLayer viewLayer = this.f35620d;
        viewLayer.f1139e = outline;
        viewLayer.invalidateOutline();
        if ((this.m || viewLayer.getClipToOutline()) && outline != null) {
            viewLayer.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.f35627k = true;
            }
        }
        this.f35628l = outline != null;
    }

    @Override // j2.e
    public final void h(int i11) {
        this.f35629n = i11;
        Paint paint = this.f35623g;
        if (paint == null) {
            paint = new Paint();
            this.f35623g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(g2.b.e(i11)));
        Q();
    }

    @Override // j2.e
    public final void i() {
        this.f35618b.removeViewInLayout(this.f35620d);
    }

    @Override // j2.e
    public final int j() {
        return this.f35630o;
    }

    @Override // j2.e
    public final void k(v vVar) {
        Rect rect;
        boolean z11 = this.f35627k;
        ViewLayer viewLayer = this.f35620d;
        if (z11) {
            if ((this.m || viewLayer.getClipToOutline()) && !this.f35628l) {
                rect = this.f35622f;
                rect.left = 0;
                rect.top = 0;
                rect.right = viewLayer.getWidth();
                rect.bottom = viewLayer.getHeight();
            } else {
                rect = null;
            }
            viewLayer.setClipBounds(rect);
        }
        if (g2.d.a(vVar).isHardwareAccelerated()) {
            this.f35618b.a(vVar, viewLayer, viewLayer.getDrawingTime());
        }
    }

    @Override // j2.e
    public final g2.p l() {
        return null;
    }

    @Override // j2.e
    public final void m(s sVar) {
        this.f35641z = sVar;
        if (Build.VERSION.SDK_INT >= 31) {
            b2.d.h(this.f35620d, sVar);
        }
    }

    @Override // j2.e
    public final void n(float f5) {
        this.f35634s = f5;
        this.f35620d.setScaleY(f5);
    }

    @Override // j2.e
    public final float o() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // j2.e
    public final float q() {
        return this.f35640y;
    }

    @Override // j2.e
    public final void r(long j11) {
        long j12 = 9223372034707292159L & j11;
        ViewLayer viewLayer = this.f35620d;
        if (j12 != 9205357640488583168L) {
            this.f35632q = false;
            viewLayer.setPivotX(Float.intBitsToFloat((int) (j11 >> 32)));
            viewLayer.setPivotY(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                a2.l.x(viewLayer);
                return;
            }
            this.f35632q = true;
            viewLayer.setPivotX(((int) (this.f35626j >> 32)) / 2.0f);
            viewLayer.setPivotY(((int) (this.f35626j & 4294967295L)) / 2.0f);
        }
    }

    @Override // j2.e
    public final long s() {
        return this.f35638w;
    }

    @Override // j2.e
    public final void t() {
        this.f35620d.setRotationX(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // j2.e
    public final void u(float f5) {
        this.f35631p = f5;
        this.f35620d.setAlpha(f5);
    }

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
    @Override // j2.e
    public final void v(v3.c cVar, v3.m mVar, c cVar2, o0 o0Var) {
        ViewLayer viewLayer = this.f35620d;
        ViewParent parent = viewLayer.getParent();
        DrawChildContainer drawChildContainer = this.f35618b;
        if (parent == null) {
            drawChildContainer.addView(viewLayer);
        }
        viewLayer.f1141t = cVar;
        viewLayer.H = mVar;
        viewLayer.K = o0Var;
        viewLayer.L = cVar2;
        if (viewLayer.isAttachedToWindow()) {
            viewLayer.setVisibility(4);
            viewLayer.setVisibility(0);
            try {
                w wVar = this.f35619c;
                h hVar = A;
                g2.c cVar3 = wVar.f28614a;
                Canvas canvas = cVar3.f28539a;
                cVar3.f28539a = hVar;
                drawChildContainer.a(cVar3, viewLayer, viewLayer.getDrawingTime());
                wVar.f28614a.f28539a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // j2.e
    public final float w() {
        return this.f35636u;
    }

    @Override // j2.e
    public final void x() {
        this.f35620d.setRotationY(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // j2.e
    public final long y() {
        return this.f35639x;
    }

    @Override // j2.e
    public final void z(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f35638w = j11;
            a2.l.E(this.f35620d, f0.E(j11));
        }
    }
}
