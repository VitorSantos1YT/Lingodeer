package mt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h5 implements uz.j {
    public final /* synthetic */ Integer H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0.w f41525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.b5 f41526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41530f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41531t;

    public h5(l0.w wVar, rt.b5 b5Var, int i11, int i12, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, Integer num) {
        this.f41525a = wVar;
        this.f41526b = b5Var;
        this.f41527c = i11;
        this.f41528d = i12;
        this.f41529e = b1Var;
        this.f41530f = b1Var2;
        this.f41531t = b1Var3;
        this.H = num;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable, java.lang.Object] */
    public final Object a(boolean z11, vy.d dVar) {
        g5 g5Var;
        int i11;
        Object next;
        r4 r4Var;
        if (dVar instanceof g5) {
            g5Var = (g5) dVar;
            int i12 = g5Var.f41496d;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                g5Var.f41496d = i12 - Integer.MIN_VALUE;
            } else {
                g5Var = new g5(this, dVar);
            }
        } else {
            g5Var = new g5(this, dVar);
        }
        Object obj = g5Var.f41494b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = g5Var.f41496d;
        l1.b1 b1Var = this.f41531t;
        l1.b1 b1Var2 = this.f41530f;
        l1.b1 b1Var3 = this.f41529e;
        int i14 = 1;
        try {
            try {
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (z11) {
                        float f5 = l5.f41627a;
                        if (!((Boolean) b1Var3.getValue()).booleanValue()) {
                            b1Var2.setValue(Boolean.TRUE);
                            b1Var.setValue(null);
                        }
                    } else {
                        float f11 = l5.f41627a;
                        if (((Boolean) b1Var2.getValue()).booleanValue() && !((Boolean) b1Var3.getValue()).booleanValue()) {
                            int size = this.f41526b.f49513f.size();
                            l0.w wVar = this.f41525a;
                            l0.o oVarH = wVar.h();
                            int i15 = (oVarH.f39157l + oVarH.m) / 2;
                            ?? r11 = oVarH.f39156k;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : r11) {
                                int i16 = ((l0.p) obj2).f39162a;
                                if (1 <= i16 && i16 <= size) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                            int size2 = arrayList.size();
                            int i17 = 0;
                            while (true) {
                                i11 = this.f41527c;
                                if (i17 >= size2) {
                                    break;
                                }
                                Object obj3 = arrayList.get(i17);
                                i17++;
                                l0.p pVar = (l0.p) obj3;
                                int i18 = i14;
                                int i19 = pVar.m;
                                int i21 = i19 - i11;
                                if (i21 < 0) {
                                    i21 = 0;
                                }
                                arrayList2.add(new r4(pVar.f39162a - 1, ((i21 / 2) + pVar.f39173l) - i15, i19));
                                i14 = i18;
                            }
                            int i22 = i14;
                            Iterator it = arrayList2.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                if (it.hasNext()) {
                                    int iAbs = Math.abs(((r4) next).f41841b);
                                    do {
                                        Object next2 = it.next();
                                        int iAbs2 = Math.abs(((r4) next2).f41841b);
                                        if (iAbs > iAbs2) {
                                            next = next2;
                                            iAbs = iAbs2;
                                        }
                                    } while (it.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            r4 r4Var2 = (r4) next;
                            b1Var2.setValue(Boolean.FALSE);
                            b1Var.setValue(null);
                            if (r4Var2 != null) {
                                b1Var3.setValue(Boolean.TRUE);
                                int i23 = r4Var2.f41842c - i11;
                                if (i23 < 0) {
                                    i23 = 0;
                                }
                                int i24 = (this.f41528d - i23) / 2;
                                int i25 = i24 < 0 ? 0 : i24;
                                g5Var.f41493a = r4Var2;
                                g5Var.f41496d = i22;
                                if (wVar.j(r4Var2.f41840a + 1, -i25, g5Var) == aVar) {
                                    return aVar;
                                }
                                r4Var = r4Var2;
                            }
                        }
                    }
                    return qy.b0.f48488a;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r4Var = g5Var.f41493a;
                com.bumptech.glide.e.F(obj);
                Integer num = new Integer(r4Var.f41840a);
                Integer num2 = this.H;
                int iIntValue = num.intValue();
                if (num2 != null && iIntValue == num2.intValue()) {
                    num = null;
                }
                float f12 = l5.f41627a;
                b1Var.setValue(num);
            } catch (CancellationException e8) {
                if (!rz.e0.x(g5Var.getContext())) {
                    throw e8;
                }
                float f13 = l5.f41627a;
                b1Var2.setValue(Boolean.TRUE);
                b1Var.setValue(null);
            }
            b1Var3.setValue(Boolean.FALSE);
            return qy.b0.f48488a;
        } catch (Throwable th2) {
            float f14 = l5.f41627a;
            b1Var3.setValue(Boolean.FALSE);
            throw th2;
        }
    }

    @Override // uz.j
    public final /* bridge */ /* synthetic */ Object emit(Object obj, vy.d dVar) {
        return a(((Boolean) obj).booleanValue(), dVar);
    }
}
