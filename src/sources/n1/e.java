package n1;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f43112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f43113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43114c = 0;

    public e(Object[] objArr) {
        this.f43112a = objArr;
    }

    public final void b(int i11, Object obj) {
        int i12 = this.f43114c + 1;
        if (this.f43112a.length < i12) {
            n(i12);
        }
        Object[] objArr = this.f43112a;
        int i13 = this.f43114c;
        if (i11 != i13) {
            System.arraycopy(objArr, i11, objArr, i11 + 1, i13 - i11);
        }
        objArr[i11] = obj;
        this.f43114c++;
    }

    public final void c(Object obj) {
        int i11 = this.f43114c + 1;
        if (this.f43112a.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f43112a;
        int i12 = this.f43114c;
        objArr[i12] = obj;
        this.f43114c = i12 + 1;
    }

    public final void d(int i11, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i12 = this.f43114c + size;
        if (this.f43112a.length < i12) {
            n(i12);
        }
        Object[] objArr = this.f43112a;
        int i13 = this.f43114c;
        if (i11 != i13) {
            System.arraycopy(objArr, i11, objArr, i11 + size, i13 - i11);
        }
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            objArr[i11 + i14] = list.get(i14);
        }
        this.f43114c += size;
    }

    public final void e(int i11, e eVar) {
        int i12 = eVar.f43114c;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f43114c + i12;
        if (this.f43112a.length < i13) {
            n(i13);
        }
        Object[] objArr = this.f43112a;
        int i14 = this.f43114c;
        if (i11 != i14) {
            System.arraycopy(objArr, i11, objArr, i11 + i12, i14 - i11);
        }
        System.arraycopy(eVar.f43112a, 0, objArr, i11, i12);
        this.f43114c += i12;
    }

    public final boolean f(int i11, Collection collection) {
        int i12 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i13 = this.f43114c + size;
        if (this.f43112a.length < i13) {
            n(i13);
        }
        Object[] objArr = this.f43112a;
        int i14 = this.f43114c;
        if (i11 != i14) {
            System.arraycopy(objArr, i11, objArr, i11 + size, i14 - i11);
        }
        for (Object obj : collection) {
            int i15 = i12 + 1;
            if (i12 < 0) {
                o.V();
                throw null;
            }
            objArr[i12 + i11] = obj;
            i12 = i15;
        }
        this.f43114c += size;
        return true;
    }

    public final List g() {
        b bVar = this.f43113b;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 0);
        this.f43113b = bVar2;
        return bVar2;
    }

    public final void h() {
        Object[] objArr = this.f43112a;
        int i11 = this.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.f43114c = 0;
    }

    public final boolean i(Object obj) {
        int i11 = this.f43114c - 1;
        if (i11 >= 0) {
            for (int i12 = 0; !m.a(this.f43112a[i12], obj); i12++) {
                if (i12 != i11) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.f43112a;
        int i11 = this.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (m.a(obj, objArr[i12])) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return false;
        }
        l(iJ);
        return true;
    }

    public final Object l(int i11) {
        Object[] objArr = this.f43112a;
        Object obj = objArr[i11];
        int i12 = this.f43114c;
        if (i11 != i12 - 1) {
            int i13 = i11 + 1;
            System.arraycopy(objArr, i13, objArr, i11, i12 - i13);
        }
        int i14 = this.f43114c - 1;
        this.f43114c = i14;
        objArr[i14] = null;
        return obj;
    }

    public final void m(int i11, int i12) {
        if (i12 > i11) {
            int i13 = this.f43114c;
            if (i12 < i13) {
                Object[] objArr = this.f43112a;
                System.arraycopy(objArr, i12, objArr, i11, i13 - i12);
            }
            int i14 = this.f43114c;
            int i15 = i14 - (i12 - i11);
            int i16 = i14 - 1;
            if (i15 <= i16) {
                int i17 = i15;
                while (true) {
                    this.f43112a[i17] = null;
                    if (i17 == i16) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f43114c = i15;
        }
    }

    public final void n(int i11) {
        Object[] objArr = this.f43112a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i11, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f43112a = objArr2;
    }
}
