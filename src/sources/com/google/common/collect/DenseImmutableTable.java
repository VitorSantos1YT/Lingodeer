package com.google.common.collect;

import com.google.common.base.Strings;
import com.google.errorprone.annotations.Immutable;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    public final int[] H;
    public final Object[][] K;
    public final int[] L;
    public final int[] M;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableMap f16682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImmutableMap f16683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImmutableMap f16684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImmutableMap f16685f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f16686t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class Column extends ImmutableArrayMap<R, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f16687e;

        public Column(int i11) {
            super(DenseImmutableTable.this.H[i11]);
            this.f16687e = i11;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean h() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object q(int i11) {
            return DenseImmutableTable.this.K[i11][this.f16687e];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap r() {
            return DenseImmutableTable.this.f16682c;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        public ColumnMap() {
            super(DenseImmutableTable.this.H.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean h() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object q(int i11) {
            return new Column(i11);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap r() {
            return DenseImmutableTable.this.f16683d;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f16690d;

        public ImmutableArrayMap(int i11) {
            this.f16690d = i11;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public final ImmutableSet d() {
            return this.f16690d == r().size() ? r().keySet() : new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final Object get(Object obj) {
            Integer num = (Integer) r().get(obj);
            if (num == null) {
                return null;
            }
            return q(num.intValue());
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public final UnmodifiableIterator p() {
            return new AbstractIterator<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f16691c = -1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f16692d;

                {
                    this.f16692d = ImmutableArrayMap.this.r().size();
                }

                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    int i11 = this.f16691c;
                    while (true) {
                        this.f16691c = i11 + 1;
                        int i12 = this.f16691c;
                        if (i12 >= this.f16692d) {
                            this.f16559a = AbstractIterator.State.DONE;
                            return null;
                        }
                        ImmutableArrayMap immutableArrayMap = ImmutableArrayMap.this;
                        Object objQ = immutableArrayMap.q(i12);
                        if (objQ != null) {
                            return new ImmutableEntry(immutableArrayMap.r().keySet().b().get(this.f16691c), objQ);
                        }
                        i11 = this.f16691c;
                    }
                }
            };
        }

        public abstract Object q(int i11);

        public abstract ImmutableMap r();

        @Override // java.util.Map
        public final int size() {
            return this.f16690d;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class Row extends ImmutableArrayMap<C, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f16694e;

        public Row(int i11) {
            super(DenseImmutableTable.this.f16686t[i11]);
            this.f16694e = i11;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean h() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object q(int i11) {
            return DenseImmutableTable.this.K[this.f16694e][i11];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap r() {
            return DenseImmutableTable.this.f16683d;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        public RowMap() {
            super(DenseImmutableTable.this.f16686t.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean h() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object q(int i11) {
            return new Row(i11);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap r() {
            return DenseImmutableTable.this.f16682c;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public DenseImmutableTable(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        this.K = (Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size());
        ImmutableMap immutableMapE = Maps.e(immutableSet);
        this.f16682c = immutableMapE;
        ImmutableMap immutableMapE2 = Maps.e(immutableSet2);
        this.f16683d = immutableMapE2;
        this.f16686t = new int[((RegularImmutableMap) immutableMapE).f17153f];
        this.H = new int[((RegularImmutableMap) immutableMapE2).f17153f];
        RegularImmutableList regularImmutableList = (RegularImmutableList) immutableList;
        int i11 = regularImmutableList.f17149d;
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            Table.Cell cell = (Table.Cell) regularImmutableList.get(i12);
            Object objB = cell.b();
            Object objA = cell.a();
            Integer num = (Integer) this.f16682c.get(objB);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = (Integer) this.f16683d.get(objA);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            Object obj = this.K[iIntValue][iIntValue2];
            Object value = cell.getValue();
            if (!(obj == null)) {
                throw new IllegalArgumentException(Strings.c("Duplicate key: (row=%s, column=%s), values: [%s, %s].", objB, objA, value, obj));
            }
            this.K[iIntValue][iIntValue2] = cell.getValue();
            int[] iArr3 = this.f16686t;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.H;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i12] = iIntValue;
            iArr2[i12] = iIntValue2;
        }
        this.L = iArr;
        this.M = iArr2;
        this.f16684e = new RowMap();
        this.f16685f = new ColumnMap();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final Map f() {
        return ImmutableMap.b(this.f16684e);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap k() {
        return ImmutableMap.b(this.f16685f);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final Object n(Object obj, Object obj2) {
        Integer num = (Integer) this.f16682c.get(obj);
        Integer num2 = (Integer) this.f16683d.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.K[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: o */
    public final ImmutableMap f() {
        return ImmutableMap.b(this.f16684e);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final Table.Cell q(int i11) {
        int i12 = this.L[i11];
        int i13 = this.M[i11];
        E e8 = f().keySet().b().get(i12);
        E e10 = k().keySet().b().get(i13);
        Object obj = this.K[i12][i13];
        Objects.requireNonNull(obj);
        return ImmutableTable.i(e8, e10, obj);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final Object r(int i11) {
        Object obj = this.K[this.L[i11]][this.M[i11]];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return this.L.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    public Object writeReplace() {
        return ImmutableTable.SerializedForm.a(this, this.L, this.M);
    }
}
