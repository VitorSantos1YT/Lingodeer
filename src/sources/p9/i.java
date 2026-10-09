package p9;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class i extends t {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f46683a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public CharSequence[] f46684b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence[] f46685c0;

    @Override // p9.t, androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f46683a0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f46684b0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f46685c0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) v();
        CharSequence[] charSequenceArr = listPreference.f2311v0;
        CharSequence[] charSequenceArr2 = listPreference.f2312w0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f46683a0 = listPreference.E(listPreference.f2313x0);
        this.f46684b0 = listPreference.f2311v0;
        this.f46685c0 = charSequenceArr2;
    }

    @Override // p9.t, androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f46683a0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f46684b0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f46685c0);
    }

    @Override // p9.t
    public final void x(boolean z11) {
        int i11;
        if (!z11 || (i11 = this.f46683a0) < 0) {
            return;
        }
        String string = this.f46685c0[i11].toString();
        ListPreference listPreference = (ListPreference) v();
        listPreference.a(string);
        listPreference.J(string);
    }

    @Override // p9.t
    public final void y(l.j jVar) {
        CharSequence[] charSequenceArr = this.f46684b0;
        int i11 = this.f46683a0;
        h hVar = new h(this, 1);
        l.f fVar = jVar.f39020a;
        fVar.m = charSequenceArr;
        fVar.f38973o = hVar;
        fVar.f38978t = i11;
        fVar.f38977s = true;
        jVar.d(null, null);
    }
}
