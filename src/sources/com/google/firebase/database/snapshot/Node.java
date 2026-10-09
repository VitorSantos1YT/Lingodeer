package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.Path;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface Node extends Comparable<Node>, Iterable<NamedNode> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ChildrenNode f19551s = new ChildrenNode() { // from class: com.google.firebase.database.snapshot.Node.1
        @Override // com.google.firebase.database.snapshot.ChildrenNode
        /* JADX INFO: renamed from: b */
        public final int compareTo(Node node) {
            return node == this ? 0 : 1;
        }

        @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
        public final boolean c1(ChildKey childKey) {
            return false;
        }

        @Override // com.google.firebase.database.snapshot.ChildrenNode, java.lang.Comparable
        public final int compareTo(Node node) {
            return node == this ? 0 : 1;
        }

        @Override // com.google.firebase.database.snapshot.ChildrenNode
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
        public final boolean isEmpty() {
            return false;
        }

        @Override // com.google.firebase.database.snapshot.ChildrenNode
        public final String toString() {
            return "<Max Node>";
        }

        @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
        public final Node x0(ChildKey childKey) {
            return childKey.equals(ChildKey.f19512d) ? this : EmptyNode.f19537e;
        }

        @Override // com.google.firebase.database.snapshot.ChildrenNode, com.google.firebase.database.snapshot.Node
        public final Node y() {
            return this;
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class HashVersion {
        private static final /* synthetic */ HashVersion[] $VALUES;
        public static final HashVersion V1;
        public static final HashVersion V2;

        static {
            HashVersion hashVersion = new HashVersion("V1", 0);
            V1 = hashVersion;
            HashVersion hashVersion2 = new HashVersion("V2", 1);
            V2 = hashVersion2;
            $VALUES = new HashVersion[]{hashVersion, hashVersion2};
        }

        public static HashVersion valueOf(String str) {
            return (HashVersion) Enum.valueOf(HashVersion.class, str);
        }

        public static HashVersion[] values() {
            return (HashVersion[]) $VALUES.clone();
        }
    }

    Node I(Path path);

    Node S(Node node);

    boolean T0();

    int V();

    ChildKey a0(ChildKey childKey);

    boolean c1(ChildKey childKey);

    Object getValue();

    Node h1(ChildKey childKey, Node node);

    String i();

    Node i0(Path path, Node node);

    boolean isEmpty();

    Object p1(boolean z11);

    String v0(HashVersion hashVersion);

    Iterator v1();

    Node x0(ChildKey childKey);

    Node y();
}
