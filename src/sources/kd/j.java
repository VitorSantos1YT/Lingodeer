package kd;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import com.android.billingclient.api.c0;
import com.yalantis.ucrop.view.CropImageView;
import gd.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final Matrix B = new Matrix();
    public b A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f38099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f38100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f38101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f38102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f38103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f38104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f38105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f38106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f38107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f38108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f38109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f38110l;
    public Canvas m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f38111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f38112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Matrix f38113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float[] f38114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f38115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f38116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Canvas f38117t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Canvas f38118u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f38119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f38120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f38121x = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RenderNode f38122y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RenderNode f38123z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, b bVar) {
        if (this.f38103e == null) {
            this.f38103e = new RectF();
        }
        if (this.f38105g == null) {
            this.f38105g = new RectF();
        }
        this.f38103e.set(rectF);
        this.f38103e.offsetTo(rectF.left + bVar.f38083b, rectF.top + bVar.f38084c);
        RectF rectF2 = this.f38103e;
        float f5 = bVar.f38082a;
        rectF2.inset(-f5, -f5);
        this.f38105g.set(rectF);
        this.f38103e.union(this.f38105g);
        return this.f38103e;
    }

    public final void c() {
        float f5;
        m mVar;
        if (this.f38099a == null || this.f38100b == null || this.f38114q == null || this.f38102d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f38101c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f38099a.restore();
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (this.f38122y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f38099a.save();
                    Canvas canvas = this.f38099a;
                    float[] fArr = this.f38114q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f38122y.endRecording();
                    if (this.f38100b.d()) {
                        Canvas canvas2 = this.f38099a;
                        b bVar = (b) this.f38100b.f7471c;
                        if (this.f38122y == null || this.f38123z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i11 < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f38114q;
                        float f11 = fArr2 != null ? fArr2[0] : 1.0f;
                        f5 = fArr2 != null ? fArr2[4] : 1.0f;
                        b bVar2 = this.A;
                        if (bVar2 == null || bVar.f38082a != bVar2.f38082a || bVar.f38083b != bVar2.f38083b || bVar.f38084c != bVar2.f38084c || bVar.f38085d != bVar2.f38085d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(bVar.f38085d, PorterDuff.Mode.SRC_IN));
                            float f12 = bVar.f38082a;
                            if (f12 > CropImageView.DEFAULT_ASPECT_RATIO) {
                                float f13 = ((f11 + f5) * f12) / 2.0f;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f13, f13, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f38123z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.A = bVar;
                        }
                        RectF rectFB = b(this.f38102d, bVar);
                        RectF rectF = new RectF(rectFB.left * f11, rectFB.top * f5, rectFB.right * f11, rectFB.bottom * f5);
                        this.f38123z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.f38123z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((bVar.f38083b * f11) + (-rectF.left), (bVar.f38084c * f5) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.f38122y);
                        this.f38123z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f38123z);
                        canvas2.restore();
                    }
                    this.f38099a.drawRenderNode(this.f38122y);
                    this.f38099a.restore();
                }
            } else {
                if (this.f38110l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f38100b.d()) {
                    Canvas canvas3 = this.f38099a;
                    b bVar3 = (b) this.f38100b.f7471c;
                    RectF rectF2 = this.f38102d;
                    if (rectF2 == null || this.f38110l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF rectFB2 = b(rectF2, bVar3);
                    if (this.f38104f == null) {
                        this.f38104f = new Rect();
                    }
                    this.f38104f.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.f38114q;
                    float f14 = fArr3 != null ? fArr3[0] : 1.0f;
                    f5 = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f38106h == null) {
                        this.f38106h = new RectF();
                    }
                    this.f38106h.set(rectFB2.left * f14, rectFB2.top * f5, rectFB2.right * f14, rectFB2.bottom * f5);
                    if (this.f38107i == null) {
                        this.f38107i = new Rect();
                    }
                    this.f38107i.set(0, 0, Math.round(this.f38106h.width()), Math.round(this.f38106h.height()));
                    if (d(this.f38115r, this.f38106h)) {
                        Bitmap bitmap = this.f38115r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f38116s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f38115r = a(this.f38106h, Bitmap.Config.ARGB_8888);
                        this.f38116s = a(this.f38106h, Bitmap.Config.ALPHA_8);
                        this.f38117t = new Canvas(this.f38115r);
                        this.f38118u = new Canvas(this.f38116s);
                    } else {
                        Canvas canvas4 = this.f38117t;
                        if (canvas4 == null || this.f38118u == null || (mVar = this.f38112o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.f38107i, mVar);
                        this.f38118u.drawRect(this.f38107i, this.f38112o);
                    }
                    if (this.f38116s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.f38119v == null) {
                        this.f38119v = new m(1, 2);
                    }
                    RectF rectF3 = this.f38102d;
                    this.f38118u.drawBitmap(this.f38110l, Math.round((rectF3.left - rectFB2.left) * f14), Math.round((rectF3.top - rectFB2.top) * f5), (Paint) null);
                    if (this.f38120w == null || this.f38121x != bVar3.f38082a) {
                        float f15 = ((f14 + f5) * bVar3.f38082a) / 2.0f;
                        if (f15 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            this.f38120w = new BlurMaskFilter(f15, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f38120w = null;
                        }
                        this.f38121x = bVar3.f38082a;
                    }
                    this.f38119v.setColor(bVar3.f38085d);
                    if (bVar3.f38082a > CropImageView.DEFAULT_ASPECT_RATIO) {
                        this.f38119v.setMaskFilter(this.f38120w);
                    } else {
                        this.f38119v.setMaskFilter(null);
                    }
                    this.f38119v.setFilterBitmap(true);
                    this.f38117t.drawBitmap(this.f38116s, Math.round(bVar3.f38083b * f14), Math.round(bVar3.f38084c * f5), this.f38119v);
                    canvas3.drawBitmap(this.f38115r, this.f38107i, this.f38104f, this.f38109k);
                }
                if (this.f38111n == null) {
                    this.f38111n = new Rect();
                }
                this.f38111n.set(0, 0, (int) (this.f38102d.width() * this.f38114q[0]), (int) (this.f38102d.height() * this.f38114q[4]));
                this.f38099a.drawBitmap(this.f38110l, this.f38111n, this.f38102d, this.f38109k);
            }
        }
        this.f38099a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, c0 c0Var) {
        i iVar;
        if (this.f38099a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f38114q == null) {
            this.f38114q = new float[9];
        }
        if (this.f38113p == null) {
            this.f38113p = new Matrix();
        }
        canvas.getMatrix(this.f38113p);
        this.f38113p.getValues(this.f38114q);
        float[] fArr = this.f38114q;
        float f5 = fArr[0];
        float f11 = fArr[4];
        if (this.f38108j == null) {
            this.f38108j = new RectF();
        }
        this.f38108j.set(rectF.left * f5, rectF.top * f11, rectF.right * f5, rectF.bottom * f11);
        this.f38099a = canvas;
        this.f38100b = c0Var;
        if (c0Var.f7470b >= 255 && !c0Var.d()) {
            iVar = i.DIRECT;
        } else if (c0Var.d()) {
            int i11 = Build.VERSION.SDK_INT;
            iVar = (i11 < 29 || !canvas.isHardwareAccelerated() || i11 <= 31) ? i.BITMAP : i.RENDER_NODE;
        } else {
            iVar = i.SAVE_LAYER;
        }
        this.f38101c = iVar;
        if (this.f38102d == null) {
            this.f38102d = new RectF();
        }
        this.f38102d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f38109k == null) {
            this.f38109k = new m();
        }
        this.f38109k.reset();
        int iOrdinal = this.f38101c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.f38109k.setAlpha(c0Var.f7470b);
            this.f38109k.setColorFilter(null);
            k.e(canvas, rectF, this.f38109k);
            return canvas;
        }
        Matrix matrix = B;
        if (iOrdinal == 2) {
            if (this.f38112o == null) {
                m mVar = new m();
                this.f38112o = mVar;
                mVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.f38110l, this.f38108j)) {
                Bitmap bitmap = this.f38110l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f38110l = a(this.f38108j, Bitmap.Config.ARGB_8888);
                this.m = new Canvas(this.f38110l);
            } else {
                Canvas canvas2 = this.m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix);
                this.m.drawRect(-1.0f, -1.0f, this.f38108j.width() + 1.0f, this.f38108j.height() + 1.0f, this.f38112o);
            }
            r4.e.a(this.f38109k, null);
            this.f38109k.setColorFilter(null);
            this.f38109k.setAlpha(c0Var.f7470b);
            Canvas canvas3 = this.m;
            canvas3.scale(f5, f11);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iOrdinal != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f38122y == null) {
            this.f38122y = new RenderNode("OffscreenLayer.main");
        }
        if (c0Var.d() && this.f38123z == null) {
            this.f38123z = new RenderNode("OffscreenLayer.shadow");
            this.A = null;
        }
        this.f38122y.setAlpha(c0Var.f7470b / 255.0f);
        if (c0Var.d()) {
            RenderNode renderNode = this.f38123z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(c0Var.f7470b / 255.0f);
        }
        this.f38122y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f38122y;
        RectF rectF2 = this.f38108j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f38122y.beginRecording((int) this.f38108j.width(), (int) this.f38108j.height());
        recordingCanvasBeginRecording.setMatrix(matrix);
        recordingCanvasBeginRecording.scale(f5, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
