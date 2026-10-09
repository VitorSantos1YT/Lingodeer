package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.lingodeer.R;
import e5.p;
import r.i0;
import r.i2;
import r.j0;
import r.j2;
import r.o0;
import r.q;
import r.t;
import r.x;
import r.y;
import z4.s0;
import z4.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f912f;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private t getSuperCaller() {
        if (this.f912f == null) {
            this.f912f = new t(this);
        }
        return this.f912f;
    }

    @Override // z4.v
    public final z4.h a(z4.h hVar) {
        this.f910d.getClass();
        return p.a(this, hVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f907a;
        if (qVar != null) {
            qVar.a();
        }
        o0 o0Var = this.f908b;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return v10.c.M(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f907a;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f907a;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f908b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f908b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        j0 j0Var;
        if (Build.VERSION.SDK_INT >= 28 || (j0Var = this.f909c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = j0Var.f48587b;
        return textClassifier == null ? i0.a(j0Var.f48586a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrH;
        InputConnection eVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f908b.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 && inputConnectionOnCreateInputConnection != null) {
            b5.c.c(editorInfo, getText());
        }
        ew.a.t(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i11 <= 30 && (strArrH = s0.h(this)) != null) {
            b5.c.b(editorInfo, strArrH);
            app.rive.runtime.kotlin.core.a aVar = new app.rive.runtime.kotlin.core.a(this, 1);
            if (i11 >= 25) {
                eVar = new b5.d(inputConnectionOnCreateInputConnection, aVar);
            } else if (b5.c.a(editorInfo).length != 0) {
                eVar = new b5.e(inputConnectionOnCreateInputConnection, aVar);
            }
            inputConnectionOnCreateInputConnection = eVar;
        }
        return this.f911e.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 || i11 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && s0.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = y.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i11) {
        z4.f fVar;
        z4.e eVar;
        int i12;
        f3.i iVar;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31 || s0.h(this) == null || !(i11 == 16908322 || i11 == 16908337)) {
            return super.onTextContextMenuItem(i11);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i13 >= 31) {
                iVar = new f3.i(primaryClip, 1);
            } else {
                fVar = new z4.f();
                fVar.f58828b = primaryClip;
                fVar.f58829c = 1;
            }
            if (i11 == 16908322) {
                eVar = fVar;
                eVar = iVar;
                i12 = 0;
            } else {
                eVar = fVar;
                eVar = iVar;
                i12 = 1;
            }
            eVar.c(i12);
            s0.m(this, eVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f907a;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        q qVar = this.f907a;
        if (qVar != null) {
            qVar.f(i11);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o0 o0Var = this.f908b;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o0 o0Var = this.f908b;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(v10.c.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z11) {
        this.f911e.d(z11);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f911e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f907a;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f907a;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o0 o0Var = this.f908b;
        o0Var.k(colorStateList);
        o0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o0 o0Var = this.f908b;
        o0Var.l(mode);
        o0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        o0 o0Var = this.f908b;
        if (o0Var != null) {
            o0Var.g(context, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        j0 j0Var;
        if (Build.VERSION.SDK_INT >= 28 || (j0Var = this.f909c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            j0Var.f48587b = textClassifier;
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        j2.a(context);
        i2.a(this, getContext());
        q qVar = new q(this);
        this.f907a = qVar;
        qVar.d(attributeSet, i11);
        o0 o0Var = new o0(this);
        this.f908b = o0Var;
        o0Var.f(attributeSet, i11);
        o0Var.b();
        j0 j0Var = new j0();
        j0Var.f48586a = this;
        this.f909c = j0Var;
        this.f910d = new p();
        x xVar = new x(this);
        this.f911e = xVar;
        xVar.b(attributeSet, i11);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = xVar.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }
}
