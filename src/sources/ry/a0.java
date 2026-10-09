package ry;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f50829e;

    public a0(b0 b0Var) {
        this.f50829e = b0Var;
        this.f50827c = b0Var.f50835d;
        this.f50828d = b0Var.f50834c;
    }

    @Override // ry.b
    public final void a() {
        int i11 = this.f50827c;
        if (i11 == 0) {
            this.f50830a = 2;
            return;
        }
        b0 b0Var = this.f50829e;
        Object[] objArr = b0Var.f50832a;
        int i12 = this.f50828d;
        this.f50831b = objArr[i12];
        this.f50830a = 1;
        this.f50828d = (i12 + 1) % b0Var.f50833b;
        this.f50827c = i11 - 1;
    }
}
