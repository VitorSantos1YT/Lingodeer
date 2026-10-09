package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import qp.m4;
import r.o;
import r.p;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {
    public final q.d H;
    public h K;
    public PopupWindow.OnDismissListener L;
    public boolean M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f889f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z4.c f890t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f891a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            m4 m4VarJ = m4.j(context, attributeSet, f891a);
            setBackgroundDrawable(m4VarJ.g(0));
            m4VarJ.l();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.H);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().f1095b0.isShowing();
    }

    public r.l getDataModel() {
        this.f884a.getClass();
        return null;
    }

    public h getListPopupWindow() {
        if (this.K == null) {
            h hVar = new h(getContext());
            this.K = hVar;
            hVar.p(this.f884a);
            h hVar2 = this.K;
            hVar2.Q = this;
            hVar2.f1093a0 = true;
            hVar2.f1095b0.setFocusable(true);
            h hVar3 = this.K;
            p pVar = this.f885b;
            hVar3.R = pVar;
            hVar3.f1095b0.setOnDismissListener(pVar);
        }
        return this.K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f884a.getClass();
        this.M = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f884a.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.H);
        }
        if (b()) {
            a();
        }
        this.M = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f886c.layout(0, 0, i13 - i11, i14 - i12);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        if (this.f889f.getVisibility() != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12), 1073741824);
        }
        View view = this.f886c;
        measureChild(view, i11, i12);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(r.l lVar) {
        o oVar = this.f884a;
        oVar.f48604a.f884a.getClass();
        oVar.notifyDataSetChanged();
        if (b()) {
            a();
            if (b() || !this.M) {
                return;
            }
            oVar.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    public void setExpandActivityOverflowButtonContentDescription(int i11) {
        this.f888e.setContentDescription(getContext().getString(i11));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f888e.setImageDrawable(drawable);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.L = onDismissListener;
    }

    public void setProvider(z4.c cVar) {
        this.f890t = cVar;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        new r.m(this, 0);
        this.H = new q.d(this, 2);
        int[] iArr = k.a.f37403e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        s0.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i11);
        typedArrayObtainStyledAttributes.getInt(1, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(com.lingodeer.R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        p pVar = new p(this);
        this.f885b = pVar;
        View viewFindViewById = findViewById(com.lingodeer.R.id.activity_chooser_view_content);
        this.f886c = viewFindViewById;
        viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(com.lingodeer.R.id.default_activity_button);
        this.f889f = frameLayout;
        frameLayout.setOnClickListener(pVar);
        frameLayout.setOnLongClickListener(pVar);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(com.lingodeer.R.id.expand_activities_button);
        frameLayout2.setOnClickListener(pVar);
        frameLayout2.setAccessibilityDelegate(new r.n());
        frameLayout2.setOnTouchListener(new q.b(this, frameLayout2));
        this.f887d = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(com.lingodeer.R.id.image);
        this.f888e = imageView;
        imageView.setImageDrawable(drawable);
        o oVar = new o(this);
        this.f884a = oVar;
        oVar.registerDataSetObserver(new r.m(this, 1));
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.lingodeer.R.dimen.abc_config_prefDialogWidth));
    }

    public void setDefaultActionButtonContentDescription(int i11) {
    }

    public void setInitialActivityCount(int i11) {
    }
}
