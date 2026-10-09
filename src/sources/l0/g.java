package l0;

import j0.e2;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39111b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f39110a = i11;
        this.f39111b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f39110a) {
            case 0:
                c cVar = (c) obj;
                ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(cVar) ? 4 : 2;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 131) != 130)) {
                    ((fz.f) this.f39111b).invoke(cVar, sVar, Integer.valueOf(iIntValue & 14));
                } else {
                    sVar.W();
                }
                break;
            default:
                v3.c InlineContent = (v3.c) obj;
                String it = (String) obj2;
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                kotlin.jvm.internal.m.f(InlineContent, "$this$InlineContent");
                kotlin.jvm.internal.m.f(it, "it");
                if ((iIntValue2 & 129) == 128) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        sg.k kVar = (sg.k) ((c.a) this.f39111b);
                        rg.e.a(kVar.f51648b, kVar.f51647a, e2.e(z1.o.f58481a, 1.0f), nVar2, 3456);
                    }
                } else {
                    sg.k kVar2 = (sg.k) ((c.a) this.f39111b);
                    rg.e.a(kVar2.f51648b, kVar2.f51647a, e2.e(z1.o.f58481a, 1.0f), nVar2, 3456);
                }
                break;
        }
        return b0.f48488a;
    }
}
