package com.google.firebase.database.core.view.filter;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class IndexedFilter implements NodeFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Index f19494a;

    public IndexedFilter(Index index) {
        this.f19494a = index;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedNode b(IndexedNode indexedNode, Node node) {
        return indexedNode.f19539a.isEmpty() ? indexedNode : new IndexedNode(indexedNode.f19539a.S(node), indexedNode.f19541c, indexedNode.f19540b);
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final boolean c() {
        return false;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedNode d(IndexedNode indexedNode, ChildKey childKey, Node node, Path path, NodeFilter.CompleteChildSource completeChildSource, ChildChangeAccumulator childChangeAccumulator) {
        indexedNode.getClass();
        char[] cArr = Utilities.f19432a;
        Node node2 = indexedNode.f19539a;
        Node nodeX0 = node2.x0(childKey);
        if (!nodeX0.I(path).equals(node.I(path)) || nodeX0.isEmpty() != node.isEmpty()) {
            if (childChangeAccumulator != null) {
                if (node.isEmpty()) {
                    if (node2.c1(childKey)) {
                        childChangeAccumulator.a(new Change(Event.EventType.CHILD_REMOVED, IndexedNode.d(nodeX0), childKey, null, null));
                    }
                } else if (nodeX0.isEmpty()) {
                    childChangeAccumulator.a(new Change(Event.EventType.CHILD_ADDED, IndexedNode.d(node), childKey, null, null));
                } else {
                    childChangeAccumulator.a(new Change(Event.EventType.CHILD_CHANGED, IndexedNode.d(node), childKey, null, IndexedNode.d(nodeX0)));
                }
            }
            if (!node2.T0() || !node.isEmpty()) {
                return indexedNode.e(childKey, node);
            }
        }
        return indexedNode;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedNode e(IndexedNode indexedNode, IndexedNode indexedNode2, ChildChangeAccumulator childChangeAccumulator) {
        indexedNode2.getClass();
        Node node = indexedNode2.f19539a;
        char[] cArr = Utilities.f19432a;
        if (childChangeAccumulator != null) {
            Node node2 = indexedNode.f19539a;
            for (NamedNode namedNode : node2) {
                if (!node.c1(namedNode.f19549a)) {
                    ChildKey childKey = namedNode.f19549a;
                    childChangeAccumulator.a(new Change(Event.EventType.CHILD_REMOVED, IndexedNode.d(namedNode.f19550b), childKey, null, null));
                }
            }
            if (!node.T0()) {
                for (NamedNode namedNode2 : node) {
                    ChildKey childKey2 = namedNode2.f19549a;
                    Node node3 = namedNode2.f19550b;
                    if (node2.c1(childKey2)) {
                        Node nodeX0 = node2.x0(childKey2);
                        if (!nodeX0.equals(node3)) {
                            childChangeAccumulator.a(new Change(Event.EventType.CHILD_CHANGED, IndexedNode.d(node3), childKey2, null, IndexedNode.d(nodeX0)));
                        }
                    } else {
                        childChangeAccumulator.a(new Change(Event.EventType.CHILD_ADDED, IndexedNode.d(node3), childKey2, null, null));
                    }
                }
            }
        }
        return indexedNode2;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final Index getIndex() {
        return this.f19494a;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedFilter a() {
        return this;
    }
}
