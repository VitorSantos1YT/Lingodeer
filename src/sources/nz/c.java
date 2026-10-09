package nz;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f44310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.c f44311c;

    public /* synthetic */ c(l lVar, fz.c cVar, int i11) {
        this.f44309a = i11;
        this.f44310b = lVar;
        this.f44311c = cVar;
    }

    @Override // nz.l
    public final Iterator iterator() {
        switch (this.f44309a) {
            case 0:
                return new b(this.f44310b.iterator(), this.f44311c);
            case 1:
                return new g(this);
            default:
                return new g(this, (byte) 0);
        }
    }

    public c(l lVar, fz.c predicate) {
        this.f44309a = 1;
        kotlin.jvm.internal.m.f(predicate, "predicate");
        this.f44310b = lVar;
        this.f44311c = predicate;
    }
}
