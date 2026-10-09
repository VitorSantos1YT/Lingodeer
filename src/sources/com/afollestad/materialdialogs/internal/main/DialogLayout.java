package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.m;
import lc.a;
import lc.d;
import qx.p;
import qy.l;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogLayout extends FrameLayout {
    public DialogTitleLayout H;
    public DialogContentLayout K;
    public DialogActionButtonLayout L;
    public a M;
    public final boolean N;
    public int O;
    public final Path P;
    public final RectF Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f7416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f7417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7419f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f7420t;

    public DialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7416c = new float[0];
        Context context2 = getContext();
        m.b(context2, "context");
        this.f7418e = context2.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical);
        Context context3 = getContext();
        m.b(context3, "context");
        this.f7419f = context3.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical_less);
        this.M = a.WRAP_CONTENT;
        this.N = true;
        this.O = -1;
        this.P = new Path();
        this.Q = new RectF();
    }

    public static void a(DialogLayout dialogLayout, Canvas canvas, int i11, float f5) {
        canvas.drawLine(CropImageView.DEFAULT_ASPECT_RATIO, f5, dialogLayout.getMeasuredWidth(), f5, dialogLayout.c(i11, 1.0f));
    }

    public static void d(DialogLayout dialogLayout, Canvas canvas, int i11, float f5) {
        canvas.drawLine(f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, dialogLayout.getMeasuredHeight(), dialogLayout.c(i11, 1.0f));
    }

    public final void b(boolean z11, boolean z12) {
        DialogTitleLayout dialogTitleLayout = this.H;
        if (dialogTitleLayout == null) {
            m.n("titleLayout");
            throw null;
        }
        dialogTitleLayout.setDrawDivider(z11);
        DialogActionButtonLayout dialogActionButtonLayout = this.L;
        if (dialogActionButtonLayout != null) {
            dialogActionButtonLayout.setDrawDivider(z12);
        }
    }

    public final Paint c(int i11, float f5) {
        if (this.f7417d == null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(f.p(this, 1));
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            this.f7417d = paint;
        }
        Paint paint2 = this.f7417d;
        if (paint2 == null) {
            m.l();
            throw null;
        }
        paint2.setColor(i11);
        setAlpha(f5);
        return paint2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!(this.f7416c.length == 0)) {
            canvas.clipPath(this.P);
        }
        super.dispatchDraw(canvas);
    }

    public final DialogActionButtonLayout getButtonsLayout() {
        return this.L;
    }

    public final DialogContentLayout getContentLayout() {
        DialogContentLayout dialogContentLayout = this.K;
        if (dialogContentLayout != null) {
            return dialogContentLayout;
        }
        m.n("contentLayout");
        throw null;
    }

    public final float[] getCornerRadii() {
        return this.f7416c;
    }

    public final boolean getDebugMode() {
        return this.f7415b;
    }

    public final d getDialog() {
        d dVar = this.f7420t;
        if (dVar != null) {
            return dVar;
        }
        m.n("dialog");
        throw null;
    }

    public final int getFrameMarginVertical$core() {
        return this.f7418e;
    }

    public final int getFrameMarginVerticalLess$core() {
        return this.f7419f;
    }

    @Override // android.view.ViewGroup
    public final a getLayoutMode() {
        return this.M;
    }

    public final int getMaxHeight() {
        return this.f7414a;
    }

    public final DialogTitleLayout getTitleLayout() {
        DialogTitleLayout dialogTitleLayout = this.H;
        if (dialogTitleLayout != null) {
            return dialogTitleLayout;
        }
        m.n("titleLayout");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Point point = new Point();
        ((WindowManager) systemService).getDefaultDisplay().getSize(point);
        this.O = ((Number) new l(Integer.valueOf(point.x), Integer.valueOf(point.y)).f48496b).intValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7415b) {
            d(this, canvas, -16776961, f.p(this, 24));
            a(this, canvas, -16776961, f.p(this, 24));
            d(this, canvas, -16776961, getMeasuredWidth() - f.p(this, 24));
            DialogTitleLayout dialogTitleLayout = this.H;
            if (dialogTitleLayout == null) {
                m.n("titleLayout");
                throw null;
            }
            if (vc.a.s(dialogTitleLayout)) {
                DialogTitleLayout dialogTitleLayout2 = this.H;
                if (dialogTitleLayout2 == null) {
                    m.n("titleLayout");
                    throw null;
                }
                a(this, canvas, -65536, dialogTitleLayout2.getBottom());
            }
            DialogContentLayout dialogContentLayout = this.K;
            if (dialogContentLayout == null) {
                m.n("contentLayout");
                throw null;
            }
            if (vc.a.s(dialogContentLayout)) {
                DialogContentLayout dialogContentLayout2 = this.K;
                if (dialogContentLayout2 == null) {
                    m.n("contentLayout");
                    throw null;
                }
                a(this, canvas, -256, dialogContentLayout2.getTop());
            }
            if (p.F(this.L)) {
                d(this, canvas, -16711681, vc.a.r(this) ? f.p(this, 8) : getMeasuredWidth() - f.p(this, 8));
                DialogActionButtonLayout dialogActionButtonLayout = this.L;
                if (dialogActionButtonLayout == null || !dialogActionButtonLayout.getStackButtons$core()) {
                    DialogActionButtonLayout dialogActionButtonLayout2 = this.L;
                    if (dialogActionButtonLayout2 != null) {
                        for (DialogActionButton dialogActionButton : dialogActionButtonLayout2.getVisibleButtons()) {
                            DialogActionButtonLayout dialogActionButtonLayout3 = this.L;
                            if (dialogActionButtonLayout3 == null) {
                                m.l();
                                throw null;
                            }
                            float top = dialogActionButtonLayout3.getTop() + dialogActionButton.getTop() + f.p(this, 8);
                            DialogActionButtonLayout dialogActionButtonLayout4 = this.L;
                            if (dialogActionButtonLayout4 == null) {
                                m.l();
                                throw null;
                            }
                            canvas.drawRect(f.p(this, 4) + dialogActionButton.getLeft(), top, dialogActionButton.getRight() - f.p(this, 4), dialogActionButtonLayout4.getBottom() - f.p(this, 8), c(-16711681, 0.4f));
                        }
                        DialogActionButtonLayout dialogActionButtonLayout5 = this.L;
                        if (dialogActionButtonLayout5 == null) {
                            m.l();
                            throw null;
                        }
                        a(this, canvas, -65281, dialogActionButtonLayout5.getTop());
                        float measuredHeight = getMeasuredHeight() - (f.p(this, 52) - f.p(this, 8));
                        float measuredHeight2 = getMeasuredHeight() - f.p(this, 8);
                        a(this, canvas, -65536, measuredHeight);
                        a(this, canvas, -65536, measuredHeight2);
                        a(this, canvas, -16776961, measuredHeight - f.p(this, 8));
                        return;
                    }
                    return;
                }
                DialogActionButtonLayout dialogActionButtonLayout6 = this.L;
                if (dialogActionButtonLayout6 == null) {
                    m.l();
                    throw null;
                }
                float fP = f.p(this, 8) + dialogActionButtonLayout6.getTop();
                DialogActionButtonLayout dialogActionButtonLayout7 = this.L;
                if (dialogActionButtonLayout7 == null) {
                    m.l();
                    throw null;
                }
                float fP2 = fP;
                for (DialogActionButton dialogActionButton2 : dialogActionButtonLayout7.getVisibleButtons()) {
                    float fP3 = f.p(this, 36) + fP2;
                    canvas.drawRect(dialogActionButton2.getLeft(), fP2, getMeasuredWidth() - f.p(this, 8), fP3, c(-16711681, 0.4f));
                    fP2 = f.p(this, 16) + fP3;
                }
                DialogActionButtonLayout dialogActionButtonLayout8 = this.L;
                if (dialogActionButtonLayout8 == null) {
                    m.l();
                    throw null;
                }
                a(this, canvas, -16776961, dialogActionButtonLayout8.getTop());
                DialogActionButtonLayout dialogActionButtonLayout9 = this.L;
                if (dialogActionButtonLayout9 == null) {
                    m.l();
                    throw null;
                }
                float fP4 = f.p(this, 8) + dialogActionButtonLayout9.getTop();
                float measuredHeight3 = getMeasuredHeight() - f.p(this, 8);
                a(this, canvas, -65536, fP4);
                a(this, canvas, -65536, measuredHeight3);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.md_title_layout);
        m.b(viewFindViewById, "findViewById(R.id.md_title_layout)");
        this.H = (DialogTitleLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.md_content_layout);
        m.b(viewFindViewById2, "findViewById(R.id.md_content_layout)");
        this.K = (DialogContentLayout) viewFindViewById2;
        this.L = (DialogActionButtonLayout) findViewById(R.id.md_button_layout);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredHeight;
        int measuredWidth = getMeasuredWidth();
        DialogTitleLayout dialogTitleLayout = this.H;
        if (dialogTitleLayout == null) {
            m.n("titleLayout");
            throw null;
        }
        int measuredHeight2 = dialogTitleLayout.getMeasuredHeight();
        DialogTitleLayout dialogTitleLayout2 = this.H;
        if (dialogTitleLayout2 == null) {
            m.n("titleLayout");
            throw null;
        }
        dialogTitleLayout2.layout(0, 0, measuredWidth, measuredHeight2);
        if (this.N) {
            int measuredHeight3 = getMeasuredHeight();
            DialogActionButtonLayout dialogActionButtonLayout = this.L;
            measuredHeight = measuredHeight3 - (dialogActionButtonLayout != null ? dialogActionButtonLayout.getMeasuredHeight() : 0);
            if (p.F(this.L)) {
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight4 = getMeasuredHeight();
                DialogActionButtonLayout dialogActionButtonLayout2 = this.L;
                if (dialogActionButtonLayout2 == null) {
                    m.l();
                    throw null;
                }
                dialogActionButtonLayout2.layout(0, measuredHeight, measuredWidth2, measuredHeight4);
            }
        } else {
            measuredHeight = getMeasuredHeight();
        }
        int measuredWidth3 = getMeasuredWidth();
        DialogContentLayout dialogContentLayout = this.K;
        if (dialogContentLayout != null) {
            dialogContentLayout.layout(0, measuredHeight2, measuredWidth3, measuredHeight);
        } else {
            m.n("contentLayout");
            throw null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int i13 = this.f7414a;
        if (1 <= i13 && size2 > i13) {
            size2 = i13;
        }
        DialogTitleLayout dialogTitleLayout = this.H;
        if (dialogTitleLayout == null) {
            m.n("titleLayout");
            throw null;
        }
        dialogTitleLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (p.F(this.L)) {
            DialogActionButtonLayout dialogActionButtonLayout = this.L;
            if (dialogActionButtonLayout == null) {
                m.l();
                throw null;
            }
            dialogActionButtonLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        DialogTitleLayout dialogTitleLayout2 = this.H;
        if (dialogTitleLayout2 == null) {
            m.n("titleLayout");
            throw null;
        }
        int measuredHeight = dialogTitleLayout2.getMeasuredHeight();
        DialogActionButtonLayout dialogActionButtonLayout2 = this.L;
        int measuredHeight2 = size2 - (measuredHeight + (dialogActionButtonLayout2 != null ? dialogActionButtonLayout2.getMeasuredHeight() : 0));
        DialogContentLayout dialogContentLayout = this.K;
        if (dialogContentLayout == null) {
            m.n("contentLayout");
            throw null;
        }
        dialogContentLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2, Integer.MIN_VALUE));
        if (this.M == a.WRAP_CONTENT) {
            DialogTitleLayout dialogTitleLayout3 = this.H;
            if (dialogTitleLayout3 == null) {
                m.n("titleLayout");
                throw null;
            }
            int measuredHeight3 = dialogTitleLayout3.getMeasuredHeight();
            DialogContentLayout dialogContentLayout2 = this.K;
            if (dialogContentLayout2 == null) {
                m.n("contentLayout");
                throw null;
            }
            int measuredHeight4 = dialogContentLayout2.getMeasuredHeight() + measuredHeight3;
            DialogActionButtonLayout dialogActionButtonLayout3 = this.L;
            setMeasuredDimension(size, measuredHeight4 + (dialogActionButtonLayout3 != null ? dialogActionButtonLayout3.getMeasuredHeight() : 0));
        } else {
            setMeasuredDimension(size, this.O);
        }
        if (this.f7416c.length == 0) {
            return;
        }
        RectF rectF = this.Q;
        rectF.left = CropImageView.DEFAULT_ASPECT_RATIO;
        rectF.top = CropImageView.DEFAULT_ASPECT_RATIO;
        rectF.right = getMeasuredWidth();
        rectF.bottom = getMeasuredHeight();
        this.P.addRoundRect(rectF, this.f7416c, Path.Direction.CW);
    }

    public final void setButtonsLayout(DialogActionButtonLayout dialogActionButtonLayout) {
        this.L = dialogActionButtonLayout;
    }

    public final void setContentLayout(DialogContentLayout dialogContentLayout) {
        this.K = dialogContentLayout;
    }

    public final void setCornerRadii(float[] fArr) {
        this.f7416c = fArr;
        Path path = this.P;
        if (!path.isEmpty()) {
            path.reset();
        }
        invalidate();
    }

    public final void setDebugMode(boolean z11) {
        this.f7415b = z11;
        setWillNotDraw(!z11);
    }

    public final void setDialog(d dVar) {
        this.f7420t = dVar;
    }

    public final void setLayoutMode(a aVar) {
        this.M = aVar;
    }

    public final void setMaxHeight(int i11) {
        this.f7414a = i11;
    }

    public final void setTitleLayout(DialogTitleLayout dialogTitleLayout) {
        this.H = dialogTitleLayout;
    }
}
