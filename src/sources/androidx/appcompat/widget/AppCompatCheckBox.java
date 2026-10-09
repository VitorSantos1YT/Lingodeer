package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.lingodeer.R;
import e5.q;
import r.i2;
import r.j2;
import r.o0;
import r.r;
import r.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.q f900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f902d;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    private u getEmojiTextViewHelper() {
        if (this.f902d == null) {
            this.f902d = new u(this);
        }
        return this.f902d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r.q qVar = this.f900b;
        if (qVar != null) {
            qVar.a();
        }
        o0 o0Var = this.f901c;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r.q qVar = this.f900b;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r.q qVar = this.f900b;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    @Override // e5.q
    public ColorStateList getSupportButtonTintList() {
        r rVar = this.f899a;
        if (rVar != null) {
            return rVar.f48631a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        r rVar = this.f899a;
        if (rVar != null) {
            return rVar.f48632b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f901c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f901c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        getEmojiTextViewHelper().c(z11);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r.q qVar = this.f900b;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        r.q qVar = this.f900b;
        if (qVar != null) {
            qVar.f(i11);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        r rVar = this.f899a;
        if (rVar != null) {
            if (rVar.f48635e) {
                rVar.f48635e = false;
            } else {
                rVar.f48635e = true;
                rVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o0 o0Var = this.f901c;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o0 o0Var = this.f901c;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z11) {
        getEmojiTextViewHelper().d(z11);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r.q qVar = this.f900b;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r.q qVar = this.f900b;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    @Override // e5.q
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        r rVar = this.f899a;
        if (rVar != null) {
            rVar.f48631a = colorStateList;
            rVar.f48633c = true;
            rVar.a();
        }
    }

    @Override // e5.q
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        r rVar = this.f899a;
        if (rVar != null) {
            rVar.f48632b = mode;
            rVar.f48634d = true;
            rVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o0 o0Var = this.f901c;
        o0Var.k(colorStateList);
        o0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o0 o0Var = this.f901c;
        o0Var.l(mode);
        o0Var.b();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        j2.a(context);
        i2.a(this, getContext());
        r rVar = new r(this);
        this.f899a = rVar;
        rVar.c(attributeSet, i11);
        r.q qVar = new r.q(this);
        this.f900b = qVar;
        qVar.d(attributeSet, i11);
        o0 o0Var = new o0(this);
        this.f901c = o0Var;
        o0Var.f(attributeSet, i11);
        getEmojiTextViewHelper().b(attributeSet, i11);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i11) {
        setButtonDrawable(jh.h.k(getContext(), i11));
    }
}
