package com.google.common.collect;

import com.google.common.base.Strings;
import com.google.errorprone.annotations.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ImmutableTable f17202t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableMap f17203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImmutableMap f17204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f17205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f17206f;

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList immutableList = RegularImmutableList.f17147e;
        int i11 = ImmutableSet.f16842c;
        RegularImmutableSet regularImmutableSet = RegularImmutableSet.L;
        f17202t = new SparseImmutableTable(immutableList, regularImmutableSet, regularImmutableSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparseImmutableTable(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        ImmutableMap immutableMapE = Maps.e(immutableSet);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UnmodifiableIterator it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        UnmodifiableIterator it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        int i11 = 0;
        while (true) {
            if (i11 >= immutableList.size()) {
                this.f17205e = iArr;
                this.f17206f = iArr2;
                ImmutableMap.Builder builder = new ImmutableMap.Builder(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    builder.c(entry.getKey(), ImmutableMap.b((Map) entry.getValue()));
                }
                this.f17203c = builder.a(true);
                ImmutableMap.Builder builder2 = new ImmutableMap.Builder(linkedHashMap2.size());
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    builder2.c(entry2.getKey(), ImmutableMap.b((Map) entry2.getValue()));
                }
                this.f17204d = builder2.a(true);
                return;
            }
            Table.Cell cell = (Table.Cell) immutableList.get(i11);
            Object objB = cell.b();
            Object objA = cell.a();
            Object value = cell.getValue();
            Integer num = (Integer) ((RegularImmutableMap) immutableMapE).get(objB);
            Objects.requireNonNull(num);
            iArr[i11] = num.intValue();
            Map map = (Map) linkedHashMap.get(objB);
            Objects.requireNonNull(map);
            iArr2[i11] = map.size();
            Object objPut = map.put(objA, value);
            if (!(objPut == null)) {
                throw new IllegalArgumentException(Strings.c("Duplicate key: (row=%s, column=%s), values: [%s, %s].", objB, objA, value, objPut));
            }
            Map map2 = (Map) linkedHashMap2.get(objA);
            Objects.requireNonNull(map2);
            map2.put(objB, value);
            i11++;
        }
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final Map f() {
        return ImmutableMap.b(this.f17203c);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap k() {
        return ImmutableMap.b(this.f17204d);
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: o */
    public final ImmutableMap f() {
        return ImmutableMap.b(this.f17203c);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final Table.Cell q(int i11) {
        Map.Entry entry = (Map.Entry) this.f17203c.entrySet().b().get(this.f17205e[i11]);
        ImmutableMap immutableMap = (ImmutableMap) entry.getValue();
        Map.Entry entry2 = (Map.Entry) immutableMap.entrySet().b().get(this.f17206f[i11]);
        return ImmutableTable.i(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RegularImmutableTable
    public final Object r(int i11) {
        ImmutableMap immutableMap = (ImmutableMap) this.f17203c.values().b().get(this.f17205e[i11]);
        return immutableMap.values().b().get(this.f17206f[i11]);
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return this.f17205e.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    public Object writeReplace() {
        ImmutableMap immutableMapE = Maps.e(k().keySet());
        int[] iArr = new int[j().size()];
        UnmodifiableIterator it = j().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) ((RegularImmutableMap) immutableMapE).get(((Table.Cell) it.next()).a());
            Objects.requireNonNull(num);
            iArr[i11] = num.intValue();
            i11++;
        }
        return ImmutableTable.SerializedForm.a(this, this.f17205e, iArr);
    }
}
