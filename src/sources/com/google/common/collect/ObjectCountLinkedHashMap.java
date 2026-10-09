package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient long[] f17129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient int f17130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient int f17131k;

    public ObjectCountLinkedHashMap() {
        this(0);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void a() {
        super.a();
        this.f17130j = -2;
        this.f17131k = -2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final int c() {
        int i11 = this.f17130j;
        if (i11 == -2) {
            return -1;
        }
        return i11;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void h(int i11) {
        super.h(i11);
        this.f17130j = -2;
        this.f17131k = -2;
        long[] jArr = new long[i11];
        this.f17129i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void i(Object obj, int i11, int i12, int i13) {
        super.i(obj, i11, i12, i13);
        r(this.f17131k, i11);
        r(i11, -2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void j(int i11) {
        int i12 = this.f17120c - 1;
        long j11 = this.f17129i[i11];
        r((int) (j11 >>> 32), (int) j11);
        if (i11 < i12) {
            r((int) (this.f17129i[i12] >>> 32), i11);
            r(i11, (int) this.f17129i[i12]);
        }
        super.j(i11);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final int k(int i11) {
        int i12 = (int) this.f17129i[i11];
        if (i12 == -2) {
            return -1;
        }
        return i12;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final int l(int i11, int i12) {
        return i11 == this.f17120c ? i12 : i11;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void p(int i11) {
        super.p(i11);
        long[] jArr = this.f17129i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i11);
        this.f17129i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i11, -1L);
    }

    public final void r(int i11, int i12) {
        if (i11 == -2) {
            this.f17130j = i12;
        } else {
            long[] jArr = this.f17129i;
            jArr[i11] = (jArr[i11] & (-4294967296L)) | (((long) i12) & 4294967295L);
        }
        if (i12 == -2) {
            this.f17131k = i11;
        } else {
            long[] jArr2 = this.f17129i;
            jArr2[i12] = (4294967295L & jArr2[i12]) | (((long) i11) << 32);
        }
    }

    public ObjectCountLinkedHashMap(int i11) {
        super(3, 0);
    }
}
