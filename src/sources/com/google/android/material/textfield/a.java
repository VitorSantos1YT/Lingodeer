package com.google.android.material.textfield;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f15735b;

    public /* synthetic */ a(EndIconDelegate endIconDelegate, int i11) {
        this.f15734a = i11;
        this.f15735b = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f15734a) {
            case 0:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) this.f15735b;
                EditText editText = clearTextEndIconDelegate.f15596i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    clearTextEndIconDelegate.p();
                    break;
                }
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f15735b).t();
                break;
            default:
                PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = (PasswordToggleEndIconDelegate) this.f15735b;
                EditText editText2 = passwordToggleEndIconDelegate.f15679f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = passwordToggleEndIconDelegate.f15679f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        passwordToggleEndIconDelegate.f15679f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        passwordToggleEndIconDelegate.f15679f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        passwordToggleEndIconDelegate.f15679f.setSelection(selectionEnd);
                    }
                    passwordToggleEndIconDelegate.p();
                    break;
                }
                break;
        }
    }
}
