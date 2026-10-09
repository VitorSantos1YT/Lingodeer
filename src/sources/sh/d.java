package sh;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import n9.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends ViewModel {
    public int K;
    public int L;
    public boolean M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f51694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MutableLiveData f51695c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51693a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f51696d = new q(29, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f51697e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f51698f = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f51699t = 90;
    public int H = 90;
    public final boolean N = true;

    public d() {
        c();
    }

    public final MutableLiveData a() {
        MutableLiveData mutableLiveData = this.f51695c;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        m.n("curWord");
        throw null;
    }

    public final List b() {
        List list = this.f51694b;
        if (list != null) {
            return list;
        }
        m.n("words");
        throw null;
    }

    public final void c() {
        this.f51698f.clear();
        this.L = 0;
        this.H = 90;
        this.f51699t = 90;
        this.f51693a = -1;
        this.K = 0;
        this.f51697e.set(false);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f51696d.f();
    }
}
