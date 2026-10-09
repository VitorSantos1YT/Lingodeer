package yf;

import b1.p;
import java.util.ArrayList;
import java.util.List;
import lf.i;
import lf.j;
import wf.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {
    static {
        i.Message.a();
    }

    public a(p pVar, int i11) {
        super(pVar, i11);
        j.f40039b.r(i11, new k(i11));
    }

    @Override // yf.f, lf.n
    public final lf.a a() {
        return new lf.a(this.f40070d);
    }

    @Override // yf.f, lf.n
    public final List c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(this, 5));
        return arrayList;
    }

    @Override // yf.f
    public final boolean f() {
        return false;
    }
}
