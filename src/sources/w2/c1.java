package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends z1.q implements y2.y {
    public fz.c Q;
    public long R;

    @Override // z1.q
    public final boolean I0() {
        return true;
    }

    @Override // y2.y
    public final void l(long j11) {
        if (v3.l.a(this.R, j11)) {
            return;
        }
        this.Q.invoke(new v3.l(j11));
        this.R = j11;
    }
}
