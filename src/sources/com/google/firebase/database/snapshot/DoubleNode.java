package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;
import defpackage.e;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DoubleNode extends LeafNode<DoubleNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f19536c;

    public DoubleNode(Double d5, Node node) {
        super(node);
        this.f19536c = d5;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Node S(Node node) {
        PriorityUtilities.a(node);
        char[] cArr = Utilities.f19432a;
        return new DoubleNode(this.f19536c, node);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public final int b(LeafNode leafNode) {
        return this.f19536c.compareTo(((DoubleNode) leafNode).f19536c);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public final LeafNode.LeafType e() {
        return LeafNode.LeafType.Number;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DoubleNode)) {
            return false;
        }
        DoubleNode doubleNode = (DoubleNode) obj;
        return this.f19536c.equals(doubleNode.f19536c) && this.f19543a.equals(doubleNode.f19543a);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Object getValue() {
        return this.f19536c;
    }

    public final int hashCode() {
        return this.f19543a.hashCode() + this.f19536c.hashCode();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final String v0(Node.HashVersion hashVersion) {
        StringBuilder sbN = a.n(e.m(f(hashVersion), "number:"));
        sbN.append(Utilities.a(this.f19536c.doubleValue()));
        return sbN.toString();
    }
}
