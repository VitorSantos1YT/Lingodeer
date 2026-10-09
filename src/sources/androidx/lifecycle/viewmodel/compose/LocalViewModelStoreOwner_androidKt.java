package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import l1.n;
import l1.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LocalViewModelStoreOwner_androidKt {
    public static final ViewModelStoreOwner findViewTreeViewModelStoreOwner(n nVar, int i11) {
        return ViewTreeViewModelStoreOwner.get((View) ((s) nVar).j(AndroidCompositionLocals_androidKt.f1204f));
    }
}
