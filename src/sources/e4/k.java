package e4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends t {
    @Override // e4.d
    public final void a(d dVar) {
        d4.a aVar = (d4.a) this.f24827b;
        int i11 = aVar.f23086w0;
        g gVar = this.f24833h;
        ArrayList arrayList = gVar.f24810l;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            int i15 = ((g) obj).f24805g;
            if (i13 == -1 || i15 < i13) {
                i13 = i15;
            }
            if (i12 < i15) {
                i12 = i15;
            }
        }
        if (i11 == 0 || i11 == 2) {
            gVar.d(i13 + aVar.f23088y0);
        } else {
            gVar.d(i12 + aVar.f23088y0);
        }
    }

    @Override // e4.t
    public final void d() {
        d4.g gVar = this.f24827b;
        if (gVar instanceof d4.a) {
            g gVar2 = this.f24833h;
            gVar2.f24800b = true;
            ArrayList arrayList = gVar2.f24810l;
            d4.a aVar = (d4.a) gVar;
            int i11 = aVar.f23086w0;
            boolean z11 = aVar.f23087x0;
            int i12 = 0;
            if (i11 == 0) {
                gVar2.f24803e = f.LEFT;
                while (i12 < aVar.f23196v0) {
                    d4.g gVar3 = aVar.f23195u0[i12];
                    if (z11 || gVar3.f23133i0 != 8) {
                        g gVar4 = gVar3.f23122d.f24833h;
                        gVar4.f24809k.add(gVar2);
                        arrayList.add(gVar4);
                    }
                    i12++;
                }
                m(this.f24827b.f23122d.f24833h);
                m(this.f24827b.f23122d.f24834i);
                return;
            }
            if (i11 == 1) {
                gVar2.f24803e = f.RIGHT;
                while (i12 < aVar.f23196v0) {
                    d4.g gVar5 = aVar.f23195u0[i12];
                    if (z11 || gVar5.f23133i0 != 8) {
                        g gVar6 = gVar5.f23122d.f24834i;
                        gVar6.f24809k.add(gVar2);
                        arrayList.add(gVar6);
                    }
                    i12++;
                }
                m(this.f24827b.f23122d.f24833h);
                m(this.f24827b.f23122d.f24834i);
                return;
            }
            if (i11 == 2) {
                gVar2.f24803e = f.TOP;
                while (i12 < aVar.f23196v0) {
                    d4.g gVar7 = aVar.f23195u0[i12];
                    if (z11 || gVar7.f23133i0 != 8) {
                        g gVar8 = gVar7.f23124e.f24833h;
                        gVar8.f24809k.add(gVar2);
                        arrayList.add(gVar8);
                    }
                    i12++;
                }
                m(this.f24827b.f23124e.f24833h);
                m(this.f24827b.f23124e.f24834i);
                return;
            }
            if (i11 != 3) {
                return;
            }
            gVar2.f24803e = f.BOTTOM;
            while (i12 < aVar.f23196v0) {
                d4.g gVar9 = aVar.f23195u0[i12];
                if (z11 || gVar9.f23133i0 != 8) {
                    g gVar10 = gVar9.f23124e.f24834i;
                    gVar10.f24809k.add(gVar2);
                    arrayList.add(gVar10);
                }
                i12++;
            }
            m(this.f24827b.f23124e.f24833h);
            m(this.f24827b.f23124e.f24834i);
        }
    }

    @Override // e4.t
    public final void e() {
        d4.g gVar = this.f24827b;
        if (gVar instanceof d4.a) {
            int i11 = ((d4.a) gVar).f23086w0;
            g gVar2 = this.f24833h;
            if (i11 == 0 || i11 == 1) {
                gVar.f23117a0 = gVar2.f24805g;
            } else {
                gVar.f23119b0 = gVar2.f24805g;
            }
        }
    }

    @Override // e4.t
    public final void f() {
        this.f24828c = null;
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
