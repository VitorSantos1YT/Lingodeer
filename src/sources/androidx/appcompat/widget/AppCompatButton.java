package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.lingodeer.R;
import r.b3;
import r.i2;
import r.j2;
import r.o0;
import r.q;
import r.u;
import r.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements e5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f898c;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private u getEmojiTextViewHelper() {
        if (this.f898c == null) {
            this.f898c = new u(this);
        }
        return this.f898c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f896a;
        if (qVar != null) {
            qVar.a();
        }
        o0 o0Var = this.f897b;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b3.f48533c) {
            return super.getAutoSizeMaxTextSize();
        }
        o0 o0Var = this.f897b;
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
        o0 o0Var = this.f897b;
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
        o0 o0Var = this.f897b;
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
        o0 o0Var = this.f897b;
        return o0Var != null ? o0Var.f48613i.f48689f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (b3.f48533c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        o0 o0Var = this.f897b;
        if (o0Var != null) {
            return o0Var.f48613i.f48684a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return v10.c.M(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f896a;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f896a;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f897b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f897b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        o0 o0Var = this.f897b;
        if (o0Var == null || b3.f48533c) {
            return;
        }
        o0Var.f48613i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        o0 o0Var = this.f897b;
        if (o0Var != null) {
            w0 w0Var = o0Var.f48613i;
            if (b3.f48533c || !w0Var.e()) {
                return;
            }
            w0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        getEmojiTextViewHelper().c(z11);
    }

    @Override // android.widget.TextView, e5.b
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) {
        if (b3.f48533c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        o0 o0Var = this.f897b;
        if (o0Var != null) {
            o0Var.h(i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i11) {
        if (b3.f48533c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
            return;
        }
        o0 o0Var = this.f897b;
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
        o0 o0Var = this.f897b;
        if (o0Var != null) {
            o0Var.j(i11);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f896a;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        q qVar = this.f896a;
        if (qVar != null) {
            qVar.f(i11);
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

    public void setSupportAllCaps(boolean z11) {
        o0 o0Var = this.f897b;
        if (o0Var != null) {
            o0Var.f48605a.setAllCaps(z11);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f896a;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f896a;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o0 o0Var = this.f897b;
        o0Var.k(colorStateList);
        o0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o0 o0Var = this.f897b;
        o0Var.l(mode);
        o0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        o0 o0Var = this.f897b;
        if (o0Var != null) {
            o0Var.g(context, i11);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i11, float f5) {
        boolean z11 = b3.f48533c;
        if (z11) {
            super.setTextSize(i11, f5);
            return;
        }
        o0 o0Var = this.f897b;
        if (o0Var != null) {
            w0 w0Var = o0Var.f48613i;
            if (z11 || w0Var.e()) {
                return;
            }
            w0Var.f(i11, f5);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        j2.a(context);
        i2.a(this, getContext());
        q qVar = new q(this);
        this.f896a = qVar;
        qVar.d(attributeSet, i11);
        o0 o0Var = new o0(this);
        this.f897b = o0Var;
        o0Var.f(attributeSet, i11);
        o0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i11);
    }
}
