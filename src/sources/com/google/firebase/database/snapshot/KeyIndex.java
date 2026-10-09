package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class KeyIndex extends Index {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final KeyIndex f19542a = new KeyIndex();

    private KeyIndex() {
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final String a() {
        return ".key";
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final boolean b(Node node) {
        return true;
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final NamedNode c(ChildKey childKey, Node node) {
        char[] cArr = Utilities.f19432a;
        return new NamedNode(ChildKey.b((String) node.getValue()), EmptyNode.f19537e);
    }

    @Override // java.util.Comparator
    public final int compare(NamedNode namedNode, NamedNode namedNode2) {
        return namedNode.f19549a.compareTo(namedNode2.f19549a);
    }

    @Override // com.google.firebase.database.snapshot.Index
    public final NamedNode d() {
        return NamedNode.f19548d;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof KeyIndex;
    }

    public final int hashCode() {
        return 37;
    }

    public final String toString() {
        return "KeyIndex";
    }
}
