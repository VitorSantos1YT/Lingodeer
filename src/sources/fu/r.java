package fu;

import l1.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f28149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ad.i f28150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad.i f28151d;

    public /* synthetic */ r(h1 h1Var, ad.i iVar, ad.i iVar2, int i11) {
        this.f28148a = i11;
        this.f28149b = h1Var;
        this.f28150c = iVar;
        this.f28151d = iVar2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f28148a) {
            case 0:
                return Float.valueOf(((Number) (this.f28149b.l() == 0 ? this.f28150c : this.f28151d).getValue()).floatValue());
            default:
                return Float.valueOf(((Number) (this.f28149b.l() == 0 ? this.f28150c : this.f28151d).getValue()).floatValue());
        }
    }
}
