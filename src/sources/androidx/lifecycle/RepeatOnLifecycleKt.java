package androidx.lifecycle;

import kotlin.jvm.internal.y;
import rz.b0;
import rz.e0;
import rz.g1;
import rz.m;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RepeatOnLifecycleKt {

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends xy.i implements fz.e {
        final /* synthetic */ fz.e $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @xy.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends xy.i implements fz.e {
            final /* synthetic */ b0 $$this$coroutineScope;
            final /* synthetic */ fz.e $block;
            final /* synthetic */ Lifecycle.State $state;
            final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, b0 b0Var, fz.e eVar, vy.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = b0Var;
                this.$block = eVar;
            }

            @Override // xy.a
            public final vy.d<qy.b0> create(Object obj, vy.d<?> dVar) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0097  */
            /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
            /* JADX WARN: Code duplicated, block: B:31:0x00af  */
            /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:40:? A[SYNTHETIC] */
            @Override // xy.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                y yVar;
                Throwable th2;
                y yVar2;
                g1 g1Var;
                LifecycleEventObserver lifecycleEventObserver;
                g1 g1Var2;
                LifecycleEventObserver lifecycleEventObserver2;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (this.$this_repeatOnLifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                        final y yVar3 = new y();
                        yVar = new y();
                        try {
                            Lifecycle.State state = this.$state;
                            Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                            final b0 b0Var2 = this.$$this$coroutineScope;
                            final fz.e eVar = this.$block;
                            this.L$0 = yVar3;
                            this.L$1 = yVar;
                            this.L$2 = state;
                            this.L$3 = lifecycle;
                            this.L$4 = b0Var2;
                            this.L$5 = eVar;
                            this.label = 1;
                            final m mVar = new m(1, ue.f.x(this));
                            mVar.s();
                            Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
                            final Lifecycle.Event eventUpTo = companion.upTo(state);
                            final Lifecycle.Event eventDownFrom = companion.downFrom(state);
                            final a00.e eVar2 = new a00.e();
                            LifecycleEventObserver lifecycleEventObserver3 = new LifecycleEventObserver() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                                /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
                                @xy.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {165, 110}, m = "invokeSuspend")
                                public static final class AnonymousClass1 extends xy.i implements fz.e {
                                    final /* synthetic */ fz.e $block;
                                    final /* synthetic */ a00.a $mutex;
                                    Object L$0;
                                    Object L$1;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(a00.a aVar, fz.e eVar, vy.d<? super AnonymousClass1> dVar) {
                                        super(2, dVar);
                                        this.$mutex = aVar;
                                        this.$block = eVar;
                                    }

                                    @Override // xy.a
                                    public final vy.d<qy.b0> create(Object obj, vy.d<?> dVar) {
                                        return new AnonymousClass1(this.$mutex, this.$block, dVar);
                                    }

                                    @Override // xy.a
                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                        a00.a aVar;
                                        fz.e eVar;
                                        a00.a aVar2;
                                        Throwable th2;
                                        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                                        int i11 = this.label;
                                        try {
                                            if (i11 == 0) {
                                                com.bumptech.glide.e.F(obj);
                                                aVar = this.$mutex;
                                                eVar = this.$block;
                                                this.L$0 = aVar;
                                                this.L$1 = eVar;
                                                this.label = 1;
                                                if (aVar.b(this) != aVar3) {
                                                }
                                                return aVar3;
                                            }
                                            if (i11 != 1) {
                                                if (i11 != 2) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                aVar2 = (a00.a) this.L$0;
                                                try {
                                                    com.bumptech.glide.e.F(obj);
                                                    aVar2.a(null);
                                                    return qy.b0.f48488a;
                                                } catch (Throwable th3) {
                                                    th2 = th3;
                                                    aVar2.a(null);
                                                    throw th2;
                                                }
                                            }
                                            eVar = (fz.e) this.L$1;
                                            a00.a aVar4 = (a00.a) this.L$0;
                                            com.bumptech.glide.e.F(obj);
                                            aVar = aVar4;
                                            RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(eVar, null);
                                            this.L$0 = aVar;
                                            this.L$1 = null;
                                            this.label = 2;
                                            if (e0.l(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != aVar3) {
                                                aVar2 = aVar;
                                                aVar2.a(null);
                                                return qy.b0.f48488a;
                                            }
                                            return aVar3;
                                        } catch (Throwable th4) {
                                            aVar2 = aVar;
                                            th2 = th4;
                                            aVar2.a(null);
                                            throw th2;
                                        }
                                    }

                                    @Override // fz.e
                                    public final Object invoke(b0 b0Var, vy.d<? super qy.b0> dVar) {
                                        return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
                                    }
                                }

                                @Override // androidx.lifecycle.LifecycleEventObserver
                                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                    kotlin.jvm.internal.m.f(lifecycleOwner, "<unused var>");
                                    kotlin.jvm.internal.m.f(event, "event");
                                    if (event == eventUpTo) {
                                        yVar3.f38361a = e0.B(b0Var2, null, null, new AnonymousClass1(eVar2, eVar, null), 3);
                                        return;
                                    }
                                    if (event == eventDownFrom) {
                                        g1 g1Var3 = (g1) yVar3.f38361a;
                                        if (g1Var3 != null) {
                                            g1Var3.cancel(null);
                                        }
                                        yVar3.f38361a = null;
                                    }
                                    if (event == Lifecycle.Event.ON_DESTROY) {
                                        mVar.resumeWith(qy.b0.f48488a);
                                    }
                                }
                            };
                            yVar.f38361a = lifecycleEventObserver3;
                            lifecycle.addObserver(lifecycleEventObserver3);
                            if (mVar.r() == aVar) {
                                return aVar;
                            }
                            yVar2 = yVar3;
                            g1Var2 = (g1) yVar2.f38361a;
                            if (g1Var2 != null) {
                                g1Var2.cancel(null);
                            }
                            lifecycleEventObserver2 = (LifecycleEventObserver) yVar.f38361a;
                            if (lifecycleEventObserver2 != null) {
                                this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver2);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            yVar2 = yVar3;
                            g1Var = (g1) yVar2.f38361a;
                            if (g1Var != null) {
                                g1Var.cancel(null);
                            }
                            lifecycleEventObserver = (LifecycleEventObserver) yVar.f38361a;
                            if (lifecycleEventObserver != null) {
                                throw th2;
                            }
                            this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver);
                            throw th2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = (y) this.L$1;
                    yVar2 = (y) this.L$0;
                    try {
                        com.bumptech.glide.e.F(obj);
                        g1Var2 = (g1) yVar2.f38361a;
                        if (g1Var2 != null) {
                            g1Var2.cancel(null);
                        }
                        lifecycleEventObserver2 = (LifecycleEventObserver) yVar.f38361a;
                        if (lifecycleEventObserver2 != null) {
                            this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver2);
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        g1Var = (g1) yVar2.f38361a;
                        if (g1Var != null) {
                            g1Var.cancel(null);
                        }
                        lifecycleEventObserver = (LifecycleEventObserver) yVar.f38361a;
                        if (lifecycleEventObserver != null) {
                            throw th2;
                        }
                        this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver);
                        throw th2;
                    }
                }
                return b0Var;
            }

            @Override // fz.e
            public final Object invoke(b0 b0Var, vy.d<? super qy.b0> dVar) {
                return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Lifecycle lifecycle, Lifecycle.State state, fz.e eVar, vy.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = eVar;
        }

        @Override // xy.a
        public final vy.d<qy.b0> create(Object obj, vy.d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_repeatOnLifecycle, this.$state, this.$block, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                b0 b0Var = (b0) this.L$0;
                yz.f fVar = o0.f50940a;
                sz.c cVar = wz.m.f55536a.f51961d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, b0Var, this.$block, null);
                this.label = 1;
                if (e0.M(cVar, anonymousClass1, this) == aVar) {
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
            return ((AnonymousClass3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, fz.e eVar, vy.d<? super qy.b0> dVar) {
        Object objL;
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        Lifecycle.State currentState = lifecycle.getCurrentState();
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        qy.b0 b0Var = qy.b0.f48488a;
        return (currentState != state2 && (objL = e0.l(new AnonymousClass3(lifecycle, state, eVar, null), dVar)) == wy.a.COROUTINE_SUSPENDED) ? objL : b0Var;
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, fz.e eVar, vy.d<? super qy.b0> dVar) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, eVar, dVar);
        return objRepeatOnLifecycle == wy.a.COROUTINE_SUSPENDED ? objRepeatOnLifecycle : qy.b0.f48488a;
    }
}
