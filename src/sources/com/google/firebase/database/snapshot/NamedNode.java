package com.google.firebase.database.snapshot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class NamedNode {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final NamedNode f19547c = new NamedNode(ChildKey.f19510b, EmptyNode.f19537e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final NamedNode f19548d = new NamedNode(ChildKey.f19511c, Node.f19551s);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChildKey f19549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Node f19550b;

    public NamedNode(ChildKey childKey, Node node) {
        this.f19549a = childKey;
        this.f19550b = node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NamedNode.class != obj.getClass()) {
            return false;
        }
        NamedNode namedNode = (NamedNode) obj;
        return this.f19549a.equals(namedNode.f19549a) && this.f19550b.equals(namedNode.f19550b);
    }

    public final int hashCode() {
        return this.f19550b.hashCode() + (this.f19549a.f19513a.hashCode() * 31);
    }

    public final String toString() {
        return "NamedNode{name=" + this.f19549a + ", node=" + this.f19550b + '}';
    }
}
