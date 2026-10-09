package l;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class c0 extends androidx.fragment.app.y {
    @Override // androidx.fragment.app.y
    public Dialog r(Bundle bundle) {
        return new b0(getContext(), this.f1874f);
    }

    @Override // androidx.fragment.app.y
    public final void t(Dialog dialog, int i11) {
        if (!(dialog instanceof b0)) {
            super.t(dialog, i11);
            return;
        }
        b0 b0Var = (b0) dialog;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        b0Var.c().g(1);
    }
}
