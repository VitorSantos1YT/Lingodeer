package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset H = new RegularImmutableMultiset(new ObjectCountHashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient ObjectCountHashMap f17164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f17165f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient ImmutableSet f17166t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ElementSet extends IndexedImmutableSet<E> {
        public ElementSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final Object get(int i11) {
            return RegularImmutableMultiset.this.f17164e.e(i11);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return RegularImmutableMultiset.this.f17164e.f17120c;
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f17168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f17169b;

        public SerializedForm(Multiset multiset) {
            ImmutableMultiset immutableMultiset = (ImmutableMultiset) multiset;
            int size = immutableMultiset.entrySet().size();
            this.f17168a = new Object[size];
            this.f17169b = new int[size];
            int i11 = 0;
            for (Multiset.Entry entry : immutableMultiset.entrySet()) {
                this.f17168a[i11] = entry.a();
                this.f17169b[i11] = entry.getCount();
                i11++;
            }
        }

        public Object readResolve() {
            Object[] objArr = this.f17168a;
            ImmutableMultiset.Builder builder = new ImmutableMultiset.Builder(objArr.length);
            for (int i11 = 0; i11 < objArr.length; i11++) {
                builder.d(this.f17169b[i11], objArr[i11]);
            }
            return builder.e();
        }
    }

    public RegularImmutableMultiset(ObjectCountHashMap objectCountHashMap) {
        this.f17164e = objectCountHashMap;
        long jF = 0;
        for (int i11 = 0; i11 < objectCountHashMap.f17120c; i11++) {
            jF += (long) objectCountHashMap.f(i11);
        }
        this.f17165f = Ints.e(jF);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean h() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet c() {
        ImmutableSet immutableSet = this.f17166t;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.f17166t = elementSet;
        return elementSet;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final Multiset.Entry n(int i11) {
        ObjectCountHashMap objectCountHashMap = this.f17164e;
        Preconditions.i(i11, objectCountHashMap.f17120c);
        return new ObjectCountHashMap.MapEntry(i11);
    }

    @Override // com.google.common.collect.Multiset
    public final int q0(Object obj) {
        return this.f17164e.d(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f17165f;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
