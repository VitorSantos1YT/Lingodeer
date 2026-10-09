package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.Path;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PathIndex extends Index {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19552a;

    public PathIndex(Path path) {
        if (path.size() == 1 && path.k().equals(ChildKey.f19512d)) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.f19552a = path;
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final String a() {
        return this.f19552a.o();
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final boolean b(Node node) {
        return !node.I(this.f19552a).isEmpty();
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final NamedNode c(ChildKey childKey, Node node) {
        return new NamedNode(childKey, EmptyNode.f19537e.i0(this.f19552a, node));
    }

    @Override // java.util.Comparator
    public final int compare(NamedNode namedNode, NamedNode namedNode2) {
        NamedNode namedNode3 = namedNode;
        NamedNode namedNode4 = namedNode2;
        Node node = namedNode3.f19550b;
        Path path = this.f19552a;
        int iCompareTo = node.I(path).compareTo(namedNode4.f19550b.I(path));
        return iCompareTo == 0 ? namedNode3.f19549a.compareTo(namedNode4.f19549a) : iCompareTo;
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final NamedNode d() {
        return new NamedNode(ChildKey.f19511c, EmptyNode.f19537e.i0(this.f19552a, Node.f19551s));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && PathIndex.class == obj.getClass() && this.f19552a.equals(((PathIndex) obj).f19552a);
    }

    public final int hashCode() {
        return this.f19552a.hashCode();
    }
}
