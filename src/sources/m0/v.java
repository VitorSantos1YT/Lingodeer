package m0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f40635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f40636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f40641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f40642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40643i;

    public v(j jVar) {
        this.f40635a = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new s(0, 0));
        this.f40636b = arrayList;
        this.f40640f = -1;
        this.f40641g = new ArrayList();
        this.f40642h = ry.r.f50854a;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.f40643i))) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    public final u b(int i11) {
        int i12;
        boolean z11;
        int i13;
        int i14;
        ?? r9;
        if (!this.f40635a.f40565d) {
            int i15 = this.f40643i;
            int i16 = i11 * i15;
            int iD = d() - i16;
            if (i15 > iD) {
                i15 = iD;
            }
            if (i15 < 0) {
                i15 = 0;
            }
            if (i15 == this.f40642h.size()) {
                r9 = this.f40642h;
            } else {
                ArrayList arrayList = new ArrayList(i15);
                for (int i17 = 0; i17 < i15; i17++) {
                    arrayList.add(new d(ob.f.a(1)));
                }
                this.f40642h = arrayList;
                r9 = arrayList;
            }
            return new u(i16, r9);
        }
        int iA = i11 / a();
        ArrayList arrayList2 = this.f40636b;
        int iMin = Math.min(iA, arrayList2.size() - 1);
        int iA2 = a() * iMin;
        int iIntValue = ((s) arrayList2.get(iMin)).f40630a;
        int iE = ((s) arrayList2.get(iMin)).f40631b;
        int i18 = this.f40637c;
        ArrayList arrayList3 = this.f40641g;
        if (iA2 <= i18 && i18 <= i11) {
            iIntValue = this.f40638d;
            iE = this.f40639e;
            iA2 = i18;
        } else if (iMin == this.f40640f && (i12 = i11 - iA2) < arrayList3.size()) {
            iIntValue = ((Number) arrayList3.get(i12)).intValue();
            iA2 = i11;
            iE = 0;
        }
        if (iA2 % a() == 0) {
            int i19 = i11 - iA2;
            z11 = 2 <= i19 && i19 < a();
        }
        if (z11) {
            this.f40640f = iMin;
            arrayList3.clear();
        }
        if (iA2 > i11) {
            i0.a.c("currentLine (" + iA2 + ") > lineIndex (" + i11 + ')');
        }
        while (iA2 < i11 && iIntValue < d()) {
            if (z11) {
                arrayList3.add(Integer.valueOf(iIntValue));
            }
            int i21 = 0;
            while (i21 < this.f40643i && iIntValue < d()) {
                if (iE == 0) {
                    i14 = iE;
                    iE = e(iIntValue);
                } else {
                    i14 = 0;
                }
                i21 += iE;
                if (i21 > this.f40643i) {
                    break;
                }
                iIntValue++;
                iE = i14;
            }
            iA2++;
            if (iA2 % a() == 0 && iIntValue < d()) {
                if (arrayList2.size() != iA2 / a()) {
                    i0.a.c("invalid starting point");
                }
                arrayList2.add(new s(iIntValue, iE));
            }
        }
        this.f40637c = i11;
        this.f40638d = iIntValue;
        this.f40639e = iE;
        ArrayList arrayList4 = new ArrayList();
        int i22 = 0;
        int i23 = iIntValue;
        while (i22 < this.f40643i && i23 < d()) {
            if (iE == 0) {
                int i24 = iE;
                iE = e(i23);
                i13 = i24;
            } else {
                i13 = 0;
            }
            i22 += iE;
            if (i22 > this.f40643i) {
                break;
            }
            i23++;
            arrayList4.add(new d(ob.f.a(iE)));
            iE = i13;
        }
        return new u(iIntValue, arrayList4);
    }

    public final int c(int i11) {
        int i12;
        if (d() <= 0) {
            return 0;
        }
        if (i11 >= d()) {
            i0.a.a("ItemIndex > total count");
        }
        if (!this.f40635a.f40565d) {
            return i11 / this.f40643i;
        }
        ArrayList arrayList = this.f40636b;
        int size = arrayList.size();
        ns.o.Q(arrayList.size(), size);
        int i13 = size - 1;
        int i14 = 0;
        while (true) {
            if (i14 > i13) {
                i12 = -(i14 + 1);
                break;
            }
            i12 = (i14 + i13) >>> 1;
            int i15 = ((s) arrayList.get(i12)).f40630a - i11;
            if (i15 >= 0) {
                if (i15 <= 0) {
                    break;
                }
                i13 = i12 - 1;
            } else {
                i14 = i12 + 1;
            }
        }
        if (i12 < 0) {
            i12 = (-i12) - 2;
        }
        int iA = a() * i12;
        int i16 = ((s) arrayList.get(i12)).f40630a;
        if (i16 > i11) {
            i0.a.a("currentItemIndex > itemIndex");
        }
        int i17 = 0;
        while (i16 < i11) {
            int i18 = i16 + 1;
            int iE = e(i16);
            i17 += iE;
            int i19 = this.f40643i;
            if (i17 >= i19) {
                if (i17 == i19) {
                    iA++;
                    i17 = 0;
                } else {
                    iA++;
                    i17 = iE;
                }
            }
            if (iA % a() == 0 && iA / a() >= arrayList.size()) {
                arrayList.add(new s(i18 - (i17 > 0 ? 1 : 0), 0));
            }
            i16 = i18;
        }
        return e(i11) + i17 > this.f40643i ? iA + 1 : iA;
    }

    public final int d() {
        return this.f40635a.f40564c.f34421b;
    }

    public final int e(int i11) {
        n0.h hVarH = this.f40635a.f40564c.h(i11);
        int i12 = i11 - hVarH.f42946a;
        return (int) ((d) ((h) hVarH.f42948c).f40557b.invoke(t.f40632a, Integer.valueOf(i12))).f40543a;
    }
}
