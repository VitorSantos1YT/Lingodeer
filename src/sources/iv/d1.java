package iv;

import rt.fb;
import rt.wb;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mv.k0 f34707b;

    public /* synthetic */ d1(mv.k0 k0Var, int i11) {
        this.f34706a = i11;
        this.f34707b = k0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        Object value;
        switch (this.f34706a) {
            case 0:
                this.f34707b.t(new wb(((Boolean) obj).booleanValue()));
                break;
            case 1:
                this.f34707b.d(((Long) obj).longValue());
                break;
            default:
                fb fbVar = (fb) obj;
                i1 i1Var = this.f34707b.f50706c0;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, fbVar));
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }
}
