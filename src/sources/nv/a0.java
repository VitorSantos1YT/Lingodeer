package nv;

import qy.b0;
import rt.fb;
import rt.wb;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sv.o f44118b;

    public /* synthetic */ a0(sv.o oVar, int i11) {
        this.f44117a = i11;
        this.f44118b = oVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        Object value;
        switch (this.f44117a) {
            case 0:
                this.f44118b.t(new wb(((Boolean) obj).booleanValue()));
                break;
            case 1:
                this.f44118b.d(((Long) obj).longValue());
                break;
            default:
                fb fbVar = (fb) obj;
                i1 i1Var = this.f44118b.f50706c0;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, fbVar));
                return b0.f48488a;
        }
        return b0.f48488a;
    }
}
