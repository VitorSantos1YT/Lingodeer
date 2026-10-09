package com.google.common.eventbus;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class Dispatcher {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ImmediateDispatcher extends Dispatcher {
        static {
            new ImmediateDispatcher();
        }

        private ImmediateDispatcher() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LegacyAsyncDispatcher extends Dispatcher {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class EventWithSubscriber {
        }

        private LegacyAsyncDispatcher() {
            new ConcurrentLinkedQueue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class PerThreadQueuedDispatcher extends Dispatcher {

        /* JADX INFO: renamed from: com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class AnonymousClass1 extends ThreadLocal<Queue<Event>> {
            @Override // java.lang.ThreadLocal
            public final Queue<Event> initialValue() {
                return new ArrayDeque();
            }
        }

        /* JADX INFO: renamed from: com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class AnonymousClass2 extends ThreadLocal<Boolean> {
            @Override // java.lang.ThreadLocal
            public final /* bridge */ /* synthetic */ Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Event {
        }

        private PerThreadQueuedDispatcher() {
            new AnonymousClass1();
            new AnonymousClass2();
        }

        public /* synthetic */ PerThreadQueuedDispatcher(int i11) {
            this();
        }
    }
}
