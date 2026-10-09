package km;

import android.view.View;
import com.lingo.lingoskill.object.BaseYintuIntel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f38222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseYintuIntel f38223c;

    public /* synthetic */ k0(j1 j1Var, BaseYintuIntel baseYintuIntel, int i11) {
        this.f38221a = i11;
        this.f38222b = j1Var;
        this.f38223c = baseYintuIntel;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f38221a;
        qy.b0 b0Var = qy.b0.f48488a;
        BaseYintuIntel baseYintuIntel = this.f38223c;
        j1 j1Var = this.f38222b;
        View it = (View) obj;
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                a9.i iVar = j1Var.O;
                kotlin.jvm.internal.m.c(iVar);
                qy.q qVar = fv.b.f28186a;
                String luoMa = baseYintuIntel.getLuoMa();
                kotlin.jvm.internal.m.e(luoMa, "getLuoMa(...)");
                iVar.v(fv.b.c(luoMa, null, null));
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                a9.i iVar2 = j1Var.O;
                kotlin.jvm.internal.m.c(iVar2);
                qy.q qVar2 = fv.b.f28186a;
                String luoMa2 = baseYintuIntel.getLuoMa();
                kotlin.jvm.internal.m.e(luoMa2, "getLuoMa(...)");
                iVar2.v(fv.b.c(luoMa2, null, null));
                break;
        }
        return b0Var;
    }
}
