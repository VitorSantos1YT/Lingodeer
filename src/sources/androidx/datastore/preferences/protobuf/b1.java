package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends b implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b1 f1449d = new b1(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f1450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1451c;

    public b1(Object[] objArr, int i11, boolean z11) {
        this.f1448a = z11;
        this.f1450b = objArr;
        this.f1451c = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i11 = this.f1451c;
        Object[] objArr = this.f1450b;
        if (i11 == objArr.length) {
            this.f1450b = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1450b;
        int i12 = this.f1451c;
        this.f1451c = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f1451c) {
            StringBuilder sbI = w4.c.i(i11, "Index:", ", Size:");
            sbI.append(this.f1451c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
    }

    public final b1 e(int i11) {
        if (i11 >= this.f1451c) {
            return new b1(Arrays.copyOf(this.f1450b, i11), this.f1451c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        d(i11);
        return this.f1450b[i11];
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        b();
        d(i11);
        Object[] objArr = this.f1450b;
        Object obj = objArr[i11];
        int i12 = this.f1451c;
        if (i11 < i12 - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (i12 - i11) - 1);
        }
        this.f1451c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        b();
        d(i11);
        Object[] objArr = this.f1450b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1451c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        b();
        if (i11 >= 0 && i11 <= (i12 = this.f1451c)) {
            Object[] objArr = this.f1450b;
            if (i12 < objArr.length) {
                System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
            } else {
                Object[] objArr2 = new Object[defpackage.e.D(i12, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(this.f1450b, i11, objArr2, i11 + 1, this.f1451c - i11);
                this.f1450b = objArr2;
            }
            this.f1450b[i11] = obj;
            this.f1451c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbI = w4.c.i(i11, "Index:", ", Size:");
        sbI.append(this.f1451c);
        throw new IndexOutOfBoundsException(sbI.toString());
    }
}
