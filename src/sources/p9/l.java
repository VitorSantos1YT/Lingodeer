package p9;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class l extends t {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final HashSet f46694a0 = new HashSet();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f46695b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence[] f46696c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public CharSequence[] f46697d0;

    @Override // p9.t, androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f46694a0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f46695b0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f46696c0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f46697d0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) v();
        CharSequence[] charSequenceArr = multiSelectListPreference.f2316v0;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.f2317w0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.f2318x0);
        this.f46695b0 = false;
        this.f46696c0 = multiSelectListPreference.f2316v0;
        this.f46697d0 = charSequenceArr2;
    }

    @Override // p9.t, androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f46694a0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f46695b0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f46696c0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f46697d0);
    }

    @Override // p9.t
    public final void x(boolean z11) {
        if (z11 && this.f46695b0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) v();
            HashSet hashSet = this.f46694a0;
            multiSelectListPreference.a(hashSet);
            multiSelectListPreference.E(hashSet);
        }
        this.f46695b0 = false;
    }

    @Override // p9.t
    public final void y(l.j jVar) {
        int length = this.f46697d0.length;
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zArr[i11] = this.f46694a0.contains(this.f46697d0[i11].toString());
        }
        CharSequence[] charSequenceArr = this.f46696c0;
        k kVar = new k(this, 1);
        l.f fVar = jVar.f39020a;
        fVar.m = charSequenceArr;
        fVar.f38979u = kVar;
        fVar.f38975q = zArr;
        fVar.f38976r = true;
    }
}
