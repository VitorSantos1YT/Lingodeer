package v5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53539b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53540c = -1;

    public o(int i11) {
        this.f53538a = i11;
    }

    @Override // v5.n
    public final boolean d(CharSequence charSequence, int i11, int i12, v vVar) {
        int i13 = this.f53538a;
        if (i11 > i13 || i13 >= i12) {
            return i12 <= i13;
        }
        this.f53539b = i11;
        this.f53540c = i12;
        return false;
    }

    @Override // v5.n
    public final Object b() {
        return this;
    }
}
