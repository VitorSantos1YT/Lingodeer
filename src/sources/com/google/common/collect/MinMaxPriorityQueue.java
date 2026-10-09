package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f17077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17079c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder<B> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Heap {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class MoveDesc<E> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class QueueIterator implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17080a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17081b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f17083d;

        public QueueIterator() {
            this.f17082c = MinMaxPriorityQueue.this.f17079c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            if (minMaxPriorityQueue.f17079c != this.f17082c) {
                throw new ConcurrentModificationException();
            }
            int i11 = this.f17080a + 1;
            if (this.f17081b < i11) {
                this.f17081b = i11;
            }
            return this.f17081b < minMaxPriorityQueue.f17078b;
        }

        @Override // java.util.Iterator
        public final Object next() {
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            if (minMaxPriorityQueue.f17079c != this.f17082c) {
                throw new ConcurrentModificationException();
            }
            int i11 = this.f17080a + 1;
            if (this.f17081b < i11) {
                this.f17081b = i11;
            }
            int i12 = this.f17081b;
            if (i12 >= minMaxPriorityQueue.f17078b) {
                throw new NoSuchElementException("iterator moved past last element in queue.");
            }
            this.f17080a = i12;
            this.f17083d = true;
            Object obj = minMaxPriorityQueue.f17077a[i12];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.f17083d);
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            int i11 = minMaxPriorityQueue.f17079c;
            int i12 = this.f17082c;
            if (i11 != i12) {
                throw new ConcurrentModificationException();
            }
            this.f17083d = false;
            this.f17082c = i12 + 1;
            int i13 = this.f17080a;
            if (i13 >= minMaxPriorityQueue.f17078b) {
                throw null;
            }
            minMaxPriorityQueue.b(i13);
            this.f17080a--;
            this.f17081b--;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        offer(obj);
        throw null;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator<E> it = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        offer(it.next());
        throw null;
    }

    public final void b(int i11) {
        Preconditions.l(i11, this.f17078b);
        this.f17079c++;
        int i12 = this.f17078b - 1;
        this.f17078b = i12;
        if (i12 == i11) {
            this.f17077a[i12] = null;
        } else {
            Objects.requireNonNull(this.f17077a[i12]);
            Preconditions.p("negative index", (~(~(this.f17078b + 1))) > 0);
            throw null;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        for (int i11 = 0; i11 < this.f17078b; i11++) {
            this.f17077a[i11] = null;
        }
        this.f17078b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new QueueIterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        this.f17079c++;
        int i11 = this.f17078b + 1;
        this.f17078b = i11;
        Object[] objArr = this.f17077a;
        if (i11 > objArr.length) {
            int length = objArr.length;
            Object[] objArr2 = new Object[Math.min((length < 64 ? (length + 1) * 2 : IntMath.b(length / 2)) - 1, 0) + 1];
            Object[] objArr3 = this.f17077a;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f17077a = objArr2;
        }
        Preconditions.p("negative index", (~(~i11)) > 0);
        throw null;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        Object obj = this.f17077a[0];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        Object obj = this.f17077a[0];
        Objects.requireNonNull(obj);
        b(0);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f17078b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        int i11 = this.f17078b;
        Object[] objArr = new Object[i11];
        System.arraycopy(this.f17077a, 0, objArr, 0, i11);
        return objArr;
    }
}
