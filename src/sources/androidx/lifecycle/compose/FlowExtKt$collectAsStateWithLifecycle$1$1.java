package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import l1.s1;
import l1.u1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@xy.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend")
public final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends xy.i implements fz.e {
    final /* synthetic */ vy.i $context;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ uz.i $this_collectAsStateWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends xy.i implements fz.e {
        final /* synthetic */ s1 $$this$produceState;
        final /* synthetic */ vy.i $context;
        final /* synthetic */ uz.i $this_collectAsStateWithLifecycle;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @xy.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {182}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends xy.i implements fz.e {
            final /* synthetic */ s1 $$this$produceState;
            final /* synthetic */ uz.i $this_collectAsStateWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(uz.i iVar, s1 s1Var, vy.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$this_collectAsStateWithLifecycle = iVar;
                this.$$this$produceState = s1Var;
            }

            @Override // xy.a
            public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
                return new AnonymousClass2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, dVar);
            }

            @Override // xy.a
            public final Object invokeSuspend(Object obj) {
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.i iVar = this.$this_collectAsStateWithLifecycle;
                    final s1 s1Var = this.$$this$produceState;
                    uz.j jVar = new uz.j() { // from class: androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle.1.1.1.2.1
                        @Override // uz.j
                        public final Object emit(T t6, vy.d<? super b0> dVar) {
                            ((u1) s1Var).setValue(t6);
                            return b0.f48488a;
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
                return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(vy.i iVar, uz.i iVar2, s1 s1Var, vy.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$context = iVar;
            this.$this_collectAsStateWithLifecycle = iVar2;
            this.$$this$produceState = s1Var;
        }

        @Override // xy.a
        public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
            return new AnonymousClass1(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r7.collect(r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (rz.e0.M(r7, r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            return r0;
         */
        @Override // xy.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                wy.a r0 = wy.a.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L15:
                com.bumptech.glide.e.F(r7)
                goto L4d
            L19:
                com.bumptech.glide.e.F(r7)
                vy.i r7 = r6.$context
                vy.j r1 = vy.j.f54321a
                boolean r7 = kotlin.jvm.internal.m.a(r7, r1)
                if (r7 == 0) goto L38
                uz.i r7 = r6.$this_collectAsStateWithLifecycle
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1
                l1.s1 r2 = r6.$$this$produceState
                r1.<init>()
                r6.label = r3
                java.lang.Object r7 = r7.collect(r1, r6)
                if (r7 != r0) goto L4d
                goto L4c
            L38:
                vy.i r7 = r6.$context
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2
                uz.i r3 = r6.$this_collectAsStateWithLifecycle
                l1.s1 r4 = r6.$$this$produceState
                r5 = 0
                r1.<init>(r3, r4, r5)
                r6.label = r2
                java.lang.Object r7 = rz.e0.M(r7, r1, r6)
                if (r7 != r0) goto L4d
            L4c:
                return r0
            L4d:
                qy.b0 r7 = qy.b0.f48488a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // fz.e
        public final Object invoke(rz.b0 b0Var, vy.d<? super b0> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectAsStateWithLifecycle$1$1(Lifecycle lifecycle, Lifecycle.State state, vy.i iVar, uz.i iVar2, vy.d<? super FlowExtKt$collectAsStateWithLifecycle$1$1> dVar) {
        super(2, dVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$context = iVar;
        this.$this_collectAsStateWithLifecycle = iVar2;
    }

    @Override // xy.a
    public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, dVar);
        flowExtKt$collectAsStateWithLifecycle$1$1.L$0 = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            s1 s1Var = (s1) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$this_collectAsStateWithLifecycle, s1Var, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == aVar) {
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
    public final Object invoke(s1 s1Var, vy.d<? super b0> dVar) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1) create(s1Var, dVar)).invokeSuspend(b0.f48488a);
    }
}
