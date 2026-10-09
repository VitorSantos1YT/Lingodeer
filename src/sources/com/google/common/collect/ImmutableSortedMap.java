package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class ImmutableSortedMap<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ImmutableSortedMap f16849t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient RegularImmutableSortedSet f16850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient ImmutableList f16851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient ImmutableSortedMap f16852f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient Object[] f16855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public transient Object[] f16856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Comparator f16857f;

        public Builder(Comparator comparator) {
            comparator.getClass();
            this.f16857f = comparator;
            this.f16855d = new Object[4];
            this.f16856e = new Object[4];
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder c(Object obj, Object obj2) {
            int i11 = this.f16783b + 1;
            Object[] objArr = this.f16855d;
            if (i11 > objArr.length) {
                int iB = ImmutableCollection.Builder.b(objArr.length, i11);
                this.f16855d = Arrays.copyOf(this.f16855d, iB);
                this.f16856e = Arrays.copyOf(this.f16856e, iB);
            }
            CollectPreconditions.a(obj, obj2);
            Object[] objArr2 = this.f16855d;
            int i12 = this.f16783b;
            objArr2[i12] = obj;
            this.f16856e[i12] = obj2;
            this.f16783b = i12 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder d(Iterable iterable) {
            super.d(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder e(Map map) {
            super.e(map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap b() {
            int i11 = this.f16783b;
            Comparator comparator = this.f16857f;
            if (i11 == 0) {
                return ImmutableSortedMap.p(comparator);
            }
            if (i11 == 1) {
                Object obj = this.f16855d[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f16856e[0];
                Objects.requireNonNull(obj2);
                ImmutableList immutableListU = ImmutableList.u(obj);
                comparator.getClass();
                return new ImmutableSortedMap(new RegularImmutableSortedSet(immutableListU, comparator), ImmutableList.u(obj2), null);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f16855d, i11);
            Arrays.sort(objArrCopyOf, comparator);
            int i12 = this.f16783b;
            Object[] objArr = new Object[i12];
            for (int i13 = 0; i13 < this.f16783b; i13++) {
                if (i13 > 0) {
                    int i14 = i13 - 1;
                    if (comparator.compare(objArrCopyOf[i14], objArrCopyOf[i13]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i14] + OCBJEWZHh.VDMvSriBacv + objArrCopyOf[i13]);
                    }
                }
                Object obj3 = this.f16855d[i13];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator);
                Object obj4 = this.f16856e[i13];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.k(objArrCopyOf.length, objArrCopyOf), comparator), ImmutableList.k(i12, objArr), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Comparator f16858c;

        public SerializedForm(ImmutableSortedMap immutableSortedMap) {
            super(immutableSortedMap);
            this.f16858c = immutableSortedMap.f16850d.f16869d;
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public final ImmutableMap.Builder a(int i11) {
            return new Builder(this.f16858c);
        }
    }

    static {
        RegularImmutableSortedSet regularImmutableSortedSetZ = ImmutableSortedSet.z(NaturalOrdering.f17113c);
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        f16849t = new ImmutableSortedMap(regularImmutableSortedSetZ, RegularImmutableList.f17147e, null);
    }

    public ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList, ImmutableSortedMap immutableSortedMap) {
        this.f16850d = regularImmutableSortedSet;
        this.f16851e = immutableList;
        this.f16852f = immutableSortedMap;
    }

    public static ImmutableSortedMap p(Comparator comparator) {
        return NaturalOrdering.f17113c.equals(comparator) ? f16849t : new ImmutableSortedMap(ImmutableSortedSet.z(comparator), RegularImmutableList.f17147e, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet c() {
        if (!isEmpty()) {
            return new ImmutableMapEntrySet<Object, Object>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
                /* JADX INFO: renamed from: j */
                public final UnmodifiableIterator iterator() {
                    return b().listIterator(0);
                }

                @Override // com.google.common.collect.ImmutableSet
                public final ImmutableList o() {
                    return new ImmutableList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                        @Override // java.util.List
                        public final Object get(int i11) {
                            C1EntrySet c1EntrySet = C1EntrySet.this;
                            return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.f16850d.f17176f.get(i11), ImmutableSortedMap.this.f16851e.get(i11));
                        }

                        @Override // com.google.common.collect.ImmutableCollection
                        public final boolean h() {
                            return true;
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public final int size() {
                            return ImmutableSortedMap.this.f16851e.size();
                        }

                        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                        public Object writeReplace() {
                            return super.writeReplace();
                        }
                    };
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet
                public final ImmutableMap u() {
                    return ImmutableSortedMap.this;
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }
        int i11 = ImmutableSet.f16842c;
        return RegularImmutableSet.L;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return Maps.f(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f16850d.f16869d;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet d() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return this.f16850d.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        ImmutableSortedMap immutableSortedMap = this.f16852f;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        boolean zIsEmpty = isEmpty();
        RegularImmutableSortedSet regularImmutableSortedSet = this.f16850d;
        return zIsEmpty ? p(Ordering.b(regularImmutableSortedSet.f16869d).g()) : new ImmutableSortedMap((RegularImmutableSortedSet) regularImmutableSortedSet.descendingSet(), this.f16851e.x(), this);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection e() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().b().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f16850d.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return Maps.f(floorEntry(obj));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        RegularImmutableSortedSet regularImmutableSortedSet = this.f16850d;
        regularImmutableSortedSet.getClass();
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(regularImmutableSortedSet.f17176f, obj, regularImmutableSortedSet.f16869d);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f16851e.get(iBinarySearch);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean h() {
        return this.f16850d.f17176f.h() || this.f16851e.h();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return Maps.f(higherEntry(obj));
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: j */
    public final ImmutableSet keySet() {
        return this.f16850d;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set keySet() {
        return this.f16850d;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().b().get(this.f16851e.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f16850d.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return Maps.f(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.f16850d;
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: o */
    public final ImmutableCollection values() {
        return this.f16851e;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final ImmutableSortedMap q(int i11, int i12) {
        ImmutableList immutableList = this.f16851e;
        if (i11 == 0 && i12 == immutableList.size()) {
            return this;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = this.f16850d;
        return i11 == i12 ? p(regularImmutableSortedSet.f16869d) : new ImmutableSortedMap(regularImmutableSortedSet.R(i11, i12), immutableList.subList(i11, i12), null);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap headMap(Object obj, boolean z11) {
        obj.getClass();
        return q(0, this.f16850d.T(obj, z11));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
        obj.getClass();
        obj2.getClass();
        Preconditions.h(this.f16850d.f16869d.compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z12).tailMap(obj, z11);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f16851e.size();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap tailMap(Object obj, boolean z11) {
        obj.getClass();
        return q(this.f16850d.W(obj, z11), this.f16851e.size());
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public final Collection values() {
        return this.f16851e;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
