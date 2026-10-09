package dx;

import com.google.firebase.inappmessaging.internal.k;
import com.google.firebase.inappmessaging.internal.w;
import fx.i;
import uw.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends uw.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24538c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f24536a = i11;
        this.f24537b = obj;
        this.f24538c = obj2;
    }

    @Override // uw.b
    public final void d(uw.c cVar) {
        switch (this.f24536a) {
            case 0:
                ((uw.b) this.f24537b).c(new a(cVar, (uw.b) this.f24538c));
                break;
            case 1:
                g gVar = new g(cVar, (k) this.f24538c);
                cVar.b(gVar);
                ((f) this.f24537b).c(gVar);
                break;
            case 2:
                i iVar = new i(cVar, (yw.c) this.f24538c);
                cVar.b(iVar);
                ((h) this.f24537b).b(iVar);
                break;
            default:
                ((hx.d) this.f24537b).J(new hx.f(cVar, (w) this.f24538c));
                break;
        }
    }
}
