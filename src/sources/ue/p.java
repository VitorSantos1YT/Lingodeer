package ue;

import java.util.List;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f52941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i11, List list) {
        super(2);
        this.f52940a = i11;
        this.f52941b = list;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52940a) {
            case 0:
                try {
                    re.s.d().execute(new pb.b(12, (Integer) obj2, this.f52941b));
                    break;
                } catch (Exception unused) {
                }
                break;
            default:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = this.f52941b;
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        fz.e eVar = (fz.e) list.get(i11);
                        int iHashCode = Long.hashCode(sVar.T);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56914c;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.y(sVar, Integer.valueOf(iHashCode), y2.j.f56918g);
                        eVar.invoke(sVar, 0);
                        sVar.p(true);
                    }
                } else {
                    sVar.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
