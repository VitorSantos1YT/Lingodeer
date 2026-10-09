package com.google.firebase.database.collection;

import java.lang.Comparable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class StandardComparator<A extends Comparable<A>> implements Comparator<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StandardComparator f19052a = new StandardComparator();

    private StandardComparator() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }
}
