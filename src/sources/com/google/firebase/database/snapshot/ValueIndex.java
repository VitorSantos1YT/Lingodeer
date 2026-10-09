package com.google.firebase.database.snapshot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ValueIndex extends Index {
    static {
        new ValueIndex();
    }

    private ValueIndex() {
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final String a() {
        return ".value";
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final boolean b(Node node) {
        return true;
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final NamedNode c(ChildKey childKey, Node node) {
        return new NamedNode(childKey, node);
    }

    @Override // java.util.Comparator
    public final int compare(NamedNode namedNode, NamedNode namedNode2) {
        NamedNode namedNode3 = namedNode;
        NamedNode namedNode4 = namedNode2;
        int iCompareTo = namedNode3.f19550b.compareTo(namedNode4.f19550b);
        return iCompareTo == 0 ? namedNode3.f19549a.compareTo(namedNode4.f19549a) : iCompareTo;
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final NamedNode d() {
        return new NamedNode(ChildKey.f19511c, Node.f19551s);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof ValueIndex;
    }

    public final int hashCode() {
        return 4;
    }

    public final String toString() {
        return "ValueIndex";
    }
}
