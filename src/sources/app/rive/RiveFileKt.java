package app.rive;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.rive.core.CommandQueue;
import app.rive.core.FileHandle;
import fz.a;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.u;
import l1.b1;
import l1.b3;
import l1.c0;
import l1.g;
import l1.s;
import l1.s1;
import l1.t;
import l1.u1;
import l1.x2;
import rz.b0;
import rz.e0;
import rz.o0;
import vy.d;
import xy.e;
import xy.i;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveFileKt {
    private static final String FILE_TAG = "Rive/File";

    /* JADX INFO: renamed from: app.rive.RiveFileKt$rememberRiveFile$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "app.rive.RiveFileKt$rememberRiveFile$1", f = "RiveFile.kt", l = {138, 142, 153}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements fz.e {
        final /* synthetic */ CommandQueue $commandQueue;
        final /* synthetic */ Context $context;
        final /* synthetic */ b0 $coroutineScope;
        final /* synthetic */ RiveFileSource $source;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: app.rive.RiveFileKt$rememberRiveFile$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class C00091 extends n implements a {
            final /* synthetic */ CommandQueue $commandQueue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00091(CommandQueue commandQueue) {
                super(0);
                this.$commandQueue = commandQueue;
            }

            @Override // fz.a
            public final String invoke() {
                return "Acquiring command queue from Rive File (ref count before acquire: " + this.$commandQueue.getRefCount$kotlin_release() + ')';
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveFileKt$rememberRiveFile$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnonymousClass2 extends n implements a {
            final /* synthetic */ RiveFileSource $source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RiveFileSource riveFileSource) {
                super(0);
                this.$source = riveFileSource;
            }

            @Override // fz.a
            public final String invoke() {
                return "Loading Rive file from source: " + this.$source;
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveFileKt$rememberRiveFile$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnonymousClass3 extends n implements a {
            final /* synthetic */ long $fileHandle;
            final /* synthetic */ RiveFileSource $source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(RiveFileSource riveFileSource, long j11) {
                super(0);
                this.$source = riveFileSource;
                this.$fileHandle = j11;
            }

            @Override // fz.a
            public final String invoke() {
                return "Loaded Rive file from source: " + this.$source + "; " + ((Object) FileHandle.m166toStringimpl(this.$fileHandle));
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveFileKt$rememberRiveFile$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnonymousClass4 extends n implements a {
            final /* synthetic */ u $acquired;
            final /* synthetic */ CommandQueue $commandQueue;
            final /* synthetic */ long $fileHandle;

            /* JADX INFO: renamed from: app.rive.RiveFileKt$rememberRiveFile$1$4$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            public static final class C00101 extends n implements a {
                final /* synthetic */ long $fileHandle;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00101(long j11) {
                    super(0);
                    this.$fileHandle = j11;
                }

                @Override // fz.a
                public final String invoke() {
                    return "Deleting " + ((Object) FileHandle.m166toStringimpl(this.$fileHandle));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(CommandQueue commandQueue, long j11, u uVar) {
                super(0);
                this.$commandQueue = commandQueue;
                this.$fileHandle = j11;
                this.$acquired = uVar;
            }

            @Override // fz.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m23invoke();
                return qy.b0.f48488a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m23invoke() {
                RiveLog.INSTANCE.getLogger().d(RiveFileKt.FILE_TAG, new C00101(this.$fileHandle));
                this.$commandQueue.m117deleteFiledJ1Evnk(this.$fileHandle);
                AnonymousClass1.invokeSuspend$release(this.$acquired, this.$commandQueue, "dispose");
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveFileKt$rememberRiveFile$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnonymousClass5 extends n implements a {
            final /* synthetic */ RiveFileSource $source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(RiveFileSource riveFileSource) {
                super(0);
                this.$source = riveFileSource;
            }

            @Override // fz.a
            public final String invoke() {
                return "Rive file loading was cancelled: " + this.$source;
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveFileKt$rememberRiveFile$1$6, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnonymousClass6 extends n implements a {
            final /* synthetic */ RiveFileSource $source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(RiveFileSource riveFileSource) {
                super(0);
                this.$source = riveFileSource;
            }

            @Override // fz.a
            public final String invoke() {
                return "Error loading Rive file with source: " + this.$source;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommandQueue commandQueue, RiveFileSource riveFileSource, b0 b0Var, Context context, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$commandQueue = commandQueue;
            this.$source = riveFileSource;
            this.$coroutineScope = b0Var;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$release(u uVar, CommandQueue commandQueue, String str) {
            if (uVar.f38357a) {
                RiveLog.INSTANCE.getLogger().v(RememberCommandQueueKt.COMMAND_QUEUE_TAG, new RiveFileKt$rememberRiveFile$1$release$1(str, commandQueue));
                commandQueue.release();
                uVar.f38357a = false;
            }
        }

        @Override // xy.a
        public final d<qy.b0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$commandQueue, this.$source, this.$coroutineScope, this.$context, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlin.jvm.internal.u] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v17, types: [kotlin.jvm.internal.u] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.u] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v28 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.jvm.internal.u] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.jvm.internal.u] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r4v7 */
        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            ?? r9;
            ?? r11;
            ?? uVar;
            s1 s1Var;
            s1 s1Var2;
            s1 s1Var3;
            ?? r12;
            long jM167unboximpl;
            long j11;
            u1 u1Var;
            ?? r13;
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            ?? r14 = this.label;
            ?? r15 = 2;
            try {
                try {
                    try {
                        if (r14 == 0) {
                            com.bumptech.glide.e.F(obj);
                            s1 s1Var4 = (s1) this.L$0;
                            C00091 c00091 = new C00091(this.$commandQueue);
                            RiveLog riveLog = RiveLog.INSTANCE;
                            riveLog.getLogger().v(RememberCommandQueueKt.COMMAND_QUEUE_TAG, c00091);
                            this.$commandQueue.acquire();
                            uVar = new u();
                            uVar.f38357a = true;
                            riveLog.getLogger().d(RiveFileKt.FILE_TAG, new AnonymousClass2(this.$source));
                            try {
                                RiveFileSource riveFileSource = this.$source;
                                if (riveFileSource instanceof RiveFileSource.Bytes) {
                                    CommandQueue commandQueue = this.$commandQueue;
                                    byte[] bArrM30unboximpl = ((RiveFileSource.Bytes) riveFileSource).m30unboximpl();
                                    this.L$0 = s1Var4;
                                    this.L$1 = uVar;
                                    this.label = 1;
                                    Object objM135loadFilexVnc2tA = commandQueue.m135loadFilexVnc2tA(bArrM30unboximpl, this);
                                    if (objM135loadFilexVnc2tA != aVar) {
                                        s1Var3 = s1Var4;
                                        obj = objM135loadFilexVnc2tA;
                                        r12 = uVar;
                                        jM167unboximpl = ((FileHandle) obj).m167unboximpl();
                                        r14 = r12;
                                        r15 = s1Var3;
                                    }
                                } else {
                                    if (!(riveFileSource instanceof RiveFileSource.RawRes)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f fVar = o0.f50940a;
                                    yz.e eVar = yz.e.f58387a;
                                    RiveFileKt$rememberRiveFile$1$fileHandle$1 riveFileKt$rememberRiveFile$1$fileHandle$1 = new RiveFileKt$rememberRiveFile$1$fileHandle$1(this.$context, riveFileSource, this.$commandQueue, null);
                                    this.L$0 = s1Var4;
                                    this.L$1 = uVar;
                                    this.label = 2;
                                    Object objM = e0.M(eVar, riveFileKt$rememberRiveFile$1$fileHandle$1, this);
                                    if (objM != aVar) {
                                        s1Var2 = s1Var4;
                                        obj = objM;
                                        r13 = uVar;
                                        jM167unboximpl = ((FileHandle) obj).m167unboximpl();
                                        r14 = r13;
                                        r15 = s1Var2;
                                    }
                                }
                                return aVar;
                            } catch (Exception e8) {
                                e = e8;
                                s1Var = s1Var4;
                                exc = e;
                                r11 = uVar;
                                r9 = s1Var;
                                RiveLog.INSTANCE.getLogger().e(RiveFileKt.FILE_TAG, exc, new AnonymousClass6(this.$source));
                                ((u1) r9).setValue(new Result.Error(exc));
                                invokeSuspend$release(r11, this.$commandQueue, "error");
                                return qy.b0.f48488a;
                            }
                        }
                        if (r14 == 1) {
                            u uVar2 = (u) this.L$1;
                            s1 s1Var5 = (s1) this.L$0;
                            com.bumptech.glide.e.F(obj);
                            r12 = uVar2;
                            s1Var3 = s1Var5;
                            jM167unboximpl = ((FileHandle) obj).m167unboximpl();
                            r14 = r12;
                            r15 = s1Var3;
                        } else {
                            if (r14 != 2) {
                                if (r14 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                uVar = (u) this.L$1;
                                s1Var = (s1) this.L$0;
                                try {
                                    com.bumptech.glide.e.F(obj);
                                    uVar = uVar;
                                    s1Var = s1Var;
                                    throw new KotlinNothingValueException();
                                } catch (Exception e10) {
                                    e = e10;
                                    exc = e;
                                    r11 = uVar;
                                    r9 = s1Var;
                                    RiveLog.INSTANCE.getLogger().e(RiveFileKt.FILE_TAG, exc, new AnonymousClass6(this.$source));
                                    ((u1) r9).setValue(new Result.Error(exc));
                                    invokeSuspend$release(r11, this.$commandQueue, "error");
                                    return qy.b0.f48488a;
                                }
                            }
                            u uVar3 = (u) this.L$1;
                            s1 s1Var6 = (s1) this.L$0;
                            com.bumptech.glide.e.F(obj);
                            r13 = uVar3;
                            s1Var2 = s1Var6;
                            jM167unboximpl = ((FileHandle) obj).m167unboximpl();
                            r14 = r13;
                            r15 = s1Var2;
                        }
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$commandQueue, j11, r14);
                        this.L$0 = u1Var;
                        this.L$1 = r14;
                        this.label = 3;
                        if (u1Var.b(anonymousClass4, this) != aVar) {
                            s1Var = u1Var;
                            uVar = r14;
                            throw new KotlinNothingValueException();
                        }
                        return aVar;
                    } catch (Exception e11) {
                        exc = e11;
                        r9 = u1Var;
                        r11 = r14;
                        RiveLog.INSTANCE.getLogger().e(RiveFileKt.FILE_TAG, exc, new AnonymousClass6(this.$source));
                        ((u1) r9).setValue(new Result.Error(exc));
                        invokeSuspend$release(r11, this.$commandQueue, "error");
                        return qy.b0.f48488a;
                    }
                    j11 = jM167unboximpl;
                    RiveLog.INSTANCE.getLogger().d(RiveFileKt.FILE_TAG, new AnonymousClass3(this.$source, j11));
                    u1Var = (u1) r15;
                    u1Var.setValue(new Result.Success(new RiveFile(j11, this.$commandQueue, this.$coroutineScope, null)));
                } catch (Exception e12) {
                    exc = e12;
                    r9 = r15;
                    r11 = r14;
                }
            } catch (CancellationException e13) {
                RiveLog.INSTANCE.getLogger().d(RiveFileKt.FILE_TAG, new AnonymousClass5(this.$source));
                invokeSuspend$release(r14, this.$commandQueue, "cancellation");
                throw e13;
            }
        }

        @Override // fz.e
        public final Object invoke(s1 s1Var, d<? super qy.b0> dVar) {
            return ((AnonymousClass1) create(s1Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    public static final b3 rememberRiveFile(RiveFileSource source, CommandQueue commandQueue, l1.n nVar, int i11, int i12) {
        m.f(source, "source");
        s sVar = (s) nVar;
        sVar.d0(-552986910);
        if ((i12 & 2) != 0) {
            commandQueue = RememberCommandQueueKt.rememberCommandQueue(sVar, 0);
        }
        CommandQueue commandQueue2 = commandQueue;
        Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
        Object objQ = sVar.Q();
        g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            c0 c0Var = new c0(t.q(sVar));
            sVar.o0(c0Var);
            objQ = c0Var;
        }
        b0 b0Var = ((c0) objQ).f39245a;
        Result.Loading loading = Result.Loading.INSTANCE;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(commandQueue2, source, b0Var, context, null);
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            objQ2 = t.B(loading);
            sVar.o0(objQ2);
        }
        b1 b1Var = (b1) objQ2;
        boolean zH = sVar.h(anonymousClass1);
        Object objQ3 = sVar.Q();
        if (zH || objQ3 == gVar) {
            objQ3 = new x2(anonymousClass1, b1Var, null, 1);
            sVar.o0(objQ3);
        }
        t.f((fz.e) objQ3, source, sVar);
        sVar.p(false);
        return b1Var;
    }
}
