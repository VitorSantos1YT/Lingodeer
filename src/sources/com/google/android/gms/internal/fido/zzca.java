package com.google.android.gms.internal.fido;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzca {
    public static boolean a(Comparator comparator, Collection collection) {
        Comparator comparator2;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            comparator2 = ((SortedSet) collection).comparator();
            if (comparator2 == null) {
                comparator2 = zzbp.f9664a;
            }
        } else {
            if (!(collection instanceof zzbz)) {
                return false;
            }
            comparator2 = ((zzbz) collection).comparator();
        }
        return comparator.equals(comparator2);
    }
}
