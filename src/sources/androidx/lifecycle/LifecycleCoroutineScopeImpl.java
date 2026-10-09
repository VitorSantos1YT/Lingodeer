package androidx.lifecycle;

import kotlin.jvm.internal.m;
import qy.b0;
import rz.e0;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final vy.i coroutineContext;
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends xy.i implements fz.e {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(vy.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // xy.a
        public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = LifecycleCoroutineScopeImpl.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            rz.b0 b0Var = (rz.b0) this.L$0;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().addObserver(LifecycleCoroutineScopeImpl.this);
            } else {
                e0.j(b0Var.getCoroutineContext(), null);
            }
            return b0.f48488a;
        }

        @Override // fz.e
        public final Object invoke(rz.b0 b0Var, vy.d<? super b0> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, vy.i coroutineContext) {
        m.f(lifecycle, "lifecycle");
        m.f(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() == Lifecycle.State.DESTROYED) {
            e0.j(getCoroutineContext(), null);
        }
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, rz.b0
    public vy.i getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        m.f(source, "source");
        m.f(event, "event");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            e0.j(getCoroutineContext(), null);
        }
    }

    public final void register() {
        yz.f fVar = o0.f50940a;
        e0.B(this, wz.m.f55536a.f51961d, null, new AnonymousClass1(null), 2);
    }
}
