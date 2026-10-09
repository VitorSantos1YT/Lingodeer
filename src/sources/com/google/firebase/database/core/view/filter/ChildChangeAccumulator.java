package com.google.firebase.database.core.view.filter;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.IndexedNode;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ChildChangeAccumulator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19493a = new HashMap();

    public final void a(Change change) {
        Event.EventType eventType = change.f19450a;
        IndexedNode indexedNode = change.f19451b;
        ChildKey childKey = change.f19453d;
        Event.EventType eventType2 = Event.EventType.CHILD_ADDED;
        if (eventType != eventType2 && eventType != Event.EventType.CHILD_CHANGED) {
            Event.EventType eventType3 = Event.EventType.CHILD_REMOVED;
        }
        char[] cArr = Utilities.f19432a;
        childKey.equals(ChildKey.f19512d);
        HashMap map = this.f19493a;
        if (!map.containsKey(childKey)) {
            map.put(childKey, change);
            return;
        }
        Change change2 = (Change) map.get(childKey);
        Event.EventType eventType4 = change2.f19450a;
        IndexedNode indexedNode2 = change2.f19452c;
        if (eventType == eventType2 && eventType4 == Event.EventType.CHILD_REMOVED) {
            map.put(childKey, new Change(Event.EventType.CHILD_CHANGED, indexedNode, childKey, null, change2.f19451b));
            return;
        }
        Event.EventType eventType5 = Event.EventType.CHILD_REMOVED;
        if (eventType == eventType5 && eventType4 == eventType2) {
            map.remove(childKey);
            return;
        }
        if (eventType == eventType5 && eventType4 == Event.EventType.CHILD_CHANGED) {
            map.put(childKey, new Change(eventType5, indexedNode2, childKey, null, null));
            return;
        }
        Event.EventType eventType6 = Event.EventType.CHILD_CHANGED;
        if (eventType == eventType6 && eventType4 == eventType2) {
            map.put(childKey, new Change(eventType2, indexedNode, childKey, null, null));
            return;
        }
        if (eventType == eventType6 && eventType4 == eventType6) {
            map.put(childKey, new Change(eventType6, indexedNode, childKey, null, indexedNode2));
            return;
        }
        throw new IllegalStateException("Illegal combination of changes: " + change + " occurred after " + change2);
    }
}
