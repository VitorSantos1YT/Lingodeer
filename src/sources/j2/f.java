package j2;

import a0.o0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import g2.s;
import g2.v;
import g2.w;
import g2.x;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e {
    public static final AtomicBoolean A = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f35572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.b f35573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f35574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f35575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f35576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f35577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f35579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f35582l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f35583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f35584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f35585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f35586q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f35587r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f35588s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f35589t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f35590u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f35591v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f35592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f35593x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f35594y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s f35595z;

    public f(AndroidComposeView androidComposeView, w wVar, i2.b bVar) {
        this.f35572b = wVar;
        this.f35573c = bVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f35574d = renderNodeCreate;
        this.f35575e = 0L;
        this.f35579i = 0L;
        if (A.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                p.c(renderNodeCreate, p.a(renderNodeCreate));
                p.d(renderNodeCreate, p.b(renderNodeCreate));
            }
            o.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        Q(0);
        this.f35580j = 0;
        this.f35581k = 3;
        this.f35582l = 1.0f;
        this.f35583n = 1.0f;
        this.f35584o = 1.0f;
        long j11 = x.f28615b;
        this.f35588s = j11;
        this.f35589t = j11;
        this.f35591v = 8.0f;
    }

    @Override // j2.e
    public final void A() {
        R();
    }

    @Override // j2.e
    public final void B(float f5) {
        this.f35583n = f5;
        this.f35574d.setScaleX(f5);
    }

    @Override // j2.e
    public final float C() {
        return this.f35591v;
    }

    @Override // j2.e
    public final void D(long j11, int i11, int i12) {
        int i13 = (int) (j11 >> 32);
        int i14 = (int) (4294967295L & j11);
        this.f35574d.setLeftTopRightBottom(i11, i12, i11 + i13, i12 + i14);
        if (v3.l.a(this.f35575e, j11)) {
            return;
        }
        if (this.m) {
            this.f35574d.setPivotX(i13 / 2.0f);
            this.f35574d.setPivotY(i14 / 2.0f);
        }
        this.f35575e = j11;
    }

    @Override // j2.e
    public final float E() {
        return this.f35585p;
    }

    @Override // j2.e
    public final void F(boolean z11) {
        this.f35592w = z11;
        P();
    }

    @Override // j2.e
    public final float G() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // j2.e
    public final void H(int i11) {
        this.f35580j = i11;
        R();
    }

    @Override // j2.e
    public final void I(float f5) {
        this.f35585p = f5;
        this.f35574d.setTranslationX(f5);
    }

    @Override // j2.e
    public final void J(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f35589t = j11;
            p.d(this.f35574d, f0.E(j11));
        }
    }

    @Override // j2.e
    public final Matrix K() {
        Matrix matrix = this.f35577g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f35577g = matrix;
        }
        this.f35574d.getMatrix(matrix);
        return matrix;
    }

    @Override // j2.e
    public final void L(float f5) {
        this.f35591v = f5;
        this.f35574d.setCameraDistance(-f5);
    }

    @Override // j2.e
    public final float M() {
        return this.f35587r;
    }

    @Override // j2.e
    public final float N() {
        return this.f35584o;
    }

    @Override // j2.e
    public final int O() {
        return this.f35581k;
    }

    public final void P() {
        boolean z11 = this.f35592w;
        boolean z12 = false;
        boolean z13 = z11 && !this.f35578h;
        if (z11 && this.f35578h) {
            z12 = true;
        }
        if (z13 != this.f35593x) {
            this.f35593x = z13;
            this.f35574d.setClipToBounds(z13);
        }
        if (z12 != this.f35594y) {
            this.f35594y = z12;
            this.f35574d.setClipToOutline(z12);
        }
    }

    public final void Q(int i11) {
        RenderNode renderNode = this.f35574d;
        if (i11 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f35576f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i11 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f35576f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f35576f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i11 = this.f35580j;
        if (i11 != 1 && this.f35581k == 3) {
            Q(i11);
        } else {
            Q(1);
        }
    }

    @Override // j2.e
    public final float a() {
        return this.f35582l;
    }

    @Override // j2.e
    public final float b() {
        return this.f35583n;
    }

    @Override // j2.e
    public final void c(float f5) {
        this.f35587r = f5;
        this.f35574d.setElevation(f5);
    }

    @Override // j2.e
    public final s d() {
        return this.f35595z;
    }

    @Override // j2.e
    public final void e(float f5) {
        this.f35590u = f5;
        this.f35574d.setRotation(f5);
    }

    @Override // j2.e
    public final void f(float f5) {
        this.f35586q = f5;
        this.f35574d.setTranslationY(f5);
    }

    @Override // j2.e
    public final void g(Outline outline, long j11) {
        this.f35579i = j11;
        this.f35574d.setOutline(outline);
        this.f35578h = outline != null;
        P();
    }

    @Override // j2.e
    public final void h(int i11) {
        if (this.f35581k == i11) {
            return;
        }
        this.f35581k = i11;
        Paint paint = this.f35576f;
        if (paint == null) {
            paint = new Paint();
            this.f35576f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(g2.b.e(i11)));
        R();
    }

    @Override // j2.e
    public final void i() {
        o.a(this.f35574d);
    }

    @Override // j2.e
    public final int j() {
        return this.f35580j;
    }

    @Override // j2.e
    public final void k(v vVar) {
        DisplayListCanvas displayListCanvasA = g2.d.a(vVar);
        kotlin.jvm.internal.m.d(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.f35574d);
    }

    @Override // j2.e
    public final g2.p l() {
        return null;
    }

    @Override // j2.e
    public final void m(s sVar) {
        this.f35595z = sVar;
    }

    @Override // j2.e
    public final void n(float f5) {
        this.f35584o = f5;
        this.f35574d.setScaleY(f5);
    }

    @Override // j2.e
    public final float o() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // j2.e
    public final boolean p() {
        return this.f35574d.isValid();
    }

    @Override // j2.e
    public final float q() {
        return this.f35590u;
    }

    @Override // j2.e
    public final void r(long j11) {
        if ((9223372034707292159L & j11) == 9205357640488583168L) {
            this.m = true;
            this.f35574d.setPivotX(((int) (this.f35575e >> 32)) / 2.0f);
            this.f35574d.setPivotY(((int) (4294967295L & this.f35575e)) / 2.0f);
        } else {
            this.m = false;
            this.f35574d.setPivotX(Float.intBitsToFloat((int) (j11 >> 32)));
            this.f35574d.setPivotY(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
    }

    @Override // j2.e
    public final long s() {
        return this.f35588s;
    }

    @Override // j2.e
    public final void t() {
        this.f35574d.setRotationX(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // j2.e
    public final void u(float f5) {
        this.f35582l = f5;
        this.f35574d.setAlpha(f5);
    }

    @Override // j2.e
    public final void v(v3.c cVar, v3.m mVar, c cVar2, o0 o0Var) {
        Canvas canvasStart = this.f35574d.start(Math.max((int) (this.f35575e >> 32), (int) (this.f35579i >> 32)), Math.max((int) (this.f35575e & 4294967295L), (int) (this.f35579i & 4294967295L)));
        try {
            g2.c cVar3 = this.f35572b.f28614a;
            Canvas canvas = cVar3.f28539a;
            cVar3.f28539a = canvasStart;
            i2.b bVar = this.f35573c;
            xq.c cVar4 = bVar.f34121b;
            long jP = ff.h.P(this.f35575e);
            v3.c cVarA = cVar4.A();
            v3.m mVarE = cVar4.E();
            v vVarX = cVar4.x();
            long jH = cVar4.H();
            c cVar5 = (c) cVar4.f56175c;
            cVar4.R(cVar);
            cVar4.S(mVar);
            cVar4.Q(cVar3);
            cVar4.T(jP);
            cVar4.f56175c = cVar2;
            cVar3.e();
            try {
                o0Var.invoke(bVar);
                cVar3.p();
                cVar4.R(cVarA);
                cVar4.S(mVarE);
                cVar4.Q(vVarX);
                cVar4.T(jH);
                cVar4.f56175c = cVar5;
                cVar3.f28539a = canvas;
                this.f35574d.end(canvasStart);
            } catch (Throwable th2) {
                cVar3.p();
                xq.c cVar6 = bVar.f34121b;
                cVar6.R(cVarA);
                cVar6.S(mVarE);
                cVar6.Q(vVarX);
                cVar6.T(jH);
                cVar6.f56175c = cVar5;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f35574d.end(canvasStart);
            throw th3;
        }
    }

    @Override // j2.e
    public final float w() {
        return this.f35586q;
    }

    @Override // j2.e
    public final void x() {
        this.f35574d.setRotationY(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // j2.e
    public final long y() {
        return this.f35589t;
    }

    @Override // j2.e
    public final void z(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f35588s = j11;
            p.c(this.f35574d, f0.E(j11));
        }
    }
}
