package ry;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f50832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50835d;

    public b0(int i11, Object[] objArr) {
        this.f50832a = objArr;
        if (i11 < 0) {
            throw new IllegalArgumentException(nv.p.j(i11, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i11 <= objArr.length) {
            this.f50833b = objArr.length;
            this.f50835d = i11;
        } else {
            StringBuilder sbI = w4.c.i(i11, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbI.append(objArr.length);
            throw new IllegalArgumentException(sbI.toString().toString());
        }
    }

    @Override // ry.a
    public final int b() {
        return this.f50835d;
    }

    public final void d(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(nv.p.j(i11, "n shouldn't be negative but it is ").toString());
        }
        if (i11 > this.f50835d) {
            StringBuilder sbI = w4.c.i(i11, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbI.append(this.f50835d);
            throw new IllegalArgumentException(sbI.toString().toString());
        }
        if (i11 > 0) {
            int i12 = this.f50834c;
            int i13 = this.f50833b;
            int i14 = (i12 + i11) % i13;
            Object[] objArr = this.f50832a;
            if (i12 > i14) {
                Arrays.fill(objArr, i12, i13, (Object) null);
                Arrays.fill(objArr, 0, i14, (Object) null);
            } else {
                Arrays.fill(objArr, i12, i14, (Object) null);
            }
            this.f50834c = i14;
            this.f50835d -= i11;
        }
    }

    @Override // java.util.List
    public final Object get(int i11) {
        int iB = b();
        if (i11 < 0 || i11 >= iB) {
            throw new IndexOutOfBoundsException(nv.p.p("index: ", i11, iB, ", size: "));
        }
        return this.f50832a[(this.f50834c + i11) % this.f50833b];
    }

    @Override // ry.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new a0(this);
    }

    @Override // ry.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // ry.a, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.m.f(array, "array");
        int length = array.length;
        int i11 = this.f50835d;
        if (length < i11) {
            array = Arrays.copyOf(array, i11);
            kotlin.jvm.internal.m.e(array, "copyOf(...)");
        }
        int i12 = this.f50835d;
        int i13 = this.f50834c;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            objArr = this.f50832a;
            if (i15 >= i12 || i13 >= this.f50833b) {
                break;
            }
            array[i15] = objArr[i13];
            i15++;
            i13++;
        }
        while (i15 < i12) {
            array[i15] = objArr[i14];
            i15++;
            i14++;
        }
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }
}
