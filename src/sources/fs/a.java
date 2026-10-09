package fs;

import js.r;
import qy.b0;
import rt.xb;
import rt.yb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f28007b;

    public /* synthetic */ a(r rVar, int i11) {
        this.f28006a = i11;
        this.f28007b = rVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f28006a) {
            case 0:
                return Integer.valueOf(this.f28007b.Q);
            case 1:
                this.f28007b.t(xb.f50655a);
                return b0.f48488a;
            case 2:
                this.f28007b.t(yb.f50724a);
                return b0.f48488a;
            default:
                return this.f28007b.f50720t;
        }
    }
}
