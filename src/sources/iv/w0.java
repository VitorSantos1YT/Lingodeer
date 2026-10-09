package iv;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f34859b;

    public /* synthetic */ w0(int i11, int i12, List list) {
        this.f34858a = i12;
        this.f34859b = list;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[LOOP:0: B:24:0x008a->B:35:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x005e A[SYNTHETIC] */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11;
        int i12;
        int i13;
        Object next;
        qy.l lVar;
        Object next2;
        String str;
        String str2;
        switch (this.f34858a) {
            case 0:
                ((Integer) obj2).getClass();
                z0.h(this.f34859b, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.m.f(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = this.f34859b;
                if (list.size() == 1) {
                    String str3 = (String) ry.m.P0(list);
                    int iI0 = oz.q.I0(DelimitedRangesSequence, str3, iIntValue, false, 4);
                    if (iI0 < 0) {
                        lVar = null;
                    } else {
                        lVar = new qy.l(Integer.valueOf(iI0), str3);
                    }
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    lz.g gVar = new lz.g(iIntValue, DelimitedRangesSequence.length(), 1);
                    boolean z11 = DelimitedRangesSequence instanceof String;
                    int i14 = gVar.f40534c;
                    int i15 = gVar.f40533b;
                    if (z11) {
                        if ((i14 <= 0 || iIntValue > i15) && (i14 >= 0 || i15 > iIntValue)) {
                            lVar = null;
                        } else {
                            int i16 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str2 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str = (String) next2;
                                    if (str != null) {
                                        lVar = new qy.l(Integer.valueOf(i16), str);
                                    } else if (i16 != i15) {
                                        i16 += i14;
                                    } else {
                                        lVar = null;
                                    }
                                } while (!oz.x.n0(0, i16, str2.length(), str2, (String) DelimitedRangesSequence, false));
                                str = (String) next2;
                                if (str != null) {
                                    lVar = new qy.l(Integer.valueOf(i16), str);
                                } else if (i16 != i15) {
                                    i16 += i14;
                                } else {
                                    lVar = null;
                                }
                            }
                        }
                    } else if ((i14 <= 0 || iIntValue > i15) && (i14 >= 0 || i15 > iIntValue)) {
                        lVar = null;
                    } else {
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    int i17 = i15;
                                    String str4 = (String) next;
                                    int i18 = i14;
                                    i11 = iIntValue;
                                    i12 = i18;
                                    i13 = i17;
                                    if (!oz.q.Q0(str4, 0, DelimitedRangesSequence, i11, str4.length(), false)) {
                                        i14 = i12;
                                        iIntValue = i11;
                                        i15 = i13;
                                    }
                                } else {
                                    int i19 = i14;
                                    i11 = iIntValue;
                                    i12 = i19;
                                    i13 = i15;
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                lVar = new qy.l(Integer.valueOf(i11), str5);
                            } else if (i11 != i13) {
                                int i21 = i11 + i12;
                                i14 = i12;
                                iIntValue = i21;
                                i15 = i13;
                            } else {
                                lVar = null;
                            }
                        }
                    }
                }
                if (lVar != null) {
                    return new qy.l(lVar.f48495a, Integer.valueOf(((String) lVar.f48496b).length()));
                }
                return null;
            case 2:
                ((Integer) obj2).getClass();
                tv.a.f(this.f34859b, (l1.n) obj, l1.t.M(1));
                break;
            default:
                ((Integer) obj2).getClass();
                xu.c0.a(this.f34859b, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ w0(List list) {
        this.f34858a = 1;
        this.f34859b = list;
    }
}
