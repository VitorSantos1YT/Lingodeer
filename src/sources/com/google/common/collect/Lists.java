package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Lists {

    /* JADX INFO: renamed from: com.google.common.collect.Lists$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends RandomAccessListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i11) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends AbstractListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i11) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AbstractListWrapper<E> extends AbstractList<E> {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i11, Object obj) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i11, Collection collection) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i11) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i11, Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CharSequenceAsList extends AbstractList<Character> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Partition<T> extends AbstractList<List<T>> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ReverseList<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f16959b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f16960a;

        public ReverseList(List list) {
            list.getClass();
            this.f16960a = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i11, Object obj) {
            this.f16960a.add(b(i11), obj);
        }

        public final int b(int i11) {
            int size = this.f16960a.size();
            Preconditions.l(i11, size);
            return size - i11;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            this.f16960a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            List list = this.f16960a;
            int size = list.size();
            Preconditions.i(i11, size);
            return list.get((size - 1) - i11);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i11) {
            final ListIterator listIterator = this.f16960a.listIterator(b(i11));
            return new ListIterator<Object>(this) { // from class: com.google.common.collect.Lists.ReverseList.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public boolean f16961a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ReverseList f16963c;

                {
                    this.f16963c = this;
                }

                @Override // java.util.ListIterator
                public final void add(Object obj) {
                    ListIterator listIterator2 = listIterator;
                    listIterator2.add(obj);
                    listIterator2.previous();
                    this.f16961a = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final Object next() {
                    ListIterator listIterator2 = listIterator;
                    if (!listIterator2.hasPrevious()) {
                        throw new NoSuchElementException();
                    }
                    this.f16961a = true;
                    return listIterator2.previous();
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
                    int iNextIndex = listIterator.nextIndex();
                    int i12 = ReverseList.f16959b;
                    return this.f16963c.b(iNextIndex);
                }

                @Override // java.util.ListIterator
                public final Object previous() {
                    ListIterator listIterator2 = listIterator;
                    if (!listIterator2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f16961a = true;
                    return listIterator2.next();
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final void remove() {
                    CollectPreconditions.d(this.f16961a);
                    listIterator.remove();
                    this.f16961a = false;
                }

                @Override // java.util.ListIterator
                public final void set(Object obj) {
                    Preconditions.r(this.f16961a);
                    listIterator.set(obj);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i11) {
            List list = this.f16960a;
            int size = list.size();
            Preconditions.i(i11, size);
            return list.remove((size - 1) - i11);
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i11, int i12) {
            subList(i11, i12).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i11, Object obj) {
            List list = this.f16960a;
            int size = list.size();
            Preconditions.i(i11, size);
            return list.set((size - 1) - i11, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f16960a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i11, int i12) {
            List list = this.f16960a;
            Preconditions.m(i11, i12, list.size());
            return Lists.d(list.subList(b(i12), b(i11)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StringAsImmutableList extends ImmutableList<Character> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f16964c;

        public StringAsImmutableList(String str) {
            this.f16964c = str;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: A */
        public final ImmutableList subList(int i11, int i12) {
            String str = this.f16964c;
            Preconditions.m(i11, i12, str.length());
            String strSubstring = str.substring(i11, i12);
            strSubstring.getClass();
            return new StringAsImmutableList(strSubstring);
        }

        @Override // java.util.List
        public final Object get(int i11) {
            String str = this.f16964c;
            Preconditions.i(i11, str.length());
            return Character.valueOf(str.charAt(i11));
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return this.f16964c.indexOf(((Character) obj).charValue());
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return this.f16964c.lastIndexOf(((Character) obj).charValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f16964c.length();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f16965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function f16966b;

        public TransformingRandomAccessList(List list, Function function) {
            list.getClass();
            this.f16965a = list;
            this.f16966b = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            return this.f16966b.apply(this.f16965a.get(i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.f16965a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i11) {
            return new TransformedListIterator<Object, Object>(this.f16965a.listIterator(i11)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    return TransformingRandomAccessList.this.f16966b.apply(obj);
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i11) {
            return this.f16966b.apply(this.f16965a.remove(i11));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i11, int i12) {
            this.f16965a.subList(i11, i12).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f16965a.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f16968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function f16969b;

        public TransformingSequentialList(List list, Function function) {
            list.getClass();
            this.f16968a = list;
            this.f16969b = function;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.f16968a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i11) {
            return new TransformedListIterator<Object, Object>(this.f16968a.listIterator(i11)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    return TransformingSequentialList.this.f16969b.apply(obj);
                }
            };
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i11, int i12) {
            this.f16968a.subList(i11, i12).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f16968a.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            if (i11 == 0 || i11 == 1) {
                return null;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    private Lists() {
    }

    public static ArrayList a(Iterator it) {
        ArrayList arrayList = new ArrayList();
        Iterators.a(arrayList, it);
        return arrayList;
    }

    public static ArrayList b(Object... objArr) {
        int length = objArr.length;
        CollectPreconditions.b(length, "arraySize");
        ArrayList arrayList = new ArrayList(Ints.e(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList c(int i11) {
        CollectPreconditions.b(i11, "initialArraySize");
        return new ArrayList(i11);
    }

    public static List d(List list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).x();
        }
        if (list instanceof ReverseList) {
            return ((ReverseList) list).f16960a;
        }
        return list instanceof RandomAccess ? new RandomAccessReverseList(list) : new ReverseList(list);
    }

    public static AbstractList e(List list, Function function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }
}
