package e2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i11, int i12) {
        super(1);
        this.f24734a = i12;
        this.f24735b = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f24734a) {
            case 0:
                return Boolean.valueOf(((e0) obj).Z0(this.f24735b));
            case 1:
                return Boolean.valueOf(((e0) obj).Z0(this.f24735b));
            case 2:
                return Boolean.valueOf(((e0) obj).T0(this.f24735b));
            case 3:
                g3.z.g((g3.b0) obj, this.f24735b);
                return qy.b0.f48488a;
            case 4:
                g3.z.g((g3.b0) obj, 12 + this.f24735b);
                return qy.b0.f48488a;
            case 5:
                return Boolean.valueOf(((e0) obj).Z0(this.f24735b));
            default:
                return Boolean.valueOf(((e0) obj).Z0(this.f24735b));
        }
    }
}
