package com.google.common.collect;

import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingDeque<E> extends ForwardingQueue<E> implements Deque<E> {
    @Override // java.util.Deque
    public final void addFirst(Object obj) {
        o0().addFirst(obj);
    }

    @Override // java.util.Deque
    public final void addLast(Object obj) {
        o0().addLast(obj);
    }

    @Override // java.util.Deque
    public final Iterator descendingIterator() {
        return o0().descendingIterator();
    }

    @Override // java.util.Deque
    public final Object getFirst() {
        return o0().getFirst();
    }

    @Override // java.util.Deque
    public final Object getLast() {
        return o0().getLast();
    }

    @Override // java.util.Deque
    public final boolean offerFirst(Object obj) {
        return o0().offerFirst(obj);
    }

    @Override // java.util.Deque
    public final boolean offerLast(Object obj) {
        return o0().offerLast(obj);
    }

    @Override // java.util.Deque
    public final Object peekFirst() {
        return o0().peekFirst();
    }

    @Override // java.util.Deque
    public final Object peekLast() {
        return o0().peekLast();
    }

    @Override // java.util.Deque
    public final Object pollFirst() {
        return o0().pollFirst();
    }

    @Override // java.util.Deque
    public final Object pollLast() {
        return o0().pollLast();
    }

    @Override // java.util.Deque
    public final Object pop() {
        return o0().pop();
    }

    @Override // java.util.Deque
    public final void push(Object obj) {
        o0().push(obj);
    }

    @Override // java.util.Deque
    public final Object removeFirst() {
        return o0().removeFirst();
    }

    @Override // java.util.Deque
    public final boolean removeFirstOccurrence(Object obj) {
        return o0().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    public final Object removeLast() {
        return o0().removeLast();
    }

    @Override // java.util.Deque
    public final boolean removeLastOccurrence(Object obj) {
        return o0().removeLastOccurrence(obj);
    }

    @Override // com.google.common.collect.ForwardingQueue
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract Deque j0();
}
