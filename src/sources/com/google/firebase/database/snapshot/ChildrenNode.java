package com.google.firebase.database.snapshot;

import com.google.firebase.database.collection.ArraySortedMap;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.LLRBNode;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Utilities;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ChildrenNode implements Node {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator f19515d = new Comparator<ChildKey>() { // from class: com.google.firebase.database.snapshot.ChildrenNode.1
        @Override // java.util.Comparator
        public final int compare(ChildKey childKey, ChildKey childKey2) {
            return childKey.compareTo(childKey2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableSortedMap f19516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Node f19517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19518c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ChildVisitor extends LLRBNode.NodeVisitor<ChildKey, Node> {
        @Override // com.google.firebase.database.collection.LLRBNode.NodeVisitor
        public final void a(Object obj, Object obj2) {
            b((ChildKey) obj, (Node) obj2);
        }

        public abstract void b(ChildKey childKey, Node node);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class NamedNodeIterator implements Iterator<NamedNode> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f19522a;

        public NamedNodeIterator(Iterator it) {
            this.f19522a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19522a.hasNext();
        }

        @Override // java.util.Iterator
        public final NamedNode next() {
            Map.Entry entry = (Map.Entry) this.f19522a.next();
            return new NamedNode((ChildKey) entry.getKey(), (Node) entry.getValue());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f19522a.remove();
        }
    }

    public ChildrenNode() {
        this.f19518c = null;
        this.f19516a = new ArraySortedMap(f19515d);
        this.f19517b = EmptyNode.f19537e;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node I(Path path) {
        ChildKey childKeyK = path.k();
        return childKeyK == null ? this : x0(childKeyK).I(path.n());
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node S(Node node) {
        ImmutableSortedMap immutableSortedMap = this.f19516a;
        return immutableSortedMap.isEmpty() ? EmptyNode.f19537e : new ChildrenNode(immutableSortedMap, node);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public boolean T0() {
        return false;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public int V() {
        return this.f19516a.size();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public ChildKey a0(ChildKey childKey) {
        return (ChildKey) this.f19516a.h(childKey);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Node node) {
        if (isEmpty()) {
            return node.isEmpty() ? 0 : -1;
        }
        if (node.T0() || node.isEmpty()) {
            return 1;
        }
        return node == Node.f19551s ? -1 : 0;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public boolean c1(ChildKey childKey) {
        return !x0(childKey).isEmpty();
    }

    public final void e(final ChildVisitor childVisitor, boolean z11) {
        ImmutableSortedMap immutableSortedMap = this.f19516a;
        if (!z11 || y().isEmpty()) {
            immutableSortedMap.j(childVisitor);
        } else {
            immutableSortedMap.j(new LLRBNode.NodeVisitor<ChildKey, Node>() { // from class: com.google.firebase.database.snapshot.ChildrenNode.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public boolean f19519a = false;

                @Override // com.google.firebase.database.collection.LLRBNode.NodeVisitor
                public final void a(Object obj, Object obj2) {
                    ChildKey childKey = (ChildKey) obj;
                    Node node = (Node) obj2;
                    boolean z12 = this.f19519a;
                    ChildVisitor childVisitor2 = childVisitor;
                    if (!z12) {
                        ChildKey childKey2 = ChildKey.f19512d;
                        if (childKey.compareTo(childKey2) > 0) {
                            this.f19519a = true;
                            childVisitor2.b(childKey2, ChildrenNode.this.y());
                        }
                    }
                    childVisitor2.b(childKey, node);
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChildrenNode)) {
            return false;
        }
        ChildrenNode childrenNode = (ChildrenNode) obj;
        ImmutableSortedMap immutableSortedMap = childrenNode.f19516a;
        if (!y().equals(childrenNode.y())) {
            return false;
        }
        ImmutableSortedMap immutableSortedMap2 = this.f19516a;
        if (immutableSortedMap2.size() != immutableSortedMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = immutableSortedMap2.iterator();
        Iterator<Map.Entry<K, V>> it2 = immutableSortedMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (!((ChildKey) entry.getKey()).equals(entry2.getKey()) || !((Node) entry.getValue()).equals(entry2.getValue())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            throw new IllegalStateException("Something went wrong internally.");
        }
        return true;
    }

    public final void f(int i11, StringBuilder sb2) {
        int i12;
        ImmutableSortedMap immutableSortedMap = this.f19516a;
        boolean zIsEmpty = immutableSortedMap.isEmpty();
        Node node = this.f19517b;
        if (zIsEmpty && node.isEmpty()) {
            sb2.append("{ }");
            return;
        }
        sb2.append("{\n");
        Iterator<Map.Entry<K, V>> it = immutableSortedMap.iterator();
        while (true) {
            i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i13 = i11 + 2;
            while (i12 < i13) {
                sb2.append(" ");
                i12++;
            }
            sb2.append(((ChildKey) entry.getKey()).f19513a);
            sb2.append("=");
            if (entry.getValue() instanceof ChildrenNode) {
                ((ChildrenNode) entry.getValue()).f(i13, sb2);
            } else {
                sb2.append(((Node) entry.getValue()).toString());
            }
            sb2.append("\n");
        }
        if (!node.isEmpty()) {
            int i14 = i11 + 2;
            for (int i15 = 0; i15 < i14; i15++) {
                sb2.append(" ");
            }
            sb2.append(".priority=");
            sb2.append(node.toString());
            sb2.append("\n");
        }
        while (i12 < i11) {
            sb2.append(" ");
            i12++;
        }
        sb2.append("}");
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object getValue() {
        return p1(false);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node h1(ChildKey childKey, Node node) {
        if (childKey.equals(ChildKey.f19512d)) {
            return S(node);
        }
        ImmutableSortedMap immutableSortedMapK = this.f19516a;
        if (immutableSortedMapK.b(childKey)) {
            immutableSortedMapK = immutableSortedMapK.l(childKey);
        }
        if (!node.isEmpty()) {
            immutableSortedMapK = immutableSortedMapK.k(node, childKey);
        }
        return immutableSortedMapK.isEmpty() ? EmptyNode.f19537e : new ChildrenNode(immutableSortedMapK, this.f19517b);
    }

    public int hashCode() {
        int iD = 0;
        for (NamedNode namedNode : this) {
            iD = e.d(iD * 31, 17, namedNode.f19549a.f19513a) + namedNode.f19550b.hashCode();
        }
        return iD;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String i() {
        if (this.f19518c == null) {
            String strV0 = v0(Node.HashVersion.V1);
            this.f19518c = strV0.isEmpty() ? BuildConfig.VERSION_NAME : Utilities.c(strV0);
        }
        return this.f19518c;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node i0(Path path, Node node) {
        ChildKey childKeyK = path.k();
        if (childKeyK == null) {
            return node;
        }
        if (!childKeyK.equals(ChildKey.f19512d)) {
            return h1(childKeyK, x0(childKeyK).i0(path.n(), node));
        }
        PriorityUtilities.a(node);
        char[] cArr = Utilities.f19432a;
        return S(node);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public boolean isEmpty() {
        return this.f19516a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<NamedNode> iterator() {
        return new NamedNodeIterator(this.f19516a.iterator());
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object p1(boolean z11) {
        Integer numE;
        if (isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        boolean z12 = true;
        int i11 = 0;
        int iIntValue = 0;
        for (Map.Entry entry : this.f19516a) {
            String str = ((ChildKey) entry.getKey()).f19513a;
            map.put(str, ((Node) entry.getValue()).p1(z11));
            i11++;
            if (z12) {
                if ((str.length() > 1 && str.charAt(0) == '0') || (numE = Utilities.e(str)) == null || numE.intValue() < 0) {
                    z12 = false;
                } else if (numE.intValue() > iIntValue) {
                    iIntValue = numE.intValue();
                }
            }
        }
        if (z11 || !z12 || iIntValue >= i11 * 2) {
            if (z11) {
                Node node = this.f19517b;
                if (!node.isEmpty()) {
                    map.put(".priority", node.getValue());
                }
            }
            return map;
        }
        ArrayList arrayList = new ArrayList(iIntValue + 1);
        for (int i12 = 0; i12 <= iIntValue; i12++) {
            arrayList.add(map.get(BuildConfig.VERSION_NAME + i12));
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        f(0, sb2);
        return sb2.toString();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String v0(Node.HashVersion hashVersion) {
        boolean z11;
        Node.HashVersion hashVersion2 = Node.HashVersion.V1;
        if (hashVersion != hashVersion2) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb2 = new StringBuilder();
        Node node = this.f19517b;
        if (!node.isEmpty()) {
            sb2.append("priority:");
            sb2.append(node.v0(hashVersion2));
            sb2.append(":");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<NamedNode> it = iterator();
        int i11 = 0;
        loop0: while (true) {
            z11 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                NamedNode next = it.next();
                arrayList.add(next);
                if (z11 || !next.f19550b.y().isEmpty()) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Collections.sort(arrayList, PriorityIndex.f19553a);
        }
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            NamedNode namedNode = (NamedNode) obj;
            String strI = namedNode.f19550b.i();
            if (!strI.equals(BuildConfig.VERSION_NAME)) {
                sb2.append(":");
                e.C(sb2, namedNode.f19549a.f19513a, ":", strI);
            }
        }
        return sb2.toString();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Iterator v1() {
        return new NamedNodeIterator(this.f19516a.v1());
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node x0(ChildKey childKey) {
        if (childKey.equals(ChildKey.f19512d)) {
            Node node = this.f19517b;
            if (!node.isEmpty()) {
                return node;
            }
        }
        ImmutableSortedMap immutableSortedMap = this.f19516a;
        return immutableSortedMap.b(childKey) ? (Node) immutableSortedMap.d(childKey) : EmptyNode.f19537e;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node y() {
        return this.f19517b;
    }

    public ChildrenNode(ImmutableSortedMap immutableSortedMap, Node node) {
        this.f19518c = null;
        if (immutableSortedMap.isEmpty() && !node.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f19517b = node;
        this.f19516a = immutableSortedMap;
    }
}
