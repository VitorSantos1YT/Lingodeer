package rt;

import androidx.lifecycle.ViewModelKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gb implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mb f49797b;

    public /* synthetic */ gb(mb mbVar, int i11) {
        this.f49796a = i11;
        this.f49797b = mbVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f49796a) {
            case 0:
                return this.f49797b.f50720t;
            case 1:
                this.f49797b.t(xb.f50655a);
                return qy.b0.f48488a;
            case 2:
                mb mbVar = this.f49797b;
                if (!mbVar.f50080x0) {
                    mbVar.f50080x0 = true;
                    mbVar.f50078v0 = rz.e0.B(ViewModelKt.getViewModelScope(mbVar), rz.o0.f50940a, null, new f0.h2(mbVar, null, 1), 2);
                }
                return qy.b0.f48488a;
            case 3:
                mb mbVar2 = this.f49797b;
                rz.z1 z1Var = mbVar2.f50078v0;
                if (z1Var != null) {
                    z1Var.cancel(null);
                }
                mbVar2.f50079w0 = ((hb) mbVar2.f50076t0.getValue()).f49844a;
                mbVar2.f50080x0 = false;
                return qy.b0.f48488a;
            default:
                mb mbVar3 = this.f49797b;
                long j11 = mbVar3.f50079w0;
                if (j11 > 0) {
                    uz.i1 i1Var = mbVar3.f50076t0;
                    hb hbVar = new hb(j11, false);
                    i1Var.getClass();
                    i1Var.l(null, hbVar);
                    if (!mbVar3.f50080x0) {
                        mbVar3.f50080x0 = true;
                        mbVar3.f50078v0 = rz.e0.B(ViewModelKt.getViewModelScope(mbVar3), rz.o0.f50940a, null, new f0.h2(mbVar3, null, 1), 2);
                    }
                }
                return qy.b0.f48488a;
        }
    }
}
