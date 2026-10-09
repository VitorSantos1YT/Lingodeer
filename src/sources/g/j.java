package g;

import l1.b1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f28306a;

    public j(a aVar, b1 b1Var) {
        this.f28306a = aVar;
    }

    @Override // i.c
    public final void a(Object obj) {
        b0 b0Var;
        i.h hVar = this.f28306a.f28284a;
        if (hVar != null) {
            hVar.a(obj);
            b0Var = b0.f48488a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    @Override // i.c
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
