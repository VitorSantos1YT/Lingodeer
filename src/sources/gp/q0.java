package gp;

import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingo.lingoskill.object.NewBillingTheme;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends xy.i implements fz.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ String f29485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ NewBillingTheme f29486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ MergedBillingThemeBillingPage f29487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f29488d;

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        q0 q0Var = new q0(5, (vy.d) obj5);
        q0Var.f29485a = (String) obj;
        q0Var.f29486b = (NewBillingTheme) obj2;
        q0Var.f29487c = (MergedBillingThemeBillingPage) obj3;
        q0Var.f29488d = zBooleanValue;
        return q0Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String str = this.f29485a;
        NewBillingTheme newBillingTheme = this.f29486b;
        MergedBillingThemeBillingPage mergedBillingThemeBillingPage = this.f29487c;
        boolean z11 = this.f29488d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        return !z11 ? new a0(mergedBillingThemeBillingPage, newBillingTheme, str) : z.f29558a;
    }
}
