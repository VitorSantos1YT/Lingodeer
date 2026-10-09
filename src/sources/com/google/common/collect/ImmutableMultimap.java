package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient ImmutableMap f16798f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int f16799t;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends UnmodifiableIterator<Map.Entry<Object, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnmodifiableIterator f16800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f16801b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public UnmodifiableIterator f16802c = Iterators.ArrayItr.f16895d;

        public AnonymousClass1(ImmutableMultimap immutableMultimap) {
            this.f16800a = immutableMultimap.f16798f.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16802c.hasNext() || this.f16800a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f16802c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f16800a.next();
                this.f16801b = entry.getKey();
                this.f16802c = ((ImmutableCollection) entry.getValue()).iterator();
            }
            Object obj = this.f16801b;
            Objects.requireNonNull(obj);
            return new ImmutableEntry(obj, this.f16802c.next());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @DoNotMock
    public static class Builder<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map f16805a;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImmutableMultimap f16806b;

        public EntryCollection(ImmutableMultimap immutableMultimap) {
            this.f16806b = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f16806b.g0(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return this.f16806b.f16798f.h();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* JADX INFO: renamed from: j */
        public final UnmodifiableIterator iterator() {
            ImmutableMultimap immutableMultimap = this.f16806b;
            immutableMultimap.getClass();
            return new AnonymousClass1(immutableMultimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f16806b.f16799t;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FieldSettersHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Serialization.FieldSetter f16807a = Serialization.a(ImmutableMultimap.class, "map");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Serialization.FieldSetter f16808b = Serialization.a(ImmutableMultimap.class, "size");
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Keys extends ImmutableMultiset<K> {
        public Keys() {
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return ImmutableMultimap.this.f16798f.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        /* JADX INFO: renamed from: l */
        public final ImmutableSet c() {
            return ImmutableMultimap.this.f16798f.keySet();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        public final Multiset.Entry n(int i11) {
            Map.Entry entry = (Map.Entry) ImmutableMultimap.this.f16798f.entrySet().b().get(i11);
            return new Multisets.ImmutableEntry(entry.getKey(), ((Collection) entry.getValue()).size());
        }

        @Override // com.google.common.collect.Multiset
        public final int q0(Object obj) {
            Collection collection = (Collection) ImmutableMultimap.this.f16798f.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ImmutableMultimap.this.f16799t;
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class KeysSerializedForm implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMultimap f16810a;

        public KeysSerializedForm(ImmutableMultimap immutableMultimap) {
            this.f16810a = immutableMultimap;
        }

        public Object readResolve() {
            return this.f16810a.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final transient ImmutableMultimap f16811b;

        public Values(ImmutableMultimap immutableMultimap) {
            this.f16811b = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f16811b.containsValue(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection
        public final int d(int i11, Object[] objArr) {
            UnmodifiableIterator it = this.f16811b.f16798f.values().iterator();
            while (it.hasNext()) {
                i11 = ((ImmutableCollection) it.next()).d(i11, objArr);
            }
            return i11;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* JADX INFO: renamed from: j */
        public final UnmodifiableIterator iterator() {
            ImmutableMultimap immutableMultimap = this.f16811b;
            immutableMultimap.getClass();
            return new UnmodifiableIterator<Object>(immutableMultimap) { // from class: com.google.common.collect.ImmutableMultimap.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UnmodifiableIterator f16803a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public UnmodifiableIterator f16804b = Iterators.ArrayItr.f16895d;

                {
                    this.f16803a = immutableMultimap.f16798f.values().iterator();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.f16804b.hasNext() || this.f16803a.hasNext();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Iterator
                public final Object next() {
                    if (!this.f16804b.hasNext()) {
                        this.f16804b = ((ImmutableCollection) this.f16803a.next()).iterator();
                    }
                    return this.f16804b.next();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f16811b.f16799t;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public ImmutableMultimap(ImmutableMap immutableMap, int i11) {
        this.f16798f = immutableMap;
        this.f16799t = i11;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Multiset T() {
        return (ImmutableMultiset) super.T();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Map a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection b(Object obj) {
        o();
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection c() {
        return new EntryCollection(this);
    }

    @Override // com.google.common.collect.Multimap
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return this.f16798f.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Set d() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset f() {
        return new Keys();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection g() {
        return new Values(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Iterator i() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ImmutableMap Y() {
        return this.f16798f;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection e() {
        return (ImmutableCollection) super.e();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Set keySet() {
        return this.f16798f.keySet();
    }

    public final UnmodifiableIterator l() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection get(Object obj);

    public final ImmutableMultiset n() {
        return (ImmutableMultiset) super.T();
    }

    public ImmutableCollection o() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        return this.f16799t;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection values() {
        return (ImmutableCollection) super.values();
    }
}
