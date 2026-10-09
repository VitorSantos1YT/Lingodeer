package xy;

import vy.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends a {
    public g(vy.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != j.f54321a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // vy.d
    public vy.i getContext() {
        return j.f54321a;
    }
}
