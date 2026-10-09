package yg;

import com.lingo.lingoskill.object.BillingPageRecomConfig;
import com.lingo.lingoskill.object.LifetimeIapConfig;
import java.util.ArrayList;
import l1.b1;
import l1.b3;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ni.m f57831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3 f57832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3 f57833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b3 f57834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f57835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(ni.m mVar, b3 b3Var, b3 b3Var2, b3 b3Var3, b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f57830a = i11;
        this.f57831b = mVar;
        this.f57832c = b3Var;
        this.f57833d = b3Var2;
        this.f57834e = b3Var3;
        this.f57835f = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f57830a) {
            case 0:
                return new m(this.f57831b, this.f57832c, this.f57833d, this.f57834e, this.f57835f, dVar, 0);
            default:
                return new m(this.f57831b, this.f57832c, this.f57833d, this.f57834e, this.f57835f, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f57830a) {
            case 0:
                m mVar = (m) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                mVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                m mVar2 = (m) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                mVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f57830a;
        qy.b0 b0Var = qy.b0.f48488a;
        b3 b3Var = this.f57834e;
        b1 b1Var = this.f57835f;
        b3 b3Var2 = this.f57833d;
        ni.m mVar = this.f57831b;
        b3 b3Var3 = this.f57832c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((BillingPageRecomConfig) b3Var3.getValue()).getRecomType() == 0) {
                    mVar.O.k((com.android.billingclient.api.o) b3Var2.getValue());
                    ArrayList arrayListM = ns.o.M(p.ANNUALLY, p.MONTHLY);
                    if (((LifetimeIapConfig) b3Var.getValue()).isVisible()) {
                        arrayListM.add(p.LIFETIME);
                    }
                    b1Var.setValue(arrayListM);
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((BillingPageRecomConfig) b3Var3.getValue()).getRecomType() == 1) {
                    mVar.O.k((com.android.billingclient.api.o) b3Var2.getValue());
                    ArrayList arrayListM2 = ns.o.M(p.ANNUALLY, p.MONTHLY);
                    if (((LifetimeIapConfig) b3Var.getValue()).isVisible()) {
                        arrayListM2.add(0, p.LIFETIME);
                    }
                    b1Var.setValue(arrayListM2);
                }
                break;
        }
        return b0Var;
    }
}
