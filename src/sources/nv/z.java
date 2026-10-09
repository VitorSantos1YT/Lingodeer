package nv;

import qy.b0;
import rt.xb;
import rt.yb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sv.o f44184b;

    public /* synthetic */ z(sv.o oVar, int i11) {
        this.f44183a = i11;
        this.f44184b = oVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f44183a) {
            case 0:
                return Integer.valueOf(this.f44184b.Q);
            case 1:
                this.f44184b.t(xb.f50655a);
                return b0.f48488a;
            case 2:
                this.f44184b.t(yb.f50724a);
                return b0.f48488a;
            default:
                return this.f44184b.f51833r0;
        }
    }
}
