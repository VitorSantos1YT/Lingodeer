package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f16812d = 0;
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient ImmutableList f16813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient ImmutableSet f16814c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder<E> extends ImmutableCollection.Builder<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ObjectCountHashMap f16818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16819b;

        public Builder() {
            this(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder c(Object obj) {
            return d(1, obj);
        }

        public Builder d(int i11, Object obj) {
            Objects.requireNonNull(this.f16818a);
            if (i11 == 0) {
                return this;
            }
            if (this.f16819b) {
                ObjectCountHashMap objectCountHashMap = this.f16818a;
                ObjectCountHashMap objectCountHashMap2 = new ObjectCountHashMap();
                objectCountHashMap2.h(objectCountHashMap.f17120c);
                for (int iC = objectCountHashMap.c(); iC != -1; iC = objectCountHashMap.k(iC)) {
                    objectCountHashMap2.m(objectCountHashMap.f(iC), objectCountHashMap.e(iC));
                }
                this.f16818a = objectCountHashMap2;
            }
            this.f16819b = false;
            obj.getClass();
            ObjectCountHashMap objectCountHashMap3 = this.f16818a;
            objectCountHashMap3.m(i11 + objectCountHashMap3.d(obj), obj);
            return this;
        }

        public ImmutableMultiset e() {
            Objects.requireNonNull(this.f16818a);
            if (this.f16818a.f17120c == 0) {
                int i11 = ImmutableMultiset.f16812d;
                return RegularImmutableMultiset.H;
            }
            this.f16819b = true;
            return new RegularImmutableMultiset(this.f16818a);
        }

        public Builder(int i11) {
            this.f16819b = false;
            this.f16818a = new ObjectCountHashMap(i11, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class EntrySet extends IndexedImmutableSet<Multiset.Entry<E>> {
        private static final long serialVersionUID = 0;

        public EntrySet() {
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && ImmutableMultiset.this.q0(entry.a()) == entry.getCount();
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final Object get(int i11) {
            return ImmutableMultiset.this.n(i11);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return ImmutableMultiset.this.h();
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ImmutableMultiset.this.c().size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class EntrySetSerializedForm<E> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMultiset f16821a;

        public EntrySetSerializedForm(ImmutableMultiset immutableMultiset) {
            this.f16821a = immutableMultiset;
        }

        public Object readResolve() {
            return this.f16821a.entrySet();
        }
    }

    public static ImmutableMultiset k(Collection collection) {
        if (collection instanceof ImmutableMultiset) {
            ImmutableMultiset immutableMultiset = (ImmutableMultiset) collection;
            if (!immutableMultiset.h()) {
                return immutableMultiset;
            }
        }
        boolean z11 = collection instanceof Multiset;
        Builder builder = new Builder(z11 ? ((Multiset) collection).c().size() : 11);
        Objects.requireNonNull(builder.f16818a);
        if (z11) {
            Multiset multiset = (Multiset) collection;
            ObjectCountHashMap objectCountHashMap = multiset instanceof RegularImmutableMultiset ? ((RegularImmutableMultiset) multiset).f17164e : multiset instanceof AbstractMapBasedMultiset ? ((AbstractMapBasedMultiset) multiset).f16595c : null;
            if (objectCountHashMap != null) {
                ObjectCountHashMap objectCountHashMap2 = builder.f16818a;
                objectCountHashMap2.b(Math.max(objectCountHashMap2.f17120c, objectCountHashMap.f17120c));
                for (int iC = objectCountHashMap.c(); iC >= 0; iC = objectCountHashMap.k(iC)) {
                    builder.d(objectCountHashMap.f(iC), objectCountHashMap.e(iC));
                }
            } else {
                Set setEntrySet = multiset.entrySet();
                ObjectCountHashMap objectCountHashMap3 = builder.f16818a;
                objectCountHashMap3.b(Math.max(objectCountHashMap3.f17120c, setEntrySet.size()));
                for (Multiset.Entry entry : multiset.entrySet()) {
                    builder.d(entry.getCount(), entry.a());
                }
            }
        } else {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                builder.c(it.next());
            }
        }
        return builder.e();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.Multiset
    public final boolean J(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    public final int add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList b() {
        ImmutableList immutableList = this.f16813b;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList immutableListB = super.b();
        this.f16813b = immutableListB;
        return immutableListB;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return q0(obj) > 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int d(int i11, Object[] objArr) {
        UnmodifiableIterator it = entrySet().iterator();
        while (it.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) it.next();
            Arrays.fill(objArr, i11, entry.getCount() + i11, entry.a());
            i11 += entry.getCount();
        }
        return i11;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return Multisets.a(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return Sets.e(entrySet());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: j */
    public final UnmodifiableIterator iterator() {
        final UnmodifiableIterator it = entrySet().iterator();
        return new UnmodifiableIterator<Object>() { // from class: com.google.common.collect.ImmutableMultiset.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f16815a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f16816b;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f16815a > 0 || it.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (this.f16815a <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) it.next();
                    this.f16816b = entry.a();
                    this.f16815a = entry.getCount();
                }
                this.f16815a--;
                Object obj = this.f16816b;
                Objects.requireNonNull(obj);
                return obj;
            }
        };
    }

    @Override // com.google.common.collect.Multiset
    /* JADX INFO: renamed from: l */
    public abstract ImmutableSet c();

    @Override // com.google.common.collect.Multiset
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet entrySet() {
        ImmutableSet entrySet = this.f16814c;
        if (entrySet == null) {
            entrySet = isEmpty() ? RegularImmutableSet.L : new EntrySet();
            this.f16814c = entrySet;
        }
        return entrySet;
    }

    public abstract Multiset.Entry n(int i11);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.Multiset
    public final int u0(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    public final int w1(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public abstract Object writeReplace();
}
