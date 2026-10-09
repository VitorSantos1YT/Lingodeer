package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedMultiset<E> extends ImmutableMultiset<E> implements SortedMultiset<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f16859f = 0;
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient ImmutableSortedMultiset f16860e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder<E> extends ImmutableMultiset.Builder<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Comparator f16861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object[] f16862d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f16863e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16864f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f16865g;

        public Builder(Comparator comparator) {
            this.f16819b = false;
            this.f16818a = null;
            comparator.getClass();
            this.f16861c = comparator;
            this.f16862d = new Object[4];
            this.f16863e = new int[4];
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: a */
        public final ImmutableCollection.Builder c(Object obj) {
            f(1, obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public final ImmutableMultiset.Builder c(Object obj) {
            f(1, obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public final /* bridge */ /* synthetic */ ImmutableMultiset.Builder d(int i11, Object obj) {
            f(i11, obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public final /* bridge */ /* synthetic */ ImmutableMultiset e() {
            throw null;
        }

        public final void f(int i11, Object obj) {
            obj.getClass();
            CollectPreconditions.b(i11, "occurrences");
            if (i11 == 0) {
                return;
            }
            int i12 = this.f16864f;
            Object[] objArr = this.f16862d;
            if (i12 == objArr.length) {
                g(true);
            } else if (this.f16865g) {
                this.f16862d = Arrays.copyOf(objArr, objArr.length);
            }
            this.f16865g = false;
            Object[] objArr2 = this.f16862d;
            int i13 = this.f16864f;
            objArr2[i13] = obj;
            this.f16863e[i13] = i11;
            this.f16864f = i13 + 1;
        }

        public final void g(boolean z11) {
            int i11 = this.f16864f;
            if (i11 == 0) {
                return;
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f16862d, i11);
            Comparator comparator = this.f16861c;
            Arrays.sort(objArrCopyOf, comparator);
            int i12 = 1;
            for (int i13 = 1; i13 < objArrCopyOf.length; i13++) {
                if (comparator.compare(objArrCopyOf[i12 - 1], objArrCopyOf[i13]) < 0) {
                    objArrCopyOf[i12] = objArrCopyOf[i13];
                    i12++;
                }
            }
            Arrays.fill(objArrCopyOf, i12, this.f16864f, (Object) null);
            if (z11) {
                int i14 = i12 * 4;
                int i15 = this.f16864f;
                if (i14 > i15 * 3) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Ints.e(((long) i15) + ((long) ((i15 / 2) + 1))));
                }
            }
            int[] iArr = new int[objArrCopyOf.length];
            for (int i16 = 0; i16 < this.f16864f; i16++) {
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, 0, i12, this.f16862d[i16], comparator);
                int i17 = this.f16863e[i16];
                if (i17 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i17;
                } else {
                    iArr[iBinarySearch] = ~i17;
                }
            }
            this.f16862d = objArrCopyOf;
            this.f16863e = iArr;
            this.f16864f = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SerializedForm<E> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparator f16866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f16867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f16868c;

        public SerializedForm(ImmutableSortedMultiset immutableSortedMultiset) {
            this.f16866a = immutableSortedMultiset.comparator();
            int size = immutableSortedMultiset.entrySet().size();
            this.f16867b = new Object[size];
            this.f16868c = new int[size];
            int i11 = 0;
            for (Multiset.Entry entry : immutableSortedMultiset.entrySet()) {
                this.f16867b[i11] = entry.a();
                this.f16868c[i11] = entry.getCount();
                i11++;
            }
        }

        public Object readResolve() {
            int i11;
            Object[] objArr = this.f16867b;
            int length = objArr.length;
            Builder builder = new Builder(this.f16866a);
            for (int i12 = 0; i12 < length; i12++) {
                builder.f(this.f16868c[i12], objArr[i12]);
            }
            builder.g(false);
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i11 = builder.f16864f;
                if (i13 >= i11) {
                    break;
                }
                int[] iArr = builder.f16863e;
                int i15 = iArr[i13];
                if (i15 > 0) {
                    Object[] objArr2 = builder.f16862d;
                    objArr2[i14] = objArr2[i13];
                    iArr[i14] = i15;
                    i14++;
                }
                i13++;
            }
            Arrays.fill(builder.f16862d, i14, i11, (Object) null);
            Arrays.fill(builder.f16863e, i14, builder.f16864f, 0);
            builder.f16864f = i14;
            Comparator comparator = builder.f16861c;
            if (i14 == 0) {
                int i16 = ImmutableSortedMultiset.f16859f;
                return NaturalOrdering.f17113c.equals(comparator) ? RegularImmutableSortedMultiset.N : new RegularImmutableSortedMultiset(comparator);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.u(comparator, i14, builder.f16862d);
            long[] jArr = new long[builder.f16864f + 1];
            int i17 = 0;
            while (i17 < builder.f16864f) {
                int i18 = i17 + 1;
                jArr[i18] = jArr[i17] + ((long) builder.f16863e[i17]);
                i17 = i18;
            }
            builder.f16865g = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, builder.f16864f);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return c().f16869d;
    }

    @Override // com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset G() {
        ImmutableSortedMultiset descendingImmutableSortedMultiset = this.f16860e;
        if (descendingImmutableSortedMultiset == null) {
            if (isEmpty()) {
                Ordering orderingG = Ordering.b(c().f16869d).g();
                descendingImmutableSortedMultiset = NaturalOrdering.f17113c.equals(orderingG) ? RegularImmutableSortedMultiset.N : new RegularImmutableSortedMultiset(orderingG);
            } else {
                descendingImmutableSortedMultiset = new DescendingImmutableSortedMultiset(this);
            }
            this.f16860e = descendingImmutableSortedMultiset;
        }
        return descendingImmutableSortedMultiset;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: r */
    public abstract ImmutableSortedSet c();

    @Override // com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: s */
    public abstract ImmutableSortedMultiset k0(Object obj, BoundType boundType);

    @Override // com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: t */
    public abstract ImmutableSortedMultiset E0(Object obj, BoundType boundType);

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset t1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        Preconditions.h(c().f16869d.compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return E0(obj, boundType).k0(obj2, boundType2);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
