package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import fb.g0;
import q.b;
import q.c;
import q.k;
import q.l;
import q.n;
import q.w;
import r.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements w, View.OnClickListener, i {
    public boolean H;
    public final int K;
    public int L;
    public final int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f832f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f833t;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // r.i
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // r.i
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f827a.getIcon() == null;
    }

    @Override // q.w
    public final void c(n nVar) {
        this.f827a = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f47290a);
        setVisibility(nVar.isVisible() ? 0 : 8);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f831e == null) {
            this.f831e = new b(this);
        }
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (i11 < 480) {
            return (i11 >= 640 && i12 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f828b);
        if (this.f829c != null && ((this.f827a.f47291a0 & 4) != 4 || (!this.f833t && !this.H))) {
            z11 = false;
        }
        boolean z13 = z12 & z11;
        setText(z13 ? this.f828b : null);
        CharSequence charSequence = this.f827a.S;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z13 ? null : this.f827a.f47298e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f827a.T;
        if (TextUtils.isEmpty(charSequence2)) {
            g0.C(this, z13 ? null : this.f827a.f47298e);
        } else {
            g0.C(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // q.w
    public n getItemData() {
        return this.f827a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f830d;
        if (kVar != null) {
            kVar.b(this.f827a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f833t = d();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i13 = this.L) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        int i14 = this.K;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i14) : i14;
        if (mode != 1073741824 && i14 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i12);
        }
        if (!zIsEmpty || this.f829c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f829c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f827a.hasSubMenu() && (bVar = this.f831e) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z11) {
        if (this.H != z11) {
            this.H = z11;
            n nVar = this.f827a;
            if (nVar != null) {
                l lVar = nVar.P;
                lVar.M = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f829c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i11 = this.M;
            if (intrinsicWidth > i11) {
                intrinsicHeight = (int) (intrinsicHeight * (i11 / intrinsicWidth));
                intrinsicWidth = i11;
            }
            if (intrinsicHeight > i11) {
                intrinsicWidth = (int) (intrinsicWidth * (i11 / intrinsicHeight));
            } else {
                i11 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i11);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(k kVar) {
        this.f830d = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i11, int i12, int i13, int i14) {
        this.L = i11;
        super.setPadding(i11, i12, i13, i14);
    }

    public void setPopupCallback(c cVar) {
        this.f832f = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f828b = charSequence;
        e();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Resources resources = context.getResources();
        this.f833t = d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f37401c, i11, 0);
        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.M = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.L = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z11) {
    }

    public void setChecked(boolean z11) {
    }
}
