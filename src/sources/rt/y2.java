package rt;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y2 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f50675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Set f50676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f50674a = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f50674a;
        int iIntValue = ((Number) obj).intValue();
        Set set = (Set) obj2;
        vy.d dVar = (vy.d) obj3;
        switch (i11) {
            case 0:
                y2 y2Var = new y2(3, 0, dVar);
                y2Var.f50675b = iIntValue;
                y2Var.f50676c = set;
                return y2Var.invokeSuspend(qy.b0.f48488a);
            case 1:
                y2 y2Var2 = new y2(3, 1, dVar);
                y2Var2.f50675b = iIntValue;
                y2Var2.f50676c = set;
                return y2Var2.invokeSuspend(qy.b0.f48488a);
            default:
                y2 y2Var3 = new y2(3, 2, dVar);
                y2Var3.f50675b = iIntValue;
                y2Var3.f50676c = set;
                return y2Var3.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f50674a) {
            case 0:
                int i11 = this.f50675b;
                Set set = this.f50676c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new qy.l(new Integer(i11), set);
            case 1:
                int i12 = this.f50675b;
                Set set2 = this.f50676c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new qy.l(new Integer(i12), set2);
            default:
                int i13 = this.f50675b;
                Set set3 = this.f50676c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new qy.l(new Integer(i13), set3);
        }
    }
}
