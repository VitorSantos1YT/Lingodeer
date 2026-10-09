package ip;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import ay.x;
import bp.g4;
import fv.c;
import ky.e;
import n9.q;
import th.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f34547a = new q(29, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f34548b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34549c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableLiveData f34550d = new MutableLiveData();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableLiveData f34551e = new MutableLiveData();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableLiveData f34552f = new MutableLiveData();

    public final void a(Context context) {
        j.a(new x(new g4(context, this)).k(e.f38937b).g(px.b.a()).h(new dm.a(this, 18), vx.b.f54316e), this.f34547a);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f34547a.f();
        this.f34548b.a(this.f34549c);
    }
}
