package rp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData f49333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv.c f49334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49335c;

    public b() {
        new MutableLiveData(Boolean.TRUE);
        this.f49333a = new MutableLiveData();
        this.f49334b = new fv.c();
        this.f49335c = -1;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        int i11 = this.f49335c;
        if (i11 != -1) {
            this.f49334b.a(i11);
        }
    }
}
