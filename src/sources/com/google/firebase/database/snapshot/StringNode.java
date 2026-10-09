package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class StringNode extends LeafNode<StringNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19557c;

    /* JADX INFO: renamed from: com.google.firebase.database.snapshot.StringNode$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19558a;

        static {
            int[] iArr = new int[Node.HashVersion.values().length];
            f19558a = iArr;
            try {
                iArr[Node.HashVersion.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19558a[Node.HashVersion.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public StringNode(String str, Node node) {
        super(node);
        this.f19557c = str;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Node S(Node node) {
        return new StringNode(this.f19557c, node);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public final int b(LeafNode leafNode) {
        return this.f19557c.compareTo(((StringNode) leafNode).f19557c);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public final LeafNode.LeafType e() {
        return LeafNode.LeafType.String;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StringNode)) {
            return false;
        }
        StringNode stringNode = (StringNode) obj;
        return this.f19557c.equals(stringNode.f19557c) && this.f19543a.equals(stringNode.f19543a);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Object getValue() {
        return this.f19557c;
    }

    public final int hashCode() {
        return this.f19543a.hashCode() + this.f19557c.hashCode();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final String v0(Node.HashVersion hashVersion) {
        int i11 = AnonymousClass1.f19558a[hashVersion.ordinal()];
        String str = this.f19557c;
        if (i11 == 1) {
            return f(hashVersion) + "string:" + str;
        }
        if (i11 != 2) {
            throw new IllegalArgumentException("Invalid hash version for string node: " + hashVersion);
        }
        return f(hashVersion) + "string:" + Utilities.d(str);
    }
}
