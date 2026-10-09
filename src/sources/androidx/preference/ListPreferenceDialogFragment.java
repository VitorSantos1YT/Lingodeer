package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import p9.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ListPreferenceDialogFragment extends PreferenceDialogFragment {
    public int K;
    public CharSequence[] L;
    public CharSequence[] M;

    @Override // androidx.preference.PreferenceDialogFragment
    public final void c(boolean z11) {
        int i11;
        ListPreference listPreference = (ListPreference) a();
        if (!z11 || (i11 = this.K) < 0) {
            return;
        }
        String string = this.M[i11].toString();
        listPreference.a(string);
        listPreference.J(string);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public final void d(AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.L, this.K, new h(this, 0));
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.K = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.L = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.M = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) a();
        CharSequence[] charSequenceArr = listPreference.f2311v0;
        CharSequence[] charSequenceArr2 = listPreference.f2312w0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.K = listPreference.E(listPreference.f2313x0);
        this.L = listPreference.f2311v0;
        this.M = charSequenceArr2;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.K);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.L);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.M);
    }
}
