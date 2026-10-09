package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class FilteredEntryMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1KeySetImpl, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class C1KeySetImpl extends Maps.KeySet<Object, Collection<Object>> {
            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                throw null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection collection) {
                Predicates.d(Predicates.f(collection), Maps.EntryFunction.KEY);
                throw null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                Predicates.d(Predicates.h(Predicates.f(collection)), Maps.EntryFunction.KEY);
                throw null;
            }
        }

        public AsMap() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new Maps.EntrySet<Object, Collection<Object>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl

                /* JADX INFO: renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1EntrySetImpl$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
                class AnonymousClass1 extends AbstractIterator<Map.Entry<Object, Collection<Object>>> {
                    @Override // com.google.common.collect.AbstractIterator
                    public final Object a() {
                        throw null;
                    }
                }

                @Override // com.google.common.collect.Maps.EntrySet
                public final Map f() {
                    return AsMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    new AnonymousClass1();
                    throw null;
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
                    Predicates.f(collection);
                    throw null;
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
                    Predicates.f(collection);
                    throw null;
                }

                @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    iterator();
                    throw null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new C1KeySetImpl(this);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new Maps.Values<Object, Collection<Object>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1ValuesImpl
                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public final boolean remove(Object obj) {
                    if (!(obj instanceof Collection)) {
                        return false;
                    }
                    FilteredEntryMultimap.this.getClass();
                    throw null;
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public final boolean removeAll(Collection collection) {
                    Predicates.d(Predicates.f(collection), Maps.EntryFunction.VALUE);
                    throw null;
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public final boolean retainAll(Collection collection) {
                    Predicates.d(Predicates.h(Predicates.f(collection)), Maps.EntryFunction.VALUE);
                    throw null;
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            FilteredEntryMultimap.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Keys extends Multimaps.Keys<K, V> {
        public Keys() {
            super(FilteredEntryMultimap.this);
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final Set entrySet() {
            return new Multisets.EntrySet<Object>() { // from class: com.google.common.collect.FilteredEntryMultimap.Keys.1
                @Override // com.google.common.collect.Multisets.EntrySet
                public final Multiset f() {
                    return Keys.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return Keys.this.g();
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
                    Predicates.f(collection);
                    throw null;
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
                    Predicates.f(collection);
                    throw null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return FilteredEntryMultimap.this.keySet().size();
                }
            };
        }

        @Override // com.google.common.collect.Multimaps.Keys, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final int u0(int i11, Object obj) {
            CollectPreconditions.b(i11, "occurrences");
            if (i11 == 0) {
                return q0(obj);
            }
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ValuePredicate implements Predicate<V> {
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }
    }

    @Override // com.google.common.collect.FilteredMultimap
    public final Predicate H() {
        return null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Map a() {
        return new AsMap();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection b(Object obj) {
        return (Collection) MoreObjects.a((Collection) Y().remove(obj), Collections.EMPTY_LIST);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection c() {
        throw null;
    }

    @Override // com.google.common.collect.Multimap
    public final void clear() {
        e().clear();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return Y().get(obj) != null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Set d() {
        return Y().keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset f() {
        return new Keys();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection g() {
        return new FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection get(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.FilteredMultimap
    public Multimap h() {
        return null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Iterator i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        return e().size();
    }
}
