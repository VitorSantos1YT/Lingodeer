package e4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends t {
    @Override // e4.d
    public final void a(d dVar) {
        g gVar = this.f24833h;
        if (gVar.f24801c && !gVar.f24808j) {
            gVar.d((int) ((((g) gVar.f24810l.get(0)).f24805g * ((d4.l) this.f24827b).f23189u0) + 0.5f));
        }
    }

    @Override // e4.t
    public final void d() {
        d4.g gVar = this.f24827b;
        d4.l lVar = (d4.l) gVar;
        int i11 = lVar.f23190v0;
        int i12 = lVar.f23191w0;
        int i13 = lVar.f23193y0;
        g gVar2 = this.f24833h;
        if (i13 == 1) {
            if (i11 != -1) {
                gVar2.f24810l.add(gVar.V.f23122d.f24833h);
                this.f24827b.V.f23122d.f24833h.f24809k.add(gVar2);
                gVar2.f24804f = i11;
            } else if (i12 != -1) {
                gVar2.f24810l.add(gVar.V.f23122d.f24834i);
                this.f24827b.V.f23122d.f24834i.f24809k.add(gVar2);
                gVar2.f24804f = -i12;
            } else {
                gVar2.f24800b = true;
                gVar2.f24810l.add(gVar.V.f23122d.f24834i);
                this.f24827b.V.f23122d.f24834i.f24809k.add(gVar2);
            }
            m(this.f24827b.f23122d.f24833h);
            m(this.f24827b.f23122d.f24834i);
            return;
        }
        if (i11 != -1) {
            gVar2.f24810l.add(gVar.V.f23124e.f24833h);
            this.f24827b.V.f23124e.f24833h.f24809k.add(gVar2);
            gVar2.f24804f = i11;
        } else if (i12 != -1) {
            gVar2.f24810l.add(gVar.V.f23124e.f24834i);
            this.f24827b.V.f23124e.f24834i.f24809k.add(gVar2);
            gVar2.f24804f = -i12;
        } else {
            gVar2.f24800b = true;
            gVar2.f24810l.add(gVar.V.f23124e.f24834i);
            this.f24827b.V.f23124e.f24834i.f24809k.add(gVar2);
        }
        m(this.f24827b.f23124e.f24833h);
        m(this.f24827b.f23124e.f24834i);
    }

    @Override // e4.t
    public final void e() {
        d4.g gVar = this.f24827b;
        int i11 = ((d4.l) gVar).f23193y0;
        g gVar2 = this.f24833h;
        if (i11 == 1) {
            gVar.f23117a0 = gVar2.f24805g;
        } else {
            gVar.f23119b0 = gVar2.f24805g;
        }
    }

    @Override // e4.t
    public final void f() {
        this.f24833h.c();
    }

    @Override // e4.t
    public final boolean k() {
        return false;
    }

    public final void m(g gVar) {
        g gVar2 = this.f24833h;
        gVar2.f24809k.add(gVar);
        gVar.f24810l.add(gVar2);
    }
}
