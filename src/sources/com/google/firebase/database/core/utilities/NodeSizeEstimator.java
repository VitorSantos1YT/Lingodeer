package com.google.firebase.database.core.utilities;

import com.google.firebase.database.snapshot.BooleanNode;
import com.google.firebase.database.snapshot.DoubleNode;
import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.LongNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.StringNode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NodeSizeEstimator {
    public static long a(LeafNode leafNode) {
        long length = 8;
        if (!(leafNode instanceof DoubleNode) && !(leafNode instanceof LongNode)) {
            if (leafNode instanceof BooleanNode) {
                length = 4;
            } else {
                if (!(leafNode instanceof StringNode)) {
                    throw new IllegalArgumentException("Unknown leaf node type: " + leafNode.getClass());
                }
                length = ((long) ((StringNode) leafNode).f19557c.length()) + 2;
            }
        }
        if (leafNode.f19543a.isEmpty()) {
            return length;
        }
        return a((LeafNode) leafNode.f19543a) + length + 24;
    }

    public static long b(Node node) {
        if (node.isEmpty()) {
            return 4L;
        }
        if (node.T0()) {
            return a((LeafNode) node);
        }
        node.getClass().toString();
        char[] cArr = Utilities.f19432a;
        long length = 1;
        for (NamedNode namedNode : node) {
            length = length + ((long) namedNode.f19549a.f19513a.length()) + 4 + b(namedNode.f19550b);
        }
        if (node.y().isEmpty()) {
            return length;
        }
        return a((LeafNode) node.y()) + length + 12;
    }
}
