package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f2409d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.d f2406a = new b4.d(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2407b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2408c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2411f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f2410e = new c(this);

    public b(y0 y0Var) {
        this.f2409d = y0Var;
    }

    public final boolean a(int i11) {
        ArrayList arrayList = this.f2408c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar = (a) arrayList.get(i12);
            int i13 = aVar.f2398a;
            if (i13 != 8) {
                if (i13 == 1) {
                    int i14 = aVar.f2399b;
                    int i15 = aVar.f2401d + i14;
                    while (i14 < i15) {
                        if (f(i14, i12 + 1) == i11) {
                            return true;
                        }
                        i14++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(aVar.f2401d, i12 + 1) == i11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f2408c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f2409d.a((a) arrayList.get(i11));
        }
        k(arrayList);
        this.f2411f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f2407b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f2398a;
            y0 y0Var = this.f2409d;
            if (i12 == 1) {
                y0Var.a(aVar);
                int i13 = aVar.f2399b;
                int i14 = aVar.f2401d;
                RecyclerView recyclerView = y0Var.f2652a;
                recyclerView.offsetPositionRecordsForInsert(i13, i14);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i12 == 2) {
                y0Var.a(aVar);
                int i15 = aVar.f2399b;
                int i16 = aVar.f2401d;
                RecyclerView recyclerView2 = y0Var.f2652a;
                recyclerView2.offsetPositionRecordsForRemove(i15, i16, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f2426c += i16;
            } else if (i12 == 4) {
                y0Var.a(aVar);
                int i17 = aVar.f2399b;
                int i18 = aVar.f2401d;
                Object obj = aVar.f2400c;
                RecyclerView recyclerView3 = y0Var.f2652a;
                recyclerView3.viewRangeUpdate(i17, i18, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i12 == 8) {
                y0Var.a(aVar);
                int i19 = aVar.f2399b;
                int i21 = aVar.f2401d;
                RecyclerView recyclerView4 = y0Var.f2652a;
                recyclerView4.offsetPositionRecordsForMove(i19, i21);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        k(arrayList);
        this.f2411f = 0;
    }

    public final void d(a aVar) {
        int i11;
        b4.d dVar;
        int i12 = aVar.f2398a;
        if (i12 == 1 || i12 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(aVar.f2399b, i12);
        int i13 = aVar.f2399b;
        int i14 = aVar.f2398a;
        if (i14 == 2) {
            i11 = 0;
        } else {
            if (i14 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i11 = 1;
        }
        int i15 = 1;
        int i16 = 1;
        while (true) {
            int i17 = aVar.f2401d;
            dVar = this.f2406a;
            if (i15 >= i17) {
                break;
            }
            int iL2 = l((i11 * i15) + aVar.f2399b, aVar.f2398a);
            int i18 = aVar.f2398a;
            if (i18 == 2 ? iL2 != iL : !(i18 == 4 && iL2 == iL + 1)) {
                a aVarH = h(aVar.f2400c, i18, iL, i16);
                e(aVarH, i13);
                aVarH.f2400c = null;
                dVar.c(aVarH);
                if (aVar.f2398a == 4) {
                    i13 += i16;
                }
                i16 = 1;
                iL = iL2;
            } else {
                i16++;
            }
            i15++;
        }
        Object obj = aVar.f2400c;
        aVar.f2400c = null;
        dVar.c(aVar);
        if (i16 > 0) {
            a aVarH2 = h(obj, aVar.f2398a, iL, i16);
            e(aVarH2, i13);
            aVarH2.f2400c = null;
            dVar.c(aVarH2);
        }
    }

    public final void e(a aVar, int i11) {
        y0 y0Var = this.f2409d;
        y0Var.a(aVar);
        RecyclerView recyclerView = y0Var.f2652a;
        int i12 = aVar.f2398a;
        if (i12 != 2) {
            if (i12 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            recyclerView.viewRangeUpdate(i11, aVar.f2401d, aVar.f2400c);
            recyclerView.mItemsChanged = true;
            return;
        }
        int i13 = aVar.f2401d;
        recyclerView.offsetPositionRecordsForRemove(i11, i13, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f2426c += i13;
    }

    public final int f(int i11, int i12) {
        ArrayList arrayList = this.f2408c;
        int size = arrayList.size();
        while (i12 < size) {
            a aVar = (a) arrayList.get(i12);
            int i13 = aVar.f2398a;
            if (i13 == 8) {
                int i14 = aVar.f2399b;
                if (i14 == i11) {
                    i11 = aVar.f2401d;
                } else {
                    if (i14 < i11) {
                        i11--;
                    }
                    if (aVar.f2401d <= i11) {
                        i11++;
                    }
                }
            } else {
                int i15 = aVar.f2399b;
                if (i15 > i11) {
                    continue;
                } else if (i13 == 2) {
                    int i16 = aVar.f2401d;
                    if (i11 < i15 + i16) {
                        return -1;
                    }
                    i11 -= i16;
                } else if (i13 == 1) {
                    i11 += aVar.f2401d;
                }
            }
            i12++;
        }
        return i11;
    }

    public final boolean g() {
        return this.f2407b.size() > 0;
    }

    public final a h(Object obj, int i11, int i12, int i13) {
        a aVar = (a) this.f2406a.acquire();
        if (aVar != null) {
            aVar.f2398a = i11;
            aVar.f2399b = i12;
            aVar.f2401d = i13;
            aVar.f2400c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f2398a = i11;
        aVar2.f2399b = i12;
        aVar2.f2401d = i13;
        aVar2.f2400c = obj;
        return aVar2;
    }

    public final void i(a aVar) {
        this.f2408c.add(aVar);
        int i11 = aVar.f2398a;
        y0 y0Var = this.f2409d;
        if (i11 == 1) {
            int i12 = aVar.f2399b;
            int i13 = aVar.f2401d;
            RecyclerView recyclerView = y0Var.f2652a;
            recyclerView.offsetPositionRecordsForInsert(i12, i13);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i11 == 2) {
            int i14 = aVar.f2399b;
            int i15 = aVar.f2401d;
            RecyclerView recyclerView2 = y0Var.f2652a;
            recyclerView2.offsetPositionRecordsForRemove(i14, i15, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i11 == 4) {
            int i16 = aVar.f2399b;
            int i17 = aVar.f2401d;
            Object obj = aVar.f2400c;
            RecyclerView recyclerView3 = y0Var.f2652a;
            recyclerView3.viewRangeUpdate(i16, i17, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i11 != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
        int i18 = aVar.f2399b;
        int i19 = aVar.f2401d;
        RecyclerView recyclerView4 = y0Var.f2652a;
        recyclerView4.offsetPositionRecordsForMove(i18, i19);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017d  */
    /* JADX WARN: Code duplicated, block: B:104:0x018b  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0208  */
    /* JADX WARN: Code duplicated, block: B:166:0x027a  */
    /* JADX WARN: Code duplicated, block: B:199:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x012d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x014e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0154  */
    /* JADX WARN: Code duplicated, block: B:90:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x015c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0167  */
    /* JADX WARN: Code duplicated, block: B:98:0x0172  */
    public final void j() {
        ArrayList arrayList;
        int i11;
        byte b3;
        int i12;
        int i13;
        int i14;
        boolean z11;
        byte b11;
        a aVarH;
        int i15;
        int i16;
        int i17;
        a aVarH2;
        boolean z12;
        boolean z13;
        Object obj;
        a aVar;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        c cVar = this.f2410e;
        cVar.getClass();
        while (true) {
            arrayList = this.f2407b;
            int size = arrayList.size() - 1;
            boolean z14 = false;
            while (true) {
                i11 = 8;
                b3 = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((a) arrayList.get(size)).f2398a != 8) {
                    z14 = true;
                } else if (z14) {
                    break;
                }
                size--;
            }
            i12 = 2;
            i13 = 4;
            if (size == -1) {
                break;
            }
            int i27 = size + 1;
            b bVar = (b) cVar.f2417a;
            b4.d dVar = bVar.f2406a;
            a aVar2 = (a) arrayList.get(size);
            a aVar3 = (a) arrayList.get(i27);
            int i28 = aVar3.f2398a;
            if (i28 == 1) {
                int i29 = aVar2.f2401d;
                int i30 = aVar3.f2399b;
                int i31 = i29 < i30 ? -1 : 0;
                int i32 = aVar2.f2399b;
                if (i32 < i30) {
                    i31++;
                }
                if (i30 <= i32) {
                    aVar2.f2399b = i32 + aVar3.f2401d;
                }
                int i33 = aVar3.f2399b;
                if (i33 <= i29) {
                    aVar2.f2401d = i29 + aVar3.f2401d;
                }
                aVar3.f2399b = i33 + i31;
                arrayList.set(size, aVar3);
                arrayList.set(i27, aVar2);
            } else if (i28 == 2) {
                int i34 = aVar2.f2399b;
                int i35 = aVar2.f2401d;
                if (i34 < i35) {
                    z13 = aVar3.f2399b == i34 && aVar3.f2401d == i35 - i34;
                    z12 = false;
                } else if (aVar3.f2399b == i35 + 1 && aVar3.f2401d == i34 - i35) {
                    z13 = true;
                    z12 = true;
                } else {
                    z12 = true;
                    z13 = false;
                }
                int i36 = aVar3.f2399b;
                if (i35 < i36) {
                    aVar3.f2399b = i36 - 1;
                } else {
                    int i37 = aVar3.f2401d;
                    if (i35 < i36 + i37) {
                        aVar3.f2401d = i37 - 1;
                        aVar2.f2398a = 2;
                        aVar2.f2401d = 1;
                        if (aVar3.f2401d == 0) {
                            arrayList.remove(i27);
                            aVar3.f2400c = null;
                            dVar.c(aVar3);
                        }
                    }
                }
                int i38 = aVar2.f2399b;
                int i39 = aVar3.f2399b;
                if (i38 <= i39) {
                    aVar3.f2399b = i39 + 1;
                } else {
                    int i40 = i39 + aVar3.f2401d;
                    if (i38 < i40) {
                        obj = null;
                        a aVarH3 = bVar.h(null, 2, i38 + 1, i40 - i38);
                        aVar3.f2401d = aVar2.f2399b - aVar3.f2399b;
                        aVar = aVarH3;
                    }
                    if (z13) {
                        arrayList.set(size, aVar3);
                        arrayList.remove(i27);
                        aVar2.f2400c = obj;
                        dVar.c(aVar2);
                    } else {
                        if (z12) {
                            if (aVar != null) {
                                i25 = aVar2.f2399b;
                                if (i25 > aVar.f2399b) {
                                    aVar2.f2399b = i25 - aVar.f2401d;
                                }
                                i26 = aVar2.f2401d;
                                if (i26 > aVar.f2399b) {
                                    aVar2.f2401d = i26 - aVar.f2401d;
                                }
                            }
                            i23 = aVar2.f2399b;
                            if (i23 > aVar3.f2399b) {
                                aVar2.f2399b = i23 - aVar3.f2401d;
                            }
                            i24 = aVar2.f2401d;
                            if (i24 > aVar3.f2399b) {
                                aVar2.f2401d = i24 - aVar3.f2401d;
                            }
                        } else {
                            if (aVar != null) {
                                i21 = aVar2.f2399b;
                                if (i21 >= aVar.f2399b) {
                                    aVar2.f2399b = i21 - aVar.f2401d;
                                }
                                i22 = aVar2.f2401d;
                                if (i22 >= aVar.f2399b) {
                                    aVar2.f2401d = i22 - aVar.f2401d;
                                }
                            }
                            i18 = aVar2.f2399b;
                            if (i18 >= aVar3.f2399b) {
                                aVar2.f2399b = i18 - aVar3.f2401d;
                            }
                            i19 = aVar2.f2401d;
                            if (i19 >= aVar3.f2399b) {
                                aVar2.f2401d = i19 - aVar3.f2401d;
                            }
                        }
                        arrayList.set(size, aVar3);
                        if (aVar2.f2399b != aVar2.f2401d) {
                            arrayList.set(i27, aVar2);
                        } else {
                            arrayList.remove(i27);
                        }
                        if (aVar != null) {
                            arrayList.add(size, aVar);
                        }
                    }
                }
                obj = null;
                aVar = null;
                if (z13) {
                    arrayList.set(size, aVar3);
                    arrayList.remove(i27);
                    aVar2.f2400c = obj;
                    dVar.c(aVar2);
                } else {
                    if (z12) {
                        if (aVar != null) {
                            i25 = aVar2.f2399b;
                            if (i25 > aVar.f2399b) {
                                aVar2.f2399b = i25 - aVar.f2401d;
                            }
                            i26 = aVar2.f2401d;
                            if (i26 > aVar.f2399b) {
                                aVar2.f2401d = i26 - aVar.f2401d;
                            }
                        }
                        i23 = aVar2.f2399b;
                        if (i23 > aVar3.f2399b) {
                            aVar2.f2399b = i23 - aVar3.f2401d;
                        }
                        i24 = aVar2.f2401d;
                        if (i24 > aVar3.f2399b) {
                            aVar2.f2401d = i24 - aVar3.f2401d;
                        }
                    } else {
                        if (aVar != null) {
                            i21 = aVar2.f2399b;
                            if (i21 >= aVar.f2399b) {
                                aVar2.f2399b = i21 - aVar.f2401d;
                            }
                            i22 = aVar2.f2401d;
                            if (i22 >= aVar.f2399b) {
                                aVar2.f2401d = i22 - aVar.f2401d;
                            }
                        }
                        i18 = aVar2.f2399b;
                        if (i18 >= aVar3.f2399b) {
                            aVar2.f2399b = i18 - aVar3.f2401d;
                        }
                        i19 = aVar2.f2401d;
                        if (i19 >= aVar3.f2399b) {
                            aVar2.f2401d = i19 - aVar3.f2401d;
                        }
                    }
                    arrayList.set(size, aVar3);
                    if (aVar2.f2399b != aVar2.f2401d) {
                        arrayList.set(i27, aVar2);
                    } else {
                        arrayList.remove(i27);
                    }
                    if (aVar != null) {
                        arrayList.add(size, aVar);
                    }
                }
            } else if (i28 == 4) {
                int i41 = aVar2.f2401d;
                int i42 = aVar3.f2399b;
                if (i41 < i42) {
                    aVar3.f2399b = i42 - 1;
                } else {
                    int i43 = aVar3.f2401d;
                    if (i41 < i42 + i43) {
                        aVar3.f2401d = i43 - 1;
                        aVarH = bVar.h(aVar3.f2400c, 4, aVar2.f2399b, 1);
                    }
                    i15 = aVar2.f2399b;
                    i16 = aVar3.f2399b;
                    if (i15 <= i16) {
                        aVar3.f2399b = i16 + 1;
                    } else {
                        i17 = i16 + aVar3.f2401d;
                        if (i15 < i17) {
                            int i44 = i17 - i15;
                            aVarH2 = bVar.h(aVar3.f2400c, 4, i15 + 1, i44);
                            aVar3.f2401d -= i44;
                        }
                        arrayList.set(i27, aVar2);
                        if (aVar3.f2401d > 0) {
                            arrayList.set(size, aVar3);
                        } else {
                            arrayList.remove(size);
                            aVar3.f2400c = null;
                            dVar.c(aVar3);
                        }
                        if (aVarH != null) {
                            arrayList.add(size, aVarH);
                        }
                        if (aVarH2 != null) {
                            arrayList.add(size, aVarH2);
                        }
                    }
                    aVarH2 = null;
                    arrayList.set(i27, aVar2);
                    if (aVar3.f2401d > 0) {
                        arrayList.set(size, aVar3);
                    } else {
                        arrayList.remove(size);
                        aVar3.f2400c = null;
                        dVar.c(aVar3);
                    }
                    if (aVarH != null) {
                        arrayList.add(size, aVarH);
                    }
                    if (aVarH2 != null) {
                        arrayList.add(size, aVarH2);
                    }
                }
                aVarH = null;
                i15 = aVar2.f2399b;
                i16 = aVar3.f2399b;
                if (i15 <= i16) {
                    aVar3.f2399b = i16 + 1;
                } else {
                    i17 = i16 + aVar3.f2401d;
                    if (i15 < i17) {
                        int i45 = i17 - i15;
                        aVarH2 = bVar.h(aVar3.f2400c, 4, i15 + 1, i45);
                        aVar3.f2401d -= i45;
                    }
                    arrayList.set(i27, aVar2);
                    if (aVar3.f2401d > 0) {
                        arrayList.set(size, aVar3);
                    } else {
                        arrayList.remove(size);
                        aVar3.f2400c = null;
                        dVar.c(aVar3);
                    }
                    if (aVarH != null) {
                        arrayList.add(size, aVarH);
                    }
                    if (aVarH2 != null) {
                        arrayList.add(size, aVarH2);
                    }
                }
                aVarH2 = null;
                arrayList.set(i27, aVar2);
                if (aVar3.f2401d > 0) {
                    arrayList.set(size, aVar3);
                } else {
                    arrayList.remove(size);
                    aVar3.f2400c = null;
                    dVar.c(aVar3);
                }
                if (aVarH != null) {
                    arrayList.add(size, aVarH);
                }
                if (aVarH2 != null) {
                    arrayList.add(size, aVarH2);
                }
            }
        }
        int size2 = arrayList.size();
        int i46 = 0;
        while (i46 < size2) {
            a aVarH4 = (a) arrayList.get(i46);
            int i47 = aVarH4.f2398a;
            if (i47 != 1) {
                b4.d dVar2 = this.f2406a;
                y0 y0Var = this.f2409d;
                if (i47 == i12) {
                    int i48 = aVarH4.f2399b;
                    int i49 = aVarH4.f2401d + i48;
                    int i50 = i48;
                    int i51 = 0;
                    byte b12 = -1;
                    while (i50 < i49) {
                        RecyclerView recyclerView = y0Var.f2652a;
                        g2 g2VarFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i50, true);
                        if (g2VarFindViewHolderForPosition == null) {
                            g2VarFindViewHolderForPosition = null;
                        } else {
                            if (recyclerView.mChildHelper.f2449c.contains(g2VarFindViewHolderForPosition.itemView)) {
                                g2VarFindViewHolderForPosition = null;
                            }
                        }
                        if (g2VarFindViewHolderForPosition != null || a(i50)) {
                            if (b12 == 0) {
                                d(h(null, 2, i48, i51));
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            b11 = 1;
                        } else {
                            if (b12 == 1) {
                                i(h(null, 2, i48, i51));
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            b11 = 0;
                        }
                        if (z11) {
                            i50 -= i51;
                            i49 -= i51;
                            i51 = 1;
                        } else {
                            i51++;
                        }
                        i50++;
                        b12 = b11;
                    }
                    if (i51 != aVarH4.f2401d) {
                        aVarH4.f2400c = null;
                        dVar2.c(aVarH4);
                        i14 = 2;
                        aVarH4 = h(null, 2, i48, i51);
                    } else {
                        i14 = 2;
                    }
                    if (b12 == 0) {
                        d(aVarH4);
                    } else {
                        i(aVarH4);
                    }
                } else if (i47 != i13) {
                    if (i47 == i11) {
                        i(aVarH4);
                    }
                    i14 = i12;
                } else {
                    int i52 = aVarH4.f2399b;
                    int i53 = aVarH4.f2401d + i52;
                    int i54 = i52;
                    byte b13 = b3;
                    int i55 = 0;
                    while (i52 < i53) {
                        RecyclerView recyclerView2 = y0Var.f2652a;
                        g2 g2VarFindViewHolderForPosition2 = recyclerView2.findViewHolderForPosition(i52, true);
                        if (g2VarFindViewHolderForPosition2 == null) {
                            g2VarFindViewHolderForPosition2 = null;
                        } else {
                            if (recyclerView2.mChildHelper.f2449c.contains(g2VarFindViewHolderForPosition2.itemView)) {
                                g2VarFindViewHolderForPosition2 = null;
                            }
                        }
                        if (g2VarFindViewHolderForPosition2 != null || a(i52)) {
                            if (b13 == 0) {
                                d(h(aVarH4.f2400c, 4, i54, i55));
                                i54 = i52;
                                i55 = 0;
                            }
                            b13 = 1;
                        } else {
                            if (b13 == 1) {
                                i(h(aVarH4.f2400c, 4, i54, i55));
                                i54 = i52;
                                i55 = 0;
                            }
                            b13 = 0;
                        }
                        i55++;
                        i52++;
                    }
                    if (i55 != aVarH4.f2401d) {
                        Object obj2 = aVarH4.f2400c;
                        aVarH4.f2400c = null;
                        dVar2.c(aVarH4);
                        aVarH4 = h(obj2, 4, i54, i55);
                    }
                    if (b13 == 0) {
                        d(aVarH4);
                    } else {
                        i(aVarH4);
                    }
                    i14 = 2;
                }
            } else {
                i14 = i12;
                i(aVarH4);
            }
            i46++;
            i12 = i14;
            i11 = 8;
            b3 = -1;
            i13 = 4;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            aVar.f2400c = null;
            this.f2406a.c(aVar);
        }
        arrayList.clear();
    }

    public final int l(int i11, int i12) {
        int i13;
        int i14;
        ArrayList arrayList = this.f2408c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i15 = aVar.f2398a;
            if (i15 == 8) {
                int i16 = aVar.f2399b;
                int i17 = aVar.f2401d;
                if (i16 < i17) {
                    i14 = i16;
                    i13 = i17;
                } else {
                    i13 = i16;
                    i14 = i17;
                }
                if (i11 < i14 || i11 > i13) {
                    if (i11 < i16) {
                        if (i12 == 1) {
                            aVar.f2399b = i16 + 1;
                            aVar.f2401d = i17 + 1;
                        } else if (i12 == 2) {
                            aVar.f2399b = i16 - 1;
                            aVar.f2401d = i17 - 1;
                        }
                    }
                } else if (i14 == i16) {
                    if (i12 == 1) {
                        aVar.f2401d = i17 + 1;
                    } else if (i12 == 2) {
                        aVar.f2401d = i17 - 1;
                    }
                    i11++;
                } else {
                    if (i12 == 1) {
                        aVar.f2399b = i16 + 1;
                    } else if (i12 == 2) {
                        aVar.f2399b = i16 - 1;
                    }
                    i11--;
                }
            } else {
                int i18 = aVar.f2399b;
                if (i18 <= i11) {
                    if (i15 == 1) {
                        i11 -= aVar.f2401d;
                    } else if (i15 == 2) {
                        i11 += aVar.f2401d;
                    }
                } else if (i12 == 1) {
                    aVar.f2399b = i18 + 1;
                } else if (i12 == 2) {
                    aVar.f2399b = i18 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            int i19 = aVar2.f2398a;
            b4.d dVar = this.f2406a;
            if (i19 == 8) {
                int i21 = aVar2.f2401d;
                if (i21 == aVar2.f2399b || i21 < 0) {
                    arrayList.remove(size2);
                    aVar2.f2400c = null;
                    dVar.c(aVar2);
                }
            } else if (aVar2.f2401d <= 0) {
                arrayList.remove(size2);
                aVar2.f2400c = null;
                dVar.c(aVar2);
            }
        }
        return i11;
    }
}
