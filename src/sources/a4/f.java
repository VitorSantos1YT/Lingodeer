package a4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.bumptech.glide.f {
    @Override // com.bumptech.glide.f
    public final void D(g gVar, g gVar2) {
        gVar.f339b = gVar2;
    }

    @Override // com.bumptech.glide.f
    public final void E(g gVar, Thread thread) {
        gVar.f338a = thread;
    }

    @Override // com.bumptech.glide.f
    public final boolean i(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f345b != dVar) {
                    return false;
                }
                hVar.f345b = dVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.f
    public final boolean j(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f344a != obj) {
                    return false;
                }
                hVar.f344a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.f
    public final boolean k(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f346c != gVar) {
                    return false;
                }
                hVar.f346c = gVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
