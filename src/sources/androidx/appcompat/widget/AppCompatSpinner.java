package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import qp.m4;
import r.a0;
import r.b0;
import r.c0;
import r.d0;
import r.g0;
import r.h0;
import r.i2;
import r.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    public static final int[] K = {R.attr.spinnerMode};
    public final Rect H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f931f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f932t;

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i11 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.H;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f926a;
        if (qVar != null) {
            qVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h0 h0Var = this.f931f;
        return h0Var != null ? h0Var.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h0 h0Var = this.f931f;
        return h0Var != null ? h0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f931f != null ? this.f932t : super.getDropDownWidth();
    }

    public final h0 getInternalPopup() {
        return this.f931f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h0 h0Var = this.f931f;
        return h0Var != null ? h0Var.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f927b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h0 h0Var = this.f931f;
        return h0Var != null ? h0Var.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f926a;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f926a;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h0 h0Var = this.f931f;
        if (h0Var == null || !h0Var.b()) {
            return;
        }
        h0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f931f == null || View.MeasureSpec.getMode(i11) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g0 g0Var = (g0) parcelable;
        super.onRestoreInstanceState(g0Var.getSuperState());
        if (!g0Var.f48568a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new q.d(this, 3));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        g0 g0Var = new g0(super.onSaveInstanceState());
        h0 h0Var = this.f931f;
        g0Var.f48568a = h0Var != null && h0Var.b();
        return g0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a0 a0Var = this.f928c;
        if (a0Var == null || !a0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        h0 h0Var = this.f931f;
        if (h0Var == null) {
            return super.performClick();
        }
        if (h0Var.b()) {
            return true;
        }
        h0Var.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f926a;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        q qVar = this.f926a;
        if (qVar != null) {
            qVar.f(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i11) {
        h0 h0Var = this.f931f;
        if (h0Var == null) {
            super.setDropDownHorizontalOffset(i11);
        } else {
            h0Var.l(i11);
            h0Var.d(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i11) {
        h0 h0Var = this.f931f;
        if (h0Var != null) {
            h0Var.k(i11);
        } else {
            super.setDropDownVerticalOffset(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i11) {
        if (this.f931f != null) {
            this.f932t = i11;
        } else {
            super.setDropDownWidth(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h0 h0Var = this.f931f;
        if (h0Var != null) {
            h0Var.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i11) {
        setPopupBackgroundDrawable(jh.h.k(getPopupContext(), i11));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h0 h0Var = this.f931f;
        if (h0Var != null) {
            h0Var.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f926a;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f926a;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.spinnerStyle);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f930e) {
            this.f929d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        h0 h0Var = this.f931f;
        if (h0Var != null) {
            Context context = this.f927b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            d0 d0Var = new d0();
            d0Var.f48541a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                d0Var.f48542b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                b0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            h0Var.p(d0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i11) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i11);
        this.H = new Rect();
        i2.a(this, getContext());
        int[] iArr = k.a.f37421x;
        m4 m4VarK = m4.k(context, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        this.f926a = new q(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f927b = new p.e(context, resourceId);
        } else {
            this.f927b = context;
        }
        int i12 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K, i11, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i12 != 0) {
                    c0 c0Var = new c0(this);
                    this.f931f = c0Var;
                    c0Var.f48536c = typedArray.getString(2);
                } else if (i12 == 1) {
                    d dVar = new d(this, this.f927b, attributeSet, i11);
                    m4 m4VarK2 = m4.k(this.f927b, attributeSet, iArr, i11);
                    this.f932t = ((TypedArray) m4VarK2.f48061c).getLayoutDimension(3, -2);
                    dVar.j(m4VarK2.g(1));
                    dVar.f1075e0 = typedArray.getString(2);
                    m4VarK2.l();
                    this.f931f = dVar;
                    this.f928c = new a0(this, this, dVar);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(com.lingodeer.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                m4VarK.l();
                this.f930e = true;
                spinnerAdapter = this.f929d;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f929d = null;
                }
                this.f926a.d(attributeSet, i11);
            } catch (Throwable th2) {
                th = th2;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th3) {
            th = th3;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i12 != 0) {
            c0 c0Var2 = new c0(this);
            this.f931f = c0Var2;
            c0Var2.f48536c = typedArray.getString(2);
        } else if (i12 == 1) {
            d dVar2 = new d(this, this.f927b, attributeSet, i11);
            m4 m4VarK3 = m4.k(this.f927b, attributeSet, iArr, i11);
            this.f932t = ((TypedArray) m4VarK3.f48061c).getLayoutDimension(3, -2);
            dVar2.j(m4VarK3.g(1));
            dVar2.f1075e0 = typedArray.getString(2);
            m4VarK3.l();
            this.f931f = dVar2;
            this.f928c = new a0(this, this, dVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.lingodeer.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        m4VarK.l();
        this.f930e = true;
        spinnerAdapter = this.f929d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f929d = null;
        }
        this.f926a.d(attributeSet, i11);
    }
}
