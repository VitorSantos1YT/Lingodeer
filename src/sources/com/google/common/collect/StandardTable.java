package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f17208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier f17209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Set f17210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Map f17211f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class CellIterator implements Iterator<Table.Cell<R, C, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f17212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map.Entry f17213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f17214c = Iterators.EmptyModifiableIterator.INSTANCE;

        public CellIterator(StandardTable standardTable) {
            this.f17212a = standardTable.f17208c.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f17212a.hasNext() || this.f17214c.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f17214c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f17212a.next();
                this.f17213b = entry;
                this.f17214c = ((Map) entry.getValue()).entrySet().iterator();
            }
            Objects.requireNonNull(this.f17213b);
            Map.Entry entry2 = (Map.Entry) this.f17214c.next();
            Object key = this.f17213b.getKey();
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            Function function = Tables.f17261a;
            return new Tables.ImmutableCell(key, key2, value);
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f17214c.remove();
            Map.Entry entry = this.f17213b;
            Objects.requireNonNull(entry);
            if (((Map) entry.getValue()).isEmpty()) {
                this.f17212a.remove();
                this.f17213b = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Column extends Maps.ViewCachingAbstractMap<R, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f17215d;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class EntrySet extends Sets.ImprovedAbstractSet<Map.Entry<R, V>> {
            public EntrySet() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                Column.this.d(Predicates.b());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Column column = Column.this;
                    StandardTable standardTable = StandardTable.this;
                    Object key = entry.getKey();
                    Object obj2 = column.f17215d;
                    Object value = entry.getValue();
                    if (value != null && value.equals(standardTable.q(key, obj2))) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                Column column = Column.this;
                return !StandardTable.this.m(column.f17215d);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return Column.this.new EntrySetIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Column column = Column.this;
                    StandardTable standardTable = StandardTable.this;
                    Object key = entry.getKey();
                    Object obj2 = column.f17215d;
                    Object value = entry.getValue();
                    if (value != null && value.equals(standardTable.q(key, obj2))) {
                        standardTable.s(key, obj2);
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                return Column.this.d(Predicates.h(Predicates.f(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                Column column = Column.this;
                Iterator<V> it = StandardTable.this.f17208c.values().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    if (((Map) it.next()).containsKey(column.f17215d)) {
                        i11++;
                    }
                }
                return i11;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Iterator f17218c;

            public EntrySetIterator() {
                this.f17218c = StandardTable.this.f17208c.entrySet().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                final Map.Entry entry;
                do {
                    Iterator it = this.f17218c;
                    if (!it.hasNext()) {
                        this.f16559a = AbstractIterator.State.DONE;
                        return null;
                    }
                    entry = (Map.Entry) it.next();
                } while (!((Map) entry.getValue()).containsKey(Column.this.f17215d));
                return new AbstractMapEntry<Object, Object>(this) { // from class: com.google.common.collect.StandardTable.Column.EntrySetIterator.1EntryImpl

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ EntrySetIterator f17221b;

                    {
                        this.f17221b = this;
                    }

                    @Override // java.util.Map.Entry
                    public final Object getKey() {
                        return entry.getKey();
                    }

                    @Override // java.util.Map.Entry
                    public final Object getValue() {
                        return ((Map) entry.getValue()).get(Column.this.f17215d);
                    }

                    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                    public final Object setValue(Object obj) {
                        Map map = (Map) entry.getValue();
                        Object obj2 = Column.this.f17215d;
                        obj.getClass();
                        return map.put(obj2, obj);
                    }
                };
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class KeySet extends Maps.KeySet<R, V> {
            public KeySet() {
                super(Column.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Column column = Column.this;
                return StandardTable.this.l(obj, column.f17215d);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Column column = Column.this;
                return StandardTable.this.s(obj, column.f17215d) != null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                return Column.this.d(Predicates.d(Predicates.h(Predicates.f(collection)), Maps.EntryFunction.KEY));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class Values extends Maps.Values<R, V> {
            public Values() {
                super(Column.this);
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean remove(Object obj) {
                if (obj != null) {
                    return Column.this.d(Predicates.d(Predicates.e(obj), Maps.EntryFunction.VALUE));
                }
                return false;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean removeAll(Collection collection) {
                return Column.this.d(Predicates.d(Predicates.f(collection), Maps.EntryFunction.VALUE));
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean retainAll(Collection collection) {
                return Column.this.d(Predicates.d(Predicates.h(Predicates.f(collection)), Maps.EntryFunction.VALUE));
            }
        }

        public Column(Object obj) {
            obj.getClass();
            this.f17215d = obj;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new KeySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new Values();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return StandardTable.this.l(obj, this.f17215d);
        }

        public final boolean d(Predicate predicate) {
            Iterator it = StandardTable.this.f17208c.entrySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Map map = (Map) entry.getValue();
                Object obj = this.f17215d;
                Object obj2 = map.get(obj);
                if (obj2 != null && predicate.apply(new ImmutableEntry(entry.getKey(), obj2))) {
                    map.remove(obj);
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            return StandardTable.this.q(obj, this.f17215d);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            return StandardTable.this.r(obj, this.f17215d, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            return StandardTable.this.s(obj, this.f17215d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ColumnKeyIterator extends AbstractIterator<C> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f17224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Iterator f17225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Iterator f17226e = Iterators.ArrayItr.f16895d;

        public ColumnKeyIterator(StandardTable standardTable) {
            this.f17224c = (Map) standardTable.f17209d.get();
            this.f17225d = standardTable.f17208c.values().iterator();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            while (true) {
                if (this.f17226e.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f17226e.next();
                    Object key = entry.getKey();
                    Map map = this.f17224c;
                    if (!map.containsKey(key)) {
                        map.put(entry.getKey(), entry.getValue());
                        return entry.getKey();
                    }
                } else {
                    Iterator it = this.f17225d;
                    if (!it.hasNext()) {
                        this.f16559a = AbstractIterator.State.DONE;
                        return null;
                    }
                    this.f17226e = ((Map) it.next()).entrySet().iterator();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ColumnKeySet extends StandardTable<R, C, V>.TableSet<C> {
        public ColumnKeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return StandardTable.this.m(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return StandardTable.this.o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            boolean z11 = false;
            if (obj == null) {
                return false;
            }
            Iterator<V> it = StandardTable.this.f17208c.values().iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (map.keySet().remove(obj)) {
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            Iterator<V> it = StandardTable.this.f17208c.values().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (Iterators.k(collection, map.keySet().iterator())) {
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            Iterator<V> it = StandardTable.this.f17208c.values().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (map.keySet().retainAll(collection)) {
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return Iterators.l(StandardTable.this.o());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ColumnMap extends Maps.ViewCachingAbstractMap<C, Map<R, V>> {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public final class ColumnMapEntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$ColumnMap$ColumnMapEntrySet$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            class AnonymousClass1 implements Function<Object, Map<Object, Object>> {
                public AnonymousClass1() {
                }

                @Override // com.google.common.base.Function
                public final Map<Object, Object> apply(Object obj) {
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ColumnMapEntrySet() {
                super();
                ColumnMap.this.getClass();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                ((Map.Entry) obj).getKey();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                StandardTable.i(null, ((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection collection) {
                collection.getClass();
                return Sets.h(this, collection.iterator());
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                collection.getClass();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class ColumnMapValues extends Maps.Values<C, Map<R, V>> {
            public ColumnMapValues() {
                super(ColumnMap.this);
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean remove(Object obj) {
                for (Map.Entry entry : ColumnMap.this.entrySet()) {
                    if (((Map) entry.getValue()).equals(obj)) {
                        StandardTable.i(null, entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean removeAll(Collection collection) {
                collection.getClass();
                throw null;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean retainAll(Collection collection) {
                collection.getClass();
                throw null;
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new ColumnMapEntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new ColumnMapValues();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Row extends Maps.IteratorBasedAbstractMap<C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f17231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f17232b;

        public Row(Object obj) {
            obj.getClass();
            this.f17231a = obj;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            d();
            Map map = this.f17232b;
            if (map == null) {
                return Iterators.EmptyModifiableIterator.INSTANCE;
            }
            final Iterator it = map.entrySet().iterator();
            return new Iterator<Map.Entry<Object, Object>>(this) { // from class: com.google.common.collect.StandardTable.Row.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Row f17235b;

                {
                    this.f17235b = this;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Map.Entry<Object, Object> next() {
                    final Map.Entry entry = (Map.Entry) it.next();
                    return new ForwardingMapEntry<Object, Object>() { // from class: com.google.common.collect.StandardTable.Row.2
                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public final boolean equals(Object obj) {
                            if (!(obj instanceof Map.Entry)) {
                                return false;
                            }
                            Map.Entry entry2 = (Map.Entry) obj;
                            return com.google.common.base.Objects.a(getKey(), entry2.getKey()) && com.google.common.base.Objects.a(getValue(), entry2.getValue());
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        /* JADX INFO: renamed from: j0 */
                        public final Object o0() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry
                        /* JADX INFO: renamed from: o0 */
                        public final Map.Entry j0() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public final Object setValue(Object obj) {
                            obj.getClass();
                            return super.setValue(obj);
                        }
                    };
                }

                @Override // java.util.Iterator
                public final void remove() {
                    it.remove();
                    this.f17235b.c();
                }
            };
        }

        public Map b() {
            return (Map) StandardTable.this.f17208c.get(this.f17231a);
        }

        public void c() {
            d();
            Map map = this.f17232b;
            if (map == null || !map.isEmpty()) {
                return;
            }
            StandardTable.this.f17208c.remove(this.f17231a);
            this.f17232b = null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            d();
            Map map = this.f17232b;
            if (map != null) {
                map.clear();
            }
            c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map map;
            boolean zContainsKey;
            d();
            if (obj != null && (map = this.f17232b) != null) {
                try {
                    zContainsKey = map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    zContainsKey = false;
                }
                if (zContainsKey) {
                    return true;
                }
            }
            return false;
        }

        public final void d() {
            Map map = this.f17232b;
            if (map == null || (map.isEmpty() && StandardTable.this.f17208c.containsKey(this.f17231a))) {
                this.f17232b = b();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Map map;
            d();
            if (obj == null || (map = this.f17232b) == null) {
                return null;
            }
            return Maps.g(obj, map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            obj.getClass();
            obj2.getClass();
            Map map = this.f17232b;
            return (map == null || map.isEmpty()) ? StandardTable.this.r(this.f17231a, obj, obj2) : this.f17232b.put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            d();
            Map map = this.f17232b;
            Object objRemove = null;
            if (map == null) {
                return null;
            }
            try {
                objRemove = map.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
            }
            c();
            return objRemove;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            d();
            Map map = this.f17232b;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class RowMap extends Maps.ViewCachingAbstractMap<R, Map<C, V>> {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public final class EntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {
            public EntrySet() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && Collections2.c(entry, StandardTable.this.f17208c.entrySet())) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                Set setKeySet = StandardTable.this.f17208c.keySet();
                return new Maps.AnonymousClass3(setKeySet.iterator(), new Function<Object, Map<Object, Object>>() { // from class: com.google.common.collect.StandardTable.RowMap.EntrySet.1
                    @Override // com.google.common.base.Function
                    public final Map<Object, Object> apply(Object obj) {
                        return StandardTable.this.t(obj);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && StandardTable.this.f17208c.entrySet().remove(entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return StandardTable.this.f17208c.size();
            }
        }

        public RowMap() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return StandardTable.this.n(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            StandardTable standardTable = StandardTable.this;
            if (!standardTable.n(obj)) {
                return null;
            }
            Objects.requireNonNull(obj);
            return standardTable.t(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return (Map) StandardTable.this.f17208c.remove(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T> {
        public TableSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            StandardTable.this.f17208c.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return StandardTable.this.f17208c.isEmpty();
        }
    }

    public StandardTable(Map map, Supplier supplier) {
        this.f17208c = map;
        this.f17209d = supplier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LinkedHashMap i(StandardTable standardTable, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = standardTable.f17208c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object objRemove = ((Map) entry.getValue()).remove(obj);
            if (objRemove != null) {
                linkedHashMap.put(entry.getKey(), objRemove);
                if (((Map) entry.getValue()).isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator a() {
        return new CellIterator(this);
    }

    @Override // com.google.common.collect.AbstractTable
    public void b() {
        this.f17208c.clear();
    }

    @Override // com.google.common.collect.AbstractTable
    public boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // com.google.common.collect.Table
    public Map f() {
        Map map = this.f17211f;
        if (map != null) {
            return map;
        }
        Map mapP = p();
        this.f17211f = mapP;
        return mapP;
    }

    public Map j(Object obj) {
        return new Column(obj);
    }

    public Set k() {
        Set set = this.f17210e;
        if (set != null) {
            return set;
        }
        ColumnKeySet columnKeySet = new ColumnKeySet();
        this.f17210e = columnKeySet;
        return columnKeySet;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    public boolean l(Object obj, Object obj2) {
        boolean zContainsKey;
        boolean z11;
        if (obj == null || obj2 == null) {
            return false;
        }
        Map map = (Map) Maps.g(obj, f());
        if (map != null) {
            try {
                zContainsKey = map.containsKey(obj2);
            } catch (ClassCastException | NullPointerException unused) {
                zContainsKey = false;
            }
            if (zContainsKey) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return z11;
    }

    public boolean m(Object obj) {
        boolean zContainsKey;
        if (obj != null) {
            for (V v11 : this.f17208c.values()) {
                v11.getClass();
                try {
                    zContainsKey = v11.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    zContainsKey = false;
                }
                if (zContainsKey) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean n(Object obj) {
        boolean zContainsKey;
        if (obj != null) {
            Map map = this.f17208c;
            map.getClass();
            try {
                zContainsKey = map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                zContainsKey = false;
            }
            if (zContainsKey) {
                return true;
            }
        }
        return false;
    }

    public Iterator o() {
        return new ColumnKeyIterator(this);
    }

    public Map p() {
        return new RowMap();
    }

    public Object q(Object obj, Object obj2) {
        Map map;
        if (obj != null && obj2 != null && (map = (Map) Maps.g(obj, f())) != null) {
            try {
                return map.get(obj2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return null;
    }

    public Object r(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
        Map map = this.f17208c;
        Map map2 = (Map) map.get(obj);
        if (map2 == null) {
            map2 = (Map) this.f17209d.get();
            map.put(obj, map2);
        }
        return map2.put(obj2, obj3);
    }

    public Object s(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        Map map = this.f17208c;
        Map map2 = (Map) Maps.g(obj, map);
        if (map2 == null) {
            return null;
        }
        Object objRemove = map2.remove(obj2);
        if (map2.isEmpty()) {
            map.remove(obj);
        }
        return objRemove;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        Iterator<V> it = this.f17208c.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((Map) it.next()).size();
        }
        return size;
    }

    public Map t(Object obj) {
        return new Row(obj);
    }
}
