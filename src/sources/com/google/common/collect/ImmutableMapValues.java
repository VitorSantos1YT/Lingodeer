package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableMap f16794b;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMapValues$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends UnmodifiableIterator<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnmodifiableIterator f16795a;

        public AnonymousClass1(ImmutableMapValues immutableMapValues) {
            this.f16795a = immutableMapValues.f16794b.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16795a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return ((Map.Entry) this.f16795a.next()).getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMap f16797a;

        public SerializedForm(ImmutableMap immutableMap) {
            this.f16797a = immutableMap;
        }

        public Object readResolve() {
            return this.f16797a.values();
        }
    }

    public ImmutableMapValues(ImmutableMap immutableMap) {
        this.f16794b = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList b() {
        final ImmutableList immutableListB = this.f16794b.entrySet().b();
        return new ImmutableList<Object>() { // from class: com.google.common.collect.ImmutableMapValues.2
            @Override // java.util.List
            public final Object get(int i11) {
                return ((Map.Entry) immutableListB.get(i11)).getValue();
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean h() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return immutableListB.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return obj != null && Iterators.d(new AnonymousClass1(this), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean h() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public final UnmodifiableIterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f16794b.size();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.f16794b);
    }
}
