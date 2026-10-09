package app.rive;

import app.rive.core.CommandQueue;
import app.rive.core.ViewModelInstanceHandle;
import app.rive.runtime.kotlin.core.ViewModel;
import fz.f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import rz.b0;
import rz.e0;
import uz.g1;
import uz.i1;
import uz.o0;
import uz.s0;
import uz.w0;
import uz.x0;
import vy.d;
import wy.a;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelInstance {
    public static final int $stable = 8;
    private final o0 _dirtyFlow;
    private final Map<String, g1> booleanFlows;
    private final Map<String, g1> colorFlows;
    private final CommandQueue commandQueue;
    private final s0 dirtyFlow;
    private final Map<String, g1> enumFlows;
    private final long instanceHandle;
    private final Map<String, g1> numberFlows;
    private final b0 parentScope;
    private final Map<String, g1> stringFlows;
    private final Map<String, g1> triggerFlows;

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getBooleanFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class AnonymousClass1 extends j implements f {
        public AnonymousClass1(Object obj) {
            super(3, 0, CommandQueue.class, obj, "getBooleanProperty", "getBooleanProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // fz.f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m44invokeiFQtAB8(((ViewModelInstanceHandle) obj).m199unboximpl(), (String) obj2, (d) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m44invokeiFQtAB8(long j11, String str, d<? super Boolean> dVar) {
            return ((CommandQueue) this.receiver).m125getBooleanPropertyiFQtAB8(j11, str, dVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getColorFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class C00621 extends j implements f {
        public C00621(Object obj) {
            super(3, 0, CommandQueue.class, obj, "getColorProperty", "getColorProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // fz.f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m45invokeiFQtAB8(((ViewModelInstanceHandle) obj).m199unboximpl(), (String) obj2, (d) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m45invokeiFQtAB8(long j11, String str, d<? super Integer> dVar) {
            return ((CommandQueue) this.receiver).m126getColorPropertyiFQtAB8(j11, str, dVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getEnumFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class C00631 extends j implements f {
        public C00631(Object obj) {
            super(3, 0, CommandQueue.class, obj, "getEnumProperty", "getEnumProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // fz.f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m46invokeiFQtAB8(((ViewModelInstanceHandle) obj).m199unboximpl(), (String) obj2, (d) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m46invokeiFQtAB8(long j11, String str, d<? super String> dVar) {
            return ((CommandQueue) this.receiver).m127getEnumPropertyiFQtAB8(j11, str, dVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getNumberFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class C00641 extends j implements f {
        public C00641(Object obj) {
            super(3, 0, CommandQueue.class, obj, "getNumberProperty", "getNumberProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // fz.f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m47invokeiFQtAB8(((ViewModelInstanceHandle) obj).m199unboximpl(), (String) obj2, (d) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m47invokeiFQtAB8(long j11, String str, d<? super Float> dVar) {
            return ((CommandQueue) this.receiver).m129getNumberPropertyiFQtAB8(j11, str, dVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getStringFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class C00651 extends j implements f {
        public C00651(Object obj) {
            super(3, 0, CommandQueue.class, obj, "getStringProperty", "getStringProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // fz.f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m48invokeiFQtAB8(((ViewModelInstanceHandle) obj).m199unboximpl(), (String) obj2, (d) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m48invokeiFQtAB8(long j11, String str, d<? super String> dVar) {
            return ((CommandQueue) this.receiver).m131getStringPropertyiFQtAB8(j11, str, dVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getTriggerFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "app.rive.ViewModelInstance$getTriggerFlow$1", f = "ViewModelInstance.kt", l = {}, m = "invokeSuspend")
    public static final class C00661 extends i implements f {
        int label;

        public C00661(d<? super C00661> dVar) {
            super(3, dVar);
        }

        @Override // fz.f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m49invokeiFQtAB8(((ViewModelInstanceHandle) obj).m199unboximpl(), (String) obj2, (d) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m49invokeiFQtAB8(long j11, String str, d<? super qy.b0> dVar) {
            return new C00661(dVar).invokeSuspend(qy.b0.f48488a);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return qy.b0.f48488a;
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setBoolean$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class C00671 extends j implements f {
        public C00671(Object obj) {
            super(3, 0, CommandQueue.class, obj, "setBooleanProperty", "setBooleanProperty-iFQtAB8(JLjava/lang/String;Z)V");
        }

        @Override // fz.f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m50invokeiFQtAB8(((ViewModelInstanceHandle) obj).m199unboximpl(), (String) obj2, ((Boolean) obj3).booleanValue());
            return qy.b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m50invokeiFQtAB8(long j11, String p4, boolean z11) {
            m.f(p4, "p1");
            ((CommandQueue) this.receiver).m143setBooleanPropertyiFQtAB8(j11, p4, z11);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setColor$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class C00681 extends j implements f {
        public C00681(Object obj) {
            super(3, 0, CommandQueue.class, obj, "setColorProperty", "setColorProperty-iFQtAB8(JLjava/lang/String;I)V");
        }

        @Override // fz.f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m51invokeiFQtAB8(((ViewModelInstanceHandle) obj).m199unboximpl(), (String) obj2, ((Number) obj3).intValue());
            return qy.b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m51invokeiFQtAB8(long j11, String p4, int i11) {
            m.f(p4, "p1");
            ((CommandQueue) this.receiver).m144setColorPropertyiFQtAB8(j11, p4, i11);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setEnum$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class C00691 extends j implements f {
        public C00691(Object obj) {
            super(3, 0, CommandQueue.class, obj, "setEnumProperty", "setEnumProperty-iFQtAB8(JLjava/lang/String;Ljava/lang/String;)V");
        }

        @Override // fz.f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m52invokeiFQtAB8(((ViewModelInstanceHandle) obj).m199unboximpl(), (String) obj2, (String) obj3);
            return qy.b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m52invokeiFQtAB8(long j11, String p4, String p11) {
            m.f(p4, "p1");
            m.f(p11, "p2");
            ((CommandQueue) this.receiver).m145setEnumPropertyiFQtAB8(j11, p4, p11);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setNumber$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class C00701 extends j implements f {
        public C00701(Object obj) {
            super(3, 0, CommandQueue.class, obj, "setNumberProperty", "setNumberProperty-iFQtAB8(JLjava/lang/String;F)V");
        }

        @Override // fz.f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m53invokeiFQtAB8(((ViewModelInstanceHandle) obj).m199unboximpl(), (String) obj2, ((Number) obj3).floatValue());
            return qy.b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m53invokeiFQtAB8(long j11, String p4, float f5) {
            m.f(p4, "p1");
            ((CommandQueue) this.receiver).m146setNumberPropertyiFQtAB8(j11, p4, f5);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setString$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class C00711 extends j implements f {
        public C00711(Object obj) {
            super(3, 0, CommandQueue.class, obj, "setStringProperty", "setStringProperty-iFQtAB8(JLjava/lang/String;Ljava/lang/String;)V");
        }

        @Override // fz.f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m54invokeiFQtAB8(((ViewModelInstanceHandle) obj).m199unboximpl(), (String) obj2, (String) obj3);
            return qy.b0.f48488a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m54invokeiFQtAB8(long j11, String p4, String p11) {
            m.f(p4, "p1");
            m.f(p11, "p2");
            ((CommandQueue) this.receiver).m147setStringPropertyiFQtAB8(j11, p4, p11);
        }
    }

    public /* synthetic */ ViewModelInstance(long j11, CommandQueue commandQueue, b0 b0Var, kotlin.jvm.internal.f fVar) {
        this(j11, commandQueue, b0Var);
    }

    private final <T> g1 getPropertyFlow(String str, T t6, Map<String, g1> map, f fVar, s0 s0Var, ViewModel.PropertyDataType propertyDataType) {
        g1 g1Var = map.get(str);
        if (g1Var == null) {
            i1 i1VarC = x0.c(t6);
            this.commandQueue.m148subscribeToPropertyiFQtAB8(this.instanceHandle, str, propertyDataType);
            e0.B(this.parentScope, null, null, new ViewModelInstance$getPropertyFlow$1$1(fVar, this, str, i1VarC, s0Var, null), 3);
            map.put(str, i1VarC);
            g1Var = i1VarC;
        }
        return g1Var;
    }

    private final <T> void setProperty(String str, T t6, f fVar) {
        fVar.invoke(ViewModelInstanceHandle.m193boximpl(this.instanceHandle), str, t6);
        this._dirtyFlow.d(qy.b0.f48488a);
    }

    public final void fireTrigger(String propertyPath) {
        m.f(propertyPath, "propertyPath");
        this.commandQueue.m123fireTriggerPropertyippgHXQ(this.instanceHandle, propertyPath);
    }

    public final g1 getBooleanFlow(String propertyPath, boolean z11) {
        m.f(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, Boolean.valueOf(z11), this.booleanFlows, new AnonymousClass1(this.commandQueue), this.commandQueue.getBooleanPropertyFlow(), ViewModel.PropertyDataType.BOOLEAN);
    }

    public final g1 getColorFlow(String propertyPath, int i11) {
        m.f(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, Integer.valueOf(i11), this.colorFlows, new C00621(this.commandQueue), this.commandQueue.getColorPropertyFlow(), ViewModel.PropertyDataType.COLOR);
    }

    public final s0 getDirtyFlow$kotlin_release() {
        return this.dirtyFlow;
    }

    public final g1 getEnumFlow(String propertyPath, String initialValue) {
        m.f(propertyPath, "propertyPath");
        m.f(initialValue, "initialValue");
        return getPropertyFlow(propertyPath, initialValue, this.enumFlows, new C00631(this.commandQueue), this.commandQueue.getEnumPropertyFlow(), ViewModel.PropertyDataType.ENUM);
    }

    /* JADX INFO: renamed from: getInstanceHandle-VPLto4w$kotlin_release, reason: not valid java name */
    public final long m43getInstanceHandleVPLto4w$kotlin_release() {
        return this.instanceHandle;
    }

    public final g1 getNumberFlow(String propertyPath, float f5) {
        m.f(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, Float.valueOf(f5), this.numberFlows, new C00641(this.commandQueue), this.commandQueue.getNumberPropertyFlow(), ViewModel.PropertyDataType.NUMBER);
    }

    public final g1 getStringFlow(String propertyPath, String initialValue) {
        m.f(propertyPath, "propertyPath");
        m.f(initialValue, "initialValue");
        return getPropertyFlow(propertyPath, initialValue, this.stringFlows, new C00651(this.commandQueue), this.commandQueue.getStringPropertyFlow(), ViewModel.PropertyDataType.STRING);
    }

    public final g1 getTriggerFlow(String propertyPath) {
        m.f(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, qy.b0.f48488a, this.triggerFlows, new C00661(null), this.commandQueue.getTriggerPropertyFlow(), ViewModel.PropertyDataType.TRIGGER);
    }

    public final void setBoolean(String propertyPath, boolean z11) {
        m.f(propertyPath, "propertyPath");
        setProperty(propertyPath, Boolean.valueOf(z11), new C00671(this.commandQueue));
    }

    public final void setColor(String propertyPath, int i11) {
        m.f(propertyPath, "propertyPath");
        setProperty(propertyPath, Integer.valueOf(i11), new C00681(this.commandQueue));
    }

    public final void setEnum(String propertyPath, String value) {
        m.f(propertyPath, "propertyPath");
        m.f(value, "value");
        setProperty(propertyPath, value, new C00691(this.commandQueue));
    }

    public final void setNumber(String propertyPath, float f5) {
        m.f(propertyPath, "propertyPath");
        setProperty(propertyPath, Float.valueOf(f5), new C00701(this.commandQueue));
    }

    public final void setString(String propertyPath, String value) {
        m.f(propertyPath, "propertyPath");
        m.f(value, "value");
        setProperty(propertyPath, value, new C00711(this.commandQueue));
    }

    private ViewModelInstance(long j11, CommandQueue commandQueue, b0 parentScope) {
        m.f(commandQueue, "commandQueue");
        m.f(parentScope, "parentScope");
        this.instanceHandle = j11;
        this.commandQueue = commandQueue;
        this.parentScope = parentScope;
        w0 w0VarA = x0.a(1, 1, tz.a.DROP_OLDEST);
        this._dirtyFlow = w0VarA;
        this.dirtyFlow = w0VarA;
        this.numberFlows = new LinkedHashMap();
        this.stringFlows = new LinkedHashMap();
        this.booleanFlows = new LinkedHashMap();
        this.enumFlows = new LinkedHashMap();
        this.colorFlows = new LinkedHashMap();
        this.triggerFlows = new LinkedHashMap();
    }
}
