package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyStringArrayList f21412a;

    /* JADX INFO: renamed from: com.google.protobuf.UnmodifiableLazyStringList$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ListIterator f21413a;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f21413a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f21413a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return (String) this.f21413a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f21413a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return (String) this.f21413a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f21413a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.UnmodifiableLazyStringList$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator f21414a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21414a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return (String) this.f21414a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public UnmodifiableLazyStringList(LazyStringArrayList lazyStringArrayList) {
        this.f21412a = lazyStringArrayList;
    }

    @Override // com.google.protobuf.LazyStringList
    public final void F(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return this.f21412a.get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.f21414a = this.f21412a.iterator();
        return anonymousClass2;
    }

    @Override // com.google.protobuf.LazyStringList
    public final Object j1(int i11) {
        return this.f21412a.f21299b.get(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.f21413a = this.f21412a.listIterator(i11);
        return anonymousClass1;
    }

    @Override // com.google.protobuf.LazyStringList
    public final List q() {
        return Collections.unmodifiableList(this.f21412a.f21299b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21412a.size();
    }

    @Override // com.google.protobuf.LazyStringList
    public final LazyStringList X0() {
        return this;
    }
}
