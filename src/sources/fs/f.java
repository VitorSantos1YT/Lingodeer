package fs;

import rz.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f28022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f28023c;

    public /* synthetic */ f(b0 b0Var, fz.a aVar, int i11) {
        this.f28021a = i11;
        this.f28022b = b0Var;
        this.f28023c = aVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f28021a) {
            case 0:
                e0.B(this.f28022b, null, null, new h(this.f28023c, null, 0), 3);
                break;
            case 1:
                e0.B(this.f28022b, null, null, new h(this.f28023c, null, 1), 3);
                break;
            default:
                e0.B(this.f28022b, null, null, new h(this.f28023c, null, 5), 3);
                break;
        }
        return qy.b0.f48488a;
    }
}
