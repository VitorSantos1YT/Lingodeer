package com.google.firebase.components;

import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class EventBus implements Subscriber, Publisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18120a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f18121b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f18122c;

    public EventBus(Executor executor) {
        this.f18122c = executor;
    }

    @Override // com.google.firebase.events.Subscriber
    public final void a(EventHandler eventHandler) {
        b(this.f18122c, eventHandler);
    }

    @Override // com.google.firebase.events.Subscriber
    public final synchronized void b(Executor executor, EventHandler eventHandler) {
        try {
            eventHandler.getClass();
            executor.getClass();
            if (!this.f18120a.containsKey(DataCollectionDefaultChange.class)) {
                this.f18120a.put(DataCollectionDefaultChange.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f18120a.get(DataCollectionDefaultChange.class)).put(eventHandler, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
