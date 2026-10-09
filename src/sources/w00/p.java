package w00;

import z00.s;
import z00.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends c10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f54442a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54444c;

    public p(int i11) {
        this.f54443b = i11;
    }

    @Override // c10.a
    public final boolean c(z00.a aVar) {
        if (!this.f54444c) {
            return true;
        }
        return true;
    }

    @Override // c10.a
    public final z00.a f() {
        return this.f54442a;
    }

    @Override // c10.a
    public final boolean h() {
        return true;
    }

    @Override // c10.a
    public final l8.h j(f fVar) {
        if (fVar.f54391i) {
            if (this.f54442a.f58444b == null) {
                return null;
            }
            z00.a aVarF = fVar.g().f();
            this.f54444c = (aVarF instanceof w) || (aVarF instanceof s);
            return l8.h.a(fVar.f54388f);
        }
        int i11 = fVar.f54390h;
        int i12 = this.f54443b;
        if (i11 >= i12) {
            return new l8.h(-1, fVar.f54386d + i12, false);
        }
        return null;
    }
}
