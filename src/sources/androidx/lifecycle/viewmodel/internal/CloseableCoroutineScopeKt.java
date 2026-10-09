package androidx.lifecycle.viewmodel.internal;

import kotlin.jvm.internal.m;
import qy.k;
import rz.b0;
import rz.e0;
import rz.o0;
import vy.i;
import vy.j;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CloseableCoroutineScopeKt {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope asCloseable(b0 b0Var) {
        m.f(b0Var, "<this>");
        return new CloseableCoroutineScope(b0Var);
    }

    public static final CloseableCoroutineScope createViewModelScope() {
        i iVar = j.f54321a;
        try {
            f fVar = o0.f50940a;
            iVar = wz.m.f55536a.f51961d;
        } catch (IllegalStateException | k unused) {
        }
        return new CloseableCoroutineScope(iVar.plus(e0.e()));
    }
}
