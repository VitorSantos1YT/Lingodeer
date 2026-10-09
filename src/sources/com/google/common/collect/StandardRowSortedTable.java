package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements RowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class RowSortedMap extends StandardTable<R, C, V>.RowMap implements SortedMap<R, Map<C, V>> {
        public RowSortedMap() {
            super();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return ((SortedMap) StandardRowSortedTable.this.f17208c).comparator();
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return ((SortedMap) StandardRowSortedTable.this.f17208c).firstKey();
        }

        @Override // java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            obj.getClass();
            StandardRowSortedTable standardRowSortedTable = StandardRowSortedTable.this;
            return new StandardRowSortedTable(((SortedMap) standardRowSortedTable.f17208c).headMap(obj), standardRowSortedTable.f17209d).f();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return ((SortedMap) StandardRowSortedTable.this.f17208c).lastKey();
        }

        @Override // java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            obj.getClass();
            obj2.getClass();
            StandardRowSortedTable standardRowSortedTable = StandardRowSortedTable.this;
            return new StandardRowSortedTable(((SortedMap) standardRowSortedTable.f17208c).subMap(obj, obj2), standardRowSortedTable.f17209d).f();
        }

        @Override // java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            obj.getClass();
            StandardRowSortedTable standardRowSortedTable = StandardRowSortedTable.this;
            return new StandardRowSortedTable(((SortedMap) standardRowSortedTable.f17208c).tailMap(obj), standardRowSortedTable.f17209d).f();
        }
    }

    @Override // com.google.common.collect.StandardTable
    public final Map p() {
        return new RowSortedMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedMap f() {
        return (SortedMap) super.f();
    }
}
