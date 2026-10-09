package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ImmutableMap f17150t = new RegularImmutableMap(0, null, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f17151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f17152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f17153f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient ImmutableMap f17154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient Object[] f17155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient int f17156f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final transient int f17157t;

        public EntrySet(ImmutableMap immutableMap, Object[] objArr, int i11, int i12) {
            this.f17154d = immutableMap;
            this.f17155e = objArr;
            this.f17156f = i11;
            this.f17157t = i12;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f17154d.get(key));
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int d(int i11, Object[] objArr) {
            return b().d(i11, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* JADX INFO: renamed from: j */
        public final UnmodifiableIterator iterator() {
            return b().listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList o() {
            return new ImmutableList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public final Object get(int i11) {
                    EntrySet entrySet = EntrySet.this;
                    Preconditions.i(i11, entrySet.f17157t);
                    Object[] objArr = entrySet.f17155e;
                    int i12 = i11 * 2;
                    int i13 = entrySet.f17156f;
                    Object obj = objArr[i12 + i13];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArr[i12 + (i13 ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public final boolean h() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return EntrySet.this.f17157t;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f17157t;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class KeySet<K> extends ImmutableSet<K> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient ImmutableMap f17159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient ImmutableList f17160e;

        public KeySet(ImmutableMap immutableMap, ImmutableList immutableList) {
            this.f17159d = immutableMap;
            this.f17160e = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList b() {
            return this.f17160e;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f17159d.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int d(int i11, Object[] objArr) {
            return this.f17160e.d(i11, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* JADX INFO: renamed from: j */
        public final UnmodifiableIterator iterator() {
            return this.f17160e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f17159d.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient Object[] f17161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient int f17162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f17163e;

        public KeysOrValuesAsList(int i11, int i12, Object[] objArr) {
            this.f17161c = objArr;
            this.f17162d = i11;
            this.f17163e = i12;
        }

        @Override // java.util.List
        public final Object get(int i11) {
            Preconditions.i(i11, this.f17163e);
            Object obj = this.f17161c[(i11 * 2) + this.f17162d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f17163e;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public RegularImmutableMap(int i11, Object obj, Object[] objArr) {
        this.f17151d = obj;
        this.f17152e = objArr;
        this.f17153f = i11;
    }

    public static RegularImmutableMap p(int i11, Object[] objArr, ImmutableMap.Builder builder) {
        if (i11 == 0) {
            return (RegularImmutableMap) f17150t;
        }
        if (i11 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new RegularImmutableMap(1, null, objArr);
        }
        Preconditions.l(i11, objArr.length >> 1);
        Object objQ = q(objArr, i11, ImmutableSet.k(i11), 0);
        if (objQ instanceof Object[]) {
            Object[] objArr2 = (Object[]) objQ;
            ImmutableMap.Builder.DuplicateKey duplicateKey = (ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder == null) {
                throw duplicateKey.a();
            }
            builder.f16784c = duplicateKey;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objQ = obj;
            i11 = iIntValue;
        }
        return new RegularImmutableMap(i11, objQ, objArr);
    }

    public static Object q(Object[] objArr, int i11, int i12, int i13) {
        ImmutableMap.Builder.DuplicateKey duplicateKey = null;
        if (i11 == 1) {
            Objects.requireNonNull(objArr[i13]);
            Objects.requireNonNull(objArr[i13 ^ 1]);
            return null;
        }
        int i14 = i12 - 1;
        int i15 = 0;
        if (i12 <= 128) {
            byte[] bArr = new byte[i12];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            while (i15 < i11) {
                int i17 = (i15 * 2) + i13;
                int i18 = (i16 * 2) + i13;
                Object obj = objArr[i17];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj2);
                int iB = Hashing.b(obj.hashCode());
                while (true) {
                    int i19 = iB & i14;
                    int i21 = bArr[i19] & 255;
                    if (i21 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i16 < i15) {
                            objArr[i18] = obj;
                            objArr[i18 ^ 1] = obj2;
                        }
                        i16++;
                        break;
                    }
                    if (obj.equals(objArr[i21])) {
                        int i22 = i21 ^ 1;
                        Object obj3 = objArr[i22];
                        Objects.requireNonNull(obj3);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj, obj2, obj3);
                        objArr[i22] = obj2;
                        break;
                    }
                    iB = i19 + 1;
                }
                i15++;
            }
            return i16 == i11 ? bArr : new Object[]{bArr, Integer.valueOf(i16), duplicateKey};
        }
        if (i12 <= 32768) {
            short[] sArr = new short[i12];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            while (i15 < i11) {
                int i24 = (i15 * 2) + i13;
                int i25 = (i23 * 2) + i13;
                Object obj4 = objArr[i24];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj5);
                int iB2 = Hashing.b(obj4.hashCode());
                while (true) {
                    int i26 = iB2 & i14;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i23 < i15) {
                            objArr[i25] = obj4;
                            objArr[i25 ^ 1] = obj5;
                        }
                        i23++;
                        break;
                    }
                    if (obj4.equals(objArr[i27])) {
                        int i28 = i27 ^ 1;
                        Object obj6 = objArr[i28];
                        Objects.requireNonNull(obj6);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj4, obj5, obj6);
                        objArr[i28] = obj5;
                        break;
                    }
                    iB2 = i26 + 1;
                }
                i15++;
            }
            return i23 == i11 ? sArr : new Object[]{sArr, Integer.valueOf(i23), duplicateKey};
        }
        int[] iArr = new int[i12];
        Arrays.fill(iArr, -1);
        int i29 = 0;
        while (i15 < i11) {
            int i30 = (i15 * 2) + i13;
            int i31 = (i29 * 2) + i13;
            Object obj7 = objArr[i30];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i30 ^ 1];
            Objects.requireNonNull(obj8);
            int iB3 = Hashing.b(obj7.hashCode());
            while (true) {
                int i32 = iB3 & i14;
                int i33 = iArr[i32];
                if (i33 == -1) {
                    iArr[i32] = i31;
                    if (i29 < i15) {
                        objArr[i31] = obj7;
                        objArr[i31 ^ 1] = obj8;
                    }
                    i29++;
                    break;
                }
                if (obj7.equals(objArr[i33])) {
                    int i34 = i33 ^ 1;
                    Object obj9 = objArr[i34];
                    Objects.requireNonNull(obj9);
                    duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj7, obj8, obj9);
                    objArr[i34] = obj8;
                    break;
                }
                iB3 = i32 + 1;
            }
            i15++;
        }
        return i29 == i11 ? iArr : new Object[]{iArr, Integer.valueOf(i29), duplicateKey};
    }

    public static Object r(Object obj, Object[] objArr, int i11, int i12, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i11 == 1) {
            Object obj3 = objArr[i12];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = Hashing.b(obj2.hashCode());
            while (true) {
                int i13 = iB & length;
                int i14 = bArr[i13] & 255;
                if (i14 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                iB = i13 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = Hashing.b(obj2.hashCode());
            while (true) {
                int i15 = iB2 & length2;
                int i16 = sArr[i15] & 65535;
                if (i16 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i16])) {
                    return objArr[i16 ^ 1];
                }
                iB2 = i15 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = Hashing.b(obj2.hashCode());
            while (true) {
                int i17 = iB3 & length3;
                int i18 = iArr[i17];
                if (i18 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i18])) {
                    return objArr[i18 ^ 1];
                }
                iB3 = i17 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet c() {
        return new EntrySet(this, this.f17152e, 0, this.f17153f);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet d() {
        return new KeySet(this, new KeysOrValuesAsList(0, this.f17153f, this.f17152e));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection e() {
        return new KeysOrValuesAsList(1, this.f17153f, this.f17152e);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        Object objR = r(this.f17151d, this.f17152e, this.f17153f, 0, obj);
        if (objR == null) {
            return null;
        }
        return objR;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean h() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f17153f;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }
}
