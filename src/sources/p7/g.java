package p7;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f46378l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f46379n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y6.n0 f46380o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f46381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ClippingMediaSource$IllegalClippingException f46382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f46383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f46384s;

    public g(e eVar) {
        super(eVar.f46356a);
        this.f46378l = eVar.f46357b;
        this.m = eVar.f46358c;
        this.f46379n = new ArrayList();
        this.f46380o = new y6.n0();
    }

    public final void B(y6.o0 o0Var) {
        long j11;
        y6.n0 n0Var = this.f46380o;
        o0Var.n(0, n0Var);
        long j12 = n0Var.f57252p;
        f fVar = this.f46381p;
        long j13 = this.f46378l;
        ArrayList arrayList = this.f46379n;
        if (fVar == null || arrayList.isEmpty()) {
            this.f46383r = j12;
            this.f46384s = j13 != Long.MIN_VALUE ? j12 + j13 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = (d) arrayList.get(i11);
                long j14 = this.f46383r;
                long j15 = this.f46384s;
                dVar.f46343e = j14;
                dVar.f46344f = j15;
            }
            j11 = 0;
        } else {
            j11 = this.f46383r - j12;
            j13 = j13 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f46384s - j12;
        }
        try {
            f fVar2 = new f(o0Var, j11, j13);
            this.f46381p = fVar2;
            l(fVar2);
        } catch (ClippingMediaSource$IllegalClippingException e8) {
            this.f46382q = e8;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((d) arrayList.get(i12)).f46345t = this.f46382q;
            }
        }
    }

    @Override // p7.a
    public final z a(b0 b0Var, t7.g gVar, long j11) {
        d dVar = new d(this.f46393k.a(b0Var, gVar, j11), this.m, this.f46383r, this.f46384s);
        this.f46379n.add(dVar);
        return dVar;
    }

    @Override // p7.k, p7.a
    public final void i() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f46382q;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.i();
    }

    @Override // p7.a
    public final void m(z zVar) {
        ArrayList arrayList = this.f46379n;
        b7.a.j(arrayList.remove(zVar));
        this.f46393k.m(((d) zVar).f46339a);
        if (arrayList.isEmpty()) {
            f fVar = this.f46381p;
            fVar.getClass();
            B(fVar.f46450b);
        }
    }

    @Override // p7.k, p7.a
    public final void o() {
        super.o();
        this.f46382q = null;
        this.f46381p = null;
    }

    @Override // p7.h1
    public final void y(y6.o0 o0Var) {
        if (this.f46382q != null) {
            return;
        }
        B(o0Var);
    }
}
