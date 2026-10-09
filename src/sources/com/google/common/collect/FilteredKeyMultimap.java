package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class FilteredKeyMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AddRejectingList<K, V> extends ForwardingList<V> {
        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(Object obj) {
            add(0, obj);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            addAll(0, collection);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final Object o0() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection
        public final Collection o0() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.common.collect.ForwardingList
        public final List w0() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public final void add(int i11, Object obj) {
            Preconditions.l(i11, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: null");
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public final boolean addAll(int i11, Collection collection) {
            collection.getClass();
            Preconditions.l(i11, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: null");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AddRejectingSet<K, V> extends ForwardingSet<V> {
        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(Object obj) {
            throw new IllegalArgumentException("Key does not satisfy predicate: null");
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            collection.getClass();
            throw new IllegalArgumentException("Key does not satisfy predicate: null");
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final Object o0() {
            return Collections.EMPTY_SET;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final Collection o0() {
            return Collections.EMPTY_SET;
        }

        @Override // com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: w0 */
        public final Set o0() {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Entries extends ForwardingCollection<Map.Entry<K, V>> {
        public Entries() {
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final /* bridge */ /* synthetic */ Object o0() {
            o0();
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection
        public final Collection o0() {
            FilteredKeyMultimap.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            FilteredKeyMultimap.this.getClass();
            ((Map.Entry) obj).getKey();
            throw null;
        }
    }

    @Override // com.google.common.collect.FilteredMultimap
    public final Predicate H() {
        Predicates.d(null, Maps.EntryFunction.KEY);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Map a() {
        throw null;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection b(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection c() {
        return new Entries();
    }

    @Override // com.google.common.collect.Multimap
    public final void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Set d() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset f() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection g() {
        return new FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection get(Object obj) {
        throw null;
    }

    public Multimap h() {
        return null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Iterator i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        Iterator<V> it = Y().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((Collection) it.next()).size();
        }
        return size;
    }
}
