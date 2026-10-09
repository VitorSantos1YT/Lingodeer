package av;

import androidx.media3.common.PlaybackException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements y6.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f3169a;

    public m(n nVar) {
        this.f3169a = nVar;
    }

    @Override // y6.h0
    public final void D(PlaybackException error) {
        kotlin.jvm.internal.m.f(error, "error");
        n nVar = this.f3169a;
        l lVar = nVar.f3172c;
        if (lVar != null) {
            lVar.a();
        }
        k kVar = nVar.f3173d;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // y6.h0
    public final void k(int i11) {
        n nVar = this.f3169a;
        if (i11 == 3) {
            k kVar = nVar.f3173d;
            if (kVar != null) {
                kVar.start();
                return;
            }
            return;
        }
        if (i11 != 4) {
            return;
        }
        l lVar = nVar.f3172c;
        if (lVar != null) {
            lVar.a();
        }
        k kVar2 = nVar.f3173d;
        if (kVar2 != null) {
            kVar2.a();
        }
    }
}
