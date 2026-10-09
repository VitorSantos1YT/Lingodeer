package gi;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import n9.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f29267a = new q(29, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableLiveData f29268b = new MutableLiveData();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f29267a.f();
    }
}
