package com.google.firebase.database.core;

import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.Predicate;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.Node;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CompoundWrite implements Iterable<Map.Entry<Path, Node>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CompoundWrite f19184b = new CompoundWrite(new ImmutableTree(null));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableTree f19185a;

    public CompoundWrite(ImmutableTree immutableTree) {
        this.f19185a = immutableTree;
    }

    public static Node f(Path path, ImmutableTree immutableTree, Node node) {
        ChildKey childKey;
        Object obj = immutableTree.f19417a;
        if (obj != null) {
            return node.i0(path, (Node) obj);
        }
        Iterator<Map.Entry<K, V>> it = immutableTree.f19418b.iterator();
        Node node2 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            childKey = ChildKey.f19512d;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            ImmutableTree immutableTree2 = (ImmutableTree) entry.getValue();
            ChildKey childKey2 = (ChildKey) entry.getKey();
            if (childKey2.equals(childKey)) {
                Object obj2 = immutableTree2.f19417a;
                char[] cArr = Utilities.f19432a;
                node2 = (Node) obj2;
            } else {
                node = f(path.f(childKey2), immutableTree2, node);
            }
        }
        return (node.I(path).isEmpty() || node2 == null) ? node : node.i0(path.f(childKey), node2);
    }

    public static CompoundWrite h(AbstractMap abstractMap) {
        ImmutableTree immutableTreeJ = ImmutableTree.f19416d;
        for (Map.Entry entry : abstractMap.entrySet()) {
            immutableTreeJ = immutableTreeJ.j((Path) entry.getKey(), new ImmutableTree((Node) entry.getValue()));
        }
        return new CompoundWrite(immutableTreeJ);
    }

    public final CompoundWrite b(Path path, Node node) {
        if (path.isEmpty()) {
            return new CompoundWrite(new ImmutableTree(node));
        }
        ImmutableTree immutableTree = this.f19185a;
        immutableTree.getClass();
        Path pathB = immutableTree.b(path, Predicate.f19425a);
        if (pathB == null) {
            return new CompoundWrite(immutableTree.j(path, new ImmutableTree(node)));
        }
        Path pathM = Path.m(pathB, path);
        Node node2 = (Node) immutableTree.e(pathB);
        ChildKey childKeyJ = pathM.j();
        return (childKeyJ != null && childKeyJ.equals(ChildKey.f19512d) && node2.I(pathM.l()).isEmpty()) ? this : new CompoundWrite(immutableTree.h(pathB, node2.i0(pathM, node)));
    }

    public final CompoundWrite d(final Path path, CompoundWrite compoundWrite) {
        ImmutableTree immutableTree = compoundWrite.f19185a;
        ImmutableTree.TreeVisitor<Node, CompoundWrite> treeVisitor = new ImmutableTree.TreeVisitor<Node, CompoundWrite>() { // from class: com.google.firebase.database.core.CompoundWrite.1
            @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
            public final Object a(Path path2, Object obj, Object obj2) {
                return ((CompoundWrite) obj2).b(path.e(path2), (Node) obj);
            }
        };
        immutableTree.getClass();
        return (CompoundWrite) immutableTree.d(Path.f19210d, treeVisitor, this);
    }

    public final Node e(Node node) {
        return f(Path.f19210d, this.f19185a, node);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != CompoundWrite.class) {
            return false;
        }
        return ((CompoundWrite) obj).k().equals(k());
    }

    public final CompoundWrite g(Path path) {
        if (path.isEmpty()) {
            return this;
        }
        Node nodeJ = j(path);
        return nodeJ != null ? new CompoundWrite(new ImmutableTree(nodeJ)) : new CompoundWrite(this.f19185a.k(path));
    }

    public final int hashCode() {
        return k().hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<Path, Node>> iterator() {
        return this.f19185a.iterator();
    }

    public final Node j(Path path) {
        ImmutableTree immutableTree = this.f19185a;
        immutableTree.getClass();
        Path pathB = immutableTree.b(path, Predicate.f19425a);
        if (pathB != null) {
            return ((Node) immutableTree.e(pathB)).I(Path.m(pathB, path));
        }
        return null;
    }

    public final HashMap k() {
        final HashMap map = new HashMap();
        ImmutableTree.TreeVisitor<Node, Void> treeVisitor = new ImmutableTree.TreeVisitor<Node, Void>() { // from class: com.google.firebase.database.core.CompoundWrite.2
            @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
            public final Object a(Path path, Object obj, Object obj2) {
                map.put(path.o(), ((Node) obj).p1(true));
                return null;
            }
        };
        ImmutableTree immutableTree = this.f19185a;
        immutableTree.getClass();
        immutableTree.d(Path.f19210d, treeVisitor, null);
        return map;
    }

    public final String toString() {
        return "CompoundWrite{" + k().toString() + "}";
    }
}
