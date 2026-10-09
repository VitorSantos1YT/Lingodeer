package aw;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ob.e f3239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile q f3240b;

    public final void a(p pVar) {
        if (pVar instanceof b) {
            if (this.f3240b != null) {
                this.f3240b.j(pVar);
                return;
            }
            return;
        }
        if (this.f3239a != null) {
            ob.e eVar = this.f3239a;
            eVar.getClass();
            u uVar = null;
            try {
                synchronized (((ArrayList) eVar.f44804b)) {
                    try {
                        int i11 = pVar.f3237a;
                        ArrayList arrayList = (ArrayList) eVar.f44804b;
                        int size = arrayList.size();
                        int size2 = 0;
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            u uVar2 = (u) obj;
                            if (uVar2.f3245a.contains(Integer.valueOf(i11))) {
                                uVar = uVar2;
                                break;
                            }
                        }
                        if (uVar == null) {
                            ArrayList arrayList2 = (ArrayList) eVar.f44804b;
                            int size3 = arrayList2.size();
                            int i13 = 0;
                            while (i13 < size3) {
                                Object obj2 = arrayList2.get(i13);
                                i13++;
                                u uVar3 = (u) obj2;
                                if (uVar3.f3245a.size() <= 0) {
                                    uVar = uVar3;
                                    break;
                                } else if (size2 == 0 || uVar3.f3245a.size() < size2) {
                                    size2 = uVar3.f3245a.size();
                                    uVar = uVar3;
                                }
                            }
                        }
                        uVar.f3245a.add(Integer.valueOf(i11));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                uVar.f3246b.execute(new t(0, uVar, pVar));
            } catch (Throwable th3) {
                uVar.f3246b.execute(new t(0, uVar, pVar));
                throw th3;
            }
        }
    }
}
