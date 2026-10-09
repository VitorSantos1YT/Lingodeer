package com.google.firebase.database.snapshot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PriorityIndex extends Index {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PriorityIndex f19553a = new PriorityIndex();

    private PriorityIndex() {
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final String a() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final boolean b(Node node) {
        return !node.y().isEmpty();
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final NamedNode c(ChildKey childKey, Node node) {
        return new NamedNode(childKey, new StringNode("[PRIORITY-POST]", node));
    }

    @Override // java.util.Comparator
    public final int compare(NamedNode namedNode, NamedNode namedNode2) {
        NamedNode namedNode3 = namedNode;
        NamedNode namedNode4 = namedNode2;
        Node nodeY = namedNode3.f19550b.y();
        Node nodeY2 = namedNode4.f19550b.y();
        ChildKey childKey = namedNode3.f19549a;
        ChildKey childKey2 = namedNode4.f19549a;
        int iCompareTo = nodeY.compareTo(nodeY2);
        return iCompareTo != 0 ? iCompareTo : childKey.compareTo(childKey2);
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final NamedNode d() {
        return c(ChildKey.f19511c, Node.f19551s);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof PriorityIndex;
    }

    public final int hashCode() {
        return 3155577;
    }

    public final String toString() {
        return "PriorityIndex";
    }
}
