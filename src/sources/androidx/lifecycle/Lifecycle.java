package androidx.lifecycle;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import uz.g1;
import uz.i1;
import uz.p0;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Lifecycle {
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>(null);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        private static final /* synthetic */ yy.a $ENTRIES = ub.a.U(values());
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Companion {

            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final Event downFrom(State state) {
                m.f(state, "state");
                int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i11 == 1) {
                    return Event.ON_DESTROY;
                }
                if (i11 == 2) {
                    return Event.ON_STOP;
                }
                if (i11 != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            public final Event downTo(State state) {
                m.f(state, "state");
                int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i11 == 1) {
                    return Event.ON_STOP;
                }
                if (i11 == 2) {
                    return Event.ON_PAUSE;
                }
                if (i11 != 4) {
                    return null;
                }
                return Event.ON_DESTROY;
            }

            public final Event upFrom(State state) {
                m.f(state, "state");
                int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i11 == 1) {
                    return Event.ON_START;
                }
                if (i11 == 2) {
                    return Event.ON_RESUME;
                }
                if (i11 != 5) {
                    return null;
                }
                return Event.ON_CREATE;
            }

            public final Event upTo(State state) {
                m.f(state, "state");
                int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i11 == 1) {
                    return Event.ON_CREATE;
                }
                if (i11 == 2) {
                    return Event.ON_START;
                }
                if (i11 != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static final Event downFrom(State state) {
            return Companion.downFrom(state);
        }

        public static final Event downTo(State state) {
            return Companion.downTo(state);
        }

        public static yy.a getEntries() {
            return $ENTRIES;
        }

        public static final Event upFrom(State state) {
            return Companion.upFrom(state);
        }

        public static final Event upTo(State state) {
            return Companion.upTo(state);
        }

        public final State getTargetState() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        private static final /* synthetic */ yy.a $ENTRIES = ub.a.U(values());

        public static yy.a getEntries() {
            return $ENTRIES;
        }

        public final boolean isAtLeast(State state) {
            m.f(state, "state");
            return compareTo(state) >= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_currentStateFlow_$lambda$0(p0 p0Var, LifecycleOwner lifecycleOwner, Event event) {
        m.f(lifecycleOwner, "<unused var>");
        m.f(event, "event");
        ((i1) p0Var).k(event.getTargetState());
    }

    public abstract void addObserver(LifecycleObserver lifecycleObserver);

    public abstract State getCurrentState();

    public g1 getCurrentStateFlow() {
        i1 i1VarC = x0.c(getCurrentState());
        addObserver(new g(i1VarC, 1));
        return new r0(i1VarC);
    }

    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public abstract void removeObserver(LifecycleObserver lifecycleObserver);

    public final void setInternalScopeRef(AtomicReference<Object> atomicReference) {
        m.f(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
