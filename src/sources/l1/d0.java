package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39253b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(fz.a aVar) {
        super(aVar);
        g gVar = g.f39303t;
        this.f39254c = gVar;
    }

    @Override // l1.v1
    public final w1 a(Object obj) {
        switch (this.f39253b) {
            case 0:
                return new w1(this, obj, obj == null, null, true);
            default:
                return new w1(this, obj, obj == null, (v2) this.f39254c, true);
        }
    }

    @Override // l1.v1
    public e3 b() {
        switch (this.f39253b) {
            case 0:
                return (e0) this.f39254c;
            default:
                return super.b();
        }
    }

    public d0(fz.c cVar) {
        super(new ju.d(6));
        this.f39254c = new e0(cVar);
    }
}
