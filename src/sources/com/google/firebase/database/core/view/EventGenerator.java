package com.google.firebase.database.core.view;

import com.google.android.gms.common.internal.Objects;
import com.google.firebase.database.core.EventRegistration;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.KeyIndex;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class EventGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuerySpec f19459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Index f19460b;

    public EventGenerator(QuerySpec querySpec) {
        this.f19459a = querySpec;
        this.f19460b = querySpec.f19477b.f19473g;
    }

    public final void a(ArrayList arrayList, Event.EventType eventType, ArrayList arrayList2, List list, IndexedNode indexedNode) {
        Change change;
        ChildKey childKeyA0;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            Change change2 = (Change) obj;
            if (change2.f19450a.equals(eventType)) {
                arrayList3.add(change2);
            }
        }
        Collections.sort(arrayList3, new Comparator<Change>() { // from class: com.google.firebase.database.core.view.EventGenerator.1
            @Override // java.util.Comparator
            public final int compare(Change change3, Change change4) {
                Change change5 = change3;
                Change change6 = change4;
                if (change5.f19453d != null) {
                    ChildKey childKey = change6.f19453d;
                }
                char[] cArr = Utilities.f19432a;
                return EventGenerator.this.f19460b.compare(new NamedNode(change5.f19453d, change5.f19451b.f19539a), new NamedNode(change6.f19453d, change6.f19451b.f19539a));
            }
        });
        int size2 = arrayList3.size();
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            Change change3 = (Change) obj2;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EventRegistration eventRegistration = (EventRegistration) it.next();
                if (eventRegistration.g(eventType)) {
                    if (change3.f19450a.equals(Event.EventType.VALUE) || change3.f19450a.equals(Event.EventType.CHILD_REMOVED)) {
                        change = change3;
                    } else {
                        ChildKey childKey = change3.f19453d;
                        Node node = change3.f19451b.f19539a;
                        Index index = indexedNode.f19541c;
                        if (!index.equals(KeyIndex.f19542a) && !index.equals(this.f19460b)) {
                            throw new IllegalArgumentException("Index not available in IndexedNode!");
                        }
                        indexedNode.b();
                        if (Objects.a(indexedNode.f19540b, IndexedNode.f19538d)) {
                            childKeyA0 = indexedNode.f19539a.a0(childKey);
                        } else {
                            NamedNode namedNode = (NamedNode) indexedNode.f19540b.f19032a.h(new NamedNode(childKey, node));
                            childKeyA0 = namedNode != null ? namedNode.f19549a : null;
                        }
                        change = new Change(change3.f19450a, change3.f19451b, change3.f19453d, childKeyA0, change3.f19452c);
                    }
                    arrayList.add(eventRegistration.b(change, this.f19459a));
                }
            }
        }
    }
}
