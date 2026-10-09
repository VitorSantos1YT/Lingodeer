package androidx.lifecycle;

import kotlin.jvm.internal.m;
import qy.b0;
import rz.e0;
import rz.o0;
import rz.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class EmittedSource implements q0 {
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$dispose$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends xy.i implements fz.e {
        int label;

        public AnonymousClass1(vy.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // xy.a
        public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
            return EmittedSource.this.new AnonymousClass1(dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            EmittedSource.this.removeSource();
            return b0.f48488a;
        }

        @Override // fz.e
        public final Object invoke(rz.b0 b0Var, vy.d<? super b0> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$disposeNow$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.EmittedSource$disposeNow$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends xy.i implements fz.e {
        int label;

        public AnonymousClass2(vy.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // xy.a
        public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
            return EmittedSource.this.new AnonymousClass2(dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            EmittedSource.this.removeSource();
            return b0.f48488a;
        }

        @Override // fz.e
        public final Object invoke(rz.b0 b0Var, vy.d<? super b0> dVar) {
            return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    public EmittedSource(LiveData<?> source, MediatorLiveData<?> mediator) {
        m.f(source, "source");
        m.f(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSource() {
        if (this.disposed) {
            return;
        }
        this.mediator.removeSource(this.source);
        this.disposed = true;
    }

    @Override // rz.q0
    public void dispose() {
        yz.f fVar = o0.f50940a;
        e0.B(e0.c(wz.m.f55536a.f51961d), null, null, new AnonymousClass1(null), 3);
    }

    public final Object disposeNow(vy.d<? super b0> dVar) {
        yz.f fVar = o0.f50940a;
        Object objM = e0.M(wz.m.f55536a.f51961d, new AnonymousClass2(null), dVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : b0.f48488a;
    }
}
