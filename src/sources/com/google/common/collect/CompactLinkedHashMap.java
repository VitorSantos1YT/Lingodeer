package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    public transient long[] M;
    public transient int N;
    public transient int O;

    public CompactLinkedHashMap() {
        super(3);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int b(int i11, int i12) {
        return i11 >= size() ? i12 : i11;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int c() {
        int iC = super.c();
        this.M = new long[iC];
        return iC;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (o()) {
            return;
        }
        this.N = -2;
        this.O = -2;
        long[] jArr = this.M;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    public final Map d() {
        Map mapD = super.d();
        this.M = null;
        return mapD;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final LinkedHashMap e(int i11) {
        return new LinkedHashMap(i11, 1.0f, false);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int g() {
        return this.N;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int h(int i11) {
        return ((int) v()[i11]) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void l(int i11) {
        super.l(i11);
        this.N = -2;
        this.O = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void m(int i11, Object obj, Object obj2, int i12, int i13) {
        super.m(i11, obj, obj2, i12, i13);
        w(this.O, i11);
        w(i11, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void n(int i11, int i12) {
        int size = size() - 1;
        super.n(i11, i12);
        w(((int) (v()[i11] >>> 32)) - 1, h(i11));
        if (i11 < size) {
            w(((int) (v()[size] >>> 32)) - 1, i11);
            w(i11, h(size));
        }
        v()[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void t(int i11) {
        super.t(i11);
        this.M = Arrays.copyOf(v(), i11);
    }

    public final long[] v() {
        long[] jArr = this.M;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void w(int i11, int i12) {
        if (i11 == -2) {
            this.N = i12;
        } else {
            v()[i11] = (v()[i11] & (-4294967296L)) | (((long) (i12 + 1)) & 4294967295L);
        }
        if (i12 == -2) {
            this.O = i11;
        } else {
            v()[i12] = (4294967295L & v()[i12]) | (((long) (i11 + 1)) << 32);
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void a(int i11) {
    }
}
