package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.Path;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class EmptyNode extends ChildrenNode implements Node {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EmptyNode f19537e = new EmptyNode();

    private EmptyNode() {
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final int V() {
        return 0;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final ChildKey a0(ChildKey childKey) {
        return null;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, java.lang.Comparable
    /* JADX INFO: renamed from: b */
    public final int compareTo(Node node) {
        return node.isEmpty() ? 0 : -1;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final boolean c1(ChildKey childKey) {
        return false;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode
    public final boolean equals(Object obj) {
        if (obj instanceof EmptyNode) {
            return true;
        }
        if (!(obj instanceof Node)) {
            return false;
        }
        Node node = (Node) obj;
        return node.isEmpty() && equals(node.y());
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final Object getValue() {
        return null;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final Node h1(ChildKey childKey, Node node) {
        return (node.isEmpty() || childKey.equals(ChildKey.f19512d)) ? this : new ChildrenNode().h1(childKey, node);
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final String i() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final Node i0(Path path, Node node) {
        return path.isEmpty() ? node : h1(path.k(), i0(path.n(), node));
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final boolean isEmpty() {
        return true;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, java.lang.Iterable
    public final Iterator<NamedNode> iterator() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final Object p1(boolean z11) {
        return null;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode
    public final String toString() {
        return "<Empty Node>";
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final String v0(Node.HashVersion hashVersion) {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final Iterator v1() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final Node y() {
        return this;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final Node I(Path path) {
        return this;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final Node S(Node node) {
        return this;
    }

    @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
    public final Node x0(ChildKey childKey) {
        return this;
    }
}
