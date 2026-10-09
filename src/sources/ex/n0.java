package ex;

import com.google.protobuf.Internal;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends uw.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26048c;

    public /* synthetic */ n0(Object obj, int i11) {
        this.f26047b = i11;
        this.f26048c = obj;
    }

    public static void f(n20.b bVar, Iterator it) {
        try {
            if (!it.hasNext()) {
                mx.d.b(bVar);
            } else if (bVar instanceof bx.a) {
                bVar.c(new p0((bx.a) bVar, it));
            } else {
                bVar.c(new q0(bVar, it));
            }
        } catch (Throwable th2) {
            fb.g0.D(th2);
            mx.d.c(th2, bVar);
        }
    }

    @Override // uw.d
    public final void e(n20.b bVar) {
        switch (this.f26047b) {
            case 0:
                Object[] objArr = (Object[]) this.f26048c;
                if (!(bVar instanceof bx.a)) {
                    bVar.c(new l0(bVar, objArr));
                } else {
                    bVar.c(new k0((bx.a) bVar, objArr));
                }
                break;
            case 1:
                try {
                    f(bVar, ((Internal.ProtobufList) this.f26048c).iterator());
                } catch (Throwable th2) {
                    fb.g0.D(th2);
                    mx.d.c(th2, bVar);
                    return;
                }
                break;
            case 2:
                ((com.bumptech.glide.d) this.f26048c).J(new r0(bVar, 0));
                break;
            default:
                ((uw.h) this.f26048c).b(new fx.v(bVar));
                break;
        }
    }
}
