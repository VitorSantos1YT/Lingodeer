package app.rive.core;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import app.rive.ViewModelInstanceSource;
import app.rive.ViewModelSource;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.ViewModel;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import defpackage.e;
import fa.EQx.nuRcCS;
import fz.c;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l0.Eeqr.HOBXIlHxIkMBEA;
import nv.p;
import rz.b0;
import rz.e0;
import rz.t1;
import tz.a;
import uz.o0;
import uz.s0;
import uz.w0;
import uz.x0;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CommandQueue {
    public static final int MAX_CONCURRENT_SUBSCRIBERS = 8;
    public static final long NULL_POINTER = 0;
    private final o0 _booleanPropertyFlow;
    private final o0 _colorPropertyFlow;
    private final o0 _enumPropertyFlow;
    private final o0 _numberPropertyFlow;
    private final o0 _settledFlow;
    private final o0 _stringPropertyFlow;
    private final o0 _triggerPropertyFlow;
    private final s0 booleanPropertyFlow;
    private final s0 colorPropertyFlow;
    private final EGLConfig config;
    private EGLContext context;
    private long cppPointer;
    private final EGLDisplay display;
    private final s0 enumPropertyFlow;
    private Listeners listeners;
    private final AtomicLong nextRequestID;
    private final s0 numberPropertyFlow;
    private final ConcurrentHashMap<Long, d<Object>> pendingContinuations;
    private final t1 queueDispatcher;
    private AtomicInteger referenceCount;
    private final b0 scope;
    private final s0 settledFlow;
    private final s0 stringPropertyFlow;
    private final s0 triggerPropertyFlow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class PropertyUpdate<T> {
        public static final int $stable = 0;
        private final long handle;
        private final String propertyPath;
        private final T value;

        public /* synthetic */ PropertyUpdate(long j11, String str, Object obj, f fVar) {
            this(j11, str, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-iFQtAB8$default, reason: not valid java name */
        public static /* synthetic */ PropertyUpdate m149copyiFQtAB8$default(PropertyUpdate propertyUpdate, long j11, String str, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                j11 = propertyUpdate.handle;
            }
            if ((i11 & 2) != 0) {
                str = propertyUpdate.propertyPath;
            }
            if ((i11 & 4) != 0) {
                obj = propertyUpdate.value;
            }
            return propertyUpdate.m151copyiFQtAB8(j11, str, obj);
        }

        /* JADX INFO: renamed from: component1-VPLto4w, reason: not valid java name */
        public final long m150component1VPLto4w() {
            return this.handle;
        }

        public final String component2() {
            return this.propertyPath;
        }

        public final T component3() {
            return this.value;
        }

        /* JADX INFO: renamed from: copy-iFQtAB8, reason: not valid java name */
        public final PropertyUpdate<T> m151copyiFQtAB8(long j11, String propertyPath, T t6) {
            m.f(propertyPath, "propertyPath");
            return new PropertyUpdate<>(j11, propertyPath, t6, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PropertyUpdate)) {
                return false;
            }
            PropertyUpdate propertyUpdate = (PropertyUpdate) obj;
            return ViewModelInstanceHandle.m196equalsimpl0(this.handle, propertyUpdate.handle) && m.a(this.propertyPath, propertyUpdate.propertyPath) && m.a(this.value, propertyUpdate.value);
        }

        /* JADX INFO: renamed from: getHandle-VPLto4w, reason: not valid java name */
        public final long m152getHandleVPLto4w() {
            return this.handle;
        }

        public final String getPropertyPath() {
            return this.propertyPath;
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            int iD = e.d(ViewModelInstanceHandle.m197hashCodeimpl(this.handle) * 31, 31, this.propertyPath);
            T t6 = this.value;
            return iD + (t6 == null ? 0 : t6.hashCode());
        }

        public String toString() {
            return "PropertyUpdate(handle=" + ((Object) ViewModelInstanceHandle.m198toStringimpl(this.handle)) + ", propertyPath=" + this.propertyPath + ", value=" + this.value + ')';
        }

        private PropertyUpdate(long j11, String propertyPath, T t6) {
            m.f(propertyPath, "propertyPath");
            this.handle = j11;
            this.propertyPath = propertyPath;
            this.value = t6;
        }
    }

    public CommandQueue(b0 scope) {
        m.f(scope, "scope");
        this.scope = scope;
        this.referenceCount = new AtomicInteger(1);
        yz.f fVar = rz.o0.f50940a;
        this.queueDispatcher = wz.m.f55536a.f51961d;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (m.a(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new RuntimeException("Unable to get EGL display");
        }
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, null, 0, null, 0)) {
            throw new RuntimeException("Unable to initialize EGL");
        }
        m.e(eGLDisplayEglGetDisplay, "also(...)");
        this.display = eGLDisplayEglGetDisplay;
        EGLConfig eGLConfigMakeConfig = makeConfig();
        this.config = eGLConfigMakeConfig;
        EGLContext EGL_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        m.e(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        this.context = EGL_NO_CONTEXT;
        a aVar = a.DROP_OLDEST;
        w0 w0VarA = x0.a(0, 8, aVar);
        this._settledFlow = w0VarA;
        this.settledFlow = w0VarA;
        w0 w0VarA2 = x0.a(0, 8, aVar);
        this._numberPropertyFlow = w0VarA2;
        this.numberPropertyFlow = w0VarA2;
        w0 w0VarA3 = x0.a(0, 8, aVar);
        this._stringPropertyFlow = w0VarA3;
        this.stringPropertyFlow = w0VarA3;
        w0 w0VarA4 = x0.a(0, 8, aVar);
        this._booleanPropertyFlow = w0VarA4;
        this.booleanPropertyFlow = w0VarA4;
        w0 w0VarA5 = x0.a(0, 8, aVar);
        this._enumPropertyFlow = w0VarA5;
        this.enumPropertyFlow = w0VarA5;
        w0 w0VarA6 = x0.a(0, 8, aVar);
        this._colorPropertyFlow = w0VarA6;
        this.colorPropertyFlow = w0VarA6;
        w0 w0VarA7 = x0.a(0, 8, aVar);
        this._triggerPropertyFlow = w0VarA7;
        this.triggerPropertyFlow = w0VarA7;
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new RuntimeException(p.j(iEglGetError, "EGL error: "));
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            throw new RuntimeException("Unable to initialize EGL");
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigMakeConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        m.e(eGLContextEglCreateContext, "eglCreateContext(...)");
        this.context = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            throw new RuntimeException("Unable to create EGL context");
        }
        long jCppConstructor = cppConstructor(eGLDisplayEglGetDisplay.getNativeHandle(), this.context.getNativeHandle());
        this.cppPointer = jCppConstructor;
        this.listeners = cppCreateListeners(jCppConstructor);
        this.pendingContinuations = new ConcurrentHashMap<>();
        this.nextRequestID = new AtomicLong();
    }

    private final native void cppAdvanceStateMachine(long j11, long j12, long j13);

    private final native void cppBindViewModelInstance(long j11, long j12, long j13, long j14);

    private final native long cppConstructor(long j11, long j12);

    private final native long cppCreateArtboardByName(long j11, long j12, long j13, String str);

    private final native long cppCreateDefaultArtboard(long j11, long j12, long j13);

    private final native long cppCreateDefaultStateMachine(long j11, long j12, long j13);

    private final native long cppCreateDrawKey(long j11);

    private final native Listeners cppCreateListeners(long j11);

    private final native long cppCreateRenderTarget(int i11, int i12);

    private final native long cppCreateStateMachineByName(long j11, long j12, long j13, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppDecodeAudio(long j11, long j12, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppDecodeFont(long j11, long j12, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppDecodeImage(long j11, long j12, byte[] bArr);

    private final native long cppDefaultVMCreateBlankVMI(long j11, long j12, long j13, long j14);

    private final native long cppDefaultVMCreateDefaultVMI(long j11, long j12, long j13, long j14);

    private final native long cppDefaultVMCreateNamedVMI(long j11, long j12, long j13, long j14, String str);

    private final native void cppDelete(long j11);

    private final native void cppDeleteArtboard(long j11, long j12, long j13);

    private final native void cppDeleteAudio(long j11, long j12);

    private final native void cppDeleteFile(long j11, long j12, long j13);

    private final native void cppDeleteFont(long j11, long j12);

    private final native void cppDeleteImage(long j11, long j12);

    private final native void cppDeleteStateMachine(long j11, long j12, long j13);

    private final native void cppDeleteViewModelInstance(long j11, long j12, long j13);

    private final native void cppDraw(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i11, int i12, Fit fit, Alignment alignment, int i13);

    private final native void cppFireTriggerProperty(long j11, long j12, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppGetArtboardNames(long j11, long j12, long j13);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppGetBooleanProperty(long j11, long j12, long j13, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppGetColorProperty(long j11, long j12, long j13, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppGetEnumProperty(long j11, long j12, long j13, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppGetEnums(long j11, long j12, long j13);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppGetNumberProperty(long j11, long j12, long j13, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppGetStateMachineNames(long j11, long j12, long j13);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppGetStringProperty(long j11, long j12, long j13, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppGetViewModelInstanceNames(long j11, long j12, long j13, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppGetViewModelNames(long j11, long j12, long j13);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppGetViewModelProperties(long j11, long j12, long j13, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppLoadFile(long j11, long j12, byte[] bArr);

    private final native long cppNamedVMCreateBlankVMI(long j11, long j12, long j13, String str);

    private final native long cppNamedVMCreateDefaultVMI(long j11, long j12, long j13, String str);

    private final native long cppNamedVMCreateNamedVMI(long j11, long j12, long j13, String str, String str2);

    private final native void cppPointerDown(long j11, long j12, Fit fit, Alignment alignment, float f5, float f11, float f12, float f13);

    private final native void cppPointerExit(long j11, long j12, Fit fit, Alignment alignment, float f5, float f11, float f12, float f13);

    private final native void cppPointerMove(long j11, long j12, Fit fit, Alignment alignment, float f5, float f11, float f12, float f13);

    private final native void cppPointerUp(long j11, long j12, Fit fit, Alignment alignment, float f5, float f11, float f12, float f13);

    private final native void cppPollMessages(long j11);

    private final native long cppReferenceNestedVMI(long j11, long j12, long j13, String str);

    private final native void cppRegisterAudio(long j11, String str, long j12);

    private final native void cppRegisterFont(long j11, String str, long j12);

    private final native void cppRegisterImage(long j11, String str, long j12);

    private final native void cppSetBooleanProperty(long j11, long j12, String str, boolean z11);

    private final native void cppSetColorProperty(long j11, long j12, String str, int i11);

    private final native void cppSetEnumProperty(long j11, long j12, String str, String str2);

    private final native void cppSetNumberProperty(long j11, long j12, String str, float f5);

    private final native void cppSetStringProperty(long j11, long j12, String str, String str2);

    private final native void cppSubscribeToProperty(long j11, long j12, String str, int i11);

    private final native void cppUnregisterAudio(long j11, String str);

    private final native void cppUnregisterFont(long j11, String str);

    private final native void cppUnregisterImage(long j11, String str);

    private final EGLConfig makeConfig() {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.display, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 8, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new RuntimeException("Unable to find a suitable EGLConfig");
    }

    /* JADX INFO: renamed from: onPropertyUpdated-UrmHyfM, reason: not valid java name */
    private final <T> void m104onPropertyUpdatedUrmHyfM(long j11, long j12, String str, T t6, o0 o0Var) {
        o0Var.d(new PropertyUpdate(j12, str, t6, null));
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        if (dVarRemove != null) {
            m.d(t6, "null cannot be cast to non-null type kotlin.Any");
            dVarRemove.resumeWith(t6);
        }
    }

    private final <T> Object suspendNativeRequest(c cVar, d<? super T> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(Long.valueOf(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$suspendNativeRequest$2$2(cVar, andIncrement, null), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    /* JADX INFO: renamed from: advanceStateMachine-OFH3VyA, reason: not valid java name */
    public final void m105advanceStateMachineOFH3VyA(long j11, long j12) {
        cppAdvanceStateMachine(this.cppPointer, j11, j12);
    }

    /* JADX INFO: renamed from: bindViewModelInstance-ei-yHz8, reason: not valid java name */
    public final void m106bindViewModelInstanceeiyHz8(long j11, long j12) {
        cppBindViewModelInstance(this.cppPointer, this.nextRequestID.getAndIncrement(), j11, j12);
    }

    /* JADX INFO: renamed from: createArtboardByName-2ZIOzHc, reason: not valid java name */
    public final long m107createArtboardByName2ZIOzHc(long j11, String name) {
        m.f(name, "name");
        return ArtboardHandle.m90constructorimpl(cppCreateArtboardByName(this.cppPointer, this.nextRequestID.getAndIncrement(), j11, name));
    }

    /* JADX INFO: renamed from: createDefaultArtboard-6NrLy0M, reason: not valid java name */
    public final long m108createDefaultArtboard6NrLy0M(long j11) {
        return ArtboardHandle.m90constructorimpl(cppCreateDefaultArtboard(this.cppPointer, this.nextRequestID.getAndIncrement(), j11));
    }

    /* JADX INFO: renamed from: createDefaultStateMachine-xY8vNfM, reason: not valid java name */
    public final long m109createDefaultStateMachinexY8vNfM(long j11) {
        return StateMachineHandle.m187constructorimpl(cppCreateDefaultStateMachine(this.cppPointer, this.nextRequestID.getAndIncrement(), j11));
    }

    /* JADX INFO: renamed from: createStateMachineByName-ItmKBmM, reason: not valid java name */
    public final long m110createStateMachineByNameItmKBmM(long j11, String name) {
        m.f(name, "name");
        return StateMachineHandle.m187constructorimpl(cppCreateStateMachineByName(this.cppPointer, this.nextRequestID.getAndIncrement(), j11, name));
    }

    /* JADX INFO: renamed from: createViewModelInstance-j73Dd8U, reason: not valid java name */
    public final long m111createViewModelInstancej73Dd8U(long j11, ViewModelInstanceSource source) {
        m.f(source, "source");
        if (source instanceof ViewModelInstanceSource.Blank) {
            ViewModelSource viewModelSourceM61unboximpl = ((ViewModelInstanceSource.Blank) source).m61unboximpl();
            if (viewModelSourceM61unboximpl instanceof ViewModelSource.Named) {
                return ViewModelInstanceHandle.m194constructorimpl(cppNamedVMCreateBlankVMI(this.cppPointer, this.nextRequestID.getAndIncrement(), j11, ((ViewModelSource.Named) viewModelSourceM61unboximpl).m88unboximpl()));
            }
            if (viewModelSourceM61unboximpl instanceof ViewModelSource.DefaultForArtboard) {
                return ViewModelInstanceHandle.m194constructorimpl(cppDefaultVMCreateBlankVMI(this.cppPointer, this.nextRequestID.getAndIncrement(), j11, ((ViewModelSource.DefaultForArtboard) viewModelSourceM61unboximpl).m78unboximpl().m11getArtboardHandlenSTdbJo$kotlin_release()));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (source instanceof ViewModelInstanceSource.Default) {
            ViewModelSource viewModelSourceM68unboximpl = ((ViewModelInstanceSource.Default) source).m68unboximpl();
            if (viewModelSourceM68unboximpl instanceof ViewModelSource.Named) {
                return ViewModelInstanceHandle.m194constructorimpl(cppNamedVMCreateDefaultVMI(this.cppPointer, this.nextRequestID.getAndIncrement(), j11, ((ViewModelSource.Named) viewModelSourceM68unboximpl).m88unboximpl()));
            }
            if (viewModelSourceM68unboximpl instanceof ViewModelSource.DefaultForArtboard) {
                return ViewModelInstanceHandle.m194constructorimpl(cppDefaultVMCreateDefaultVMI(this.cppPointer, this.nextRequestID.getAndIncrement(), j11, ((ViewModelSource.DefaultForArtboard) viewModelSourceM68unboximpl).m78unboximpl().m11getArtboardHandlenSTdbJo$kotlin_release()));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(source instanceof ViewModelInstanceSource.Named)) {
            if (!(source instanceof ViewModelInstanceSource.Reference)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewModelInstanceSource.Reference reference = (ViewModelInstanceSource.Reference) source;
            return ViewModelInstanceHandle.m194constructorimpl(cppReferenceNestedVMI(this.cppPointer, this.nextRequestID.getAndIncrement(), reference.getInstance().m43getInstanceHandleVPLto4w$kotlin_release(), reference.getPath()));
        }
        ViewModelInstanceSource.Named named = (ViewModelInstanceSource.Named) source;
        ViewModelSource vmSource = named.getVmSource();
        if (vmSource instanceof ViewModelSource.Named) {
            return ViewModelInstanceHandle.m194constructorimpl(cppNamedVMCreateNamedVMI(this.cppPointer, this.nextRequestID.getAndIncrement(), j11, ((ViewModelSource.Named) vmSource).m88unboximpl(), named.getInstanceName()));
        }
        if (vmSource instanceof ViewModelSource.DefaultForArtboard) {
            return ViewModelInstanceHandle.m194constructorimpl(cppDefaultVMCreateNamedVMI(this.cppPointer, this.nextRequestID.getAndIncrement(), j11, ((ViewModelSource.DefaultForArtboard) vmSource).m78unboximpl().m11getArtboardHandlenSTdbJo$kotlin_release(), named.getInstanceName()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: decodeAudio-WLIIakE, reason: not valid java name */
    public final Object m112decodeAudioWLIIakE(byte[] bArr, d<? super AudioHandle> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$decodeAudioWLIIakE$$inlined$suspendNativeRequest$1(andIncrement, null, this, bArr), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    /* JADX INFO: renamed from: decodeFont-sOckvAc, reason: not valid java name */
    public final Object m113decodeFontsOckvAc(byte[] bArr, d<? super FontHandle> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$decodeFontsOckvAc$$inlined$suspendNativeRequest$1(andIncrement, null, this, bArr), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    /* JADX INFO: renamed from: decodeImage-f0BlWSU, reason: not valid java name */
    public final Object m114decodeImagef0BlWSU(byte[] bArr, d<? super ImageHandle> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$decodeImagef0BlWSU$$inlined$suspendNativeRequest$1(andIncrement, null, this, bArr), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    /* JADX INFO: renamed from: deleteArtboard-uiJWFY8, reason: not valid java name */
    public final void m115deleteArtboarduiJWFY8(long j11) {
        cppDeleteArtboard(this.cppPointer, this.nextRequestID.getAndIncrement(), j11);
    }

    /* JADX INFO: renamed from: deleteAudio-QAnvCWo, reason: not valid java name */
    public final void m116deleteAudioQAnvCWo(long j11) {
        cppDeleteAudio(this.cppPointer, j11);
    }

    /* JADX INFO: renamed from: deleteFile-dJ1Evnk, reason: not valid java name */
    public final void m117deleteFiledJ1Evnk(long j11) {
        cppDeleteFile(this.cppPointer, this.nextRequestID.getAndIncrement(), j11);
    }

    /* JADX INFO: renamed from: deleteFont-wK5q9OY, reason: not valid java name */
    public final void m118deleteFontwK5q9OY(long j11) {
        cppDeleteFont(this.cppPointer, j11);
    }

    /* JADX INFO: renamed from: deleteImage-JwfOFvA, reason: not valid java name */
    public final void m119deleteImageJwfOFvA(long j11) {
        cppDeleteImage(this.cppPointer, j11);
    }

    /* JADX INFO: renamed from: deleteStateMachine-AkTCgDQ, reason: not valid java name */
    public final void m120deleteStateMachineAkTCgDQ(long j11) {
        cppDeleteStateMachine(this.cppPointer, this.nextRequestID.getAndIncrement(), j11);
    }

    /* JADX INFO: renamed from: deleteViewModelInstance-mBajs_U, reason: not valid java name */
    public final void m121deleteViewModelInstancemBajs_U(long j11) {
        cppDeleteViewModelInstance(this.cppPointer, this.nextRequestID.getAndIncrement(), j11);
    }

    /* JADX INFO: renamed from: draw-POUf8go, reason: not valid java name */
    public final void m122drawPOUf8go(long j11, long j12, Fit fit, Alignment alignment, RiveSurface surface, int i11) {
        m.f(fit, "fit");
        m.f(alignment, "alignment");
        m.f(surface, "surface");
        cppDraw(this.cppPointer, this.display.getNativeHandle(), surface.getEglSurface().getNativeHandle(), this.context.getNativeHandle(), surface.m185getDrawKeyDhFih_o(), j11, j12, surface.getRenderTargetPointer(), surface.getWidth(), surface.getHeight(), fit, alignment, i11);
    }

    /* JADX INFO: renamed from: fireTriggerProperty-ippgHXQ, reason: not valid java name */
    public final void m123fireTriggerPropertyippgHXQ(long j11, String propertyPath) {
        m.f(propertyPath, "propertyPath");
        cppFireTriggerProperty(this.cppPointer, j11, propertyPath);
    }

    /* JADX INFO: renamed from: getArtboardNames-evklBmw, reason: not valid java name */
    public final Object m124getArtboardNamesevklBmw(long j11, d<? super List<String>> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$getArtboardNamesevklBmw$$inlined$suspendNativeRequest$1(andIncrement, null, this, j11), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    /* JADX INFO: renamed from: getBooleanProperty-iFQtAB8, reason: not valid java name */
    public final Object m125getBooleanPropertyiFQtAB8(long j11, String str, d<? super Boolean> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$getBooleanPropertyiFQtAB8$$inlined$suspendNativeRequest$1(andIncrement, null, this, j11, str), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public final s0 getBooleanPropertyFlow() {
        return this.booleanPropertyFlow;
    }

    /* JADX INFO: renamed from: getColorProperty-iFQtAB8, reason: not valid java name */
    public final Object m126getColorPropertyiFQtAB8(long j11, String str, d<? super Integer> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$getColorPropertyiFQtAB8$$inlined$suspendNativeRequest$1(andIncrement, null, this, j11, str), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public final s0 getColorPropertyFlow() {
        return this.colorPropertyFlow;
    }

    public final EGLConfig getConfig() {
        return this.config;
    }

    public final EGLContext getContext() {
        return this.context;
    }

    public final EGLDisplay getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: getEnumProperty-iFQtAB8, reason: not valid java name */
    public final Object m127getEnumPropertyiFQtAB8(long j11, String str, d<? super String> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$getEnumPropertyiFQtAB8$$inlined$suspendNativeRequest$1(andIncrement, null, this, j11, str), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public final s0 getEnumPropertyFlow() {
        return this.enumPropertyFlow;
    }

    /* JADX INFO: renamed from: getEnums-evklBmw, reason: not valid java name */
    public final Object m128getEnumsevklBmw(long j11, d<? super List<File.Enum>> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$getEnumsevklBmw$$inlined$suspendNativeRequest$1(andIncrement, null, this, j11), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    /* JADX INFO: renamed from: getNumberProperty-iFQtAB8, reason: not valid java name */
    public final Object m129getNumberPropertyiFQtAB8(long j11, String str, d<? super Float> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$getNumberPropertyiFQtAB8$$inlined$suspendNativeRequest$1(andIncrement, null, this, j11, str), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public final s0 getNumberPropertyFlow() {
        return this.numberPropertyFlow;
    }

    public final int getRefCount$kotlin_release() {
        return this.referenceCount.get();
    }

    public final s0 getSettledFlow() {
        return this.settledFlow;
    }

    /* JADX INFO: renamed from: getStateMachineNames-b88yb0A, reason: not valid java name */
    public final Object m130getStateMachineNamesb88yb0A(long j11, d<? super List<String>> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$getStateMachineNamesb88yb0A$$inlined$suspendNativeRequest$1(andIncrement, null, this, j11), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    /* JADX INFO: renamed from: getStringProperty-iFQtAB8, reason: not valid java name */
    public final Object m131getStringPropertyiFQtAB8(long j11, String str, d<? super String> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$getStringPropertyiFQtAB8$$inlined$suspendNativeRequest$1(andIncrement, null, this, j11, str), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public final s0 getStringPropertyFlow() {
        return this.stringPropertyFlow;
    }

    public final s0 getTriggerPropertyFlow() {
        return this.triggerPropertyFlow;
    }

    /* JADX INFO: renamed from: getViewModelInstanceNames-mgMojzc, reason: not valid java name */
    public final Object m132getViewModelInstanceNamesmgMojzc(long j11, String str, d<? super List<String>> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$getViewModelInstanceNamesmgMojzc$$inlined$suspendNativeRequest$1(andIncrement, null, this, j11, str), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    /* JADX INFO: renamed from: getViewModelNames-evklBmw, reason: not valid java name */
    public final Object m133getViewModelNamesevklBmw(long j11, d<? super List<String>> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$getViewModelNamesevklBmw$$inlined$suspendNativeRequest$1(andIncrement, null, this, j11), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    /* JADX INFO: renamed from: getViewModelProperties-mgMojzc, reason: not valid java name */
    public final Object m134getViewModelPropertiesmgMojzc(long j11, String str, d<? super List<ViewModel.Property>> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$getViewModelPropertiesmgMojzc$$inlined$suspendNativeRequest$1(andIncrement, null, this, j11, str), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    /* JADX INFO: renamed from: loadFile-xVnc2tA, reason: not valid java name */
    public final Object m135loadFilexVnc2tA(byte[] bArr, d<? super FileHandle> dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        long andIncrement = this.nextRequestID.getAndIncrement();
        this.pendingContinuations.put(new Long(andIncrement), mVar);
        mVar.u(new CommandQueue$suspendNativeRequest$2$1(this, andIncrement));
        e0.B(this.scope, this.queueDispatcher, null, new CommandQueue$loadFilexVnc2tA$$inlined$suspendNativeRequest$1(andIncrement, null, this, bArr), 2);
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public final void onArtboardsListed(long j11, List<String> names) {
        m.f(names, "names");
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(names);
        }
    }

    public final void onAudioDecoded(long j11, long j12) {
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(AudioHandle.m96boximpl(j12));
        }
    }

    public final void onAudioError(long j11, String error) {
        m.f(error, "error");
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(com.bumptech.glide.e.l(new RuntimeException("Failed to decode audio: ".concat(error))));
        }
    }

    public final void onBooleanPropertyUpdated(long j11, long j12, String propertyName, boolean z11) {
        m.f(propertyName, "propertyName");
        m104onPropertyUpdatedUrmHyfM(j11, j12, propertyName, Boolean.valueOf(z11), this._booleanPropertyFlow);
    }

    public final void onColorPropertyUpdated(long j11, long j12, String propertyName, int i11) {
        m.f(propertyName, "propertyName");
        m104onPropertyUpdatedUrmHyfM(j11, j12, propertyName, Integer.valueOf(i11), this._colorPropertyFlow);
    }

    public final void onEnumPropertyUpdated(long j11, long j12, String propertyName, String value) {
        m.f(propertyName, "propertyName");
        m.f(value, "value");
        m104onPropertyUpdatedUrmHyfM(j11, j12, propertyName, value, this._enumPropertyFlow);
    }

    public final void onEnumsListed(long j11, List<File.Enum> enums) {
        m.f(enums, "enums");
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(enums);
        }
    }

    public final void onFileError(long j11, String error) {
        m.f(error, "error");
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(com.bumptech.glide.e.l(new RuntimeException("File error: ".concat(error))));
        }
    }

    public final void onFileLoaded(long j11, long j12) {
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(FileHandle.m161boximpl(j12));
        }
    }

    public final void onFontDecoded(long j11, long j12) {
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(FontHandle.m168boximpl(j12));
        }
    }

    public final void onFontError(long j11, String error) {
        m.f(error, "error");
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(com.bumptech.glide.e.l(new RuntimeException("Failed to decode font: ".concat(error))));
        }
    }

    public final void onImageDecoded(long j11, long j12) {
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(ImageHandle.m175boximpl(j12));
        }
    }

    public final void onImageError(long j11, String error) {
        m.f(error, "error");
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(com.bumptech.glide.e.l(new RuntimeException("Failed to decode image: ".concat(error))));
        }
    }

    public final void onStateMachineSettled(long j11) {
        this._settledFlow.d(StateMachineHandle.m186boximpl(j11));
    }

    public final void onStateMachinesListed(long j11, List<String> names) {
        m.f(names, "names");
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(names);
        }
    }

    public final void onStringPropertyUpdated(long j11, long j12, String propertyName, String value) {
        m.f(propertyName, "propertyName");
        m.f(value, "value");
        m104onPropertyUpdatedUrmHyfM(j11, j12, propertyName, value, this._stringPropertyFlow);
    }

    public final void onTriggerPropertyUpdated(long j11, long j12, String propertyName) {
        m.f(propertyName, "propertyName");
        m104onPropertyUpdatedUrmHyfM(j11, j12, propertyName, qy.b0.f48488a, this._triggerPropertyFlow);
    }

    public final void onViewModelInstancesListed(long j11, List<String> names) {
        m.f(names, "names");
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(names);
        }
    }

    public final void onViewModelPropertiesListed(long j11, List<ViewModel.Property> properties) {
        m.f(properties, "properties");
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(properties);
        }
    }

    public final void onViewModelsListed(long j11, List<String> names) {
        m.f(names, "names");
        d<Object> dVarRemove = this.pendingContinuations.remove(Long.valueOf(j11));
        d<Object> dVar = dVarRemove instanceof d ? dVarRemove : null;
        if (dVar != null) {
            dVar.resumeWith(names);
        }
    }

    /* JADX INFO: renamed from: pointerExit-iHGrxBs, reason: not valid java name */
    public final void m137pointerExitiHGrxBs(long j11, Fit fit, Alignment alignment, float f5, float f11, float f12, float f13) {
        m.f(fit, "fit");
        m.f(alignment, "alignment");
        cppPointerExit(this.cppPointer, j11, fit, alignment, f5, f11, f12, f13);
    }

    /* JADX INFO: renamed from: pointerMove-iHGrxBs, reason: not valid java name */
    public final void m138pointerMoveiHGrxBs(long j11, Fit fit, Alignment alignment, float f5, float f11, float f12, float f13) {
        m.f(fit, "fit");
        m.f(alignment, "alignment");
        cppPointerMove(this.cppPointer, j11, fit, alignment, f5, f11, f12, f13);
    }

    /* JADX INFO: renamed from: pointerUp-iHGrxBs, reason: not valid java name */
    public final void m139pointerUpiHGrxBs(long j11, Fit fit, Alignment alignment, float f5, float f11, float f12, float f13) {
        m.f(fit, "fit");
        m.f(alignment, "alignment");
        cppPointerUp(this.cppPointer, j11, fit, alignment, f5, f11, f12, f13);
    }

    public final void pollMessages() {
        cppPollMessages(this.cppPointer);
    }

    /* JADX INFO: renamed from: registerAudio-4kKS7jM, reason: not valid java name */
    public final void m140registerAudio4kKS7jM(String name, long j11) {
        m.f(name, "name");
        cppRegisterAudio(this.cppPointer, name, j11);
    }

    /* JADX INFO: renamed from: registerFont-8-RWjZU, reason: not valid java name */
    public final void m141registerFont8RWjZU(String name, long j11) {
        m.f(name, "name");
        cppRegisterFont(this.cppPointer, name, j11);
    }

    /* JADX INFO: renamed from: registerImage-QieQ09U, reason: not valid java name */
    public final void m142registerImageQieQ09U(String name, long j11) {
        m.f(name, "name");
        cppRegisterImage(this.cppPointer, name, j11);
    }

    public final void release() {
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("CommandQueue released too many times.");
        }
        if (iDecrementAndGet == 0) {
            cppDelete(this.cppPointer);
            this.cppPointer = 0L;
            this.listeners.dispose$kotlin_release();
        }
    }

    /* JADX INFO: renamed from: setBooleanProperty-iFQtAB8, reason: not valid java name */
    public final void m143setBooleanPropertyiFQtAB8(long j11, String propertyPath, boolean z11) {
        m.f(propertyPath, "propertyPath");
        cppSetBooleanProperty(this.cppPointer, j11, propertyPath, z11);
    }

    /* JADX INFO: renamed from: setColorProperty-iFQtAB8, reason: not valid java name */
    public final void m144setColorPropertyiFQtAB8(long j11, String propertyPath, int i11) {
        m.f(propertyPath, "propertyPath");
        cppSetColorProperty(this.cppPointer, j11, propertyPath, i11);
    }

    public final void setContext(EGLContext eGLContext) {
        m.f(eGLContext, "<set-?>");
        this.context = eGLContext;
    }

    /* JADX INFO: renamed from: setEnumProperty-iFQtAB8, reason: not valid java name */
    public final void m145setEnumPropertyiFQtAB8(long j11, String propertyPath, String value) {
        m.f(propertyPath, "propertyPath");
        m.f(value, "value");
        cppSetEnumProperty(this.cppPointer, j11, propertyPath, value);
    }

    /* JADX INFO: renamed from: setNumberProperty-iFQtAB8, reason: not valid java name */
    public final void m146setNumberPropertyiFQtAB8(long j11, String propertyPath, float f5) {
        m.f(propertyPath, "propertyPath");
        cppSetNumberProperty(this.cppPointer, j11, propertyPath, f5);
    }

    /* JADX INFO: renamed from: setStringProperty-iFQtAB8, reason: not valid java name */
    public final void m147setStringPropertyiFQtAB8(long j11, String propertyPath, String value) {
        m.f(propertyPath, "propertyPath");
        m.f(value, "value");
        cppSetStringProperty(this.cppPointer, j11, propertyPath, value);
    }

    /* JADX INFO: renamed from: subscribeToProperty-iFQtAB8, reason: not valid java name */
    public final void m148subscribeToPropertyiFQtAB8(long j11, String propertyPath, ViewModel.PropertyDataType propertyType) {
        m.f(propertyPath, "propertyPath");
        m.f(propertyType, "propertyType");
        cppSubscribeToProperty(this.cppPointer, j11, propertyPath, propertyType.getValue());
    }

    public final void unregisterAudio(String name) {
        m.f(name, "name");
        cppUnregisterAudio(this.cppPointer, name);
    }

    public final void unregisterFont(String name) {
        m.f(name, "name");
        cppUnregisterFont(this.cppPointer, name);
    }

    public final void unregisterImage(String name) {
        m.f(name, "name");
        cppUnregisterImage(this.cppPointer, name);
    }

    public final RiveSurface createRiveSurface(Surface surface) {
        m.f(surface, nuRcCS.HzCTpEf);
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.display, this.config, surface, new int[]{12344}, 0);
        if (m.a(eGLSurfaceEglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
            throw new RuntimeException("Unable to create EGL surface");
        }
        int[] iArr = new int[2];
        EGL14.eglQuerySurface(this.display, eGLSurfaceEglCreateWindowSurface, 12375, iArr, 0);
        EGL14.eglQuerySurface(this.display, eGLSurfaceEglCreateWindowSurface, 12374, iArr, 1);
        int i11 = iArr[0];
        int i12 = iArr[1];
        long jCppCreateRenderTarget = cppCreateRenderTarget(i11, i12);
        long jM155constructorimpl = DrawKey.m155constructorimpl(cppCreateDrawKey(this.cppPointer));
        m.c(eGLSurfaceEglCreateWindowSurface);
        return new RiveSurface(surface, eGLSurfaceEglCreateWindowSurface, this.display, jCppCreateRenderTarget, jM155constructorimpl, i11, i12, null);
    }

    public final void onNumberPropertyUpdated(long j11, long j12, String str, float f5) {
        m.f(str, HOBXIlHxIkMBEA.iQaACsYHngAlU);
        m104onPropertyUpdatedUrmHyfM(j11, j12, str, Float.valueOf(f5), this._numberPropertyFlow);
    }

    /* JADX INFO: renamed from: pointerDown-iHGrxBs, reason: not valid java name */
    public final void m136pointerDowniHGrxBs(long j11, Fit fit, Alignment alignment, float f5, float f11, float f12, float f13) {
        m.f(fit, MzwEyWCkjXL.omWuzc);
        m.f(alignment, "alignment");
        cppPointerDown(this.cppPointer, j11, fit, alignment, f5, f11, f12, f13);
    }
}
