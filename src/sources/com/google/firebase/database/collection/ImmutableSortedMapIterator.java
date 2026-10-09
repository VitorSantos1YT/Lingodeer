package com.google.firebase.database.collection;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ImmutableSortedMapIterator<K, V> implements Iterator<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f19030a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19031b;

    public ImmutableSortedMapIterator(LLRBNode lLRBNode, Comparator comparator, boolean z11) {
        this.f19031b = z11;
        while (!lLRBNode.isEmpty()) {
            this.f19030a.push((LLRBValueNode) lLRBNode);
            lLRBNode = z11 ? lLRBNode.g() : lLRBNode.a();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19030a.size() > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.f19030a;
        try {
            LLRBValueNode lLRBValueNode = (LLRBValueNode) arrayDeque.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(lLRBValueNode.f19036a, lLRBValueNode.f19037b);
            if (this.f19031b) {
                for (LLRBNode lLRBNodeG = lLRBValueNode.f19038c; !lLRBNodeG.isEmpty(); lLRBNodeG = lLRBNodeG.g()) {
                    arrayDeque.push((LLRBValueNode) lLRBNodeG);
                }
            } else {
                for (LLRBNode lLRBNodeA = lLRBValueNode.f19039d; !lLRBNodeA.isEmpty(); lLRBNodeA = lLRBNodeA.a()) {
                    arrayDeque.push((LLRBValueNode) lLRBNodeA);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
