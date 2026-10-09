package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f2577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f2578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f2579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2582g;

    public p(u uVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z11) {
        int i11;
        int i12;
        this.f2576a = arrayList;
        this.f2577b = iArr;
        this.f2578c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f2579d = uVar;
        int oldListSize = uVar.getOldListSize();
        this.f2580e = oldListSize;
        int newListSize = uVar.getNewListSize();
        this.f2581f = newListSize;
        this.f2582g = z11;
        o oVar = arrayList.isEmpty() ? null : (o) arrayList.get(0);
        if (oVar == null || oVar.f2554a != 0 || oVar.f2555b != 0) {
            arrayList.add(0, new o(0, 0, 0));
        }
        arrayList.add(new o(oldListSize, newListSize, 0));
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            o oVar2 = (o) obj;
            for (int i14 = 0; i14 < oVar2.f2556c; i14++) {
                int i15 = oVar2.f2554a + i14;
                int i16 = oVar2.f2555b + i14;
                int i17 = uVar.areContentsTheSame(i15, i16) ? 1 : 2;
                iArr[i15] = (i16 << 4) | i17;
                iArr2[i16] = (i15 << 4) | i17;
            }
        }
        if (this.f2582g) {
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i19 < size2) {
                Object obj2 = arrayList.get(i19);
                i19++;
                o oVar3 = (o) obj2;
                while (true) {
                    i11 = oVar3.f2554a;
                    if (i18 < i11) {
                        if (iArr[i18] == 0) {
                            int size3 = arrayList.size();
                            int i21 = 0;
                            for (int i22 = 0; i22 < size3; i22++) {
                                o oVar4 = (o) arrayList.get(i22);
                                while (true) {
                                    i12 = oVar4.f2555b;
                                    if (i21 < i12) {
                                        if (iArr2[i21] == 0 && uVar.areItemsTheSame(i18, i21)) {
                                            int i23 = uVar.areContentsTheSame(i18, i21) ? 8 : 4;
                                            iArr[i18] = (i21 << 4) | i23;
                                            iArr2[i21] = i23 | (i18 << 4);
                                            break;
                                        }
                                        i21++;
                                    }
                                }
                                i21 = oVar4.f2556c + i12;
                            }
                        }
                        i18++;
                    }
                }
                i18 = oVar3.f2556c + i11;
            }
        }
    }

    public static r b(ArrayDeque arrayDeque, int i11, boolean z11) {
        r rVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                rVar = null;
                break;
            }
            rVar = (r) it.next();
            if (rVar.f2599a == i11 && rVar.f2601c == z11) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            r rVar2 = (r) it.next();
            if (z11) {
                rVar2.f2600b--;
            } else {
                rVar2.f2600b++;
            }
        }
        return rVar;
    }

    public final void a(s0 s0Var) {
        int[] iArr;
        u uVar;
        int i11;
        int i12;
        ArrayList arrayList;
        p pVar = this;
        d dVar = s0Var instanceof d ? (d) s0Var : new d(s0Var);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = pVar.f2576a;
        boolean z11 = true;
        int size = arrayList2.size() - 1;
        int i13 = pVar.f2580e;
        int i14 = pVar.f2581f;
        int i15 = i13;
        while (size >= 0) {
            o oVar = (o) arrayList2.get(size);
            int i16 = oVar.f2554a;
            int i17 = oVar.f2556c;
            int i18 = i16 + i17;
            int i19 = oVar.f2555b;
            int i21 = i19 + i17;
            while (true) {
                iArr = pVar.f2577b;
                uVar = pVar.f2579d;
                boolean z12 = z11;
                i11 = 0;
                if (i15 <= i18) {
                    break;
                }
                i15--;
                int i22 = iArr[i15];
                if ((i22 & 12) != 0) {
                    arrayList = arrayList2;
                    int i23 = i22 >> 4;
                    r rVarB = b(arrayDeque, i23, false);
                    if (rVarB != null) {
                        int i24 = (i13 - rVarB.f2600b) - 1;
                        dVar.onMoved(i15, i24);
                        if ((i22 & 4) != 0) {
                            dVar.onChanged(i24, z12 ? 1 : 0, uVar.getChangePayload(i15, i23));
                        }
                    } else {
                        arrayDeque.add(new r(i15, (i13 - i15) - (z12 ? 1 : 0), z12));
                    }
                } else {
                    arrayList = arrayList2;
                    dVar.onRemoved(i15, z12 ? 1 : 0);
                    i13--;
                }
                arrayList2 = arrayList;
                z11 = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i14 > i21) {
                i14--;
                int i25 = pVar.f2578c[i14];
                if ((i25 & 12) != 0) {
                    int i26 = i25 >> 4;
                    r rVarB2 = b(arrayDeque, i26, true);
                    if (rVarB2 == null) {
                        arrayDeque.add(new r(i14, i13 - i15, false));
                        i12 = 0;
                    } else {
                        i12 = 0;
                        dVar.onMoved((i13 - rVarB2.f2600b) - 1, i15);
                        if ((i25 & 4) != 0) {
                            dVar.onChanged(i15, 1, uVar.getChangePayload(i26, i14));
                        }
                    }
                } else {
                    i12 = i11;
                    dVar.onInserted(i15, 1);
                    i13++;
                }
                pVar = this;
                i11 = i12;
            }
            int i27 = i19;
            int i28 = i16;
            while (i11 < i17) {
                if ((iArr[i28] & 15) == 2) {
                    dVar.onChanged(i28, 1, uVar.getChangePayload(i28, i27));
                }
                i28++;
                i27++;
                i11++;
            }
            size--;
            pVar = this;
            z11 = true;
            i14 = i19;
            i15 = i16;
            arrayList2 = arrayList3;
        }
        dVar.a();
    }
}
