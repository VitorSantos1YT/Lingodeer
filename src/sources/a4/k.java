package a4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h {
    public final /* synthetic */ l H;

    public k(l lVar) {
        this.H = lVar;
    }

    @Override // a4.h
    public final String h() {
        i iVar = (i) this.H.f351a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f347a + "]";
    }
}
