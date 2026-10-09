package u8;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e7.e implements d {
    public Object H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f52825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f52826f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f52827t = 1;

    public /* synthetic */ c() {
    }

    @Override // u8.d
    public final int f(long j11) {
        d dVar = this.f52825e;
        dVar.getClass();
        return dVar.f(j11 - this.f52826f);
    }

    @Override // u8.d
    public final long j(int i11) {
        d dVar = this.f52825e;
        dVar.getClass();
        return dVar.j(i11) + this.f52826f;
    }

    @Override // e7.e
    public final void n() {
        this.f6652b = 0;
        this.f25118c = 0L;
        this.f25119d = false;
        this.f52825e = null;
    }

    @Override // e7.e
    public final void o() {
        switch (this.f52827t) {
            case 0:
                ((r7.b) this.H).m(this);
                break;
            default:
                v8.h hVar = (v8.h) ((ui.k) this.H).f52998b;
                hVar.getClass();
                n();
                hVar.f53799b.add(this);
                break;
        }
    }

    @Override // u8.d
    public final List p(long j11) {
        d dVar = this.f52825e;
        dVar.getClass();
        return dVar.p(j11 - this.f52826f);
    }

    @Override // u8.d
    public final int s() {
        d dVar = this.f52825e;
        dVar.getClass();
        return dVar.s();
    }

    public c(r7.b bVar) {
        this.H = bVar;
    }
}
