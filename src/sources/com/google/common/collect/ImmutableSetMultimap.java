package com.google.common.collect;

import com.google.common.base.MoreObjects;
import hh.p0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements SetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    public final transient ImmutableSet H;
    public transient ImmutableSet K;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient ImmutableSetMultimap f16847d;

        public EntrySet(ImmutableSetMultimap immutableSetMultimap) {
            this.f16847d = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f16847d.g0(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return this.f16847d.l();
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: j */
        public final UnmodifiableIterator iterator() {
            return this.f16847d.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f16847d.f16799t;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SetFieldSettersHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Serialization.FieldSetter f16848a = Serialization.a(ImmutableSetMultimap.class, "emptySet");

        private SetFieldSettersHolder() {
        }
    }

    public ImmutableSetMultimap(ImmutableMap immutableMap) {
        super(immutableMap, 0);
        int i11 = ImmutableSet.f16842c;
        this.H = RegularImmutableSet.L;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Object objZ;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i11 = objectInputStream.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException(p.j(i11, "Invalid key count "));
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i14 = objectInputStream.readInt();
            if (i14 <= 0) {
                throw new InvalidObjectException(p.j(i14, "Invalid value count "));
            }
            ImmutableSet.Builder builder2 = comparator == null ? new ImmutableSet.Builder() : new ImmutableSortedSet.Builder(comparator);
            for (int i15 = 0; i15 < i14; i15++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                builder2.a(object2);
            }
            ImmutableSet immutableSetK = builder2.k();
            if (immutableSetK.size() != i14) {
                throw new InvalidObjectException(p0.k(object, "Duplicate key-value pairs exist for key "));
            }
            builder.c(object, immutableSetK);
            i12 += i14;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.f16807a.a(this, builder.a(true));
            Serialization.FieldSetter fieldSetter = ImmutableMultimap.FieldSettersHolder.f16808b;
            fieldSetter.getClass();
            try {
                fieldSetter.f17181a.set(this, Integer.valueOf(i12));
                Serialization.FieldSetter fieldSetter2 = SetFieldSettersHolder.f16848a;
                if (comparator == null) {
                    int i16 = ImmutableSet.f16842c;
                    objZ = RegularImmutableSet.L;
                } else {
                    objZ = ImmutableSortedSet.z(comparator);
                }
                fieldSetter2.a(this, objZ);
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            }
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ImmutableSet immutableSet = this.H;
        objectOutputStream.writeObject(immutableSet instanceof ImmutableSortedSet ? ((ImmutableSortedSet) immutableSet).f16869d : null);
        Serialization.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection e() {
        ImmutableSet immutableSet = this.K;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.K = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        return (ImmutableSet) MoreObjects.a((ImmutableSet) this.f16798f.get(obj), this.H);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: k */
    public final ImmutableCollection e() {
        ImmutableSet immutableSet = this.K;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.K = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: m */
    public final ImmutableCollection get(Object obj) {
        return (ImmutableSet) MoreObjects.a((ImmutableSet) this.f16798f.get(obj), this.H);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public final ImmutableCollection o() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Set b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Set e() {
        ImmutableSet immutableSet = this.K;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.K = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Set get(Object obj) {
        return (ImmutableSet) MoreObjects.a((ImmutableSet) this.f16798f.get(obj), this.H);
    }
}
