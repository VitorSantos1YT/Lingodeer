package com.google.firebase.database.core.utilities;

import com.google.firebase.database.collection.ArraySortedMap;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.StandardComparator;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.snapshot.ChildKey;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ImmutableTree<T> implements Iterable<Map.Entry<Path, T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArraySortedMap f19415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableTree f19416d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableSortedMap f19418b;

    /* JADX INFO: renamed from: com.google.firebase.database.core.utilities.ImmutableTree$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements TreeVisitor<Object, Void> {
        @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
        public final Object a(Path path, Object obj, Object obj2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface TreeVisitor<T, R> {
        Object a(Path path, Object obj, Object obj2);
    }

    static {
        ArraySortedMap arraySortedMap = new ArraySortedMap(StandardComparator.f19052a);
        f19415c = arraySortedMap;
        f19416d = new ImmutableTree(null, arraySortedMap);
    }

    public ImmutableTree(Object obj, ImmutableSortedMap immutableSortedMap) {
        this.f19417a = obj;
        this.f19418b = immutableSortedMap;
    }

    public final Path b(Path path, Predicate predicate) {
        Path pathB;
        Object obj = this.f19417a;
        if (obj != null && predicate.a(obj)) {
            return Path.f19210d;
        }
        if (path.isEmpty()) {
            return null;
        }
        ChildKey childKeyK = path.k();
        ImmutableTree immutableTree = (ImmutableTree) this.f19418b.d(childKeyK);
        if (immutableTree == null || (pathB = immutableTree.b(path.n(), predicate)) == null) {
            return null;
        }
        return new Path(childKeyK).e(pathB);
    }

    public final Object d(Path path, TreeVisitor treeVisitor, Object obj) {
        for (Map.Entry entry : this.f19418b) {
            obj = ((ImmutableTree) entry.getValue()).d(path.f((ChildKey) entry.getKey()), treeVisitor, obj);
        }
        Object obj2 = this.f19417a;
        return obj2 != null ? treeVisitor.a(path, obj2, obj) : obj;
    }

    public final Object e(Path path) {
        if (path.isEmpty()) {
            return this.f19417a;
        }
        ImmutableTree immutableTree = (ImmutableTree) this.f19418b.d(path.k());
        if (immutableTree != null) {
            return immutableTree.e(path.n());
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ImmutableTree.class != obj.getClass()) {
            return false;
        }
        ImmutableTree immutableTree = (ImmutableTree) obj;
        Object obj2 = immutableTree.f19417a;
        ImmutableSortedMap immutableSortedMap = immutableTree.f19418b;
        ImmutableSortedMap immutableSortedMap2 = this.f19418b;
        if (immutableSortedMap2 == null ? immutableSortedMap != null : !immutableSortedMap2.equals(immutableSortedMap)) {
            return false;
        }
        Object obj3 = this.f19417a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final ImmutableTree f(ChildKey childKey) {
        ImmutableTree immutableTree = (ImmutableTree) this.f19418b.d(childKey);
        return immutableTree != null ? immutableTree : f19416d;
    }

    public final ImmutableTree g(Path path) {
        boolean zIsEmpty = path.isEmpty();
        ImmutableSortedMap immutableSortedMap = this.f19418b;
        if (!zIsEmpty) {
            ChildKey childKeyK = path.k();
            ImmutableTree immutableTree = (ImmutableTree) immutableSortedMap.d(childKeyK);
            if (immutableTree == null) {
                return this;
            }
            ImmutableTree immutableTreeG = immutableTree.g(path.n());
            ImmutableSortedMap immutableSortedMapL = immutableTreeG.isEmpty() ? immutableSortedMap.l(childKeyK) : immutableSortedMap.k(immutableTreeG, childKeyK);
            Object obj = this.f19417a;
            if (obj != null || !immutableSortedMapL.isEmpty()) {
                return new ImmutableTree(obj, immutableSortedMapL);
            }
        } else if (!immutableSortedMap.isEmpty()) {
            return new ImmutableTree(null, immutableSortedMap);
        }
        return f19416d;
    }

    public final ImmutableTree h(Path path, Object obj) {
        boolean zIsEmpty = path.isEmpty();
        ImmutableSortedMap immutableSortedMap = this.f19418b;
        if (zIsEmpty) {
            return new ImmutableTree(obj, immutableSortedMap);
        }
        ChildKey childKeyK = path.k();
        ImmutableTree immutableTree = (ImmutableTree) immutableSortedMap.d(childKeyK);
        if (immutableTree == null) {
            immutableTree = f19416d;
        }
        return new ImmutableTree(this.f19417a, immutableSortedMap.k(immutableTree.h(path.n(), obj), childKeyK));
    }

    public final int hashCode() {
        Object obj = this.f19417a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        ImmutableSortedMap immutableSortedMap = this.f19418b;
        return iHashCode + (immutableSortedMap != null ? immutableSortedMap.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.f19417a == null && this.f19418b.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        final ArrayList arrayList = new ArrayList();
        d(Path.f19210d, new TreeVisitor<Object, Void>() { // from class: com.google.firebase.database.core.utilities.ImmutableTree.2
            @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
            public final Object a(Path path, Object obj, Object obj2) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(path, obj));
                return null;
            }
        }, null);
        return arrayList.iterator();
    }

    public final ImmutableTree j(Path path, ImmutableTree immutableTree) {
        if (path.isEmpty()) {
            return immutableTree;
        }
        ChildKey childKeyK = path.k();
        ImmutableSortedMap immutableSortedMap = this.f19418b;
        ImmutableTree immutableTree2 = (ImmutableTree) immutableSortedMap.d(childKeyK);
        if (immutableTree2 == null) {
            immutableTree2 = f19416d;
        }
        ImmutableTree immutableTreeJ = immutableTree2.j(path.n(), immutableTree);
        return new ImmutableTree(this.f19417a, immutableTreeJ.isEmpty() ? immutableSortedMap.l(childKeyK) : immutableSortedMap.k(immutableTreeJ, childKeyK));
    }

    public final ImmutableTree k(Path path) {
        if (path.isEmpty()) {
            return this;
        }
        ImmutableTree immutableTree = (ImmutableTree) this.f19418b.d(path.k());
        return immutableTree != null ? immutableTree.k(path.n()) : f19416d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableTree { value=");
        sb2.append(this.f19417a);
        sb2.append(", children={");
        for (Map.Entry entry : this.f19418b) {
            sb2.append(((ChildKey) entry.getKey()).f19513a);
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        sb2.append("} }");
        return sb2.toString();
    }

    public ImmutableTree(Object obj) {
        this(obj, f19415c);
    }
}
