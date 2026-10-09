package x5;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import re.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f55785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f55786b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        v vVar = new v(12);
        super(inputConnection, false);
        this.f55785a = editText;
        this.f55786b = vVar;
        if (v5.j.d()) {
            v5.j.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        Editable editableText = this.f55785a.getEditableText();
        this.f55786b.getClass();
        return v.y(this, editableText, i11, i12, false) || super.deleteSurroundingText(i11, i12);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        Editable editableText = this.f55785a.getEditableText();
        this.f55786b.getClass();
        return v.y(this, editableText, i11, i12, true) || super.deleteSurroundingTextInCodePoints(i11, i12);
    }
}
