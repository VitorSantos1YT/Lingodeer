package o1;

import java.util.List;
import se.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ry.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.c f44467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44469c;

    public a(p1.c cVar, int i11, int i12) {
        this.f44467a = cVar;
        this.f44468b = i11;
        i.j(i11, i12, cVar.b());
        this.f44469c = i12 - i11;
    }

    @Override // ry.a
    public final int b() {
        return this.f44469c;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        i.h(i11, this.f44469c);
        return this.f44467a.get(this.f44468b + i11);
    }

    @Override // ry.e, java.util.List
    public final List subList(int i11, int i12) {
        i.j(i11, i12, this.f44469c);
        int i13 = this.f44468b;
        return new a(this.f44467a, i11 + i13, i13 + i12);
    }
}
