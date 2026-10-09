package com.google.firebase.database.core;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.DataEvent;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.core.view.QuerySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ValueEventRegistration extends EventRegistration {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Repo f19364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ValueEventListener f19365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final QuerySpec f19366f;

    public ValueEventRegistration(Repo repo, ValueEventListener valueEventListener, QuerySpec querySpec) {
        this.f19364d = repo;
        this.f19365e = valueEventListener;
        this.f19366f = querySpec;
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final EventRegistration a(QuerySpec querySpec) {
        return new ValueEventRegistration(this.f19364d, this.f19365e, querySpec);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final DataEvent b(Change change, QuerySpec querySpec) {
        return new DataEvent(Event.EventType.VALUE, this, new DataSnapshot(new DatabaseReference(this.f19364d, querySpec.f19476a), change.f19451b), null);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final void c(DatabaseError databaseError) {
        this.f19365e.d(databaseError);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final void d(DataEvent dataEvent) {
        if (this.f19207a.get()) {
            return;
        }
        this.f19365e.E(dataEvent.f19457c);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final QuerySpec e() {
        return this.f19366f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ValueEventRegistration)) {
            return false;
        }
        ValueEventRegistration valueEventRegistration = (ValueEventRegistration) obj;
        return valueEventRegistration.f19365e.equals(this.f19365e) && valueEventRegistration.f19364d.equals(this.f19364d) && valueEventRegistration.f19366f.equals(this.f19366f);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final boolean f(EventRegistration eventRegistration) {
        return (eventRegistration instanceof ValueEventRegistration) && ((ValueEventRegistration) eventRegistration).f19365e.equals(this.f19365e);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final boolean g(Event.EventType eventType) {
        return eventType == Event.EventType.VALUE;
    }

    public final int hashCode() {
        return this.f19366f.hashCode() + ((this.f19364d.hashCode() + (this.f19365e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ValueEventRegistration";
    }
}
