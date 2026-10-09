package e00;

import g00.z;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements Iterable, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24697b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f24696a = i11;
        this.f24697b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f24696a) {
            case 0:
                return new i((z) this.f24697b);
            case 1:
                return new oz.b((oz.c) this.f24697b);
            case 2:
                return kotlin.jvm.internal.l.a((Object[]) this.f24697b);
            default:
                return new nz.d(kotlin.jvm.internal.l.a((Object[]) ((lt.e) this.f24697b).f40319b));
        }
    }
}
