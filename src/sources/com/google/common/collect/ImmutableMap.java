package com.google.common.collect;

import com.google.android.gms.internal.measurement.zzabw;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient ImmutableSet f16778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient ImmutableSet f16779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient ImmutableCollection f16780c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @DoNotMock
    public static class Builder<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f16782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DuplicateKey f16784c;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class DuplicateKey {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f16785a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f16786b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f16787c;

            public DuplicateKey(Object obj, Object obj2, Object obj3) {
                this.f16785a = obj;
                this.f16786b = obj2;
                this.f16787c = obj3;
            }

            public final IllegalArgumentException a() {
                StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
                Object obj = this.f16785a;
                sb2.append(obj);
                sb2.append("=");
                sb2.append(this.f16786b);
                sb2.append(" and ");
                sb2.append(obj);
                sb2.append("=");
                sb2.append(this.f16787c);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public Builder() {
            this(4);
        }

        public final ImmutableMap a(boolean z11) {
            DuplicateKey duplicateKey;
            DuplicateKey duplicateKey2;
            if (z11 && (duplicateKey2 = this.f16784c) != null) {
                throw duplicateKey2.a();
            }
            RegularImmutableMap regularImmutableMapP = RegularImmutableMap.p(this.f16783b, this.f16782a, this);
            if (!z11 || (duplicateKey = this.f16784c) == null) {
                return regularImmutableMapP;
            }
            throw duplicateKey.a();
        }

        public ImmutableMap b() {
            return a(true);
        }

        public Builder c(Object obj, Object obj2) {
            int i11 = (this.f16783b + 1) * 2;
            Object[] objArr = this.f16782a;
            if (i11 > objArr.length) {
                this.f16782a = Arrays.copyOf(objArr, ImmutableCollection.Builder.b(objArr.length, i11));
            }
            CollectPreconditions.a(obj, obj2);
            Object[] objArr2 = this.f16782a;
            int i12 = this.f16783b;
            int i13 = i12 * 2;
            objArr2[i13] = obj;
            objArr2[i13 + 1] = obj2;
            this.f16783b = i12 + 1;
            return this;
        }

        public Builder d(Iterable iterable) {
            if (iterable instanceof Collection) {
                int size = (((Collection) iterable).size() + this.f16783b) * 2;
                Object[] objArr = this.f16782a;
                if (size > objArr.length) {
                    this.f16782a = Arrays.copyOf(objArr, ImmutableCollection.Builder.b(objArr.length, size));
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder e(Map map) {
            return d(map.entrySet());
        }

        public Builder(int i11) {
            this.f16782a = new Object[i11 * 2];
            this.f16783b = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        @Override // com.google.common.collect.ImmutableMap
        public final ImmutableSet c() {
            return new ImmutableMapEntrySet<Object, Object>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
                public final Iterator iterator() {
                    return IteratorBasedImmutableMap.this.p();
                }

                @Override // com.google.common.collect.ImmutableCollection
                /* JADX INFO: renamed from: j */
                public final UnmodifiableIterator iterator() {
                    return IteratorBasedImmutableMap.this.p();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet
                public final ImmutableMap u() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet d() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final ImmutableCollection e() {
            return new ImmutableMapValues(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Set entrySet() {
            return entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Set keySet() {
            return keySet();
        }

        public abstract UnmodifiableIterator p();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }

        @Override // com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends UnmodifiableIterator<Map.Entry<Object, ImmutableSet<Object>>> {

            /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            class C00191 extends AbstractMapEntry<Object, ImmutableSet<Object>> {
                @Override // java.util.Map.Entry
                public final Object getKey() {
                    throw null;
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
                    throw null;
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw null;
            }
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public final ImmutableSet d() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean g() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean h() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final int hashCode() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public final UnmodifiableIterator p() {
            throw null;
        }

        @Override // java.util.Map
        public final int size() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f16789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f16790b;

        public SerializedForm(ImmutableMap immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator unmodifiableIteratorJ = immutableMap.entrySet().iterator();
            int i11 = 0;
            while (unmodifiableIteratorJ.hasNext()) {
                Map.Entry entry = (Map.Entry) unmodifiableIteratorJ.next();
                objArr[i11] = entry.getKey();
                objArr2[i11] = entry.getValue();
                i11++;
            }
            this.f16789a = objArr;
            this.f16790b = objArr2;
        }

        public Builder a(int i11) {
            return new Builder(i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.f16789a;
            boolean z11 = objArr instanceof ImmutableSet;
            Object[] objArr2 = this.f16790b;
            if (!z11) {
                Builder builderA = a(objArr.length);
                for (int i11 = 0; i11 < objArr.length; i11++) {
                    builderA.c(objArr[i11], objArr2[i11]);
                }
                return builderA.b();
            }
            ImmutableSet immutableSet = (ImmutableSet) objArr;
            Builder builderA2 = a(immutableSet.size());
            UnmodifiableIterator unmodifiableIteratorJ = immutableSet.iterator();
            UnmodifiableIterator unmodifiableIteratorJ2 = ((ImmutableCollection) objArr2).iterator();
            while (unmodifiableIteratorJ.hasNext()) {
                builderA2.c(unmodifiableIteratorJ.next(), unmodifiableIteratorJ2.next());
            }
            return builderA2.b();
        }
    }

    public static Builder a(int i11) {
        CollectPreconditions.b(i11, "expectedSize");
        return new Builder(i11);
    }

    public static ImmutableMap b(Map map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap immutableMap = (ImmutableMap) map;
            if (!immutableMap.h()) {
                return immutableMap;
            }
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        Builder builder = new Builder(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        builder.d(setEntrySet);
        return builder.a(true);
    }

    public static ImmutableMap k() {
        return RegularImmutableMap.f17150t;
    }

    public static ImmutableMap l(zzabw zzabwVar, Object obj, zzabw zzabwVar2, Object obj2, zzabw zzabwVar3, Object obj3, zzabw zzabwVar4, Object obj4, zzabw zzabwVar5, Object obj5, zzabw zzabwVar6, Object obj6, zzabw zzabwVar7, Object obj7) {
        CollectPreconditions.a(zzabwVar, obj);
        CollectPreconditions.a(zzabwVar2, obj2);
        CollectPreconditions.a(zzabwVar3, obj3);
        CollectPreconditions.a(zzabwVar4, obj4);
        CollectPreconditions.a(zzabwVar5, obj5);
        CollectPreconditions.a(zzabwVar6, obj6);
        CollectPreconditions.a(zzabwVar7, obj7);
        return RegularImmutableMap.p(7, new Object[]{zzabwVar, obj, zzabwVar2, obj2, zzabwVar3, obj3, zzabwVar4, obj4, zzabwVar5, obj5, zzabwVar6, obj6, zzabwVar7, obj7}, null);
    }

    public static ImmutableMap m(String str, String str2, String str3, String str4) {
        CollectPreconditions.a("Purpose1", str);
        CollectPreconditions.a("Purpose3", str2);
        CollectPreconditions.a("Purpose4", str3);
        CollectPreconditions.a("Purpose7", str4);
        return RegularImmutableMap.p(4, new Object[]{"Purpose1", str, "Purpose3", str2, "Purpose4", str3, "Purpose7", str4}, null);
    }

    public static ImmutableMap n(String str, String str2, String str3, String str4, String str5) {
        return RegularImmutableMap.p(5, new Object[]{"AuthorizePurpose1", str, "AuthorizePurpose3", str2, "AuthorizePurpose4", str3, "AuthorizePurpose7", str4, "PurposeDiagnostics", str5}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract ImmutableSet c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet d();

    public abstract ImmutableCollection e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.f16778a;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet immutableSetC = c();
        this.f16778a = immutableSetC;
        return immutableSetC;
    }

    public boolean g() {
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract boolean h();

    @Override // java.util.Map
    public int hashCode() {
        return Sets.e(entrySet());
    }

    public UnmodifiableIterator i() {
        final UnmodifiableIterator unmodifiableIteratorJ = entrySet().iterator();
        return new UnmodifiableIterator<Object>() { // from class: com.google.common.collect.ImmutableMap.1
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return unmodifiableIteratorJ.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return ((Map.Entry) unmodifiableIteratorJ.next()).getKey();
            }
        };
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ImmutableSet keySet() {
        ImmutableSet immutableSet = this.f16779b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet immutableSetD = d();
        this.f16779b = immutableSetD;
        return immutableSetD;
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.f16780c;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection immutableCollectionE = e();
        this.f16780c = immutableCollectionE;
        return immutableCollectionE;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return Maps.h(this);
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
