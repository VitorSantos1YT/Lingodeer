package p1;

import hh.p0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import l1.r1;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ry.g implements Collection, gz.b {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f46257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f46258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f46259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s1.b f46261e = new s1.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f46262f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object[] f46263t;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i11) {
        this.f46257a = cVar;
        this.f46258b = objArr;
        this.f46259c = objArr2;
        this.f46260d = i11;
        this.f46262f = objArr;
        this.f46263t = objArr2;
        this.H = cVar.b();
    }

    public static void f(Object[] objArr, int i11, Iterator it) {
        while (i11 < 32 && it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
    }

    public final Object[] A(int i11, Object[] objArr, Object[] objArr2) {
        int iW = ue.f.w(b() - 1, i11);
        Object[] objArrN = n(objArr);
        if (i11 == 5) {
            objArrN[iW] = objArr2;
            return objArrN;
        }
        objArrN[iW] = A(i11 - 5, (Object[]) objArrN[iW], objArr2);
        return objArrN;
    }

    public final int D(fz.c cVar, Object[] objArr, int i11, int i12, f10.i iVar, ArrayList arrayList, ArrayList arrayList2) {
        if (l(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = iVar.f26547a;
        m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrR = objArr2;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj2 = objArr[i13];
            if (!((Boolean) cVar.invoke(obj2)).booleanValue()) {
                if (i12 == 32) {
                    objArrR = !arrayList.isEmpty() ? (Object[]) p0.f(1, arrayList) : r();
                    i12 = 0;
                }
                objArrR[i12] = obj2;
                i12++;
            }
        }
        iVar.f26547a = objArrR;
        if (objArr2 != objArrR) {
            arrayList2.add(objArr2);
        }
        return i12;
    }

    public final int E(fz.c cVar, Object[] objArr, int i11, f10.i iVar) {
        Object[] objArrN = objArr;
        int i12 = i11;
        boolean z11 = false;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                if (!z11) {
                    objArrN = n(objArr);
                    z11 = true;
                    i12 = i13;
                }
            } else if (z11) {
                objArrN[i12] = obj;
                i12++;
            }
        }
        iVar.f26547a = objArrN;
        return i12;
    }

    public final int H(fz.c cVar, int i11, f10.i iVar) {
        int iE = E(cVar, this.f46263t, i11, iVar);
        if (iE == i11) {
            return i11;
        }
        Object obj = iVar.f26547a;
        m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iE, i11, (Object) null);
        this.f46263t = objArr;
        this.H -= i11 - iE;
        return iE;
    }

    public final boolean K(fz.c cVar) {
        Object[] objArrW;
        int i11;
        fz.c cVar2 = cVar;
        int iQ = Q();
        Object[] objArrT = null;
        f10.i iVar = new f10.i(objArrT);
        boolean z11 = false;
        if (this.f46262f != null) {
            a aVarM = m(0);
            int iE = 32;
            while (iE == 32 && aVarM.hasNext()) {
                iE = E(cVar2, (Object[]) aVarM.next(), 32, iVar);
            }
            if (iE == 32) {
                int iH = H(cVar2, iQ, iVar);
                if (iH == 0) {
                    v(this.H, this.f46260d, this.f46262f);
                }
                if (iH != iQ) {
                }
            } else {
                int i12 = (aVarM.f46247a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iD = iE;
                while (aVarM.hasNext()) {
                    iD = D(cVar2, (Object[]) aVarM.next(), 32, iD, iVar, arrayList2, arrayList);
                    cVar2 = cVar;
                }
                int iD2 = D(cVar, this.f46263t, iQ, iD, iVar, arrayList2, arrayList);
                Object obj = iVar.f26547a;
                m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iD2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrW = this.f46262f;
                    m.c(objArrW);
                } else {
                    objArrW = w(this.f46262f, i12, this.f46260d, arrayList.iterator());
                }
                int size = i12 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    r1.a("invalid size");
                }
                if (size == 0) {
                    this.f46260d = 0;
                } else {
                    int i13 = size - 1;
                    while (true) {
                        i11 = this.f46260d;
                        if ((i13 >> i11) != 0) {
                            break;
                        }
                        this.f46260d = i11 - 5;
                        Object[] objArr2 = objArrW[0];
                        m.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrW = objArr2;
                    }
                    objArrT = t(i13, i11, objArrW);
                }
                this.f46262f = objArrT;
                this.f46263t = objArr;
                this.H = size + iD2;
            }
            z11 = true;
        } else if (H(cVar2, iQ, iVar) != iQ) {
            z11 = true;
        }
        if (z11) {
            ((AbstractList) this).modCount++;
        }
        return z11;
    }

    public final Object[] L(Object[] objArr, int i11, int i12, f10.i iVar) {
        int iW = ue.f.w(i12, i11);
        if (i11 == 0) {
            Object obj = objArr[iW];
            Object[] objArrN = n(objArr);
            l.G(iW, iW + 1, 32, objArr, objArrN);
            objArrN[31] = iVar.f26547a;
            iVar.f26547a = obj;
            return objArrN;
        }
        int iW2 = objArr[31] == null ? ue.f.w(N() - 1, i11) : 31;
        Object[] objArrN2 = n(objArr);
        int i13 = i11 - 5;
        int i14 = iW + 1;
        if (i14 <= iW2) {
            while (true) {
                Object obj2 = objArrN2[iW2];
                m.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrN2[iW2] = L((Object[]) obj2, i13, 0, iVar);
                if (iW2 == i14) {
                    break;
                }
                iW2--;
            }
        }
        Object obj3 = objArrN2[iW];
        m.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrN2[iW] = L((Object[]) obj3, i13, i12, iVar);
        return objArrN2;
    }

    public final Object M(Object[] objArr, int i11, int i12, int i13) {
        int i14 = this.H - i11;
        if (i14 == 1) {
            Object obj = this.f46263t[0];
            v(i11, i12, objArr);
            return obj;
        }
        Object[] objArr2 = this.f46263t;
        Object obj2 = objArr2[i13];
        Object[] objArrN = n(objArr2);
        l.G(i13, i13 + 1, i14, objArr2, objArrN);
        objArrN[i14 - 1] = null;
        this.f46262f = objArr;
        this.f46263t = objArrN;
        this.H = (i11 + i14) - 1;
        this.f46260d = i12;
        return obj2;
    }

    public final int N() {
        int i11 = this.H;
        if (i11 <= 32) {
            return 0;
        }
        return (i11 - 1) & (-32);
    }

    public final Object[] O(Object[] objArr, int i11, int i12, Object obj, f10.i iVar) {
        int iW = ue.f.w(i12, i11);
        Object[] objArrN = n(objArr);
        if (i11 != 0) {
            Object obj2 = objArrN[iW];
            m.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrN[iW] = O((Object[]) obj2, i11 - 5, i12, obj, iVar);
            return objArrN;
        }
        if (objArrN != objArr) {
            ((AbstractList) this).modCount++;
        }
        iVar.f26547a = objArrN[iW];
        objArrN[iW] = obj;
        return objArrN;
    }

    public final void P(Collection collection, int i11, Object[] objArr, int i12, Object[][] objArr2, int i13, Object[] objArr3) {
        Object[] objArrR;
        if (i13 < 1) {
            r1.a("requires at least one nullBuffer");
        }
        Object[] objArrN = n(objArr);
        objArr2[0] = objArrN;
        int i14 = i11 & 31;
        int size = ((collection.size() + i11) - 1) & 31;
        int i15 = (i12 - i14) + size;
        if (i15 < 32) {
            l.G(size + 1, i14, i12, objArrN, objArr3);
        } else {
            int i16 = i15 - 31;
            if (i13 == 1) {
                objArrR = objArrN;
            } else {
                objArrR = r();
                i13--;
                objArr2[i13] = objArrR;
            }
            int i17 = i12 - i16;
            l.G(0, i17, i12, objArrN, objArr3);
            l.G(size + 1, i14, i17, objArrN, objArrR);
            objArr3 = objArrR;
        }
        Iterator it = collection.iterator();
        f(objArrN, i14, it);
        for (int i18 = 1; i18 < i13; i18++) {
            Object[] objArrR2 = r();
            f(objArrR2, 0, it);
            objArr2[i18] = objArrR2;
        }
        f(objArr3, 0, it);
    }

    public final int Q() {
        int i11 = this.H;
        return i11 <= 32 ? i11 : i11 - ((i11 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        se.i.i(i11, b());
        if (i11 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iN = N();
        if (i11 >= iN) {
            k(i11 - iN, obj, this.f46262f);
            return;
        }
        f10.i iVar = new f10.i(null);
        Object[] objArr = this.f46262f;
        m.c(objArr);
        k(0, iVar.f26547a, j(objArr, this.f46260d, i11, obj, iVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] objArrR;
        se.i.i(i11, this.H);
        if (i11 == this.H) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i12 = (i11 >> 5) << 5;
        int size = ((collection.size() + (this.H - i12)) - 1) / 32;
        if (size == 0) {
            int i13 = i11 & 31;
            int size2 = ((collection.size() + i11) - 1) & 31;
            Object[] objArr = this.f46263t;
            Object[] objArrN = n(objArr);
            l.G(size2 + 1, i13, Q(), objArr, objArrN);
            f(objArrN, i13, collection.iterator());
            this.f46263t = objArrN;
            this.H = collection.size() + this.H;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iQ = Q();
        int size3 = collection.size() + this.H;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i11 >= N()) {
            objArrR = r();
            collection2 = collection;
            P(collection2, i11, this.f46263t, iQ, objArr2, size, objArrR);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > iQ) {
                int i14 = size3 - iQ;
                Object[] objArrO = o(i14, fVar.f46263t);
                fVar.h(collection2, i11, i14, objArr2, size, objArrO);
                objArr2 = objArr2;
                objArrR = objArrO;
            } else {
                Object[] objArr3 = fVar.f46263t;
                objArrR = r();
                int i15 = iQ - size3;
                l.G(0, i15, iQ, objArr3, objArrR);
                int i16 = 32 - i15;
                Object[] objArrO2 = o(i16, fVar.f46263t);
                int i17 = size - 1;
                objArr2[i17] = objArrO2;
                fVar.h(collection2, i11, i16, objArr2, i17, objArrO2);
                collection2 = collection2;
            }
        }
        fVar.f46262f = x(fVar.f46262f, i12, objArr2);
        fVar.f46263t = objArrR;
        fVar.H = collection2.size() + fVar.H;
        return true;
    }

    @Override // ry.g
    public final int b() {
        return this.H;
    }

    @Override // ry.g
    public final Object d(int i11) {
        se.i.h(i11, b());
        ((AbstractList) this).modCount++;
        int iN = N();
        if (i11 >= iN) {
            return M(this.f46262f, iN, this.f46260d, i11 - iN);
        }
        f10.i iVar = new f10.i(this.f46263t[0]);
        Object[] objArr = this.f46262f;
        m.c(objArr);
        M(L(objArr, this.f46260d, i11, iVar), iN, this.f46260d, 0);
        return iVar.f26547a;
    }

    public final c e() {
        c eVar;
        Object[] objArr = this.f46262f;
        if (objArr == this.f46258b && this.f46263t == this.f46259c) {
            eVar = this.f46257a;
        } else {
            this.f46261e = new s1.b();
            this.f46258b = objArr;
            Object[] objArr2 = this.f46263t;
            this.f46259c = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.H, this.f46260d);
            } else if (objArr2.length == 0) {
                eVar = i.f46270b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.H);
                m.e(objArrCopyOf, "copyOf(...)");
                eVar = new i(objArrCopyOf);
            }
        }
        this.f46257a = eVar;
        return eVar;
    }

    public final int g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        Object[] objArr;
        se.i.h(i11, b());
        if (N() <= i11) {
            objArr = this.f46263t;
        } else {
            objArr = this.f46262f;
            m.c(objArr);
            for (int i12 = this.f46260d; i12 > 0; i12 -= 5) {
                Object obj = objArr[ue.f.w(i11, i12)];
                m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i11 & 31];
    }

    public final void h(Collection collection, int i11, int i12, Object[][] objArr, int i13, Object[] objArr2) {
        if (this.f46262f == null) {
            throw new IllegalStateException("root is null");
        }
        int i14 = i11 >> 5;
        a aVarM = m(N() >> 5);
        int i15 = i13;
        Object[] objArrO = objArr2;
        while (aVarM.f46247a - 1 != i14) {
            Object[] objArr3 = (Object[]) aVarM.previous();
            l.G(0, 32 - i12, 32, objArr3, objArrO);
            objArrO = o(i12, objArr3);
            i15--;
            objArr[i15] = objArrO;
        }
        Object[] objArr4 = (Object[]) aVarM.previous();
        int iN = i13 - (((N() >> 5) - 1) - i14);
        if (iN < i13) {
            objArr2 = objArr[iN];
            m.c(objArr2);
        }
        P(collection, i11, objArr4, 32, objArr, iN, objArr2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] j(Object[] objArr, int i11, int i12, Object obj, f10.i iVar) {
        Object obj2;
        int iW = ue.f.w(i12, i11);
        if (i11 == 0) {
            iVar.f26547a = objArr[31];
            Object[] objArrN = n(objArr);
            l.G(iW + 1, iW, 31, objArr, objArrN);
            objArrN[iW] = obj;
            return objArrN;
        }
        Object[] objArrN2 = n(objArr);
        int i13 = i11 - 5;
        Object obj3 = objArrN2[iW];
        m.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrN2[iW] = j((Object[]) obj3, i13, i12, obj, iVar);
        while (true) {
            iW++;
            if (iW >= 32 || (obj2 = objArrN2[iW]) == null) {
                break;
            }
            objArrN2[iW] = j((Object[]) obj2, i13, 0, iVar.f26547a, iVar);
        }
        return objArrN2;
    }

    public final void k(int i11, Object obj, Object[] objArr) {
        int iQ = Q();
        Object[] objArrN = n(this.f46263t);
        if (iQ >= 32) {
            Object[] objArr2 = this.f46263t;
            Object obj2 = objArr2[31];
            l.G(i11 + 1, i11, 31, objArr2, objArrN);
            objArrN[i11] = obj;
            z(objArr, objArrN, s(obj2));
            return;
        }
        l.G(i11 + 1, i11, iQ, this.f46263t, objArrN);
        objArrN[i11] = obj;
        this.f46262f = objArr;
        this.f46263t = objArrN;
        this.H++;
    }

    public final boolean l(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f46261e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        se.i.i(i11, this.H);
        return new h(this, i11);
    }

    public final a m(int i11) {
        Object[] objArr = this.f46262f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iN = N() >> 5;
        se.i.i(i11, iN);
        int i12 = this.f46260d;
        return i12 == 0 ? new d(objArr, i11) : new j(objArr, i11, iN, i12 / 5);
    }

    public final Object[] n(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (l(objArr)) {
            return objArr;
        }
        Object[] objArrR = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        l.K(0, length, 6, objArr, objArrR);
        return objArrR;
    }

    public final Object[] o(int i11, Object[] objArr) {
        if (l(objArr)) {
            l.G(i11, 0, 32 - i11, objArr, objArr);
            return objArr;
        }
        Object[] objArrR = r();
        l.G(i11, 0, 32 - i11, objArr, objArrR);
        return objArrR;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f46261e;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return K(new b(1, collection));
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f46261e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        se.i.h(i11, b());
        if (N() > i11) {
            f10.i iVar = new f10.i(null);
            Object[] objArr = this.f46262f;
            m.c(objArr);
            this.f46262f = O(objArr, this.f46260d, i11, obj, iVar);
            return iVar.f26547a;
        }
        Object[] objArrN = n(this.f46263t);
        if (objArrN != this.f46263t) {
            ((AbstractList) this).modCount++;
        }
        int i12 = i11 & 31;
        Object obj2 = objArrN[i12];
        objArrN[i12] = obj;
        this.f46263t = objArrN;
        return obj2;
    }

    public final Object[] t(int i11, int i12, Object[] objArr) {
        if (i12 < 0) {
            r1.a("shift should be positive");
        }
        if (i12 == 0) {
            return objArr;
        }
        int iW = ue.f.w(i11, i12);
        Object obj = objArr[iW];
        m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objT = t(i11, i12 - 5, (Object[]) obj);
        if (iW < 31) {
            int i13 = iW + 1;
            if (objArr[i13] != null) {
                if (l(objArr)) {
                    Arrays.fill(objArr, i13, 32, (Object) null);
                }
                Object[] objArrR = r();
                l.G(0, 0, i13, objArr, objArrR);
                objArr = objArrR;
            }
        }
        if (objT == objArr[iW]) {
            return objArr;
        }
        Object[] objArrN = n(objArr);
        objArrN[iW] = objT;
        return objArrN;
    }

    public final Object[] u(Object[] objArr, int i11, int i12, f10.i iVar) {
        Object[] objArrU;
        int iW = ue.f.w(i12 - 1, i11);
        if (i11 == 5) {
            iVar.f26547a = objArr[iW];
            objArrU = null;
        } else {
            Object obj = objArr[iW];
            m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrU = u((Object[]) obj, i11 - 5, i12, iVar);
        }
        if (objArrU == null && iW == 0) {
            return null;
        }
        Object[] objArrN = n(objArr);
        objArrN[iW] = objArrU;
        return objArrN;
    }

    public final void v(int i11, int i12, Object[] objArr) {
        Object obj = null;
        if (i12 == 0) {
            this.f46262f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f46263t = objArr;
            this.H = i11;
            this.f46260d = i12;
            return;
        }
        f10.i iVar = new f10.i(obj);
        m.c(objArr);
        Object[] objArrU = u(objArr, i12, i11, iVar);
        m.c(objArrU);
        Object obj2 = iVar.f26547a;
        m.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f46263t = (Object[]) obj2;
        this.H = i11;
        if (objArrU[1] == null) {
            this.f46262f = (Object[]) objArrU[0];
            this.f46260d = i12 - 5;
        } else {
            this.f46262f = objArrU;
            this.f46260d = i12;
        }
    }

    public final Object[] w(Object[] objArr, int i11, int i12, Iterator it) {
        if (!it.hasNext()) {
            r1.a("invalid buffersIterator");
        }
        if (!(i12 >= 0)) {
            r1.a("negative shift");
        }
        if (i12 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrN = n(objArr);
        int iW = ue.f.w(i11, i12);
        int i13 = i12 - 5;
        objArrN[iW] = w((Object[]) objArrN[iW], i11, i13, it);
        while (true) {
            iW++;
            if (iW >= 32 || !it.hasNext()) {
                break;
            }
            objArrN[iW] = w((Object[]) objArrN[iW], 0, i13, it);
        }
        return objArrN;
    }

    public final Object[] x(Object[] objArr, int i11, Object[][] objArr2) {
        e00.i iVarA = kotlin.jvm.internal.l.a(objArr2);
        int i12 = i11 >> 5;
        int i13 = this.f46260d;
        Object[] objArrW = i12 < (1 << i13) ? w(objArr, i11, i13, iVarA) : n(objArr);
        while (iVarA.hasNext()) {
            this.f46260d += 5;
            objArrW = s(objArrW);
            int i14 = this.f46260d;
            w(objArrW, 1 << i14, i14, iVarA);
        }
        return objArrW;
    }

    public final void z(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i11 = this.H;
        int i12 = i11 >> 5;
        int i13 = this.f46260d;
        if (i12 > (1 << i13)) {
            this.f46262f = A(this.f46260d + 5, s(objArr), objArr2);
            this.f46263t = objArr3;
            this.f46260d += 5;
            this.H++;
            return;
        }
        if (objArr == null) {
            this.f46262f = objArr2;
            this.f46263t = objArr3;
            this.H = i11 + 1;
        } else {
            this.f46262f = A(i13, objArr, objArr2);
            this.f46263t = objArr3;
            this.H++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iQ = Q();
        if (iQ < 32) {
            Object[] objArrN = n(this.f46263t);
            objArrN[iQ] = obj;
            this.f46263t = objArrN;
            this.H = b() + 1;
        } else {
            z(this.f46262f, this.f46263t, s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iQ = Q();
        Iterator it = collection.iterator();
        if (32 - iQ >= collection.size()) {
            Object[] objArrN = n(this.f46263t);
            f(objArrN, iQ, it);
            this.f46263t = objArrN;
            this.H = collection.size() + this.H;
            return true;
        }
        int size = ((collection.size() + iQ) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrN2 = n(this.f46263t);
        f(objArrN2, iQ, it);
        objArr[0] = objArrN2;
        for (int i11 = 1; i11 < size; i11++) {
            Object[] objArrR = r();
            f(objArrR, 0, it);
            objArr[i11] = objArrR;
        }
        this.f46262f = x(this.f46262f, N(), objArr);
        Object[] objArrR2 = r();
        f(objArrR2, 0, it);
        this.f46263t = objArrR2;
        this.H = collection.size() + this.H;
        return true;
    }
}
