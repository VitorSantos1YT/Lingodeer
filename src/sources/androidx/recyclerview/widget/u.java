package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f2625a = new n(0);

    public static p a(u uVar, boolean z11) {
        int[] iArr;
        int[] iArr2;
        int i11;
        t tVar;
        s sVar;
        o oVar;
        int i12;
        t tVar2;
        t tVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int oldListSize = uVar.getOldListSize();
        int newListSize = uVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        s sVar2 = new s();
        int i21 = 0;
        sVar2.f2602a = 0;
        sVar2.f2603b = oldListSize;
        sVar2.f2604c = 0;
        sVar2.f2605d = newListSize;
        arrayList2.add(sVar2);
        int i22 = oldListSize + newListSize;
        int i23 = 1;
        int i24 = (((i22 + 1) / 2) * 2) + 1;
        int[] iArr3 = new int[i24];
        int i25 = i24 / 2;
        int[] iArr4 = new int[i24];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            s sVar3 = (s) hh.p0.f(i23, arrayList2);
            if (sVar3.b() >= i23 && sVar3.a() >= i23) {
                int iA = ((sVar3.a() + sVar3.b()) + i23) / 2;
                int i26 = i23 + i25;
                iArr3[i26] = sVar3.f2602a;
                iArr4[i26] = sVar3.f2603b;
                int i27 = i21;
                while (true) {
                    if (i27 >= iA) {
                        iArr = iArr4;
                        iArr2 = iArr3;
                        i11 = i25;
                        tVar = null;
                        break;
                    }
                    int i28 = Math.abs(sVar3.b() - sVar3.a()) % 2 == i23 ? i23 : i21;
                    int iB = sVar3.b() - sVar3.a();
                    int i29 = -i27;
                    int i30 = i29;
                    while (true) {
                        if (i30 > i27) {
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i12 = i21;
                            i11 = i25;
                            tVar2 = null;
                            break;
                        }
                        if (i30 == i29 || (i30 != i27 && iArr3[i30 + 1 + i25] > iArr3[(i30 - 1) + i25])) {
                            i17 = iArr3[i30 + 1 + i25];
                            i18 = i17;
                        } else {
                            i17 = iArr3[(i30 - 1) + i25];
                            i18 = i17 + 1;
                        }
                        iArr = iArr4;
                        int i31 = ((i18 - sVar3.f2602a) + sVar3.f2604c) - i30;
                        if (i27 != 0 && i18 == i17) {
                            i31--;
                        }
                        iArr2 = iArr3;
                        int i32 = i18;
                        int i33 = i31;
                        i11 = i25;
                        while (i32 < sVar3.f2603b && i33 < sVar3.f2605d && uVar.areItemsTheSame(i32, i33)) {
                            i32++;
                            i33++;
                        }
                        iArr2[i30 + i11] = i32;
                        if (i28 != 0) {
                            int i34 = iB - i30;
                            i19 = i30;
                            if (i34 >= i29 + 1 && i34 <= i27 - 1 && iArr[i34 + i11] <= i32) {
                                tVar2 = new t();
                                tVar2.f2612a = i17;
                                tVar2.f2613b = i31;
                                tVar2.f2614c = i32;
                                tVar2.f2615d = i33;
                                i12 = 0;
                                tVar2.f2616e = false;
                                break;
                            }
                        } else {
                            i19 = i30;
                        }
                        i30 = i19 + 2;
                        i21 = 0;
                        iArr4 = iArr;
                        iArr3 = iArr2;
                        i25 = i11;
                    }
                    if (tVar2 != null) {
                        tVar = tVar2;
                        break;
                    }
                    int i35 = (sVar3.b() - sVar3.a()) % 2 == 0 ? 1 : i12;
                    int iB2 = sVar3.b() - sVar3.a();
                    int i36 = i29;
                    while (true) {
                        if (i36 > i27) {
                            tVar3 = null;
                            break;
                        }
                        if (i36 == i29 || (i36 != i27 && iArr[i36 + 1 + i11] < iArr[(i36 - 1) + i11])) {
                            i13 = iArr[i36 + 1 + i11];
                            i14 = i13;
                        } else {
                            i13 = iArr[(i36 - 1) + i11];
                            i14 = i13 - 1;
                        }
                        int i37 = sVar3.f2605d - ((sVar3.f2603b - i14) - i36);
                        int i38 = (i27 == 0 || i14 != i13) ? i37 : i37 + 1;
                        while (true) {
                            if (i14 > sVar3.f2602a && i37 > sVar3.f2604c) {
                                i15 = i35;
                                if (!uVar.areItemsTheSame(i14 - 1, i37 - 1)) {
                                    break;
                                }
                                i14--;
                                i37--;
                                i35 = i15;
                            } else {
                                i15 = i35;
                                break;
                            }
                        }
                        iArr[i36 + i11] = i14;
                        if (i15 != 0 && (i16 = iB2 - i36) >= i29 && i16 <= i27 && iArr2[i16 + i11] >= i14) {
                            tVar3 = new t();
                            tVar3.f2612a = i14;
                            tVar3.f2613b = i37;
                            tVar3.f2614c = i13;
                            tVar3.f2615d = i38;
                            tVar3.f2616e = true;
                            break;
                        }
                        i36 += 2;
                        i35 = i15;
                    }
                    if (tVar3 != null) {
                        tVar = tVar3;
                        break;
                    }
                    i27++;
                    iArr4 = iArr;
                    iArr3 = iArr2;
                    i25 = i11;
                    i23 = 1;
                    i21 = 0;
                }
            } else {
                iArr = iArr4;
                iArr2 = iArr3;
                i11 = i25;
                tVar = null;
                break;
            }
            if (tVar != null) {
                if (tVar.a() > 0) {
                    int i39 = tVar.f2615d;
                    int i40 = tVar.f2613b;
                    int i41 = i39 - i40;
                    int i42 = tVar.f2614c;
                    int i43 = tVar.f2612a;
                    int i44 = i42 - i43;
                    if (i41 == i44) {
                        oVar = new o(i43, i40, i44);
                    } else if (tVar.f2616e) {
                        oVar = new o(i43, i40, tVar.a());
                    } else {
                        oVar = i41 > i44 ? new o(i43, i40 + 1, tVar.a()) : new o(i43 + 1, i40, tVar.a());
                    }
                    arrayList.add(oVar);
                }
                if (arrayList3.isEmpty()) {
                    sVar = new s();
                    i23 = 1;
                } else {
                    i23 = 1;
                    sVar = (s) hh.p0.f(1, arrayList3);
                }
                sVar.f2602a = sVar3.f2602a;
                sVar.f2604c = sVar3.f2604c;
                sVar.f2603b = tVar.f2612a;
                sVar.f2605d = tVar.f2613b;
                arrayList2.add(sVar);
                sVar3.f2603b = sVar3.f2603b;
                sVar3.f2605d = sVar3.f2605d;
                sVar3.f2602a = tVar.f2614c;
                sVar3.f2604c = tVar.f2615d;
                arrayList2.add(sVar3);
            } else {
                i23 = 1;
                arrayList3.add(sVar3);
            }
            iArr4 = iArr;
            iArr3 = iArr2;
            i25 = i11;
            i21 = 0;
        }
        int[] iArr5 = iArr4;
        Collections.sort(arrayList, f2625a);
        return new p(uVar, arrayList, iArr3, iArr5, z11);
    }

    public static int b(c2 c2Var, u0 u0Var, View view, View view2, m1 m1Var, boolean z11) {
        if (m1Var.getChildCount() == 0 || c2Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return Math.abs(m1Var.getPosition(view) - m1Var.getPosition(view2)) + 1;
        }
        return Math.min(u0Var.l(), u0Var.b(view2) - u0Var.e(view));
    }

    public static int c(c2 c2Var, u0 u0Var, View view, View view2, m1 m1Var, boolean z11, boolean z12) {
        if (m1Var.getChildCount() == 0 || c2Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z12 ? Math.max(0, (c2Var.b() - Math.max(m1Var.getPosition(view), m1Var.getPosition(view2))) - 1) : Math.max(0, Math.min(m1Var.getPosition(view), m1Var.getPosition(view2)));
        if (z11) {
            return Math.round((iMax * (Math.abs(u0Var.b(view2) - u0Var.e(view)) / (Math.abs(m1Var.getPosition(view) - m1Var.getPosition(view2)) + 1))) + (u0Var.k() - u0Var.e(view)));
        }
        return iMax;
    }

    public static int d(c2 c2Var, u0 u0Var, View view, View view2, m1 m1Var, boolean z11) {
        if (m1Var.getChildCount() == 0 || c2Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return c2Var.b();
        }
        return (int) (((u0Var.b(view2) - u0Var.e(view)) / (Math.abs(m1Var.getPosition(view) - m1Var.getPosition(view2)) + 1)) * c2Var.b());
    }

    public abstract boolean areContentsTheSame(int i11, int i12);

    public abstract boolean areItemsTheSame(int i11, int i12);

    public Object getChangePayload(int i11, int i12) {
        return null;
    }

    public abstract int getNewListSize();

    public abstract int getOldListSize();
}
