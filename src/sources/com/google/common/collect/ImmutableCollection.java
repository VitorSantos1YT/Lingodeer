package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f16761a = new Object[0];
    private static final long serialVersionUID = 912559;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ArrayBasedBuilder<E> extends Builder<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f16762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16764c;

        public ArrayBasedBuilder(int i11) {
            CollectPreconditions.b(i11, "initialCapacity");
            this.f16762a = new Object[i11];
            this.f16763b = 0;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ArrayBasedBuilder c(Object obj) {
            obj.getClass();
            g(1);
            Object[] objArr = this.f16762a;
            int i11 = this.f16763b;
            this.f16763b = i11 + 1;
            objArr[i11] = obj;
            return this;
        }

        public final void d(int i11, Object[] objArr) {
            ObjectArrays.a(i11, objArr);
            g(i11);
            System.arraycopy(objArr, 0, this.f16762a, this.f16763b, i11);
            this.f16763b += i11;
        }

        public final void e(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.f16763b = ((ImmutableCollection) collection).d(this.f16763b, this.f16762a);
                    return;
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public void f(Iterable iterable) {
            e(iterable);
        }

        public final void g(int i11) {
            Object[] objArr = this.f16762a;
            int iB = Builder.b(objArr.length, this.f16763b + i11);
            if (iB > objArr.length || this.f16764c) {
                this.f16762a = Arrays.copyOf(this.f16762a, iB);
                this.f16764c = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @DoNotMock
    public static abstract class Builder<E> {
        public static int b(int i11, int i12) {
            if (i12 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i12 <= i11) {
                return i11;
            }
            int iHighestOneBit = i11 + (i11 >> 1) + 1;
            if (iHighestOneBit < i12) {
                iHighestOneBit = Integer.highestOneBit(i12 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        /* JADX INFO: renamed from: a */
        public abstract Builder c(Object obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList b() {
        if (isEmpty()) {
            UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
            return RegularImmutableList.f17147e;
        }
        Object[] array = toArray(f16761a);
        UnmodifiableListIterator unmodifiableListIterator2 = ImmutableList.f16771b;
        return ImmutableList.k(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int d(int i11, Object[] objArr) {
        UnmodifiableIterator it = iterator();
        while (it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
        return i11;
    }

    public Object[] e() {
        return null;
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean h();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract UnmodifiableIterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f16761a);
    }

    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray(f16761a));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrE = e();
            if (objArrE != null) {
                return Arrays.copyOfRange(objArrE, g(), f(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        d(0, objArr);
        return objArr;
    }
}
