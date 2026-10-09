package x5;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f55798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f55799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55800c = true;

    public i(EditText editText) {
        this.f55798a = editText;
    }

    public static void a(EditText editText, int i11) {
        int length;
        if (i11 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            v5.j jVarA = v5.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) throws Throwable {
        EditText editText = this.f55798a;
        if (!editText.isInEditMode() && this.f55800c && v5.j.d() && i12 <= i13 && (charSequence instanceof Spannable)) {
            int iC = v5.j.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    v5.j.a().g(i11, i13 + i11, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            v5.j jVarA = v5.j.a();
            if (this.f55799b == null) {
                this.f55799b = new h(editText);
            }
            jVarA.h(this.f55799b);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
