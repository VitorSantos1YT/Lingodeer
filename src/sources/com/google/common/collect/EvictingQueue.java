package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class EvictingQueue<E> extends ForwardingQueue<E> implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < 0) {
            return Iterators.a(this, collection.iterator());
        }
        clear();
        Preconditions.e("number to skip cannot be negative", size >= 0);
        Iterable anonymousClass6 = new FluentIterable<Object>() { // from class: com.google.common.collect.Iterables.6

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Iterable f16884b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f16885c;

            /* JADX INFO: renamed from: com.google.common.collect.Iterables$6$1 */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            class AnonymousClass1 implements Iterator<Object> {

                /* JADX INFO: renamed from: a */
                public boolean f16886a = true;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Iterator f16887b;

                public AnonymousClass1() {
                    it = it;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    Object next = it.next();
                    this.f16886a = false;
                    return next;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    CollectPreconditions.d(!this.f16886a);
                    it.remove();
                }
            }

            public AnonymousClass6() {
                collection = collection;
                i = size;
            }

            @Override // java.lang.Iterable
            public final Iterator iterator() {
                Iterable iterable = collection;
                boolean z11 = iterable instanceof List;
                int i11 = i;
                if (z11) {
                    List list = (List) iterable;
                    return list.subList(Math.min(list.size(), i11), list.size()).iterator();
                }
                Iterator it = iterable.iterator();
                it.getClass();
                Preconditions.e("numberToAdvance must be nonnegative", i11 >= 0);
                for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
                    it.next();
                }
                return new Iterator<Object>() { // from class: com.google.common.collect.Iterables.6.1

                    /* JADX INFO: renamed from: a */
                    public boolean f16886a = true;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Iterator f16887b;

                    public AnonymousClass1() {
                        it = it;
                    }

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final Object next() {
                        Object next = it.next();
                        this.f16886a = false;
                        return next;
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        CollectPreconditions.d(!this.f16886a);
                        it.remove();
                    }
                };
            }
        };
        return anonymousClass6 instanceof Collection ? addAll((Collection) anonymousClass6) : Iterators.a(this, anonymousClass6.iterator());
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: j0 */
    public final /* bridge */ /* synthetic */ Object o0() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: o0 */
    public final /* bridge */ /* synthetic */ Collection j0() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingQueue, java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        return true;
    }

    @Override // com.google.common.collect.ForwardingQueue
    /* JADX INFO: renamed from: w0 */
    public final Queue o0() {
        return null;
    }
}
