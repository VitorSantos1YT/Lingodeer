package app.rive;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import app.rive.core.CommandQueue;
import fz.a;
import fz.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l1.b1;
import l1.c0;
import l1.g;
import l1.i0;
import l1.j0;
import l1.s;
import l1.t;
import qy.b0;
import qy.o;
import rz.e0;
import vy.d;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RememberCommandQueueKt {
    public static final String COMMAND_QUEUE_TAG = "Rive/CQ";

    /* JADX INFO: renamed from: app.rive.RememberCommandQueueKt$rememberCommandQueueOrNull$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "app.rive.RememberCommandQueueKt$rememberCommandQueueOrNull$1", f = "rememberCommandQueue.kt", l = {91}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements fz.e {
        final /* synthetic */ CommandQueue $commandQueue;
        final /* synthetic */ LifecycleOwner $lifecycleOwner;
        int label;

        /* JADX INFO: renamed from: app.rive.RememberCommandQueueKt$rememberCommandQueueOrNull$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @e(c = "app.rive.RememberCommandQueueKt$rememberCommandQueueOrNull$1$1", f = "rememberCommandQueue.kt", l = {94}, m = "invokeSuspend")
        public static final class C00071 extends i implements fz.e {
            final /* synthetic */ CommandQueue $commandQueue;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: app.rive.RememberCommandQueueKt$rememberCommandQueueOrNull$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            public static final class C00081 extends n implements a {
                public static final C00081 INSTANCE = new C00081();

                public C00081() {
                    super(0);
                }

                @Override // fz.a
                public final String invoke() {
                    return "Starting command queue polling";
                }
            }

            /* JADX INFO: renamed from: app.rive.RememberCommandQueueKt$rememberCommandQueueOrNull$1$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            public static final class AnonymousClass2 extends n implements c {
                final /* synthetic */ CommandQueue $commandQueue;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(CommandQueue commandQueue) {
                    super(1);
                    this.$commandQueue = commandQueue;
                }

                @Override // fz.c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return b0.f48488a;
                }

                public final void invoke(long j11) {
                    this.$commandQueue.pollMessages();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00071(CommandQueue commandQueue, d<? super C00071> dVar) {
                super(2, dVar);
                this.$commandQueue = commandQueue;
            }

            @Override // xy.a
            public final d<b0> create(Object obj, d<?> dVar) {
                C00071 c00071 = new C00071(this.$commandQueue, dVar);
                c00071.L$0 = obj;
                return c00071;
            }

            @Override // xy.a
            public final Object invokeSuspend(Object obj) {
                rz.b0 b0Var;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    rz.b0 b0Var2 = (rz.b0) this.L$0;
                    RiveLog.INSTANCE.getLogger().d(RememberCommandQueueKt.COMMAND_QUEUE_TAG, C00081.INSTANCE);
                    b0Var = b0Var2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b0Var = (rz.b0) this.L$0;
                    com.bumptech.glide.e.F(obj);
                }
                while (e0.w(b0Var)) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$commandQueue);
                    this.L$0 = b0Var;
                    this.label = 1;
                    if (t.x(getContext()).p(anonymousClass2, this) == aVar) {
                        return aVar;
                    }
                }
                return b0.f48488a;
            }

            @Override // fz.e
            public final Object invoke(rz.b0 b0Var, d<? super b0> dVar) {
                return ((C00071) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommandQueue commandQueue, LifecycleOwner lifecycleOwner, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$commandQueue = commandQueue;
            this.$lifecycleOwner = lifecycleOwner;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$commandQueue, this.$lifecycleOwner, dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            b0 b0Var = b0.f48488a;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                if (this.$commandQueue == null) {
                    return b0Var;
                }
                Lifecycle lifecycle = this.$lifecycleOwner.getLifecycle();
                Lifecycle.State state = Lifecycle.State.RESUMED;
                C00071 c00071 = new C00071(this.$commandQueue, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c00071, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            return b0Var;
        }

        @Override // fz.e
        public final Object invoke(rz.b0 b0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RememberCommandQueueKt$rememberCommandQueueOrNull$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass2 extends n implements c {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandQueue commandQueue) {
            super(1);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.c
        public final i0 invoke(j0 DisposableEffect) {
            m.f(DisposableEffect, "$this$DisposableEffect");
            final CommandQueue commandQueue = this.$commandQueue;
            return commandQueue == null ? new i0() { // from class: app.rive.RememberCommandQueueKt$rememberCommandQueueOrNull$2$invoke$$inlined$onDispose$1
                @Override // l1.i0
                public void dispose() {
                }
            } : new i0() { // from class: app.rive.RememberCommandQueueKt$rememberCommandQueueOrNull$2$invoke$$inlined$onDispose$2
                @Override // l1.i0
                public void dispose() {
                    RiveLog.INSTANCE.getLogger().d(RememberCommandQueueKt.COMMAND_QUEUE_TAG, new RememberCommandQueueKt$rememberCommandQueueOrNull$2$2$1(commandQueue));
                    commandQueue.release();
                }
            };
        }
    }

    public static final CommandQueue rememberCommandQueue(l1.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.d0(-1751080185);
        sVar.d0(1494018971);
        Object objQ = sVar.Q();
        if (objQ == l1.m.f39353a) {
            objQ = t.B(null);
            sVar.o0(objQ);
        }
        b1 b1Var = (b1) objQ;
        sVar.p(false);
        CommandQueue commandQueueRememberCommandQueueOrNull = rememberCommandQueueOrNull(b1Var, sVar, 6, 0);
        if (commandQueueRememberCommandQueueOrNull != null) {
            sVar.p(false);
            return commandQueueRememberCommandQueueOrNull;
        }
        Throwable runtimeException = (Throwable) b1Var.getValue();
        if (runtimeException == null) {
            runtimeException = new RuntimeException("Failed to create CommandQueue");
        }
        throw new RuntimeException(runtimeException);
    }

    public static final CommandQueue rememberCommandQueueOrNull(b1 b1Var, l1.n nVar, int i11, int i12) {
        Object objL;
        s sVar = (s) nVar;
        sVar.d0(2056231014);
        if ((i12 & 1) != 0) {
            b1Var = t.B(null);
        }
        Object objQ = sVar.Q();
        g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            c0 c0Var = new c0(t.q(sVar));
            sVar.o0(c0Var);
            objQ = c0Var;
        }
        rz.b0 b0Var = ((c0) objQ).f39245a;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        sVar.d0(-592934169);
        boolean zF = sVar.f(b0Var);
        Object objQ2 = sVar.Q();
        if (zF || objQ2 == gVar) {
            try {
                objL = new CommandQueue(b0Var);
                RiveLog.INSTANCE.getLogger().d(COMMAND_QUEUE_TAG, RememberCommandQueueKt$rememberCommandQueueOrNull$commandQueue$1$1$1$1.INSTANCE);
            } catch (Throwable th2) {
                objL = com.bumptech.glide.e.l(th2);
            }
            Throwable thA = o.a(objL);
            if (thA != null) {
                if (b1Var.getValue() == null) {
                    b1Var.setValue(thA);
                }
                RiveLog.INSTANCE.getLogger().e(COMMAND_QUEUE_TAG, null, new RememberCommandQueueKt$rememberCommandQueueOrNull$commandQueue$1$2$1(thA));
            }
            if (objL instanceof qy.n) {
                objL = null;
            }
            objQ2 = (CommandQueue) objL;
            sVar.o0(objQ2);
        }
        CommandQueue commandQueue = (CommandQueue) objQ2;
        sVar.p(false);
        t.g(lifecycleOwner, commandQueue, new AnonymousClass1(commandQueue, lifecycleOwner, null), sVar);
        t.c(commandQueue, new AnonymousClass2(commandQueue), sVar);
        sVar.p(false);
        return commandQueue;
    }
}
