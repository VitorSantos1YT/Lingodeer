package dt;

import java.util.ArrayList;
import java.util.List;
import rt.r8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f23771b;

    public /* synthetic */ e1(int i11, int i12, fz.e eVar) {
        this.f23770a = i12;
        this.f23771b = eVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23770a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f23771b.invoke(sVar, 0);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k3.c(this.f23771b, sVar2, 0);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                ((Integer) obj2).getClass();
                k3.c(this.f23771b, (l1.n) obj, l1.t.M(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                fu.a.o(this.f23771b, (l1.n) obj, l1.t.M(7));
                break;
            case 4:
                List reviews = (List) obj;
                r8 practiceModel = (r8) obj2;
                kotlin.jvm.internal.m.f(reviews, "reviews");
                kotlin.jvm.internal.m.f(practiceModel, "practiceModel");
                this.f23771b.invoke(reviews, practiceModel);
                break;
            case 5:
                String shareType = (String) obj;
                String shareTitle = (String) obj2;
                kotlin.jvm.internal.m.f(shareType, "shareType");
                kotlin.jvm.internal.m.f(shareTitle, "shareTitle");
                this.f23771b.invoke(shareType, shareTitle);
                break;
            default:
                w1.k kVar = (w1.k) obj;
                List list = (List) this.f23771b.invoke(kVar, obj2);
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj3 = list.get(i11);
                    if (obj3 != null && !kVar.canBeSaved(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i11 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ e1(int i11, fz.e eVar) {
        this.f23770a = i11;
        this.f23771b = eVar;
    }
}
