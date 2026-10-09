package h9;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f32037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f32038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f32039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f32040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f32041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextPaint f32042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f32043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f32044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f32045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Layout.Alignment f32046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bitmap f32047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f32048l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f32049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f32050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f32051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f32052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f32053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f32054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f32055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f32056u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f32057v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f32058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f32059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f32060y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f32061z;

    public g0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f32041e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f32040d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f32037a = fRound;
        this.f32038b = fRound;
        this.f32039c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f32042f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f32043g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f32044h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z11) {
        Canvas canvas2;
        if (!z11) {
            this.J.getClass();
            this.f32047k.getClass();
            canvas.drawBitmap(this.f32047k, (Rect) null, this.J, this.f32044h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f32056u) > 0) {
            int i11 = this.f32056u;
            Paint paint = this.f32043g;
            paint.setColor(i11);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, CropImageView.DEFAULT_ASPECT_RATIO, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i12 = this.f32058w;
        TextPaint textPaint = this.f32042f;
        if (i12 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f32037a);
            textPaint.setColor(this.f32057v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f5 = this.f32038b;
            if (i12 == 2) {
                float f11 = this.f32039c;
                textPaint.setShadowLayer(f5, f11, f11, this.f32057v);
            } else if (i12 == 3 || i12 == 4) {
                boolean z12 = i12 == 3;
                int i13 = z12 ? -1 : this.f32057v;
                int i14 = z12 ? this.f32057v : -1;
                float f12 = f5 / 2.0f;
                textPaint.setColor(this.f32054s);
                textPaint.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                textPaint.setShadowLayer(f5, f13, f13, i13);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f5, f12, f12, i14);
            }
        }
        textPaint.setColor(this.f32054s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
        canvas2.restoreToCount(iSave);
    }
}
