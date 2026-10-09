package com.google.firebase.database.core.view;

import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.IndexedNode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Change {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Event.EventType f19450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IndexedNode f19451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IndexedNode f19452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ChildKey f19453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ChildKey f19454e;

    public Change(Event.EventType eventType, IndexedNode indexedNode, ChildKey childKey, ChildKey childKey2, IndexedNode indexedNode2) {
        this.f19450a = eventType;
        this.f19451b = indexedNode;
        this.f19453d = childKey;
        this.f19454e = childKey2;
        this.f19452c = indexedNode2;
    }

    public final String toString() {
        return "Change: " + this.f19450a + " " + this.f19453d;
    }
}
