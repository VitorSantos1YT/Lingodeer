package jp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f36460a;

    @Override // tx.c
    public void accept(Object obj) {
        Long it = (Long) obj;
        kotlin.jvm.internal.m.f(it, "it");
        i iVar = this.f36460a;
        if (!iVar.f36492v || iVar.f36491u + 1 >= iVar.f36484n.size()) {
            i.u(iVar);
        } else {
            iVar.f36491u++;
            iVar.v();
        }
    }
}
