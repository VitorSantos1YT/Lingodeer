package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.lingodeer.R;
import qp.m4;
import r.c1;
import r.i2;
import r.j2;
import r.o0;
import r.q;
import r.r;
import r.u;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f906d;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    private u getEmojiTextViewHelper() {
        if (this.f906d == null) {
            this.f906d = new u(this);
        }
        return this.f906d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o0 o0Var = this.f905c;
        if (o0Var != null) {
            o0Var.b();
        }
        q qVar = this.f904b;
        if (qVar != null) {
            qVar.a();
        }
        r rVar = this.f903a;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return v10.c.M(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f904b;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f904b;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        r rVar = this.f903a;
        if (rVar != null) {
            return rVar.f48631a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        r rVar = this.f903a;
        if (rVar != null) {
            return rVar.f48632b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f905c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f905c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ew.a.t(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        getEmojiTextViewHelper().c(z11);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f904b;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        q qVar = this.f904b;
        if (qVar != null) {
            qVar.f(i11);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        r rVar = this.f903a;
        if (rVar != null) {
            if (rVar.f48635e) {
                rVar.f48635e = false;
            } else {
                rVar.f48635e = true;
                rVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o0 o0Var = this.f905c;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o0 o0Var = this.f905c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f904b;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f904b;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        r rVar = this.f903a;
        if (rVar != null) {
            rVar.f48631a = colorStateList;
            rVar.f48633c = true;
            rVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        r rVar = this.f903a;
        if (rVar != null) {
            rVar.f48632b = mode;
            rVar.f48634d = true;
            rVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o0 o0Var = this.f905c;
        o0Var.k(colorStateList);
        o0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o0 o0Var = this.f905c;
        o0Var.l(mode);
        o0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        o0 o0Var = this.f905c;
        if (o0Var != null) {
            o0Var.g(context, i11);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i11) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, i11);
        j2.a(context);
        i2.a(this, getContext());
        o0 o0Var = new o0(this);
        this.f905c = o0Var;
        o0Var.f(attributeSet, i11);
        o0Var.b();
        q qVar = new q(this);
        this.f904b = qVar;
        qVar.d(attributeSet, i11);
        this.f903a = new r(this);
        Context context2 = getContext();
        int[] iArr = k.a.m;
        m4 m4VarK = m4.k(context2, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        s0.p(this, getContext(), iArr, attributeSet, (TypedArray) m4VarK.f48061c, i11);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(jh.h.k(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(jh.h.k(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(jh.h.k(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(m4VarK.f(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(c1.c(typedArray.getInt(3, -1), null));
            }
            m4VarK.l();
            getEmojiTextViewHelper().b(attributeSet, i11);
        } catch (Throwable th2) {
            m4VarK.l();
            throw th2;
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i11) {
        setCheckMarkDrawable(jh.h.k(getContext(), i11));
    }
}
