package ry;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f50844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50846c;

    public d(e eVar, int i11, int i12) {
        this.f50844a = eVar;
        this.f50845b = i11;
        jh.h.d(i11, i12, eVar.b());
        this.f50846c = i12 - i11;
    }

    @Override // ry.a
    public final int b() {
        return this.f50846c;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        int i12 = this.f50846c;
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(nv.p.p("index: ", i11, i12, ", size: "));
        }
        return this.f50844a.get(this.f50845b + i11);
    }

    @Override // ry.e, java.util.List
    public final List subList(int i11, int i12) {
        jh.h.d(i11, i12, this.f50846c);
        int i13 = this.f50845b;
        return new d(this.f50844a, i11 + i13, i13 + i12);
    }
}
