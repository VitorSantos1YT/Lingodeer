package com.google.firebase.database.collection;

import com.google.firebase.database.snapshot.ChildKey;
import hh.p0;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RBTreeSortedMap<K, V> extends ImmutableSortedMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LLRBNode f19040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f19041b;

    public RBTreeSortedMap(LLRBNode lLRBNode, Comparator comparator) {
        this.f19040a = lLRBNode;
        this.f19041b = comparator;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean b(Object obj) {
        return m(obj) != null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object d(ChildKey childKey) {
        LLRBNode lLRBNodeM = m(childKey);
        if (lLRBNodeM != null) {
            return lLRBNodeM.getValue();
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Comparator e() {
        return this.f19041b;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object f() {
        return this.f19040a.i().getKey();
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object g() {
        return this.f19040a.h().getKey();
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object h(Object obj) {
        LLRBNode lLRBNodeA = this.f19040a;
        LLRBNode lLRBNode = null;
        while (!lLRBNodeA.isEmpty()) {
            int iCompare = this.f19041b.compare(obj, lLRBNodeA.getKey());
            if (iCompare == 0) {
                if (lLRBNodeA.a().isEmpty()) {
                    if (lLRBNode != null) {
                        return lLRBNode.getKey();
                    }
                    return null;
                }
                LLRBNode lLRBNodeA2 = lLRBNodeA.a();
                while (!lLRBNodeA2.g().isEmpty()) {
                    lLRBNodeA2 = lLRBNodeA2.g();
                }
                return lLRBNodeA2.getKey();
            }
            if (iCompare < 0) {
                lLRBNodeA = lLRBNodeA.a();
            } else {
                lLRBNode = lLRBNodeA;
                lLRBNodeA = lLRBNodeA.g();
            }
        }
        throw new IllegalArgumentException(p0.k(obj, "Couldn't find predecessor key of non-present key: "));
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean isEmpty() {
        return this.f19040a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ImmutableSortedMapIterator(this.f19040a, this.f19041b, false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final void j(LLRBNode.NodeVisitor nodeVisitor) {
        this.f19040a.e(nodeVisitor);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap k(Iterable iterable, Object obj) {
        LLRBNode lLRBNode = this.f19040a;
        Comparator comparator = this.f19041b;
        return new RBTreeSortedMap(((LLRBValueNode) lLRBNode.b(obj, iterable, comparator)).c(LLRBNode.Color.BLACK, null, null), comparator);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap l(Object obj) {
        if (!b(obj)) {
            return this;
        }
        LLRBNode lLRBNode = this.f19040a;
        Comparator comparator = this.f19041b;
        return new RBTreeSortedMap(lLRBNode.d(obj, comparator).c(LLRBNode.Color.BLACK, null, null), comparator);
    }

    public final LLRBNode m(Object obj) {
        LLRBNode lLRBNodeA = this.f19040a;
        while (!lLRBNodeA.isEmpty()) {
            int iCompare = this.f19041b.compare(obj, lLRBNodeA.getKey());
            if (iCompare < 0) {
                lLRBNodeA = lLRBNodeA.a();
            } else {
                if (iCompare == 0) {
                    return lLRBNodeA;
                }
                lLRBNodeA = lLRBNodeA.g();
            }
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final int size() {
        return this.f19040a.size();
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Iterator v1() {
        return new ImmutableSortedMapIterator(this.f19040a, this.f19041b, true);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder<A, B, C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f19042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f19043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LLRBValueNode f19044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LLRBValueNode f19045d;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static class BooleanChunk {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f19050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f19051b;
        }

        public Builder(List list, Map map) {
            this.f19042a = list;
            this.f19043b = map;
        }

        public static RBTreeSortedMap b(List list, Map map, Comparator comparator) {
            Builder builder = new Builder(list, map);
            Collections.sort(list, comparator);
            Base1_2.AnonymousClass1 anonymousClass1 = new Base1_2(list.size()).new AnonymousClass1();
            int size = list.size();
            while (anonymousClass1.hasNext()) {
                BooleanChunk booleanChunk = (BooleanChunk) anonymousClass1.next();
                int i11 = booleanChunk.f19051b;
                size -= i11;
                if (booleanChunk.f19050a) {
                    builder.c(LLRBNode.Color.BLACK, i11, size);
                } else {
                    builder.c(LLRBNode.Color.BLACK, i11, size);
                    int i12 = booleanChunk.f19051b;
                    size -= i12;
                    builder.c(LLRBNode.Color.RED, i12, size);
                }
            }
            LLRBNode lLRBNode = builder.f19044c;
            if (lLRBNode == null) {
                lLRBNode = LLRBEmptyNode.f19035a;
            }
            return new RBTreeSortedMap(lLRBNode, comparator);
        }

        public final LLRBNode a(int i11, int i12) {
            if (i12 == 0) {
                return LLRBEmptyNode.f19035a;
            }
            Map map = this.f19043b;
            List list = this.f19042a;
            if (i12 == 1) {
                Object obj = list.get(i11);
                return new LLRBBlackValueNode(obj, map.get(obj), null, null);
            }
            int i13 = i12 / 2;
            int i14 = i11 + i13;
            LLRBNode lLRBNodeA = a(i11, i13);
            LLRBNode lLRBNodeA2 = a(i14 + 1, i13);
            Object obj2 = list.get(i14);
            return new LLRBBlackValueNode(obj2, map.get(obj2), lLRBNodeA, lLRBNodeA2);
        }

        public final void c(LLRBNode.Color color, int i11, int i12) {
            LLRBNode lLRBNodeA = a(i12 + 1, i11 - 1);
            Object obj = this.f19042a.get(i12);
            LLRBNode.Color color2 = LLRBNode.Color.RED;
            Map map = this.f19043b;
            LLRBValueNode lLRBRedValueNode = color == color2 ? new LLRBRedValueNode(obj, map.get(obj), null, lLRBNodeA) : new LLRBBlackValueNode(obj, map.get(obj), null, lLRBNodeA);
            if (this.f19044c == null) {
                this.f19044c = lLRBRedValueNode;
                this.f19045d = lLRBRedValueNode;
            } else {
                this.f19045d.r(lLRBRedValueNode);
                this.f19045d = lLRBRedValueNode;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static class Base1_2 implements Iterable<BooleanChunk> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f19046a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f19047b;

            public Base1_2(int i11) {
                int i12 = i11 + 1;
                int iFloor = (int) Math.floor(Math.log(i12) / Math.log(2.0d));
                this.f19047b = iFloor;
                this.f19046a = (((long) Math.pow(2.0d, iFloor)) - 1) & ((long) i12);
            }

            @Override // java.lang.Iterable
            public final Iterator<BooleanChunk> iterator() {
                return new AnonymousClass1();
            }

            /* JADX INFO: renamed from: com.google.firebase.database.collection.RBTreeSortedMap$Builder$Base1_2$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            class AnonymousClass1 implements Iterator<BooleanChunk> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f19048a;

                public AnonymousClass1() {
                    this.f19048a = Base1_2.this.f19047b - 1;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.f19048a >= 0;
                }

                @Override // java.util.Iterator
                public final BooleanChunk next() {
                    long j11 = Base1_2.this.f19046a & ((long) (1 << this.f19048a));
                    BooleanChunk booleanChunk = new BooleanChunk();
                    booleanChunk.f19050a = j11 == 0;
                    booleanChunk.f19051b = (int) Math.pow(2.0d, this.f19048a);
                    this.f19048a--;
                    return booleanChunk;
                }

                @Override // java.util.Iterator
                public final void remove() {
                }
            }
        }
    }
}
