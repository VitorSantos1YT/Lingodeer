package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends ForwardingSet<Object> {
        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return Collections2.a(this, collection);
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object j0() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: o0 */
        public final Collection j0() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (obj == null) {
                return false;
            }
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            return Sets.g(this, collection);
        }

        @Override // com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: w0 */
        public final Set j0() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends AbstractIterator<Multiset.Entry<Object>> {
        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 extends ForwardingIterator<Multiset.Entry<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Multiset.Entry f16674a;

        @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
        public final Object j0() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public final Object next() {
            Multiset.Entry entry = (Multiset.Entry) super.next();
            this.f16674a = entry;
            return entry;
        }

        @Override // com.google.common.collect.ForwardingIterator
        /* JADX INFO: renamed from: o0 */
        public final Iterator j0() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public final void remove() {
            Preconditions.p("no calls to next() since the last call to remove()", this.f16674a != null);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FieldSettersHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Serialization.FieldSetter f16676a = Serialization.a(ConcurrentHashMultiset.class, "countMap");

        private FieldSettersHolder() {
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        FieldSettersHolder.f16676a.a(this, (ConcurrentMap) object);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(null);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean J(int i11, Object obj) {
        obj.getClass();
        CollectPreconditions.b(i11, "oldCount");
        CollectPreconditions.b(0, "newCount");
        Maps.g(obj, null);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i11, Object obj) {
        obj.getClass();
        if (i11 == 0) {
            Maps.g(obj, null);
            throw null;
        }
        CollectPreconditions.c(i11, "occurrences");
        Maps.g(obj, null);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Set b() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Set d() {
        return new EntrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int e() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator f() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator g() {
        new AnonymousClass2();
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    @Override // com.google.common.collect.Multiset
    public final int q0(Object obj) {
        Maps.g(obj, null);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int u0(int i11, Object obj) {
        if (i11 == 0) {
            Maps.g(obj, null);
            throw null;
        }
        CollectPreconditions.c(i11, "occurrences");
        Maps.g(obj, null);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int w1(Object obj) {
        obj.getClass();
        CollectPreconditions.b(0, "count");
        Maps.g(obj, null);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class EntrySet extends AbstractMultiset<E>.EntrySet {
        public EntrySet() {
            super();
        }

        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        public final Multiset f() {
            return ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            AbstractMultiset abstractMultiset = AbstractMultiset.this;
            int iE = abstractMultiset.e();
            CollectPreconditions.b(iE, "arraySize");
            ArrayList arrayList = new ArrayList(Ints.e(((long) iE) + 5 + ((long) (iE / 10))));
            Iterators.a(arrayList, abstractMultiset.g());
            return arrayList.toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            AbstractMultiset abstractMultiset = AbstractMultiset.this;
            int iE = abstractMultiset.e();
            CollectPreconditions.b(iE, "arraySize");
            ArrayList arrayList = new ArrayList(Ints.e(((long) iE) + 5 + ((long) (iE / 10))));
            Iterators.a(arrayList, abstractMultiset.g());
            return arrayList.toArray(objArr);
        }
    }
}
