package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveEventException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import hz.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m;
import lz.g;
import nv.p;
import ry.n;
import ry.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class StateMachineInstance extends NativeObject implements PlayableInstance {
    public static final int $stable = 8;
    private final ReentrantLock lock;
    private ViewModelInstance viewModelInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachineInstance(long j11, ReentrantLock lock) {
        super(j11);
        m.f(lock, "lock");
        this.lock = lock;
    }

    private final SMIInput convertInput(SMIInput sMIInput) throws StateMachineInputException {
        if (sMIInput.isBoolean()) {
            return new SMIBoolean(sMIInput.getCppPointer());
        }
        if (sMIInput.isTrigger()) {
            return new SMITrigger(sMIInput.getCppPointer());
        }
        if (sMIInput.isNumber()) {
            return new SMINumber(sMIInput.getCppPointer());
        }
        throw new StateMachineInputException("Unknown State Machine Input Instance for " + sMIInput.getName() + '.');
    }

    private final LayerState convertLayerState(LayerState layerState) throws StateMachineInputException {
        if (layerState.isAnimationState()) {
            return new AnimationState(layerState.getCppPointer());
        }
        if (layerState.isAnyState()) {
            return new AnyState(layerState.getCppPointer());
        }
        if (layerState.isEntryState()) {
            return new EntryState(layerState.getCppPointer());
        }
        if (layerState.isExitState()) {
            return new ExitState(layerState.getCppPointer());
        }
        if (layerState.isBlendState()) {
            return new BlendState(layerState.getCppPointer());
        }
        throw new StateMachineInputException("Unknown Layer State for " + layerState + '.');
    }

    private final native boolean cppAdvance(long j11, float f5);

    private final native int cppInputCount(long j11);

    private final native int cppLayerCount(long j11);

    private final native String cppName(long j11);

    private final native void cppPointerDown(long j11, float f5, float f11);

    private final native void cppPointerMove(long j11, float f5, float f11);

    private final native void cppPointerUp(long j11, float f5, float f11);

    private final native RiveEventReport cppReportedEventAt(long j11, int i11);

    private final native int cppReportedEventCount(long j11);

    private final native long cppSMIInputByIndex(long j11, int i11);

    private final native void cppSetViewModelInstance(long j11, long j12);

    private final native long cppStateChangedByIndex(long j11, int i11);

    private final native int cppStateChangedCount(long j11);

    private final int getReportedEventCount() {
        return cppReportedEventCount(getCppPointer());
    }

    private final int getStateChangedCount() {
        return cppStateChangedCount(getCppPointer());
    }

    public final boolean advance(float f5) {
        boolean zCppAdvance;
        synchronized (this.lock) {
            zCppAdvance = cppAdvance(getCppPointer(), f5);
        }
        return zCppAdvance;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j11);

    public final RiveEvent eventAt(int i11) throws RiveEventException {
        RiveEventReport riveEventReportCppReportedEventAt = cppReportedEventAt(getCppPointer(), i11);
        if (riveEventReportCppReportedEventAt.getUnsafeCppPointer() != 0) {
            return riveEventReportCppReportedEventAt.getEvent();
        }
        throw new RiveEventException(p.o("No Rive Event found at index ", i11, '.'));
    }

    public final List<RiveEvent> getEventsReported() {
        g gVarU = b.U(0, getReportedEventCount());
        ArrayList arrayList = new ArrayList(n.W(gVarU, 10));
        Iterator it = gVarU.iterator();
        while (it.hasNext()) {
            arrayList.add(eventAt(((w) it).nextInt()));
        }
        return arrayList;
    }

    public final int getInputCount() {
        return cppInputCount(getCppPointer());
    }

    public final List<String> getInputNames() {
        g gVarU = b.U(0, getInputCount());
        ArrayList arrayList = new ArrayList(n.W(gVarU, 10));
        Iterator it = gVarU.iterator();
        while (it.hasNext()) {
            arrayList.add(input(((w) it).nextInt()).getName());
        }
        return arrayList;
    }

    public final List<SMIInput> getInputs() {
        g gVarU = b.U(0, getInputCount());
        ArrayList arrayList = new ArrayList(n.W(gVarU, 10));
        Iterator it = gVarU.iterator();
        while (it.hasNext()) {
            arrayList.add(input(((w) it).nextInt()));
        }
        return arrayList;
    }

    public final int getLayerCount() {
        return cppLayerCount(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.PlayableInstance
    public String getName() {
        return cppName(getCppPointer());
    }

    public final List<LayerState> getStatesChanged() {
        g gVarU = b.U(0, getStateChangedCount());
        ArrayList arrayList = new ArrayList(n.W(gVarU, 10));
        Iterator it = gVarU.iterator();
        while (it.hasNext()) {
            arrayList.add(stateChanged(((w) it).nextInt()));
        }
        return arrayList;
    }

    public final ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public final SMIInput input(int i11) throws StateMachineInputException {
        long jCppSMIInputByIndex = cppSMIInputByIndex(getCppPointer(), i11);
        if (jCppSMIInputByIndex != 0) {
            return convertInput(new SMIInput(jCppSMIInputByIndex));
        }
        throw new StateMachineInputException(p.o("No StateMachineInput found at index ", i11, '.'));
    }

    public final void pointerDown(float f5, float f11) {
        synchronized (this.lock) {
            cppPointerDown(getCppPointer(), f5, f11);
        }
    }

    public final void pointerMove(float f5, float f11) {
        synchronized (this.lock) {
            cppPointerMove(getCppPointer(), f5, f11);
        }
    }

    public final void pointerUp(float f5, float f11) {
        synchronized (this.lock) {
            cppPointerUp(getCppPointer(), f5, f11);
        }
    }

    public final ViewModelInstance receiveViewModelInstance(ViewModelInstance.Transfer transfer) {
        m.f(transfer, "transfer");
        ViewModelInstance viewModelInstanceEnd$kotlin_release = transfer.end$kotlin_release();
        getDependencies().add(viewModelInstanceEnd$kotlin_release);
        setViewModelInstance(viewModelInstanceEnd$kotlin_release);
        return viewModelInstanceEnd$kotlin_release;
    }

    public final void setViewModelInstance(ViewModelInstance viewModelInstance) {
        if (viewModelInstance != null) {
            cppSetViewModelInstance(getCppPointer(), viewModelInstance.getCppPointer());
        }
        this.viewModelInstance = viewModelInstance;
    }

    public final LayerState stateChanged(int i11) throws StateMachineInputException {
        long jCppStateChangedByIndex = cppStateChangedByIndex(getCppPointer(), i11);
        if (jCppStateChangedByIndex != 0) {
            return convertLayerState(new LayerState(jCppStateChangedByIndex));
        }
        throw new StateMachineInputException(p.o("No LayerState found at index ", i11, '.'));
    }

    public final SMIInput input(String name) {
        m.f(name, "name");
        int inputCount = getInputCount();
        for (int i11 = 0; i11 < inputCount; i11++) {
            SMIInput sMIInputInput = input(i11);
            if (m.a(sMIInputInput.getName(), name)) {
                return sMIInputInput;
            }
        }
        throw new StateMachineInputException(p.q("No StateMachineInput found with name ", name, '.'));
    }
}
