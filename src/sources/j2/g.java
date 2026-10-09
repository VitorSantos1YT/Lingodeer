package j2;

import a0.o0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import com.yalantis.ucrop.view.CropImageView;
import dl.ExOZ.xItStCyvVEZ;
import g2.f0;
import g2.s;
import g2.v;
import g2.w;
import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f35596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.b f35597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f35598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f35599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f35600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f35601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f35605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f35606l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f35607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f35608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f35609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f35610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f35611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f35612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f35613t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f35614u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f35615v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s f35616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f35617x;

    @Override // j2.e
    public final void A() {
        Paint paint = this.f35600f;
        if (paint == null) {
            paint = new Paint();
            this.f35600f = paint;
        }
        paint.setColorFilter(null);
        R();
    }

    @Override // j2.e
    public final void B(float f5) {
        this.f35605k = f5;
        this.f35598d.setScaleX(f5);
    }

    @Override // j2.e
    public final float C() {
        return this.f35612s;
    }

    @Override // j2.e
    public final void D(long j11, int i11, int i12) {
        this.f35598d.setPosition(i11, i12, ((int) (j11 >> 32)) + i11, ((int) (4294967295L & j11)) + i12);
        this.f35599e = ff.h.P(j11);
    }

    @Override // j2.e
    public final float E() {
        return this.m;
    }

    @Override // j2.e
    public final void F(boolean z11) {
        this.f35613t = z11;
        P();
    }

    @Override // j2.e
    public final float G() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // j2.e
    public final void H(int i11) {
        this.f35617x = i11;
        R();
    }

    @Override // j2.e
    public final void I(float f5) {
        this.m = f5;
        this.f35598d.setTranslationX(f5);
    }

    @Override // j2.e
    public final void J(long j11) {
        this.f35610q = j11;
        this.f35598d.setSpotShadowColor(f0.E(j11));
    }

    @Override // j2.e
    public final Matrix K() {
        Matrix matrix = this.f35601g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f35601g = matrix;
        }
        this.f35598d.getMatrix(matrix);
        return matrix;
    }

    @Override // j2.e
    public final void L(float f5) {
        this.f35612s = f5;
        this.f35598d.setCameraDistance(f5);
    }

    @Override // j2.e
    public final float M() {
        return this.f35608o;
    }

    @Override // j2.e
    public final float N() {
        return this.f35606l;
    }

    @Override // j2.e
    public final int O() {
        return this.f35604j;
    }

    public final void P() {
        boolean z11 = this.f35613t;
        boolean z12 = false;
        boolean z13 = z11 && !this.f35602h;
        if (z11 && this.f35602h) {
            z12 = true;
        }
        if (z13 != this.f35614u) {
            this.f35614u = z13;
            this.f35598d.setClipToBounds(z13);
        }
        if (z12 != this.f35615v) {
            this.f35615v = z12;
            this.f35598d.setClipToOutline(z12);
        }
    }

    public final void Q(RenderNode renderNode, int i11) {
        if (i11 == 1) {
            renderNode.setUseCompositingLayer(true, this.f35600f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i11 == 2) {
            renderNode.setUseCompositingLayer(false, this.f35600f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f35600f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i11 = this.f35617x;
        if (i11 != 1 && this.f35604j == 3 && this.f35616w == null) {
            Q(this.f35598d, i11);
        } else {
            Q(this.f35598d, 1);
        }
    }

    @Override // j2.e
    public final float a() {
        return this.f35603i;
    }

    @Override // j2.e
    public final float b() {
        return this.f35605k;
    }

    @Override // j2.e
    public final void c(float f5) {
        this.f35608o = f5;
        this.f35598d.setElevation(f5);
    }

    @Override // j2.e
    public final s d() {
        return this.f35616w;
    }

    @Override // j2.e
    public final void e(float f5) {
        this.f35611r = f5;
        this.f35598d.setRotationZ(f5);
    }

    @Override // j2.e
    public final void f(float f5) {
        this.f35607n = f5;
        this.f35598d.setTranslationY(f5);
    }

    @Override // j2.e
    public final void g(Outline outline, long j11) {
        this.f35598d.setOutline(outline);
        this.f35602h = outline != null;
        P();
    }

    @Override // j2.e
    public final void h(int i11) {
        this.f35604j = i11;
        Paint paint = this.f35600f;
        if (paint == null) {
            paint = new Paint();
            this.f35600f = paint;
        }
        paint.setBlendMode(g2.b.d(i11));
        R();
    }

    @Override // j2.e
    public final void i() {
        this.f35598d.discardDisplayList();
    }

    @Override // j2.e
    public final int j() {
        return this.f35617x;
    }

    @Override // j2.e
    public final void k(v vVar) {
        g2.d.a(vVar).drawRenderNode(this.f35598d);
    }

    @Override // j2.e
    public final g2.p l() {
        return null;
    }

    @Override // j2.e
    public final void m(s sVar) {
        this.f35616w = sVar;
        if (Build.VERSION.SDK_INT >= 31) {
            b2.d.g(this.f35598d, sVar);
        }
    }

    @Override // j2.e
    public final void n(float f5) {
        this.f35606l = f5;
        this.f35598d.setScaleY(f5);
    }

    @Override // j2.e
    public final float o() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // j2.e
    public final boolean p() {
        return this.f35598d.hasDisplayList();
    }

    @Override // j2.e
    public final float q() {
        return this.f35611r;
    }

    @Override // j2.e
    public final void r(long j11) {
        if ((9223372034707292159L & j11) == 9205357640488583168L) {
            this.f35598d.resetPivot();
        } else {
            this.f35598d.setPivotX(Float.intBitsToFloat((int) (j11 >> 32)));
            this.f35598d.setPivotY(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
    }

    @Override // j2.e
    public final long s() {
        return this.f35609p;
    }

    @Override // j2.e
    public final void t() {
        this.f35598d.setRotationX(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // j2.e
    public final void u(float f5) {
        this.f35603i = f5;
        this.f35598d.setAlpha(f5);
    }

    @Override // j2.e
    public final void v(v3.c cVar, v3.m mVar, c cVar2, o0 o0Var) {
        i2.b bVar = this.f35597c;
        RecordingCanvas recordingCanvasBeginRecording = this.f35598d.beginRecording();
        try {
            w wVar = this.f35596b;
            g2.c cVar3 = wVar.f28614a;
            Canvas canvas = cVar3.f28539a;
            cVar3.f28539a = recordingCanvasBeginRecording;
            xq.c cVar4 = bVar.f34121b;
            cVar4.R(cVar);
            cVar4.S(mVar);
            cVar4.f56175c = cVar2;
            cVar4.T(this.f35599e);
            cVar4.Q(cVar3);
            o0Var.invoke(bVar);
            wVar.f28614a.f28539a = canvas;
        } finally {
            this.f35598d.endRecording();
        }
    }

    @Override // j2.e
    public final float w() {
        return this.f35607n;
    }

    @Override // j2.e
    public final void x() {
        this.f35598d.setRotationY(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // j2.e
    public final long y() {
        return this.f35610q;
    }

    @Override // j2.e
    public final void z(long j11) {
        this.f35609p = j11;
        this.f35598d.setAmbientShadowColor(f0.E(j11));
    }

    public g() {
        w wVar = new w();
        i2.b bVar = new i2.b();
        this.f35596b = wVar;
        this.f35597c = bVar;
        RenderNode renderNode = new RenderNode(xItStCyvVEZ.hXTLyhNXIIPy);
        this.f35598d = renderNode;
        this.f35599e = 0L;
        renderNode.setClipToBounds(false);
        Q(renderNode, 0);
        this.f35603i = 1.0f;
        this.f35604j = 3;
        this.f35605k = 1.0f;
        this.f35606l = 1.0f;
        long j11 = x.f28615b;
        this.f35609p = j11;
        this.f35610q = j11;
        this.f35612s = 8.0f;
        this.f35617x = 0;
    }
}
