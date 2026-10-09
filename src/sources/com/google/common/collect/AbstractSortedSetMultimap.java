package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final Collection n() {
        SortedSet sortedSetJ = j();
        return sortedSetJ instanceof NavigableSet ? Sets.i((NavigableSet) sortedSetJ) : Collections.unmodifiableSortedSet(sortedSetJ);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final Collection p(Collection collection) {
        return collection instanceof NavigableSet ? Sets.i((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final Collection r(Object obj, Collection collection) {
        return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, null) : new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, null);
    }

    @Override // com.google.common.collect.AbstractSetMultimap
    /* JADX INFO: renamed from: t */
    public final Set n() {
        SortedSet sortedSetJ = j();
        return sortedSetJ instanceof NavigableSet ? Sets.i((NavigableSet) sortedSetJ) : Collections.unmodifiableSortedSet(sortedSetJ);
    }

    @Override // com.google.common.collect.AbstractSetMultimap
    /* JADX INFO: renamed from: u */
    public abstract SortedSet j();

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public SortedSet b(Object obj) {
        return (SortedSet) super.b(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public SortedSet get(Object obj) {
        return (SortedSet) super.get(obj);
    }
}
