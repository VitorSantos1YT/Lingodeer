package gp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.h1 f29349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9.q f29350b = new n9.q(29, false);

    public c(vt.h1 h1Var) {
        this.f29349a = h1Var;
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Boolean.TRUE);
        Transformations.switchMap(mutableLiveData, new com.google.firebase.datastorage.a(this, 27));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f29350b.f();
    }
}
