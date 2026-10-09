package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import l1.b3;
import l1.n;
import l1.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleExtKt {
    public static final b3 currentStateAsState(Lifecycle lifecycle, n nVar, int i11) {
        return t.o(lifecycle.getCurrentStateFlow(), nVar);
    }
}
