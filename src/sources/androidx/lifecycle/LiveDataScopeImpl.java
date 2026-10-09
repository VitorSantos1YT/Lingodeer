package androidx.lifecycle;

import kotlin.jvm.internal.m;
import qy.b0;
import rz.e0;
import rz.o0;
import rz.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final vy.i coroutineContext;
    private CoroutineLiveData<T> target;

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {98}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends xy.i implements fz.e {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LiveDataScopeImpl<T> liveDataScopeImpl, T t6, vy.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = liveDataScopeImpl;
            this.$value = t6;
        }

        @Override // xy.a
        public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
            return new AnonymousClass2(this.this$0, this.$value, dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
                this.label = 1;
                if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            this.this$0.getTarget$lifecycle_livedata_release().setValue(this.$value);
            return b0.f48488a;
        }

        @Override // fz.e
        public final Object invoke(rz.b0 b0Var, vy.d<? super b0> dVar) {
            return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emitSource$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", l = {92}, m = "invokeSuspend")
    public static final class C00452 extends xy.i implements fz.e {
        final /* synthetic */ LiveData<T> $source;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00452(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, vy.d<? super C00452> dVar) {
            super(2, dVar);
            this.this$0 = liveDataScopeImpl;
            this.$source = liveData;
        }

        @Override // xy.a
        public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
            return new C00452(this.this$0, this.$source, dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return obj;
            }
            com.bumptech.glide.e.F(obj);
            CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
            LiveData<T> liveData = this.$source;
            this.label = 1;
            Object objEmitSource$lifecycle_livedata_release = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(liveData, this);
            return objEmitSource$lifecycle_livedata_release == aVar ? aVar : objEmitSource$lifecycle_livedata_release;
        }

        @Override // fz.e
        public final Object invoke(rz.b0 b0Var, vy.d<? super q0> dVar) {
            return ((C00452) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    public LiveDataScopeImpl(CoroutineLiveData<T> target, vy.i context) {
        m.f(target, "target");
        m.f(context, "context");
        this.target = target;
        yz.f fVar = o0.f50940a;
        this.coroutineContext = context.plus(wz.m.f55536a.f51961d);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emit(T t6, vy.d<? super b0> dVar) {
        Object objM = e0.M(this.coroutineContext, new AnonymousClass2(this, t6, null), dVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : b0.f48488a;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, vy.d<? super q0> dVar) {
        return e0.M(this.coroutineContext, new C00452(this, liveData, null), dVar);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(CoroutineLiveData<T> coroutineLiveData) {
        m.f(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
