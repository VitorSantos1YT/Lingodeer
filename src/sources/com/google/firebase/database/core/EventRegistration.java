package com.google.firebase.database.core;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.DataEvent;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.core.view.QuerySpec;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EventRegistration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EventRegistrationZombieListener f19208b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f19207a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19209c = false;

    public abstract EventRegistration a(QuerySpec querySpec);

    public abstract DataEvent b(Change change, QuerySpec querySpec);

    public abstract void c(DatabaseError databaseError);

    public abstract void d(DataEvent dataEvent);

    public abstract QuerySpec e();

    public abstract boolean f(EventRegistration eventRegistration);

    public abstract boolean g(Event.EventType eventType);

    public final void h() {
        EventRegistrationZombieListener eventRegistrationZombieListener;
        if (!this.f19207a.compareAndSet(false, true) || (eventRegistrationZombieListener = this.f19208b) == null) {
            return;
        }
        eventRegistrationZombieListener.a(this);
        this.f19208b = null;
    }
}
