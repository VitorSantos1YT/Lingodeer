package com.google.android.material.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {
    public static final /* synthetic */ int B0 = 0;
    public float A0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public CharSequence f15844j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Context f15845k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Paint.FontMetrics f15846l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final TextDrawableHelper f15847m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final View.OnLayoutChangeListener f15848n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Rect f15849o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f15850p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f15851q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f15852r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f15853s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f15854t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f15855u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f15856v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f15857w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f15858x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f15859y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public float f15860z0;

    public TooltipDrawable(Context context, int i11) {
        super(context, null, 0, i11);
        this.f15846l0 = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f15847m0 = textDrawableHelper;
        this.f15848n0 = new View.OnLayoutChangeListener() { // from class: com.google.android.material.tooltip.TooltipDrawable.1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                int i21 = TooltipDrawable.B0;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i22 = iArr[0];
                TooltipDrawable tooltipDrawable = TooltipDrawable.this;
                tooltipDrawable.f15856v0 = i22;
                view.getWindowVisibleDisplayFrame(tooltipDrawable.f15849o0);
            }
        };
        this.f15849o0 = new Rect();
        this.f15857w0 = 1.0f;
        this.f15858x0 = 1.0f;
        this.f15859y0 = 0.5f;
        this.f15860z0 = 0.5f;
        this.A0 = 1.0f;
        this.f15845k0 = context;
        float f5 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = textDrawableHelper.f14730a;
        textPaint.density = f5;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float E() {
        int i11;
        Rect rect = this.f15849o0;
        if (((rect.right - getBounds().right) - this.f15856v0) - this.f15853s0 < 0) {
            i11 = ((rect.right - getBounds().right) - this.f15856v0) - this.f15853s0;
        } else {
            if (((rect.left - getBounds().left) - this.f15856v0) + this.f15853s0 <= 0) {
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
            i11 = ((rect.left - getBounds().left) - this.f15856v0) + this.f15853s0;
        }
        return i11;
    }

    public final OffsetEdgeTreatment F() {
        float f5 = -E();
        float fWidth = (float) ((((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f15855u0))) / 2.0d);
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.f15855u0), Math.min(Math.max(f5, -fWidth), fWidth));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fE = E();
        float f5 = (float) (-((Math.sqrt(2.0d) * ((double) this.f15855u0)) - ((double) this.f15855u0)));
        canvas.scale(this.f15857w0, this.f15858x0, (getBounds().width() * this.f15859y0) + getBounds().left, (getBounds().height() * this.f15860z0) + getBounds().top);
        canvas.translate(fE, f5);
        super.draw(canvas);
        if (this.f15844j0 == null) {
            canvas2 = canvas;
        } else {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            TextDrawableHelper textDrawableHelper = this.f15847m0;
            TextPaint textPaint = textDrawableHelper.f14730a;
            Paint.FontMetrics fontMetrics = this.f15846l0;
            textPaint.getFontMetrics(fontMetrics);
            int i11 = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (textDrawableHelper.f14736g != null) {
                textPaint.drawableState = getState();
                textDrawableHelper.f14736g.d(this.f15845k0, textDrawableHelper.f14730a, textDrawableHelper.f14731b);
                textPaint.setAlpha((int) (this.A0 * 255.0f));
            }
            CharSequence charSequence = this.f15844j0;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i11, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f15847m0.f14730a.getTextSize(), this.f15852r0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f5 = this.f15850p0 * 2;
        CharSequence charSequence = this.f15844j0;
        return (int) Math.max(f5 + (charSequence == null ? CropImageView.DEFAULT_ASPECT_RATIO : this.f15847m0.a(charSequence.toString())), this.f15851q0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f15854t0) {
            ShapeAppearanceModel.Builder builderH = this.f15200b.f15214a.h();
            builderH.f15267k = F();
            setShapeAppearanceModel(builderH.a());
        }
    }
}
