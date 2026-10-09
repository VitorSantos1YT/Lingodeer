package sh;

import androidx.lifecycle.ViewModel;
import com.lingo.fluent.object.WordOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import n9.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ViewModel {
    public WordOptions L;
    public List M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51684f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f51685t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51679a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f51680b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51681c = 60;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51682d = 60;
    public final boolean H = true;
    public final AtomicBoolean K = new AtomicBoolean(false);
    public final q N = new q(29, false);

    public b() {
        c();
    }

    public final WordOptions a() {
        WordOptions wordOptions = this.L;
        if (wordOptions != null) {
            return wordOptions;
        }
        m.n("curWordOptions");
        throw null;
    }

    public final List b() {
        List list = this.M;
        if (list != null) {
            return list;
        }
        m.n("words");
        throw null;
    }

    public final void c() {
        this.f51685t = false;
        this.f51684f = 0;
        this.f51683e = 0;
        this.f51681c = 60;
        this.f51682d = 60;
        this.f51680b.clear();
        this.f51679a = -1;
        this.K.set(false);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.N.f();
    }
}
