package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import nv.p;
import uz.g1;
import uz.i1;
import uz.p0;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleRegistry extends Lifecycle {
    public static final Companion Companion = new Companion(null);
    private final p0 _currentStateFlow;
    private int addingObserverCounter;
    private final boolean enforceMainThread;
    private boolean handlingEvent;
    private final WeakReference<LifecycleOwner> lifecycleOwner;
    private boolean newEventOccurred;
    private t.a observerMap;
    private ArrayList<Lifecycle.State> parentStates;
    private Lifecycle.State state;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final LifecycleRegistry createUnsafe(LifecycleOwner owner) {
            m.f(owner, "owner");
            return new LifecycleRegistry(owner, false, null);
        }

        public final Lifecycle.State min$lifecycle_runtime_release(Lifecycle.State state1, Lifecycle.State state) {
            m.f(state1, "state1");
            return (state == null || state.compareTo(state1) >= 0) ? state1 : state;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ObserverWithState {
        private LifecycleEventObserver lifecycleObserver;
        private Lifecycle.State state;

        public ObserverWithState(LifecycleObserver lifecycleObserver, Lifecycle.State initialState) {
            m.f(initialState, "initialState");
            m.c(lifecycleObserver);
            this.lifecycleObserver = Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.state = initialState;
        }

        public final void dispatchEvent(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            m.f(event, "event");
            Lifecycle.State targetState = event.getTargetState();
            this.state = LifecycleRegistry.Companion.min$lifecycle_runtime_release(this.state, targetState);
            LifecycleEventObserver lifecycleEventObserver = this.lifecycleObserver;
            m.c(lifecycleOwner);
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
            this.state = targetState;
        }

        public final LifecycleEventObserver getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        public final Lifecycle.State getState() {
            return this.state;
        }

        public final void setLifecycleObserver(LifecycleEventObserver lifecycleEventObserver) {
            m.f(lifecycleEventObserver, "<set-?>");
            this.lifecycleObserver = lifecycleEventObserver;
        }

        public final void setState(Lifecycle.State state) {
            m.f(state, "<set-?>");
            this.state = state;
        }
    }

    public /* synthetic */ LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z11, kotlin.jvm.internal.f fVar) {
        this(lifecycleOwner, z11);
    }

    private final void backwardPass(LifecycleOwner lifecycleOwner) {
        t.a aVar = this.observerMap;
        t.b bVar = new t.b(aVar.f51975b, aVar.f51974a, 1);
        aVar.f51976c.put(bVar, Boolean.FALSE);
        while (bVar.hasNext() && !this.newEventOccurred) {
            Map.Entry entry = (Map.Entry) bVar.next();
            m.c(entry);
            LifecycleObserver lifecycleObserver = (LifecycleObserver) entry.getKey();
            ObserverWithState observerWithState = (ObserverWithState) entry.getValue();
            while (observerWithState.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.f51963e.containsKey(lifecycleObserver)) {
                Lifecycle.Event eventDownFrom = Lifecycle.Event.Companion.downFrom(observerWithState.getState());
                if (eventDownFrom == null) {
                    throw new IllegalStateException("no event down from " + observerWithState.getState());
                }
                pushParentState(eventDownFrom.getTargetState());
                observerWithState.dispatchEvent(lifecycleOwner, eventDownFrom);
                popParentState();
            }
        }
    }

    private final Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
        ObserverWithState observerWithState;
        HashMap map = this.observerMap.f51963e;
        t.c cVar = map.containsKey(lifecycleObserver) ? ((t.c) map.get(lifecycleObserver)).f51970d : null;
        Lifecycle.State state = (cVar == null || (observerWithState = (ObserverWithState) cVar.f51968b) == null) ? null : observerWithState.getState();
        Lifecycle.State state2 = this.parentStates.isEmpty() ? null : (Lifecycle.State) p.f(1, this.parentStates);
        Companion companion = Companion;
        return companion.min$lifecycle_runtime_release(companion.min$lifecycle_runtime_release(this.state, state), state2);
    }

    public static final LifecycleRegistry createUnsafe(LifecycleOwner lifecycleOwner) {
        return Companion.createUnsafe(lifecycleOwner);
    }

    private final void enforceMainThreadIfNeeded(String str) {
        if (this.enforceMainThread && !LifecycleRegistry_androidKt.isMainThread()) {
            throw new IllegalStateException(ep.a.g("Method ", str, " must be called on the main thread").toString());
        }
    }

    private final void forwardPass(LifecycleOwner lifecycleOwner) {
        t.a aVar = this.observerMap;
        aVar.getClass();
        t.d dVar = new t.d(aVar);
        aVar.f51976c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext() && !this.newEventOccurred) {
            Map.Entry entry = (Map.Entry) dVar.next();
            LifecycleObserver lifecycleObserver = (LifecycleObserver) entry.getKey();
            ObserverWithState observerWithState = (ObserverWithState) entry.getValue();
            while (observerWithState.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.f51963e.containsKey(lifecycleObserver)) {
                pushParentState(observerWithState.getState());
                Lifecycle.Event eventUpFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
                if (eventUpFrom == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.getState());
                }
                observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                popParentState();
            }
        }
    }

    private final boolean isSynced() {
        t.a aVar = this.observerMap;
        if (aVar.f51977d == 0) {
            return true;
        }
        t.c cVar = aVar.f51974a;
        m.c(cVar);
        Lifecycle.State state = ((ObserverWithState) cVar.f51968b).getState();
        t.c cVar2 = this.observerMap.f51975b;
        m.c(cVar2);
        Lifecycle.State state2 = ((ObserverWithState) cVar2.f51968b).getState();
        return state == state2 && this.state == state2;
    }

    private final void moveToState(Lifecycle.State state) {
        if (this.state == state) {
            return;
        }
        LifecycleRegistryKt.checkLifecycleStateTransition(this.lifecycleOwner.get(), this.state, state);
        this.state = state;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        sync();
        this.handlingEvent = false;
        if (this.state == Lifecycle.State.DESTROYED) {
            this.observerMap = new t.a();
        }
    }

    private final void popParentState() {
        ArrayList<Lifecycle.State> arrayList = this.parentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void pushParentState(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    private final void sync() {
        LifecycleOwner lifecycleOwner = this.lifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!isSynced()) {
            this.newEventOccurred = false;
            Lifecycle.State state = this.state;
            t.c cVar = this.observerMap.f51974a;
            m.c(cVar);
            if (state.compareTo(((ObserverWithState) cVar.f51968b).getState()) < 0) {
                backwardPass(lifecycleOwner);
            }
            t.c cVar2 = this.observerMap.f51975b;
            if (!this.newEventOccurred && cVar2 != null && this.state.compareTo(((ObserverWithState) cVar2.f51968b).getState()) > 0) {
                forwardPass(lifecycleOwner);
            }
        }
        this.newEventOccurred = false;
        ((i1) this._currentStateFlow).k(getCurrentState());
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver observer) {
        LifecycleOwner lifecycleOwner;
        m.f(observer, "observer");
        enforceMainThreadIfNeeded("addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        ObserverWithState observerWithState = new ObserverWithState(observer, state2);
        if (((ObserverWithState) this.observerMap.d(observer, observerWithState)) == null && (lifecycleOwner = this.lifecycleOwner.get()) != null) {
            boolean z11 = this.addingObserverCounter != 0 || this.handlingEvent;
            Lifecycle.State stateCalculateTargetState = calculateTargetState(observer);
            this.addingObserverCounter++;
            while (observerWithState.getState().compareTo(stateCalculateTargetState) < 0 && this.observerMap.f51963e.containsKey(observer)) {
                pushParentState(observerWithState.getState());
                Lifecycle.Event eventUpFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
                if (eventUpFrom == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.getState());
                }
                observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                popParentState();
                stateCalculateTargetState = calculateTargetState(observer);
            }
            if (!z11) {
                sync();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return this.state;
    }

    @Override // androidx.lifecycle.Lifecycle
    public g1 getCurrentStateFlow() {
        return new r0(this._currentStateFlow);
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.observerMap.f51977d;
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
        m.f(event, "event");
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    @qy.c
    public void markState(Lifecycle.State state) {
        m.f(state, "state");
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver observer) {
        m.f(observer, "observer");
        enforceMainThreadIfNeeded("removeObserver");
        this.observerMap.e(observer);
    }

    public void setCurrentState(Lifecycle.State state) {
        m.f(state, "state");
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    private LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z11) {
        this.enforceMainThread = z11;
        this.observerMap = new t.a();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.state = state;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(lifecycleOwner);
        this._currentStateFlow = x0.c(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleRegistry(LifecycleOwner provider) {
        this(provider, true);
        m.f(provider, "provider");
    }
}
