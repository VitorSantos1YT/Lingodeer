package androidx.lifecycle;

import j$.time.Duration;
import kotlin.KotlinNothingValueException;
import qy.b0;
import rz.e0;
import rz.o0;
import rz.v1;
import tz.s;
import tz.t;
import uz.g1;
import uz.x0;
import wz.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowLiveDataConversions {

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {105, 106, 108}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends xy.i implements fz.e {
        final /* synthetic */ LiveData<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @xy.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        public static final class C00021 extends xy.i implements fz.e {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00021(LiveData<T> liveData, Observer<T> observer, vy.d<? super C00021> dVar) {
                super(2, dVar);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // xy.a
            public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
                return new C00021(this.$this_asFlow, this.$observer, dVar);
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
                this.$this_asFlow.observeForever(this.$observer);
                return b0.f48488a;
            }

            @Override // fz.e
            public final Object invoke(rz.b0 b0Var, vy.d<? super b0> dVar) {
                return ((C00021) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @xy.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends xy.i implements fz.e {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LiveData<T> liveData, Observer<T> observer, vy.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // xy.a
            public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
                return new AnonymousClass2(this.$this_asFlow, this.$observer, dVar);
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
                this.$this_asFlow.removeObserver(this.$observer);
                return b0.f48488a;
            }

            @Override // fz.e
            public final Object invoke(rz.b0 b0Var, vy.d<? super b0> dVar) {
                return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiveData<T> liveData, vy.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_asFlow = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, Object obj) {
            ((s) tVar).i(obj);
        }

        @Override // xy.a
        public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // xy.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Observer observer;
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            ?? r9 = this.label;
            try {
                if (r9 == 0) {
                    com.bumptech.glide.e.F(obj);
                    final t tVar = (t) this.L$0;
                    Observer observer2 = new Observer() { // from class: androidx.lifecycle.e
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            FlowLiveDataConversions.AnonymousClass1.invokeSuspend$lambda$0(tVar, obj2);
                        }
                    };
                    yz.f fVar = o0.f50940a;
                    sz.c cVar = m.f55536a.f51961d;
                    C00021 c00021 = new C00021(this.$this_asFlow, observer2, null);
                    this.L$0 = observer2;
                    this.label = 1;
                    observer = observer2;
                    if (e0.M(cVar, c00021, this) == aVar) {
                    }
                    return aVar;
                }
                if (r9 == 1) {
                    Observer observer3 = (Observer) this.L$0;
                    com.bumptech.glide.e.F(obj);
                    observer = observer3;
                } else {
                    if (r9 != 2) {
                        if (r9 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) this.L$0;
                        com.bumptech.glide.e.F(obj);
                        throw th2;
                    }
                    Observer observer4 = (Observer) this.L$0;
                    com.bumptech.glide.e.F(obj);
                    r9 = observer4;
                }
                throw new KotlinNothingValueException();
                this.L$0 = observer;
                this.label = 2;
                r9 = observer;
                if (e0.h(this) == aVar) {
                    return aVar;
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th3) {
                yz.f fVar2 = o0.f50940a;
                vy.i iVarPlus = m.f55536a.f51961d.plus(v1.f50964a);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, r9, null);
                this.L$0 = th3;
                this.label = 3;
                if (e0.M(iVarPlus, anonymousClass2, this) != aVar) {
                    throw th3;
                }
            }
        }

        @Override // fz.e
        public final Object invoke(t tVar, vy.d<? super b0> dVar) {
            return ((AnonymousClass1) create(tVar, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend")
    public static final class C00421 extends xy.i implements fz.e {
        final /* synthetic */ uz.i $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00421(uz.i iVar, vy.d<? super C00421> dVar) {
            super(2, dVar);
            this.$this_asLiveData = iVar;
        }

        @Override // xy.a
        public final vy.d<b0> create(Object obj, vy.d<?> dVar) {
            C00421 c00421 = new C00421(this.$this_asLiveData, dVar);
            c00421.L$0 = obj;
            return c00421;
        }

        @Override // fz.e
        public final Object invoke(LiveDataScope<T> liveDataScope, vy.d<? super b0> dVar) {
            return ((C00421) create(liveDataScope, dVar)).invokeSuspend(b0.f48488a);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                uz.i iVar = this.$this_asLiveData;
                uz.j jVar = new uz.j() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // uz.j
                    public final Object emit(T t6, vy.d<? super b0> dVar) {
                        Object objEmit = liveDataScope.emit(t6, dVar);
                        return objEmit == wy.a.COROUTINE_SUSPENDED ? objEmit : b0.f48488a;
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
    }

    public static final <T> uz.i asFlow(LiveData<T> liveData) {
        kotlin.jvm.internal.m.f(liveData, "<this>");
        return x0.f(x0.g(new AnonymousClass1(liveData, null)), -1);
    }

    public static final <T> LiveData<T> asLiveData(uz.i iVar) {
        kotlin.jvm.internal.m.f(iVar, "<this>");
        return asLiveData$default(iVar, (vy.i) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(uz.i iVar, vy.i iVar2, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar2 = vy.j.f54321a;
        }
        if ((i11 & 2) != 0) {
            j11 = 5000;
        }
        return asLiveData(iVar, iVar2, j11);
    }

    public static final <T> LiveData<T> asLiveData(uz.i iVar, vy.i context) {
        kotlin.jvm.internal.m.f(iVar, "<this>");
        kotlin.jvm.internal.m.f(context, "context");
        return asLiveData$default(iVar, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(uz.i iVar, vy.i context, long j11) {
        kotlin.jvm.internal.m.f(iVar, "<this>");
        kotlin.jvm.internal.m.f(context, "context");
        v6.c cVar = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j11, new C00421(iVar, null));
        if (iVar instanceof g1) {
            if (s.b.M().f50982b.N()) {
                cVar.setValue(((g1) iVar).getValue());
                return cVar;
            }
            cVar.postValue(((g1) iVar).getValue());
        }
        return cVar;
    }

    public static /* synthetic */ LiveData asLiveData$default(uz.i iVar, Duration duration, vy.i iVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            iVar2 = vy.j.f54321a;
        }
        return asLiveData(iVar, duration, iVar2);
    }

    public static final <T> LiveData<T> asLiveData(uz.i iVar, Duration timeout, vy.i context) {
        kotlin.jvm.internal.m.f(iVar, "<this>");
        kotlin.jvm.internal.m.f(timeout, "timeout");
        kotlin.jvm.internal.m.f(context, "context");
        return asLiveData(iVar, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
