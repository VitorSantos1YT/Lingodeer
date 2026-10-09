package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1612a;

    public a0(AtomicReference atomicReference, j.a aVar) {
        this.f1612a = atomicReference;
    }

    @Override // i.c
    public final void a(Object obj) {
        i.c cVar = (i.c) this.f1612a.get();
        if (cVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        cVar.a(obj);
    }

    @Override // i.c
    public final void b() {
        i.c cVar = (i.c) this.f1612a.getAndSet(null);
        if (cVar != null) {
            cVar.b();
        }
    }
}
