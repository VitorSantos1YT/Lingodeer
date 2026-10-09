package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class ServiceManager implements ServiceManagerBridge {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class EmptyServiceManagerWarning extends Throwable {
        private EmptyServiceManagerWarning() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FailedService extends Throwable {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Listener {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NoOpService extends AbstractService {
        private NoOpService() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ServiceListener extends Service.Listener {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ServiceManagerState {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 implements Function<Map.Entry<Service, Long>, Long> {
            @Override // com.google.common.base.Function
            public final Long apply(Map.Entry<Service, Long> entry) {
                return entry.getValue();
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 implements ListenerCallQueue.Event<Listener> {
            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public final class AwaitHealthGuard extends Monitor.Guard {
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public final class StoppedGuard extends Monitor.Guard {
        }
    }

    static {
        new LazyLogger(ServiceManager.class);
        new ListenerCallQueue.Event<Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.1
            public final String toString() {
                return "healthy()";
            }
        };
        new ListenerCallQueue.Event<Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.2
            public final String toString() {
                return "stopped()";
            }
        };
    }

    public final String toString() {
        new MoreObjects.ToStringHelper("ServiceManager");
        Collections2.b(Predicates.h(Predicates.g(NoOpService.class)));
        throw null;
    }
}
