package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class EventBus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f17318b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LoggingHandler implements SubscriberExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoggingHandler f17319a = new LoggingHandler();
    }

    static {
        Logger.getLogger(EventBus.class.getName());
    }

    public EventBus() {
        Executor executorA = MoreExecutors.a();
        new Dispatcher.PerThreadQueuedDispatcher(0);
        LoggingHandler loggingHandler = LoggingHandler.f17319a;
        new ConcurrentHashMap();
        this.f17317a = "default";
        executorA.getClass();
        this.f17318b = executorA;
        loggingHandler.getClass();
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.f(this.f17317a);
        return toStringHelperB.toString();
    }
}
