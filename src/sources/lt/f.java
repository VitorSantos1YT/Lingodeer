package lt;

import qy.b0;
import rt.ef;
import rt.gf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f40321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ps.b f40322c;

    public /* synthetic */ f(fz.c cVar, ps.b bVar, int i11) {
        this.f40320a = i11;
        this.f40321b = cVar;
        this.f40322c = bVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f40320a) {
            case 0:
                this.f40321b.invoke(new gf(this.f40322c.f47122a));
                break;
            default:
                this.f40321b.invoke(new ef(this.f40322c.f47122a));
                break;
        }
        return b0.f48488a;
    }
}
