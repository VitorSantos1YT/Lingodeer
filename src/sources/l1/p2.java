package l1;

import bw.ORXQ.ADSb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f39396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f39397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f39398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f39399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f39400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.x f39401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39407l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p0 f39410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0 f39411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p0 f39412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y.x f39413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f39414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f39415u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f39416v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f39417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y.w f39418x;

    public p2(m2 m2Var) {
        this.f39396a = m2Var;
        int[] iArr = m2Var.f39358a;
        this.f39397b = iArr;
        Object[] objArr = m2Var.f39360c;
        this.f39398c = objArr;
        this.f39399d = m2Var.K;
        this.f39400e = m2Var.L;
        this.f39401f = m2Var.M;
        int i11 = m2Var.f39359b;
        this.f39402g = i11;
        this.f39403h = (iArr.length / 5) - i11;
        int i12 = m2Var.f39361d;
        this.f39406k = i12;
        this.f39407l = objArr.length - i12;
        this.m = i11;
        this.f39410p = new p0(0, false);
        this.f39411q = new p0(0, false);
        this.f39412r = new p0(0, false);
        this.f39415u = i11;
        this.f39416v = -1;
    }

    public static int i(int i11, int i12, int i13, int i14) {
        return i11 > i12 ? -(((i14 - i13) - i11) + 1) : i11;
    }

    public static void z(p2 p2Var) {
        int i11 = p2Var.f39416v;
        int iR = p2Var.r(i11);
        int[] iArr = p2Var.f39397b;
        int i12 = (iR * 5) + 1;
        int i13 = iArr[i12];
        if ((i13 & 134217728) != 0) {
            return;
        }
        int i14 = (i13 & (-134217729)) | 134217728;
        iArr[i12] = i14;
        if ((67108864 & i14) != 0) {
            return;
        }
        p2Var.T(p2Var.E(iArr, i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(m2 m2Var, int i11) {
        if (this.f39408n <= 0) {
            u.a("Check failed");
        }
        boolean z11 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i11 == 0 && this.f39414t == 0 && this.f39396a.f39359b == 0) {
            int[] iArr = m2Var.f39358a;
            int i12 = iArr[(i11 * 5) + 3];
            int i13 = m2Var.f39359b;
            if (i12 == i13) {
                int[] iArr2 = this.f39397b;
                Object[] objArr3 = this.f39398c;
                ArrayList arrayList = this.f39399d;
                HashMap map = this.f39400e;
                y.x xVar = this.f39401f;
                Object[] objArr4 = m2Var.f39360c;
                int i14 = m2Var.f39361d;
                HashMap map2 = m2Var.L;
                y.x xVar2 = m2Var.M;
                this.f39397b = iArr;
                this.f39398c = objArr4;
                this.f39399d = m2Var.K;
                this.f39402g = i13;
                this.f39403h = (iArr.length / 5) - i13;
                this.f39406k = i14;
                this.f39407l = objArr4.length - i14;
                this.m = i13;
                this.f39400e = map2;
                this.f39401f = xVar2;
                m2Var.f39358a = iArr2;
                m2Var.f39359b = objArr2 == true ? 1 : 0;
                m2Var.f39360c = objArr3;
                m2Var.f39361d = objArr == true ? 1 : 0;
                m2Var.K = arrayList;
                m2Var.L = map;
                m2Var.M = xVar;
                return;
            }
        }
        p2 p2VarF = m2Var.f();
        try {
            t.A(p2VarF, i11, this, true, true, false);
            boolean z12 = true;
        } finally {
            p2VarF.e(z11);
        }
    }

    public final void B(int i11) {
        b bVar;
        int i12;
        b bVar2;
        int i13;
        int i14;
        int i15 = this.f39403h;
        int i16 = this.f39402g;
        if (i16 != i11) {
            if (!this.f39399d.isEmpty()) {
                int iO = o() - this.f39403h;
                if (i16 < i11) {
                    for (int iB = o2.b(this.f39399d, i16, iO); iB < this.f39399d.size() && (i13 = (bVar2 = (b) this.f39399d.get(iB)).f39235a) < 0 && (i14 = i13 + iO) < i11; iB++) {
                        bVar2.f39235a = i14;
                    }
                } else {
                    for (int iB2 = o2.b(this.f39399d, i11, iO); iB2 < this.f39399d.size() && (i12 = (bVar = (b) this.f39399d.get(iB2)).f39235a) >= 0; iB2++) {
                        bVar.f39235a = -(iO - i12);
                    }
                }
            }
            if (i15 > 0) {
                int[] iArr = this.f39397b;
                int i17 = i11 * 5;
                int i18 = i15 * 5;
                int i19 = i16 * 5;
                if (i11 < i16) {
                    ry.l.H(i18 + i17, i17, iArr, iArr, i19);
                } else {
                    ry.l.H(i19, i19 + i18, iArr, iArr, i17 + i18);
                }
            }
            if (i11 < i16) {
                i16 = i11 + i15;
            }
            int iO2 = o();
            if (i16 >= iO2) {
                u.a("Check failed");
            }
            while (i16 < iO2) {
                int i21 = (i16 * 5) + 2;
                int i22 = this.f39397b[i21];
                int iP = i22 > -2 ? i22 : (p() + i22) - (-2);
                if (iP >= i11) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i22) {
                    this.f39397b[i21] = iP;
                }
                i16++;
                if (i16 == i11) {
                    i16 += i15;
                }
            }
        }
        this.f39402g = i11;
    }

    public final void C(int i11, int i12) {
        int i13 = this.f39407l;
        int i14 = this.f39406k;
        int i15 = this.m;
        if (i14 != i11) {
            Object[] objArr = this.f39398c;
            if (i11 < i14) {
                System.arraycopy(objArr, i11, objArr, i11 + i13, i14 - i11);
            } else {
                int i16 = i14 + i13;
                System.arraycopy(objArr, i16, objArr, i14, (i11 + i13) - i16);
            }
        }
        int iMin = Math.min(i12 + 1, p());
        if (i15 != iMin) {
            int length = this.f39398c.length - i13;
            if (iMin < i15) {
                int iR = r(iMin);
                int iR2 = r(i15);
                int i17 = this.f39402g;
                while (iR < iR2) {
                    int i18 = (iR * 5) + 4;
                    int i19 = this.f39397b[i18];
                    if (!(i19 >= 0)) {
                        u.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f39397b[i18] = -((length - i19) + 1);
                    iR++;
                    if (iR == i17) {
                        iR += this.f39403h;
                    }
                }
            } else {
                int iR3 = r(i15);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i21 = (iR3 * 5) + 4;
                    int i22 = this.f39397b[i21];
                    if (!(i22 < 0)) {
                        u.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f39397b[i21] = i22 + length + 1;
                    iR3++;
                    if (iR3 == this.f39402g) {
                        iR3 += this.f39403h;
                    }
                }
            }
            this.m = iMin;
        }
        this.f39406k = i11;
    }

    public final Object D(int i11) {
        int iR = r(i11);
        int[] iArr = this.f39397b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.f39398c[h(g(iArr, iR))];
        }
        return null;
    }

    public final int E(int[] iArr, int i11) {
        int i12 = iArr[(r(i11) * 5) + 2];
        return i12 > -2 ? i12 : (p() + i12) - (-2);
    }

    public final Object F(Object obj) {
        if (this.f39408n > 0) {
            x(1, this.f39416v);
        }
        Object[] objArr = this.f39398c;
        int i11 = this.f39404i;
        this.f39404i = i11 + 1;
        Object obj2 = objArr[h(i11)];
        if (this.f39404i > this.f39405j) {
            u.a("Writing to an invalid slot");
        }
        this.f39398c[h(this.f39404i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i11;
        y.w wVar = this.f39418x;
        if (wVar != null) {
            while (wVar.f56783b != 0) {
                int iL = t.L(wVar);
                int iR = r(iL);
                int iU = iL + 1;
                int iU2 = u(iL) + iL;
                while (true) {
                    if (iU >= iU2) {
                        i11 = 0;
                        break;
                    } else {
                        if ((this.f39397b[(r(iU) * 5) + 1] & 201326592) != 0) {
                            i11 = 1;
                            break;
                        }
                        iU += u(iU);
                    }
                }
                int[] iArr = this.f39397b;
                int i12 = (iR * 5) + 1;
                int i13 = iArr[i12];
                if (((67108864 & i13) != 0 ? 1 : 0) != i11) {
                    iArr[i12] = (i11 << 26) | ((-67108865) & i13);
                    int iE = E(iArr, iL);
                    if (iE >= 0) {
                        t.l(wVar, iE);
                    }
                }
            }
        }
    }

    public final boolean H() {
        if (!(this.f39408n == 0)) {
            u.a("Cannot remove group while inserting");
        }
        int i11 = this.f39414t;
        int i12 = this.f39404i;
        int iG = g(this.f39397b, r(i11));
        int iL = L();
        O(this.f39416v);
        y.w wVar = this.f39418x;
        if (wVar != null) {
            while (true) {
                int i13 = wVar.f56783b;
                if (i13 == 0) {
                    break;
                }
                if (i13 == 0) {
                    z.a.e("IntList is empty.");
                    throw null;
                }
                if (wVar.f56782a[0] < i11) {
                    break;
                }
                t.L(wVar);
            }
        }
        boolean zI = I(i11, this.f39414t - i11);
        J(iG, this.f39404i - iG, i11 - 1);
        this.f39414t = i11;
        this.f39404i = i12;
        this.f39409o -= iL;
        return zI;
    }

    public final boolean I(int i11, int i12) {
        boolean z11 = false;
        if (i12 > 0) {
            ArrayList arrayList = this.f39399d;
            B(i11);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f39400e;
                int i13 = i11 + i12;
                int iB = o2.b(this.f39399d, i13, o() - this.f39403h);
                if (iB >= this.f39399d.size()) {
                    iB--;
                }
                int i14 = iB + 1;
                int i15 = 0;
                while (iB >= 0) {
                    b bVar = (b) this.f39399d.get(iB);
                    int iC = c(bVar);
                    if (iC < i11) {
                        break;
                    }
                    if (iC < i13) {
                        bVar.f39235a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i15 == 0) {
                            i15 = iB + 1;
                        }
                        i14 = iB;
                    }
                    iB--;
                }
                z11 = i14 < i15;
                if (z11) {
                    this.f39399d.subList(i14, i15).clear();
                }
            }
            this.f39402g = i11;
            this.f39403h += i12;
            int i16 = this.m;
            if (i16 > i11) {
                this.m = Math.max(i11, i16 - i12);
            }
            int i17 = this.f39415u;
            if (i17 >= this.f39402g) {
                this.f39415u = i17 - i12;
            }
            int i18 = this.f39416v;
            if (i18 >= 0 && (this.f39397b[(r(i18) * 5) + 1] & 67108864) != 0) {
                T(i18);
            }
        }
        return z11;
    }

    public final void J(int i11, int i12, int i13) {
        if (i12 > 0) {
            int i14 = this.f39407l;
            int i15 = i11 + i12;
            C(i15, i13);
            this.f39406k = i11;
            this.f39407l = i14 + i12;
            ry.l.P(i11, i15, null, this.f39398c);
            int i16 = this.f39405j;
            if (i16 >= i11) {
                this.f39405j = i16 - i12;
            }
        }
    }

    public final Object K(int i11, int i12, Object obj) {
        int iN = N(this.f39397b, r(i11));
        int iG = g(this.f39397b, r(i11 + 1));
        int i13 = iN + i12;
        if (i13 < iN || i13 >= iG) {
            u.a("Write to an invalid slot index " + i12 + " for group " + i11);
        }
        int iH = h(i13);
        Object[] objArr = this.f39398c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int L() {
        int iR = r(this.f39414t);
        int iA = o2.a(this.f39397b, iR) + this.f39414t;
        this.f39414t = iA;
        this.f39404i = g(this.f39397b, r(iA));
        int i11 = this.f39397b[(iR * 5) + 1];
        if ((1073741824 & i11) != 0) {
            return 1;
        }
        return i11 & 67108863;
    }

    public final void M() {
        int i11 = this.f39415u;
        this.f39414t = i11;
        this.f39404i = g(this.f39397b, r(i11));
    }

    public final int N(int[] iArr, int i11) {
        if (i11 >= o()) {
            return this.f39398c.length - this.f39407l;
        }
        int iC = o2.c(iArr, i11);
        return iC < 0 ? (this.f39398c.length - this.f39407l) + iC + 1 : iC;
    }

    public final o0 O(int i11) {
        b bVarR;
        HashMap map = this.f39400e;
        if (map == null || (bVarR = R(i11)) == null) {
            return null;
        }
        return (o0) map.get(bVarR);
    }

    public final void P() {
        if (this.f39408n != 0) {
            u.a("Key must be supplied when inserting");
        }
        g gVar = m.f39353a;
        Q(gVar, gVar, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Object obj, Object obj2, boolean z11, int i11) {
        int i12;
        int i13 = this.f39416v;
        Object[] objArr = this.f39408n > 0;
        this.f39412r.d(this.f39409o);
        g gVar = m.f39353a;
        if (objArr == true) {
            int i14 = this.f39414t;
            int iG = g(this.f39397b, r(i14));
            w(1);
            this.f39404i = iG;
            this.f39405j = iG;
            int iR = r(i14);
            int i15 = obj != gVar ? 1 : 0;
            int i16 = (z11 || obj2 == gVar) ? 0 : 1;
            int i17 = i(iG, this.f39406k, this.f39407l, this.f39398c.length);
            if (i17 >= 0 && this.m < i14) {
                i17 = -(((this.f39398c.length - this.f39407l) - i17) + 1);
            }
            int[] iArr = this.f39397b;
            int i18 = this.f39416v;
            int i19 = iR * 5;
            iArr[i19] = i11;
            iArr[i19 + 1] = ((z11 ? 1 : 0) << 30) | (i15 << 29) | (i16 << 28);
            iArr[i19 + 2] = i18;
            iArr[i19 + 3] = 0;
            iArr[i19 + 4] = i17;
            int i21 = (z11 ? 1 : 0) + i15 + i16;
            if (i21 > 0) {
                x(i21, i14);
                Object[] objArr2 = this.f39398c;
                int i22 = this.f39404i;
                if (z11) {
                    objArr2[i22] = obj2;
                    i22++;
                }
                if (i15 != 0) {
                    objArr2[i22] = obj;
                    i22++;
                }
                if (i16 != 0) {
                    objArr2[i22] = obj2;
                    i22++;
                }
                this.f39404i = i22;
            }
            this.f39409o = 0;
            i12 = i14 + 1;
            this.f39416v = i14;
            this.f39414t = i12;
            if (i13 >= 0) {
                O(i13);
            }
        } else {
            this.f39410p.d(i13);
            this.f39411q.d((o() - this.f39403h) - this.f39415u);
            int i23 = this.f39414t;
            int iR2 = r(i23);
            if (!kotlin.jvm.internal.m.a(obj2, gVar)) {
                if (z11) {
                    U(this.f39414t, obj2);
                } else {
                    S(obj2);
                }
            }
            this.f39404i = N(this.f39397b, iR2);
            this.f39405j = g(this.f39397b, r(this.f39414t + 1));
            int[] iArr2 = this.f39397b;
            int i24 = iR2 * 5;
            this.f39409o = iArr2[i24 + 1] & 67108863;
            this.f39416v = i23;
            this.f39414t = i23 + 1;
            i12 = i23 + iArr2[i24 + 3];
        }
        this.f39415u = i12;
    }

    public final b R(int i11) {
        ArrayList arrayList;
        int iE;
        if (i11 < 0 || i11 >= p() || (iE = o2.e((arrayList = this.f39399d), i11, p())) < 0) {
            return null;
        }
        return (b) arrayList.get(iE);
    }

    public final void S(Object obj) {
        int iR = r(this.f39414t);
        int i11 = (iR * 5) + 1;
        if ((this.f39397b[i11] & 268435456) == 0) {
            u.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f39398c;
        int[] iArr = this.f39397b;
        objArr[h(Integer.bitCount(iArr[i11] >> 29) + g(iArr, iR))] = obj;
    }

    public final void T(int i11) {
        if (i11 >= 0) {
            y.w wVar = this.f39418x;
            if (wVar == null) {
                wVar = new y.w();
                this.f39418x = wVar;
            }
            t.l(wVar, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final void U(int i11, Object obj) {
        boolean z11;
        int iR = r(i11);
        int[] iArr = this.f39397b;
        if (iR < iArr.length) {
            z11 = (iArr[(iR * 5) + 1] & 1073741824) != 0;
        }
        if (!z11) {
            u.a("Updating the node of a group at " + i11 + " that was not created with as a node group");
        }
        this.f39398c[h(g(this.f39397b, iR))] = obj;
    }

    public final void a(int i11) {
        boolean z11 = false;
        if (!(i11 >= 0)) {
            u.a("Cannot seek backwards");
        }
        if (!(this.f39408n <= 0)) {
            r1.b("Cannot call seek() while inserting");
        }
        if (i11 == 0) {
            return;
        }
        int i12 = this.f39414t + i11;
        if (i12 >= this.f39416v && i12 <= this.f39415u) {
            z11 = true;
        }
        if (!z11) {
            u.a("Cannot seek outside the current group (" + this.f39416v + '-' + this.f39415u + ')');
        }
        this.f39414t = i12;
        int iG = g(this.f39397b, r(i12));
        this.f39404i = iG;
        this.f39405j = iG;
    }

    public final b b(int i11) {
        ArrayList arrayList = this.f39399d;
        int iE = o2.e(arrayList, i11, p());
        if (iE >= 0) {
            return (b) arrayList.get(iE);
        }
        if (i11 > this.f39402g) {
            i11 = -(p() - i11);
        }
        b bVar = new b(i11);
        arrayList.add(-(iE + 1), bVar);
        return bVar;
    }

    public final int c(b bVar) {
        int i11 = bVar.f39235a;
        return i11 < 0 ? p() + i11 : i11;
    }

    public final void d() {
        int i11 = this.f39408n;
        this.f39408n = i11 + 1;
        if (i11 == 0) {
            this.f39411q.d((o() - this.f39403h) - this.f39415u);
        }
    }

    public final void e(boolean z11) {
        this.f39417w = true;
        if (z11 && this.f39410p.f39388a == 0) {
            B(p());
            C(this.f39398c.length - this.f39407l, this.f39402g);
            int i11 = this.f39406k;
            Arrays.fill(this.f39398c, i11, this.f39407l + i11, (Object) null);
            G();
        }
        int[] iArr = this.f39397b;
        int i12 = this.f39402g;
        Object[] objArr = this.f39398c;
        int i13 = this.f39406k;
        ArrayList arrayList = this.f39399d;
        HashMap map = this.f39400e;
        y.x xVar = this.f39401f;
        m2 m2Var = this.f39396a;
        if (!m2Var.f39364t) {
            r1.a("Unexpected writer close()");
        }
        m2Var.f39364t = false;
        m2Var.f39358a = iArr;
        m2Var.f39359b = i12;
        m2Var.f39360c = objArr;
        m2Var.f39361d = i13;
        m2Var.K = arrayList;
        m2Var.L = map;
        m2Var.M = xVar;
    }

    public final int f(int i11) {
        return g(this.f39397b, r(i11));
    }

    public final int g(int[] iArr, int i11) {
        if (i11 >= o()) {
            return this.f39398c.length - this.f39407l;
        }
        int i12 = iArr[(i11 * 5) + 4];
        return i12 < 0 ? (this.f39398c.length - this.f39407l) + i12 + 1 : i12;
    }

    public final int h(int i11) {
        return (this.f39407l * (i11 < this.f39406k ? 0 : 1)) + i11;
    }

    public final void j() {
        y.e0 e0Var;
        boolean z11 = this.f39408n > 0;
        int i11 = this.f39414t;
        int i12 = this.f39415u;
        int i13 = this.f39416v;
        int iR = r(i13);
        int i14 = this.f39409o;
        int i15 = i11 - i13;
        int i16 = iR * 5;
        int i17 = i16 + 1;
        boolean z12 = (this.f39397b[i17] & 1073741824) != 0;
        p0 p0Var = this.f39412r;
        if (z11) {
            y.x xVar = this.f39413s;
            if (xVar != null && (e0Var = (y.e0) xVar.b(i13)) != null) {
                Object[] objArr = e0Var.f56686a;
                int i18 = e0Var.f56687b;
                for (int i19 = 0; i19 < i18; i19++) {
                    F(objArr[i19]);
                }
            }
            int[] iArr = this.f39397b;
            iArr[i16 + 3] = i15;
            o2.d(iR, i14, iArr);
            int iC = p0Var.c();
            if (z12) {
                i14 = 1;
            }
            this.f39409o = iC + i14;
            int iE = E(this.f39397b, i13);
            this.f39416v = iE;
            int iP = iE < 0 ? p() : r(iE + 1);
            int iG = iP >= 0 ? g(this.f39397b, iP) : 0;
            this.f39404i = iG;
            this.f39405j = iG;
            return;
        }
        if (i11 != i12) {
            u.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f39397b;
        int i21 = i16 + 3;
        int i22 = iArr2[i21];
        int i23 = iArr2[i17] & 67108863;
        iArr2[i21] = i15;
        o2.d(iR, i14, iArr2);
        int iC2 = this.f39410p.c();
        this.f39415u = (o() - this.f39403h) - this.f39411q.c();
        this.f39416v = iC2;
        int iE2 = E(this.f39397b, i13);
        int iC3 = p0Var.c();
        this.f39409o = iC3;
        if (iE2 == iC2) {
            this.f39409o = iC3 + (z12 ? 0 : i14 - i23);
            return;
        }
        int i24 = i15 - i22;
        int i25 = z12 ? 0 : i14 - i23;
        if (i24 != 0 || i25 != 0) {
            while (iE2 != 0 && iE2 != iC2 && (i25 != 0 || i24 != 0)) {
                int iR2 = r(iE2);
                if (i24 != 0) {
                    int[] iArr3 = this.f39397b;
                    int i26 = (iR2 * 5) + 3;
                    iArr3[i26] = iArr3[i26] + i24;
                }
                if (i25 != 0) {
                    int[] iArr4 = this.f39397b;
                    o2.d(iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i25, iArr4);
                }
                int[] iArr5 = this.f39397b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i25 = 0;
                }
                iE2 = E(iArr5, iE2);
            }
        }
        this.f39409o += i25;
    }

    public final void k() {
        if (this.f39408n <= 0) {
            r1.b("Unbalanced begin/end insert");
        }
        int i11 = this.f39408n - 1;
        this.f39408n = i11;
        if (i11 == 0) {
            if (this.f39412r.f39388a != this.f39410p.f39388a) {
                u.a("startGroup/endGroup mismatch while inserting");
            }
            this.f39415u = (o() - this.f39403h) - this.f39411q.c();
        }
    }

    public final void m(int i11, int i12, int i13) {
        if (i11 >= this.f39402g) {
            i11 = -((p() - i11) + 2);
        }
        while (i13 < i12) {
            this.f39397b[(r(i13) * 5) + 2] = i11;
            int i14 = this.f39397b[(r(i13) * 5) + 3] + i13;
            m(i13, i14, i13 + 1);
            i13 = i14;
        }
    }

    public final void n(int i11, fz.e eVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iE = E(this.f39397b, i11);
        int iP = p();
        int iU = u(i11) + i11;
        int i16 = i11;
        y.y yVar = null;
        y.w wVar = null;
        while (i16 < iU) {
            int iF = f(i16);
            int i17 = i16 + 1;
            int iF2 = f(i17);
            while (iF < iF2) {
                Object obj = this.f39398c[h(iF)];
                if (!(obj instanceof g2) || (i15 = ((g2) obj).f39310b) < 0) {
                    i14 = iE;
                    eVar.invoke(Integer.valueOf(iF), obj);
                } else {
                    int iU2 = u(i16) + i16;
                    int i18 = i17;
                    int i19 = 0;
                    while (i18 < iU2 && i19 < i15) {
                        int iR = r(i18);
                        int i21 = iE;
                        int[] iArr = this.f39397b;
                        int i22 = iR * 5;
                        i18 = iArr[i22 + 3] + i18;
                        if (i18 < iU2 && (iArr[i22 + 1] & 536870912) == 0) {
                            i19++;
                        }
                        iE = i21;
                    }
                    i14 = iE;
                    if (yVar == null) {
                        int[] iArr2 = y.o.f56744a;
                        yVar = new y.y();
                    }
                    if (wVar == null) {
                        wVar = new y.w();
                    }
                    yVar.a(i18);
                    wVar.a(i18);
                    wVar.a(iF);
                }
                iF++;
                iE = i14;
            }
            int i23 = iE;
            iE = i17 < iP ? E(this.f39397b, i17) : -1;
            if (iE != i16) {
                int iE2 = i23;
                while (true) {
                    if (wVar == null || yVar == null || !yVar.e(i16)) {
                        i12 = iP;
                    } else {
                        int i24 = wVar.f56783b;
                        int i25 = i24 / 2;
                        int i26 = 0;
                        int i27 = 0;
                        while (i26 < i25) {
                            int i28 = i26 * 2;
                            int i29 = iP;
                            int iC = wVar.c(i28);
                            if (iC == i16) {
                                int iC2 = wVar.c(i28 + 1);
                                eVar.invoke(Integer.valueOf(iC2), this.f39398c[h(iC2)]);
                            } else if (i28 != i27) {
                                int i30 = i27 + 1;
                                wVar.g(i27, iC);
                                i27 += 2;
                                wVar.g(i30, wVar.c(i28 + 1));
                            } else {
                                i27 += 2;
                            }
                            i26++;
                            eVar = eVar;
                            iP = i29;
                        }
                        i12 = iP;
                        if (i27 != i24) {
                            if (i27 < 0 || i27 > (i13 = wVar.f56783b) || i24 < 0 || i24 > i13) {
                                z.a.d("Index must be between 0 and size");
                                throw null;
                            }
                            if (i24 < i27) {
                                z.a.c("The end index must be < start index");
                                throw null;
                            }
                            if (i24 != i27) {
                                if (i24 < i13) {
                                    int[] iArr3 = wVar.f56782a;
                                    ry.l.H(i27, i24, iArr3, iArr3, i13);
                                }
                                wVar.f56783b -= i24 - i27;
                            }
                        }
                    }
                    if (i16 == i11 || iE2 == iE) {
                        break;
                    }
                    i16 = iE2;
                    iP = i12;
                    iE2 = E(this.f39397b, iE2);
                    eVar = eVar;
                }
            } else {
                i12 = iP;
            }
            i16 = i17;
            iP = i12;
        }
    }

    public final int o() {
        return this.f39397b.length / 5;
    }

    public final int p() {
        return o() - this.f39403h;
    }

    public final Object q(int i11) {
        int iR = r(i11);
        int[] iArr = this.f39397b;
        int i12 = (iR * 5) + 1;
        if ((iArr[i12] & 268435456) == 0) {
            return m.f39353a;
        }
        return this.f39398c[Integer.bitCount(iArr[i12] >> 29) + g(iArr, iR)];
    }

    public final int r(int i11) {
        return (this.f39403h * (i11 < this.f39402g ? 0 : 1)) + i11;
    }

    public final int s(int i11) {
        return this.f39397b[r(i11) * 5];
    }

    public final Object t(int i11) {
        int iR = r(i11);
        int[] iArr = this.f39397b;
        int i12 = iR * 5;
        int i13 = iArr[i12 + 1];
        if ((536870912 & i13) == 0) {
            return null;
        }
        return this.f39398c[Integer.bitCount(i13 >> 30) + iArr[i12 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f39414t + " end=" + this.f39415u + " size = " + p() + " gap=" + this.f39402g + '-' + (this.f39402g + this.f39403h) + ')';
    }

    public final int u(int i11) {
        return o2.a(this.f39397b, r(i11));
    }

    public final boolean v(int i11, int i12) {
        int iO;
        int iU;
        if (i12 == this.f39416v) {
            iO = this.f39415u;
        } else {
            p0 p0Var = this.f39410p;
            if (i12 > p0Var.b(0)) {
                iU = u(i12);
            } else {
                int[] iArr = p0Var.f39389b;
                int iMin = Math.min(iArr.length, p0Var.f39388a);
                int i13 = 0;
                while (true) {
                    if (i13 >= iMin) {
                        i13 = -1;
                        break;
                    }
                    if (iArr[i13] == i12) {
                        break;
                    }
                    i13++;
                }
                if (i13 < 0) {
                    iU = u(i12);
                } else {
                    iO = (o() - this.f39403h) - this.f39411q.f39389b[i13];
                }
            }
            iO = iU + i12;
        }
        return i11 > i12 && i11 < iO;
    }

    public final void w(int i11) {
        if (i11 > 0) {
            int i12 = this.f39414t;
            B(i12);
            int i13 = this.f39402g;
            int i14 = this.f39403h;
            int[] iArr = this.f39397b;
            int length = iArr.length / 5;
            int i15 = length - i14;
            if (i14 < i11) {
                int iMax = Math.max(Math.max(length * 2, i15 + i11), 32);
                int[] iArr2 = new int[iMax * 5];
                int i16 = iMax - i15;
                ry.l.H(0, 0, iArr, iArr2, i13 * 5);
                ry.l.H((i13 + i16) * 5, (i14 + i13) * 5, iArr, iArr2, length * 5);
                this.f39397b = iArr2;
                i14 = i16;
            }
            int i17 = this.f39415u;
            if (i17 >= i13) {
                this.f39415u = i17 + i11;
            }
            int i18 = i13 + i11;
            this.f39402g = i18;
            this.f39403h = i14 - i11;
            int i19 = i(i15 > 0 ? f(i12 + i11) : 0, this.m >= i13 ? this.f39406k : 0, this.f39407l, this.f39398c.length);
            for (int i21 = i13; i21 < i18; i21++) {
                this.f39397b[(i21 * 5) + 4] = i19;
            }
            int i22 = this.m;
            if (i22 >= i13) {
                this.m = i22 + i11;
            }
        }
    }

    public final void x(int i11, int i12) {
        if (i11 > 0) {
            C(this.f39404i, i12);
            int i13 = this.f39406k;
            int i14 = this.f39407l;
            if (i14 < i11) {
                Object[] objArr = this.f39398c;
                int length = objArr.length;
                int i15 = length - i14;
                int iMax = Math.max(Math.max(length * 2, i15 + i11), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i16 = 0; i16 < iMax; i16++) {
                    objArr2[i16] = null;
                }
                int i17 = iMax - i15;
                int i18 = i14 + i13;
                System.arraycopy(objArr, 0, objArr2, 0, i13);
                System.arraycopy(objArr, i18, objArr2, i13 + i17, length - i18);
                this.f39398c = objArr2;
                i14 = i17;
            }
            int i19 = this.f39405j;
            if (i19 >= i13) {
                this.f39405j = i19 + i11;
            }
            this.f39406k = i13 + i11;
            this.f39407l = i14 - i11;
        }
    }

    public final boolean y(int i11) {
        return (this.f39397b[(r(i11) * 5) + 1] & 1073741824) != 0;
    }

    public final void l(int i11) {
        boolean z11 = false;
        if (!(this.f39408n <= 0)) {
            u.a(ADSb.OhEJTipkHtkBAi);
        }
        int i12 = this.f39416v;
        if (i12 != i11) {
            if (i11 >= i12 && i11 < this.f39415u) {
                z11 = true;
            }
            if (!z11) {
                u.a("Started group at " + i11 + " must be a subgroup of the group at " + i12);
            }
            int i13 = this.f39414t;
            int i14 = this.f39404i;
            int i15 = this.f39405j;
            this.f39414t = i11;
            P();
            this.f39414t = i13;
            this.f39404i = i14;
            this.f39405j = i15;
        }
    }
}
