package androidx.lifecycle;

import kotlin.jvm.internal.m;
import rz.b2;
import rz.e0;
import rz.o0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        m.f(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            b2 b2VarE = e0.e();
            yz.f fVar = o0.f50940a;
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, ew.a.w(b2VarE, wz.m.f55536a.f51961d));
        } while (!lifecycle.getInternalScopeRef().compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    public static final uz.i getEventFlow(Lifecycle lifecycle) {
        m.f(lifecycle, "<this>");
        uz.c cVarG = x0.g(new LifecycleKt$eventFlow$1(lifecycle, null));
        yz.f fVar = o0.f50940a;
        return x0.w(cVarG, wz.m.f55536a.f51961d);
    }
}
