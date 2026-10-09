package app.rive;

import aj.uZCn.evRpcb;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import app.rive.core.ArtboardHandle;
import app.rive.core.CommandQueue;
import app.rive.core.RebuggerWrapperKt;
import app.rive.core.RiveSurface;
import app.rive.core.StateMachineHandle;
import app.rive.core.ViewModelInstanceHandle;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Fit;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import fz.a;
import fz.c;
import fz.e;
import g2.f0;
import g2.x;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l1.a1;
import l1.b1;
import l1.g;
import l1.h1;
import l1.i0;
import l1.j0;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import qy.l;
import rz.d0;
import rz.e0;
import rz.h0;
import s2.b;
import s2.g0;
import s2.m0;
import s2.w;
import uz.j;
import uz.s0;
import vy.d;
import xy.h;
import xy.i;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveUIKt {
    public static final String DRAW_TAG = "RiveUI/Draw";
    public static final String GENERAL_TAG = "RiveUI";
    public static final String STATE_MACHINE_TAG = "RiveUI/SM";
    public static final String SURFACE_TAG = "RiveUI/Surface";
    public static final String VM_INSTANCE_TAG = "RiveUI/VMI";

    /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass1 extends n implements a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // fz.a
        public final String invoke() {
            return "RiveUI Recomposing";
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass10 extends n implements e {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Alignment $alignment;
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ int $clearColor;
        final /* synthetic */ RiveFile $file;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ r $modifier;
        final /* synthetic */ String $stateMachineName;
        final /* synthetic */ ViewModelInstance $viewModelInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(RiveFile riveFile, r rVar, Artboard artboard, String str, ViewModelInstance viewModelInstance, Fit fit, Alignment alignment, int i11, int i12, int i13) {
            super(2);
            this.$file = riveFile;
            this.$modifier = rVar;
            this.$artboard = artboard;
            this.$stateMachineName = str;
            this.$viewModelInstance = viewModelInstance;
            this.$fit = fit;
            this.$alignment = alignment;
            this.$clearColor = i11;
            this.$$changed = i12;
            this.$$default = i13;
        }

        @Override // fz.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((l1.n) obj, ((Number) obj2).intValue());
            return b0.f48488a;
        }

        public final void invoke(l1.n nVar, int i11) {
            RiveUIKt.RiveUI(this.$file, this.$modifier, this.$artboard, this.$stateMachineName, this.$viewModelInstance, this.$fit, this.$alignment, this.$clearColor, nVar, t.M(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass2 extends n implements c {
        final /* synthetic */ long $artboardHandle;
        final /* synthetic */ CommandQueue $commandQueue;
        final /* synthetic */ RiveFile $file;
        final /* synthetic */ long $stateMachineHandle;
        final /* synthetic */ String $stateMachineName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandQueue commandQueue, long j11, String str, long j12, RiveFile riveFile) {
            super(1);
            this.$commandQueue = commandQueue;
            this.$stateMachineHandle = j11;
            this.$stateMachineName = str;
            this.$artboardHandle = j12;
            this.$file = riveFile;
        }

        @Override // fz.c
        public final i0 invoke(j0 DisposableEffect) {
            m.f(DisposableEffect, "$this$DisposableEffect");
            final CommandQueue commandQueue = this.$commandQueue;
            final long j11 = this.$stateMachineHandle;
            final String str = this.$stateMachineName;
            final long j12 = this.$artboardHandle;
            final RiveFile riveFile = this.$file;
            return new i0() { // from class: app.rive.RiveUIKt$RiveUI$2$invoke$$inlined$onDispose$1
                @Override // l1.i0
                public void dispose() {
                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.STATE_MACHINE_TAG, new RiveUIKt$RiveUI$2$1$1(j11, str, j12, riveFile));
                    commandQueue.m120deleteStateMachineAkTCgDQ(j11);
                }
            };
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "app.rive.RiveUIKt$RiveUI$3", f = "RiveUI.kt", l = {197}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements e {
        final /* synthetic */ CommandQueue $commandQueue;
        final /* synthetic */ b1 $isSettled$delegate;
        final /* synthetic */ long $stateMachineHandle;
        final /* synthetic */ ViewModelInstance $viewModelInstance;
        int label;

        /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnonymousClass1 extends n implements a {
            final /* synthetic */ long $stateMachineHandle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(long j11) {
                super(0);
                this.$stateMachineHandle = j11;
            }

            @Override // fz.a
            public final String invoke() {
                return "No view model instance to bind for " + ((Object) StateMachineHandle.m191toStringimpl(this.$stateMachineHandle));
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$3$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnonymousClass2 extends n implements a {
            final /* synthetic */ ViewModelInstance $viewModelInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ViewModelInstance viewModelInstance) {
                super(0);
                this.$viewModelInstance = viewModelInstance;
            }

            @Override // fz.a
            public final String invoke() {
                return "Binding view model instance " + ((Object) ViewModelInstanceHandle.m198toStringimpl(this.$viewModelInstance.m43getInstanceHandleVPLto4w$kotlin_release()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ViewModelInstance viewModelInstance, CommandQueue commandQueue, long j11, b1 b1Var, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$viewModelInstance = viewModelInstance;
            this.$commandQueue = commandQueue;
            this.$stateMachineHandle = j11;
            this.$isSettled$delegate = b1Var;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass3(this.$viewModelInstance, this.$commandQueue, this.$stateMachineHandle, this.$isSettled$delegate, dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                ViewModelInstance viewModelInstance = this.$viewModelInstance;
                if (viewModelInstance == null) {
                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.VM_INSTANCE_TAG, new AnonymousClass1(this.$stateMachineHandle));
                    return b0.f48488a;
                }
                RiveLog.INSTANCE.getLogger().d(RiveUIKt.VM_INSTANCE_TAG, new AnonymousClass2(viewModelInstance));
                this.$commandQueue.m106bindViewModelInstanceeiyHz8(this.$stateMachineHandle, this.$viewModelInstance.m43getInstanceHandleVPLto4w$kotlin_release());
                RiveUIKt.RiveUI$lambda$4(this.$isSettled$delegate, false);
                s0 dirtyFlow$kotlin_release = this.$viewModelInstance.getDirtyFlow$kotlin_release();
                final long j11 = this.$stateMachineHandle;
                final b1 b1Var = this.$isSettled$delegate;
                j jVar = new j() { // from class: app.rive.RiveUIKt.RiveUI.3.3

                    /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$3$3$1, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
                    public static final class AnonymousClass1 extends n implements a {
                        final /* synthetic */ long $stateMachineHandle;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(long j11) {
                            super(0);
                            this.$stateMachineHandle = j11;
                        }

                        @Override // fz.a
                        public final String invoke() {
                            return "View model instance dirty, unsettling " + ((Object) StateMachineHandle.m191toStringimpl(this.$stateMachineHandle));
                        }
                    }

                    @Override // uz.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((b0) obj2, (d<? super b0>) dVar);
                    }

                    public final Object emit(b0 b0Var, d<? super b0> dVar) {
                        RiveLog.INSTANCE.getLogger().v(RiveUIKt.VM_INSTANCE_TAG, new AnonymousClass1(j11));
                        RiveUIKt.RiveUI$lambda$4(b1Var, false);
                        return b0.f48488a;
                    }
                };
                this.label = 1;
                if (dirtyFlow$kotlin_release.collect(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // fz.e
        public final Object invoke(rz.b0 b0Var, d<? super b0> dVar) {
            return ((AnonymousClass3) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "app.rive.RiveUIKt$RiveUI$5", f = "RiveUI.kt", l = {216}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends i implements e {
        final /* synthetic */ CommandQueue $commandQueue;
        final /* synthetic */ b1 $isSettled$delegate;
        final /* synthetic */ long $stateMachineHandle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(CommandQueue commandQueue, long j11, b1 b1Var, d<? super AnonymousClass5> dVar) {
            super(2, dVar);
            this.$commandQueue = commandQueue;
            this.$stateMachineHandle = j11;
            this.$isSettled$delegate = b1Var;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass5(this.$commandQueue, this.$stateMachineHandle, this.$isSettled$delegate, dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                final s0 settledFlow = this.$commandQueue.getSettledFlow();
                final long j11 = this.$stateMachineHandle;
                uz.i iVar = new uz.i() { // from class: app.rive.RiveUIKt$RiveUI$5$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$5$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ long $stateMachineHandle$inlined;
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$5$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
                        @xy.e(c = "app.rive.RiveUIKt$RiveUI$5$invokeSuspend$$inlined$filter$1$2", f = "RiveUI.kt", l = {223}, m = "emit")
                        public static final class AnonymousClass1 extends xy.c {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // xy.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar, long j11) {
                            this.$this_unsafeFlow = jVar;
                            this.$stateMachineHandle$inlined = j11;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // uz.j
                        public final Object emit(Object obj, d dVar) {
                            AnonymousClass1 anonymousClass1;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(dVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                            int i12 = anonymousClass1.label;
                            if (i12 == 0) {
                                com.bumptech.glide.e.F(obj2);
                                j jVar = this.$this_unsafeFlow;
                                if (((StateMachineHandle) obj).m192unboximpl() == this.$stateMachineHandle$inlined) {
                                    anonymousClass1.label = 1;
                                    if (jVar.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i12 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.bumptech.glide.e.F(obj2);
                            }
                            return b0.f48488a;
                        }
                    }

                    @Override // uz.i
                    public Object collect(j jVar, d dVar) {
                        Object objCollect = settledFlow.collect(new AnonymousClass2(jVar, j11), dVar);
                        return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : b0.f48488a;
                    }
                };
                final long j12 = this.$stateMachineHandle;
                final b1 b1Var = this.$isSettled$delegate;
                j jVar = new j() { // from class: app.rive.RiveUIKt.RiveUI.5.2

                    /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$5$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
                    public static final class AnonymousClass1 extends n implements a {
                        final /* synthetic */ long $stateMachineHandle;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(long j11) {
                            super(0);
                            this.$stateMachineHandle = j11;
                        }

                        @Override // fz.a
                        public final String invoke() {
                            return "State machine " + ((Object) StateMachineHandle.m191toStringimpl(this.$stateMachineHandle)) + " settled";
                        }
                    }

                    @Override // uz.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return m38emitOFH3VyA(((StateMachineHandle) obj2).m192unboximpl(), dVar);
                    }

                    /* JADX INFO: renamed from: emit-OFH3VyA, reason: not valid java name */
                    public final Object m38emitOFH3VyA(long j13, d<? super b0> dVar) {
                        RiveLog.INSTANCE.getLogger().v(RiveUIKt.STATE_MACHINE_TAG, new AnonymousClass1(j12));
                        RiveUIKt.RiveUI$lambda$4(b1Var, true);
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
        public final Object invoke(rz.b0 b0Var, d<? super b0> dVar) {
            return ((AnonymousClass5) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "app.rive.RiveUIKt$RiveUI$7", f = "RiveUI.kt", l = {243}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends i implements e {
        final /* synthetic */ Alignment $alignment;
        final /* synthetic */ long $artboardHandle;
        final /* synthetic */ int $clearColor;
        final /* synthetic */ CommandQueue $commandQueue;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ b1 $isSettled$delegate;
        final /* synthetic */ LifecycleOwner $lifecycleOwner;
        final /* synthetic */ long $stateMachineHandle;
        final /* synthetic */ b1 $surface$delegate;
        int label;

        /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$7$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnonymousClass1 extends n implements a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // fz.a
            public final String invoke() {
                return "Surface is null, skipping drawing";
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$7$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @xy.e(c = "app.rive.RiveUIKt$RiveUI$7$2", f = "RiveUI.kt", l = {247}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends i implements e {
            final /* synthetic */ Alignment $alignment;
            final /* synthetic */ long $artboardHandle;
            final /* synthetic */ int $clearColor;
            final /* synthetic */ CommandQueue $commandQueue;
            final /* synthetic */ Fit $fit;
            final /* synthetic */ b1 $isSettled$delegate;
            final /* synthetic */ long $stateMachineHandle;
            final /* synthetic */ b1 $surface$delegate;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$7$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            public static final class AnonymousClass1 extends n implements a {
                final /* synthetic */ long $artboardHandle;
                final /* synthetic */ long $stateMachineHandle;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(long j11, long j12) {
                    super(0);
                    this.$artboardHandle = j11;
                    this.$stateMachineHandle = j12;
                }

                @Override // fz.a
                public final String invoke() {
                    return "Starting drawing with " + ((Object) ArtboardHandle.m94toStringimpl(this.$artboardHandle)) + " and " + ((Object) StateMachineHandle.m191toStringimpl(this.$stateMachineHandle));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CommandQueue commandQueue, long j11, long j12, Fit fit, Alignment alignment, int i11, b1 b1Var, b1 b1Var2, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$commandQueue = commandQueue;
                this.$stateMachineHandle = j11;
                this.$artboardHandle = j12;
                this.$fit = fit;
                this.$alignment = alignment;
                this.$clearColor = i11;
                this.$isSettled$delegate = b1Var;
                this.$surface$delegate = b1Var2;
            }

            @Override // xy.a
            public final d<b0> create(Object obj, d<?> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$commandQueue, this.$stateMachineHandle, this.$artboardHandle, this.$fit, this.$alignment, this.$clearColor, this.$isSettled$delegate, this.$surface$delegate, dVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x004c  */
            /* JADX WARN: Code duplicated, block: B:13:0x0065 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:17:0x0075  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0063 -> B:14:0x0066). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0065
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // xy.a
            public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                /*
                    r20 = this;
                    r0 = r20
                    wy.a r1 = wy.a.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L21
                    if (r2 != r3) goto L19
                    java.lang.Object r2 = r0.L$1
                    kotlin.jvm.internal.x r2 = (kotlin.jvm.internal.x) r2
                    java.lang.Object r4 = r0.L$0
                    rz.b0 r4 = (rz.b0) r4
                    com.bumptech.glide.e.F(r21)
                    r5 = r21
                    goto L66
                L19:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L21:
                    com.bumptech.glide.e.F(r21)
                    java.lang.Object r2 = r0.L$0
                    rz.b0 r2 = (rz.b0) r2
                    app.rive.RiveUIKt$RiveUI$7$2$1 r4 = new app.rive.RiveUIKt$RiveUI$7$2$1
                    long r5 = r0.$artboardHandle
                    long r7 = r0.$stateMachineHandle
                    r4.<init>(r5, r7)
                    app.rive.RiveLog r5 = app.rive.RiveLog.INSTANCE
                    app.rive.RiveLog$Logger r5 = r5.getLogger()
                    java.lang.String r6 = "RiveUI/Draw"
                    r5.d(r6, r4)
                    kotlin.jvm.internal.x r4 = new kotlin.jvm.internal.x
                    r4.<init>()
                    r19 = r4
                    r4 = r2
                    r2 = r19
                L46:
                    boolean r5 = rz.e0.w(r4)
                    if (r5 == 0) goto L99
                    app.rive.RiveUIKt$RiveUI$7$2$deltaTimeNs$1 r5 = new app.rive.RiveUIKt$RiveUI$7$2$deltaTimeNs$1
                    r5.<init>(r2)
                    r0.L$0 = r4
                    r0.L$1 = r2
                    r0.label = r3
                    vy.i r6 = r0.getContext()
                    l1.w0 r6 = l1.t.x(r6)
                    java.lang.Object r5 = r6.p(r5, r0)
                    if (r5 != r1) goto L66
                    return r1
                L66:
                    java.lang.Number r5 = (java.lang.Number) r5
                    long r5 = r5.longValue()
                    l1.b1 r7 = r0.$isSettled$delegate
                    boolean r7 = app.rive.RiveUIKt.access$RiveUI$lambda$3(r7)
                    if (r7 == 0) goto L75
                    goto L46
                L75:
                    app.rive.core.CommandQueue r7 = r0.$commandQueue
                    long r8 = r0.$stateMachineHandle
                    r7.m105advanceStateMachineOFH3VyA(r8, r5)
                    app.rive.core.CommandQueue r10 = r0.$commandQueue
                    long r11 = r0.$artboardHandle
                    long r13 = r0.$stateMachineHandle
                    app.rive.runtime.kotlin.core.Fit r15 = r0.$fit
                    app.rive.runtime.kotlin.core.Alignment r5 = r0.$alignment
                    l1.b1 r6 = r0.$surface$delegate
                    app.rive.core.RiveSurface r17 = app.rive.RiveUIKt.access$RiveUI$lambda$6(r6)
                    kotlin.jvm.internal.m.c(r17)
                    int r6 = r0.$clearColor
                    r16 = r5
                    r18 = r6
                    r10.m122drawPOUf8go(r11, r13, r15, r16, r17, r18)
                    goto L46
                L99:
                    qy.b0 r1 = qy.b0.f48488a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: app.rive.RiveUIKt.AnonymousClass7.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // fz.e
            public final Object invoke(rz.b0 b0Var, d<? super b0> dVar) {
                return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(LifecycleOwner lifecycleOwner, b1 b1Var, CommandQueue commandQueue, long j11, long j12, Fit fit, Alignment alignment, int i11, b1 b1Var2, d<? super AnonymousClass7> dVar) {
            super(2, dVar);
            this.$lifecycleOwner = lifecycleOwner;
            this.$surface$delegate = b1Var;
            this.$commandQueue = commandQueue;
            this.$stateMachineHandle = j11;
            this.$artboardHandle = j12;
            this.$fit = fit;
            this.$alignment = alignment;
            this.$clearColor = i11;
            this.$isSettled$delegate = b1Var2;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass7(this.$lifecycleOwner, this.$surface$delegate, this.$commandQueue, this.$stateMachineHandle, this.$artboardHandle, this.$fit, this.$alignment, this.$clearColor, this.$isSettled$delegate, dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            b0 b0Var = b0.f48488a;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                if (RiveUIKt.RiveUI$lambda$6(this.$surface$delegate) == null) {
                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.DRAW_TAG, AnonymousClass1.INSTANCE);
                    return b0Var;
                }
                Lifecycle lifecycle = this.$lifecycleOwner.getLifecycle();
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$commandQueue, this.$stateMachineHandle, this.$artboardHandle, this.$fit, this.$alignment, this.$clearColor, this.$isSettled$delegate, this.$surface$delegate, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass2, this) == aVar) {
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
            return ((AnonymousClass7) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "app.rive.RiveUIKt$RiveUI$9", f = "RiveUI.kt", l = {286}, m = "invokeSuspend")
    public static final class AnonymousClass9 extends i implements e {
        final /* synthetic */ Alignment $alignment;
        final /* synthetic */ CommandQueue $commandQueue;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ b1 $isSettled$delegate;
        final /* synthetic */ long $stateMachineHandle;
        final /* synthetic */ a1 $surfaceHeight$delegate;
        final /* synthetic */ a1 $surfaceWidth$delegate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: app.rive.RiveUIKt$RiveUI$9$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @xy.e(c = "app.rive.RiveUIKt$RiveUI$9$1", f = "RiveUI.kt", l = {288}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends h implements e {
            final /* synthetic */ Alignment $alignment;
            final /* synthetic */ CommandQueue $commandQueue;
            final /* synthetic */ Fit $fit;
            final /* synthetic */ b1 $isSettled$delegate;
            final /* synthetic */ long $stateMachineHandle;
            final /* synthetic */ a1 $surfaceHeight$delegate;
            final /* synthetic */ a1 $surfaceWidth$delegate;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CommandQueue commandQueue, long j11, Fit fit, Alignment alignment, b1 b1Var, a1 a1Var, a1 a1Var2, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$commandQueue = commandQueue;
                this.$stateMachineHandle = j11;
                this.$fit = fit;
                this.$alignment = alignment;
                this.$isSettled$delegate = b1Var;
                this.$surfaceWidth$delegate = a1Var;
                this.$surfaceHeight$delegate = a1Var2;
            }

            @Override // xy.a
            public final d<b0> create(Object obj, d<?> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$commandQueue, this.$stateMachineHandle, this.$fit, this.$alignment, this.$isSettled$delegate, this.$surfaceWidth$delegate, this.$surfaceHeight$delegate, dVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002b A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:16:0x0042  */
            /* JADX WARN: Code duplicated, block: B:19:0x004d  */
            /* JADX WARN: Code duplicated, block: B:21:0x0057  */
            /* JADX WARN: Code duplicated, block: B:23:0x005a  */
            /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r1
              0x0021: PHI (r1v2 s2.b) = (r1v1 s2.b), (r1v3 s2.b), (r1v3 s2.b) binds: [B:8:0x0019, B:22:0x0058, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:12:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // xy.a
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    wy.a r0 = wy.a.COROUTINE_SUSPENDED
                    int r1 = r13.label
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r1 = r13.L$0
                    s2.b r1 = (s2.b) r1
                    com.bumptech.glide.e.F(r14)
                    goto L2c
                L11:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L19:
                    com.bumptech.glide.e.F(r14)
                    java.lang.Object r14 = r13.L$0
                    s2.b r14 = (s2.b) r14
                    r1 = r14
                L21:
                    r13.L$0 = r1
                    r13.label = r2
                    java.lang.Object r14 = s2.b.Y(r1, r13)
                    if (r14 != r0) goto L2c
                    return r0
                L2c:
                    s2.l r14 = (s2.l) r14
                    l1.b1 r3 = r13.$isSettled$delegate
                    r4 = 0
                    app.rive.RiveUIKt.access$RiveUI$lambda$4(r3, r4)
                    int r3 = r14.f51332e
                    r4 = 3
                    if (r3 != r4) goto L42
                    app.rive.RiveUIKt$RiveUI$9$1$pointerFn$1 r3 = new app.rive.RiveUIKt$RiveUI$9$1$pointerFn$1
                    app.rive.core.CommandQueue r4 = r13.$commandQueue
                    r3.<init>(r4)
                L40:
                    r5 = r3
                    goto L62
                L42:
                    r4 = 2
                    if (r3 != r4) goto L4d
                    app.rive.RiveUIKt$RiveUI$9$1$pointerFn$2 r3 = new app.rive.RiveUIKt$RiveUI$9$1$pointerFn$2
                    app.rive.core.CommandQueue r4 = r13.$commandQueue
                    r3.<init>(r4)
                    goto L40
                L4d:
                    if (r3 != r2) goto L57
                    app.rive.RiveUIKt$RiveUI$9$1$pointerFn$3 r3 = new app.rive.RiveUIKt$RiveUI$9$1$pointerFn$3
                    app.rive.core.CommandQueue r4 = r13.$commandQueue
                    r3.<init>(r4)
                    goto L40
                L57:
                    r4 = 5
                    if (r3 != r4) goto L21
                    app.rive.RiveUIKt$RiveUI$9$1$pointerFn$4 r3 = new app.rive.RiveUIKt$RiveUI$9$1$pointerFn$4
                    app.rive.core.CommandQueue r4 = r13.$commandQueue
                    r3.<init>(r4)
                    goto L40
                L62:
                    java.lang.Object r14 = r14.f51328a
                    java.lang.Object r14 = ry.m.q0(r14)
                    s2.t r14 = (s2.t) r14
                    long r3 = r14.f51345c
                    long r6 = r13.$stateMachineHandle
                    app.rive.core.StateMachineHandle r6 = app.rive.core.StateMachineHandle.m186boximpl(r6)
                    app.rive.runtime.kotlin.core.Fit r7 = r13.$fit
                    app.rive.runtime.kotlin.core.Alignment r8 = r13.$alignment
                    l1.a1 r14 = r13.$surfaceWidth$delegate
                    int r14 = app.rive.RiveUIKt.access$RiveUI$lambda$9(r14)
                    float r14 = (float) r14
                    java.lang.Float r9 = new java.lang.Float
                    r9.<init>(r14)
                    l1.a1 r14 = r13.$surfaceHeight$delegate
                    int r14 = app.rive.RiveUIKt.access$RiveUI$lambda$12(r14)
                    float r14 = (float) r14
                    java.lang.Float r10 = new java.lang.Float
                    r10.<init>(r14)
                    float r14 = f2.b.e(r3)
                    java.lang.Float r11 = new java.lang.Float
                    r11.<init>(r14)
                    float r14 = f2.b.f(r3)
                    java.lang.Float r12 = new java.lang.Float
                    r12.<init>(r14)
                    r5.invoke(r6, r7, r8, r9, r10, r11, r12)
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: app.rive.RiveUIKt.AnonymousClass9.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // fz.e
            public final Object invoke(b bVar, d<? super b0> dVar) {
                return ((AnonymousClass1) create(bVar, dVar)).invokeSuspend(b0.f48488a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(CommandQueue commandQueue, long j11, Fit fit, Alignment alignment, b1 b1Var, a1 a1Var, a1 a1Var2, d<? super AnonymousClass9> dVar) {
            super(2, dVar);
            this.$commandQueue = commandQueue;
            this.$stateMachineHandle = j11;
            this.$fit = fit;
            this.$alignment = alignment;
            this.$isSettled$delegate = b1Var;
            this.$surfaceWidth$delegate = a1Var;
            this.$surfaceHeight$delegate = a1Var2;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$commandQueue, this.$stateMachineHandle, this.$fit, this.$alignment, this.$isSettled$delegate, this.$surfaceWidth$delegate, this.$surfaceHeight$delegate, dVar);
            anonymousClass9.L$0 = obj;
            return anonymousClass9;
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                w wVar = (w) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$commandQueue, this.$stateMachineHandle, this.$fit, this.$alignment, this.$isSettled$delegate, this.$surfaceWidth$delegate, this.$surfaceHeight$delegate, null);
                this.label = 1;
                if (((m0) wVar).T0(anonymousClass1, this) == aVar) {
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
        public final Object invoke(w wVar, d<? super b0> dVar) {
            return ((AnonymousClass9) create(wVar, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveUIKt$lazyDeferred$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class C00611 extends n implements a {
        final /* synthetic */ c $block;
        final /* synthetic */ rz.b0 $parentScope;

        /* JADX INFO: renamed from: app.rive.RiveUIKt$lazyDeferred$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @xy.e(c = "app.rive.RiveUIKt$lazyDeferred$1$1", f = "RiveUI.kt", l = {66}, m = "invokeSuspend")
        public static final class C00121 extends i implements e {
            final /* synthetic */ c $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00121(c cVar, d<? super C00121> dVar) {
                super(2, dVar);
                this.$block = cVar;
            }

            @Override // xy.a
            public final d<b0> create(Object obj, d<?> dVar) {
                return new C00121(this.$block, dVar);
            }

            @Override // fz.e
            public final Object invoke(rz.b0 b0Var, d<? super T> dVar) {
                return ((C00121) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
            }

            @Override // xy.a
            public final Object invokeSuspend(Object obj) {
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException(evRpcb.rseAwlpVEzD);
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                c cVar = this.$block;
                this.label = 1;
                Object objInvoke = cVar.invoke(this);
                return objInvoke == aVar ? aVar : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00611(rz.b0 b0Var, c cVar) {
            super(0);
            this.$parentScope = b0Var;
            this.$block = cVar;
        }

        @Override // fz.a
        public final h0 invoke() {
            return e0.f(this.$parentScope, null, d0.LAZY, new C00121(this.$block, null), 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x015c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0161  */
    /* JADX WARN: Code duplicated, block: B:109:0x018e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0190  */
    /* JADX WARN: Code duplicated, block: B:113:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:126:0x020a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0222  */
    /* JADX WARN: Code duplicated, block: B:131:0x022a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0243  */
    /* JADX WARN: Code duplicated, block: B:136:0x024b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0264  */
    /* JADX WARN: Code duplicated, block: B:142:0x0320  */
    /* JADX WARN: Code duplicated, block: B:145:0x0362 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0364  */
    /* JADX WARN: Code duplicated, block: B:149:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:153:0x0447  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    public static final void RiveUI(RiveFile file, r rVar, Artboard artboard, String str, ViewModelInstance viewModelInstance, Fit fit, Alignment alignment, int i11, l1.n nVar, int i12, int i13) {
        int i14;
        r rVar2;
        int i15;
        int i16;
        String str2;
        int i17;
        int i18;
        int i19;
        Fit fit2;
        int i21;
        int i22;
        Alignment alignment2;
        int i23;
        int i24;
        int i25;
        Artboard artboard2;
        ViewModelInstance viewModelInstance2;
        Fit fit3;
        int iE;
        RiveLog riveLog;
        final CommandQueue commandQueue$kotlin_release;
        boolean zE;
        Object objQ;
        g gVar;
        long jM108createDefaultArtboard6NrLy0M;
        long jM95unboximpl;
        boolean z11;
        boolean z12;
        Object objQ2;
        long jM109createDefaultStateMachinexY8vNfM;
        long j11;
        RiveFile riveFile;
        boolean zE2;
        Object objQ3;
        b1 b1Var;
        Object objQ4;
        final b1 b1Var2;
        Object objQ5;
        boolean z13;
        Object objV;
        final a1 a1Var;
        Object objQ6;
        boolean z14;
        Object objV2;
        final a1 a1Var2;
        Object objQ7;
        RiveUIKt$RiveUI$surfaceListener$1$1 riveUIKt$RiveUI$surfaceListener$1$1;
        Object objQ8;
        boolean zF;
        Object objQ9;
        Object objQ10;
        s sVar;
        Artboard artboard3;
        r rVar3;
        Fit fit4;
        Alignment alignment3;
        int i26;
        ViewModelInstance viewModelInstance3;
        String str3;
        x1 x1VarT;
        m.f(file, "file");
        s sVar2 = (s) nVar;
        sVar2.f0(-902710966);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (sVar2.f(file) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i27 = i13 & 2;
        if (i27 == 0) {
            if ((i12 & 112) == 0) {
                rVar2 = rVar;
                i14 |= sVar2.f(rVar2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                i14 |= 128;
            }
            i16 = i13 & 8;
            if (i16 != 0) {
                if ((i12 & 7168) == 0) {
                    str2 = str;
                    if (sVar2.f(str2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i14 |= i17;
                }
                i18 = i13 & 16;
                if (i18 != 0) {
                    i14 |= OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    if ((458752 & i12) == 0) {
                        fit2 = fit;
                        if (sVar2.f(fit2)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 64;
                    if (i22 != 0) {
                        i14 |= 1572864;
                        alignment2 = alignment;
                    } else {
                        alignment2 = alignment;
                        if ((i12 & 3670016) == 0) {
                            if (sVar2.f(alignment2)) {
                                i23 = 1048576;
                            } else {
                                i23 = 524288;
                            }
                            i14 |= i23;
                        }
                    }
                    i24 = i13 & 128;
                    if (i24 != 0) {
                        if ((i12 & 29360128) == 0) {
                            if (sVar2.d(i11)) {
                                i25 = 8388608;
                            } else {
                                i25 = 4194304;
                            }
                            i14 |= i25;
                        }
                        if ((i13 & 20) != 20 && (23967451 & i14) == 4793490 && sVar2.F()) {
                            sVar2.W();
                            artboard3 = artboard;
                            sVar = sVar2;
                            rVar3 = rVar2;
                            alignment3 = alignment2;
                            fit4 = fit2;
                            viewModelInstance3 = viewModelInstance;
                            i26 = i11;
                        } else {
                            if (i27 != 0) {
                                rVar2 = o.f58481a;
                            }
                            if (i15 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i16 != 0) {
                                str2 = null;
                            }
                            if (i18 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if (i19 != 0) {
                                fit3 = Fit.CONTAIN;
                            } else {
                                fit3 = fit2;
                            }
                            if (i22 != 0) {
                                alignment2 = Alignment.CENTER;
                            }
                            if (i24 != 0) {
                                iE = f0.E(x.f28621h);
                            } else {
                                iE = i11;
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                            riveLog = RiveLog.INSTANCE;
                            riveLog.getLogger().v(GENERAL_TAG, anonymousClass1);
                            LifecycleOwner lifecycleOwner = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                            commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                            long jM22getFileHandleENT3xMk$kotlin_release = file.m22getFileHandleENT3xMk$kotlin_release();
                            sVar2.d0(-225424328);
                            zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release) | sVar2.f(artboard2);
                            objQ = sVar2.Q();
                            gVar = l1.m.f39353a;
                            if (zE || objQ == gVar) {
                                if (artboard2 != null) {
                                    jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                                } else {
                                    jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                                }
                                objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                                sVar2.o0(objQ);
                            }
                            jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                            sVar2.p(false);
                            sVar2.d0(-225418898);
                            boolean zE3 = sVar2.e(jM95unboximpl);
                            if ((i14 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = zE3 | z11;
                            objQ2 = sVar2.Q();
                            if (!z12 || objQ2 == gVar) {
                                if (str2 != null) {
                                    jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                                } else {
                                    jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                                }
                                j11 = jM95unboximpl;
                                riveFile = file;
                                riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                                objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                                sVar2.o0(objQ2);
                            } else {
                                riveFile = file;
                                j11 = jM95unboximpl;
                            }
                            long jM192unboximpl = ((StateMachineHandle) objQ2).m192unboximpl();
                            sVar2.p(false);
                            sVar2.d0(-225405461);
                            zE2 = sVar2.e(jM192unboximpl);
                            objQ3 = sVar2.Q();
                            if (zE2 || objQ3 == gVar) {
                                objQ3 = t.B(Boolean.FALSE);
                                sVar2.o0(objQ3);
                            }
                            b1Var = (b1) objQ3;
                            sVar2.p(false);
                            sVar2.d0(-225403068);
                            objQ4 = sVar2.Q();
                            if (objQ4 == gVar) {
                                objQ4 = t.B(null);
                                sVar2.o0(objQ4);
                            }
                            b1Var2 = (b1) objQ4;
                            sVar2.p(false);
                            sVar2.d0(-225400778);
                            objQ5 = sVar2.Q();
                            if (objQ5 == gVar) {
                                z13 = false;
                                objV = defpackage.e.v(0, sVar2);
                            } else {
                                z13 = false;
                                objV = objQ5;
                            }
                            ViewModelInstance viewModelInstance4 = viewModelInstance2;
                            a1Var = (a1) objV;
                            sVar2.p(z13);
                            sVar2.d0(-225398890);
                            objQ6 = sVar2.Q();
                            if (objQ6 == gVar) {
                                z14 = false;
                                objV2 = defpackage.e.v(0, sVar2);
                            } else {
                                z14 = false;
                                objV2 = objQ6;
                            }
                            a1Var2 = (a1) objV2;
                            sVar2.p(z14);
                            sVar2.d0(-225395994);
                            objQ7 = sVar2.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                                    @Override // android.view.TextureView.SurfaceTextureListener
                                    public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                        m.f(newSurfaceTexture, "newSurfaceTexture");
                                        Surface surface = new Surface(newSurfaceTexture);
                                        RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                        b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                        RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                        RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                    }

                                    @Override // android.view.TextureView.SurfaceTextureListener
                                    public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                        m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                        b1Var2.setValue(null);
                                        return true;
                                    }

                                    @Override // android.view.TextureView.SurfaceTextureListener
                                    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                        m.f(surfaceTexture, "surfaceTexture");
                                        RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                        RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                    }

                                    @Override // android.view.TextureView.SurfaceTextureListener
                                    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                        m.f(surfaceTexture, "surfaceTexture");
                                    }
                                };
                                sVar2.o0(objQ7);
                            }
                            riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                            sVar2.p(z14);
                            RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                            t.c(StateMachineHandle.m186boximpl(jM192unboximpl), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl, str2, j11, file), sVar2);
                            t.g(StateMachineHandle.m186boximpl(jM192unboximpl), viewModelInstance4, new AnonymousClass3(viewModelInstance4, commandQueue$kotlin_release, jM192unboximpl, b1Var, null), sVar2);
                            RiveSurface riveSurfaceRiveUI$lambda$6 = RiveUI$lambda$6(b1Var2);
                            sVar2.d0(-225306504);
                            objQ8 = sVar2.Q();
                            if (objQ8 == gVar) {
                                objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                                sVar2.o0(objQ8);
                            }
                            sVar2.p(false);
                            t.c(riveSurfaceRiveUI$lambda$6, (c) objQ8, sVar2);
                            t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl), sVar2);
                            Integer numValueOf = Integer.valueOf(iE);
                            sVar2.d0(-225283434);
                            zF = sVar2.f(b1Var);
                            objQ9 = sVar2.Q();
                            if (zF || objQ9 == gVar) {
                                objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                                sVar2.o0(objQ9);
                            }
                            sVar2.p(false);
                            t.h(fit3, alignment2, numValueOf, (e) objQ9, sVar2);
                            Fit fit5 = fit3;
                            Alignment alignment4 = alignment2;
                            t.i(new Object[]{lifecycleOwner, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl), fit5, alignment4, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner, b1Var2, commandQueue$kotlin_release, jM192unboximpl, j11, fit5, alignment4, iE, b1Var, null), sVar2);
                            sVar2.d0(-225237700);
                            objQ10 = sVar2.Q();
                            if (objQ10 == gVar) {
                                objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                                sVar2.o0(objQ10);
                            }
                            sVar2.p(false);
                            Object[] objArr = {StateMachineHandle.m186boximpl(jM192unboximpl), fit5, alignment4, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                            AnonymousClass9 anonymousClass9 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl, fit5, alignment4, b1Var, a1Var, a1Var2, null);
                            s2.l lVar = g0.f51302a;
                            y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr, new s2.f0(anonymousClass9), 3)), null, sVar2, 6, 4);
                            sVar = sVar2;
                            artboard3 = artboard2;
                            rVar3 = rVar2;
                            fit4 = fit5;
                            alignment3 = alignment4;
                            i26 = iE;
                            viewModelInstance3 = viewModelInstance4;
                        }
                        str3 = str2;
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
                        }
                    }
                    i14 |= 12582912;
                    if ((i13 & 20) != 20) {
                        if (i27 != 0) {
                            rVar2 = o.f58481a;
                        }
                        if (i15 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i16 != 0) {
                            str2 = null;
                        }
                        if (i18 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if (i19 != 0) {
                            fit3 = Fit.CONTAIN;
                        } else {
                            fit3 = fit2;
                        }
                        if (i22 != 0) {
                            alignment2 = Alignment.CENTER;
                        }
                        if (i24 != 0) {
                            iE = f0.E(x.f28621h);
                        } else {
                            iE = i11;
                        }
                        AnonymousClass1 anonymousClass2 = AnonymousClass1.INSTANCE;
                        riveLog = RiveLog.INSTANCE;
                        riveLog.getLogger().v(GENERAL_TAG, anonymousClass2);
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                        long jM22getFileHandleENT3xMk$kotlin_release2 = file.m22getFileHandleENT3xMk$kotlin_release();
                        sVar2.d0(-225424328);
                        zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release2) | sVar2.f(artboard2);
                        objQ = sVar2.Q();
                        gVar = l1.m.f39353a;
                        if (zE) {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        } else {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        }
                        jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225418898);
                        boolean zE4 = sVar2.e(jM95unboximpl);
                        if ((i14 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zE4 | z11;
                        objQ2 = sVar2.Q();
                        if (z12) {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        } else {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        }
                        long jM192unboximpl2 = ((StateMachineHandle) objQ2).m192unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225405461);
                        zE2 = sVar2.e(jM192unboximpl2);
                        objQ3 = sVar2.Q();
                        if (zE2) {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        }
                        b1Var = (b1) objQ3;
                        sVar2.p(false);
                        sVar2.d0(-225403068);
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = t.B(null);
                            sVar2.o0(objQ4);
                        }
                        b1Var2 = (b1) objQ4;
                        sVar2.p(false);
                        sVar2.d0(-225400778);
                        objQ5 = sVar2.Q();
                        if (objQ5 == gVar) {
                            z13 = false;
                            objV = defpackage.e.v(0, sVar2);
                        } else {
                            z13 = false;
                            objV = objQ5;
                        }
                        ViewModelInstance viewModelInstance5 = viewModelInstance2;
                        a1Var = (a1) objV;
                        sVar2.p(z13);
                        sVar2.d0(-225398890);
                        objQ6 = sVar2.Q();
                        if (objQ6 == gVar) {
                            z14 = false;
                            objV2 = defpackage.e.v(0, sVar2);
                        } else {
                            z14 = false;
                            objV2 = objQ6;
                        }
                        a1Var2 = (a1) objV2;
                        sVar2.p(z14);
                        sVar2.d0(-225395994);
                        objQ7 = sVar2.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                    m.f(newSurfaceTexture, "newSurfaceTexture");
                                    Surface surface = new Surface(newSurfaceTexture);
                                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                    b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                    m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                    b1Var2.setValue(null);
                                    return true;
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                }
                            };
                            sVar2.o0(objQ7);
                        }
                        riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                        sVar2.p(z14);
                        RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl2)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner2), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                        t.c(StateMachineHandle.m186boximpl(jM192unboximpl2), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl2, str2, j11, file), sVar2);
                        t.g(StateMachineHandle.m186boximpl(jM192unboximpl2), viewModelInstance5, new AnonymousClass3(viewModelInstance5, commandQueue$kotlin_release, jM192unboximpl2, b1Var, null), sVar2);
                        RiveSurface riveSurfaceRiveUI$lambda$7 = RiveUI$lambda$6(b1Var2);
                        sVar2.d0(-225306504);
                        objQ8 = sVar2.Q();
                        if (objQ8 == gVar) {
                            objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                            sVar2.o0(objQ8);
                        }
                        sVar2.p(false);
                        t.c(riveSurfaceRiveUI$lambda$7, (c) objQ8, sVar2);
                        t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl2, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl2), sVar2);
                        Integer numValueOf2 = Integer.valueOf(iE);
                        sVar2.d0(-225283434);
                        zF = sVar2.f(b1Var);
                        objQ9 = sVar2.Q();
                        if (zF) {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        } else {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        }
                        sVar2.p(false);
                        t.h(fit3, alignment2, numValueOf2, (e) objQ9, sVar2);
                        Fit fit6 = fit3;
                        Alignment alignment5 = alignment2;
                        t.i(new Object[]{lifecycleOwner2, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl2), fit6, alignment5, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner2, b1Var2, commandQueue$kotlin_release, jM192unboximpl2, j11, fit6, alignment5, iE, b1Var, null), sVar2);
                        sVar2.d0(-225237700);
                        objQ10 = sVar2.Q();
                        if (objQ10 == gVar) {
                            objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                            sVar2.o0(objQ10);
                        }
                        sVar2.p(false);
                        Object[] objArr2 = {StateMachineHandle.m186boximpl(jM192unboximpl2), fit6, alignment5, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                        AnonymousClass9 anonymousClass10 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl2, fit6, alignment5, b1Var, a1Var, a1Var2, null);
                        s2.l lVar2 = g0.f51302a;
                        y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr2, new s2.f0(anonymousClass10), 3)), null, sVar2, 6, 4);
                        sVar = sVar2;
                        artboard3 = artboard2;
                        rVar3 = rVar2;
                        fit4 = fit6;
                        alignment3 = alignment5;
                        i26 = iE;
                        viewModelInstance3 = viewModelInstance5;
                    } else {
                        if (i27 != 0) {
                            rVar2 = o.f58481a;
                        }
                        if (i15 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i16 != 0) {
                            str2 = null;
                        }
                        if (i18 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if (i19 != 0) {
                            fit3 = Fit.CONTAIN;
                        } else {
                            fit3 = fit2;
                        }
                        if (i22 != 0) {
                            alignment2 = Alignment.CENTER;
                        }
                        if (i24 != 0) {
                            iE = f0.E(x.f28621h);
                        } else {
                            iE = i11;
                        }
                        AnonymousClass1 anonymousClass3 = AnonymousClass1.INSTANCE;
                        riveLog = RiveLog.INSTANCE;
                        riveLog.getLogger().v(GENERAL_TAG, anonymousClass3);
                        LifecycleOwner lifecycleOwner3 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                        long jM22getFileHandleENT3xMk$kotlin_release3 = file.m22getFileHandleENT3xMk$kotlin_release();
                        sVar2.d0(-225424328);
                        zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release3) | sVar2.f(artboard2);
                        objQ = sVar2.Q();
                        gVar = l1.m.f39353a;
                        if (zE) {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        } else {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        }
                        jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225418898);
                        boolean zE5 = sVar2.e(jM95unboximpl);
                        if ((i14 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zE5 | z11;
                        objQ2 = sVar2.Q();
                        if (z12) {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        } else {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        }
                        long jM192unboximpl3 = ((StateMachineHandle) objQ2).m192unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225405461);
                        zE2 = sVar2.e(jM192unboximpl3);
                        objQ3 = sVar2.Q();
                        if (zE2) {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        }
                        b1Var = (b1) objQ3;
                        sVar2.p(false);
                        sVar2.d0(-225403068);
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = t.B(null);
                            sVar2.o0(objQ4);
                        }
                        b1Var2 = (b1) objQ4;
                        sVar2.p(false);
                        sVar2.d0(-225400778);
                        objQ5 = sVar2.Q();
                        if (objQ5 == gVar) {
                            z13 = false;
                            objV = defpackage.e.v(0, sVar2);
                        } else {
                            z13 = false;
                            objV = objQ5;
                        }
                        ViewModelInstance viewModelInstance6 = viewModelInstance2;
                        a1Var = (a1) objV;
                        sVar2.p(z13);
                        sVar2.d0(-225398890);
                        objQ6 = sVar2.Q();
                        if (objQ6 == gVar) {
                            z14 = false;
                            objV2 = defpackage.e.v(0, sVar2);
                        } else {
                            z14 = false;
                            objV2 = objQ6;
                        }
                        a1Var2 = (a1) objV2;
                        sVar2.p(z14);
                        sVar2.d0(-225395994);
                        objQ7 = sVar2.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                    m.f(newSurfaceTexture, "newSurfaceTexture");
                                    Surface surface = new Surface(newSurfaceTexture);
                                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                    b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                    m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                    b1Var2.setValue(null);
                                    return true;
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                }
                            };
                            sVar2.o0(objQ7);
                        }
                        riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                        sVar2.p(z14);
                        RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl3)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner3), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                        t.c(StateMachineHandle.m186boximpl(jM192unboximpl3), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl3, str2, j11, file), sVar2);
                        t.g(StateMachineHandle.m186boximpl(jM192unboximpl3), viewModelInstance6, new AnonymousClass3(viewModelInstance6, commandQueue$kotlin_release, jM192unboximpl3, b1Var, null), sVar2);
                        RiveSurface riveSurfaceRiveUI$lambda$8 = RiveUI$lambda$6(b1Var2);
                        sVar2.d0(-225306504);
                        objQ8 = sVar2.Q();
                        if (objQ8 == gVar) {
                            objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                            sVar2.o0(objQ8);
                        }
                        sVar2.p(false);
                        t.c(riveSurfaceRiveUI$lambda$8, (c) objQ8, sVar2);
                        t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl3, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl3), sVar2);
                        Integer numValueOf3 = Integer.valueOf(iE);
                        sVar2.d0(-225283434);
                        zF = sVar2.f(b1Var);
                        objQ9 = sVar2.Q();
                        if (zF) {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        } else {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        }
                        sVar2.p(false);
                        t.h(fit3, alignment2, numValueOf3, (e) objQ9, sVar2);
                        Fit fit7 = fit3;
                        Alignment alignment6 = alignment2;
                        t.i(new Object[]{lifecycleOwner3, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl3), fit7, alignment6, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner3, b1Var2, commandQueue$kotlin_release, jM192unboximpl3, j11, fit7, alignment6, iE, b1Var, null), sVar2);
                        sVar2.d0(-225237700);
                        objQ10 = sVar2.Q();
                        if (objQ10 == gVar) {
                            objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                            sVar2.o0(objQ10);
                        }
                        sVar2.p(false);
                        Object[] objArr3 = {StateMachineHandle.m186boximpl(jM192unboximpl3), fit7, alignment6, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                        AnonymousClass9 anonymousClass11 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl3, fit7, alignment6, b1Var, a1Var, a1Var2, null);
                        s2.l lVar3 = g0.f51302a;
                        y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr3, new s2.f0(anonymousClass11), 3)), null, sVar2, 6, 4);
                        sVar = sVar2;
                        artboard3 = artboard2;
                        rVar3 = rVar2;
                        fit4 = fit7;
                        alignment3 = alignment6;
                        i26 = iE;
                        viewModelInstance3 = viewModelInstance6;
                    }
                    str3 = str2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
                    }
                }
                i14 |= 196608;
                fit2 = fit;
                i22 = i13 & 64;
                if (i22 != 0) {
                    i14 |= 1572864;
                    alignment2 = alignment;
                } else {
                    alignment2 = alignment;
                    if ((i12 & 3670016) == 0) {
                        if (sVar2.f(alignment2)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    if ((i12 & 29360128) == 0) {
                        if (sVar2.d(i11)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 20) != 20) {
                        if (i27 != 0) {
                            rVar2 = o.f58481a;
                        }
                        if (i15 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i16 != 0) {
                            str2 = null;
                        }
                        if (i18 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if (i19 != 0) {
                            fit3 = Fit.CONTAIN;
                        } else {
                            fit3 = fit2;
                        }
                        if (i22 != 0) {
                            alignment2 = Alignment.CENTER;
                        }
                        if (i24 != 0) {
                            iE = f0.E(x.f28621h);
                        } else {
                            iE = i11;
                        }
                        AnonymousClass1 anonymousClass4 = AnonymousClass1.INSTANCE;
                        riveLog = RiveLog.INSTANCE;
                        riveLog.getLogger().v(GENERAL_TAG, anonymousClass4);
                        LifecycleOwner lifecycleOwner4 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                        long jM22getFileHandleENT3xMk$kotlin_release4 = file.m22getFileHandleENT3xMk$kotlin_release();
                        sVar2.d0(-225424328);
                        zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release4) | sVar2.f(artboard2);
                        objQ = sVar2.Q();
                        gVar = l1.m.f39353a;
                        if (zE) {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        } else {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        }
                        jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225418898);
                        boolean zE6 = sVar2.e(jM95unboximpl);
                        if ((i14 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zE6 | z11;
                        objQ2 = sVar2.Q();
                        if (z12) {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        } else {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        }
                        long jM192unboximpl4 = ((StateMachineHandle) objQ2).m192unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225405461);
                        zE2 = sVar2.e(jM192unboximpl4);
                        objQ3 = sVar2.Q();
                        if (zE2) {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        }
                        b1Var = (b1) objQ3;
                        sVar2.p(false);
                        sVar2.d0(-225403068);
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = t.B(null);
                            sVar2.o0(objQ4);
                        }
                        b1Var2 = (b1) objQ4;
                        sVar2.p(false);
                        sVar2.d0(-225400778);
                        objQ5 = sVar2.Q();
                        if (objQ5 == gVar) {
                            z13 = false;
                            objV = defpackage.e.v(0, sVar2);
                        } else {
                            z13 = false;
                            objV = objQ5;
                        }
                        ViewModelInstance viewModelInstance7 = viewModelInstance2;
                        a1Var = (a1) objV;
                        sVar2.p(z13);
                        sVar2.d0(-225398890);
                        objQ6 = sVar2.Q();
                        if (objQ6 == gVar) {
                            z14 = false;
                            objV2 = defpackage.e.v(0, sVar2);
                        } else {
                            z14 = false;
                            objV2 = objQ6;
                        }
                        a1Var2 = (a1) objV2;
                        sVar2.p(z14);
                        sVar2.d0(-225395994);
                        objQ7 = sVar2.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                    m.f(newSurfaceTexture, "newSurfaceTexture");
                                    Surface surface = new Surface(newSurfaceTexture);
                                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                    b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                    m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                    b1Var2.setValue(null);
                                    return true;
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                }
                            };
                            sVar2.o0(objQ7);
                        }
                        riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                        sVar2.p(z14);
                        RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl4)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner4), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                        t.c(StateMachineHandle.m186boximpl(jM192unboximpl4), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl4, str2, j11, file), sVar2);
                        t.g(StateMachineHandle.m186boximpl(jM192unboximpl4), viewModelInstance7, new AnonymousClass3(viewModelInstance7, commandQueue$kotlin_release, jM192unboximpl4, b1Var, null), sVar2);
                        RiveSurface riveSurfaceRiveUI$lambda$9 = RiveUI$lambda$6(b1Var2);
                        sVar2.d0(-225306504);
                        objQ8 = sVar2.Q();
                        if (objQ8 == gVar) {
                            objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                            sVar2.o0(objQ8);
                        }
                        sVar2.p(false);
                        t.c(riveSurfaceRiveUI$lambda$9, (c) objQ8, sVar2);
                        t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl4, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl4), sVar2);
                        Integer numValueOf4 = Integer.valueOf(iE);
                        sVar2.d0(-225283434);
                        zF = sVar2.f(b1Var);
                        objQ9 = sVar2.Q();
                        if (zF) {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        } else {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        }
                        sVar2.p(false);
                        t.h(fit3, alignment2, numValueOf4, (e) objQ9, sVar2);
                        Fit fit8 = fit3;
                        Alignment alignment7 = alignment2;
                        t.i(new Object[]{lifecycleOwner4, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl4), fit8, alignment7, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner4, b1Var2, commandQueue$kotlin_release, jM192unboximpl4, j11, fit8, alignment7, iE, b1Var, null), sVar2);
                        sVar2.d0(-225237700);
                        objQ10 = sVar2.Q();
                        if (objQ10 == gVar) {
                            objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                            sVar2.o0(objQ10);
                        }
                        sVar2.p(false);
                        Object[] objArr4 = {StateMachineHandle.m186boximpl(jM192unboximpl4), fit8, alignment7, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                        AnonymousClass9 anonymousClass12 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl4, fit8, alignment7, b1Var, a1Var, a1Var2, null);
                        s2.l lVar4 = g0.f51302a;
                        y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr4, new s2.f0(anonymousClass12), 3)), null, sVar2, 6, 4);
                        sVar = sVar2;
                        artboard3 = artboard2;
                        rVar3 = rVar2;
                        fit4 = fit8;
                        alignment3 = alignment7;
                        i26 = iE;
                        viewModelInstance3 = viewModelInstance7;
                    } else {
                        if (i27 != 0) {
                            rVar2 = o.f58481a;
                        }
                        if (i15 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i16 != 0) {
                            str2 = null;
                        }
                        if (i18 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if (i19 != 0) {
                            fit3 = Fit.CONTAIN;
                        } else {
                            fit3 = fit2;
                        }
                        if (i22 != 0) {
                            alignment2 = Alignment.CENTER;
                        }
                        if (i24 != 0) {
                            iE = f0.E(x.f28621h);
                        } else {
                            iE = i11;
                        }
                        AnonymousClass1 anonymousClass5 = AnonymousClass1.INSTANCE;
                        riveLog = RiveLog.INSTANCE;
                        riveLog.getLogger().v(GENERAL_TAG, anonymousClass5);
                        LifecycleOwner lifecycleOwner5 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                        long jM22getFileHandleENT3xMk$kotlin_release5 = file.m22getFileHandleENT3xMk$kotlin_release();
                        sVar2.d0(-225424328);
                        zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release5) | sVar2.f(artboard2);
                        objQ = sVar2.Q();
                        gVar = l1.m.f39353a;
                        if (zE) {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        } else {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        }
                        jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225418898);
                        boolean zE7 = sVar2.e(jM95unboximpl);
                        if ((i14 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zE7 | z11;
                        objQ2 = sVar2.Q();
                        if (z12) {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        } else {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        }
                        long jM192unboximpl5 = ((StateMachineHandle) objQ2).m192unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225405461);
                        zE2 = sVar2.e(jM192unboximpl5);
                        objQ3 = sVar2.Q();
                        if (zE2) {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        }
                        b1Var = (b1) objQ3;
                        sVar2.p(false);
                        sVar2.d0(-225403068);
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = t.B(null);
                            sVar2.o0(objQ4);
                        }
                        b1Var2 = (b1) objQ4;
                        sVar2.p(false);
                        sVar2.d0(-225400778);
                        objQ5 = sVar2.Q();
                        if (objQ5 == gVar) {
                            z13 = false;
                            objV = defpackage.e.v(0, sVar2);
                        } else {
                            z13 = false;
                            objV = objQ5;
                        }
                        ViewModelInstance viewModelInstance8 = viewModelInstance2;
                        a1Var = (a1) objV;
                        sVar2.p(z13);
                        sVar2.d0(-225398890);
                        objQ6 = sVar2.Q();
                        if (objQ6 == gVar) {
                            z14 = false;
                            objV2 = defpackage.e.v(0, sVar2);
                        } else {
                            z14 = false;
                            objV2 = objQ6;
                        }
                        a1Var2 = (a1) objV2;
                        sVar2.p(z14);
                        sVar2.d0(-225395994);
                        objQ7 = sVar2.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                    m.f(newSurfaceTexture, "newSurfaceTexture");
                                    Surface surface = new Surface(newSurfaceTexture);
                                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                    b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                    m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                    b1Var2.setValue(null);
                                    return true;
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                }
                            };
                            sVar2.o0(objQ7);
                        }
                        riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                        sVar2.p(z14);
                        RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl5)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner5), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                        t.c(StateMachineHandle.m186boximpl(jM192unboximpl5), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl5, str2, j11, file), sVar2);
                        t.g(StateMachineHandle.m186boximpl(jM192unboximpl5), viewModelInstance8, new AnonymousClass3(viewModelInstance8, commandQueue$kotlin_release, jM192unboximpl5, b1Var, null), sVar2);
                        RiveSurface riveSurfaceRiveUI$lambda$10 = RiveUI$lambda$6(b1Var2);
                        sVar2.d0(-225306504);
                        objQ8 = sVar2.Q();
                        if (objQ8 == gVar) {
                            objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                            sVar2.o0(objQ8);
                        }
                        sVar2.p(false);
                        t.c(riveSurfaceRiveUI$lambda$10, (c) objQ8, sVar2);
                        t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl5, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl5), sVar2);
                        Integer numValueOf5 = Integer.valueOf(iE);
                        sVar2.d0(-225283434);
                        zF = sVar2.f(b1Var);
                        objQ9 = sVar2.Q();
                        if (zF) {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        } else {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        }
                        sVar2.p(false);
                        t.h(fit3, alignment2, numValueOf5, (e) objQ9, sVar2);
                        Fit fit9 = fit3;
                        Alignment alignment8 = alignment2;
                        t.i(new Object[]{lifecycleOwner5, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl5), fit9, alignment8, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner5, b1Var2, commandQueue$kotlin_release, jM192unboximpl5, j11, fit9, alignment8, iE, b1Var, null), sVar2);
                        sVar2.d0(-225237700);
                        objQ10 = sVar2.Q();
                        if (objQ10 == gVar) {
                            objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                            sVar2.o0(objQ10);
                        }
                        sVar2.p(false);
                        Object[] objArr5 = {StateMachineHandle.m186boximpl(jM192unboximpl5), fit9, alignment8, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                        AnonymousClass9 anonymousClass13 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl5, fit9, alignment8, b1Var, a1Var, a1Var2, null);
                        s2.l lVar5 = g0.f51302a;
                        y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr5, new s2.f0(anonymousClass13), 3)), null, sVar2, 6, 4);
                        sVar = sVar2;
                        artboard3 = artboard2;
                        rVar3 = rVar2;
                        fit4 = fit9;
                        alignment3 = alignment8;
                        i26 = iE;
                        viewModelInstance3 = viewModelInstance8;
                    }
                    str3 = str2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
                    }
                }
                i14 |= 12582912;
                if ((i13 & 20) != 20) {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass6 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass6);
                    LifecycleOwner lifecycleOwner6 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release6 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release6) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE8 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE8 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl6 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl6);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance9 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl6)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner6), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl6), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl6, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl6), viewModelInstance9, new AnonymousClass3(viewModelInstance9, commandQueue$kotlin_release, jM192unboximpl6, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$11 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$11, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl6, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl6), sVar2);
                    Integer numValueOf6 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf6, (e) objQ9, sVar2);
                    Fit fit10 = fit3;
                    Alignment alignment9 = alignment2;
                    t.i(new Object[]{lifecycleOwner6, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl6), fit10, alignment9, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner6, b1Var2, commandQueue$kotlin_release, jM192unboximpl6, j11, fit10, alignment9, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr6 = {StateMachineHandle.m186boximpl(jM192unboximpl6), fit10, alignment9, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass14 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl6, fit10, alignment9, b1Var, a1Var, a1Var2, null);
                    s2.l lVar6 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr6, new s2.f0(anonymousClass14), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit10;
                    alignment3 = alignment9;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance9;
                } else {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass7 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass7);
                    LifecycleOwner lifecycleOwner7 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release7 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release7) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE9 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE9 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl7 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl7);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance10 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl7)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner7), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl7), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl7, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl7), viewModelInstance10, new AnonymousClass3(viewModelInstance10, commandQueue$kotlin_release, jM192unboximpl7, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$12 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$12, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl7, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl7), sVar2);
                    Integer numValueOf7 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf7, (e) objQ9, sVar2);
                    Fit fit11 = fit3;
                    Alignment alignment10 = alignment2;
                    t.i(new Object[]{lifecycleOwner7, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl7), fit11, alignment10, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner7, b1Var2, commandQueue$kotlin_release, jM192unboximpl7, j11, fit11, alignment10, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr7 = {StateMachineHandle.m186boximpl(jM192unboximpl7), fit11, alignment10, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass15 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl7, fit11, alignment10, b1Var, a1Var, a1Var2, null);
                    s2.l lVar7 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr7, new s2.f0(anonymousClass15), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit11;
                    alignment3 = alignment10;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance10;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
                }
            }
            i14 |= 3072;
            str2 = str;
            i18 = i13 & 16;
            if (i18 != 0) {
                i14 |= OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                if ((458752 & i12) == 0) {
                    fit2 = fit;
                    if (sVar2.f(fit2)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 64;
                if (i22 != 0) {
                    i14 |= 1572864;
                    alignment2 = alignment;
                } else {
                    alignment2 = alignment;
                    if ((i12 & 3670016) == 0) {
                        if (sVar2.f(alignment2)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    if ((i12 & 29360128) == 0) {
                        if (sVar2.d(i11)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 20) != 20) {
                        if (i27 != 0) {
                            rVar2 = o.f58481a;
                        }
                        if (i15 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i16 != 0) {
                            str2 = null;
                        }
                        if (i18 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if (i19 != 0) {
                            fit3 = Fit.CONTAIN;
                        } else {
                            fit3 = fit2;
                        }
                        if (i22 != 0) {
                            alignment2 = Alignment.CENTER;
                        }
                        if (i24 != 0) {
                            iE = f0.E(x.f28621h);
                        } else {
                            iE = i11;
                        }
                        AnonymousClass1 anonymousClass8 = AnonymousClass1.INSTANCE;
                        riveLog = RiveLog.INSTANCE;
                        riveLog.getLogger().v(GENERAL_TAG, anonymousClass8);
                        LifecycleOwner lifecycleOwner8 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                        long jM22getFileHandleENT3xMk$kotlin_release8 = file.m22getFileHandleENT3xMk$kotlin_release();
                        sVar2.d0(-225424328);
                        zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release8) | sVar2.f(artboard2);
                        objQ = sVar2.Q();
                        gVar = l1.m.f39353a;
                        if (zE) {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        } else {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        }
                        jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225418898);
                        boolean zE10 = sVar2.e(jM95unboximpl);
                        if ((i14 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zE10 | z11;
                        objQ2 = sVar2.Q();
                        if (z12) {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        } else {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        }
                        long jM192unboximpl8 = ((StateMachineHandle) objQ2).m192unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225405461);
                        zE2 = sVar2.e(jM192unboximpl8);
                        objQ3 = sVar2.Q();
                        if (zE2) {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        }
                        b1Var = (b1) objQ3;
                        sVar2.p(false);
                        sVar2.d0(-225403068);
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = t.B(null);
                            sVar2.o0(objQ4);
                        }
                        b1Var2 = (b1) objQ4;
                        sVar2.p(false);
                        sVar2.d0(-225400778);
                        objQ5 = sVar2.Q();
                        if (objQ5 == gVar) {
                            z13 = false;
                            objV = defpackage.e.v(0, sVar2);
                        } else {
                            z13 = false;
                            objV = objQ5;
                        }
                        ViewModelInstance viewModelInstance11 = viewModelInstance2;
                        a1Var = (a1) objV;
                        sVar2.p(z13);
                        sVar2.d0(-225398890);
                        objQ6 = sVar2.Q();
                        if (objQ6 == gVar) {
                            z14 = false;
                            objV2 = defpackage.e.v(0, sVar2);
                        } else {
                            z14 = false;
                            objV2 = objQ6;
                        }
                        a1Var2 = (a1) objV2;
                        sVar2.p(z14);
                        sVar2.d0(-225395994);
                        objQ7 = sVar2.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                    m.f(newSurfaceTexture, "newSurfaceTexture");
                                    Surface surface = new Surface(newSurfaceTexture);
                                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                    b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                    m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                    b1Var2.setValue(null);
                                    return true;
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                }
                            };
                            sVar2.o0(objQ7);
                        }
                        riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                        sVar2.p(z14);
                        RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl8)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner8), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                        t.c(StateMachineHandle.m186boximpl(jM192unboximpl8), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl8, str2, j11, file), sVar2);
                        t.g(StateMachineHandle.m186boximpl(jM192unboximpl8), viewModelInstance11, new AnonymousClass3(viewModelInstance11, commandQueue$kotlin_release, jM192unboximpl8, b1Var, null), sVar2);
                        RiveSurface riveSurfaceRiveUI$lambda$13 = RiveUI$lambda$6(b1Var2);
                        sVar2.d0(-225306504);
                        objQ8 = sVar2.Q();
                        if (objQ8 == gVar) {
                            objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                            sVar2.o0(objQ8);
                        }
                        sVar2.p(false);
                        t.c(riveSurfaceRiveUI$lambda$13, (c) objQ8, sVar2);
                        t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl8, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl8), sVar2);
                        Integer numValueOf8 = Integer.valueOf(iE);
                        sVar2.d0(-225283434);
                        zF = sVar2.f(b1Var);
                        objQ9 = sVar2.Q();
                        if (zF) {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        } else {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        }
                        sVar2.p(false);
                        t.h(fit3, alignment2, numValueOf8, (e) objQ9, sVar2);
                        Fit fit12 = fit3;
                        Alignment alignment11 = alignment2;
                        t.i(new Object[]{lifecycleOwner8, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl8), fit12, alignment11, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner8, b1Var2, commandQueue$kotlin_release, jM192unboximpl8, j11, fit12, alignment11, iE, b1Var, null), sVar2);
                        sVar2.d0(-225237700);
                        objQ10 = sVar2.Q();
                        if (objQ10 == gVar) {
                            objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                            sVar2.o0(objQ10);
                        }
                        sVar2.p(false);
                        Object[] objArr8 = {StateMachineHandle.m186boximpl(jM192unboximpl8), fit12, alignment11, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                        AnonymousClass9 anonymousClass16 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl8, fit12, alignment11, b1Var, a1Var, a1Var2, null);
                        s2.l lVar8 = g0.f51302a;
                        y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr8, new s2.f0(anonymousClass16), 3)), null, sVar2, 6, 4);
                        sVar = sVar2;
                        artboard3 = artboard2;
                        rVar3 = rVar2;
                        fit4 = fit12;
                        alignment3 = alignment11;
                        i26 = iE;
                        viewModelInstance3 = viewModelInstance11;
                    } else {
                        if (i27 != 0) {
                            rVar2 = o.f58481a;
                        }
                        if (i15 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i16 != 0) {
                            str2 = null;
                        }
                        if (i18 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if (i19 != 0) {
                            fit3 = Fit.CONTAIN;
                        } else {
                            fit3 = fit2;
                        }
                        if (i22 != 0) {
                            alignment2 = Alignment.CENTER;
                        }
                        if (i24 != 0) {
                            iE = f0.E(x.f28621h);
                        } else {
                            iE = i11;
                        }
                        AnonymousClass1 anonymousClass17 = AnonymousClass1.INSTANCE;
                        riveLog = RiveLog.INSTANCE;
                        riveLog.getLogger().v(GENERAL_TAG, anonymousClass17);
                        LifecycleOwner lifecycleOwner9 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                        long jM22getFileHandleENT3xMk$kotlin_release9 = file.m22getFileHandleENT3xMk$kotlin_release();
                        sVar2.d0(-225424328);
                        zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release9) | sVar2.f(artboard2);
                        objQ = sVar2.Q();
                        gVar = l1.m.f39353a;
                        if (zE) {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        } else {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        }
                        jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225418898);
                        boolean zE11 = sVar2.e(jM95unboximpl);
                        if ((i14 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zE11 | z11;
                        objQ2 = sVar2.Q();
                        if (z12) {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        } else {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        }
                        long jM192unboximpl9 = ((StateMachineHandle) objQ2).m192unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225405461);
                        zE2 = sVar2.e(jM192unboximpl9);
                        objQ3 = sVar2.Q();
                        if (zE2) {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        }
                        b1Var = (b1) objQ3;
                        sVar2.p(false);
                        sVar2.d0(-225403068);
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = t.B(null);
                            sVar2.o0(objQ4);
                        }
                        b1Var2 = (b1) objQ4;
                        sVar2.p(false);
                        sVar2.d0(-225400778);
                        objQ5 = sVar2.Q();
                        if (objQ5 == gVar) {
                            z13 = false;
                            objV = defpackage.e.v(0, sVar2);
                        } else {
                            z13 = false;
                            objV = objQ5;
                        }
                        ViewModelInstance viewModelInstance12 = viewModelInstance2;
                        a1Var = (a1) objV;
                        sVar2.p(z13);
                        sVar2.d0(-225398890);
                        objQ6 = sVar2.Q();
                        if (objQ6 == gVar) {
                            z14 = false;
                            objV2 = defpackage.e.v(0, sVar2);
                        } else {
                            z14 = false;
                            objV2 = objQ6;
                        }
                        a1Var2 = (a1) objV2;
                        sVar2.p(z14);
                        sVar2.d0(-225395994);
                        objQ7 = sVar2.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                    m.f(newSurfaceTexture, "newSurfaceTexture");
                                    Surface surface = new Surface(newSurfaceTexture);
                                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                    b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                    m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                    b1Var2.setValue(null);
                                    return true;
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                }
                            };
                            sVar2.o0(objQ7);
                        }
                        riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                        sVar2.p(z14);
                        RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl9)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner9), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                        t.c(StateMachineHandle.m186boximpl(jM192unboximpl9), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl9, str2, j11, file), sVar2);
                        t.g(StateMachineHandle.m186boximpl(jM192unboximpl9), viewModelInstance12, new AnonymousClass3(viewModelInstance12, commandQueue$kotlin_release, jM192unboximpl9, b1Var, null), sVar2);
                        RiveSurface riveSurfaceRiveUI$lambda$14 = RiveUI$lambda$6(b1Var2);
                        sVar2.d0(-225306504);
                        objQ8 = sVar2.Q();
                        if (objQ8 == gVar) {
                            objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                            sVar2.o0(objQ8);
                        }
                        sVar2.p(false);
                        t.c(riveSurfaceRiveUI$lambda$14, (c) objQ8, sVar2);
                        t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl9, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl9), sVar2);
                        Integer numValueOf9 = Integer.valueOf(iE);
                        sVar2.d0(-225283434);
                        zF = sVar2.f(b1Var);
                        objQ9 = sVar2.Q();
                        if (zF) {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        } else {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        }
                        sVar2.p(false);
                        t.h(fit3, alignment2, numValueOf9, (e) objQ9, sVar2);
                        Fit fit13 = fit3;
                        Alignment alignment12 = alignment2;
                        t.i(new Object[]{lifecycleOwner9, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl9), fit13, alignment12, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner9, b1Var2, commandQueue$kotlin_release, jM192unboximpl9, j11, fit13, alignment12, iE, b1Var, null), sVar2);
                        sVar2.d0(-225237700);
                        objQ10 = sVar2.Q();
                        if (objQ10 == gVar) {
                            objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                            sVar2.o0(objQ10);
                        }
                        sVar2.p(false);
                        Object[] objArr9 = {StateMachineHandle.m186boximpl(jM192unboximpl9), fit13, alignment12, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                        AnonymousClass9 anonymousClass18 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl9, fit13, alignment12, b1Var, a1Var, a1Var2, null);
                        s2.l lVar9 = g0.f51302a;
                        y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr9, new s2.f0(anonymousClass18), 3)), null, sVar2, 6, 4);
                        sVar = sVar2;
                        artboard3 = artboard2;
                        rVar3 = rVar2;
                        fit4 = fit13;
                        alignment3 = alignment12;
                        i26 = iE;
                        viewModelInstance3 = viewModelInstance12;
                    }
                    str3 = str2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
                    }
                }
                i14 |= 12582912;
                if ((i13 & 20) != 20) {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass19 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass19);
                    LifecycleOwner lifecycleOwner10 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release10 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release10) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE12 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE12 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl10 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl10);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance13 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl10)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner10), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl10), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl10, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl10), viewModelInstance13, new AnonymousClass3(viewModelInstance13, commandQueue$kotlin_release, jM192unboximpl10, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$15 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$15, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl10, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl10), sVar2);
                    Integer numValueOf10 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf10, (e) objQ9, sVar2);
                    Fit fit14 = fit3;
                    Alignment alignment13 = alignment2;
                    t.i(new Object[]{lifecycleOwner10, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl10), fit14, alignment13, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner10, b1Var2, commandQueue$kotlin_release, jM192unboximpl10, j11, fit14, alignment13, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr10 = {StateMachineHandle.m186boximpl(jM192unboximpl10), fit14, alignment13, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass110 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl10, fit14, alignment13, b1Var, a1Var, a1Var2, null);
                    s2.l lVar10 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr10, new s2.f0(anonymousClass110), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit14;
                    alignment3 = alignment13;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance13;
                } else {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass111 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass111);
                    LifecycleOwner lifecycleOwner11 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release11 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release11) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE13 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE13 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl11 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl11);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance14 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl11)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner11), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl11), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl11, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl11), viewModelInstance14, new AnonymousClass3(viewModelInstance14, commandQueue$kotlin_release, jM192unboximpl11, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$16 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$16, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl11, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl11), sVar2);
                    Integer numValueOf11 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf11, (e) objQ9, sVar2);
                    Fit fit15 = fit3;
                    Alignment alignment14 = alignment2;
                    t.i(new Object[]{lifecycleOwner11, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl11), fit15, alignment14, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner11, b1Var2, commandQueue$kotlin_release, jM192unboximpl11, j11, fit15, alignment14, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr11 = {StateMachineHandle.m186boximpl(jM192unboximpl11), fit15, alignment14, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass112 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl11, fit15, alignment14, b1Var, a1Var, a1Var2, null);
                    s2.l lVar11 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr11, new s2.f0(anonymousClass112), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit15;
                    alignment3 = alignment14;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance14;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
                }
            }
            i14 |= 196608;
            fit2 = fit;
            i22 = i13 & 64;
            if (i22 != 0) {
                i14 |= 1572864;
                alignment2 = alignment;
            } else {
                alignment2 = alignment;
                if ((i12 & 3670016) == 0) {
                    if (sVar2.f(alignment2)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                if ((i12 & 29360128) == 0) {
                    if (sVar2.d(i11)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i13 & 20) != 20) {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass113 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass113);
                    LifecycleOwner lifecycleOwner12 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release12 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release12) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE14 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE14 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl12 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl12);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance15 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl12)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner12), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl12), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl12, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl12), viewModelInstance15, new AnonymousClass3(viewModelInstance15, commandQueue$kotlin_release, jM192unboximpl12, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$17 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$17, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl12, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl12), sVar2);
                    Integer numValueOf12 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf12, (e) objQ9, sVar2);
                    Fit fit16 = fit3;
                    Alignment alignment15 = alignment2;
                    t.i(new Object[]{lifecycleOwner12, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl12), fit16, alignment15, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner12, b1Var2, commandQueue$kotlin_release, jM192unboximpl12, j11, fit16, alignment15, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr12 = {StateMachineHandle.m186boximpl(jM192unboximpl12), fit16, alignment15, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass114 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl12, fit16, alignment15, b1Var, a1Var, a1Var2, null);
                    s2.l lVar12 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr12, new s2.f0(anonymousClass114), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit16;
                    alignment3 = alignment15;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance15;
                } else {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass115 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass115);
                    LifecycleOwner lifecycleOwner13 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release13 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release13) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE15 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE15 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl13 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl13);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance16 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl13)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner13), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl13), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl13, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl13), viewModelInstance16, new AnonymousClass3(viewModelInstance16, commandQueue$kotlin_release, jM192unboximpl13, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$18 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$18, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl13, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl13), sVar2);
                    Integer numValueOf13 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf13, (e) objQ9, sVar2);
                    Fit fit17 = fit3;
                    Alignment alignment16 = alignment2;
                    t.i(new Object[]{lifecycleOwner13, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl13), fit17, alignment16, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner13, b1Var2, commandQueue$kotlin_release, jM192unboximpl13, j11, fit17, alignment16, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr13 = {StateMachineHandle.m186boximpl(jM192unboximpl13), fit17, alignment16, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass116 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl13, fit17, alignment16, b1Var, a1Var, a1Var2, null);
                    s2.l lVar13 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr13, new s2.f0(anonymousClass116), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit17;
                    alignment3 = alignment16;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance16;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
                }
            }
            i14 |= 12582912;
            if ((i13 & 20) != 20) {
                if (i27 != 0) {
                    rVar2 = o.f58481a;
                }
                if (i15 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (i18 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if (i19 != 0) {
                    fit3 = Fit.CONTAIN;
                } else {
                    fit3 = fit2;
                }
                if (i22 != 0) {
                    alignment2 = Alignment.CENTER;
                }
                if (i24 != 0) {
                    iE = f0.E(x.f28621h);
                } else {
                    iE = i11;
                }
                AnonymousClass1 anonymousClass117 = AnonymousClass1.INSTANCE;
                riveLog = RiveLog.INSTANCE;
                riveLog.getLogger().v(GENERAL_TAG, anonymousClass117);
                LifecycleOwner lifecycleOwner14 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                long jM22getFileHandleENT3xMk$kotlin_release14 = file.m22getFileHandleENT3xMk$kotlin_release();
                sVar2.d0(-225424328);
                zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release14) | sVar2.f(artboard2);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (zE) {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                } else {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                }
                jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                sVar2.p(false);
                sVar2.d0(-225418898);
                boolean zE16 = sVar2.e(jM95unboximpl);
                if ((i14 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zE16 | z11;
                objQ2 = sVar2.Q();
                if (z12) {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                } else {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                }
                long jM192unboximpl14 = ((StateMachineHandle) objQ2).m192unboximpl();
                sVar2.p(false);
                sVar2.d0(-225405461);
                zE2 = sVar2.e(jM192unboximpl14);
                objQ3 = sVar2.Q();
                if (zE2) {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                }
                b1Var = (b1) objQ3;
                sVar2.p(false);
                sVar2.d0(-225403068);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = t.B(null);
                    sVar2.o0(objQ4);
                }
                b1Var2 = (b1) objQ4;
                sVar2.p(false);
                sVar2.d0(-225400778);
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    z13 = false;
                    objV = defpackage.e.v(0, sVar2);
                } else {
                    z13 = false;
                    objV = objQ5;
                }
                ViewModelInstance viewModelInstance17 = viewModelInstance2;
                a1Var = (a1) objV;
                sVar2.p(z13);
                sVar2.d0(-225398890);
                objQ6 = sVar2.Q();
                if (objQ6 == gVar) {
                    z14 = false;
                    objV2 = defpackage.e.v(0, sVar2);
                } else {
                    z14 = false;
                    objV2 = objQ6;
                }
                a1Var2 = (a1) objV2;
                sVar2.p(z14);
                sVar2.d0(-225395994);
                objQ7 = sVar2.Q();
                if (objQ7 == gVar) {
                    objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                            m.f(newSurfaceTexture, "newSurfaceTexture");
                            Surface surface = new Surface(newSurfaceTexture);
                            RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                            b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                            m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                            b1Var2.setValue(null);
                            return true;
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                            m.f(surfaceTexture, "surfaceTexture");
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                            m.f(surfaceTexture, "surfaceTexture");
                        }
                    };
                    sVar2.o0(objQ7);
                }
                riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                sVar2.p(z14);
                RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl14)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner14), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                t.c(StateMachineHandle.m186boximpl(jM192unboximpl14), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl14, str2, j11, file), sVar2);
                t.g(StateMachineHandle.m186boximpl(jM192unboximpl14), viewModelInstance17, new AnonymousClass3(viewModelInstance17, commandQueue$kotlin_release, jM192unboximpl14, b1Var, null), sVar2);
                RiveSurface riveSurfaceRiveUI$lambda$19 = RiveUI$lambda$6(b1Var2);
                sVar2.d0(-225306504);
                objQ8 = sVar2.Q();
                if (objQ8 == gVar) {
                    objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                    sVar2.o0(objQ8);
                }
                sVar2.p(false);
                t.c(riveSurfaceRiveUI$lambda$19, (c) objQ8, sVar2);
                t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl14, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl14), sVar2);
                Integer numValueOf14 = Integer.valueOf(iE);
                sVar2.d0(-225283434);
                zF = sVar2.f(b1Var);
                objQ9 = sVar2.Q();
                if (zF) {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                } else {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                }
                sVar2.p(false);
                t.h(fit3, alignment2, numValueOf14, (e) objQ9, sVar2);
                Fit fit18 = fit3;
                Alignment alignment17 = alignment2;
                t.i(new Object[]{lifecycleOwner14, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl14), fit18, alignment17, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner14, b1Var2, commandQueue$kotlin_release, jM192unboximpl14, j11, fit18, alignment17, iE, b1Var, null), sVar2);
                sVar2.d0(-225237700);
                objQ10 = sVar2.Q();
                if (objQ10 == gVar) {
                    objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                    sVar2.o0(objQ10);
                }
                sVar2.p(false);
                Object[] objArr14 = {StateMachineHandle.m186boximpl(jM192unboximpl14), fit18, alignment17, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                AnonymousClass9 anonymousClass118 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl14, fit18, alignment17, b1Var, a1Var, a1Var2, null);
                s2.l lVar14 = g0.f51302a;
                y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr14, new s2.f0(anonymousClass118), 3)), null, sVar2, 6, 4);
                sVar = sVar2;
                artboard3 = artboard2;
                rVar3 = rVar2;
                fit4 = fit18;
                alignment3 = alignment17;
                i26 = iE;
                viewModelInstance3 = viewModelInstance17;
            } else {
                if (i27 != 0) {
                    rVar2 = o.f58481a;
                }
                if (i15 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (i18 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if (i19 != 0) {
                    fit3 = Fit.CONTAIN;
                } else {
                    fit3 = fit2;
                }
                if (i22 != 0) {
                    alignment2 = Alignment.CENTER;
                }
                if (i24 != 0) {
                    iE = f0.E(x.f28621h);
                } else {
                    iE = i11;
                }
                AnonymousClass1 anonymousClass119 = AnonymousClass1.INSTANCE;
                riveLog = RiveLog.INSTANCE;
                riveLog.getLogger().v(GENERAL_TAG, anonymousClass119);
                LifecycleOwner lifecycleOwner15 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                long jM22getFileHandleENT3xMk$kotlin_release15 = file.m22getFileHandleENT3xMk$kotlin_release();
                sVar2.d0(-225424328);
                zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release15) | sVar2.f(artboard2);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (zE) {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                } else {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                }
                jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                sVar2.p(false);
                sVar2.d0(-225418898);
                boolean zE17 = sVar2.e(jM95unboximpl);
                if ((i14 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zE17 | z11;
                objQ2 = sVar2.Q();
                if (z12) {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                } else {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                }
                long jM192unboximpl15 = ((StateMachineHandle) objQ2).m192unboximpl();
                sVar2.p(false);
                sVar2.d0(-225405461);
                zE2 = sVar2.e(jM192unboximpl15);
                objQ3 = sVar2.Q();
                if (zE2) {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                }
                b1Var = (b1) objQ3;
                sVar2.p(false);
                sVar2.d0(-225403068);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = t.B(null);
                    sVar2.o0(objQ4);
                }
                b1Var2 = (b1) objQ4;
                sVar2.p(false);
                sVar2.d0(-225400778);
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    z13 = false;
                    objV = defpackage.e.v(0, sVar2);
                } else {
                    z13 = false;
                    objV = objQ5;
                }
                ViewModelInstance viewModelInstance18 = viewModelInstance2;
                a1Var = (a1) objV;
                sVar2.p(z13);
                sVar2.d0(-225398890);
                objQ6 = sVar2.Q();
                if (objQ6 == gVar) {
                    z14 = false;
                    objV2 = defpackage.e.v(0, sVar2);
                } else {
                    z14 = false;
                    objV2 = objQ6;
                }
                a1Var2 = (a1) objV2;
                sVar2.p(z14);
                sVar2.d0(-225395994);
                objQ7 = sVar2.Q();
                if (objQ7 == gVar) {
                    objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                            m.f(newSurfaceTexture, "newSurfaceTexture");
                            Surface surface = new Surface(newSurfaceTexture);
                            RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                            b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                            m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                            b1Var2.setValue(null);
                            return true;
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                            m.f(surfaceTexture, "surfaceTexture");
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                            m.f(surfaceTexture, "surfaceTexture");
                        }
                    };
                    sVar2.o0(objQ7);
                }
                riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                sVar2.p(z14);
                RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl15)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner15), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                t.c(StateMachineHandle.m186boximpl(jM192unboximpl15), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl15, str2, j11, file), sVar2);
                t.g(StateMachineHandle.m186boximpl(jM192unboximpl15), viewModelInstance18, new AnonymousClass3(viewModelInstance18, commandQueue$kotlin_release, jM192unboximpl15, b1Var, null), sVar2);
                RiveSurface riveSurfaceRiveUI$lambda$110 = RiveUI$lambda$6(b1Var2);
                sVar2.d0(-225306504);
                objQ8 = sVar2.Q();
                if (objQ8 == gVar) {
                    objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                    sVar2.o0(objQ8);
                }
                sVar2.p(false);
                t.c(riveSurfaceRiveUI$lambda$110, (c) objQ8, sVar2);
                t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl15, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl15), sVar2);
                Integer numValueOf15 = Integer.valueOf(iE);
                sVar2.d0(-225283434);
                zF = sVar2.f(b1Var);
                objQ9 = sVar2.Q();
                if (zF) {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                } else {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                }
                sVar2.p(false);
                t.h(fit3, alignment2, numValueOf15, (e) objQ9, sVar2);
                Fit fit19 = fit3;
                Alignment alignment18 = alignment2;
                t.i(new Object[]{lifecycleOwner15, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl15), fit19, alignment18, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner15, b1Var2, commandQueue$kotlin_release, jM192unboximpl15, j11, fit19, alignment18, iE, b1Var, null), sVar2);
                sVar2.d0(-225237700);
                objQ10 = sVar2.Q();
                if (objQ10 == gVar) {
                    objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                    sVar2.o0(objQ10);
                }
                sVar2.p(false);
                Object[] objArr15 = {StateMachineHandle.m186boximpl(jM192unboximpl15), fit19, alignment18, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                AnonymousClass9 anonymousClass1110 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl15, fit19, alignment18, b1Var, a1Var, a1Var2, null);
                s2.l lVar15 = g0.f51302a;
                y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr15, new s2.f0(anonymousClass1110), 3)), null, sVar2, 6, 4);
                sVar = sVar2;
                artboard3 = artboard2;
                rVar3 = rVar2;
                fit4 = fit19;
                alignment3 = alignment18;
                i26 = iE;
                viewModelInstance3 = viewModelInstance18;
            }
            str3 = str2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
            }
        }
        i14 |= 48;
        rVar2 = rVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            i14 |= 128;
        }
        i16 = i13 & 8;
        if (i16 != 0) {
            if ((i12 & 7168) == 0) {
                str2 = str;
                if (sVar2.f(str2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i14 |= i17;
            }
            i18 = i13 & 16;
            if (i18 != 0) {
                i14 |= OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                if ((458752 & i12) == 0) {
                    fit2 = fit;
                    if (sVar2.f(fit2)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 64;
                if (i22 != 0) {
                    i14 |= 1572864;
                    alignment2 = alignment;
                } else {
                    alignment2 = alignment;
                    if ((i12 & 3670016) == 0) {
                        if (sVar2.f(alignment2)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    if ((i12 & 29360128) == 0) {
                        if (sVar2.d(i11)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 20) != 20) {
                        if (i27 != 0) {
                            rVar2 = o.f58481a;
                        }
                        if (i15 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i16 != 0) {
                            str2 = null;
                        }
                        if (i18 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if (i19 != 0) {
                            fit3 = Fit.CONTAIN;
                        } else {
                            fit3 = fit2;
                        }
                        if (i22 != 0) {
                            alignment2 = Alignment.CENTER;
                        }
                        if (i24 != 0) {
                            iE = f0.E(x.f28621h);
                        } else {
                            iE = i11;
                        }
                        AnonymousClass1 anonymousClass1111 = AnonymousClass1.INSTANCE;
                        riveLog = RiveLog.INSTANCE;
                        riveLog.getLogger().v(GENERAL_TAG, anonymousClass1111);
                        LifecycleOwner lifecycleOwner16 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                        long jM22getFileHandleENT3xMk$kotlin_release16 = file.m22getFileHandleENT3xMk$kotlin_release();
                        sVar2.d0(-225424328);
                        zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release16) | sVar2.f(artboard2);
                        objQ = sVar2.Q();
                        gVar = l1.m.f39353a;
                        if (zE) {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        } else {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        }
                        jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225418898);
                        boolean zE18 = sVar2.e(jM95unboximpl);
                        if ((i14 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zE18 | z11;
                        objQ2 = sVar2.Q();
                        if (z12) {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        } else {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        }
                        long jM192unboximpl16 = ((StateMachineHandle) objQ2).m192unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225405461);
                        zE2 = sVar2.e(jM192unboximpl16);
                        objQ3 = sVar2.Q();
                        if (zE2) {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        }
                        b1Var = (b1) objQ3;
                        sVar2.p(false);
                        sVar2.d0(-225403068);
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = t.B(null);
                            sVar2.o0(objQ4);
                        }
                        b1Var2 = (b1) objQ4;
                        sVar2.p(false);
                        sVar2.d0(-225400778);
                        objQ5 = sVar2.Q();
                        if (objQ5 == gVar) {
                            z13 = false;
                            objV = defpackage.e.v(0, sVar2);
                        } else {
                            z13 = false;
                            objV = objQ5;
                        }
                        ViewModelInstance viewModelInstance19 = viewModelInstance2;
                        a1Var = (a1) objV;
                        sVar2.p(z13);
                        sVar2.d0(-225398890);
                        objQ6 = sVar2.Q();
                        if (objQ6 == gVar) {
                            z14 = false;
                            objV2 = defpackage.e.v(0, sVar2);
                        } else {
                            z14 = false;
                            objV2 = objQ6;
                        }
                        a1Var2 = (a1) objV2;
                        sVar2.p(z14);
                        sVar2.d0(-225395994);
                        objQ7 = sVar2.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                    m.f(newSurfaceTexture, "newSurfaceTexture");
                                    Surface surface = new Surface(newSurfaceTexture);
                                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                    b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                    m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                    b1Var2.setValue(null);
                                    return true;
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                }
                            };
                            sVar2.o0(objQ7);
                        }
                        riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                        sVar2.p(z14);
                        RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl16)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner16), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                        t.c(StateMachineHandle.m186boximpl(jM192unboximpl16), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl16, str2, j11, file), sVar2);
                        t.g(StateMachineHandle.m186boximpl(jM192unboximpl16), viewModelInstance19, new AnonymousClass3(viewModelInstance19, commandQueue$kotlin_release, jM192unboximpl16, b1Var, null), sVar2);
                        RiveSurface riveSurfaceRiveUI$lambda$111 = RiveUI$lambda$6(b1Var2);
                        sVar2.d0(-225306504);
                        objQ8 = sVar2.Q();
                        if (objQ8 == gVar) {
                            objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                            sVar2.o0(objQ8);
                        }
                        sVar2.p(false);
                        t.c(riveSurfaceRiveUI$lambda$111, (c) objQ8, sVar2);
                        t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl16, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl16), sVar2);
                        Integer numValueOf16 = Integer.valueOf(iE);
                        sVar2.d0(-225283434);
                        zF = sVar2.f(b1Var);
                        objQ9 = sVar2.Q();
                        if (zF) {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        } else {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        }
                        sVar2.p(false);
                        t.h(fit3, alignment2, numValueOf16, (e) objQ9, sVar2);
                        Fit fit110 = fit3;
                        Alignment alignment19 = alignment2;
                        t.i(new Object[]{lifecycleOwner16, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl16), fit110, alignment19, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner16, b1Var2, commandQueue$kotlin_release, jM192unboximpl16, j11, fit110, alignment19, iE, b1Var, null), sVar2);
                        sVar2.d0(-225237700);
                        objQ10 = sVar2.Q();
                        if (objQ10 == gVar) {
                            objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                            sVar2.o0(objQ10);
                        }
                        sVar2.p(false);
                        Object[] objArr16 = {StateMachineHandle.m186boximpl(jM192unboximpl16), fit110, alignment19, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                        AnonymousClass9 anonymousClass1112 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl16, fit110, alignment19, b1Var, a1Var, a1Var2, null);
                        s2.l lVar16 = g0.f51302a;
                        y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr16, new s2.f0(anonymousClass1112), 3)), null, sVar2, 6, 4);
                        sVar = sVar2;
                        artboard3 = artboard2;
                        rVar3 = rVar2;
                        fit4 = fit110;
                        alignment3 = alignment19;
                        i26 = iE;
                        viewModelInstance3 = viewModelInstance19;
                    } else {
                        if (i27 != 0) {
                            rVar2 = o.f58481a;
                        }
                        if (i15 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i16 != 0) {
                            str2 = null;
                        }
                        if (i18 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if (i19 != 0) {
                            fit3 = Fit.CONTAIN;
                        } else {
                            fit3 = fit2;
                        }
                        if (i22 != 0) {
                            alignment2 = Alignment.CENTER;
                        }
                        if (i24 != 0) {
                            iE = f0.E(x.f28621h);
                        } else {
                            iE = i11;
                        }
                        AnonymousClass1 anonymousClass1113 = AnonymousClass1.INSTANCE;
                        riveLog = RiveLog.INSTANCE;
                        riveLog.getLogger().v(GENERAL_TAG, anonymousClass1113);
                        LifecycleOwner lifecycleOwner17 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                        long jM22getFileHandleENT3xMk$kotlin_release17 = file.m22getFileHandleENT3xMk$kotlin_release();
                        sVar2.d0(-225424328);
                        zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release17) | sVar2.f(artboard2);
                        objQ = sVar2.Q();
                        gVar = l1.m.f39353a;
                        if (zE) {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        } else {
                            if (artboard2 != null) {
                                jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                            } else {
                                jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                            }
                            objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                            sVar2.o0(objQ);
                        }
                        jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225418898);
                        boolean zE19 = sVar2.e(jM95unboximpl);
                        if ((i14 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zE19 | z11;
                        objQ2 = sVar2.Q();
                        if (z12) {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        } else {
                            if (str2 != null) {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                            } else {
                                jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                            }
                            j11 = jM95unboximpl;
                            riveFile = file;
                            riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                            objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                            sVar2.o0(objQ2);
                        }
                        long jM192unboximpl17 = ((StateMachineHandle) objQ2).m192unboximpl();
                        sVar2.p(false);
                        sVar2.d0(-225405461);
                        zE2 = sVar2.e(jM192unboximpl17);
                        objQ3 = sVar2.Q();
                        if (zE2) {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        } else {
                            objQ3 = t.B(Boolean.FALSE);
                            sVar2.o0(objQ3);
                        }
                        b1Var = (b1) objQ3;
                        sVar2.p(false);
                        sVar2.d0(-225403068);
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = t.B(null);
                            sVar2.o0(objQ4);
                        }
                        b1Var2 = (b1) objQ4;
                        sVar2.p(false);
                        sVar2.d0(-225400778);
                        objQ5 = sVar2.Q();
                        if (objQ5 == gVar) {
                            z13 = false;
                            objV = defpackage.e.v(0, sVar2);
                        } else {
                            z13 = false;
                            objV = objQ5;
                        }
                        ViewModelInstance viewModelInstance110 = viewModelInstance2;
                        a1Var = (a1) objV;
                        sVar2.p(z13);
                        sVar2.d0(-225398890);
                        objQ6 = sVar2.Q();
                        if (objQ6 == gVar) {
                            z14 = false;
                            objV2 = defpackage.e.v(0, sVar2);
                        } else {
                            z14 = false;
                            objV2 = objQ6;
                        }
                        a1Var2 = (a1) objV2;
                        sVar2.p(z14);
                        sVar2.d0(-225395994);
                        objQ7 = sVar2.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                    m.f(newSurfaceTexture, "newSurfaceTexture");
                                    Surface surface = new Surface(newSurfaceTexture);
                                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                    b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                    m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                    b1Var2.setValue(null);
                                    return true;
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                    RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                    RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                                }

                                @Override // android.view.TextureView.SurfaceTextureListener
                                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                    m.f(surfaceTexture, "surfaceTexture");
                                }
                            };
                            sVar2.o0(objQ7);
                        }
                        riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                        sVar2.p(z14);
                        RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl17)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner17), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                        t.c(StateMachineHandle.m186boximpl(jM192unboximpl17), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl17, str2, j11, file), sVar2);
                        t.g(StateMachineHandle.m186boximpl(jM192unboximpl17), viewModelInstance110, new AnonymousClass3(viewModelInstance110, commandQueue$kotlin_release, jM192unboximpl17, b1Var, null), sVar2);
                        RiveSurface riveSurfaceRiveUI$lambda$112 = RiveUI$lambda$6(b1Var2);
                        sVar2.d0(-225306504);
                        objQ8 = sVar2.Q();
                        if (objQ8 == gVar) {
                            objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                            sVar2.o0(objQ8);
                        }
                        sVar2.p(false);
                        t.c(riveSurfaceRiveUI$lambda$112, (c) objQ8, sVar2);
                        t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl17, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl17), sVar2);
                        Integer numValueOf17 = Integer.valueOf(iE);
                        sVar2.d0(-225283434);
                        zF = sVar2.f(b1Var);
                        objQ9 = sVar2.Q();
                        if (zF) {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        } else {
                            objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                            sVar2.o0(objQ9);
                        }
                        sVar2.p(false);
                        t.h(fit3, alignment2, numValueOf17, (e) objQ9, sVar2);
                        Fit fit111 = fit3;
                        Alignment alignment110 = alignment2;
                        t.i(new Object[]{lifecycleOwner17, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl17), fit111, alignment110, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner17, b1Var2, commandQueue$kotlin_release, jM192unboximpl17, j11, fit111, alignment110, iE, b1Var, null), sVar2);
                        sVar2.d0(-225237700);
                        objQ10 = sVar2.Q();
                        if (objQ10 == gVar) {
                            objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                            sVar2.o0(objQ10);
                        }
                        sVar2.p(false);
                        Object[] objArr17 = {StateMachineHandle.m186boximpl(jM192unboximpl17), fit111, alignment110, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                        AnonymousClass9 anonymousClass1114 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl17, fit111, alignment110, b1Var, a1Var, a1Var2, null);
                        s2.l lVar17 = g0.f51302a;
                        y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr17, new s2.f0(anonymousClass1114), 3)), null, sVar2, 6, 4);
                        sVar = sVar2;
                        artboard3 = artboard2;
                        rVar3 = rVar2;
                        fit4 = fit111;
                        alignment3 = alignment110;
                        i26 = iE;
                        viewModelInstance3 = viewModelInstance110;
                    }
                    str3 = str2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
                    }
                }
                i14 |= 12582912;
                if ((i13 & 20) != 20) {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass1115 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass1115);
                    LifecycleOwner lifecycleOwner18 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release18 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release18) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE110 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE110 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl18 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl18);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance111 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl18)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner18), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl18), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl18, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl18), viewModelInstance111, new AnonymousClass3(viewModelInstance111, commandQueue$kotlin_release, jM192unboximpl18, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$113 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$113, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl18, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl18), sVar2);
                    Integer numValueOf18 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf18, (e) objQ9, sVar2);
                    Fit fit112 = fit3;
                    Alignment alignment111 = alignment2;
                    t.i(new Object[]{lifecycleOwner18, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl18), fit112, alignment111, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner18, b1Var2, commandQueue$kotlin_release, jM192unboximpl18, j11, fit112, alignment111, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr18 = {StateMachineHandle.m186boximpl(jM192unboximpl18), fit112, alignment111, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass1116 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl18, fit112, alignment111, b1Var, a1Var, a1Var2, null);
                    s2.l lVar18 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr18, new s2.f0(anonymousClass1116), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit112;
                    alignment3 = alignment111;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance111;
                } else {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass1117 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass1117);
                    LifecycleOwner lifecycleOwner19 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release19 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release19) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE111 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE111 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl19 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl19);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance112 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl19)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner19), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl19), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl19, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl19), viewModelInstance112, new AnonymousClass3(viewModelInstance112, commandQueue$kotlin_release, jM192unboximpl19, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$114 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$114, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl19, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl19), sVar2);
                    Integer numValueOf19 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf19, (e) objQ9, sVar2);
                    Fit fit113 = fit3;
                    Alignment alignment112 = alignment2;
                    t.i(new Object[]{lifecycleOwner19, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl19), fit113, alignment112, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner19, b1Var2, commandQueue$kotlin_release, jM192unboximpl19, j11, fit113, alignment112, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr19 = {StateMachineHandle.m186boximpl(jM192unboximpl19), fit113, alignment112, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass1118 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl19, fit113, alignment112, b1Var, a1Var, a1Var2, null);
                    s2.l lVar19 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr19, new s2.f0(anonymousClass1118), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit113;
                    alignment3 = alignment112;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance112;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
                }
            }
            i14 |= 196608;
            fit2 = fit;
            i22 = i13 & 64;
            if (i22 != 0) {
                i14 |= 1572864;
                alignment2 = alignment;
            } else {
                alignment2 = alignment;
                if ((i12 & 3670016) == 0) {
                    if (sVar2.f(alignment2)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                if ((i12 & 29360128) == 0) {
                    if (sVar2.d(i11)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i13 & 20) != 20) {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass1119 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass1119);
                    LifecycleOwner lifecycleOwner110 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release110 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release110) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE112 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE112 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl110 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl110);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance113 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl110)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner110), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl110), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl110, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl110), viewModelInstance113, new AnonymousClass3(viewModelInstance113, commandQueue$kotlin_release, jM192unboximpl110, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$115 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$115, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl110, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl110), sVar2);
                    Integer numValueOf110 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf110, (e) objQ9, sVar2);
                    Fit fit114 = fit3;
                    Alignment alignment113 = alignment2;
                    t.i(new Object[]{lifecycleOwner110, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl110), fit114, alignment113, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner110, b1Var2, commandQueue$kotlin_release, jM192unboximpl110, j11, fit114, alignment113, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr110 = {StateMachineHandle.m186boximpl(jM192unboximpl110), fit114, alignment113, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass11110 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl110, fit114, alignment113, b1Var, a1Var, a1Var2, null);
                    s2.l lVar110 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr110, new s2.f0(anonymousClass11110), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit114;
                    alignment3 = alignment113;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance113;
                } else {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass11111 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass11111);
                    LifecycleOwner lifecycleOwner111 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release111 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release111) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE113 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE113 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl111 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl111);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance114 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl111)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner111), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl111), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl111, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl111), viewModelInstance114, new AnonymousClass3(viewModelInstance114, commandQueue$kotlin_release, jM192unboximpl111, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$116 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$116, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl111, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl111), sVar2);
                    Integer numValueOf111 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf111, (e) objQ9, sVar2);
                    Fit fit115 = fit3;
                    Alignment alignment114 = alignment2;
                    t.i(new Object[]{lifecycleOwner111, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl111), fit115, alignment114, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner111, b1Var2, commandQueue$kotlin_release, jM192unboximpl111, j11, fit115, alignment114, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr111 = {StateMachineHandle.m186boximpl(jM192unboximpl111), fit115, alignment114, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass11112 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl111, fit115, alignment114, b1Var, a1Var, a1Var2, null);
                    s2.l lVar111 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr111, new s2.f0(anonymousClass11112), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit115;
                    alignment3 = alignment114;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance114;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
                }
            }
            i14 |= 12582912;
            if ((i13 & 20) != 20) {
                if (i27 != 0) {
                    rVar2 = o.f58481a;
                }
                if (i15 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (i18 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if (i19 != 0) {
                    fit3 = Fit.CONTAIN;
                } else {
                    fit3 = fit2;
                }
                if (i22 != 0) {
                    alignment2 = Alignment.CENTER;
                }
                if (i24 != 0) {
                    iE = f0.E(x.f28621h);
                } else {
                    iE = i11;
                }
                AnonymousClass1 anonymousClass11113 = AnonymousClass1.INSTANCE;
                riveLog = RiveLog.INSTANCE;
                riveLog.getLogger().v(GENERAL_TAG, anonymousClass11113);
                LifecycleOwner lifecycleOwner112 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                long jM22getFileHandleENT3xMk$kotlin_release112 = file.m22getFileHandleENT3xMk$kotlin_release();
                sVar2.d0(-225424328);
                zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release112) | sVar2.f(artboard2);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (zE) {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                } else {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                }
                jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                sVar2.p(false);
                sVar2.d0(-225418898);
                boolean zE114 = sVar2.e(jM95unboximpl);
                if ((i14 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zE114 | z11;
                objQ2 = sVar2.Q();
                if (z12) {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                } else {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                }
                long jM192unboximpl112 = ((StateMachineHandle) objQ2).m192unboximpl();
                sVar2.p(false);
                sVar2.d0(-225405461);
                zE2 = sVar2.e(jM192unboximpl112);
                objQ3 = sVar2.Q();
                if (zE2) {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                }
                b1Var = (b1) objQ3;
                sVar2.p(false);
                sVar2.d0(-225403068);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = t.B(null);
                    sVar2.o0(objQ4);
                }
                b1Var2 = (b1) objQ4;
                sVar2.p(false);
                sVar2.d0(-225400778);
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    z13 = false;
                    objV = defpackage.e.v(0, sVar2);
                } else {
                    z13 = false;
                    objV = objQ5;
                }
                ViewModelInstance viewModelInstance115 = viewModelInstance2;
                a1Var = (a1) objV;
                sVar2.p(z13);
                sVar2.d0(-225398890);
                objQ6 = sVar2.Q();
                if (objQ6 == gVar) {
                    z14 = false;
                    objV2 = defpackage.e.v(0, sVar2);
                } else {
                    z14 = false;
                    objV2 = objQ6;
                }
                a1Var2 = (a1) objV2;
                sVar2.p(z14);
                sVar2.d0(-225395994);
                objQ7 = sVar2.Q();
                if (objQ7 == gVar) {
                    objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                            m.f(newSurfaceTexture, "newSurfaceTexture");
                            Surface surface = new Surface(newSurfaceTexture);
                            RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                            b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                            m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                            b1Var2.setValue(null);
                            return true;
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                            m.f(surfaceTexture, "surfaceTexture");
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                            m.f(surfaceTexture, "surfaceTexture");
                        }
                    };
                    sVar2.o0(objQ7);
                }
                riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                sVar2.p(z14);
                RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl112)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner112), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                t.c(StateMachineHandle.m186boximpl(jM192unboximpl112), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl112, str2, j11, file), sVar2);
                t.g(StateMachineHandle.m186boximpl(jM192unboximpl112), viewModelInstance115, new AnonymousClass3(viewModelInstance115, commandQueue$kotlin_release, jM192unboximpl112, b1Var, null), sVar2);
                RiveSurface riveSurfaceRiveUI$lambda$117 = RiveUI$lambda$6(b1Var2);
                sVar2.d0(-225306504);
                objQ8 = sVar2.Q();
                if (objQ8 == gVar) {
                    objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                    sVar2.o0(objQ8);
                }
                sVar2.p(false);
                t.c(riveSurfaceRiveUI$lambda$117, (c) objQ8, sVar2);
                t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl112, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl112), sVar2);
                Integer numValueOf112 = Integer.valueOf(iE);
                sVar2.d0(-225283434);
                zF = sVar2.f(b1Var);
                objQ9 = sVar2.Q();
                if (zF) {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                } else {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                }
                sVar2.p(false);
                t.h(fit3, alignment2, numValueOf112, (e) objQ9, sVar2);
                Fit fit116 = fit3;
                Alignment alignment115 = alignment2;
                t.i(new Object[]{lifecycleOwner112, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl112), fit116, alignment115, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner112, b1Var2, commandQueue$kotlin_release, jM192unboximpl112, j11, fit116, alignment115, iE, b1Var, null), sVar2);
                sVar2.d0(-225237700);
                objQ10 = sVar2.Q();
                if (objQ10 == gVar) {
                    objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                    sVar2.o0(objQ10);
                }
                sVar2.p(false);
                Object[] objArr112 = {StateMachineHandle.m186boximpl(jM192unboximpl112), fit116, alignment115, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                AnonymousClass9 anonymousClass11114 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl112, fit116, alignment115, b1Var, a1Var, a1Var2, null);
                s2.l lVar112 = g0.f51302a;
                y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr112, new s2.f0(anonymousClass11114), 3)), null, sVar2, 6, 4);
                sVar = sVar2;
                artboard3 = artboard2;
                rVar3 = rVar2;
                fit4 = fit116;
                alignment3 = alignment115;
                i26 = iE;
                viewModelInstance3 = viewModelInstance115;
            } else {
                if (i27 != 0) {
                    rVar2 = o.f58481a;
                }
                if (i15 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (i18 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if (i19 != 0) {
                    fit3 = Fit.CONTAIN;
                } else {
                    fit3 = fit2;
                }
                if (i22 != 0) {
                    alignment2 = Alignment.CENTER;
                }
                if (i24 != 0) {
                    iE = f0.E(x.f28621h);
                } else {
                    iE = i11;
                }
                AnonymousClass1 anonymousClass11115 = AnonymousClass1.INSTANCE;
                riveLog = RiveLog.INSTANCE;
                riveLog.getLogger().v(GENERAL_TAG, anonymousClass11115);
                LifecycleOwner lifecycleOwner113 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                long jM22getFileHandleENT3xMk$kotlin_release113 = file.m22getFileHandleENT3xMk$kotlin_release();
                sVar2.d0(-225424328);
                zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release113) | sVar2.f(artboard2);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (zE) {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                } else {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                }
                jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                sVar2.p(false);
                sVar2.d0(-225418898);
                boolean zE115 = sVar2.e(jM95unboximpl);
                if ((i14 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zE115 | z11;
                objQ2 = sVar2.Q();
                if (z12) {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                } else {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                }
                long jM192unboximpl113 = ((StateMachineHandle) objQ2).m192unboximpl();
                sVar2.p(false);
                sVar2.d0(-225405461);
                zE2 = sVar2.e(jM192unboximpl113);
                objQ3 = sVar2.Q();
                if (zE2) {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                }
                b1Var = (b1) objQ3;
                sVar2.p(false);
                sVar2.d0(-225403068);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = t.B(null);
                    sVar2.o0(objQ4);
                }
                b1Var2 = (b1) objQ4;
                sVar2.p(false);
                sVar2.d0(-225400778);
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    z13 = false;
                    objV = defpackage.e.v(0, sVar2);
                } else {
                    z13 = false;
                    objV = objQ5;
                }
                ViewModelInstance viewModelInstance116 = viewModelInstance2;
                a1Var = (a1) objV;
                sVar2.p(z13);
                sVar2.d0(-225398890);
                objQ6 = sVar2.Q();
                if (objQ6 == gVar) {
                    z14 = false;
                    objV2 = defpackage.e.v(0, sVar2);
                } else {
                    z14 = false;
                    objV2 = objQ6;
                }
                a1Var2 = (a1) objV2;
                sVar2.p(z14);
                sVar2.d0(-225395994);
                objQ7 = sVar2.Q();
                if (objQ7 == gVar) {
                    objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                            m.f(newSurfaceTexture, "newSurfaceTexture");
                            Surface surface = new Surface(newSurfaceTexture);
                            RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                            b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                            m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                            b1Var2.setValue(null);
                            return true;
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                            m.f(surfaceTexture, "surfaceTexture");
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                            m.f(surfaceTexture, "surfaceTexture");
                        }
                    };
                    sVar2.o0(objQ7);
                }
                riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                sVar2.p(z14);
                RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl113)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner113), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                t.c(StateMachineHandle.m186boximpl(jM192unboximpl113), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl113, str2, j11, file), sVar2);
                t.g(StateMachineHandle.m186boximpl(jM192unboximpl113), viewModelInstance116, new AnonymousClass3(viewModelInstance116, commandQueue$kotlin_release, jM192unboximpl113, b1Var, null), sVar2);
                RiveSurface riveSurfaceRiveUI$lambda$118 = RiveUI$lambda$6(b1Var2);
                sVar2.d0(-225306504);
                objQ8 = sVar2.Q();
                if (objQ8 == gVar) {
                    objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                    sVar2.o0(objQ8);
                }
                sVar2.p(false);
                t.c(riveSurfaceRiveUI$lambda$118, (c) objQ8, sVar2);
                t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl113, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl113), sVar2);
                Integer numValueOf113 = Integer.valueOf(iE);
                sVar2.d0(-225283434);
                zF = sVar2.f(b1Var);
                objQ9 = sVar2.Q();
                if (zF) {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                } else {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                }
                sVar2.p(false);
                t.h(fit3, alignment2, numValueOf113, (e) objQ9, sVar2);
                Fit fit117 = fit3;
                Alignment alignment116 = alignment2;
                t.i(new Object[]{lifecycleOwner113, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl113), fit117, alignment116, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner113, b1Var2, commandQueue$kotlin_release, jM192unboximpl113, j11, fit117, alignment116, iE, b1Var, null), sVar2);
                sVar2.d0(-225237700);
                objQ10 = sVar2.Q();
                if (objQ10 == gVar) {
                    objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                    sVar2.o0(objQ10);
                }
                sVar2.p(false);
                Object[] objArr113 = {StateMachineHandle.m186boximpl(jM192unboximpl113), fit117, alignment116, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                AnonymousClass9 anonymousClass11116 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl113, fit117, alignment116, b1Var, a1Var, a1Var2, null);
                s2.l lVar113 = g0.f51302a;
                y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr113, new s2.f0(anonymousClass11116), 3)), null, sVar2, 6, 4);
                sVar = sVar2;
                artboard3 = artboard2;
                rVar3 = rVar2;
                fit4 = fit117;
                alignment3 = alignment116;
                i26 = iE;
                viewModelInstance3 = viewModelInstance116;
            }
            str3 = str2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
            }
        }
        i14 |= 3072;
        str2 = str;
        i18 = i13 & 16;
        if (i18 != 0) {
            i14 |= OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        i19 = i13 & 32;
        if (i19 != 0) {
            if ((458752 & i12) == 0) {
                fit2 = fit;
                if (sVar2.f(fit2)) {
                    i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i21 = 65536;
                }
                i14 |= i21;
            }
            i22 = i13 & 64;
            if (i22 != 0) {
                i14 |= 1572864;
                alignment2 = alignment;
            } else {
                alignment2 = alignment;
                if ((i12 & 3670016) == 0) {
                    if (sVar2.f(alignment2)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                if ((i12 & 29360128) == 0) {
                    if (sVar2.d(i11)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i13 & 20) != 20) {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass11117 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass11117);
                    LifecycleOwner lifecycleOwner114 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release114 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release114) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE116 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE116 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl114 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl114);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance117 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl114)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner114), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl114), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl114, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl114), viewModelInstance117, new AnonymousClass3(viewModelInstance117, commandQueue$kotlin_release, jM192unboximpl114, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$119 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$119, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl114, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl114), sVar2);
                    Integer numValueOf114 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf114, (e) objQ9, sVar2);
                    Fit fit118 = fit3;
                    Alignment alignment117 = alignment2;
                    t.i(new Object[]{lifecycleOwner114, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl114), fit118, alignment117, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner114, b1Var2, commandQueue$kotlin_release, jM192unboximpl114, j11, fit118, alignment117, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr114 = {StateMachineHandle.m186boximpl(jM192unboximpl114), fit118, alignment117, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass11118 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl114, fit118, alignment117, b1Var, a1Var, a1Var2, null);
                    s2.l lVar114 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr114, new s2.f0(anonymousClass11118), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit118;
                    alignment3 = alignment117;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance117;
                } else {
                    if (i27 != 0) {
                        rVar2 = o.f58481a;
                    }
                    if (i15 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (i18 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i19 != 0) {
                        fit3 = Fit.CONTAIN;
                    } else {
                        fit3 = fit2;
                    }
                    if (i22 != 0) {
                        alignment2 = Alignment.CENTER;
                    }
                    if (i24 != 0) {
                        iE = f0.E(x.f28621h);
                    } else {
                        iE = i11;
                    }
                    AnonymousClass1 anonymousClass11119 = AnonymousClass1.INSTANCE;
                    riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().v(GENERAL_TAG, anonymousClass11119);
                    LifecycleOwner lifecycleOwner115 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                    long jM22getFileHandleENT3xMk$kotlin_release115 = file.m22getFileHandleENT3xMk$kotlin_release();
                    sVar2.d0(-225424328);
                    zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release115) | sVar2.f(artboard2);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (zE) {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    } else {
                        if (artboard2 != null) {
                            jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                        } else {
                            jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                        }
                        objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                        sVar2.o0(objQ);
                    }
                    jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225418898);
                    boolean zE117 = sVar2.e(jM95unboximpl);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zE117 | z11;
                    objQ2 = sVar2.Q();
                    if (z12) {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    } else {
                        if (str2 != null) {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                        } else {
                            jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                        }
                        j11 = jM95unboximpl;
                        riveFile = file;
                        riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                        objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                        sVar2.o0(objQ2);
                    }
                    long jM192unboximpl115 = ((StateMachineHandle) objQ2).m192unboximpl();
                    sVar2.p(false);
                    sVar2.d0(-225405461);
                    zE2 = sVar2.e(jM192unboximpl115);
                    objQ3 = sVar2.Q();
                    if (zE2) {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    } else {
                        objQ3 = t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var = (b1) objQ3;
                    sVar2.p(false);
                    sVar2.d0(-225403068);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (b1) objQ4;
                    sVar2.p(false);
                    sVar2.d0(-225400778);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        z13 = false;
                        objV = defpackage.e.v(0, sVar2);
                    } else {
                        z13 = false;
                        objV = objQ5;
                    }
                    ViewModelInstance viewModelInstance118 = viewModelInstance2;
                    a1Var = (a1) objV;
                    sVar2.p(z13);
                    sVar2.d0(-225398890);
                    objQ6 = sVar2.Q();
                    if (objQ6 == gVar) {
                        z14 = false;
                        objV2 = defpackage.e.v(0, sVar2);
                    } else {
                        z14 = false;
                        objV2 = objQ6;
                    }
                    a1Var2 = (a1) objV2;
                    sVar2.p(z14);
                    sVar2.d0(-225395994);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                                m.f(newSurfaceTexture, "newSurfaceTexture");
                                Surface surface = new Surface(newSurfaceTexture);
                                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                                b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                                m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                                b1Var2.setValue(null);
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                                m.f(surfaceTexture, "surfaceTexture");
                                RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                                RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                m.f(surfaceTexture, "surfaceTexture");
                            }
                        };
                        sVar2.o0(objQ7);
                    }
                    riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                    sVar2.p(z14);
                    RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl115)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner115), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                    t.c(StateMachineHandle.m186boximpl(jM192unboximpl115), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl115, str2, j11, file), sVar2);
                    t.g(StateMachineHandle.m186boximpl(jM192unboximpl115), viewModelInstance118, new AnonymousClass3(viewModelInstance118, commandQueue$kotlin_release, jM192unboximpl115, b1Var, null), sVar2);
                    RiveSurface riveSurfaceRiveUI$lambda$1110 = RiveUI$lambda$6(b1Var2);
                    sVar2.d0(-225306504);
                    objQ8 = sVar2.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                        sVar2.o0(objQ8);
                    }
                    sVar2.p(false);
                    t.c(riveSurfaceRiveUI$lambda$1110, (c) objQ8, sVar2);
                    t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl115, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl115), sVar2);
                    Integer numValueOf115 = Integer.valueOf(iE);
                    sVar2.d0(-225283434);
                    zF = sVar2.f(b1Var);
                    objQ9 = sVar2.Q();
                    if (zF) {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    } else {
                        objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                        sVar2.o0(objQ9);
                    }
                    sVar2.p(false);
                    t.h(fit3, alignment2, numValueOf115, (e) objQ9, sVar2);
                    Fit fit119 = fit3;
                    Alignment alignment118 = alignment2;
                    t.i(new Object[]{lifecycleOwner115, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl115), fit119, alignment118, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner115, b1Var2, commandQueue$kotlin_release, jM192unboximpl115, j11, fit119, alignment118, iE, b1Var, null), sVar2);
                    sVar2.d0(-225237700);
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                        sVar2.o0(objQ10);
                    }
                    sVar2.p(false);
                    Object[] objArr115 = {StateMachineHandle.m186boximpl(jM192unboximpl115), fit119, alignment118, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                    AnonymousClass9 anonymousClass111110 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl115, fit119, alignment118, b1Var, a1Var, a1Var2, null);
                    s2.l lVar115 = g0.f51302a;
                    y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr115, new s2.f0(anonymousClass111110), 3)), null, sVar2, 6, 4);
                    sVar = sVar2;
                    artboard3 = artboard2;
                    rVar3 = rVar2;
                    fit4 = fit119;
                    alignment3 = alignment118;
                    i26 = iE;
                    viewModelInstance3 = viewModelInstance118;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
                }
            }
            i14 |= 12582912;
            if ((i13 & 20) != 20) {
                if (i27 != 0) {
                    rVar2 = o.f58481a;
                }
                if (i15 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (i18 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if (i19 != 0) {
                    fit3 = Fit.CONTAIN;
                } else {
                    fit3 = fit2;
                }
                if (i22 != 0) {
                    alignment2 = Alignment.CENTER;
                }
                if (i24 != 0) {
                    iE = f0.E(x.f28621h);
                } else {
                    iE = i11;
                }
                AnonymousClass1 anonymousClass111111 = AnonymousClass1.INSTANCE;
                riveLog = RiveLog.INSTANCE;
                riveLog.getLogger().v(GENERAL_TAG, anonymousClass111111);
                LifecycleOwner lifecycleOwner116 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                long jM22getFileHandleENT3xMk$kotlin_release116 = file.m22getFileHandleENT3xMk$kotlin_release();
                sVar2.d0(-225424328);
                zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release116) | sVar2.f(artboard2);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (zE) {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                } else {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                }
                jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                sVar2.p(false);
                sVar2.d0(-225418898);
                boolean zE118 = sVar2.e(jM95unboximpl);
                if ((i14 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zE118 | z11;
                objQ2 = sVar2.Q();
                if (z12) {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                } else {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                }
                long jM192unboximpl116 = ((StateMachineHandle) objQ2).m192unboximpl();
                sVar2.p(false);
                sVar2.d0(-225405461);
                zE2 = sVar2.e(jM192unboximpl116);
                objQ3 = sVar2.Q();
                if (zE2) {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                }
                b1Var = (b1) objQ3;
                sVar2.p(false);
                sVar2.d0(-225403068);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = t.B(null);
                    sVar2.o0(objQ4);
                }
                b1Var2 = (b1) objQ4;
                sVar2.p(false);
                sVar2.d0(-225400778);
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    z13 = false;
                    objV = defpackage.e.v(0, sVar2);
                } else {
                    z13 = false;
                    objV = objQ5;
                }
                ViewModelInstance viewModelInstance119 = viewModelInstance2;
                a1Var = (a1) objV;
                sVar2.p(z13);
                sVar2.d0(-225398890);
                objQ6 = sVar2.Q();
                if (objQ6 == gVar) {
                    z14 = false;
                    objV2 = defpackage.e.v(0, sVar2);
                } else {
                    z14 = false;
                    objV2 = objQ6;
                }
                a1Var2 = (a1) objV2;
                sVar2.p(z14);
                sVar2.d0(-225395994);
                objQ7 = sVar2.Q();
                if (objQ7 == gVar) {
                    objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                            m.f(newSurfaceTexture, "newSurfaceTexture");
                            Surface surface = new Surface(newSurfaceTexture);
                            RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                            b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                            m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                            b1Var2.setValue(null);
                            return true;
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                            m.f(surfaceTexture, "surfaceTexture");
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                            m.f(surfaceTexture, "surfaceTexture");
                        }
                    };
                    sVar2.o0(objQ7);
                }
                riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                sVar2.p(z14);
                RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl116)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner116), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                t.c(StateMachineHandle.m186boximpl(jM192unboximpl116), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl116, str2, j11, file), sVar2);
                t.g(StateMachineHandle.m186boximpl(jM192unboximpl116), viewModelInstance119, new AnonymousClass3(viewModelInstance119, commandQueue$kotlin_release, jM192unboximpl116, b1Var, null), sVar2);
                RiveSurface riveSurfaceRiveUI$lambda$1111 = RiveUI$lambda$6(b1Var2);
                sVar2.d0(-225306504);
                objQ8 = sVar2.Q();
                if (objQ8 == gVar) {
                    objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                    sVar2.o0(objQ8);
                }
                sVar2.p(false);
                t.c(riveSurfaceRiveUI$lambda$1111, (c) objQ8, sVar2);
                t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl116, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl116), sVar2);
                Integer numValueOf116 = Integer.valueOf(iE);
                sVar2.d0(-225283434);
                zF = sVar2.f(b1Var);
                objQ9 = sVar2.Q();
                if (zF) {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                } else {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                }
                sVar2.p(false);
                t.h(fit3, alignment2, numValueOf116, (e) objQ9, sVar2);
                Fit fit1110 = fit3;
                Alignment alignment119 = alignment2;
                t.i(new Object[]{lifecycleOwner116, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl116), fit1110, alignment119, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner116, b1Var2, commandQueue$kotlin_release, jM192unboximpl116, j11, fit1110, alignment119, iE, b1Var, null), sVar2);
                sVar2.d0(-225237700);
                objQ10 = sVar2.Q();
                if (objQ10 == gVar) {
                    objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                    sVar2.o0(objQ10);
                }
                sVar2.p(false);
                Object[] objArr116 = {StateMachineHandle.m186boximpl(jM192unboximpl116), fit1110, alignment119, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                AnonymousClass9 anonymousClass111112 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl116, fit1110, alignment119, b1Var, a1Var, a1Var2, null);
                s2.l lVar116 = g0.f51302a;
                y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr116, new s2.f0(anonymousClass111112), 3)), null, sVar2, 6, 4);
                sVar = sVar2;
                artboard3 = artboard2;
                rVar3 = rVar2;
                fit4 = fit1110;
                alignment3 = alignment119;
                i26 = iE;
                viewModelInstance3 = viewModelInstance119;
            } else {
                if (i27 != 0) {
                    rVar2 = o.f58481a;
                }
                if (i15 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (i18 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if (i19 != 0) {
                    fit3 = Fit.CONTAIN;
                } else {
                    fit3 = fit2;
                }
                if (i22 != 0) {
                    alignment2 = Alignment.CENTER;
                }
                if (i24 != 0) {
                    iE = f0.E(x.f28621h);
                } else {
                    iE = i11;
                }
                AnonymousClass1 anonymousClass111113 = AnonymousClass1.INSTANCE;
                riveLog = RiveLog.INSTANCE;
                riveLog.getLogger().v(GENERAL_TAG, anonymousClass111113);
                LifecycleOwner lifecycleOwner117 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                long jM22getFileHandleENT3xMk$kotlin_release117 = file.m22getFileHandleENT3xMk$kotlin_release();
                sVar2.d0(-225424328);
                zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release117) | sVar2.f(artboard2);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (zE) {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                } else {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                }
                jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                sVar2.p(false);
                sVar2.d0(-225418898);
                boolean zE119 = sVar2.e(jM95unboximpl);
                if ((i14 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zE119 | z11;
                objQ2 = sVar2.Q();
                if (z12) {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                } else {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                }
                long jM192unboximpl117 = ((StateMachineHandle) objQ2).m192unboximpl();
                sVar2.p(false);
                sVar2.d0(-225405461);
                zE2 = sVar2.e(jM192unboximpl117);
                objQ3 = sVar2.Q();
                if (zE2) {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                }
                b1Var = (b1) objQ3;
                sVar2.p(false);
                sVar2.d0(-225403068);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = t.B(null);
                    sVar2.o0(objQ4);
                }
                b1Var2 = (b1) objQ4;
                sVar2.p(false);
                sVar2.d0(-225400778);
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    z13 = false;
                    objV = defpackage.e.v(0, sVar2);
                } else {
                    z13 = false;
                    objV = objQ5;
                }
                ViewModelInstance viewModelInstance1110 = viewModelInstance2;
                a1Var = (a1) objV;
                sVar2.p(z13);
                sVar2.d0(-225398890);
                objQ6 = sVar2.Q();
                if (objQ6 == gVar) {
                    z14 = false;
                    objV2 = defpackage.e.v(0, sVar2);
                } else {
                    z14 = false;
                    objV2 = objQ6;
                }
                a1Var2 = (a1) objV2;
                sVar2.p(z14);
                sVar2.d0(-225395994);
                objQ7 = sVar2.Q();
                if (objQ7 == gVar) {
                    objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                            m.f(newSurfaceTexture, "newSurfaceTexture");
                            Surface surface = new Surface(newSurfaceTexture);
                            RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                            b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                            m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                            b1Var2.setValue(null);
                            return true;
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                            m.f(surfaceTexture, "surfaceTexture");
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                            m.f(surfaceTexture, "surfaceTexture");
                        }
                    };
                    sVar2.o0(objQ7);
                }
                riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                sVar2.p(z14);
                RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl117)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner117), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                t.c(StateMachineHandle.m186boximpl(jM192unboximpl117), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl117, str2, j11, file), sVar2);
                t.g(StateMachineHandle.m186boximpl(jM192unboximpl117), viewModelInstance1110, new AnonymousClass3(viewModelInstance1110, commandQueue$kotlin_release, jM192unboximpl117, b1Var, null), sVar2);
                RiveSurface riveSurfaceRiveUI$lambda$1112 = RiveUI$lambda$6(b1Var2);
                sVar2.d0(-225306504);
                objQ8 = sVar2.Q();
                if (objQ8 == gVar) {
                    objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                    sVar2.o0(objQ8);
                }
                sVar2.p(false);
                t.c(riveSurfaceRiveUI$lambda$1112, (c) objQ8, sVar2);
                t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl117, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl117), sVar2);
                Integer numValueOf117 = Integer.valueOf(iE);
                sVar2.d0(-225283434);
                zF = sVar2.f(b1Var);
                objQ9 = sVar2.Q();
                if (zF) {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                } else {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                }
                sVar2.p(false);
                t.h(fit3, alignment2, numValueOf117, (e) objQ9, sVar2);
                Fit fit1111 = fit3;
                Alignment alignment1110 = alignment2;
                t.i(new Object[]{lifecycleOwner117, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl117), fit1111, alignment1110, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner117, b1Var2, commandQueue$kotlin_release, jM192unboximpl117, j11, fit1111, alignment1110, iE, b1Var, null), sVar2);
                sVar2.d0(-225237700);
                objQ10 = sVar2.Q();
                if (objQ10 == gVar) {
                    objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                    sVar2.o0(objQ10);
                }
                sVar2.p(false);
                Object[] objArr117 = {StateMachineHandle.m186boximpl(jM192unboximpl117), fit1111, alignment1110, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                AnonymousClass9 anonymousClass111114 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl117, fit1111, alignment1110, b1Var, a1Var, a1Var2, null);
                s2.l lVar117 = g0.f51302a;
                y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr117, new s2.f0(anonymousClass111114), 3)), null, sVar2, 6, 4);
                sVar = sVar2;
                artboard3 = artboard2;
                rVar3 = rVar2;
                fit4 = fit1111;
                alignment3 = alignment1110;
                i26 = iE;
                viewModelInstance3 = viewModelInstance1110;
            }
            str3 = str2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
            }
        }
        i14 |= 196608;
        fit2 = fit;
        i22 = i13 & 64;
        if (i22 != 0) {
            i14 |= 1572864;
            alignment2 = alignment;
        } else {
            alignment2 = alignment;
            if ((i12 & 3670016) == 0) {
                if (sVar2.f(alignment2)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
        }
        i24 = i13 & 128;
        if (i24 != 0) {
            if ((i12 & 29360128) == 0) {
                if (sVar2.d(i11)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((i13 & 20) != 20) {
                if (i27 != 0) {
                    rVar2 = o.f58481a;
                }
                if (i15 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (i18 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if (i19 != 0) {
                    fit3 = Fit.CONTAIN;
                } else {
                    fit3 = fit2;
                }
                if (i22 != 0) {
                    alignment2 = Alignment.CENTER;
                }
                if (i24 != 0) {
                    iE = f0.E(x.f28621h);
                } else {
                    iE = i11;
                }
                AnonymousClass1 anonymousClass111115 = AnonymousClass1.INSTANCE;
                riveLog = RiveLog.INSTANCE;
                riveLog.getLogger().v(GENERAL_TAG, anonymousClass111115);
                LifecycleOwner lifecycleOwner118 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                long jM22getFileHandleENT3xMk$kotlin_release118 = file.m22getFileHandleENT3xMk$kotlin_release();
                sVar2.d0(-225424328);
                zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release118) | sVar2.f(artboard2);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (zE) {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                } else {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                }
                jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                sVar2.p(false);
                sVar2.d0(-225418898);
                boolean zE1110 = sVar2.e(jM95unboximpl);
                if ((i14 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zE1110 | z11;
                objQ2 = sVar2.Q();
                if (z12) {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                } else {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                }
                long jM192unboximpl118 = ((StateMachineHandle) objQ2).m192unboximpl();
                sVar2.p(false);
                sVar2.d0(-225405461);
                zE2 = sVar2.e(jM192unboximpl118);
                objQ3 = sVar2.Q();
                if (zE2) {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                }
                b1Var = (b1) objQ3;
                sVar2.p(false);
                sVar2.d0(-225403068);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = t.B(null);
                    sVar2.o0(objQ4);
                }
                b1Var2 = (b1) objQ4;
                sVar2.p(false);
                sVar2.d0(-225400778);
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    z13 = false;
                    objV = defpackage.e.v(0, sVar2);
                } else {
                    z13 = false;
                    objV = objQ5;
                }
                ViewModelInstance viewModelInstance1111 = viewModelInstance2;
                a1Var = (a1) objV;
                sVar2.p(z13);
                sVar2.d0(-225398890);
                objQ6 = sVar2.Q();
                if (objQ6 == gVar) {
                    z14 = false;
                    objV2 = defpackage.e.v(0, sVar2);
                } else {
                    z14 = false;
                    objV2 = objQ6;
                }
                a1Var2 = (a1) objV2;
                sVar2.p(z14);
                sVar2.d0(-225395994);
                objQ7 = sVar2.Q();
                if (objQ7 == gVar) {
                    objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                            m.f(newSurfaceTexture, "newSurfaceTexture");
                            Surface surface = new Surface(newSurfaceTexture);
                            RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                            b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                            m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                            b1Var2.setValue(null);
                            return true;
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                            m.f(surfaceTexture, "surfaceTexture");
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                            m.f(surfaceTexture, "surfaceTexture");
                        }
                    };
                    sVar2.o0(objQ7);
                }
                riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                sVar2.p(z14);
                RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl118)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner118), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                t.c(StateMachineHandle.m186boximpl(jM192unboximpl118), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl118, str2, j11, file), sVar2);
                t.g(StateMachineHandle.m186boximpl(jM192unboximpl118), viewModelInstance1111, new AnonymousClass3(viewModelInstance1111, commandQueue$kotlin_release, jM192unboximpl118, b1Var, null), sVar2);
                RiveSurface riveSurfaceRiveUI$lambda$1113 = RiveUI$lambda$6(b1Var2);
                sVar2.d0(-225306504);
                objQ8 = sVar2.Q();
                if (objQ8 == gVar) {
                    objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                    sVar2.o0(objQ8);
                }
                sVar2.p(false);
                t.c(riveSurfaceRiveUI$lambda$1113, (c) objQ8, sVar2);
                t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl118, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl118), sVar2);
                Integer numValueOf118 = Integer.valueOf(iE);
                sVar2.d0(-225283434);
                zF = sVar2.f(b1Var);
                objQ9 = sVar2.Q();
                if (zF) {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                } else {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                }
                sVar2.p(false);
                t.h(fit3, alignment2, numValueOf118, (e) objQ9, sVar2);
                Fit fit1112 = fit3;
                Alignment alignment1111 = alignment2;
                t.i(new Object[]{lifecycleOwner118, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl118), fit1112, alignment1111, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner118, b1Var2, commandQueue$kotlin_release, jM192unboximpl118, j11, fit1112, alignment1111, iE, b1Var, null), sVar2);
                sVar2.d0(-225237700);
                objQ10 = sVar2.Q();
                if (objQ10 == gVar) {
                    objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                    sVar2.o0(objQ10);
                }
                sVar2.p(false);
                Object[] objArr118 = {StateMachineHandle.m186boximpl(jM192unboximpl118), fit1112, alignment1111, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                AnonymousClass9 anonymousClass111116 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl118, fit1112, alignment1111, b1Var, a1Var, a1Var2, null);
                s2.l lVar118 = g0.f51302a;
                y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr118, new s2.f0(anonymousClass111116), 3)), null, sVar2, 6, 4);
                sVar = sVar2;
                artboard3 = artboard2;
                rVar3 = rVar2;
                fit4 = fit1112;
                alignment3 = alignment1111;
                i26 = iE;
                viewModelInstance3 = viewModelInstance1111;
            } else {
                if (i27 != 0) {
                    rVar2 = o.f58481a;
                }
                if (i15 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (i18 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if (i19 != 0) {
                    fit3 = Fit.CONTAIN;
                } else {
                    fit3 = fit2;
                }
                if (i22 != 0) {
                    alignment2 = Alignment.CENTER;
                }
                if (i24 != 0) {
                    iE = f0.E(x.f28621h);
                } else {
                    iE = i11;
                }
                AnonymousClass1 anonymousClass111117 = AnonymousClass1.INSTANCE;
                riveLog = RiveLog.INSTANCE;
                riveLog.getLogger().v(GENERAL_TAG, anonymousClass111117);
                LifecycleOwner lifecycleOwner119 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
                long jM22getFileHandleENT3xMk$kotlin_release119 = file.m22getFileHandleENT3xMk$kotlin_release();
                sVar2.d0(-225424328);
                zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release119) | sVar2.f(artboard2);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (zE) {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                } else {
                    if (artboard2 != null) {
                        jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                    } else {
                        jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                    }
                    objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                    sVar2.o0(objQ);
                }
                jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
                sVar2.p(false);
                sVar2.d0(-225418898);
                boolean zE1111 = sVar2.e(jM95unboximpl);
                if ((i14 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zE1111 | z11;
                objQ2 = sVar2.Q();
                if (z12) {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                } else {
                    if (str2 != null) {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                    } else {
                        jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                    }
                    j11 = jM95unboximpl;
                    riveFile = file;
                    riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                    objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                    sVar2.o0(objQ2);
                }
                long jM192unboximpl119 = ((StateMachineHandle) objQ2).m192unboximpl();
                sVar2.p(false);
                sVar2.d0(-225405461);
                zE2 = sVar2.e(jM192unboximpl119);
                objQ3 = sVar2.Q();
                if (zE2) {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                }
                b1Var = (b1) objQ3;
                sVar2.p(false);
                sVar2.d0(-225403068);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = t.B(null);
                    sVar2.o0(objQ4);
                }
                b1Var2 = (b1) objQ4;
                sVar2.p(false);
                sVar2.d0(-225400778);
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    z13 = false;
                    objV = defpackage.e.v(0, sVar2);
                } else {
                    z13 = false;
                    objV = objQ5;
                }
                ViewModelInstance viewModelInstance1112 = viewModelInstance2;
                a1Var = (a1) objV;
                sVar2.p(z13);
                sVar2.d0(-225398890);
                objQ6 = sVar2.Q();
                if (objQ6 == gVar) {
                    z14 = false;
                    objV2 = defpackage.e.v(0, sVar2);
                } else {
                    z14 = false;
                    objV2 = objQ6;
                }
                a1Var2 = (a1) objV2;
                sVar2.p(z14);
                sVar2.d0(-225395994);
                objQ7 = sVar2.Q();
                if (objQ7 == gVar) {
                    objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                            m.f(newSurfaceTexture, "newSurfaceTexture");
                            Surface surface = new Surface(newSurfaceTexture);
                            RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                            b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                            m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                            b1Var2.setValue(null);
                            return true;
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                            m.f(surfaceTexture, "surfaceTexture");
                            RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                            RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                            m.f(surfaceTexture, "surfaceTexture");
                        }
                    };
                    sVar2.o0(objQ7);
                }
                riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
                sVar2.p(z14);
                RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl119)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner119), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
                t.c(StateMachineHandle.m186boximpl(jM192unboximpl119), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl119, str2, j11, file), sVar2);
                t.g(StateMachineHandle.m186boximpl(jM192unboximpl119), viewModelInstance1112, new AnonymousClass3(viewModelInstance1112, commandQueue$kotlin_release, jM192unboximpl119, b1Var, null), sVar2);
                RiveSurface riveSurfaceRiveUI$lambda$1114 = RiveUI$lambda$6(b1Var2);
                sVar2.d0(-225306504);
                objQ8 = sVar2.Q();
                if (objQ8 == gVar) {
                    objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                    sVar2.o0(objQ8);
                }
                sVar2.p(false);
                t.c(riveSurfaceRiveUI$lambda$1114, (c) objQ8, sVar2);
                t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl119, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl119), sVar2);
                Integer numValueOf119 = Integer.valueOf(iE);
                sVar2.d0(-225283434);
                zF = sVar2.f(b1Var);
                objQ9 = sVar2.Q();
                if (zF) {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                } else {
                    objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                    sVar2.o0(objQ9);
                }
                sVar2.p(false);
                t.h(fit3, alignment2, numValueOf119, (e) objQ9, sVar2);
                Fit fit1113 = fit3;
                Alignment alignment1112 = alignment2;
                t.i(new Object[]{lifecycleOwner119, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl119), fit1113, alignment1112, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner119, b1Var2, commandQueue$kotlin_release, jM192unboximpl119, j11, fit1113, alignment1112, iE, b1Var, null), sVar2);
                sVar2.d0(-225237700);
                objQ10 = sVar2.Q();
                if (objQ10 == gVar) {
                    objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                    sVar2.o0(objQ10);
                }
                sVar2.p(false);
                Object[] objArr119 = {StateMachineHandle.m186boximpl(jM192unboximpl119), fit1113, alignment1112, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
                AnonymousClass9 anonymousClass111118 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl119, fit1113, alignment1112, b1Var, a1Var, a1Var2, null);
                s2.l lVar119 = g0.f51302a;
                y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr119, new s2.f0(anonymousClass111118), 3)), null, sVar2, 6, 4);
                sVar = sVar2;
                artboard3 = artboard2;
                rVar3 = rVar2;
                fit4 = fit1113;
                alignment3 = alignment1112;
                i26 = iE;
                viewModelInstance3 = viewModelInstance1112;
            }
            str3 = str2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
            }
        }
        i14 |= 12582912;
        if ((i13 & 20) != 20) {
            if (i27 != 0) {
                rVar2 = o.f58481a;
            }
            if (i15 != 0) {
                artboard2 = null;
            } else {
                artboard2 = artboard;
            }
            if (i16 != 0) {
                str2 = null;
            }
            if (i18 != 0) {
                viewModelInstance2 = null;
            } else {
                viewModelInstance2 = viewModelInstance;
            }
            if (i19 != 0) {
                fit3 = Fit.CONTAIN;
            } else {
                fit3 = fit2;
            }
            if (i22 != 0) {
                alignment2 = Alignment.CENTER;
            }
            if (i24 != 0) {
                iE = f0.E(x.f28621h);
            } else {
                iE = i11;
            }
            AnonymousClass1 anonymousClass111119 = AnonymousClass1.INSTANCE;
            riveLog = RiveLog.INSTANCE;
            riveLog.getLogger().v(GENERAL_TAG, anonymousClass111119);
            LifecycleOwner lifecycleOwner1110 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
            long jM22getFileHandleENT3xMk$kotlin_release1110 = file.m22getFileHandleENT3xMk$kotlin_release();
            sVar2.d0(-225424328);
            zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release1110) | sVar2.f(artboard2);
            objQ = sVar2.Q();
            gVar = l1.m.f39353a;
            if (zE) {
                if (artboard2 != null) {
                    jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                } else {
                    jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                }
                objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                sVar2.o0(objQ);
            } else {
                if (artboard2 != null) {
                    jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                } else {
                    jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                }
                objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                sVar2.o0(objQ);
            }
            jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
            sVar2.p(false);
            sVar2.d0(-225418898);
            boolean zE1112 = sVar2.e(jM95unboximpl);
            if ((i14 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = zE1112 | z11;
            objQ2 = sVar2.Q();
            if (z12) {
                if (str2 != null) {
                    jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                } else {
                    jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                }
                j11 = jM95unboximpl;
                riveFile = file;
                riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                sVar2.o0(objQ2);
            } else {
                if (str2 != null) {
                    jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                } else {
                    jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                }
                j11 = jM95unboximpl;
                riveFile = file;
                riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                sVar2.o0(objQ2);
            }
            long jM192unboximpl1110 = ((StateMachineHandle) objQ2).m192unboximpl();
            sVar2.p(false);
            sVar2.d0(-225405461);
            zE2 = sVar2.e(jM192unboximpl1110);
            objQ3 = sVar2.Q();
            if (zE2) {
                objQ3 = t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            } else {
                objQ3 = t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            b1Var = (b1) objQ3;
            sVar2.p(false);
            sVar2.d0(-225403068);
            objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = t.B(null);
                sVar2.o0(objQ4);
            }
            b1Var2 = (b1) objQ4;
            sVar2.p(false);
            sVar2.d0(-225400778);
            objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                z13 = false;
                objV = defpackage.e.v(0, sVar2);
            } else {
                z13 = false;
                objV = objQ5;
            }
            ViewModelInstance viewModelInstance1113 = viewModelInstance2;
            a1Var = (a1) objV;
            sVar2.p(z13);
            sVar2.d0(-225398890);
            objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                z14 = false;
                objV2 = defpackage.e.v(0, sVar2);
            } else {
                z14 = false;
                objV2 = objQ6;
            }
            a1Var2 = (a1) objV2;
            sVar2.p(z14);
            sVar2.d0(-225395994);
            objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                        m.f(newSurfaceTexture, "newSurfaceTexture");
                        Surface surface = new Surface(newSurfaceTexture);
                        RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                        b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                        RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                        RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                        m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                        b1Var2.setValue(null);
                        return true;
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                        m.f(surfaceTexture, "surfaceTexture");
                        RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                        RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                        m.f(surfaceTexture, "surfaceTexture");
                    }
                };
                sVar2.o0(objQ7);
            }
            riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
            sVar2.p(z14);
            RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl1110)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner1110), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
            t.c(StateMachineHandle.m186boximpl(jM192unboximpl1110), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl1110, str2, j11, file), sVar2);
            t.g(StateMachineHandle.m186boximpl(jM192unboximpl1110), viewModelInstance1113, new AnonymousClass3(viewModelInstance1113, commandQueue$kotlin_release, jM192unboximpl1110, b1Var, null), sVar2);
            RiveSurface riveSurfaceRiveUI$lambda$1115 = RiveUI$lambda$6(b1Var2);
            sVar2.d0(-225306504);
            objQ8 = sVar2.Q();
            if (objQ8 == gVar) {
                objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                sVar2.o0(objQ8);
            }
            sVar2.p(false);
            t.c(riveSurfaceRiveUI$lambda$1115, (c) objQ8, sVar2);
            t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl1110, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl1110), sVar2);
            Integer numValueOf1110 = Integer.valueOf(iE);
            sVar2.d0(-225283434);
            zF = sVar2.f(b1Var);
            objQ9 = sVar2.Q();
            if (zF) {
                objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                sVar2.o0(objQ9);
            } else {
                objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                sVar2.o0(objQ9);
            }
            sVar2.p(false);
            t.h(fit3, alignment2, numValueOf1110, (e) objQ9, sVar2);
            Fit fit1114 = fit3;
            Alignment alignment1113 = alignment2;
            t.i(new Object[]{lifecycleOwner1110, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl1110), fit1114, alignment1113, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner1110, b1Var2, commandQueue$kotlin_release, jM192unboximpl1110, j11, fit1114, alignment1113, iE, b1Var, null), sVar2);
            sVar2.d0(-225237700);
            objQ10 = sVar2.Q();
            if (objQ10 == gVar) {
                objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                sVar2.o0(objQ10);
            }
            sVar2.p(false);
            Object[] objArr1110 = {StateMachineHandle.m186boximpl(jM192unboximpl1110), fit1114, alignment1113, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
            AnonymousClass9 anonymousClass1111110 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl1110, fit1114, alignment1113, b1Var, a1Var, a1Var2, null);
            s2.l lVar1110 = g0.f51302a;
            y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr1110, new s2.f0(anonymousClass1111110), 3)), null, sVar2, 6, 4);
            sVar = sVar2;
            artboard3 = artboard2;
            rVar3 = rVar2;
            fit4 = fit1114;
            alignment3 = alignment1113;
            i26 = iE;
            viewModelInstance3 = viewModelInstance1113;
        } else {
            if (i27 != 0) {
                rVar2 = o.f58481a;
            }
            if (i15 != 0) {
                artboard2 = null;
            } else {
                artboard2 = artboard;
            }
            if (i16 != 0) {
                str2 = null;
            }
            if (i18 != 0) {
                viewModelInstance2 = null;
            } else {
                viewModelInstance2 = viewModelInstance;
            }
            if (i19 != 0) {
                fit3 = Fit.CONTAIN;
            } else {
                fit3 = fit2;
            }
            if (i22 != 0) {
                alignment2 = Alignment.CENTER;
            }
            if (i24 != 0) {
                iE = f0.E(x.f28621h);
            } else {
                iE = i11;
            }
            AnonymousClass1 anonymousClass1111111 = AnonymousClass1.INSTANCE;
            riveLog = RiveLog.INSTANCE;
            riveLog.getLogger().v(GENERAL_TAG, anonymousClass1111111);
            LifecycleOwner lifecycleOwner1111 = (LifecycleOwner) sVar2.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
            long jM22getFileHandleENT3xMk$kotlin_release1111 = file.m22getFileHandleENT3xMk$kotlin_release();
            sVar2.d0(-225424328);
            zE = sVar2.e(jM22getFileHandleENT3xMk$kotlin_release1111) | sVar2.f(artboard2);
            objQ = sVar2.Q();
            gVar = l1.m.f39353a;
            if (zE) {
                if (artboard2 != null) {
                    jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                } else {
                    jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                }
                objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                sVar2.o0(objQ);
            } else {
                if (artboard2 != null) {
                    jM108createDefaultArtboard6NrLy0M = artboard2.m11getArtboardHandlenSTdbJo$kotlin_release();
                } else {
                    jM108createDefaultArtboard6NrLy0M = commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
                }
                objQ = ArtboardHandle.m89boximpl(jM108createDefaultArtboard6NrLy0M);
                sVar2.o0(objQ);
            }
            jM95unboximpl = ((ArtboardHandle) objQ).m95unboximpl();
            sVar2.p(false);
            sVar2.d0(-225418898);
            boolean zE1113 = sVar2.e(jM95unboximpl);
            if ((i14 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = zE1113 | z11;
            objQ2 = sVar2.Q();
            if (z12) {
                if (str2 != null) {
                    jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                } else {
                    jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                }
                j11 = jM95unboximpl;
                riveFile = file;
                riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                sVar2.o0(objQ2);
            } else {
                if (str2 != null) {
                    jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m110createStateMachineByNameItmKBmM(jM95unboximpl, str2);
                } else {
                    jM109createDefaultStateMachinexY8vNfM = commandQueue$kotlin_release.m109createDefaultStateMachinexY8vNfM(jM95unboximpl);
                }
                j11 = jM95unboximpl;
                riveFile = file;
                riveLog.getLogger().d(STATE_MACHINE_TAG, new RiveUIKt$RiveUI$stateMachineHandle$1$1(jM109createDefaultStateMachinexY8vNfM, str2, jM95unboximpl, file));
                objQ2 = StateMachineHandle.m186boximpl(jM109createDefaultStateMachinexY8vNfM);
                sVar2.o0(objQ2);
            }
            long jM192unboximpl1111 = ((StateMachineHandle) objQ2).m192unboximpl();
            sVar2.p(false);
            sVar2.d0(-225405461);
            zE2 = sVar2.e(jM192unboximpl1111);
            objQ3 = sVar2.Q();
            if (zE2) {
                objQ3 = t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            } else {
                objQ3 = t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            b1Var = (b1) objQ3;
            sVar2.p(false);
            sVar2.d0(-225403068);
            objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = t.B(null);
                sVar2.o0(objQ4);
            }
            b1Var2 = (b1) objQ4;
            sVar2.p(false);
            sVar2.d0(-225400778);
            objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                z13 = false;
                objV = defpackage.e.v(0, sVar2);
            } else {
                z13 = false;
                objV = objQ5;
            }
            ViewModelInstance viewModelInstance1114 = viewModelInstance2;
            a1Var = (a1) objV;
            sVar2.p(z13);
            sVar2.d0(-225398890);
            objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                z14 = false;
                objV2 = defpackage.e.v(0, sVar2);
            } else {
                z14 = false;
                objV2 = objQ6;
            }
            a1Var2 = (a1) objV2;
            sVar2.p(z14);
            sVar2.d0(-225395994);
            objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveUIKt$RiveUI$surfaceListener$1$1
                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int i28, int i29) {
                        m.f(newSurfaceTexture, "newSurfaceTexture");
                        Surface surface = new Surface(newSurfaceTexture);
                        RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$surfaceListener$1$1$onSurfaceTextureAvailable$1.INSTANCE);
                        b1Var2.setValue(commandQueue$kotlin_release.createRiveSurface(surface));
                        RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                        RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                        m.f(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                        b1Var2.setValue(null);
                        return true;
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i28, int i29) {
                        m.f(surfaceTexture, "surfaceTexture");
                        RiveUIKt.RiveUI$lambda$10(a1Var, i28);
                        RiveUIKt.RiveUI$lambda$13(a1Var2, i29);
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                        m.f(surfaceTexture, "surfaceTexture");
                    }
                };
                sVar2.o0(objQ7);
            }
            riveUIKt$RiveUI$surfaceListener$1$1 = (RiveUIKt$RiveUI$surfaceListener$1$1) objQ7;
            sVar2.p(z14);
            RebuggerWrapperKt.RebuggerWrapper(ry.x.Y(new l("file", riveFile), new l("artboardHandle", ArtboardHandle.m89boximpl(j11)), new l("stateMachineHandle", StateMachineHandle.m186boximpl(jM192unboximpl1111)), new l("surface", RiveUI$lambda$6(b1Var2)), new l("fit", fit3), new l("alignment", alignment2), new l("lifecycleOwner", lifecycleOwner1111), new l("artboard", artboard2), new l("stateMachineName", str2)), sVar2, 8);
            t.c(StateMachineHandle.m186boximpl(jM192unboximpl1111), new AnonymousClass2(commandQueue$kotlin_release, jM192unboximpl1111, str2, j11, file), sVar2);
            t.g(StateMachineHandle.m186boximpl(jM192unboximpl1111), viewModelInstance1114, new AnonymousClass3(viewModelInstance1114, commandQueue$kotlin_release, jM192unboximpl1111, b1Var, null), sVar2);
            RiveSurface riveSurfaceRiveUI$lambda$1116 = RiveUI$lambda$6(b1Var2);
            sVar2.d0(-225306504);
            objQ8 = sVar2.Q();
            if (objQ8 == gVar) {
                objQ8 = new RiveUIKt$RiveUI$4$1(b1Var2);
                sVar2.o0(objQ8);
            }
            sVar2.p(false);
            t.c(riveSurfaceRiveUI$lambda$1116, (c) objQ8, sVar2);
            t.f(new AnonymousClass5(commandQueue$kotlin_release, jM192unboximpl1111, b1Var, null), StateMachineHandle.m186boximpl(jM192unboximpl1111), sVar2);
            Integer numValueOf1111 = Integer.valueOf(iE);
            sVar2.d0(-225283434);
            zF = sVar2.f(b1Var);
            objQ9 = sVar2.Q();
            if (zF) {
                objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                sVar2.o0(objQ9);
            } else {
                objQ9 = new RiveUIKt$RiveUI$6$1(b1Var, null);
                sVar2.o0(objQ9);
            }
            sVar2.p(false);
            t.h(fit3, alignment2, numValueOf1111, (e) objQ9, sVar2);
            Fit fit1115 = fit3;
            Alignment alignment1114 = alignment2;
            t.i(new Object[]{lifecycleOwner1111, RiveUI$lambda$6(b1Var2), ArtboardHandle.m89boximpl(j11), StateMachineHandle.m186boximpl(jM192unboximpl1111), fit1115, alignment1114, Integer.valueOf(iE)}, new AnonymousClass7(lifecycleOwner1111, b1Var2, commandQueue$kotlin_release, jM192unboximpl1111, j11, fit1115, alignment1114, iE, b1Var, null), sVar2);
            sVar2.d0(-225237700);
            objQ10 = sVar2.Q();
            if (objQ10 == gVar) {
                objQ10 = new RiveUIKt$RiveUI$8$1(riveUIKt$RiveUI$surfaceListener$1$1);
                sVar2.o0(objQ10);
            }
            sVar2.p(false);
            Object[] objArr1111 = {StateMachineHandle.m186boximpl(jM192unboximpl1111), fit1115, alignment1114, Integer.valueOf(RiveUI$lambda$9(a1Var)), Integer.valueOf(RiveUI$lambda$12(a1Var2))};
            AnonymousClass9 anonymousClass1111112 = new AnonymousClass9(commandQueue$kotlin_release, jM192unboximpl1111, fit1115, alignment1114, b1Var, a1Var, a1Var2, null);
            s2.l lVar1111 = g0.f51302a;
            y3.h.b((c) objQ10, rVar2.i(new s2.e0(null, null, objArr1111, new s2.f0(anonymousClass1111112), 3)), null, sVar2, 6, 4);
            sVar = sVar2;
            artboard3 = artboard2;
            rVar3 = rVar2;
            fit4 = fit1115;
            alignment3 = alignment1114;
            i26 = iE;
            viewModelInstance3 = viewModelInstance1114;
        }
        str3 = str2;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new AnonymousClass10(file, rVar3, artboard3, str3, viewModelInstance3, fit4, alignment3, i26, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RiveUI$lambda$10(a1 a1Var, int i11) {
        ((h1) a1Var).m(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RiveUI$lambda$12(a1 a1Var) {
        return ((h1) a1Var).l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RiveUI$lambda$13(a1 a1Var, int i11) {
        ((h1) a1Var).m(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RiveUI$lambda$3(b1 b1Var) {
        return ((Boolean) b1Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RiveUI$lambda$4(b1 b1Var, boolean z11) {
        b1Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RiveSurface RiveUI$lambda$6(b1 b1Var) {
        return (RiveSurface) b1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RiveUI$lambda$9(a1 a1Var) {
        return ((h1) a1Var).l();
    }

    public static final <T> qy.h lazyDeferred(rz.b0 parentScope, c block) {
        m.f(parentScope, "parentScope");
        m.f(block, "block");
        return com.bumptech.glide.d.u(qy.j.SYNCHRONIZED, new C00611(parentScope, block));
    }
}
