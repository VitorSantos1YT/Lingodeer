package androidx.lifecycle.viewmodel.compose;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.m;
import l1.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ViewModelKt__ViewModel_androidKt {
    @qy.c
    public static final <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, n nVar, int i11, int i12) {
        if ((i12 & 1) != 0 && LocalViewModelStoreOwner.INSTANCE.getCurrent(nVar, 6) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        m.m();
        throw null;
    }

    @qy.c
    public static final /* synthetic */ ViewModel viewModel(Class cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, n nVar, int i11, int i12) {
        if ((i12 & 2) == 0 || (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(nVar, 6)) != null) {
            return ViewModelKt__ViewModelKt.get$default(viewModelStoreOwner, qx.b.r(cls), (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : factory, null, 8, null);
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }

    public static final <VM extends ViewModel> VM viewModel(Class<VM> cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, n nVar, int i11, int i12) {
        if ((i12 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(nVar, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i12 & 4) != 0) {
            str = null;
        }
        if ((i12 & 8) != 0) {
            factory = null;
        }
        if ((i12 & 16) != 0) {
            if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
        }
        return (VM) ViewModelKt.get(viewModelStoreOwner, qx.b.r(cls), str, factory, creationExtras);
    }
}
