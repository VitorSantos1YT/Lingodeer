package androidx.preference;

import android.app.AlertDialog;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import p9.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class MultiSelectListPreferenceDialogFragment extends PreferenceDialogFragment {
    public final HashSet K = new HashSet();
    public boolean L;
    public CharSequence[] M;
    public CharSequence[] N;

    @Override // androidx.preference.PreferenceDialogFragment
    public final void c(boolean z11) {
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a();
        if (z11 && this.L) {
            HashSet hashSet = this.K;
            multiSelectListPreference.a(hashSet);
            multiSelectListPreference.E(hashSet);
        }
        this.L = false;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public final void d(AlertDialog.Builder builder) {
        int length = this.N.length;
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zArr[i11] = this.K.contains(this.N[i11].toString());
        }
        builder.setMultiChoiceItems(this.M, zArr, new k(this, 0));
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.K;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
            this.L = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
            this.M = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
            this.N = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a();
        CharSequence[] charSequenceArr = multiSelectListPreference.f2316v0;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.f2317w0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.f2318x0);
        this.L = false;
        this.M = multiSelectListPreference.f2316v0;
        this.N = charSequenceArr2;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.K));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.L);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.M);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.N);
    }
}
