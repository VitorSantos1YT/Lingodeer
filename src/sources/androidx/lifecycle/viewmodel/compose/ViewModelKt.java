package androidx.lifecycle.viewmodel.compose;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import l1.n;

/* JADX INFO: loaded from: classes.dex */
public final class ViewModelKt {
    public static final <VM extends ViewModel> VM get(ViewModelStoreOwner viewModelStoreOwner, mz.c cVar, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        return (VM) ViewModelKt__ViewModelKt.get(viewModelStoreOwner, cVar, str, factory, creationExtras);
    }

    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, n nVar, int i11, int i12) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, factory, creationExtras, nVar, i11, i12);
    }

    @qy.c
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, n nVar, int i11, int i12) {
        return (VM) ViewModelKt__ViewModel_androidKt.viewModel(viewModelStoreOwner, str, factory, nVar, i11, i12);
    }

    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, fz.c cVar, n nVar, int i11, int i12) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, cVar, nVar, i11, i12);
    }

    public static final <VM extends ViewModel> VM viewModel(Class<VM> cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, n nVar, int i11, int i12) {
        return (VM) ViewModelKt__ViewModel_androidKt.viewModel(cls, viewModelStoreOwner, str, factory, creationExtras, nVar, i11, i12);
    }

    public static final <VM extends ViewModel> VM viewModel(mz.c cVar, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, n nVar, int i11, int i12) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(cVar, viewModelStoreOwner, str, factory, creationExtras, nVar, i11, i12);
    }
}
