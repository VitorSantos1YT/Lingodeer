package ei;

import com.lingo.lingoskill.object.ARChar;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn.d f25670b;

    public /* synthetic */ v(dn.d dVar, int i11) {
        this.f25669a = i11;
        this.f25670b = dVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f25669a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i11) {
            case 0:
                return new y((ARChar) this.f25670b.b(iIntValue));
            case 1:
                return new y((ARChar) this.f25670b.c(iIntValue));
            case 2:
                return new en.f(null, (String) this.f25670b.b(iIntValue));
            case 3:
                return new en.f(null, (String) this.f25670b.c(iIntValue));
            case 4:
                return new nq.d(null, (String) this.f25670b.b(iIntValue));
            default:
                return new nq.d(null, (String) this.f25670b.c(iIntValue));
        }
    }
}
