package jh;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9.q f36359a = new n9.q(29, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f36360b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableLiveData f36361c;

    public j() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(new ArrayList());
        this.f36361c = mutableLiveData;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f36359a.f();
    }
}
