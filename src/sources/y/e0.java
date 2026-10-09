package y;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f56686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n1.b f56688c;

    public e0(int i11) {
        this.f56686a = i11 == 0 ? o0.f56745a : new Object[i11];
    }

    public final void a(Object obj) {
        int i11 = this.f56687b + 1;
        Object[] objArr = this.f56686a;
        if (objArr.length < i11) {
            m(i11, objArr);
        }
        Object[] objArr2 = this.f56686a;
        int i12 = this.f56687b;
        objArr2[i12] = obj;
        this.f56687b = i12 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i11 = this.f56687b;
        int size = list.size() + i11;
        Object[] objArr = this.f56686a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.f56686a;
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            objArr2[i12 + i11] = list.get(i12);
        }
        this.f56687b = list.size() + this.f56687b;
    }

    public final void c(e0 elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        if (elements.h()) {
            return;
        }
        int i11 = this.f56687b + elements.f56687b;
        Object[] objArr = this.f56686a;
        if (objArr.length < i11) {
            m(i11, objArr);
        }
        ry.l.G(this.f56687b, 0, elements.f56687b, elements.f56686a, this.f56686a);
        this.f56687b += elements.f56687b;
    }

    public final void d() {
        ry.l.P(0, this.f56687b, null, this.f56686a);
        this.f56687b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.f56686a[0];
        }
        z.a.e("ObjectList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            int i11 = e0Var.f56687b;
            int i12 = this.f56687b;
            if (i11 == i12) {
                Object[] objArr = this.f56686a;
                Object[] objArr2 = e0Var.f56686a;
                lz.g gVarU = hz.b.U(0, i12);
                int i13 = gVarU.f40532a;
                int i14 = gVarU.f40533b;
                if (i13 > i14) {
                    return true;
                }
                while (kotlin.jvm.internal.m.a(objArr[i13], objArr2[i13])) {
                    if (i13 == i14) {
                        return true;
                    }
                    i13++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i11) {
        if (i11 >= 0 && i11 < this.f56687b) {
            return this.f56686a[i11];
        }
        n(i11);
        throw null;
    }

    public final int g(Object obj) {
        int i11 = 0;
        if (obj == null) {
            Object[] objArr = this.f56686a;
            int i12 = this.f56687b;
            while (i11 < i12) {
                if (objArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        Object[] objArr2 = this.f56686a;
        int i13 = this.f56687b;
        while (i11 < i13) {
            if (obj.equals(objArr2[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public final boolean h() {
        return this.f56687b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f56686a;
        int i11 = this.f56687b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.f56687b != 0;
    }

    public final boolean j(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        k(iG);
        return true;
    }

    public final Object k(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f56687b)) {
            n(i11);
            throw null;
        }
        Object[] objArr = this.f56686a;
        Object obj = objArr[i11];
        if (i11 != i12 - 1) {
            ry.l.G(i11, i11 + 1, i12, objArr, objArr);
        }
        int i13 = this.f56687b - 1;
        this.f56687b = i13;
        objArr[i13] = null;
        return obj;
    }

    public final void l(int i11, int i12) {
        int i13;
        if (i11 < 0 || i11 > (i13 = this.f56687b) || i12 < 0 || i12 > i13) {
            StringBuilder sbK = w4.c.k("Start (", i11, ") and end (", i12, ") must be in 0..");
            sbK.append(this.f56687b);
            z.a.d(sbK.toString());
            throw null;
        }
        if (i12 < i11) {
            z.a.c("Start (" + i11 + ") is more than end (" + i12 + ')');
            throw null;
        }
        if (i12 != i11) {
            if (i12 < i13) {
                Object[] objArr = this.f56686a;
                ry.l.G(i11, i12, i13, objArr, objArr);
            }
            int i14 = this.f56687b;
            int i15 = i14 - (i12 - i11);
            ry.l.P(i15, i14, null, this.f56686a);
            this.f56687b = i15;
        }
    }

    public final void m(int i11, Object[] oldContent) {
        kotlin.jvm.internal.m.f(oldContent, "oldContent");
        int length = oldContent.length;
        Object[] objArr = new Object[Math.max(i11, (length * 3) / 2)];
        ry.l.G(0, 0, length, oldContent, objArr);
        this.f56686a = objArr;
    }

    public final void n(int i11) {
        StringBuilder sbI = w4.c.i(i11, "Index ", " must be in 0..");
        sbI.append(this.f56687b - 1);
        z.a.d(sbI.toString());
        throw null;
    }

    public final String toString() {
        a0.o0 o0Var = new a0.o0(this, 29);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f56686a;
        int i11 = this.f56687b;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            if (i12 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) o0Var.invoke(obj));
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        kotlin.jvm.internal.m.e(string2, "toString(...)");
        return string2;
    }

    public /* synthetic */ e0() {
        this(16);
    }
}
