package com.google.firebase.database.snapshot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BooleanNode extends LeafNode<BooleanNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19509c;

    public BooleanNode(Boolean bool, Node node) {
        super(node);
        this.f19509c = bool.booleanValue();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Node S(Node node) {
        return new BooleanNode(Boolean.valueOf(this.f19509c), node);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public final int b(LeafNode leafNode) {
        boolean z11 = ((BooleanNode) leafNode).f19509c;
        boolean z12 = this.f19509c;
        if (z12 == z11) {
            return 0;
        }
        return z12 ? 1 : -1;
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public final LeafNode.LeafType e() {
        return LeafNode.LeafType.Boolean;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BooleanNode)) {
            return false;
        }
        BooleanNode booleanNode = (BooleanNode) obj;
        return this.f19509c == booleanNode.f19509c && this.f19543a.equals(booleanNode.f19543a);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Object getValue() {
        return Boolean.valueOf(this.f19509c);
    }

    public final int hashCode() {
        return this.f19543a.hashCode() + (this.f19509c ? 1 : 0);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final String v0(Node.HashVersion hashVersion) {
        return f(hashVersion) + "boolean:" + this.f19509c;
    }
}
