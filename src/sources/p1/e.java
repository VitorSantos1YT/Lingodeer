package p1;

import bw.ORXQ.ADSb;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import l1.r1;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f46253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f46254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46256d;

    public e(Object[] objArr, Object[] objArr2, int i11, int i12) {
        this.f46253a = objArr;
        this.f46254b = objArr2;
        this.f46255c = i11;
        this.f46256d = i12;
        if (!(b() > 32)) {
            r1.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] l(Object[] objArr, int i11, int i12, Object obj, f10.i iVar) {
        Object[] objArrCopyOf;
        int iW = ue.f.w(i12, i11);
        if (i11 == 0) {
            if (iW == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                m.e(objArrCopyOf, "copyOf(...)");
            }
            l.G(iW + 1, iW, 31, objArr, objArrCopyOf);
            iVar.f26547a = objArr[31];
            objArrCopyOf[iW] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        m.e(objArrCopyOf2, "copyOf(...)");
        int i13 = i11 - 5;
        Object obj2 = objArr[iW];
        m.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iW] = l((Object[]) obj2, i13, i12, obj, iVar);
        while (true) {
            iW++;
            if (iW >= 32 || objArrCopyOf2[iW] == null) {
                break;
            }
            Object obj3 = objArr[iW];
            m.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iW] = l((Object[]) obj3, i13, 0, iVar.f26547a, iVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] n(Object[] objArr, int i11, int i12, f10.i iVar) {
        Object[] objArrN;
        int iW = ue.f.w(i12, i11);
        if (i11 == 5) {
            iVar.f26547a = objArr[iW];
            objArrN = null;
        } else {
            Object obj = objArr[iW];
            m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrN = n((Object[]) obj, i11 - 5, i12, iVar);
        }
        if (objArrN == null && iW == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        m.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iW] = objArrN;
        return objArrCopyOf;
    }

    public static Object[] v(int i11, int i12, Object obj, Object[] objArr) {
        int iW = ue.f.w(i12, i11);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        m.e(objArrCopyOf, "copyOf(...)");
        if (i11 == 0) {
            objArrCopyOf[iW] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iW];
        m.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iW] = v(i11 - 5, i12, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // ry.a
    public final int b() {
        return this.f46255c;
    }

    @Override // p1.c
    public final c d(int i11, Object obj) {
        int i12 = this.f46255c;
        se.i.i(i11, i12);
        if (i11 == i12) {
            return e(obj);
        }
        int iU = u();
        Object[] objArr = this.f46253a;
        if (i11 >= iU) {
            return m(i11 - iU, obj, objArr);
        }
        f10.i iVar = new f10.i(null);
        return m(0, iVar.f26547a, l(objArr, this.f46256d, i11, obj, iVar));
    }

    @Override // p1.c
    public final c e(Object obj) {
        int iU = u();
        int i11 = this.f46255c;
        int i12 = i11 - iU;
        Object[] objArr = this.f46253a;
        Object[] objArr2 = this.f46254b;
        if (i12 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return o(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        m.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i12] = obj;
        return new e(objArr, objArrCopyOf, i11 + 1, this.f46256d);
    }

    @Override // p1.c
    public final f g() {
        return new f(this, this.f46253a, this.f46254b, this.f46256d);
    }

    @Override // java.util.List
    public final Object get(int i11) {
        Object[] objArr;
        se.i.h(i11, b());
        if (u() <= i11) {
            objArr = this.f46254b;
        } else {
            objArr = this.f46253a;
            for (int i12 = this.f46256d; i12 > 0; i12 -= 5) {
                Object obj = objArr[ue.f.w(i11, i12)];
                m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i11 & 31];
    }

    @Override // p1.c
    public final c h(b bVar) {
        f fVar = new f(this, this.f46253a, this.f46254b, this.f46256d);
        fVar.K(bVar);
        return fVar.e();
    }

    @Override // p1.c
    public final c j(int i11) {
        se.i.h(i11, this.f46255c);
        int iU = u();
        Object[] objArr = this.f46253a;
        int i12 = this.f46256d;
        return i11 >= iU ? t(objArr, iU, i12, i11 - iU) : t(s(objArr, i12, i11, new f10.i(this.f46254b[0])), iU, i12, 0);
    }

    @Override // p1.c
    public final c k(int i11, Object obj) {
        int i12 = this.f46255c;
        se.i.h(i11, i12);
        int iU = u();
        Object[] objArr = this.f46253a;
        Object[] objArr2 = this.f46254b;
        int i13 = this.f46256d;
        if (iU > i11) {
            return new e(v(i13, i11, obj, objArr), objArr2, i12, i13);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        m.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i11 & 31] = obj;
        return new e(objArr, objArrCopyOf, i12, i13);
    }

    @Override // ry.e, java.util.List
    public final ListIterator listIterator(int i11) {
        se.i.i(i11, this.f46255c);
        return new g(i11, this.f46255c, (this.f46256d / 5) + 1, this.f46253a, this.f46254b);
    }

    public final e m(int i11, Object obj, Object[] objArr) {
        int iU = u();
        int i12 = this.f46255c;
        int i13 = i12 - iU;
        Object[] objArr2 = this.f46254b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        m.e(objArrCopyOf, "copyOf(...)");
        if (i13 < 32) {
            l.G(i11 + 1, i11, i13, objArr2, objArrCopyOf);
            objArrCopyOf[i11] = obj;
            return new e(objArr, objArrCopyOf, i12 + 1, this.f46256d);
        }
        Object obj2 = objArr2[31];
        l.G(i11 + 1, i11, i13 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i11] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return o(objArr, objArrCopyOf, objArr3);
    }

    public final e o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i11 = this.f46255c;
        int i12 = i11 >> 5;
        int i13 = this.f46256d;
        if (i12 <= (1 << i13)) {
            return new e(r(i13, objArr, objArr2), objArr3, i11 + 1, i13);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i14 = i13 + 5;
        return new e(r(i14, objArr4, objArr2), objArr3, i11 + 1, i14);
    }

    public final Object[] r(int i11, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iW = ue.f.w(b() - 1, i11);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            m.e(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i11 == 5) {
            objArrCopyOf[iW] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iW] = r(i11 - 5, (Object[]) objArrCopyOf[iW], objArr2);
        return objArrCopyOf;
    }

    public final Object[] s(Object[] objArr, int i11, int i12, f10.i iVar) {
        Object[] objArrCopyOf;
        int iW = ue.f.w(i12, i11);
        if (i11 == 0) {
            if (iW == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                m.e(objArrCopyOf, "copyOf(...)");
            }
            l.G(iW, iW + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = iVar.f26547a;
            iVar.f26547a = objArr[iW];
            return objArrCopyOf;
        }
        int iW2 = objArr[31] == null ? ue.f.w(u() - 1, i11) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        m.e(objArrCopyOf2, "copyOf(...)");
        int i13 = i11 - 5;
        int i14 = iW + 1;
        if (i14 <= iW2) {
            while (true) {
                Object obj = objArrCopyOf2[iW2];
                m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iW2] = s((Object[]) obj, i13, 0, iVar);
                if (iW2 == i14) {
                    break;
                }
                iW2--;
            }
        }
        Object obj2 = objArrCopyOf2[iW];
        m.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iW] = s((Object[]) obj2, i13, i12, iVar);
        return objArrCopyOf2;
    }

    public final int u() {
        return (this.f46255c - 1) & (-32);
    }

    public final c t(Object[] objArr, int i11, int i12, int i13) {
        int i14 = this.f46255c - i11;
        Object obj = null;
        if (i14 != 1) {
            Object[] objArr2 = this.f46254b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            m.e(objArrCopyOf, "copyOf(...)");
            int i15 = i14 - 1;
            if (i13 < i15) {
                l.G(i13, i13 + 1, i14, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i15] = null;
            return new e(objArr, objArrCopyOf, (i11 + i14) - 1, i12);
        }
        if (i12 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                m.e(objArr, "copyOf(...)");
            }
            return new i(objArr);
        }
        f10.i iVar = new f10.i(obj);
        Object[] objArrN = n(objArr, i12, i11 - 1, iVar);
        m.c(objArrN);
        Object obj2 = iVar.f26547a;
        String str = ADSb.glTwinTKz;
        m.d(obj2, str);
        Object[] objArr3 = (Object[]) obj2;
        if (objArrN[1] != null) {
            return new e(objArrN, objArr3, i11, i12);
        }
        Object obj3 = objArrN[0];
        m.d(obj3, str);
        return new e((Object[]) obj3, objArr3, i11, i12 - 5);
    }
}
