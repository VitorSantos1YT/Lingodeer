package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractSortedMultiset<E> extends AbstractMultiset<E> implements SortedMultiset<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Comparator f16616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient SortedMultiset f16617d;

    public AbstractSortedMultiset(Comparator comparator) {
        comparator.getClass();
        this.f16616c = comparator;
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset G() {
        SortedMultiset sortedMultiset = this.f16617d;
        if (sortedMultiset != null) {
            return sortedMultiset;
        }
        DescendingMultiset<Object> descendingMultiset = new DescendingMultiset<Object>() { // from class: com.google.common.collect.AbstractSortedMultiset.1DescendingMultisetImpl
            @Override // com.google.common.collect.DescendingMultiset
            public final SortedMultiset C0() {
                return AbstractSortedMultiset.this;
            }

            @Override // com.google.common.collect.DescendingMultiset, com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return Multisets.b(AbstractSortedMultiset.this.G());
            }

            @Override // com.google.common.collect.DescendingMultiset
            public final Iterator z0() {
                return AbstractSortedMultiset.this.h();
            }
        };
        this.f16617d = descendingMultiset;
        return descendingMultiset;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Set b() {
        return new SortedMultisets.NavigableElementSet(this);
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator comparator() {
        return this.f16616c;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry firstEntry() {
        Iterator itG = g();
        if (itG.hasNext()) {
            return (Multiset.Entry) itG.next();
        }
        return null;
    }

    public abstract Iterator h();

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry lastEntry() {
        TreeMultiset.AnonymousClass3 anonymousClass3 = (TreeMultiset.AnonymousClass3) h();
        if (anonymousClass3.hasNext()) {
            return anonymousClass3.next();
        }
        return null;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry pollFirstEntry() {
        Iterator itG = g();
        if (!itG.hasNext()) {
            return null;
        }
        Multiset.Entry entry = (Multiset.Entry) itG.next();
        Multisets.ImmutableEntry immutableEntry = new Multisets.ImmutableEntry(entry.a(), entry.getCount());
        itG.remove();
        return immutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry pollLastEntry() {
        TreeMultiset.AnonymousClass3 anonymousClass3 = (TreeMultiset.AnonymousClass3) h();
        if (!anonymousClass3.hasNext()) {
            return null;
        }
        Multiset.Entry<Object> next = anonymousClass3.next();
        Multisets.ImmutableEntry immutableEntry = new Multisets.ImmutableEntry(next.a(), next.getCount());
        anonymousClass3.remove();
        return immutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset t1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        boundType.getClass();
        boundType2.getClass();
        return ((TreeMultiset) ((TreeMultiset) this).E0(obj, boundType)).k0(obj2, boundType2);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public NavigableSet c() {
        return (NavigableSet) super.c();
    }

    public AbstractSortedMultiset() {
        this(NaturalOrdering.f17113c);
    }
}
