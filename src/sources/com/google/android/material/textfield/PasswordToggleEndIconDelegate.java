package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class PasswordToggleEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f15679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f15680g;

    public PasswordToggleEndIconDelegate(EndCompoundLayout endCompoundLayout, int i11) {
        super(endCompoundLayout);
        this.f15678e = R.drawable.design_password_eye;
        this.f15680g = new a(this, 2);
        if (i11 != 0) {
            this.f15678e = i11;
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void b() {
        p();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int d() {
        return this.f15678e;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnClickListener f() {
        return this.f15680g;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean k() {
        EditText editText = this.f15679f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void l(EditText editText) {
        this.f15679f = editText;
        p();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void q() {
        EditText editText = this.f15679f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f15679f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void r() {
        EditText editText = this.f15679f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
