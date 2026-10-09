package gp;

import bp.g2;
import com.lingo.lingoskill.object.ShowBottomSaleCardCondition;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f29498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f29499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(l1 l1Var, vy.d dVar) {
        super(4, dVar);
        this.f29499c = l1Var;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        s0 s0Var = new s0(this.f29499c, (vy.d) obj4);
        s0Var.f29498b = zBooleanValue;
        return s0Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        boolean z11 = this.f29498b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f29497a;
        boolean z12 = false;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            if (!z11) {
                yz.f fVar = rz.o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                g2 g2Var = new g2(2, 20, null);
                this.f29498b = z11;
                this.f29497a = 1;
                obj = rz.e0.M(eVar, g2Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(z12);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        ShowBottomSaleCardCondition showBottomSaleCardCondition = (ShowBottomSaleCardCondition) obj;
        if (showBottomSaleCardCondition.isShow() && ((fr.o0) this.f29499c.f29434b).f27733a.enterUnitCount >= showBottomSaleCardCondition.getMinEnterUnitCount()) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
