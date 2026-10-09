package mu;

import androidx.lifecycle.ViewModelKt;
import qy.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f42150b;

    public /* synthetic */ m(x xVar, int i11) {
        this.f42149a = i11;
        this.f42150b = xVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f42149a) {
            case 0:
                x xVar = this.f42150b;
                e0.B(ViewModelKt.getViewModelScope(xVar), null, null, new p(xVar, null, 0), 3);
                break;
            case 1:
                this.f42150b.a(e.f42141a);
                break;
            case 2:
                this.f42150b.a(c.f42139a);
                break;
            case 3:
                this.f42150b.a(b.f42138a);
                break;
            default:
                this.f42150b.a(c.f42139a);
                break;
        }
        return b0.f48488a;
    }
}
