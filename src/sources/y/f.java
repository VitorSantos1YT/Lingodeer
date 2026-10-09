package y;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Collection, Set, gz.b, gz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f56689a = z.a.f58407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f56690b = z.a.f58409c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56691c;

    public f(int i11) {
        if (i11 > 0) {
            s.b(this, i11);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i11;
        int iC;
        int i12 = this.f56691c;
        if (obj == null) {
            iC = s.c(this, null, 0);
            i11 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i11 = iHashCode;
            iC = s.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i13 = ~iC;
        int[] iArr = this.f56689a;
        if (i12 >= iArr.length) {
            int i14 = 8;
            if (i12 >= 8) {
                i14 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i14 = 4;
            }
            Object[] objArr = this.f56690b;
            int[] iArr2 = new int[i14];
            this.f56689a = iArr2;
            this.f56690b = new Object[i14];
            if (i12 != this.f56691c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                ry.l.L(0, iArr.length, iArr, iArr2, 6);
                ry.l.K(0, objArr.length, 6, objArr, this.f56690b);
            }
        }
        if (i13 < i12) {
            int[] iArr3 = this.f56689a;
            int i15 = i13 + 1;
            ry.l.H(i15, i13, iArr3, iArr3, i12);
            Object[] objArr2 = this.f56690b;
            ry.l.G(i15, i13, i12, objArr2, objArr2);
        }
        int i16 = this.f56691c;
        if (i12 == i16) {
            int[] iArr4 = this.f56689a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i11;
                this.f56690b[i13] = obj;
                this.f56691c = i16 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        int size = elements.size() + this.f56691c;
        int i11 = this.f56691c;
        int[] iArr = this.f56689a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f56690b;
            int[] iArr2 = new int[size];
            this.f56689a = iArr2;
            this.f56690b = new Object[size];
            if (i11 > 0) {
                ry.l.L(0, i11, iArr, iArr2, 6);
                ry.l.K(0, this.f56691c, 6, objArr, this.f56690b);
            }
        }
        if (this.f56691c != i11) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i11) {
        int i12 = this.f56691c;
        Object[] objArr = this.f56690b;
        Object obj = objArr[i11];
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f56689a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i11 < i13) {
                int i14 = i11 + 1;
                ry.l.H(i11, i14, iArr, iArr, i12);
                Object[] objArr2 = this.f56690b;
                ry.l.G(i11, i14, i12, objArr2, objArr2);
            }
            this.f56690b[i13] = null;
        } else {
            int i15 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArr2 = new int[i15];
            this.f56689a = iArr2;
            this.f56690b = new Object[i15];
            if (i11 > 0) {
                ry.l.L(0, i11, iArr, iArr2, 6);
                ry.l.K(0, i11, 6, objArr, this.f56690b);
            }
            if (i11 < i13) {
                int i16 = i11 + 1;
                ry.l.H(i11, i16, iArr, this.f56689a, i12);
                ry.l.G(i11, i16, i12, objArr, this.f56690b);
            }
        }
        if (i12 != this.f56691c) {
            throw new ConcurrentModificationException();
        }
        this.f56691c = i13;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f56691c != 0) {
            this.f56689a = z.a.f58407a;
            this.f56690b = z.a.f58409c;
            this.f56691c = 0;
        }
        if (this.f56691c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? s.c(this, null, 0) : s.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f56691c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i11 = this.f56691c;
            for (int i12 = 0; i12 < i11; i12++) {
                if (!((Set) obj).contains(this.f56690b[i12])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f56689a;
        int i11 = this.f56691c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += iArr[i13];
        }
        return i12;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f56691c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? s.c(this, null, 0) : s.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        b(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        boolean z11 = false;
        for (int i11 = this.f56691c - 1; -1 < i11; i11--) {
            if (!ry.m.i0(elements, this.f56690b[i11])) {
                b(i11);
                z11 = true;
            }
        }
        return z11;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f56691c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ry.l.N(0, this.f56691c, this.f56690b);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f56691c * 14);
        sb2.append('{');
        int i11 = this.f56691c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f56690b[i12];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.f(array, "array");
        int i11 = this.f56691c;
        if (array.length < i11) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i11);
        } else if (array.length > i11) {
            array[i11] = null;
        }
        ry.l.G(0, 0, this.f56691c, this.f56690b, array);
        return array;
    }
}
