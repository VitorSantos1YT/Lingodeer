package androidx.lifecycle;

import kotlin.jvm.internal.m;
import qy.b0;
import tz.s;
import tz.t;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowExtKt {

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {90}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends xy.i implements fz.e {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ uz.i $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @xy.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {90}, m = "invokeSuspend")
        public static final class C00001 extends xy.i implements fz.e {
            final /* synthetic */ t $$this$callbackFlow;
            final /* synthetic */ uz.i $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00001(uz.i iVar, t tVar, vy.d<? super C00001> dVar) {
                super(2, dVar);
                this.$this_flowWithLifecycle = iVar;
                this.$$this$callbackFlow = tVar;
            }

            @Override // xy.a
            public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
                return new C00001(this.$this_flowWithLifecycle, this.$$this$callbackFlow, dVar);
            }

            @Override // xy.a
            public final Object invokeSuspend(Object obj) {
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.i iVar = this.$this_flowWithLifecycle;
                    final t tVar = this.$$this$callbackFlow;
                    uz.j jVar = new uz.j() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // uz.j
                        public final Object emit(T t6, vy.d<? super b0> dVar) {
                            Object objF = ((s) tVar).f52713d.f(t6, dVar);
                            return objF == wy.a.COROUTINE_SUSPENDED ? objF : b0.f48488a;
                        }
                    };
                    this.label = 1;
                    if (iVar.collect(jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            }

            @Override // fz.e
            public final Object invoke(rz.b0 b0Var, vy.d<? super b0> dVar) {
                return ((C00001) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, uz.i iVar, vy.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = iVar;
        }

        @Override // xy.a
        public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                t tVar2 = (t) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                C00001 c00001 = new C00001(this.$this_flowWithLifecycle, tVar2, null);
                this.L$0 = tVar2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c00001, this) == aVar) {
                    return aVar;
                }
                tVar = tVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (t) this.L$0;
                com.bumptech.glide.e.F(obj);
            }
            ((s) tVar).a0(null);
            return b0.f48488a;
        }

        @Override // fz.e
        public final Object invoke(t tVar, vy.d<? super b0> dVar) {
            return ((AnonymousClass1) create(tVar, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    public static final <T> uz.i flowWithLifecycle(uz.i iVar, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        m.f(iVar, "<this>");
        m.f(lifecycle, "lifecycle");
        m.f(minActiveState, "minActiveState");
        return x0.g(new AnonymousClass1(lifecycle, minActiveState, iVar, null));
    }

    public static /* synthetic */ uz.i flowWithLifecycle$default(uz.i iVar, Lifecycle lifecycle, Lifecycle.State state, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(iVar, lifecycle, state);
    }
}
