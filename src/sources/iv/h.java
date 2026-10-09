package iv;

import rt.fb;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mv.n f34740b;

    public /* synthetic */ h(mv.n nVar, int i11) {
        this.f34739a = i11;
        this.f34740b = nVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        switch (this.f34739a) {
            case 0:
                String audioKey = (String) obj;
                kotlin.jvm.internal.m.f(audioKey, "audioKey");
                this.f34740b.a(new mv.d(audioKey));
                break;
            case 1:
                this.f34740b.a(new mv.e(((Long) obj).longValue()));
                break;
            case 2:
                String it = (String) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f34740b.a(new mv.f(it));
                break;
            case 3:
                String audioKey2 = (String) obj;
                kotlin.jvm.internal.m.f(audioKey2, "audioKey");
                this.f34740b.a(new mv.d(audioKey2));
                break;
            case 4:
                fb fbVar = (fb) obj;
                i1 i1Var = this.f34740b.f42255e;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, fbVar));
                return qy.b0.f48488a;
            case 5:
                fb fbVar2 = (fb) obj;
                i1 i1Var2 = this.f34740b.f42255e;
                do {
                    value2 = i1Var2.getValue();
                } while (!i1Var2.j(value2, fbVar2));
                return qy.b0.f48488a;
            default:
                fb fbVar3 = (fb) obj;
                i1 i1Var3 = this.f34740b.f42255e;
                do {
                    value3 = i1Var3.getValue();
                } while (!i1Var3.j(value3, fbVar3));
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }
}
