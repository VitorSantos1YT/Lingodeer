package p9;

import android.content.DialogInterface;
import androidx.preference.ListPreferenceDialogFragment;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46669b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f46668a = i11;
        this.f46669b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        switch (this.f46668a) {
            case 0:
                ListPreferenceDialogFragment listPreferenceDialogFragment = (ListPreferenceDialogFragment) this.f46669b;
                listPreferenceDialogFragment.K = i11;
                listPreferenceDialogFragment.H = -1;
                dialogInterface.dismiss();
                break;
            default:
                i iVar = (i) this.f46669b;
                iVar.f46683a0 = i11;
                iVar.Z = -1;
                dialogInterface.dismiss();
                break;
        }
    }
}
