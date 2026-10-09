package p9;

import android.content.DialogInterface;
import androidx.preference.MultiSelectListPreferenceDialogFragment;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46690b;

    public /* synthetic */ k(Object obj, int i11) {
        this.f46689a = i11;
        this.f46690b = obj;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i11, boolean z11) {
        switch (this.f46689a) {
            case 0:
                MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = (MultiSelectListPreferenceDialogFragment) this.f46690b;
                HashSet hashSet = multiSelectListPreferenceDialogFragment.K;
                if (!z11) {
                    multiSelectListPreferenceDialogFragment.L = hashSet.remove(multiSelectListPreferenceDialogFragment.N[i11].toString()) | multiSelectListPreferenceDialogFragment.L;
                } else {
                    multiSelectListPreferenceDialogFragment.L = hashSet.add(multiSelectListPreferenceDialogFragment.N[i11].toString()) | multiSelectListPreferenceDialogFragment.L;
                }
                break;
            default:
                l lVar = (l) this.f46690b;
                HashSet hashSet2 = lVar.f46694a0;
                if (!z11) {
                    lVar.f46695b0 = hashSet2.remove(lVar.f46697d0[i11].toString()) | lVar.f46695b0;
                } else {
                    lVar.f46695b0 = hashSet2.add(lVar.f46697d0[i11].toString()) | lVar.f46695b0;
                }
                break;
        }
    }
}
