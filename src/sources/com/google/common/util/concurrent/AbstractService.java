package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractService implements Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Monitor f17609a = new Monitor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile StateSnapshot f17610b;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 implements ListenerCallQueue.Event<Service.Listener> {
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 implements ListenerCallQueue.Event<Service.Listener> {
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass5 implements ListenerCallQueue.Event<Service.Listener> {
        public final String toString() {
            return "failed({from = " + ((Object) null) + ", cause = " + ((Object) null) + "})";
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17611a;

        static {
            int[] iArr = new int[Service.State.values().length];
            f17611a = iArr;
            try {
                iArr[Service.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17611a[Service.State.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17611a[Service.State.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17611a[Service.State.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17611a[Service.State.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17611a[Service.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class HasReachedRunningGuard extends Monitor.Guard {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class IsStartableGuard extends Monitor.Guard {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class IsStoppableGuard extends Monitor.Guard {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class IsStoppedGuard extends Monitor.Guard {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StateSnapshot {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Service.State f17612a;

        public StateSnapshot(Service.State state, Throwable th2) {
            Preconditions.h((th2 != null) == (state == Service.State.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th2);
            this.f17612a = state;
        }
    }

    static {
        new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.1
            public final String toString() {
                return "starting()";
            }
        };
        new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.2
            public final String toString() {
                return "running()";
            }
        };
    }

    public AbstractService() {
        new IsStartableGuard(this.f17609a);
        new IsStoppableGuard(this.f17609a);
        new HasReachedRunningGuard(this.f17609a);
        new IsStoppedGuard(this.f17609a);
        new ListenerCallQueue();
        this.f17610b = new StateSnapshot(Service.State.NEW, null);
    }

    public String toString() {
        return getClass().getSimpleName() + " [" + this.f17610b.f17612a + "]";
    }
}
