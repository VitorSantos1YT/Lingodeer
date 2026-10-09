package com.google.firebase.database.snapshot;

import com.google.android.gms.common.internal.Objects;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class IndexedNode implements Iterable<NamedNode> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableSortedSet f19538d = new ImmutableSortedSet(Collections.EMPTY_LIST, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Node f19539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImmutableSortedSet f19540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Index f19541c;

    public IndexedNode(Node node, Index index) {
        this.f19541c = index;
        this.f19539a = node;
        this.f19540b = null;
    }

    public static IndexedNode d(Node node) {
        return new IndexedNode(node, PriorityIndex.f19553a);
    }

    public final void b() {
        if (this.f19540b == null) {
            KeyIndex keyIndex = KeyIndex.f19542a;
            Index index = this.f19541c;
            boolean zEquals = index.equals(keyIndex);
            ImmutableSortedSet immutableSortedSet = f19538d;
            if (zEquals) {
                this.f19540b = immutableSortedSet;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z11 = false;
            for (NamedNode namedNode : this.f19539a) {
                z11 = z11 || index.b(namedNode.f19550b);
                arrayList.add(new NamedNode(namedNode.f19549a, namedNode.f19550b));
            }
            if (z11) {
                this.f19540b = new ImmutableSortedSet(arrayList, index);
            } else {
                this.f19540b = immutableSortedSet;
            }
        }
    }

    public final IndexedNode e(ChildKey childKey, Node node) {
        Node node2 = this.f19539a;
        Node nodeH1 = node2.h1(childKey, node);
        ImmutableSortedSet immutableSortedSet = this.f19540b;
        ImmutableSortedSet immutableSortedSet2 = f19538d;
        boolean zA = Objects.a(immutableSortedSet, immutableSortedSet2);
        Index index = this.f19541c;
        if (zA && !index.b(node)) {
            return new IndexedNode(nodeH1, index, immutableSortedSet2);
        }
        ImmutableSortedSet immutableSortedSet3 = this.f19540b;
        if (immutableSortedSet3 == null || Objects.a(immutableSortedSet3, immutableSortedSet2)) {
            return new IndexedNode(nodeH1, index, null);
        }
        Node nodeX0 = node2.x0(childKey);
        ImmutableSortedSet immutableSortedSet4 = this.f19540b;
        NamedNode namedNode = new NamedNode(childKey, nodeX0);
        ImmutableSortedMap immutableSortedMap = immutableSortedSet4.f19032a;
        ImmutableSortedMap immutableSortedMapL = immutableSortedMap.l(namedNode);
        if (immutableSortedMapL != immutableSortedMap) {
            immutableSortedSet4 = new ImmutableSortedSet(immutableSortedMapL);
        }
        if (!node.isEmpty()) {
            immutableSortedSet4 = new ImmutableSortedSet(immutableSortedSet4.f19032a.k(null, new NamedNode(childKey, node)));
        }
        return new IndexedNode(nodeH1, index, immutableSortedSet4);
    }

    @Override // java.lang.Iterable
    public final Iterator<NamedNode> iterator() {
        b();
        return Objects.a(this.f19540b, f19538d) ? this.f19539a.iterator() : this.f19540b.iterator();
    }

    public IndexedNode(Node node, Index index, ImmutableSortedSet immutableSortedSet) {
        this.f19541c = index;
        this.f19539a = node;
        this.f19540b = immutableSortedSet;
    }
}
