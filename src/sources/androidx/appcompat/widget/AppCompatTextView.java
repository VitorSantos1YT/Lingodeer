package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import gb.r;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import r.b3;
import r.i0;
import r.i2;
import r.j0;
import r.j2;
import r.o0;
import r.p0;
import r.q;
import r.q0;
import r.r0;
import r.u;
import r.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements e5.b {
    private final q mBackgroundTintHelper;
    private u mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<x4.d> mPrecomputedTextFuture;
    private p0 mSuperCaller;
    private final j0 mTextClassifierHelper;
    private final o0 mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private u getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new u(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.mBackgroundTintHelper;
        if (qVar != null) {
            qVar.a();
        }
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b3.f48533c) {
            return super.getAutoSizeMaxTextSize();
        }
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            return Math.round(o0Var.f48613i.f48688e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (b3.f48533c) {
            return super.getAutoSizeMinTextSize();
        }
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            return Math.round(o0Var.f48613i.f48687d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (b3.f48533c) {
            return super.getAutoSizeStepGranularity();
        }
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            return Math.round(o0Var.f48613i.f48686c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (b3.f48533c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        o0 o0Var = this.mTextHelper;
        return o0Var != null ? o0Var.f48613i.f48689f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (b3.f48533c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            return o0Var.f48613i.f48684a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return v10.c.M(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public p0 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                this.mSuperCaller = new r0(this);
            } else if (i11 >= 28) {
                this.mSuperCaller = new q0(this);
            } else if (i11 >= 26) {
                this.mSuperCaller = new lp.b(this, 24);
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.mBackgroundTintHelper;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.mBackgroundTintHelper;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<x4.d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                v10.c.v(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        j0 j0Var;
        if (Build.VERSION.SDK_INT >= 28 || (j0Var = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = j0Var.f48587b;
        return textClassifier == null ? i0.a(j0Var.f48586a) : textClassifier;
    }

    public x4.c getTextMetricsParamsCompat() {
        return v10.c.v(this);
    }

    public boolean isEmojiCompatEnabled() {
        return ((c.a) getEmojiTextViewHelper().f48669b.f52059b).z();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            b5.c.c(editorInfo, getText());
        }
        ew.a.t(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 || i11 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        o0 o0Var = this.mTextHelper;
        if (o0Var == null || b3.f48533c) {
            return;
        }
        o0Var.f48613i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        Future<x4.d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                v10.c.v(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        o0 o0Var = this.mTextHelper;
        if (o0Var == null || b3.f48533c || !o0Var.f48613i.e()) {
            return;
        }
        this.mTextHelper.f48613i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        getEmojiTextViewHelper().c(z11);
    }

    @Override // android.widget.TextView, e5.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) {
        if (b3.f48533c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            o0Var.h(i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i11) {
        if (b3.f48533c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
            return;
        }
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            o0Var.i(iArr, i11);
        }
    }

    @Override // android.widget.TextView, e5.b
    public void setAutoSizeTextTypeWithDefaults(int i11) {
        if (b3.f48533c) {
            super.setAutoSizeTextTypeWithDefaults(i11);
            return;
        }
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            o0Var.j(i11);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.mBackgroundTintHelper;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        q qVar = this.mBackgroundTintHelper;
        if (qVar != null) {
            qVar.f(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(v10.c.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z11) {
        getEmojiTextViewHelper().d(z11);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i11);
        } else {
            v10.c.H(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i11);
        } else {
            v10.c.I(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i11) {
        v10.c.J(this, i11);
    }

    public void setPrecomputedText(x4.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        v10.c.v(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.mBackgroundTintHelper;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.mBackgroundTintHelper;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            o0Var.g(context, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        j0 j0Var;
        if (Build.VERSION.SDK_INT >= 28 || (j0Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            j0Var.f48587b = textClassifier;
        }
    }

    public void setTextFuture(Future<x4.d> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(x4.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f55774b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i11 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i11 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i11 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i11 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i11 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i11 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i11 = 7;
            }
        }
        setTextDirection(i11);
        getPaint().set(cVar.f55773a);
        setBreakStrategy(cVar.f55775c);
        setHyphenationFrequency(cVar.f55776d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f5) {
        boolean z11 = b3.f48533c;
        if (z11) {
            super.setTextSize(i11, f5);
            return;
        }
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            w0 w0Var = o0Var.f48613i;
            if (z11 || w0Var.e()) {
                return;
            }
            w0Var.f(i11, f5);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i11) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i11 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            r rVar = r4.g.f48800a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i11);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i11);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i11, float f5) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            getSuperCaller().c(i11, f5);
        } else if (i12 >= 34) {
            a5.b.o(this, i11, f5);
        } else {
            v10.c.J(this, Math.round(TypedValue.applyDimension(i11, f5, getResources().getDisplayMetrics())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        j2.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        i2.a(this, getContext());
        q qVar = new q(this);
        this.mBackgroundTintHelper = qVar;
        qVar.d(attributeSet, i11);
        o0 o0Var = new o0(this);
        this.mTextHelper = o0Var;
        o0Var.f(attributeSet, i11);
        o0Var.b();
        j0 j0Var = new j0();
        j0Var.f48586a = this;
        this.mTextClassifierHelper = j0Var;
        getEmojiTextViewHelper().b(attributeSet, i11);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i11 != 0 ? jh.h.k(context, i11) : null, i12 != 0 ? jh.h.k(context, i12) : null, i13 != 0 ? jh.h.k(context, i13) : null, i14 != 0 ? jh.h.k(context, i14) : null);
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i11 != 0 ? jh.h.k(context, i11) : null, i12 != 0 ? jh.h.k(context, i12) : null, i13 != 0 ? jh.h.k(context, i13) : null, i14 != 0 ? jh.h.k(context, i14) : null);
        o0 o0Var = this.mTextHelper;
        if (o0Var != null) {
            o0Var.b();
        }
    }
}
