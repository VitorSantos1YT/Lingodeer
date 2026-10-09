package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class LinkedListMultimap<K, V> extends AbstractMultimap<K, V> implements ListMultimap<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    public transient Map H = new CompactHashMap(12);
    public transient int K;
    public transient int L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Node f16925f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient Node f16926t;

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends AbstractSequentialList<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f16927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinkedListMultimap f16928b;

        public AnonymousClass1(LinkedListMultimap linkedListMultimap, Object obj) {
            this.f16927a = obj;
            this.f16928b = linkedListMultimap;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i11) {
            return new ValueForKeyIterator(this.f16927a, i11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            KeyList keyList = (KeyList) this.f16928b.H.get(this.f16927a);
            if (keyList == null) {
                return 0;
            }
            return keyList.f16940c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class DistinctKeyIterator implements Iterator<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashSet f16933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Node f16934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Node f16935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16936d;

        public DistinctKeyIterator() {
            this.f16933a = new HashSet(Maps.c(LinkedListMultimap.this.keySet().size()));
            this.f16934b = LinkedListMultimap.this.f16925f;
            this.f16936d = LinkedListMultimap.this.L;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (LinkedListMultimap.this.L == this.f16936d) {
                return this.f16934b != null;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Node node;
            if (LinkedListMultimap.this.L != this.f16936d) {
                throw new ConcurrentModificationException();
            }
            Node node2 = this.f16934b;
            if (node2 == null) {
                throw new NoSuchElementException();
            }
            this.f16935c = node2;
            Object obj = node2.f16941a;
            HashSet hashSet = this.f16933a;
            hashSet.add(obj);
            do {
                node = this.f16934b.f16943c;
                this.f16934b = node;
                if (node == null) {
                    break;
                }
            } while (!hashSet.add(node.f16941a));
            return this.f16935c.f16941a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            if (linkedListMultimap.L != this.f16936d) {
                throw new ConcurrentModificationException();
            }
            Preconditions.p("no calls to next() since the last call to remove()", this.f16935c != null);
            Iterators.b(new ValueForKeyIterator(this.f16935c.f16941a));
            this.f16935c = null;
            this.f16936d = linkedListMultimap.L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class KeyList<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Node f16938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Node f16939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16940c;

        public KeyList(Node node) {
            this.f16938a = node;
            this.f16939b = node;
            node.f16946f = null;
            node.f16945e = null;
            this.f16940c = 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Node<K, V> extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f16942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Node f16943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Node f16944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Node f16945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Node f16946f;

        public Node(Object obj, Object obj2) {
            this.f16941a = obj;
            this.f16942b = obj2;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f16941a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f16942b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object obj2 = this.f16942b;
            this.f16942b = obj;
            return obj2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class NodeIterator implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Node f16948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Node f16949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Node f16950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16951e;

        public NodeIterator(int i11) {
            this.f16951e = LinkedListMultimap.this.L;
            int i12 = LinkedListMultimap.this.K;
            Preconditions.l(i11, i12);
            if (i11 >= i12 / 2) {
                this.f16950d = LinkedListMultimap.this.f16926t;
                this.f16947a = i12;
                while (true) {
                    int i13 = i11 + 1;
                    if (i11 >= i12) {
                        break;
                    }
                    a();
                    Node node = this.f16950d;
                    if (node == null) {
                        throw new NoSuchElementException();
                    }
                    this.f16949c = node;
                    this.f16948b = node;
                    this.f16950d = node.f16944d;
                    this.f16947a--;
                    i11 = i13;
                }
            } else {
                this.f16948b = LinkedListMultimap.this.f16925f;
                while (true) {
                    int i14 = i11 - 1;
                    if (i11 > 0) {
                        a();
                        Node node2 = this.f16948b;
                        if (node2 == null) {
                            throw new NoSuchElementException();
                        }
                        this.f16949c = node2;
                        this.f16950d = node2;
                        this.f16948b = node2.f16943c;
                        this.f16947a++;
                        i11 = i14;
                    }
                }
            }
            this.f16949c = null;
        }

        public final void a() {
            if (LinkedListMultimap.this.L != this.f16951e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            a();
            return this.f16948b != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            a();
            return this.f16950d != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            a();
            Node node = this.f16948b;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.f16949c = node;
            this.f16950d = node;
            this.f16948b = node.f16943c;
            this.f16947a++;
            return node;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f16947a;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            a();
            Node node = this.f16950d;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.f16949c = node;
            this.f16948b = node;
            this.f16950d = node.f16944d;
            this.f16947a--;
            return node;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f16947a - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            Preconditions.p("no calls to next() since the last call to remove()", this.f16949c != null);
            Node node = this.f16949c;
            if (node != this.f16948b) {
                this.f16950d = node.f16944d;
                this.f16947a--;
            } else {
                this.f16948b = node.f16943c;
            }
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            LinkedListMultimap.j(linkedListMultimap, node);
            this.f16949c = null;
            this.f16951e = linkedListMultimap.L;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public static void j(LinkedListMultimap linkedListMultimap, Node node) {
        Node node2 = node.f16944d;
        Object obj = node.f16941a;
        if (node2 != null) {
            node2.f16943c = node.f16943c;
        } else {
            linkedListMultimap.f16925f = node.f16943c;
        }
        Node node3 = node.f16943c;
        if (node3 != null) {
            node3.f16944d = node2;
        } else {
            linkedListMultimap.f16926t = node2;
        }
        if (node.f16946f == null && node.f16945e == null) {
            KeyList keyList = (KeyList) linkedListMultimap.H.remove(obj);
            Objects.requireNonNull(keyList);
            keyList.f16940c = 0;
            linkedListMultimap.L++;
        } else {
            KeyList keyList2 = (KeyList) linkedListMultimap.H.get(obj);
            Objects.requireNonNull(keyList2);
            keyList2.f16940c--;
            Node node4 = node.f16946f;
            if (node4 == null) {
                Node node5 = node.f16945e;
                Objects.requireNonNull(node5);
                keyList2.f16938a = node5;
            } else {
                node4.f16945e = node.f16945e;
            }
            Node node6 = node.f16945e;
            if (node6 == null) {
                Node node7 = node.f16946f;
                Objects.requireNonNull(node7);
                keyList2.f16939b = node7;
            } else {
                node6.f16946f = node.f16946f;
            }
        }
        linkedListMultimap.K--;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.H = new CompactLinkedHashMap();
        int i11 = objectInputStream.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.K);
        for (Map.Entry entry : (List) super.e()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Map a() {
        return new Multimaps.AsMap(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection c() {
        return new AbstractSequentialList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.LinkedListMultimap.1EntriesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public final ListIterator listIterator(int i11) {
                return new NodeIterator(i11);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return LinkedListMultimap.this.K;
            }
        };
    }

    @Override // com.google.common.collect.Multimap
    public final void clear() {
        this.f16925f = null;
        this.f16926t = null;
        this.H.clear();
        this.K = 0;
        this.L++;
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return this.H.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean containsValue(Object obj) {
        return ((List) super.values()).contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Set d() {
        return new Sets.ImprovedAbstractSet<Object>() { // from class: com.google.common.collect.LinkedListMultimap.1KeySetImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return LinkedListMultimap.this.H.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new DistinctKeyIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                return !LinkedListMultimap.this.b(obj).isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return LinkedListMultimap.this.H.size();
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection e() {
        return (List) super.e();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset f() {
        return new Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection g() {
        return new AbstractSequentialList<Object>() { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public final ListIterator listIterator(int i11) {
                final NodeIterator nodeIterator = new NodeIterator(i11);
                return new TransformedListIterator<Map.Entry<Object, Object>, Object>(nodeIterator) { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl.1
                    @Override // com.google.common.collect.TransformedIterator
                    public final Object a(Object obj) {
                        return ((Map.Entry) obj).getValue();
                    }

                    @Override // com.google.common.collect.TransformedListIterator, java.util.ListIterator
                    public final void set(Object obj) {
                        NodeIterator nodeIterator2 = nodeIterator;
                        Preconditions.r(nodeIterator2.f16949c != null);
                        nodeIterator2.f16949c.f16942b = obj;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return LinkedListMultimap.this.K;
            }
        };
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        return new AnonymousClass1(this, obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Iterator i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean isEmpty() {
        return this.f16925f == null;
    }

    public final Node k(Object obj, Object obj2, Node node) {
        Node node2 = new Node(obj, obj2);
        if (this.f16925f == null) {
            this.f16926t = node2;
            this.f16925f = node2;
            this.H.put(obj, new KeyList(node2));
            this.L++;
        } else if (node == null) {
            Node node3 = this.f16926t;
            Objects.requireNonNull(node3);
            node3.f16943c = node2;
            node2.f16944d = this.f16926t;
            this.f16926t = node2;
            KeyList keyList = (KeyList) this.H.get(obj);
            if (keyList == null) {
                this.H.put(obj, new KeyList(node2));
                this.L++;
            } else {
                keyList.f16940c++;
                Node node4 = keyList.f16939b;
                node4.f16945e = node2;
                node2.f16946f = node4;
                keyList.f16939b = node2;
            }
        } else {
            KeyList keyList2 = (KeyList) this.H.get(obj);
            Objects.requireNonNull(keyList2);
            keyList2.f16940c++;
            node2.f16944d = node.f16944d;
            node2.f16946f = node.f16946f;
            node2.f16943c = node;
            node2.f16945e = node;
            Node node5 = node.f16946f;
            if (node5 == null) {
                keyList2.f16938a = node2;
            } else {
                node5.f16945e = node2;
            }
            Node node6 = node.f16944d;
            if (node6 == null) {
                this.f16925f = node2;
            } else {
                node6.f16943c = node2;
            }
            node.f16944d = node2;
            node.f16946f = node2;
        }
        this.K++;
        return node2;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean put(Object obj, Object obj2) {
        k(obj, obj2, null);
        return true;
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        return this.K;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection values() {
        return (List) super.values();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List b(Object obj) {
        List listUnmodifiableList = Collections.unmodifiableList(Lists.a(new ValueForKeyIterator(obj)));
        Iterators.b(new ValueForKeyIterator(obj));
        return listUnmodifiableList;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List get(Object obj) {
        return new AnonymousClass1(this, obj);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ValueForKeyIterator implements ListIterator<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Node f16955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Node f16956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Node f16957e;

        public ValueForKeyIterator(Object obj) {
            this.f16953a = obj;
            KeyList keyList = (KeyList) LinkedListMultimap.this.H.get(obj);
            this.f16955c = keyList == null ? null : keyList.f16938a;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            this.f16957e = LinkedListMultimap.this.k(this.f16953a, obj, this.f16955c);
            this.f16954b++;
            this.f16956d = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f16955c != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f16957e != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            Node node = this.f16955c;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.f16956d = node;
            this.f16957e = node;
            this.f16955c = node.f16945e;
            this.f16954b++;
            return node.f16942b;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f16954b;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            Node node = this.f16957e;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.f16956d = node;
            this.f16955c = node;
            this.f16957e = node.f16946f;
            this.f16954b--;
            return node.f16942b;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f16954b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            Preconditions.p("no calls to next() since the last call to remove()", this.f16956d != null);
            Node node = this.f16956d;
            if (node != this.f16955c) {
                this.f16957e = node.f16946f;
                this.f16954b--;
            } else {
                this.f16955c = node.f16945e;
            }
            LinkedListMultimap.j(LinkedListMultimap.this, node);
            this.f16956d = null;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            Preconditions.r(this.f16956d != null);
            this.f16956d.f16942b = obj;
        }

        public ValueForKeyIterator(Object obj, int i11) {
            KeyList keyList = (KeyList) LinkedListMultimap.this.H.get(obj);
            int i12 = keyList == null ? 0 : keyList.f16940c;
            Preconditions.l(i11, i12);
            if (i11 >= i12 / 2) {
                this.f16957e = keyList == null ? null : keyList.f16939b;
                this.f16954b = i12;
                while (true) {
                    int i13 = i11 + 1;
                    if (i11 >= i12) {
                        break;
                    }
                    previous();
                    i11 = i13;
                }
            } else {
                this.f16955c = keyList == null ? null : keyList.f16938a;
                while (true) {
                    int i14 = i11 - 1;
                    if (i11 <= 0) {
                        break;
                    }
                    next();
                    i11 = i14;
                }
            }
            this.f16953a = obj;
            this.f16956d = null;
        }
    }
}
