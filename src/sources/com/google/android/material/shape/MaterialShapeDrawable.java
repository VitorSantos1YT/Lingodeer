package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.StateSet;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;
import u5.f;
import u5.g;
import v10.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialShapeDrawable extends Drawable implements Shapeable {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Paint f15196h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final SpringAnimatedCornerSizeProperty[] f15197i0;
    public final Matrix H;
    public final Path K;
    public final Path L;
    public final RectF M;
    public final RectF N;
    public final Region O;
    public final Region P;
    public final Paint Q;
    public final Paint R;
    public final ShadowRenderer S;
    public final ShapeAppearancePathProvider.PathListener T;
    public final ShapeAppearancePathProvider U;
    public PorterDuffColorFilter V;
    public PorterDuffColorFilter W;
    public int X;
    public final RectF Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShapeAppearanceModel.CornerSizeUnaryOperator f15198a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f15199a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MaterialShapeDrawableState f15200b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ShapeAppearanceModel f15201b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ShapePath.ShadowCompatOperation[] f15202c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public g f15203c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ShapePath.ShadowCompatOperation[] f15204d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final f[] f15205d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f15206e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float[] f15207e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15208f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float[] f15209f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public OnCornerSizeChangeListener f15210g0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15211t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnCornerSizeChangeListener {
        void d(float f5);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SpringAnimatedCornerSizeProperty extends c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f15231j;

        public SpringAnimatedCornerSizeProperty(int i11) {
            this.f15231j = i11;
        }

        @Override // v10.c
        public final void K(Object obj, float f5) {
            MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) obj;
            float[] fArr = materialShapeDrawable.f15207e0;
            if (fArr != null) {
                int i11 = this.f15231j;
                if (fArr[i11] != f5) {
                    fArr[i11] = f5;
                    OnCornerSizeChangeListener onCornerSizeChangeListener = materialShapeDrawable.f15210g0;
                    if (onCornerSizeChangeListener != null) {
                        onCornerSizeChangeListener.d(materialShapeDrawable.i());
                    }
                    materialShapeDrawable.invalidateSelf();
                }
            }
        }

        @Override // v10.c
        public final float x(Object obj) {
            float[] fArr = ((MaterialShapeDrawable) obj).f15207e0;
            return fArr != null ? fArr[this.f15231j] : CropImageView.DEFAULT_ASPECT_RATIO;
        }
    }

    static {
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        int i11 = 0;
        CornerTreatment cornerTreatmentA = MaterialShapeUtils.a(0);
        builder.f15257a = cornerTreatmentA;
        float fB = ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        if (fB != -1.0f) {
            builder.f(fB);
        }
        builder.f15258b = cornerTreatmentA;
        float fB2 = ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        if (fB2 != -1.0f) {
            builder.g(fB2);
        }
        builder.f15259c = cornerTreatmentA;
        float fB3 = ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        if (fB3 != -1.0f) {
            builder.e(fB3);
        }
        builder.f15260d = cornerTreatmentA;
        float fB4 = ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        if (fB4 != -1.0f) {
            builder.d(fB4);
        }
        builder.c(CropImageView.DEFAULT_ASPECT_RATIO);
        builder.a();
        Paint paint = new Paint(1);
        f15196h0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f15197i0 = new SpringAnimatedCornerSizeProperty[4];
        while (true) {
            SpringAnimatedCornerSizeProperty[] springAnimatedCornerSizePropertyArr = f15197i0;
            if (i11 >= springAnimatedCornerSizePropertyArr.length) {
                return;
            }
            springAnimatedCornerSizePropertyArr[i11] = new SpringAnimatedCornerSizeProperty(i11);
            i11++;
        }
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    public static float c(RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float[] fArr) {
        if (fArr == null) {
            if (shapeAppearanceModel.g(rectF)) {
                return shapeAppearanceModel.f15249e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f5 = fArr[0];
            for (int i11 = 1; i11 < fArr.length; i11++) {
                if (fArr[i11] != f5) {
                    return -1.0f;
                }
            }
        }
        if (shapeAppearanceModel.f()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final boolean A(int[] iArr) {
        boolean z11;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f15200b.f15217d == null || color2 == (colorForState2 = this.f15200b.f15217d.getColorForState(iArr, (color2 = (paint2 = this.Q).getColor())))) {
            z11 = false;
        } else {
            paint2.setColor(colorForState2);
            z11 = true;
        }
        if (this.f15200b.f15218e == null || color == (colorForState = this.f15200b.f15218e.getColorForState(iArr, (color = (paint = this.R).getColor())))) {
            return z11;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void B(int[] iArr, boolean z11) {
        ShapeAppearanceModel shapeAppearanceModelA;
        CornerSize cornerSize;
        int i11;
        RectF rectFH = h();
        if (this.f15200b.f15215b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z12 = z11 | (this.f15203c0 == null);
        if (this.f15207e0 == null) {
            this.f15207e0 = new float[4];
        }
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.f15200b.f15215b;
        ShapeAppearanceModel[] shapeAppearanceModelArr = stateListShapeAppearanceModel.f15328d;
        int i12 = stateListShapeAppearanceModel.f15325a;
        int[][] iArr2 = stateListShapeAppearanceModel.f15327c;
        StateListCornerSize stateListCornerSize = stateListShapeAppearanceModel.f15332h;
        StateListCornerSize stateListCornerSize2 = stateListShapeAppearanceModel.f15331g;
        StateListCornerSize stateListCornerSize3 = stateListShapeAppearanceModel.f15330f;
        StateListCornerSize stateListCornerSize4 = stateListShapeAppearanceModel.f15329e;
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                i13 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i13], iArr)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i14 = 0;
            while (true) {
                if (i14 >= i12) {
                    i11 = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i14], iArr3)) {
                        i11 = i14;
                        break;
                    }
                    i14++;
                }
            }
            i13 = i11;
        }
        if (stateListCornerSize4 == null && stateListCornerSize3 == null && stateListCornerSize2 == null && stateListCornerSize == null) {
            shapeAppearanceModelA = shapeAppearanceModelArr[i13];
        } else {
            ShapeAppearanceModel.Builder builderH = shapeAppearanceModelArr[i13].h();
            if (stateListCornerSize4 != null) {
                builderH.f15261e = stateListCornerSize4.c(iArr);
            }
            if (stateListCornerSize3 != null) {
                builderH.f15262f = stateListCornerSize3.c(iArr);
            }
            if (stateListCornerSize2 != null) {
                builderH.f15264h = stateListCornerSize2.c(iArr);
            }
            if (stateListCornerSize != null) {
                builderH.f15263g = stateListCornerSize.c(iArr);
            }
            shapeAppearanceModelA = builderH.a();
        }
        int i15 = 0;
        while (i15 < 4) {
            this.U.getClass();
            if (i15 == 1) {
                cornerSize = shapeAppearanceModelA.f15251g;
            } else if (i15 != 2) {
                cornerSize = i15 != 3 ? shapeAppearanceModelA.f15250f : shapeAppearanceModelA.f15249e;
            } else {
                cornerSize = shapeAppearanceModelA.f15252h;
            }
            float fA = cornerSize.a(rectFH);
            if (z12) {
                this.f15207e0[i15] = fA;
            }
            f[] fVarArr = this.f15205d0;
            f fVar = fVarArr[i15];
            if (fVar != null) {
                fVar.a(fA);
                if (z12) {
                    fVarArr[i15].d();
                }
            }
            i15++;
        }
        if (z12) {
            invalidateSelf();
        }
    }

    public final boolean C() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.V;
        PorterDuffColorFilter porterDuffColorFilter3 = this.W;
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        ColorStateList colorStateList = materialShapeDrawableState.f15219f;
        PorterDuff.Mode mode = materialShapeDrawableState.f15220g;
        if (colorStateList == null || mode == null) {
            int color = this.Q.getColor();
            int iD = d(color);
            this.X = iD;
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iD2 = d(colorStateList.getColorForState(getState(), 0));
            this.X = iD2;
            porterDuffColorFilter = new PorterDuffColorFilter(iD2, mode);
        }
        this.V = porterDuffColorFilter;
        this.f15200b.getClass();
        this.W = null;
        this.f15200b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.V) && Objects.equals(porterDuffColorFilter3, this.W)) ? false : true;
    }

    public final void D() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        float f5 = materialShapeDrawableState.f15226n + CropImageView.DEFAULT_ASPECT_RATIO;
        materialShapeDrawableState.f15228p = (int) Math.ceil(0.75f * f5);
        this.f15200b.f15229q = (int) Math.ceil(f5 * 0.25f);
        C();
        super.invalidateSelf();
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        this.U.b(materialShapeDrawableState.f15214a, this.f15207e0, materialShapeDrawableState.f15223j, rectF, this.T, path);
        if (this.f15200b.f15222i != 1.0f) {
            Matrix matrix = this.H;
            matrix.reset();
            float f5 = this.f15200b.f15222i;
            matrix.setScale(f5, f5, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.Y, true);
    }

    public final int d(int i11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        float f5 = materialShapeDrawableState.f15226n + CropImageView.DEFAULT_ASPECT_RATIO + materialShapeDrawableState.m;
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawableState.f15216c;
        return elevationOverlayProvider != null ? elevationOverlayProvider.a(i11, f5) : i11;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.V;
        Paint paint2 = this.Q;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i11 = this.f15200b.f15225l;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.W;
        Paint paint3 = this.R;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f15200b.f15224k);
        int alpha2 = paint3.getAlpha();
        int i12 = this.f15200b.f15225l;
        paint3.setAlpha(((i12 + (i12 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.f15200b.f15230r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z11 = this.f15208f;
            paint = paint2;
            Path path = this.K;
            if (z11) {
                b(h(), path);
                this.f15208f = false;
            }
            MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
            int i13 = materialShapeDrawableState.f15227o;
            if (i13 != 1 && materialShapeDrawableState.f15228p > 0 && (i13 == 2 || (!o() && !path.isConvex() && Build.VERSION.SDK_INT < 29))) {
                canvas.save();
                canvas.translate((int) (Math.sin(Math.toRadians(0)) * ((double) this.f15200b.f15229q)), j());
                if (this.Z) {
                    RectF rectF = this.Y;
                    int iWidth = (int) (rectF.width() - getBounds().width());
                    int iHeight = (int) (rectF.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f15200b.f15228p * 2) + ((int) rectF.width()) + iWidth, (this.f15200b.f15228p * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f5 = (getBounds().left - this.f15200b.f15228p) - iWidth;
                    float f11 = (getBounds().top - this.f15200b.f15228p) - iHeight;
                    canvas2.translate(-f5, -f11);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f5, f11, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.f15200b.f15214a, this.f15207e0, h());
        } else {
            paint = paint2;
        }
        if (m()) {
            if (this.f15211t) {
                this.f15201b0 = this.f15200b.f15214a.i(this.f15198a);
                float[] fArr = this.f15207e0;
                if (fArr != null) {
                    if (this.f15209f0 == null) {
                        this.f15209f0 = new float[fArr.length];
                    }
                    float fK = k();
                    int i14 = 0;
                    while (true) {
                        float[] fArr2 = this.f15207e0;
                        if (i14 >= fArr2.length) {
                            break;
                        }
                        this.f15209f0[i14] = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, fArr2[i14] - fK);
                        i14++;
                    }
                } else {
                    this.f15209f0 = null;
                }
                ShapeAppearanceModel shapeAppearanceModel = this.f15201b0;
                float[] fArr3 = this.f15209f0;
                float f12 = this.f15200b.f15223j;
                RectF rectFH = h();
                RectF rectF2 = this.N;
                rectF2.set(rectFH);
                float fK2 = k();
                rectF2.inset(fK2, fK2);
                this.U.b(shapeAppearanceModel, fArr3, f12, rectF2, null, this.L);
                this.f15211t = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        this.f15206e.cardinality();
        int i11 = this.f15200b.f15229q;
        Path path = this.K;
        ShadowRenderer shadowRenderer = this.S;
        if (i11 != 0) {
            canvas.drawPath(path, shadowRenderer.f15182a);
        }
        for (int i12 = 0; i12 < 4; i12++) {
            ShapePath.ShadowCompatOperation shadowCompatOperation = this.f15202c[i12];
            int i13 = this.f15200b.f15228p;
            Matrix matrix = ShapePath.ShadowCompatOperation.f15310b;
            shadowCompatOperation.a(matrix, shadowRenderer, i13, canvas);
            this.f15204d[i12].a(matrix, shadowRenderer, this.f15200b.f15228p, canvas);
        }
        if (this.Z) {
            int iSin = (int) (Math.sin(Math.toRadians(0)) * ((double) this.f15200b.f15229q));
            int iJ = j();
            canvas.translate(-iSin, -iJ);
            canvas.drawPath(path, f15196h0);
            canvas.translate(iSin, iJ);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, ShapeAppearanceModel shapeAppearanceModel, float[] fArr, RectF rectF) {
        float fC = c(rectF, shapeAppearanceModel, fArr);
        if (fC < CropImageView.DEFAULT_ASPECT_RATIO) {
            canvas.drawPath(path, paint);
        } else {
            float f5 = fC * this.f15200b.f15223j;
            canvas.drawRoundRect(rectF, f5, f5, paint);
        }
    }

    public void g(Canvas canvas) {
        ShapeAppearanceModel shapeAppearanceModel = this.f15201b0;
        float[] fArr = this.f15209f0;
        RectF rectFH = h();
        RectF rectF = this.N;
        rectF.set(rectFH);
        float fK = k();
        rectF.inset(fK, fK);
        f(canvas, this.R, this.L, shapeAppearanceModel, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15200b.f15225l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f15200b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f15200b.f15227o == 2) {
            return;
        }
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fC = c(rectFH, this.f15200b.f15214a, this.f15207e0);
        if (fC >= CropImageView.DEFAULT_ASPECT_RATIO) {
            outline.setRoundRect(getBounds(), fC * this.f15200b.f15223j);
            return;
        }
        boolean z11 = this.f15208f;
        Path path = this.K;
        if (z11) {
            b(rectFH, path);
            this.f15208f = false;
        }
        DrawableUtils.e(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f15200b.f15221h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // com.google.android.material.shape.Shapeable
    public final ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f15200b.f15214a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.O;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.K;
        b(rectFH, path);
        Region region2 = this.P;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.M;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.f15207e0;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        ShapeAppearanceModel shapeAppearanceModel = this.f15200b.f15214a;
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.U;
        shapeAppearancePathProvider.getClass();
        float fA = shapeAppearanceModel.f15249e.a(rectFH);
        ShapeAppearanceModel shapeAppearanceModel2 = this.f15200b.f15214a;
        shapeAppearancePathProvider.getClass();
        float fA2 = shapeAppearanceModel2.f15252h.a(rectFH) + fA;
        ShapeAppearanceModel shapeAppearanceModel3 = this.f15200b.f15214a;
        shapeAppearancePathProvider.getClass();
        float fA3 = fA2 - shapeAppearanceModel3.f15251g.a(rectFH);
        ShapeAppearanceModel shapeAppearanceModel4 = this.f15200b.f15214a;
        shapeAppearancePathProvider.getClass();
        return (fA3 - shapeAppearanceModel4.f15250f.a(rectFH)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f15208f = true;
        this.f15211t = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f15200b.f15219f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f15200b.getClass();
        ColorStateList colorStateList2 = this.f15200b.f15218e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f15200b.f15217d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.f15200b.f15215b;
        return stateListShapeAppearanceModel != null && stateListShapeAppearanceModel.d();
    }

    public final int j() {
        return (int) (Math.cos(Math.toRadians(0)) * ((double) this.f15200b.f15229q));
    }

    public final float k() {
        return m() ? this.R.getStrokeWidth() / 2.0f : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final float l() {
        float[] fArr = this.f15207e0;
        return fArr != null ? fArr[3] : this.f15200b.f15214a.f15249e.a(h());
    }

    public final boolean m() {
        Paint.Style style = this.f15200b.f15230r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.R.getStrokeWidth() > CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f15200b = new MaterialShapeDrawableState(this.f15200b);
        return this;
    }

    public final void n(Context context) {
        this.f15200b.f15216c = new ElevationOverlayProvider(context);
        D();
    }

    public final boolean o() {
        if (!this.f15200b.f15214a.g(h())) {
            float[] fArr = this.f15207e0;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f5 = fArr[0];
                    for (int i11 = 1; i11 < fArr.length; i11++) {
                        if (fArr[i11] == f5) {
                        }
                    }
                    if (this.f15200b.f15214a.f()) {
                    }
                } else if (this.f15200b.f15214a.f()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f15208f = true;
        this.f15211t = true;
        super.onBoundsChange(rect);
        if (this.f15200b.f15215b != null && !rect.isEmpty()) {
            B(getState(), this.f15199a0);
        }
        this.f15199a0 = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        if (this.f15200b.f15215b != null) {
            B(iArr, false);
        }
        boolean z11 = A(iArr) || C();
        if (z11) {
            invalidateSelf();
        }
        return z11;
    }

    public final void p(g gVar) {
        if (this.f15203c0 == gVar) {
            return;
        }
        this.f15203c0 = gVar;
        int i11 = 0;
        while (true) {
            f[] fVarArr = this.f15205d0;
            if (i11 >= fVarArr.length) {
                B(getState(), true);
                invalidateSelf();
                return;
            }
            if (fVarArr[i11] == null) {
                fVarArr[i11] = new f(this, f15197i0[i11]);
            }
            f fVar = fVarArr[i11];
            g gVar2 = new g();
            gVar2.a((float) gVar.f52803b);
            double d5 = gVar.f52802a;
            gVar2.b((float) (d5 * d5));
            fVar.m = gVar2;
            i11++;
        }
    }

    public final void q(float f5) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        if (materialShapeDrawableState.f15226n != f5) {
            materialShapeDrawableState.f15226n = f5;
            D();
        }
    }

    public final void r(ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        if (materialShapeDrawableState.f15217d != colorStateList) {
            materialShapeDrawableState.f15217d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void s(float f5) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        if (materialShapeDrawableState.f15223j != f5) {
            materialShapeDrawableState.f15223j = f5;
            this.f15208f = true;
            this.f15211t = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        if (materialShapeDrawableState.f15225l != i11) {
            materialShapeDrawableState.f15225l = i11;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15200b.getClass();
        super.invalidateSelf();
    }

    @Override // com.google.android.material.shape.Shapeable
    public final void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        materialShapeDrawableState.f15214a = shapeAppearanceModel;
        materialShapeDrawableState.f15215b = null;
        this.f15207e0 = null;
        this.f15209f0 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f15200b.f15219f = colorStateList;
        C();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        if (materialShapeDrawableState.f15220g != mode) {
            materialShapeDrawableState.f15220g = mode;
            C();
            super.invalidateSelf();
        }
    }

    public final void t() {
        this.f15200b.f15230r = Paint.Style.FILL;
        super.invalidateSelf();
    }

    public final void u(int i11) {
        this.S.c(i11);
        this.f15200b.getClass();
        super.invalidateSelf();
    }

    public final void v(int i11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        if (materialShapeDrawableState.f15227o != i11) {
            materialShapeDrawableState.f15227o = i11;
            super.invalidateSelf();
        }
    }

    public final void w(int i11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        if (materialShapeDrawableState.f15229q != i11) {
            materialShapeDrawableState.f15229q = i11;
            super.invalidateSelf();
        }
    }

    public final void x(StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        if (materialShapeDrawableState.f15215b != stateListShapeAppearanceModel) {
            materialShapeDrawableState.f15215b = stateListShapeAppearanceModel;
            B(getState(), true);
            invalidateSelf();
        }
    }

    public final void y(ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f15200b;
        if (materialShapeDrawableState.f15218e != colorStateList) {
            materialShapeDrawableState.f15218e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void z(float f5) {
        this.f15200b.f15224k = f5;
        invalidateSelf();
    }

    public MaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel));
    }

    public MaterialShapeDrawable(MaterialShapeDrawableState materialShapeDrawableState) {
        ShapeAppearancePathProvider shapeAppearancePathProvider;
        this.f15198a = new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.shape.MaterialShapeDrawable.1
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize b(CornerSize cornerSize) {
                if (cornerSize instanceof RelativeCornerSize) {
                    return cornerSize;
                }
                Paint paint = MaterialShapeDrawable.f15196h0;
                return new AdjustedCornerSize(-MaterialShapeDrawable.this.k(), cornerSize);
            }
        };
        this.f15202c = new ShapePath.ShadowCompatOperation[4];
        this.f15204d = new ShapePath.ShadowCompatOperation[4];
        this.f15206e = new BitSet(8);
        this.H = new Matrix();
        this.K = new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new Region();
        this.P = new Region();
        Paint paint = new Paint(1);
        this.Q = paint;
        Paint paint2 = new Paint(1);
        this.R = paint2;
        this.S = new ShadowRenderer();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            shapeAppearancePathProvider = ShapeAppearancePathProvider.Lazy.f15281a;
        } else {
            shapeAppearancePathProvider = new ShapeAppearancePathProvider();
        }
        this.U = shapeAppearancePathProvider;
        this.Y = new RectF();
        this.Z = true;
        this.f15199a0 = true;
        this.f15205d0 = new f[4];
        this.f15200b = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        C();
        A(getState());
        this.T = new ShapeAppearancePathProvider.PathListener() { // from class: com.google.android.material.shape.MaterialShapeDrawable.2
            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public final void a(ShapePath shapePath, Matrix matrix, int i11) {
                MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
                BitSet bitSet = materialShapeDrawable.f15206e;
                shapePath.getClass();
                bitSet.set(i11, false);
                ShapePath.ShadowCompatOperation[] shadowCompatOperationArr = materialShapeDrawable.f15202c;
                shapePath.b(shapePath.f15287f);
                shadowCompatOperationArr[i11] = new ShapePath.AnonymousClass1(new ArrayList(shapePath.f15289h), new Matrix(matrix));
            }

            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public final void b(ShapePath shapePath, Matrix matrix, int i11) {
                MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
                shapePath.getClass();
                materialShapeDrawable.f15206e.set(i11 + 4, false);
                ShapePath.ShadowCompatOperation[] shadowCompatOperationArr = materialShapeDrawable.f15204d;
                shapePath.b(shapePath.f15287f);
                shadowCompatOperationArr[i11] = new ShapePath.AnonymousClass1(new ArrayList(shapePath.f15289h), new Matrix(matrix));
            }
        };
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class MaterialShapeDrawableState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ShapeAppearanceModel f15214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public StateListShapeAppearanceModel f15215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ElevationOverlayProvider f15216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ColorStateList f15217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorStateList f15218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ColorStateList f15219f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public PorterDuff.Mode f15220g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Rect f15221h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f15222i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f15223j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f15224k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f15225l;
        public float m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f15226n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f15227o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f15228p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f15229q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Paint.Style f15230r;

        public MaterialShapeDrawableState(ShapeAppearanceModel shapeAppearanceModel) {
            this.f15217d = null;
            this.f15218e = null;
            this.f15219f = null;
            this.f15220g = PorterDuff.Mode.SRC_IN;
            this.f15221h = null;
            this.f15222i = 1.0f;
            this.f15223j = 1.0f;
            this.f15225l = 255;
            this.m = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f15226n = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f15227o = 0;
            this.f15228p = 0;
            this.f15229q = 0;
            this.f15230r = Paint.Style.FILL_AND_STROKE;
            this.f15214a = shapeAppearanceModel;
            this.f15216c = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f15208f = true;
            materialShapeDrawable.f15211t = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(MaterialShapeDrawableState materialShapeDrawableState) {
            this.f15217d = null;
            this.f15218e = null;
            this.f15219f = null;
            this.f15220g = PorterDuff.Mode.SRC_IN;
            this.f15221h = null;
            this.f15222i = 1.0f;
            this.f15223j = 1.0f;
            this.f15225l = 255;
            this.m = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f15226n = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f15227o = 0;
            this.f15228p = 0;
            this.f15229q = 0;
            this.f15230r = Paint.Style.FILL_AND_STROKE;
            this.f15214a = materialShapeDrawableState.f15214a;
            this.f15215b = materialShapeDrawableState.f15215b;
            this.f15216c = materialShapeDrawableState.f15216c;
            this.f15224k = materialShapeDrawableState.f15224k;
            this.f15217d = materialShapeDrawableState.f15217d;
            this.f15218e = materialShapeDrawableState.f15218e;
            this.f15220g = materialShapeDrawableState.f15220g;
            this.f15219f = materialShapeDrawableState.f15219f;
            this.f15225l = materialShapeDrawableState.f15225l;
            this.f15222i = materialShapeDrawableState.f15222i;
            this.f15229q = materialShapeDrawableState.f15229q;
            this.f15227o = materialShapeDrawableState.f15227o;
            this.f15223j = materialShapeDrawableState.f15223j;
            this.m = materialShapeDrawableState.m;
            this.f15226n = materialShapeDrawableState.f15226n;
            this.f15228p = materialShapeDrawableState.f15228p;
            this.f15230r = materialShapeDrawableState.f15230r;
            if (materialShapeDrawableState.f15221h != null) {
                this.f15221h = new Rect(materialShapeDrawableState.f15221h);
            }
        }
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(ShapeAppearanceModel.d(context, attributeSet, i11, i12).a());
    }
}
