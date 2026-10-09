package p9;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class e extends t {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public EditText f46653a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public CharSequence f46654b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final aj.i f46655c0 = new aj.i(this, 26);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f46656d0 = -1;

    @Override // p9.t, androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f46654b0 = ((EditTextPreference) v()).f2310v0;
        } else {
            this.f46654b0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // p9.t, androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f46654b0);
    }

    @Override // p9.t
    public final void w(View view) {
        super.w(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f46653a0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f46653a0.setText(this.f46654b0);
        EditText editText2 = this.f46653a0;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) v()).getClass();
    }

    @Override // p9.t
    public final void x(boolean z11) {
        if (z11) {
            String string = this.f46653a0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) v();
            editTextPreference.a(string);
            editTextPreference.E(string);
        }
    }

    public final void z() {
        long j11 = this.f46656d0;
        if (j11 == -1 || j11 + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f46653a0;
        if (editText == null || !editText.isFocused()) {
            this.f46656d0 = -1L;
            return;
        }
        if (((InputMethodManager) this.f46653a0.getContext().getSystemService("input_method")).showSoftInput(this.f46653a0, 0)) {
            this.f46656d0 = -1L;
            return;
        }
        EditText editText2 = this.f46653a0;
        aj.i iVar = this.f46655c0;
        editText2.removeCallbacks(iVar);
        this.f46653a0.postDelayed(iVar, 50L);
    }
}
