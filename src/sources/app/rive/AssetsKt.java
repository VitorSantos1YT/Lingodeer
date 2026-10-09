package app.rive;

import app.rive.core.AudioHandle;
import app.rive.core.CommandQueue;
import app.rive.core.FontHandle;
import app.rive.core.ImageHandle;
import com.google.protobuf.DescriptorProtos;
import com.lingodeer.data.model.AchievementLevelType;
import fz.a;
import fz.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l1.b1;
import l1.b3;
import l1.g;
import l1.s;
import l1.s1;
import l1.t;
import l1.x2;
import qy.b0;
import qy.k;
import vy.d;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AssetsKt {
    public static final String AUDIO_TAG = "Rive/Audio";
    public static final String FONT_TAG = "Rive/Font";
    public static final String IMAGE_TAG = "Rive/Image";

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberAsset$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "app.rive.AssetsKt$rememberAsset$1", f = "Assets.kt", l = {278, 297}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements fz.e {
        final /* synthetic */ String $assetLabel;
        final /* synthetic */ byte[] $bytes;
        final /* synthetic */ CommandQueue $commandQueue;
        final /* synthetic */ fz.e $decodeFn;
        final /* synthetic */ c $deleteFn;
        final /* synthetic */ String $name;
        final /* synthetic */ fz.e $registerFn;
        final /* synthetic */ String $tag;
        final /* synthetic */ c $unregisterFn;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: app.rive.AssetsKt$rememberAsset$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnonymousClass2 extends n implements a {
            final /* synthetic */ String $assetLabel;
            final /* synthetic */ CommandQueue $commandQueue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(String str, CommandQueue commandQueue) {
                super(0);
                this.$assetLabel = str;
                this.$commandQueue = commandQueue;
            }

            @Override // fz.a
            public final String invoke() {
                return "Acquiring command queue from " + this.$assetLabel + " (ref count before acquire: " + this.$commandQueue.getRefCount$kotlin_release() + ')';
            }
        }

        /* JADX INFO: renamed from: app.rive.AssetsKt$rememberAsset$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnonymousClass3 extends n implements a {
            final /* synthetic */ String $assetLabel;
            final /* synthetic */ T $handle;
            final /* synthetic */ String $name;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(String str, String str2, T t6) {
                super(0);
                this.$assetLabel = str;
                this.$name = str2;
                this.$handle = t6;
            }

            @Override // fz.a
            public final String invoke() {
                return "Registering " + this.$assetLabel + " with key: " + this.$name + " and handle: " + this.$handle;
            }
        }

        /* JADX INFO: renamed from: app.rive.AssetsKt$rememberAsset$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnonymousClass4 extends n implements a {
            final /* synthetic */ String $assetLabel;
            final /* synthetic */ CommandQueue $commandQueue;
            final /* synthetic */ c $deleteFn;
            final /* synthetic */ T $handle;
            final /* synthetic */ String $name;
            final /* synthetic */ String $tag;
            final /* synthetic */ c $unregisterFn;

            /* JADX INFO: renamed from: app.rive.AssetsKt$rememberAsset$1$4$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            public static final class C00061 extends n implements a {
                final /* synthetic */ String $assetLabel;
                final /* synthetic */ String $name;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00061(String str, String str2) {
                    super(0);
                    this.$assetLabel = str;
                    this.$name = str2;
                }

                @Override // fz.a
                public final String invoke() {
                    return "Unregistering " + this.$assetLabel + " with key: " + this.$name;
                }
            }

            /* JADX INFO: renamed from: app.rive.AssetsKt$rememberAsset$1$4$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            public static final class AnonymousClass2 extends n implements a {
                final /* synthetic */ T $handle;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(T t6) {
                    super(0);
                    this.$handle = t6;
                }

                @Override // fz.a
                public final String invoke() {
                    return "Deleting " + this.$handle;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(c cVar, String str, String str2, c cVar2, T t6, String str3, CommandQueue commandQueue) {
                super(0);
                this.$unregisterFn = cVar;
                this.$name = str;
                this.$tag = str2;
                this.$deleteFn = cVar2;
                this.$handle = t6;
                this.$assetLabel = str3;
                this.$commandQueue = commandQueue;
            }

            @Override // fz.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m12invoke();
                return b0.f48488a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m12invoke() {
                String str;
                if (this.$unregisterFn != null && (str = this.$name) != null) {
                    RiveLog.INSTANCE.getLogger().d(this.$tag, new C00061(this.$assetLabel, str));
                    this.$unregisterFn.invoke(this.$name);
                }
                RiveLog.INSTANCE.getLogger().d(this.$tag, new AnonymousClass2(this.$handle));
                this.$deleteFn.invoke(this.$handle);
                AnonymousClass1.invokeSuspend$release(this.$commandQueue, this.$assetLabel, "dispose");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, fz.e eVar, c cVar, CommandQueue commandQueue, String str2, fz.e eVar2, byte[] bArr, String str3, c cVar2, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$name = str;
            this.$registerFn = eVar;
            this.$unregisterFn = cVar;
            this.$commandQueue = commandQueue;
            this.$tag = str2;
            this.$decodeFn = eVar2;
            this.$bytes = bArr;
            this.$assetLabel = str3;
            this.$deleteFn = cVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$release(CommandQueue commandQueue, String str, String str2) {
            RiveLog.INSTANCE.getLogger().v(RememberCommandQueueKt.COMMAND_QUEUE_TAG, new AssetsKt$rememberAsset$1$release$1(str, str2, commandQueue));
            commandQueue.release();
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$name, this.$registerFn, this.$unregisterFn, this.$commandQueue, this.$tag, this.$decodeFn, this.$bytes, this.$assetLabel, this.$deleteFn, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
        
            if (r1.b(r3, r11) == r0) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // xy.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.rive.AssetsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // fz.e
        public final Object invoke(s1 s1Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(s1Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberAudio$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "app.rive.AssetsKt$rememberAudio$1", f = "Assets.kt", l = {115}, m = "invokeSuspend")
    public static final class C00461 extends i implements fz.e {
        final /* synthetic */ CommandQueue $commandQueue;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00461(CommandQueue commandQueue, d<? super C00461> dVar) {
            super(2, dVar);
            this.$commandQueue = commandQueue;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            C00461 c00461 = new C00461(this.$commandQueue, dVar);
            c00461.L$0 = obj;
            return c00461;
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
            byte[] bArr = (byte[]) this.L$0;
            CommandQueue commandQueue = this.$commandQueue;
            this.label = 1;
            Object objM112decodeAudioWLIIakE = commandQueue.m112decodeAudioWLIIakE(bArr, this);
            return objM112decodeAudioWLIIakE == aVar ? aVar : objM112decodeAudioWLIIakE;
        }

        @Override // fz.e
        public final Object invoke(byte[] bArr, d<? super AudioHandle> dVar) {
            return ((C00461) create(bArr, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberAudio$2, reason: invalid class name */
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
            m13invokeQAnvCWo(((AudioHandle) obj).m102unboximpl());
            return b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-QAnvCWo, reason: not valid java name */
        public final void m13invokeQAnvCWo(long j11) {
            this.$commandQueue.m116deleteAudioQAnvCWo(j11);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberFont$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "app.rive.AssetsKt$rememberFont$1", f = "Assets.kt", l = {AchievementLevelType.DAY_STREAK_LV_8}, m = "invokeSuspend")
    public static final class C00471 extends i implements fz.e {
        final /* synthetic */ CommandQueue $commandQueue;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00471(CommandQueue commandQueue, d<? super C00471> dVar) {
            super(2, dVar);
            this.$commandQueue = commandQueue;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            C00471 c00471 = new C00471(this.$commandQueue, dVar);
            c00471.L$0 = obj;
            return c00471;
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
            byte[] bArr = (byte[]) this.L$0;
            CommandQueue commandQueue = this.$commandQueue;
            this.label = 1;
            Object objM113decodeFontsOckvAc = commandQueue.m113decodeFontsOckvAc(bArr, this);
            return objM113decodeFontsOckvAc == aVar ? aVar : objM113decodeFontsOckvAc;
        }

        @Override // fz.e
        public final Object invoke(byte[] bArr, d<? super FontHandle> dVar) {
            return ((C00471) create(bArr, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberFont$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class C00482 extends n implements c {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00482(CommandQueue commandQueue) {
            super(1);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14invokewK5q9OY(((FontHandle) obj).m174unboximpl());
            return b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-wK5q9OY, reason: not valid java name */
        public final void m14invokewK5q9OY(long j11) {
            this.$commandQueue.m118deleteFontwK5q9OY(j11);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberImage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "app.rive.AssetsKt$rememberImage$1", f = "Assets.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class C00491 extends i implements fz.e {
        final /* synthetic */ CommandQueue $commandQueue;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00491(CommandQueue commandQueue, d<? super C00491> dVar) {
            super(2, dVar);
            this.$commandQueue = commandQueue;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            C00491 c00491 = new C00491(this.$commandQueue, dVar);
            c00491.L$0 = obj;
            return c00491;
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
            byte[] bArr = (byte[]) this.L$0;
            CommandQueue commandQueue = this.$commandQueue;
            this.label = 1;
            Object objM114decodeImagef0BlWSU = commandQueue.m114decodeImagef0BlWSU(bArr, this);
            return objM114decodeImagef0BlWSU == aVar ? aVar : objM114decodeImagef0BlWSU;
        }

        @Override // fz.e
        public final Object invoke(byte[] bArr, d<? super ImageHandle> dVar) {
            return ((C00491) create(bArr, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberImage$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class C00502 extends n implements c {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00502(CommandQueue commandQueue) {
            super(1);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m15invokeJwfOFvA(((ImageHandle) obj).m181unboximpl());
            return b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-JwfOFvA, reason: not valid java name */
        public final void m15invokeJwfOFvA(long j11) {
            this.$commandQueue.m119deleteImageJwfOFvA(j11);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredAudio$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "app.rive.AssetsKt$rememberRegisteredAudio$1", f = "Assets.kt", l = {148}, m = "invokeSuspend")
    public static final class C00511 extends i implements fz.e {
        final /* synthetic */ CommandQueue $commandQueue;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00511(CommandQueue commandQueue, d<? super C00511> dVar) {
            super(2, dVar);
            this.$commandQueue = commandQueue;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            C00511 c00511 = new C00511(this.$commandQueue, dVar);
            c00511.L$0 = obj;
            return c00511;
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
            byte[] bArr = (byte[]) this.L$0;
            CommandQueue commandQueue = this.$commandQueue;
            this.label = 1;
            Object objM112decodeAudioWLIIakE = commandQueue.m112decodeAudioWLIIakE(bArr, this);
            return objM112decodeAudioWLIIakE == aVar ? aVar : objM112decodeAudioWLIIakE;
        }

        @Override // fz.e
        public final Object invoke(byte[] bArr, d<? super AudioHandle> dVar) {
            return ((C00511) create(bArr, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredAudio$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class C00522 extends n implements c {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00522(CommandQueue commandQueue) {
            super(1);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m16invokeQAnvCWo(((AudioHandle) obj).m102unboximpl());
            return b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-QAnvCWo, reason: not valid java name */
        public final void m16invokeQAnvCWo(long j11) {
            this.$commandQueue.m116deleteAudioQAnvCWo(j11);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredAudio$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass3 extends n implements fz.e {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CommandQueue commandQueue) {
            super(2);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m17invoke4kKS7jM((String) obj, ((AudioHandle) obj2).m102unboximpl());
            return b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-4kKS7jM, reason: not valid java name */
        public final void m17invoke4kKS7jM(String key, long j11) {
            m.f(key, "key");
            this.$commandQueue.m140registerAudio4kKS7jM(key, j11);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredAudio$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass4 extends n implements c {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CommandQueue commandQueue) {
            super(1);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return b0.f48488a;
        }

        public final void invoke(String key) {
            m.f(key, "key");
            this.$commandQueue.unregisterAudio(key);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredFont$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "app.rive.AssetsKt$rememberRegisteredFont$1", f = "Assets.kt", l = {213}, m = "invokeSuspend")
    public static final class C00531 extends i implements fz.e {
        final /* synthetic */ CommandQueue $commandQueue;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00531(CommandQueue commandQueue, d<? super C00531> dVar) {
            super(2, dVar);
            this.$commandQueue = commandQueue;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            C00531 c00531 = new C00531(this.$commandQueue, dVar);
            c00531.L$0 = obj;
            return c00531;
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
            byte[] bArr = (byte[]) this.L$0;
            CommandQueue commandQueue = this.$commandQueue;
            this.label = 1;
            Object objM113decodeFontsOckvAc = commandQueue.m113decodeFontsOckvAc(bArr, this);
            return objM113decodeFontsOckvAc == aVar ? aVar : objM113decodeFontsOckvAc;
        }

        @Override // fz.e
        public final Object invoke(byte[] bArr, d<? super FontHandle> dVar) {
            return ((C00531) create(bArr, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredFont$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class C00542 extends n implements c {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00542(CommandQueue commandQueue) {
            super(1);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m18invokewK5q9OY(((FontHandle) obj).m174unboximpl());
            return b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-wK5q9OY, reason: not valid java name */
        public final void m18invokewK5q9OY(long j11) {
            this.$commandQueue.m118deleteFontwK5q9OY(j11);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredFont$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class C00553 extends n implements fz.e {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00553(CommandQueue commandQueue) {
            super(2);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m19invoke8RWjZU((String) obj, ((FontHandle) obj2).m174unboximpl());
            return b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-8-RWjZU, reason: not valid java name */
        public final void m19invoke8RWjZU(String key, long j11) {
            m.f(key, "key");
            this.$commandQueue.m141registerFont8RWjZU(key, j11);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredFont$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class C00564 extends n implements c {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00564(CommandQueue commandQueue) {
            super(1);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return b0.f48488a;
        }

        public final void invoke(String key) {
            m.f(key, "key");
            this.$commandQueue.unregisterFont(key);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredImage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "app.rive.AssetsKt$rememberRegisteredImage$1", f = "Assets.kt", l = {82}, m = "invokeSuspend")
    public static final class C00571 extends i implements fz.e {
        final /* synthetic */ CommandQueue $commandQueue;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00571(CommandQueue commandQueue, d<? super C00571> dVar) {
            super(2, dVar);
            this.$commandQueue = commandQueue;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            C00571 c00571 = new C00571(this.$commandQueue, dVar);
            c00571.L$0 = obj;
            return c00571;
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
            byte[] bArr = (byte[]) this.L$0;
            CommandQueue commandQueue = this.$commandQueue;
            this.label = 1;
            Object objM114decodeImagef0BlWSU = commandQueue.m114decodeImagef0BlWSU(bArr, this);
            return objM114decodeImagef0BlWSU == aVar ? aVar : objM114decodeImagef0BlWSU;
        }

        @Override // fz.e
        public final Object invoke(byte[] bArr, d<? super ImageHandle> dVar) {
            return ((C00571) create(bArr, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredImage$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class C00582 extends n implements c {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00582(CommandQueue commandQueue) {
            super(1);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20invokeJwfOFvA(((ImageHandle) obj).m181unboximpl());
            return b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-JwfOFvA, reason: not valid java name */
        public final void m20invokeJwfOFvA(long j11) {
            this.$commandQueue.m119deleteImageJwfOFvA(j11);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredImage$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class C00593 extends n implements fz.e {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00593(CommandQueue commandQueue) {
            super(2);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m21invokeQieQ09U((String) obj, ((ImageHandle) obj2).m181unboximpl());
            return b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-QieQ09U, reason: not valid java name */
        public final void m21invokeQieQ09U(String key, long j11) {
            m.f(key, "key");
            this.$commandQueue.m142registerImageQieQ09U(key, j11);
        }
    }

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberRegisteredImage$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class C00604 extends n implements c {
        final /* synthetic */ CommandQueue $commandQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00604(CommandQueue commandQueue) {
            super(1);
            this.$commandQueue = commandQueue;
        }

        @Override // fz.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return b0.f48488a;
        }

        public final void invoke(String key) {
            m.f(key, "key");
            this.$commandQueue.unregisterImage(key);
        }
    }

    private static final <T> b3 rememberAsset(CommandQueue commandQueue, byte[] bArr, fz.e eVar, c cVar, String str, String str2, String str3, fz.e eVar2, c cVar2, l1.n nVar, int i11, int i12) {
        s sVar = (s) nVar;
        sVar.d0(1486279639);
        String str4 = (i12 & 64) != 0 ? null : str3;
        fz.e eVar3 = (i12 & 128) != 0 ? null : eVar2;
        c cVar3 = (i12 & 256) != 0 ? null : cVar2;
        Result.Loading loading = Result.Loading.INSTANCE;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(str4, eVar3, cVar3, commandQueue, str, eVar, bArr, str2, cVar, null);
        Object objQ = sVar.Q();
        g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            objQ = t.B(loading);
            sVar.o0(objQ);
        }
        b1 b1Var = (b1) objQ;
        boolean zH = sVar.h(anonymousClass1);
        Object objQ2 = sVar.Q();
        if (zH || objQ2 == gVar) {
            objQ2 = new x2(anonymousClass1, b1Var, null, 3);
            sVar.o0(objQ2);
        }
        t.h(commandQueue, bArr, str4, (fz.e) objQ2, sVar);
        sVar.p(false);
        return b1Var;
    }

    public static final b3 rememberAudio(CommandQueue commandQueue, byte[] bytes, l1.n nVar, int i11) {
        m.f(commandQueue, "commandQueue");
        m.f(bytes, "bytes");
        s sVar = (s) nVar;
        sVar.d0(506304367);
        b3 b3VarRememberAsset = rememberAsset(commandQueue, bytes, new C00461(commandQueue, null), new AnonymousClass2(commandQueue), AUDIO_TAG, "audio", null, null, null, sVar, 221768, 448);
        sVar.p(false);
        return b3VarRememberAsset;
    }

    public static final b3 rememberFont(CommandQueue commandQueue, byte[] bytes, l1.n nVar, int i11) {
        m.f(commandQueue, "commandQueue");
        m.f(bytes, "bytes");
        s sVar = (s) nVar;
        sVar.d0(-1209682496);
        b3 b3VarRememberAsset = rememberAsset(commandQueue, bytes, new C00471(commandQueue, null), new C00482(commandQueue), FONT_TAG, "font", null, null, null, sVar, 221768, 448);
        sVar.p(false);
        return b3VarRememberAsset;
    }

    public static final b3 rememberImage(CommandQueue commandQueue, byte[] bytes, l1.n nVar, int i11) {
        m.f(commandQueue, "commandQueue");
        m.f(bytes, "bytes");
        ((s) nVar).d0(934948234);
        throw new k("An operation is not implemented: Image decoding is not yet functional in the Rive Compose library. It will be implemented in a future release.");
    }

    public static final b3 rememberRegisteredAudio(CommandQueue commandQueue, String name, byte[] bytes, l1.n nVar, int i11) {
        m.f(commandQueue, "commandQueue");
        m.f(name, "name");
        m.f(bytes, "bytes");
        s sVar = (s) nVar;
        sVar.d0(-369379612);
        b3 b3VarRememberAsset = rememberAsset(commandQueue, bytes, new C00511(commandQueue, null), new C00522(commandQueue), AUDIO_TAG, "audio", name, new AnonymousClass3(commandQueue), new AnonymousClass4(commandQueue), sVar, ((i11 << 15) & 3670016) | 221768, 0);
        sVar.p(false);
        return b3VarRememberAsset;
    }

    public static final b3 rememberRegisteredFont(CommandQueue commandQueue, String name, byte[] bytes, l1.n nVar, int i11) {
        m.f(commandQueue, "commandQueue");
        m.f(name, "name");
        m.f(bytes, "bytes");
        s sVar = (s) nVar;
        sVar.d0(-1501161737);
        b3 b3VarRememberAsset = rememberAsset(commandQueue, bytes, new C00531(commandQueue, null), new C00542(commandQueue), FONT_TAG, "font", name, new C00553(commandQueue), new C00564(commandQueue), sVar, ((i11 << 15) & 3670016) | 221768, 0);
        sVar.p(false);
        return b3VarRememberAsset;
    }

    public static final b3 rememberRegisteredImage(CommandQueue commandQueue, String name, byte[] bytes, l1.n nVar, int i11) {
        m.f(commandQueue, "commandQueue");
        m.f(name, "name");
        m.f(bytes, "bytes");
        ((s) nVar).d0(536484969);
        throw new k("An operation is not implemented: Image decoding is not yet functional in the Rive Compose library. It will be implemented in a future release.");
    }
}
