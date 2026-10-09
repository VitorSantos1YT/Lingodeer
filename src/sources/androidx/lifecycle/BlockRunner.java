package androidx.lifecycle;

import com.lingodeer.data.model.AchievementLevelType;
import kotlin.jvm.internal.m;
import rz.b0;
import rz.e0;
import rz.g1;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class BlockRunner<T> {
    private final fz.e block;
    private g1 cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final fz.a onDone;
    private g1 runningJob;
    private final b0 scope;
    private final long timeoutInMs;

    /* JADX INFO: renamed from: androidx.lifecycle.BlockRunner$cancel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {AchievementLevelType.DAY_STREAK_LV_8}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends xy.i implements fz.e {
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BlockRunner<T> blockRunner, vy.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = blockRunner;
        }

        @Override // xy.a
        public final vy.d<qy.b0> create(Object obj, vy.d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                long j11 = ((BlockRunner) this.this$0).timeoutInMs;
                this.label = 1;
                if (e0.m(j11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            if (!((BlockRunner) this.this$0).liveData.hasActiveObservers()) {
                g1 g1Var = ((BlockRunner) this.this$0).runningJob;
                if (g1Var != null) {
                    g1Var.cancel(null);
                }
                ((BlockRunner) this.this$0).runningJob = null;
            }
            return qy.b0.f48488a;
        }

        @Override // fz.e
        public final Object invoke(b0 b0Var, vy.d<? super qy.b0> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.BlockRunner$maybeRun$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {168}, m = "invokeSuspend")
    public static final class C00411 extends xy.i implements fz.e {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00411(BlockRunner<T> blockRunner, vy.d<? super C00411> dVar) {
            super(2, dVar);
            this.this$0 = blockRunner;
        }

        @Override // xy.a
        public final vy.d<qy.b0> create(Object obj, vy.d<?> dVar) {
            C00411 c00411 = new C00411(this.this$0, dVar);
            c00411.L$0 = obj;
            return c00411;
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(((BlockRunner) this.this$0).liveData, ((b0) this.L$0).getCoroutineContext());
                fz.e eVar = ((BlockRunner) this.this$0).block;
                this.label = 1;
                if (eVar.invoke(liveDataScopeImpl, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            ((BlockRunner) this.this$0).onDone.invoke();
            return qy.b0.f48488a;
        }

        @Override // fz.e
        public final Object invoke(b0 b0Var, vy.d<? super qy.b0> dVar) {
            return ((C00411) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    public BlockRunner(CoroutineLiveData<T> liveData, fz.e block, long j11, b0 scope, fz.a onDone) {
        m.f(liveData, "liveData");
        m.f(block, "block");
        m.f(scope, "scope");
        m.f(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j11;
        this.scope = scope;
        this.onDone = onDone;
    }

    public final void cancel() {
        if (this.cancellationJob != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        b0 b0Var = this.scope;
        yz.f fVar = o0.f50940a;
        this.cancellationJob = e0.B(b0Var, wz.m.f55536a.f51961d, null, new AnonymousClass1(this, null), 2);
    }

    public final void maybeRun() {
        g1 g1Var = this.cancellationJob;
        if (g1Var != null) {
            g1Var.cancel(null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        this.runningJob = e0.B(this.scope, null, null, new C00411(this, null), 3);
    }
}
