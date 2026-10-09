package y;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f56765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f56766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56767c;

    public t0(int i11) {
        this.f56765a = i11 == 0 ? z.a.f58407a : new int[i11];
        this.f56766b = i11 == 0 ? z.a.f58409c : new Object[i11 << 1];
    }

    public final int a(Object obj) {
        int i11 = this.f56767c * 2;
        Object[] objArr = this.f56766b;
        if (obj == null) {
            for (int i12 = 1; i12 < i11; i12 += 2) {
                if (objArr[i12] == null) {
                    return i12 >> 1;
                }
            }
            return -1;
        }
        for (int i13 = 1; i13 < i11; i13 += 2) {
            if (obj.equals(objArr[i13])) {
                return i13 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i11) {
        int i12 = this.f56767c;
        int[] iArr = this.f56765a;
        if (iArr.length < i11) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(...)");
            this.f56765a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f56766b, i11 * 2);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            this.f56766b = objArrCopyOf;
        }
        if (this.f56767c != i12) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i11, Object obj) {
        int i12 = this.f56767c;
        if (i12 == 0) {
            return -1;
        }
        int iA = z.a.a(i12, i11, this.f56765a);
        if (iA < 0 || kotlin.jvm.internal.m.a(obj, this.f56766b[iA << 1])) {
            return iA;
        }
        int i13 = iA + 1;
        while (i13 < i12 && this.f56765a[i13] == i11) {
            if (kotlin.jvm.internal.m.a(obj, this.f56766b[i13 << 1])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = iA - 1; i14 >= 0 && this.f56765a[i14] == i11; i14--) {
            if (kotlin.jvm.internal.m.a(obj, this.f56766b[i14 << 1])) {
                return i14;
            }
        }
        return ~i13;
    }

    public void clear() {
        if (this.f56767c > 0) {
            this.f56765a = z.a.f58407a;
            this.f56766b = z.a.f58409c;
            this.f56767c = 0;
        }
        if (this.f56767c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i11 = this.f56767c;
        if (i11 == 0) {
            return -1;
        }
        int iA = z.a.a(i11, 0, this.f56765a);
        if (iA < 0 || this.f56766b[iA << 1] == null) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f56765a[i12] == 0) {
            if (this.f56766b[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f56765a[i13] == 0; i13--) {
            if (this.f56766b[i13 << 1] == null) {
                return i13;
            }
        }
        return ~i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof t0) {
                int i11 = this.f56767c;
                if (i11 != ((t0) obj).f56767c) {
                    return false;
                }
                t0 t0Var = (t0) obj;
                for (int i12 = 0; i12 < i11; i12++) {
                    Object objF = f(i12);
                    Object objJ = j(i12);
                    Object obj2 = t0Var.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !t0Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f56767c != ((Map) obj).size()) {
                return false;
            }
            int i13 = this.f56767c;
            for (int i14 = 0; i14 < i13; i14++) {
                Object objF2 = f(i14);
                Object objJ2 = j(i14);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f56767c) {
            z11 = true;
        }
        if (z11) {
            return this.f56766b[i11 << 1];
        }
        z.a.c("Expected index to be within 0..size()-1, but was " + i11);
        throw null;
    }

    public void g(e eVar) {
        int i11 = eVar.f56767c;
        b(this.f56767c + i11);
        if (this.f56767c != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                put(eVar.f(i12), eVar.j(i12));
            }
        } else if (i11 > 0) {
            ry.l.H(0, 0, eVar.f56765a, this.f56765a, i11);
            ry.l.G(0, 0, i11 << 1, eVar.f56766b, this.f56766b);
            this.f56767c = i11;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f56766b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f56766b[(iD << 1) + 1] : obj2;
    }

    public Object h(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f56767c)) {
            z.a.c("Expected index to be within 0..size()-1, but was " + i11);
            throw null;
        }
        Object[] objArr = this.f56766b;
        int i13 = i11 << 1;
        Object obj = objArr[i13 + 1];
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i14 = i12 - 1;
        int[] iArr = this.f56765a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i11 < i14) {
                int i15 = i11 + 1;
                ry.l.H(i11, i15, iArr, iArr, i12);
                Object[] objArr2 = this.f56766b;
                ry.l.G(i13, i15 << 1, i12 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f56766b;
            int i16 = i14 << 1;
            objArr3[i16] = null;
            objArr3[i16 + 1] = null;
        } else {
            int i17 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i17);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(...)");
            this.f56765a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f56766b, i17 << 1);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            this.f56766b = objArrCopyOf;
            if (i12 != this.f56767c) {
                throw new ConcurrentModificationException();
            }
            if (i11 > 0) {
                ry.l.H(0, 0, iArr, this.f56765a, i11);
                ry.l.G(0, 0, i13, objArr, this.f56766b);
            }
            if (i11 < i14) {
                int i18 = i11 + 1;
                ry.l.H(i11, i18, iArr, this.f56765a, i12);
                ry.l.G(i13, i18 << 1, i12 << 1, objArr, this.f56766b);
            }
        }
        if (i12 != this.f56767c) {
            throw new ConcurrentModificationException();
        }
        this.f56767c = i14;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f56765a;
        Object[] objArr = this.f56766b;
        int i11 = this.f56767c;
        int i12 = 1;
        int i13 = 0;
        int iHashCode = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i13];
            i13++;
            i12 += 2;
        }
        return iHashCode;
    }

    public Object i(int i11, Object obj) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f56767c) {
            z11 = true;
        }
        if (!z11) {
            z.a.c("Expected index to be within 0..size()-1, but was " + i11);
            throw null;
        }
        int i12 = (i11 << 1) + 1;
        Object[] objArr = this.f56766b;
        Object obj2 = objArr[i12];
        objArr[i12] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f56767c <= 0;
    }

    public final Object j(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f56767c) {
            z11 = true;
        }
        if (z11) {
            return this.f56766b[(i11 << 1) + 1];
        }
        z.a.c("Expected index to be within 0..size()-1, but was " + i11);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i11 = this.f56767c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i12 = (iC << 1) + 1;
            Object[] objArr = this.f56766b;
            Object obj3 = objArr[i12];
            objArr[i12] = obj2;
            return obj3;
        }
        int i13 = ~iC;
        int[] iArr = this.f56765a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(...)");
            this.f56765a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f56766b, i14 << 1);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            this.f56766b = objArrCopyOf;
            if (i11 != this.f56767c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr2 = this.f56765a;
            int i15 = i13 + 1;
            ry.l.H(i15, i13, iArr2, iArr2, i11);
            Object[] objArr2 = this.f56766b;
            ry.l.G(i15 << 1, i13 << 1, this.f56767c << 1, objArr2, objArr2);
        }
        int i16 = this.f56767c;
        if (i11 == i16) {
            int[] iArr3 = this.f56765a;
            if (i13 < iArr3.length) {
                iArr3[i13] = iHashCode;
                Object[] objArr3 = this.f56766b;
                int i17 = i13 << 1;
                objArr3[i17] = obj;
                objArr3[i17 + 1] = obj2;
                this.f56767c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f56767c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f56767c * 28);
        sb2.append('{');
        int i11 = this.f56767c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object objF = f(i12);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objJ = j(i12);
            if (objJ != sb2) {
                sb2.append(objJ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !kotlin.jvm.internal.m.a(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !kotlin.jvm.internal.m.a(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }
}
