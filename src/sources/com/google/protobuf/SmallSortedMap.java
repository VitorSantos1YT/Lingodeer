package com.google.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f21377b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f21378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile EntrySet f21380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f21381f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile DescendingEntrySet f21382t;

    /* JADX INFO: renamed from: com.google.protobuf.SmallSortedMap$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object> {
        @Override // com.google.protobuf.SmallSortedMap
        public final void f() {
            if (!this.f21379d) {
                for (int i11 = 0; i11 < this.f21377b.size(); i11++) {
                    Map.Entry entryC = c(i11);
                    if (((FieldSet.FieldDescriptorLite) entryC.getKey()).x()) {
                        entryC.setValue(Collections.unmodifiableList((List) entryC.getValue()));
                    }
                }
                for (Map.Entry entry : d()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).x()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.f();
        }

        @Override // com.google.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((Comparable) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator f21384b;

        public DescendingEntryIterator() {
            this.f21383a = SmallSortedMap.this.f21377b.size();
        }

        public final Iterator a() {
            if (this.f21384b == null) {
                this.f21384b = SmallSortedMap.this.f21381f.entrySet().iterator();
            }
            return this.f21384b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i11 = this.f21383a;
            return (i11 > 0 && i11 <= SmallSortedMap.this.f21377b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = SmallSortedMap.this.f21377b;
            int i11 = this.f21383a - 1;
            this.f21383a = i11;
            return (Map.Entry) list.get(i11);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        public DescendingEntrySet() {
            super();
        }

        @Override // com.google.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new DescendingEntryIterator();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class EmptySet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Iterator f21387a = new Iterator<Object>() { // from class: com.google.protobuf.SmallSortedMap.EmptySet.1
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Iterable f21388b = new Iterable<Object>() { // from class: com.google.protobuf.SmallSortedMap.EmptySet.2
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return EmptySet.f21387a;
            }
        };

        private EmptySet() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparable f21389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21390b;

        public Entry(Comparable comparable, Object obj) {
            this.f21389a = comparable;
            this.f21390b = obj;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f21389a.compareTo(((Entry) obj).f21389a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Comparable comparable = this.f21389a;
                    if (comparable == null) {
                        zEquals = key == null;
                    } else {
                        zEquals = comparable.equals(key);
                    }
                    if (zEquals) {
                        Object obj2 = this.f21390b;
                        Object value = entry.getValue();
                        if (obj2 == null) {
                            zEquals2 = value == null;
                        } else {
                            zEquals2 = obj2.equals(value);
                        }
                        if (zEquals2) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f21389a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f21390b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Comparable comparable = this.f21389a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f21390b;
            return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            int i11 = SmallSortedMap.H;
            SmallSortedMap.this.b();
            Object obj2 = this.f21390b;
            this.f21390b = obj;
            return obj2;
        }

        public final String toString() {
            return this.f21389a + "=" + this.f21390b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21392a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f21393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f21394c;

        public EntryIterator() {
        }

        public final Iterator a() {
            if (this.f21394c == null) {
                this.f21394c = SmallSortedMap.this.f21378c.entrySet().iterator();
            }
            return this.f21394c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i11 = this.f21392a + 1;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i11 < smallSortedMap.f21377b.size() || (!smallSortedMap.f21378c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f21393b = true;
            int i11 = this.f21392a + 1;
            this.f21392a = i11;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i11 < smallSortedMap.f21377b.size() ? (Map.Entry) smallSortedMap.f21377b.get(this.f21392a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f21393b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f21393b = false;
            int i11 = SmallSortedMap.H;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            smallSortedMap.b();
            if (this.f21392a >= smallSortedMap.f21377b.size()) {
                a().remove();
                return;
            }
            int i12 = this.f21392a;
            this.f21392a = i12 - 1;
            smallSortedMap.h(i12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return SmallSortedMap.this.size();
        }
    }

    public SmallSortedMap(int i11) {
        this.f21376a = i11;
        Map map = Collections.EMPTY_MAP;
        this.f21378c = map;
        this.f21381f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i11;
        int i12;
        int i13;
        int iCompareTo;
        int size = this.f21377b.size();
        int i14 = size - 1;
        if (i14 < 0) {
            i11 = 0;
            while (i11 <= i14) {
                i13 = (i11 + i14) / 2;
                iCompareTo = comparable.compareTo(((Entry) this.f21377b.get(i13)).f21389a);
                if (iCompareTo < 0) {
                    i14 = i13 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i13;
                    }
                    i11 = i13 + 1;
                }
            }
            i12 = i11 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((Entry) this.f21377b.get(i14)).f21389a);
            if (iCompareTo2 > 0) {
                i12 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i14;
                }
                i11 = 0;
                while (i11 <= i14) {
                    i13 = (i11 + i14) / 2;
                    iCompareTo = comparable.compareTo(((Entry) this.f21377b.get(i13)).f21389a);
                    if (iCompareTo < 0) {
                        i14 = i13 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i13;
                        }
                        i11 = i13 + 1;
                    }
                }
                i12 = i11 + 1;
            }
        }
        return -i12;
    }

    public final void b() {
        if (this.f21379d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i11) {
        return (Map.Entry) this.f21377b.get(i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f21377b.isEmpty()) {
            this.f21377b.clear();
        }
        if (this.f21378c.isEmpty()) {
            return;
        }
        this.f21378c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f21378c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f21378c.isEmpty() ? EmptySet.f21388b : this.f21378c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f21378c.isEmpty() && !(this.f21378c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f21378c = treeMap;
            this.f21381f = treeMap.descendingMap();
        }
        return (SortedMap) this.f21378c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f21380e == null) {
            this.f21380e = new EntrySet();
        }
        return this.f21380e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size == smallSortedMap.size()) {
            int size2 = this.f21377b.size();
            if (size2 != smallSortedMap.f21377b.size()) {
                return ((AbstractSet) entrySet()).equals(smallSortedMap.entrySet());
            }
            for (int i11 = 0; i11 < size2; i11++) {
                if (c(i11).equals(smallSortedMap.c(i11))) {
                }
            }
            if (size2 != size) {
                return this.f21378c.equals(smallSortedMap.f21378c);
            }
            return true;
        }
        return false;
    }

    public void f() {
        if (this.f21379d) {
            return;
        }
        this.f21378c = this.f21378c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f21378c);
        this.f21381f = this.f21381f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f21381f);
        this.f21379d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Entry) this.f21377b.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f21377b.isEmpty();
        int i11 = this.f21376a;
        if (zIsEmpty && !(this.f21377b instanceof ArrayList)) {
            this.f21377b = new ArrayList(i11);
        }
        int i12 = -(iA + 1);
        if (i12 >= i11) {
            return e().put(comparable, obj);
        }
        if (this.f21377b.size() == i11) {
            Entry entry = (Entry) this.f21377b.remove(i11 - 1);
            e().put(entry.f21389a, entry.f21390b);
        }
        this.f21377b.add(i12, new Entry(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Entry) this.f21377b.get(iA)).f21390b : this.f21378c.get(comparable);
    }

    public final Object h(int i11) {
        b();
        Object obj = ((Entry) this.f21377b.remove(i11)).f21390b;
        if (!this.f21378c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f21377b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Entry((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f21377b.size();
        int iHashCode = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iHashCode += ((Entry) this.f21377b.get(i11)).hashCode();
        }
        return this.f21378c.size() > 0 ? this.f21378c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f21378c.isEmpty()) {
            return null;
        }
        return this.f21378c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21378c.size() + this.f21377b.size();
    }
}
