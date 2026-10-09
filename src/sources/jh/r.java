package jh;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import ay.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MutableLiveData f36381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MutableLiveData f36382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9.q f36383c = new n9.q(29, false);

    public final MutableLiveData a(boolean z11) {
        if (this.f36381a == null) {
            this.f36381a = new MutableLiveData();
        }
        th.j.a(new x(new gh.b(z11, 2)).k(ky.e.f38937b).g(px.b.a()).h(new a5.f(this, 16), vx.b.f54316e), this.f36383c);
        MutableLiveData mutableLiveData = this.f36381a;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        kotlin.jvm.internal.m.n("allVocabularyList");
        throw null;
    }

    public final MutableLiveData b() {
        if (this.f36382b == null) {
            this.f36382b = new MutableLiveData();
        }
        th.j.a(new x(new bp.g(6)).k(ky.e.f38937b).g(px.b.a()).h(new a5.j(this, 22), vx.b.f54316e), this.f36383c);
        MutableLiveData mutableLiveData = this.f36382b;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        kotlin.jvm.internal.m.n("favVocabularyList");
        throw null;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f36383c.f();
    }
}
