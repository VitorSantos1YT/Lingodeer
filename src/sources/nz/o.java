package nz;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44339b;

    public /* synthetic */ o(Object obj, int i11) {
        this.f44338a = i11;
        this.f44339b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fz.e, xy.h] */
    @Override // nz.l
    public final Iterator iterator() {
        switch (this.f44338a) {
            case 0:
                return v10.c.B((xy.h) this.f44339b);
            case 1:
                return (Iterator) this.f44339b;
            case 2:
                return new oz.h((CharSequence) this.f44339b);
            case 3:
                return kotlin.jvm.internal.l.a((Object[]) this.f44339b);
            default:
                return ((Iterable) this.f44339b).iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(fz.e eVar) {
        this.f44338a = 0;
        this.f44339b = (xy.h) eVar;
    }
}
