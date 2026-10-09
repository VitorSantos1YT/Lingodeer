package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.m;
import vc.a;
import vc.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogTitleLayout extends BaseSubLayout {
    public final int H;
    public final int K;
    public ImageView L;
    public TextView M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7423f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7424t;

    public DialogTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7422e = c.a(this, R.dimen.md_dialog_frame_margin_vertical);
        this.f7423f = c.a(this, R.dimen.md_dialog_title_layout_margin_bottom);
        this.f7424t = c.a(this, R.dimen.md_dialog_frame_margin_horizontal);
        this.H = c.a(this, R.dimen.md_icon_margin);
        this.K = c.a(this, R.dimen.md_icon_size);
    }

    public final boolean b() {
        ImageView imageView = this.L;
        if (imageView == null) {
            m.n("iconView");
            throw null;
        }
        if (a.s(imageView)) {
            return false;
        }
        TextView textView = this.M;
        if (textView != null) {
            return !a.s(textView);
        }
        m.n("titleView");
        throw null;
    }

    public final ImageView getIconView$core() {
        ImageView imageView = this.L;
        if (imageView != null) {
            return imageView;
        }
        m.n("iconView");
        throw null;
    }

    public final TextView getTitleView$core() {
        TextView textView = this.M;
        if (textView != null) {
            return textView;
        }
        m.n("titleView");
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredHeight() - getDividerHeight(), getMeasuredWidth(), getMeasuredHeight(), a());
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.md_icon_title);
        m.b(viewFindViewById, "findViewById(R.id.md_icon_title)");
        this.L = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.md_text_title);
        m.b(viewFindViewById2, "findViewById(R.id.md_text_title)");
        this.M = (TextView) viewFindViewById2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        if (b()) {
            return;
        }
        int measuredHeight = getMeasuredHeight() - this.f7423f;
        int i15 = measuredHeight - ((measuredHeight - this.f7422e) / 2);
        TextView textView = this.M;
        if (textView == null) {
            m.n("titleView");
            throw null;
        }
        int measuredHeight2 = textView.getMeasuredHeight() / 2;
        int i16 = i15 - measuredHeight2;
        int i17 = measuredHeight2 + i15;
        TextView textView2 = this.M;
        if (textView2 == null) {
            m.n("titleView");
            throw null;
        }
        TextPaint paint = textView2.getPaint();
        m.b(paint, "paint");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f5 = fontMetrics.descent - fontMetrics.ascent;
        int measuredHeight3 = i17 + (f5 > ((float) textView2.getMeasuredHeight()) ? (int) (f5 - textView2.getMeasuredHeight()) : 0);
        boolean zR = a.r(this);
        int measuredWidth4 = this.f7424t;
        if (zR) {
            measuredWidth = getMeasuredWidth() - measuredWidth4;
            TextView textView3 = this.M;
            if (textView3 == null) {
                m.n("titleView");
                throw null;
            }
            measuredWidth4 = measuredWidth - textView3.getMeasuredWidth();
        } else {
            TextView textView4 = this.M;
            if (textView4 == null) {
                m.n("titleView");
                throw null;
            }
            measuredWidth = textView4.getMeasuredWidth() + measuredWidth4;
        }
        ImageView imageView = this.L;
        if (imageView == null) {
            m.n("iconView");
            throw null;
        }
        if (a.s(imageView)) {
            ImageView imageView2 = this.L;
            if (imageView2 == null) {
                m.n("iconView");
                throw null;
            }
            int measuredHeight4 = imageView2.getMeasuredHeight() / 2;
            int i18 = i15 - measuredHeight4;
            int i19 = i15 + measuredHeight4;
            boolean zR2 = a.r(this);
            int i21 = this.H;
            if (zR2) {
                ImageView imageView3 = this.L;
                if (imageView3 == null) {
                    m.n("iconView");
                    throw null;
                }
                measuredWidth4 = measuredWidth - imageView3.getMeasuredWidth();
                measuredWidth3 = measuredWidth4 - i21;
                TextView textView5 = this.M;
                if (textView5 == null) {
                    m.n("titleView");
                    throw null;
                }
                measuredWidth2 = measuredWidth3 - textView5.getMeasuredWidth();
            } else {
                ImageView imageView4 = this.L;
                if (imageView4 == null) {
                    m.n("iconView");
                    throw null;
                }
                measuredWidth = imageView4.getMeasuredWidth() + measuredWidth4;
                measuredWidth2 = i21 + measuredWidth;
                TextView textView6 = this.M;
                if (textView6 == null) {
                    m.n("titleView");
                    throw null;
                }
                measuredWidth3 = textView6.getMeasuredWidth() + measuredWidth2;
            }
            ImageView imageView5 = this.L;
            if (imageView5 == null) {
                m.n("iconView");
                throw null;
            }
            imageView5.layout(measuredWidth4, i18, measuredWidth, i19);
            measuredWidth = measuredWidth3;
            measuredWidth4 = measuredWidth2;
        }
        TextView textView7 = this.M;
        if (textView7 != null) {
            textView7.layout(measuredWidth4, i16, measuredWidth, measuredHeight3);
        } else {
            m.n("titleView");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int measuredHeight = 0;
        if (b()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i11);
        int measuredWidth = size - (this.f7424t * 2);
        ImageView imageView = this.L;
        if (imageView == null) {
            m.n("iconView");
            throw null;
        }
        if (a.s(imageView)) {
            ImageView imageView2 = this.L;
            if (imageView2 == null) {
                m.n("iconView");
                throw null;
            }
            int i13 = this.K;
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
            ImageView imageView3 = this.L;
            if (imageView3 == null) {
                m.n("iconView");
                throw null;
            }
            measuredWidth -= imageView3.getMeasuredWidth() + this.H;
        }
        TextView textView = this.M;
        if (textView == null) {
            m.n("titleView");
            throw null;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        ImageView imageView4 = this.L;
        if (imageView4 == null) {
            m.n("iconView");
            throw null;
        }
        if (a.s(imageView4)) {
            ImageView imageView5 = this.L;
            if (imageView5 == null) {
                m.n("iconView");
                throw null;
            }
            measuredHeight = imageView5.getMeasuredHeight();
        }
        TextView textView2 = this.M;
        if (textView2 == null) {
            m.n("titleView");
            throw null;
        }
        int measuredHeight2 = textView2.getMeasuredHeight();
        if (measuredHeight < measuredHeight2) {
            measuredHeight = measuredHeight2;
        }
        setMeasuredDimension(size, measuredHeight + this.f7422e + this.f7423f);
    }

    public final void setIconView$core(ImageView imageView) {
        this.L = imageView;
    }

    public final void setTitleView$core(TextView textView) {
        this.M = textView;
    }
}
