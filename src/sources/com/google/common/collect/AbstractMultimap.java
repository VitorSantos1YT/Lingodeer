package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractMultimap<K, V> implements Multimap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Collection f16603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set f16604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Multiset f16605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Collection f16606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Map f16607e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Entries extends Multimaps.Entries<K, V> {
        public Entries() {
        }

        @Override // com.google.common.collect.Multimaps.Entries
        public final Multimap b() {
            return AbstractMultimap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return AbstractMultimap.this.i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return Sets.e(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Values extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractMapBasedMultimap f16609a;

        public Values(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            this.f16609a = abstractMapBasedMultimap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f16609a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f16609a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return this.f16609a.q();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f16609a.size();
        }
    }

    @Override // com.google.common.collect.Multimap
    public Multiset T() {
        Multiset multiset = this.f16605c;
        if (multiset != null) {
            return multiset;
        }
        Multiset multisetF = f();
        this.f16605c = multisetF;
        return multisetF;
    }

    @Override // com.google.common.collect.Multimap
    public Map Y() {
        Map map = this.f16607e;
        if (map != null) {
            return map;
        }
        Map mapA = a();
        this.f16607e = mapA;
        return mapA;
    }

    public abstract Map a();

    public abstract Collection c();

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
        Iterator<V> it = Y().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set d();

    @Override // com.google.common.collect.Multimap
    public Collection e() {
        Collection collection = this.f16603a;
        if (collection != null) {
            return collection;
        }
        Collection collectionC = c();
        this.f16603a = collectionC;
        return collectionC;
    }

    @Override // com.google.common.collect.Multimap
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Multimap) {
            return Y().equals(((Multimap) obj).Y());
        }
        return false;
    }

    public abstract Multiset f();

    public abstract Collection g();

    @Override // com.google.common.collect.Multimap
    public boolean g0(Object obj, Object obj2) {
        Collection collection = (Collection) Y().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return Y().hashCode();
    }

    public abstract Iterator i();

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.Multimap
    public Set keySet() {
        Set set = this.f16604b;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.f16604b = setD;
        return setD;
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(Object obj, Object obj2) {
        return get(obj).add(obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) Y().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return Y().toString();
    }

    @Override // com.google.common.collect.Multimap
    public Collection values() {
        Collection collection = this.f16606d;
        if (collection != null) {
            return collection;
        }
        Collection collectionG = g();
        this.f16606d = collectionG;
        return collectionG;
    }
}
