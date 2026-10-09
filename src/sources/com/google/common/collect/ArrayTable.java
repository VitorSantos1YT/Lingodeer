package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class ArrayTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends AbstractIndexedListIterator<Table.Cell<Object, Object, Object>> {
        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final Object a(int i11) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends Tables.AbstractCell<Object, Object, Object> {
        @Override // com.google.common.collect.Table.Cell
        public final Object a() {
            throw null;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object b() {
            throw null;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object getValue() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 extends AbstractIndexedListIterator<Object> {
        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final Object a(int i11) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ArrayMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$ArrayMap$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends AbstractMapEntry<Object, Object> {
            @Override // java.util.Map.Entry
            public final Object getKey() {
                throw null;
            }

            @Override // java.util.Map.Entry
            public final Object getValue() {
                throw null;
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public final Object setValue(Object obj) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$ArrayMap$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 extends AbstractIndexedListIterator<Map.Entry<Object, Object>> {
            @Override // com.google.common.collect.AbstractIndexedListIterator
            public final Object a(int i11) {
                throw null;
            }
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            throw null;
        }

        public final Object b(int i11) {
            throw null;
        }

        public abstract Object c(int i11);

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        public abstract Object d(Object obj);

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Column extends ArrayMap<R, V> {
        public Column(int i11) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object c(int i11) {
            ArrayTable.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object d(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ColumnMap extends ArrayMap<C, Map<R, V>> {
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object c(int i11) {
            return new Column(i11);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object d(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Row extends ArrayMap<C, V> {
        public Row(int i11) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object c(int i11) {
            ArrayTable.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object d(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class RowMap extends ArrayMap<R, Map<C, V>> {
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object c(int i11) {
            return new Row(i11);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object d(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator a() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractTable
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable
    public final boolean c(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public final Map f() {
        return null;
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator h() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        throw null;
    }
}
