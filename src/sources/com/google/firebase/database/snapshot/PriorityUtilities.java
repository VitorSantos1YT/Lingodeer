package com.google.firebase.database.snapshot;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.core.Path;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PriorityUtilities {
    public static boolean a(Node node) {
        if (node.y().isEmpty()) {
            return node.isEmpty() || (node instanceof DoubleNode) || (node instanceof StringNode) || (node instanceof DeferredValueNode);
        }
        return false;
    }

    public static Node b(Path path, Object obj) {
        String str;
        EmptyNode emptyNode = EmptyNode.f19537e;
        Node nodeA = NodeUtilities.a(obj, emptyNode);
        if (nodeA instanceof LongNode) {
            nodeA = new DoubleNode(Double.valueOf(((LongNode) nodeA).f19546c), emptyNode);
        }
        if (a(nodeA)) {
            return nodeA;
        }
        StringBuilder sb2 = new StringBuilder();
        if (path != null) {
            str = "Path '" + path + "'";
        } else {
            str = "Node";
        }
        throw new DatabaseException(a.k(sb2, str, " contains invalid priority: Must be a string, double, ServerValue, or null"));
    }
}
