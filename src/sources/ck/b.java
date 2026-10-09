package ck;

import fr.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends oi.c {
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11) {
        super(2);
        this.H = i11;
    }

    @Override // oi.c
    public boolean d(List list, int i11, long j11) {
        switch (this.H) {
            case 0:
                Iterator it = list.iterator();
                boolean z11 = true;
                while (it.hasNext()) {
                    qi.a aVar = (qi.a) it.next();
                    if (aVar.f47798a == i11 && aVar.f47799b == j11) {
                        z11 = false;
                    }
                }
                return z11;
            default:
                return super.d(list, i11, j11);
        }
    }

    @Override // oi.c
    public ArrayList k(List list, int i11) {
        switch (this.H) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    qi.a aVar = (qi.a) it.next();
                    if (aVar.f47798a == i11) {
                        arrayList.add(Integer.valueOf(aVar.f47800c));
                    }
                }
                return arrayList;
            default:
                return super.k(list, i11);
        }
    }

    @Override // oi.c
    public void n(qi.a aVar, ArrayList arrayList, boolean z11, int i11) {
        switch (this.H) {
            case 0:
                ArrayList arrayList2 = (ArrayList) this.f44927c;
                int i12 = 0;
                if (arrayList.size() == 1) {
                    aVar.f47800c = ((Number) arrayList.get(0)).intValue();
                } else if (!z11) {
                    ((ArrayList) this.f44928d).add(Integer.valueOf(i11));
                    int iO = o(i(), aVar.f47798a, aVar.f47799b);
                    if (iO == 1) {
                        int size = arrayList.size();
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            int iIntValue = ((Number) obj).intValue();
                            if (iIntValue == 1 || iIntValue == 5 || iIntValue == 10) {
                                ((List) arrayList2.get(1)).add(Integer.valueOf(iIntValue));
                            }
                        }
                        if (((List) arrayList2.get(1)).size() != 0) {
                            aVar.f47800c = ((Number) ((List) arrayList2.get(1)).get(j3.M(((List) arrayList2.get(1)).size()))).intValue();
                            aVar.f47802e = (List) arrayList2.get(1);
                        } else {
                            aVar.f47800c = 13;
                        }
                    } else if (iO >= 2) {
                        aVar.f47800c = 13;
                    }
                } else {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        int iIntValue2 = ((Number) obj2).intValue();
                        if (iIntValue2 == 2 || iIntValue2 == 3 || iIntValue2 == 6) {
                            ((List) arrayList2.get(0)).add(Integer.valueOf(iIntValue2));
                        }
                    }
                    if (((List) arrayList2.get(0)).size() != 0) {
                        aVar.f47800c = ((Number) ((List) arrayList2.get(0)).get(j3.M(((List) arrayList2.get(0)).size()))).intValue();
                    } else {
                        aVar.f47800c = ((Number) arrayList.get(j3.M(arrayList.size()))).intValue();
                    }
                }
                break;
            default:
                ArrayList arrayList3 = (ArrayList) this.f44927c;
                int i14 = 0;
                if (arrayList.size() == 1) {
                    aVar.f47800c = ((Number) arrayList.get(0)).intValue();
                    break;
                } else if (!z11) {
                    ((ArrayList) this.f44928d).add(Integer.valueOf(i11));
                    int iO2 = o(i(), aVar.f47798a, aVar.f47799b);
                    if (iO2 == 1) {
                        int size3 = arrayList.size();
                        while (i14 < size3) {
                            Object obj3 = arrayList.get(i14);
                            i14++;
                            int iIntValue3 = ((Number) obj3).intValue();
                            if (iIntValue3 == 1 || iIntValue3 == 5 || iIntValue3 == 10) {
                                ((List) arrayList3.get(1)).add(Integer.valueOf(iIntValue3));
                            }
                        }
                        if (((List) arrayList3.get(1)).size() != 0) {
                            aVar.f47800c = ((Number) ((List) arrayList3.get(1)).get(j3.M(((List) arrayList3.get(1)).size()))).intValue();
                            aVar.f47802e = (List) arrayList3.get(1);
                        } else {
                            aVar.f47800c = 13;
                        }
                    } else if (iO2 >= 2) {
                        aVar.f47800c = 13;
                    }
                    break;
                } else {
                    int iN = j3.N(0, 3);
                    if (iN == 0) {
                        aVar.f47800c = 3;
                        break;
                    } else if (iN == 1) {
                        aVar.f47800c = 2;
                        break;
                    } else if (iN == 2) {
                        aVar.f47800c = 6;
                        break;
                    }
                }
                break;
        }
    }

    @Override // oi.c
    public int o(List list, int i11, long j11) {
        switch (this.H) {
            case 0:
                Iterator it = list.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    qi.a aVar = (qi.a) it.next();
                    if (aVar.f47798a == i11 && aVar.f47799b == j11) {
                        i12++;
                    }
                }
                return i12;
            default:
                return super.o(list, i11, j11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:248:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x02bd -> B:136:0x029a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x033d -> B:166:0x031a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0114 -> B:38:0x00e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0198 -> B:71:0x0171). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // oi.c
    public void q(qi.a r23, java.util.ArrayList r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ck.b.q(qi.a, java.util.ArrayList, boolean):void");
    }
}
