package androidx.lifecycle;

import j$.time.Duration;
import qy.b0;
import rz.e0;
import rz.o0;
import wz.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    /* JADX INFO: renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends xy.i implements fz.e {
        final /* synthetic */ LiveData<T> $source;
        final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, vy.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$this_addDisposableSource = mediatorLiveData;
            this.$source = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b0 invokeSuspend$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return b0.f48488a;
        }

        @Override // xy.a
        public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
            return new AnonymousClass2(this.$this_addDisposableSource, this.$source, dVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
            mediatorLiveData.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new c(mediatorLiveData, 0)));
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }

        @Override // fz.e
        public final Object invoke(rz.b0 b0Var, vy.d<? super EmittedSource> dVar) {
            return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, vy.d<? super EmittedSource> dVar) {
        yz.f fVar = o0.f50940a;
        return e0.M(m.f55536a.f51961d, new AnonymousClass2(mediatorLiveData, liveData, null), dVar);
    }

    public static final <T> LiveData<T> liveData(fz.e block) {
        kotlin.jvm.internal.m.f(block, "block");
        return liveData$default((vy.i) null, 0L, block, 3, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(vy.i iVar, long j11, fz.e eVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = vy.j.f54321a;
        }
        if ((i11 & 2) != 0) {
            j11 = 5000;
        }
        return liveData(iVar, j11, eVar);
    }

    public static final <T> LiveData<T> liveData(Duration timeout, fz.e block) {
        kotlin.jvm.internal.m.f(timeout, "timeout");
        kotlin.jvm.internal.m.f(block, "block");
        return liveData$default(timeout, (vy.i) null, block, 2, (Object) null);
    }

    public static final <T> LiveData<T> liveData(vy.i context, fz.e block) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, vy.i iVar, fz.e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            iVar = vy.j.f54321a;
        }
        return liveData(duration, iVar, eVar);
    }

    public static final <T> LiveData<T> liveData(vy.i context, long j11, fz.e block) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(block, "block");
        return new CoroutineLiveData(context, j11, block);
    }

    public static final <T> LiveData<T> liveData(Duration timeout, vy.i context, fz.e block) {
        kotlin.jvm.internal.m.f(timeout, "timeout");
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(block, "block");
        return new CoroutineLiveData(context, Api26Impl.INSTANCE.toMillis(timeout), block);
    }
}
