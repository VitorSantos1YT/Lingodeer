package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class SortedIterables {
    private SortedIterables() {
    }

    public static boolean a(Comparator comparator, Collection collection) {
        Comparator comparator2;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            comparator2 = ((SortedSet) collection).comparator();
            if (comparator2 == null) {
                comparator2 = NaturalOrdering.f17113c;
            }
        } else {
            if (!(collection instanceof SortedIterable)) {
                return false;
            }
            comparator2 = ((SortedIterable) collection).comparator();
        }
        return comparator.equals(comparator2);
    }
}
