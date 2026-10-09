package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends b0.h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw.e0 f42658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(lw.e0 e0Var, int i11) {
        super(5);
        this.f42657c = i11;
        this.f42658d = e0Var;
    }

    @Override // b0.h2
    public final void b0() {
        switch (this.f42657c) {
            case 0:
                a2 a2Var = (a2) this.f42658d;
                ((x2) a2Var.f42312d.f42668b).f42794j.Z.r0(a2Var, true);
                break;
            case 1:
                ((y2) this.f42658d).h();
                break;
            default:
                ((nw.p) this.f42658d).f44244h.h(true);
                break;
        }
    }

    @Override // b0.h2
    public final void c0() {
        switch (this.f42657c) {
            case 0:
                a2 a2Var = (a2) this.f42658d;
                ((x2) a2Var.f42312d.f42668b).f42794j.Z.r0(a2Var, false);
                break;
            case 1:
                y2 y2Var = (y2) this.f42658d;
                if (!y2Var.G.get()) {
                    y2Var.j();
                    break;
                }
                break;
            default:
                ((nw.p) this.f42658d).f44244h.h(false);
                break;
        }
    }
}
