package androidx.lifecycle.viewmodel.compose;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.j;
import l1.d0;
import l1.n;
import l1.s;
import l1.v1;
import l1.w1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LocalViewModelStoreOwner {
    public static final int $stable = 0;
    public static final LocalViewModelStoreOwner INSTANCE = new LocalViewModelStoreOwner();
    private static final v1 LocalViewModelStoreOwner = new d0(new j(2));

    private LocalViewModelStoreOwner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelStoreOwner LocalViewModelStoreOwner$lambda$0() {
        return null;
    }

    public final ViewModelStoreOwner getCurrent(n nVar, int i11) {
        s sVar = (s) nVar;
        ViewModelStoreOwner viewModelStoreOwnerFindViewTreeViewModelStoreOwner = (ViewModelStoreOwner) sVar.j(LocalViewModelStoreOwner);
        if (viewModelStoreOwnerFindViewTreeViewModelStoreOwner == null) {
            sVar.d0(1260197609);
            viewModelStoreOwnerFindViewTreeViewModelStoreOwner = LocalViewModelStoreOwner_androidKt.findViewTreeViewModelStoreOwner(sVar, 0);
        } else {
            sVar.d0(1260196493);
        }
        sVar.p(false);
        return viewModelStoreOwnerFindViewTreeViewModelStoreOwner;
    }

    public final w1 provides(ViewModelStoreOwner viewModelStoreOwner) {
        return LocalViewModelStoreOwner.a(viewModelStoreOwner);
    }
}
