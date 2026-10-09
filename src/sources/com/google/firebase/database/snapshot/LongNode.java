package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;
import defpackage.e;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LongNode extends LeafNode<LongNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19546c;

    public LongNode(Long l9, Node node) {
        super(node);
        this.f19546c = l9.longValue();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Node S(Node node) {
        return new LongNode(Long.valueOf(this.f19546c), node);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public final int b(LeafNode leafNode) {
        long j11 = ((LongNode) leafNode).f19546c;
        char[] cArr = Utilities.f19432a;
        long j12 = this.f19546c;
        if (j12 < j11) {
            return -1;
        }
        return j12 == j11 ? 0 : 1;
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public final LeafNode.LeafType e() {
        return LeafNode.LeafType.Number;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LongNode)) {
            return false;
        }
        LongNode longNode = (LongNode) obj;
        return this.f19546c == longNode.f19546c && this.f19543a.equals(longNode.f19543a);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Object getValue() {
        return Long.valueOf(this.f19546c);
    }

    public final int hashCode() {
        long j11 = this.f19546c;
        return this.f19543a.hashCode() + ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final String v0(Node.HashVersion hashVersion) {
        StringBuilder sbN = a.n(e.m(f(hashVersion), "number:"));
        sbN.append(Utilities.a(this.f19546c));
        return sbN.toString();
    }
}
