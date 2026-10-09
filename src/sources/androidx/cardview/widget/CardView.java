package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yalantis.ucrop.view.CropImageView;
import qp.b;
import re.g0;
import x.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f1109f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g0 f1110t = new g0(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f1113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f1114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f1115e;

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((a) ((Drawable) this.f1115e.f47832b)).f55563h;
    }

    public float getCardElevation() {
        return ((CardView) this.f1115e.f47833c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1113c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1113c.left;
    }

    public int getContentPaddingRight() {
        return this.f1113c.right;
    }

    public int getContentPaddingTop() {
        return this.f1113c.top;
    }

    public float getMaxCardElevation() {
        return ((a) ((Drawable) this.f1115e.f47832b)).f55560e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1112b;
    }

    public float getRadius() {
        return ((a) ((Drawable) this.f1115e.f47832b)).f55556a;
    }

    public boolean getUseCompatPadding() {
        return this.f1111a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
    }

    public void setCardBackgroundColor(int i11) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i11);
        a aVar = (a) ((Drawable) this.f1115e.f47832b);
        if (colorStateListValueOf == null) {
            aVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        aVar.f55563h = colorStateListValueOf;
        aVar.f55557b.setColor(colorStateListValueOf.getColorForState(aVar.getState(), aVar.f55563h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f5) {
        ((CardView) this.f1115e.f47833c).setElevation(f5);
    }

    public void setMaxCardElevation(float f5) {
        f1110t.q(this.f1115e, f5);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i11) {
        super.setMinimumHeight(i11);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i11) {
        super.setMinimumWidth(i11);
    }

    public void setPreventCornerOverlap(boolean z11) {
        if (z11 != this.f1112b) {
            this.f1112b = z11;
            b bVar = this.f1115e;
            f1110t.q(bVar, ((a) ((Drawable) bVar.f47832b)).f55560e);
        }
    }

    public void setRadius(float f5) {
        a aVar = (a) ((Drawable) this.f1115e.f47832b);
        if (f5 == aVar.f55556a) {
            return;
        }
        aVar.f55556a = f5;
        aVar.b(null);
        aVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.f1111a != z11) {
            this.f1111a = z11;
            b bVar = this.f1115e;
            f1110t.q(bVar, ((a) ((Drawable) bVar.f47832b)).f55560e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i11) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i11);
        Rect rect = new Rect();
        this.f1113c = rect;
        this.f1114d = new Rect();
        b bVar = new b(this);
        this.f1115e = bVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.a.f54364a, i11, com.lingodeer.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1109f);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.lingodeer.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.lingodeer.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, CropImageView.DEFAULT_ASPECT_RATIO);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, CropImageView.DEFAULT_ASPECT_RATIO);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, CropImageView.DEFAULT_ASPECT_RATIO);
        this.f1111a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f1112b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        a aVar = new a(colorStateListValueOf, dimension);
        bVar.f47832b = aVar;
        setBackgroundDrawable(aVar);
        setClipToOutline(true);
        setElevation(dimension2);
        f1110t.q(bVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        a aVar = (a) ((Drawable) this.f1115e.f47832b);
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.f55563h = colorStateList;
        aVar.f55557b.setColor(colorStateList.getColorForState(aVar.getState(), aVar.f55563h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i11, int i12, int i13, int i14) {
    }
}
