package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class FilteredMultimapValues<K, V> extends AbstractCollection<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractMultimap f16727a;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredMultimapValues(FilteredMultimap filteredMultimap) {
        this.f16727a = (AbstractMultimap) filteredMultimap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f16727a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16727a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Maps.AnonymousClass2(this.f16727a.e().iterator());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.AbstractMultimap, com.google.common.collect.FilteredMultimap] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        ?? r9 = this.f16727a;
        Predicate predicateH = r9.H();
        Iterator it = r9.h().e().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (predicateH.apply(entry) && Objects.a(entry.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.AbstractMultimap, com.google.common.collect.FilteredMultimap] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        ?? r9 = this.f16727a;
        return Iterables.f(r9.h().e(), Predicates.c(r9.H(), Predicates.d(Predicates.f(collection), Maps.EntryFunction.VALUE)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.AbstractMultimap, com.google.common.collect.FilteredMultimap] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ?? r9 = this.f16727a;
        return Iterables.f(r9.h().e(), Predicates.c(r9.H(), Predicates.d(Predicates.h(Predicates.f(collection)), Maps.EntryFunction.VALUE)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f16727a.size();
    }
}
