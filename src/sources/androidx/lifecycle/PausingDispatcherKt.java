package androidx.lifecycle;

import qy.b0;
import rz.e0;
import rz.g1;
import rz.o0;
import rz.z;
import wz.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcherKt {

    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {213}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends xy.i implements fz.e {
        final /* synthetic */ fz.e $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Lifecycle lifecycle, Lifecycle.State state, fz.e eVar, vy.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = eVar;
        }

        @Override // xy.a
        public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_whenStateAtLeast, this.$minState, this.$block, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    com.bumptech.glide.e.F(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController.finish();
                    throw th;
                }
            }
            com.bumptech.glide.e.F(obj);
            g1 g1Var = (g1) ((rz.b0) this.L$0).getCoroutineContext().get(z.f50978b);
            if (g1Var == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, g1Var);
            try {
                fz.e eVar = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = e0.M(pausingDispatcher, eVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                return obj;
            } catch (Throwable th3) {
                th = th3;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        }

        @Override // fz.e
        public final Object invoke(rz.b0 b0Var, vy.d<? super T> dVar) {
            return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    @qy.c
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, fz.e eVar, vy.d<? super T> dVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), eVar, dVar);
    }

    @qy.c
    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, fz.e eVar, vy.d<? super T> dVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), eVar, dVar);
    }

    @qy.c
    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, fz.e eVar, vy.d<? super T> dVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), eVar, dVar);
    }

    @qy.c
    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, fz.e eVar, vy.d<? super T> dVar) {
        yz.f fVar = o0.f50940a;
        return e0.M(m.f55536a.f51961d, new AnonymousClass2(lifecycle, state, eVar, null), dVar);
    }

    @qy.c
    public static final <T> Object whenCreated(Lifecycle lifecycle, fz.e eVar, vy.d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, eVar, dVar);
    }

    @qy.c
    public static final <T> Object whenResumed(Lifecycle lifecycle, fz.e eVar, vy.d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, eVar, dVar);
    }

    @qy.c
    public static final <T> Object whenStarted(Lifecycle lifecycle, fz.e eVar, vy.d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, eVar, dVar);
    }
}
