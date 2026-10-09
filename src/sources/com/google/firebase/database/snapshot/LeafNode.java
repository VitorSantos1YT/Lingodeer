package com.google.firebase.database.snapshot;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.LeafNode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LeafNode<T extends LeafNode> implements Node {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Node f19543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19544b;

    /* JADX INFO: renamed from: com.google.firebase.database.snapshot.LeafNode$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19545a;

        static {
            int[] iArr = new int[Node.HashVersion.values().length];
            f19545a = iArr;
            try {
                iArr[Node.HashVersion.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19545a[Node.HashVersion.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LeafType {
        private static final /* synthetic */ LeafType[] $VALUES;
        public static final LeafType Boolean;
        public static final LeafType DeferredValue;
        public static final LeafType Number;
        public static final LeafType String;

        public static LeafType valueOf(String str) {
            return (LeafType) Enum.valueOf(LeafType.class, str);
        }

        public static LeafType[] values() {
            return (LeafType[]) $VALUES.clone();
        }

        static {
            LeafType leafType = new LeafType("DeferredValue", 0);
            DeferredValue = leafType;
            LeafType leafType2 = new LeafType("Boolean", 1);
            Boolean = leafType2;
            LeafType leafType3 = new LeafType("Number", 2);
            Number = leafType3;
            LeafType leafType4 = new LeafType(scqhIrGXy.yoeNQhinlsngTJ, 3);
            String = leafType4;
            $VALUES = new LeafType[]{leafType, leafType2, leafType3, leafType4};
        }
    }

    public LeafNode(Node node) {
        this.f19543a = node;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Node I(Path path) {
        if (path.isEmpty()) {
            return this;
        }
        return path.k().equals(ChildKey.f19512d) ? this.f19543a : EmptyNode.f19537e;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final boolean T0() {
        return true;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final int V() {
        return 0;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final ChildKey a0(ChildKey childKey) {
        return null;
    }

    public abstract int b(LeafNode leafNode);

    @Override // com.google.firebase.database.snapshot.Node
    public final boolean c1(ChildKey childKey) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Node node) {
        Node node2 = node;
        if (node2.isEmpty()) {
            return 1;
        }
        if (node2 instanceof ChildrenNode) {
            return -1;
        }
        char[] cArr = Utilities.f19432a;
        if ((this instanceof LongNode) && (node2 instanceof DoubleNode)) {
            return Double.valueOf(((LongNode) this).f19546c).compareTo(((DoubleNode) node2).f19536c);
        }
        if ((this instanceof DoubleNode) && (node2 instanceof LongNode)) {
            return Double.valueOf(((LongNode) node2).f19546c).compareTo(((DoubleNode) this).f19536c) * (-1);
        }
        LeafNode leafNode = (LeafNode) node2;
        LeafType leafTypeE = e();
        LeafType leafTypeE2 = leafNode.e();
        return leafTypeE.equals(leafTypeE2) ? b(leafNode) : leafTypeE.compareTo(leafTypeE2);
    }

    public abstract LeafType e();

    @Override // com.google.firebase.database.snapshot.Node
    public final Node h1(ChildKey childKey, Node node) {
        if (childKey.equals(ChildKey.f19512d)) {
            return S(node);
        }
        return node.isEmpty() ? this : EmptyNode.f19537e.h1(childKey, node).S(this.f19543a);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final String i() {
        if (this.f19544b == null) {
            this.f19544b = Utilities.c(v0(Node.HashVersion.V1));
        }
        return this.f19544b;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Node i0(Path path, Node node) {
        ChildKey childKeyK = path.k();
        if (childKeyK == null) {
            return node;
        }
        boolean zIsEmpty = node.isEmpty();
        ChildKey childKey = ChildKey.f19512d;
        if (zIsEmpty && !childKeyK.equals(childKey)) {
            return this;
        }
        if (path.k().equals(childKey)) {
            path.size();
        }
        char[] cArr = Utilities.f19432a;
        return h1(childKeyK, EmptyNode.f19537e.i0(path.n(), node));
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<NamedNode> iterator() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Object p1(boolean z11) {
        if (z11) {
            Node node = this.f19543a;
            if (!node.isEmpty()) {
                HashMap map = new HashMap();
                map.put(".value", getValue());
                map.put(".priority", node.getValue());
                return map;
            }
        }
        return getValue();
    }

    public final String toString() {
        String string = p1(true).toString();
        if (string.length() <= 100) {
            return string;
        }
        return string.substring(0, 100) + "...";
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Iterator v1() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Node x0(ChildKey childKey) {
        return childKey.equals(ChildKey.f19512d) ? this.f19543a : EmptyNode.f19537e;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public final Node y() {
        return this.f19543a;
    }

    public final String f(Node.HashVersion hashVersion) {
        int i11 = AnonymousClass1.f19545a[hashVersion.ordinal()];
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Unknown hash version: " + hashVersion);
        }
        Node node = this.f19543a;
        if (node.isEmpty()) {
            return ealNNtLp.vOaxjizzOucxXx;
        }
        return "priority:" + node.v0(hashVersion) + ":";
    }
}
