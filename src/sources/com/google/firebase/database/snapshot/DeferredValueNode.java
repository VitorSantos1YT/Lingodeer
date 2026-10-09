package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DeferredValueNode extends LeafNode<DeferredValueNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f19535c;

    public DeferredValueNode(Map map, Node node) {
        super(node);
        this.f19535c = map;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Node S(Node node) {
        PriorityUtilities.a(node);
        char[] cArr = Utilities.f19432a;
        return new DeferredValueNode(this.f19535c, node);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public final /* bridge */ /* synthetic */ int b(LeafNode leafNode) {
        return 0;
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public final LeafNode.LeafType e() {
        return LeafNode.LeafType.DeferredValue;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DeferredValueNode)) {
            return false;
        }
        DeferredValueNode deferredValueNode = (DeferredValueNode) obj;
        return this.f19535c.equals(deferredValueNode.f19535c) && this.f19543a.equals(deferredValueNode.f19543a);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Object getValue() {
        return this.f19535c;
    }

    public final int hashCode() {
        return this.f19543a.hashCode() + this.f19535c.hashCode();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final String v0(Node.HashVersion hashVersion) {
        return f(hashVersion) + "deferredValue:" + this.f19535c;
    }
}
