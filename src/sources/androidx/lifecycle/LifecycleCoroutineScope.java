package androidx.lifecycle;

import kotlin.jvm.internal.m;
import rz.b0;
import rz.e0;
import rz.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class LifecycleCoroutineScope implements b0 {

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.jvm.kt", l = {68}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends xy.i implements fz.e {
        final /* synthetic */ fz.e $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fz.e eVar, vy.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$block = eVar;
        }

        @Override // xy.a
        public final vy.d<qy.b0> create(Object obj, vy.d<?> dVar) {
            return LifecycleCoroutineScope.this.new AnonymousClass1(this.$block, dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                fz.e eVar = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenCreated(lifecycle$lifecycle_common, eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            return qy.b0.f48488a;
        }

        @Override // fz.e
        public final Object invoke(b0 b0Var, vy.d<? super qy.b0> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.jvm.kt", l = {108}, m = "invokeSuspend")
    public static final class C00431 extends xy.i implements fz.e {
        final /* synthetic */ fz.e $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00431(fz.e eVar, vy.d<? super C00431> dVar) {
            super(2, dVar);
            this.$block = eVar;
        }

        @Override // xy.a
        public final vy.d<qy.b0> create(Object obj, vy.d<?> dVar) {
            return LifecycleCoroutineScope.this.new C00431(this.$block, dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                fz.e eVar = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            return qy.b0.f48488a;
        }

        @Override // fz.e
        public final Object invoke(b0 b0Var, vy.d<? super qy.b0> dVar) {
            return ((C00431) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.jvm.kt", l = {88}, m = "invokeSuspend")
    public static final class C00441 extends xy.i implements fz.e {
        final /* synthetic */ fz.e $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00441(fz.e eVar, vy.d<? super C00441> dVar) {
            super(2, dVar);
            this.$block = eVar;
        }

        @Override // xy.a
        public final vy.d<qy.b0> create(Object obj, vy.d<?> dVar) {
            return LifecycleCoroutineScope.this.new C00441(this.$block, dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                fz.e eVar = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            return qy.b0.f48488a;
        }

        @Override // fz.e
        public final Object invoke(b0 b0Var, vy.d<? super qy.b0> dVar) {
            return ((C00441) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // rz.b0
    public abstract /* synthetic */ vy.i getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    @qy.c
    public final g1 launchWhenCreated(fz.e block) {
        m.f(block, "block");
        return e0.B(this, null, null, new AnonymousClass1(block, null), 3);
    }

    @qy.c
    public final g1 launchWhenResumed(fz.e block) {
        m.f(block, "block");
        return e0.B(this, null, null, new C00431(block, null), 3);
    }

    @qy.c
    public final g1 launchWhenStarted(fz.e block) {
        m.f(block, "block");
        return e0.B(this, null, null, new C00441(block, null), 3);
    }
}
