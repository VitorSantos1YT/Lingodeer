package p20;

import ay.w;
import com.android.billingclient.api.k0;
import lf.x0;
import qx.h;
import qx.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f46286b;

    public /* synthetic */ a(w wVar, int i11) {
        this.f46285a = i11;
        this.f46286b = wVar;
    }

    @Override // qx.h
    public final void j(k kVar) {
        switch (this.f46285a) {
            case 0:
                this.f46286b.i(new k0(kVar));
                break;
            default:
                this.f46286b.i(new x0(kVar, 12));
                break;
        }
    }
}
