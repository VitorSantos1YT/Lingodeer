package ei;

import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.KOCharZhuyin;
import j0.b2;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.f f25675b;

    public /* synthetic */ x(fz.f fVar, int i11) {
        this.f25674a = i11;
        this.f25675b = fVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f25674a) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                y item = (y) obj3;
                kotlin.jvm.internal.m.f(item, "item");
                ARChar aRChar = item.f25676a;
                if (aRChar != null) {
                    this.f25675b.invoke(num, num2, aRChar);
                }
                break;
            case 1:
                Integer num3 = (Integer) obj;
                num3.intValue();
                Integer num4 = (Integer) obj2;
                num4.intValue();
                en.f item2 = (en.f) obj3;
                kotlin.jvm.internal.m.f(item2, "item");
                KOCharZhuyin kOCharZhuyin = item2.f25715a;
                if (kOCharZhuyin != null) {
                    this.f25675b.invoke(num3, num4, kOCharZhuyin);
                }
                break;
            case 2:
                b2 Button = (b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Button, "$this$Button");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(Button) ? 4 : 2;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    this.f25675b.invoke(Button, sVar, Integer.valueOf(iIntValue & 14));
                } else {
                    sVar.W();
                }
                break;
            case 3:
                b2 Button2 = (b2) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Button2, "$this$Button");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((l1.s) nVar2).f(Button2) ? 4 : 2;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    this.f25675b.invoke(Button2, sVar2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    sVar2.W();
                }
                break;
            default:
                Integer num5 = (Integer) obj;
                num5.intValue();
                Integer num6 = (Integer) obj2;
                num6.intValue();
                nq.d item3 = (nq.d) obj3;
                kotlin.jvm.internal.m.f(item3, "item");
                pq.a aVar = item3.f43930a;
                if (aVar != null) {
                    this.f25675b.invoke(num5, num6, aVar);
                }
                break;
        }
        return b0.f48488a;
    }
}
