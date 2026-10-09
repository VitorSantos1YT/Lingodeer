package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ShapeAppearanceModel {
    public static final RelativeCornerSize m = new RelativeCornerSize(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CornerTreatment f15245a = new RoundedCornerTreatment();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CornerTreatment f15246b = new RoundedCornerTreatment();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CornerTreatment f15247c = new RoundedCornerTreatment();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CornerTreatment f15248d = new RoundedCornerTreatment();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CornerSize f15249e = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CornerSize f15250f = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CornerSize f15251g = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CornerSize f15252h = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeTreatment f15253i = new EdgeTreatment();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EdgeTreatment f15254j = new EdgeTreatment();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeTreatment f15255k = new EdgeTreatment();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EdgeTreatment f15256l = new EdgeTreatment();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CornerTreatment f15257a = new RoundedCornerTreatment();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CornerTreatment f15258b = new RoundedCornerTreatment();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CornerTreatment f15259c = new RoundedCornerTreatment();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CornerTreatment f15260d = new RoundedCornerTreatment();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CornerSize f15261e = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CornerSize f15262f = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CornerSize f15263g = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CornerSize f15264h = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public EdgeTreatment f15265i = new EdgeTreatment();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public EdgeTreatment f15266j = new EdgeTreatment();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public EdgeTreatment f15267k = new EdgeTreatment();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public EdgeTreatment f15268l = new EdgeTreatment();

        public static float b(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).f15244a;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).f15194a;
            }
            return -1.0f;
        }

        public final ShapeAppearanceModel a() {
            ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
            shapeAppearanceModel.f15245a = this.f15257a;
            shapeAppearanceModel.f15246b = this.f15258b;
            shapeAppearanceModel.f15247c = this.f15259c;
            shapeAppearanceModel.f15248d = this.f15260d;
            shapeAppearanceModel.f15249e = this.f15261e;
            shapeAppearanceModel.f15250f = this.f15262f;
            shapeAppearanceModel.f15251g = this.f15263g;
            shapeAppearanceModel.f15252h = this.f15264h;
            shapeAppearanceModel.f15253i = this.f15265i;
            shapeAppearanceModel.f15254j = this.f15266j;
            shapeAppearanceModel.f15255k = this.f15267k;
            shapeAppearanceModel.f15256l = this.f15268l;
            return shapeAppearanceModel;
        }

        public final void c(float f5) {
            f(f5);
            g(f5);
            e(f5);
            d(f5);
        }

        public final void d(float f5) {
            this.f15264h = new AbsoluteCornerSize(f5);
        }

        public final void e(float f5) {
            this.f15263g = new AbsoluteCornerSize(f5);
        }

        public final void f(float f5) {
            this.f15261e = new AbsoluteCornerSize(f5);
        }

        public final void g(float f5) {
            this.f15262f = new AbsoluteCornerSize(f5);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface CornerSizeUnaryOperator {
        CornerSize b(CornerSize cornerSize);
    }

    public static Builder a(Context context, int i11, int i12) {
        return b(context, i11, i12, new AbsoluteCornerSize(0));
    }

    public static Builder b(Context context, int i11, int i12, CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i11);
        if (i12 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i12, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.f13732b0);
        try {
            int i13 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i14 = typedArrayObtainStyledAttributes.getInt(3, i13);
            int i15 = typedArrayObtainStyledAttributes.getInt(4, i13);
            int i16 = typedArrayObtainStyledAttributes.getInt(2, i13);
            int i17 = typedArrayObtainStyledAttributes.getInt(1, i13);
            CornerSize cornerSizeE = e(typedArrayObtainStyledAttributes, 5, cornerSize);
            CornerSize cornerSizeE2 = e(typedArrayObtainStyledAttributes, 8, cornerSizeE);
            CornerSize cornerSizeE3 = e(typedArrayObtainStyledAttributes, 9, cornerSizeE);
            CornerSize cornerSizeE4 = e(typedArrayObtainStyledAttributes, 7, cornerSizeE);
            CornerSize cornerSizeE5 = e(typedArrayObtainStyledAttributes, 6, cornerSizeE);
            Builder builder = new Builder();
            CornerTreatment cornerTreatmentA = MaterialShapeUtils.a(i14);
            builder.f15257a = cornerTreatmentA;
            float fB = Builder.b(cornerTreatmentA);
            if (fB != -1.0f) {
                builder.f(fB);
            }
            builder.f15261e = cornerSizeE2;
            CornerTreatment cornerTreatmentA2 = MaterialShapeUtils.a(i15);
            builder.f15258b = cornerTreatmentA2;
            float fB2 = Builder.b(cornerTreatmentA2);
            if (fB2 != -1.0f) {
                builder.g(fB2);
            }
            builder.f15262f = cornerSizeE3;
            CornerTreatment cornerTreatmentA3 = MaterialShapeUtils.a(i16);
            builder.f15259c = cornerTreatmentA3;
            float fB3 = Builder.b(cornerTreatmentA3);
            if (fB3 != -1.0f) {
                builder.e(fB3);
            }
            builder.f15263g = cornerSizeE4;
            CornerTreatment cornerTreatmentA4 = MaterialShapeUtils.a(i17);
            builder.f15260d = cornerTreatmentA4;
            float fB4 = Builder.b(cornerTreatmentA4);
            if (fB4 != -1.0f) {
                builder.d(fB4);
            }
            builder.f15264h = cornerSizeE5;
            return builder;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Builder c(Context context, AttributeSet attributeSet, int i11, int i12, CornerSize cornerSize) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.K, i11, i12);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, cornerSize);
    }

    public static Builder d(Context context, AttributeSet attributeSet, int i11, int i12) {
        return c(context, attributeSet, i11, i12, new AbsoluteCornerSize(0));
    }

    public static CornerSize e(TypedArray typedArray, int i11, CornerSize cornerSize) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        if (typedValuePeekValue != null) {
            int i12 = typedValuePeekValue.type;
            if (i12 == 5) {
                return new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i12 == 6) {
                return new RelativeCornerSize(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cornerSize;
    }

    public final boolean f() {
        return (this.f15246b instanceof RoundedCornerTreatment) && (this.f15245a instanceof RoundedCornerTreatment) && (this.f15247c instanceof RoundedCornerTreatment) && (this.f15248d instanceof RoundedCornerTreatment);
    }

    public final boolean g(RectF rectF) {
        boolean z11 = this.f15256l.getClass().equals(EdgeTreatment.class) && this.f15254j.getClass().equals(EdgeTreatment.class) && this.f15253i.getClass().equals(EdgeTreatment.class) && this.f15255k.getClass().equals(EdgeTreatment.class);
        float fA = this.f15249e.a(rectF);
        return z11 && ((this.f15250f.a(rectF) > fA ? 1 : (this.f15250f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f15252h.a(rectF) > fA ? 1 : (this.f15252h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f15251g.a(rectF) > fA ? 1 : (this.f15251g.a(rectF) == fA ? 0 : -1)) == 0) && f();
    }

    public final Builder h() {
        Builder builder = new Builder();
        builder.f15257a = new RoundedCornerTreatment();
        builder.f15258b = new RoundedCornerTreatment();
        builder.f15259c = new RoundedCornerTreatment();
        builder.f15260d = new RoundedCornerTreatment();
        builder.f15261e = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);
        builder.f15262f = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);
        builder.f15263g = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);
        builder.f15264h = new AbsoluteCornerSize(CropImageView.DEFAULT_ASPECT_RATIO);
        builder.f15265i = new EdgeTreatment();
        builder.f15266j = new EdgeTreatment();
        builder.f15267k = new EdgeTreatment();
        new EdgeTreatment();
        builder.f15257a = this.f15245a;
        builder.f15258b = this.f15246b;
        builder.f15259c = this.f15247c;
        builder.f15260d = this.f15248d;
        builder.f15261e = this.f15249e;
        builder.f15262f = this.f15250f;
        builder.f15263g = this.f15251g;
        builder.f15264h = this.f15252h;
        builder.f15265i = this.f15253i;
        builder.f15266j = this.f15254j;
        builder.f15267k = this.f15255k;
        builder.f15268l = this.f15256l;
        return builder;
    }

    public final ShapeAppearanceModel i(CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        Builder builderH = h();
        builderH.f15261e = cornerSizeUnaryOperator.b(this.f15249e);
        builderH.f15262f = cornerSizeUnaryOperator.b(this.f15250f);
        builderH.f15264h = cornerSizeUnaryOperator.b(this.f15252h);
        builderH.f15263g = cornerSizeUnaryOperator.b(this.f15251g);
        return builderH.a();
    }

    public final String toString() {
        return "[" + this.f15249e + ", " + this.f15250f + ", " + this.f15251g + ", " + this.f15252h + "]";
    }
}
