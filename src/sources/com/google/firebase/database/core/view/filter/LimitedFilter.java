package com.google.firebase.database.core.view.filter;

import com.google.android.gms.common.internal.Objects;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.core.view.QueryParams;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.ChildrenNode;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LimitedFilter implements NodeFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RangedFilter f19495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Index f19496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19498d;

    public LimitedFilter(QueryParams queryParams) {
        this.f19495a = new RangedFilter(queryParams);
        this.f19496b = queryParams.f19473g;
        if (!queryParams.d()) {
            throw new IllegalArgumentException("Cannot get limit if limit has not been set");
        }
        this.f19497c = queryParams.f19467a.intValue();
        this.f19498d = !queryParams.f();
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedFilter a() {
        return this.f19495a.f19499a;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final boolean c() {
        return true;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedNode d(IndexedNode indexedNode, ChildKey childKey, Node node, Path path, NodeFilter.CompleteChildSource completeChildSource, ChildChangeAccumulator childChangeAccumulator) {
        NamedNode namedNode;
        int iCompare;
        NamedNode namedNode2 = new NamedNode(childKey, node);
        RangedFilter rangedFilter = this.f19495a;
        Node node2 = !rangedFilter.f(namedNode2) ? EmptyNode.f19537e : node;
        Node node3 = indexedNode.f19539a;
        if (node3.x0(childKey).equals(node2)) {
            return indexedNode;
        }
        if (node3.V() < this.f19497c) {
            return rangedFilter.f19499a.d(indexedNode, childKey, node2, path, completeChildSource, childChangeAccumulator);
        }
        Node node4 = node2;
        node3.V();
        char[] cArr = Utilities.f19432a;
        NamedNode namedNode3 = new NamedNode(childKey, node4);
        NamedNode namedNode4 = null;
        boolean z11 = this.f19498d;
        if (z11) {
            if (node3 instanceof ChildrenNode) {
                indexedNode.b();
                if (Objects.a(indexedNode.f19540b, IndexedNode.f19538d)) {
                    ChildKey childKey2 = (ChildKey) ((ChildrenNode) node3).f19516a.g();
                    namedNode = new NamedNode(childKey2, node3.x0(childKey2));
                    namedNode4 = namedNode;
                } else {
                    namedNode4 = (NamedNode) indexedNode.f19540b.f19032a.g();
                }
            }
        } else if (node3 instanceof ChildrenNode) {
            indexedNode.b();
            if (Objects.a(indexedNode.f19540b, IndexedNode.f19538d)) {
                ChildKey childKey3 = (ChildKey) ((ChildrenNode) node3).f19516a.f();
                namedNode = new NamedNode(childKey3, node3.x0(childKey3));
                namedNode4 = namedNode;
            } else {
                namedNode4 = (NamedNode) indexedNode.f19540b.f19032a.f();
            }
        }
        NamedNode namedNode5 = namedNode4;
        boolean zF = rangedFilter.f(namedNode3);
        boolean zC1 = node3.c1(childKey);
        Index index = this.f19496b;
        if (!zC1) {
            if (node4.isEmpty() || !zF) {
                return indexedNode;
            }
            if ((z11 ? index.compare(namedNode3, namedNode5) : index.compare(namedNode5, namedNode3)) < 0) {
                return indexedNode;
            }
            if (childChangeAccumulator != null) {
                childChangeAccumulator.a(new Change(Event.EventType.CHILD_REMOVED, IndexedNode.d(namedNode5.f19550b), namedNode5.f19549a, null, null));
                childChangeAccumulator.a(new Change(Event.EventType.CHILD_ADDED, IndexedNode.d(node4), childKey, null, null));
            }
            return indexedNode.e(childKey, node4).e(namedNode5.f19549a, EmptyNode.f19537e);
        }
        Node nodeX0 = node3.x0(childKey);
        NamedNode namedNodeA = completeChildSource.a(index, namedNode5, z11);
        while (namedNodeA != null) {
            ChildKey childKey4 = namedNodeA.f19549a;
            if (!childKey4.equals(childKey) && !node3.c1(childKey4)) {
                break;
            }
            namedNodeA = completeChildSource.a(index, namedNodeA, z11);
        }
        if (namedNodeA == null) {
            iCompare = 1;
        } else {
            iCompare = z11 ? index.compare(namedNode3, namedNodeA) : index.compare(namedNodeA, namedNode3);
        }
        if (zF && !node4.isEmpty() && iCompare >= 0) {
            if (childChangeAccumulator != null) {
                childChangeAccumulator.a(new Change(Event.EventType.CHILD_CHANGED, IndexedNode.d(node4), childKey, null, IndexedNode.d(nodeX0)));
            }
            return indexedNode.e(childKey, node4);
        }
        if (childChangeAccumulator != null) {
            childChangeAccumulator.a(new Change(Event.EventType.CHILD_REMOVED, IndexedNode.d(nodeX0), childKey, null, null));
        }
        IndexedNode indexedNodeE = indexedNode.e(childKey, EmptyNode.f19537e);
        if (namedNodeA == null) {
            return indexedNodeE;
        }
        Node node5 = namedNodeA.f19550b;
        ChildKey childKey5 = namedNodeA.f19549a;
        if (!rangedFilter.f(namedNodeA)) {
            return indexedNodeE;
        }
        if (childChangeAccumulator != null) {
            childChangeAccumulator.a(new Change(Event.EventType.CHILD_ADDED, IndexedNode.d(node5), childKey5, null, null));
        }
        return indexedNodeE.e(childKey5, node5);
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedNode e(IndexedNode indexedNode, IndexedNode indexedNode2, ChildChangeAccumulator childChangeAccumulator) {
        IndexedNode indexedNode3;
        Iterator it;
        NamedNode namedNode;
        NamedNode namedNode2;
        int i11;
        Node node = indexedNode2.f19539a;
        boolean zT0 = node.T0();
        Index index = this.f19496b;
        RangedFilter rangedFilter = this.f19495a;
        if (zT0 || node.isEmpty()) {
            indexedNode3 = new IndexedNode(EmptyNode.f19537e, index);
        } else {
            indexedNode3 = new IndexedNode(indexedNode2.f19539a.S(EmptyNode.f19537e), indexedNode2.f19541c, indexedNode2.f19540b);
            if (this.f19498d) {
                indexedNode2.b();
                it = Objects.a(indexedNode2.f19540b, IndexedNode.f19538d) ? node.v1() : indexedNode2.f19540b.v1();
                namedNode = rangedFilter.f19502d;
                namedNode2 = rangedFilter.f19501c;
                i11 = -1;
            } else {
                it = indexedNode2.iterator();
                namedNode = rangedFilter.f19501c;
                namedNode2 = rangedFilter.f19502d;
                i11 = 1;
            }
            boolean z11 = false;
            int i12 = 0;
            while (it.hasNext()) {
                NamedNode next = it.next();
                if (!z11 && index.compare(namedNode, next) * i11 <= 0) {
                    z11 = true;
                }
                if (!z11 || i12 >= this.f19497c || index.compare(next, namedNode2) * i11 > 0) {
                    indexedNode3 = indexedNode3.e(next.f19549a, EmptyNode.f19537e);
                } else {
                    i12++;
                }
            }
        }
        rangedFilter.f19499a.e(indexedNode, indexedNode3, childChangeAccumulator);
        return indexedNode3;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final Index getIndex() {
        return this.f19496b;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedNode b(IndexedNode indexedNode, Node node) {
        return indexedNode;
    }
}
