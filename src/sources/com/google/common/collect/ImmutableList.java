package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UnmodifiableListIterator f16771b = new Itr(0, RegularImmutableList.f17147e);
    private static final long serialVersionUID = -889275714;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: a */
        public final ImmutableCollection.Builder c(Object obj) {
            super.c(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        public final ImmutableCollection.ArrayBasedBuilder c(Object obj) {
            super.c(obj);
            return this;
        }

        public final void h(Object obj) {
            super.c(obj);
        }

        public final void i(Object... objArr) {
            d(objArr.length, objArr);
        }

        public final ImmutableList j() {
            this.f16764c = true;
            return ImmutableList.k(this.f16763b, this.f16762a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Itr<E> extends AbstractIndexedListIterator<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImmutableList f16772c;

        public Itr(int i11, ImmutableList immutableList) {
            super(immutableList.size(), i11);
            this.f16772c = immutableList;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final Object a(int i11) {
            return this.f16772c.get(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ReverseImmutableList<E> extends ImmutableList<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient ImmutableList f16773c;

        public ReverseImmutableList(ImmutableList immutableList) {
            this.f16773c = immutableList;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public final ImmutableList subList(int i11, int i12) {
            ImmutableList immutableList = this.f16773c;
            Preconditions.m(i11, i12, immutableList.size());
            return immutableList.subList(immutableList.size() - i12, immutableList.size() - i11).x();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f16773c.contains(obj);
        }

        @Override // java.util.List
        public final Object get(int i11) {
            ImmutableList immutableList = this.f16773c;
            Preconditions.i(i11, immutableList.size());
            return immutableList.get((immutableList.size() - 1) - i11);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return this.f16773c.h();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(Object obj) {
            ImmutableList immutableList = this.f16773c;
            int iLastIndexOf = immutableList.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return (immutableList.size() - 1) - iLastIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(Object obj) {
            ImmutableList immutableList = this.f16773c;
            int iIndexOf = immutableList.indexOf(obj);
            if (iIndexOf >= 0) {
                return (immutableList.size() - 1) - iIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f16773c.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList
        public final ImmutableList x() {
            return this.f16773c;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i11) {
            return listIterator(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f16774a;

        public SerializedForm(Object[] objArr) {
            this.f16774a = objArr;
        }

        public Object readResolve() {
            return ImmutableList.o(this.f16774a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class SubList extends ImmutableList<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient int f16775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient int f16776d;

        public SubList(int i11, int i12) {
            this.f16775c = i11;
            this.f16776d = i12;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: A */
        public final ImmutableList subList(int i11, int i12) {
            Preconditions.m(i11, i12, this.f16776d);
            int i13 = this.f16775c;
            return ImmutableList.this.subList(i11 + i13, i12 + i13);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final Object[] e() {
            return ImmutableList.this.e();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int f() {
            return ImmutableList.this.g() + this.f16775c + this.f16776d;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int g() {
            return ImmutableList.this.g() + this.f16775c;
        }

        @Override // java.util.List
        public final Object get(int i11) {
            Preconditions.i(i11, this.f16776d);
            return ImmutableList.this.get(i11 + this.f16775c);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f16776d;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i11) {
            return listIterator(i11);
        }
    }

    public static ImmutableList k(int i11, Object[] objArr) {
        return i11 == 0 ? RegularImmutableList.f17147e : new RegularImmutableList(i11, objArr);
    }

    public static Builder l(int i11) {
        CollectPreconditions.b(i11, "expectedSize");
        return new Builder(i11);
    }

    public static ImmutableList m(Iterable iterable) {
        if (iterable instanceof Collection) {
            return n((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return RegularImmutableList.f17147e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return u(next);
        }
        Builder builder = new Builder();
        builder.h(next);
        while (it.hasNext()) {
            builder.c(it.next());
        }
        return builder.j();
    }

    public static ImmutableList n(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            Object[] array = collection.toArray();
            ObjectArrays.a(array.length, array);
            return k(array.length, array);
        }
        ImmutableList immutableListB = ((ImmutableCollection) collection).b();
        if (!immutableListB.h()) {
            return immutableListB;
        }
        Object[] array2 = immutableListB.toArray(ImmutableCollection.f16761a);
        return k(array2.length, array2);
    }

    public static ImmutableList o(Object[] objArr) {
        if (objArr.length == 0) {
            return RegularImmutableList.f17147e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        ObjectArrays.a(objArr2.length, objArr2);
        return k(objArr2.length, objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableList s() {
        return RegularImmutableList.f17147e;
    }

    public static ImmutableList t(Long l9, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l9, l11, l12, l13, l14};
        ObjectArrays.a(5, objArr);
        return k(5, objArr);
    }

    public static ImmutableList u(Object obj) {
        Object[] objArr = {obj};
        ObjectArrays.a(1, objArr);
        return k(1, objArr);
    }

    public static ImmutableList v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ObjectArrays.a(2, objArr);
        return k(2, objArr);
    }

    public static ImmutableList w(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        Preconditions.e("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        ObjectArrays.a(length, objArr2);
        return k(length, objArr2);
    }

    public static ImmutableList z(Ordering ordering, Collection collection) {
        ordering.getClass();
        Object[] array = (collection instanceof Collection ? collection : Lists.a(collection.iterator())).toArray();
        ObjectArrays.a(array.length, array);
        Arrays.sort(array, ordering);
        return k(array.length, array);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A */
    public ImmutableList subList(int i11, int i12) {
        Preconditions.m(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        return i13 == 0 ? RegularImmutableList.f17147e : new SubList(i11, i13);
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int d(int i11, Object[] objArr) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i11 + i12] = get(i12);
        }
        return i11 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && Objects.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        if (Objects.a(get(i11), list.get(i11))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = ~(~(get(i12).hashCode() + (i11 * 31)));
        }
        return i11;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (obj.equals(get(i11))) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public final UnmodifiableIterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public UnmodifiableListIterator listIterator(int i11) {
        Preconditions.l(i11, size());
        return isEmpty() ? f16771b : new Itr(i11, this);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.f16761a));
    }

    public ImmutableList x() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList b() {
        return this;
    }
}
