package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.collect.TreeBasedTable$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends AbstractIterator<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f17266c;

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Factory<C, V> implements Supplier<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new TreeMap((Comparator) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class TreeRow extends StandardTable<R, C, V>.Row implements SortedMap<C, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f17267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f17268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public transient SortedMap f17269f;

        public TreeRow(Object obj, Object obj2, Object obj3) {
            super(obj);
            this.f17267d = obj2;
            this.f17268e = obj3;
            if (obj2 == null || obj3 == null) {
                return;
            }
            comparator();
            throw null;
        }

        @Override // com.google.common.collect.StandardTable.Row
        public final Map b() {
            f();
            SortedMap sortedMapTailMap = this.f17269f;
            if (sortedMapTailMap == null) {
                return null;
            }
            Object obj = this.f17267d;
            if (obj != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(obj);
            }
            Object obj2 = this.f17268e;
            return obj2 != null ? sortedMapTailMap.headMap(obj2) : sortedMapTailMap;
        }

        @Override // com.google.common.collect.StandardTable.Row
        public final void c() {
            f();
            SortedMap sortedMap = this.f17269f;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            TreeBasedTable.this.f17208c.remove(this.f17231a);
            this.f17269f = null;
            this.f17232b = null;
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            TreeBasedTable.this.getClass();
            return null;
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return e(obj) && super.containsKey(obj);
        }

        public final boolean e(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.f17267d != null) {
                comparator();
                throw null;
            }
            if (this.f17268e == null) {
                return true;
            }
            comparator();
            throw null;
        }

        public final void f() {
            SortedMap sortedMap = this.f17269f;
            Object obj = this.f17231a;
            TreeBasedTable treeBasedTable = TreeBasedTable.this;
            if (sortedMap == null || (sortedMap.isEmpty() && treeBasedTable.f17208c.containsKey(obj))) {
                this.f17269f = (SortedMap) treeBasedTable.f17208c.get(obj);
            }
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            d();
            Map map = this.f17232b;
            if (map != null) {
                return ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            obj.getClass();
            Preconditions.g(e(obj));
            return new TreeRow(this.f17231a, this.f17267d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Set keySet() {
            return new Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            d();
            Map map = this.f17232b;
            if (map != null) {
                return ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            obj.getClass();
            Preconditions.g(e(obj));
            return super.put(obj, obj2);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            boolean z11;
            obj.getClass();
            if (e(obj)) {
                obj2.getClass();
                if (e(obj2)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            Preconditions.g(z11);
            return new TreeRow(this.f17231a, obj, obj2);
        }

        @Override // java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            obj.getClass();
            Preconditions.g(e(obj));
            return new TreeRow(this.f17231a, obj, this.f17268e);
        }
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    public final Map f() {
        return super.f();
    }

    @Override // com.google.common.collect.StandardTable
    public final Map j(Object obj) {
        return new StandardTable.Column(obj);
    }

    @Override // com.google.common.collect.StandardTable
    public final Iterator o() {
        Iterables.h(this.f17208c.values(), new e(3));
        Preconditions.k(null, "comparator");
        throw null;
    }

    @Override // com.google.common.collect.StandardTable
    public final Map t(Object obj) {
        return new TreeRow(obj, null, null);
    }
}
