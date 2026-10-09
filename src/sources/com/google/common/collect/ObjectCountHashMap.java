package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class ObjectCountHashMap<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object[] f17118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f17119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f17120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f17121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int[] f17122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient long[] f17123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient float f17124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f17125h;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class MapEntry extends Multisets.AbstractEntry<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f17126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17127b;

        public MapEntry(int i11) {
            this.f17126a = ObjectCountHashMap.this.f17118a[i11];
            this.f17127b = i11;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final Object a() {
            return this.f17126a;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            int i11 = this.f17127b;
            Object obj = this.f17126a;
            ObjectCountHashMap objectCountHashMap = ObjectCountHashMap.this;
            if (i11 == -1 || i11 >= objectCountHashMap.f17120c || !Objects.a(obj, objectCountHashMap.f17118a[i11])) {
                this.f17127b = objectCountHashMap.g(obj);
            }
            int i12 = this.f17127b;
            if (i12 == -1) {
                return 0;
            }
            return objectCountHashMap.f17119b[i12];
        }
    }

    public ObjectCountHashMap() {
        h(3);
    }

    public void a() {
        this.f17121d++;
        Arrays.fill(this.f17118a, 0, this.f17120c, (Object) null);
        Arrays.fill(this.f17119b, 0, this.f17120c, 0);
        Arrays.fill(this.f17122e, -1);
        Arrays.fill(this.f17123f, -1L);
        this.f17120c = 0;
    }

    public final void b(int i11) {
        if (i11 > this.f17123f.length) {
            p(i11);
        }
        if (i11 >= this.f17125h) {
            q(Math.max(2, Integer.highestOneBit(i11 - 1) << 1));
        }
    }

    public int c() {
        return this.f17120c == 0 ? -1 : 0;
    }

    public final int d(Object obj) {
        int iG = g(obj);
        if (iG == -1) {
            return 0;
        }
        return this.f17119b[iG];
    }

    public final Object e(int i11) {
        Preconditions.i(i11, this.f17120c);
        return this.f17118a[i11];
    }

    public final int f(int i11) {
        Preconditions.i(i11, this.f17120c);
        return this.f17119b[i11];
    }

    public final int g(Object obj) {
        int iC = Hashing.c(obj);
        int[] iArr = this.f17122e;
        int i11 = iArr[(iArr.length - 1) & iC];
        while (i11 != -1) {
            long j11 = this.f17123f[i11];
            if (((int) (j11 >>> 32)) == iC && Objects.a(obj, this.f17118a[i11])) {
                return i11;
            }
            i11 = (int) j11;
        }
        return -1;
    }

    public void h(int i11) {
        Preconditions.e("Initial capacity must be non-negative", i11 >= 0);
        int iA = Hashing.a(i11, 1.0f);
        int[] iArr = new int[iA];
        Arrays.fill(iArr, -1);
        this.f17122e = iArr;
        this.f17124g = 1.0f;
        this.f17118a = new Object[i11];
        this.f17119b = new int[i11];
        long[] jArr = new long[i11];
        Arrays.fill(jArr, -1L);
        this.f17123f = jArr;
        this.f17125h = Math.max(1, (int) (iA * 1.0f));
    }

    public void i(Object obj, int i11, int i12, int i13) {
        this.f17123f[i11] = (((long) i13) << 32) | 4294967295L;
        this.f17118a[i11] = obj;
        this.f17119b[i11] = i12;
    }

    public void j(int i11) {
        int i12 = this.f17120c - 1;
        if (i11 >= i12) {
            this.f17118a[i11] = null;
            this.f17119b[i11] = 0;
            this.f17123f[i11] = -1;
            return;
        }
        Object[] objArr = this.f17118a;
        objArr[i11] = objArr[i12];
        int[] iArr = this.f17119b;
        iArr[i11] = iArr[i12];
        objArr[i12] = null;
        iArr[i12] = 0;
        long[] jArr = this.f17123f;
        long j11 = jArr[i12];
        jArr[i11] = j11;
        jArr[i12] = -1;
        int[] iArr2 = this.f17122e;
        int length = ((int) (j11 >>> 32)) & (iArr2.length - 1);
        int i13 = iArr2[length];
        if (i13 == i12) {
            iArr2[length] = i11;
            return;
        }
        while (true) {
            long[] jArr2 = this.f17123f;
            long j12 = jArr2[i13];
            int i14 = (int) j12;
            if (i14 == i12) {
                jArr2[i13] = (j12 & (-4294967296L)) | (4294967295L & ((long) i11));
                return;
            }
            i13 = i14;
        }
    }

    public int k(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.f17120c) {
            return i12;
        }
        return -1;
    }

    public int l(int i11, int i12) {
        return i11 - 1;
    }

    public final int m(int i11, Object obj) {
        CollectPreconditions.c(i11, "count");
        long[] jArr = this.f17123f;
        Object[] objArr = this.f17118a;
        int[] iArr = this.f17119b;
        int iC = Hashing.c(obj);
        int[] iArr2 = this.f17122e;
        int length = (iArr2.length - 1) & iC;
        int i12 = this.f17120c;
        int i13 = iArr2[length];
        if (i13 == -1) {
            iArr2[length] = i12;
        } else {
            while (true) {
                long j11 = jArr[i13];
                if (((int) (j11 >>> 32)) == iC && Objects.a(obj, objArr[i13])) {
                    int i14 = iArr[i13];
                    iArr[i13] = i11;
                    return i14;
                }
                int i15 = (int) j11;
                if (i15 == -1) {
                    jArr[i13] = ((-4294967296L) & j11) | (4294967295L & ((long) i12));
                    break;
                }
                i13 = i15;
            }
        }
        if (i12 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i16 = i12 + 1;
        int length2 = this.f17123f.length;
        if (i16 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            int i17 = iMax >= 0 ? iMax : Integer.MAX_VALUE;
            if (i17 != length2) {
                p(i17);
            }
        }
        i(obj, i12, i11, iC);
        this.f17120c = i16;
        if (i12 >= this.f17125h) {
            q(this.f17122e.length * 2);
        }
        this.f17121d++;
        return 0;
    }

    public final int n(int i11, Object obj) {
        int[] iArr = this.f17122e;
        int length = (iArr.length - 1) & i11;
        int i12 = iArr[length];
        if (i12 == -1) {
            return 0;
        }
        int i13 = -1;
        while (true) {
            if (((int) (this.f17123f[i12] >>> 32)) == i11 && Objects.a(obj, this.f17118a[i12])) {
                int i14 = this.f17119b[i12];
                if (i13 == -1) {
                    this.f17122e[length] = (int) this.f17123f[i12];
                } else {
                    long[] jArr = this.f17123f;
                    jArr[i13] = (jArr[i13] & (-4294967296L)) | (((long) ((int) jArr[i12])) & 4294967295L);
                }
                j(i12);
                this.f17120c--;
                this.f17121d++;
                return i14;
            }
            int i15 = (int) this.f17123f[i12];
            if (i15 == -1) {
                return 0;
            }
            i13 = i12;
            i12 = i15;
        }
    }

    public final int o(int i11) {
        return n((int) (this.f17123f[i11] >>> 32), this.f17118a[i11]);
    }

    public void p(int i11) {
        this.f17118a = Arrays.copyOf(this.f17118a, i11);
        this.f17119b = Arrays.copyOf(this.f17119b, i11);
        long[] jArr = this.f17123f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i11);
        if (i11 > length) {
            Arrays.fill(jArrCopyOf, length, i11, -1L);
        }
        this.f17123f = jArrCopyOf;
    }

    public final void q(int i11) {
        if (this.f17122e.length >= 1073741824) {
            this.f17125h = Integer.MAX_VALUE;
            return;
        }
        int i12 = ((int) (i11 * this.f17124g)) + 1;
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f17123f;
        int i13 = i11 - 1;
        for (int i14 = 0; i14 < this.f17120c; i14++) {
            int i15 = (int) (jArr[i14] >>> 32);
            int i16 = i15 & i13;
            int i17 = iArr[i16];
            iArr[i16] = i14;
            jArr[i14] = (((long) i15) << 32) | (((long) i17) & 4294967295L);
        }
        this.f17125h = i12;
        this.f17122e = iArr;
    }

    public ObjectCountHashMap(int i11, int i12) {
        h(i11);
    }
}
