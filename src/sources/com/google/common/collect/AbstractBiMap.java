package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient AbstractMap f16542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractBiMap f16543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Set f16544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Set f16545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Set f16546e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class BiMapEntry extends ForwardingMapEntry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map.Entry f16550a;

        public BiMapEntry(Map.Entry entry) {
            this.f16550a = entry;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final Object o0() {
            return this.f16550a;
        }

        @Override // com.google.common.collect.ForwardingMapEntry
        /* JADX INFO: renamed from: o0 */
        public final Map.Entry j0() {
            return this.f16550a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            AbstractBiMap abstractBiMap = AbstractBiMap.this;
            abstractBiMap.w0(obj);
            Preconditions.p("entry no longer in map", abstractBiMap.entrySet().contains(this));
            if (Objects.a(obj, getValue())) {
                return obj;
            }
            Preconditions.f("value already present: %s", !abstractBiMap.containsValue(obj), obj);
            Object value = this.f16550a.setValue(obj);
            Preconditions.p("entry no longer in map", Objects.a(obj, abstractBiMap.get(getKey())));
            Object key = getKey();
            abstractBiMap.f16543b.f16542a.remove(value);
            abstractBiMap.f16543b.f16542a.put(obj, key);
            return value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f16552a;

        public EntrySet() {
            this.f16552a = AbstractBiMap.this.f16542a.entrySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            return this.f16552a.contains(new Maps.AnonymousClass7((Map.Entry) obj));
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return Collections2.a(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            final AbstractBiMap abstractBiMap = AbstractBiMap.this;
            final Iterator<Map.Entry<K, V>> it = abstractBiMap.f16542a.entrySet().iterator();
            return new Iterator<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.AbstractBiMap.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Map.Entry f16547a;

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Map.Entry<Object, Object> next() {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.f16547a = entry;
                    return new BiMapEntry(entry);
                }

                @Override // java.util.Iterator
                public final void remove() {
                    Map.Entry entry = this.f16547a;
                    if (entry == null) {
                        throw new IllegalStateException("no calls to next() since the last call to remove()");
                    }
                    Object value = entry.getValue();
                    it.remove();
                    abstractBiMap.f16543b.f16542a.remove(value);
                    this.f16547a = null;
                }
            };
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final Object o0() {
            return this.f16552a;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final Collection o0() {
            return this.f16552a;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Set set = this.f16552a;
            if (!set.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            AbstractBiMap.this.f16543b.f16542a.remove(entry.getValue());
            set.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            return Sets.g(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            Iterator it = iterator();
            collection.getClass();
            boolean z11 = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: w0 */
        public final Set o0() {
            return this.f16552a;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return p0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Inverse<K, V> extends AbstractBiMap<K, V> {
        private static final long serialVersionUID = 0;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            java.util.Objects.requireNonNull(object);
            this.f16543b = (AbstractBiMap) object;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f16543b);
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final Object o0() {
            return this.f16542a;
        }

        @Override // com.google.common.collect.AbstractBiMap
        public final Object r0(Object obj) {
            return this.f16543b.w0(obj);
        }

        public Object readResolve() {
            return this.f16543b.Z();
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }

        @Override // com.google.common.collect.AbstractBiMap
        public final Object w0(Object obj) {
            return this.f16543b.r0(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class KeySet extends ForwardingSet<K> {
        public KeySet() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Maps.AnonymousClass1(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractBiMap abstractBiMap = AbstractBiMap.this;
            abstractBiMap.f16543b.f16542a.remove(abstractBiMap.f16542a.remove(obj));
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            return Sets.g(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            Iterator it = iterator();
            collection.getClass();
            boolean z11 = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: w0 */
        public final Set o0() {
            return AbstractBiMap.this.f16542a.keySet();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ValueSet extends ForwardingSet<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f16555a;

        public ValueSet() {
            this.f16555a = AbstractBiMap.this.f16543b.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Maps.AnonymousClass2(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final Object o0() {
            return this.f16555a;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final Collection o0() {
            return this.f16555a;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public final String toString() {
            return r0();
        }

        @Override // com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: w0 */
        public final Set o0() {
            return this.f16555a;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return p0();
        }
    }

    @Override // com.google.common.collect.BiMap
    public BiMap Z() {
        return this.f16543b;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        this.f16542a.clear();
        this.f16543b.f16542a.clear();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(Object obj) {
        return this.f16543b.containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set entrySet() {
        Set set = this.f16546e;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f16546e = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: j0 */
    public Object o0() {
        return this.f16542a;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set keySet() {
        Set set = this.f16544c;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f16544c = keySet;
        return keySet;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* JADX INFO: renamed from: o0 */
    public final Map j0() {
        return this.f16542a;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        r0(obj);
        w0(obj2);
        boolean zContainsKey = containsKey(obj);
        if (zContainsKey && Objects.a(obj2, get(obj))) {
            return obj2;
        }
        Preconditions.f("value already present: %s", !containsValue(obj2), obj2);
        Object objPut = this.f16542a.put(obj, obj2);
        if (zContainsKey) {
            this.f16543b.f16542a.remove(objPut);
        }
        this.f16543b.f16542a.put(obj2, obj);
        return objPut;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Object remove(Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        Object objRemove = this.f16542a.remove(obj);
        this.f16543b.f16542a.remove(objRemove);
        return objRemove;
    }

    public final void z0(EnumMap enumMap, AbstractMap abstractMap) {
        Preconditions.r(this.f16542a == null);
        Preconditions.r(this.f16543b == null);
        Preconditions.g(enumMap.isEmpty());
        Preconditions.g(abstractMap.isEmpty());
        Preconditions.g(enumMap != abstractMap);
        this.f16542a = enumMap;
        Inverse inverse = new Inverse();
        inverse.f16542a = abstractMap;
        inverse.f16543b = this;
        this.f16543b = inverse;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public Set values() {
        Set set = this.f16545d;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.f16545d = valueSet;
        return valueSet;
    }

    public Object r0(Object obj) {
        return obj;
    }

    public Object w0(Object obj) {
        return obj;
    }
}
