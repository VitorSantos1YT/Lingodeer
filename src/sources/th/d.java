package th;

import androidx.media3.common.PlaybackException;
import kotlin.jvm.internal.m;
import y6.h0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f52413a;

    public d(e eVar) {
        this.f52413a = eVar;
    }

    @Override // y6.h0
    public final void D(PlaybackException error) {
        m.f(error, "error");
        e eVar = this.f52413a;
        c cVar = eVar.f52416c;
        if (cVar != null) {
            cVar.a();
        }
        b bVar = eVar.f52417d;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // y6.h0
    public final void y(int i11, boolean z11) {
        if (z11 && i11 != 3 && i11 == 4) {
            e eVar = this.f52413a;
            c cVar = eVar.f52416c;
            if (cVar != null) {
                cVar.a();
            }
            b bVar = eVar.f52417d;
            if (bVar != null) {
                bVar.a();
            }
        }
    }
}
