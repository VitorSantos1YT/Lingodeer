package c6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f6627b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f6626a = j.f6631a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6628c = 1;

    @Override // c6.g
    public final g a() {
        h hVar = new h();
        hVar.f6626a = this.f6626a;
        hVar.f6627b = this.f6627b;
        hVar.f6628c = this.f6628c;
        return hVar;
    }

    @Override // c6.g
    public final l b() {
        return this.f6626a;
    }

    @Override // c6.g
    public final void c(l lVar) {
        this.f6626a = lVar;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.f6626a + ", provider=" + this.f6627b + ", colorFilterParams=null, contentScale=" + ((Object) k6.h.a(this.f6628c)) + ')';
    }
}
