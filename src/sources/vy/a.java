package vy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements g {
    private final h key;

    public a(h hVar) {
        this.key = hVar;
    }

    @Override // vy.i
    public <R> R fold(R r9, fz.e eVar) {
        return (R) ew.a.k(this, r9, eVar);
    }

    @Override // vy.i
    public g get(h hVar) {
        return ew.a.m(this, hVar);
    }

    @Override // vy.g
    public h getKey() {
        return this.key;
    }

    @Override // vy.i
    public i minusKey(h hVar) {
        return ew.a.s(this, hVar);
    }

    @Override // vy.i
    public i plus(i iVar) {
        return ew.a.w(this, iVar);
    }
}
