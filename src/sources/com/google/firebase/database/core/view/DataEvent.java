package com.google.firebase.database.core.view;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.core.EventRegistration;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.snapshot.IndexedNode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DataEvent implements Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Event.EventType f19455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventRegistration f19456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataSnapshot f19457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19458d;

    public DataEvent(Event.EventType eventType, EventRegistration eventRegistration, DataSnapshot dataSnapshot, String str) {
        this.f19455a = eventType;
        this.f19456b = eventRegistration;
        this.f19457c = dataSnapshot;
        this.f19458d = str;
    }

    @Override // com.google.firebase.database.core.view.Event
    public final void a() {
        this.f19456b.d(this);
    }

    @Override // com.google.firebase.database.core.view.Event
    public final String toString() {
        DataSnapshot dataSnapshot = this.f19457c;
        IndexedNode indexedNode = dataSnapshot.f18954a;
        Event.EventType eventType = Event.EventType.VALUE;
        Event.EventType eventType2 = this.f19455a;
        if (eventType2 == eventType) {
            StringBuilder sb2 = new StringBuilder();
            Path pathL = dataSnapshot.f18955b.f18989b;
            if (eventType2 != eventType) {
                pathL = pathL.l();
            }
            sb2.append(pathL);
            sb2.append(": ");
            sb2.append(eventType2);
            sb2.append(": ");
            sb2.append(indexedNode.f19539a.p1(true));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        Path pathL2 = dataSnapshot.f18955b.f18989b;
        if (eventType2 != eventType) {
            pathL2 = pathL2.l();
        }
        sb3.append(pathL2);
        sb3.append(": ");
        sb3.append(eventType2);
        sb3.append(": { ");
        sb3.append(dataSnapshot.f18955b.f());
        sb3.append(": ");
        sb3.append(indexedNode.f19539a.p1(true));
        sb3.append(" }");
        return sb3.toString();
    }
}
