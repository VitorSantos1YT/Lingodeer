package sw;

import com.tbruyelle.rxpermissions3.BuildConfig;
import lw.l0;
import lw.o0;
import lw.r0;
import mw.a4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f51865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f51866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f51867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lw.n f51868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o0 f51869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51870f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f51871g;

    public l(z zVar, m mVar, a4 a4Var, l0 l0Var) {
        this.f51871g = zVar;
        this.f51865a = mVar;
        this.f51867c = a4Var;
        this.f51869e = l0Var;
        h hVar = new h(new k(this, 1));
        this.f51866b = hVar;
        this.f51868d = lw.n.CONNECTING;
        hVar.i(a4Var);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address = ");
        sb2.append(this.f51865a);
        sb2.append(", state = ");
        sb2.append(this.f51868d);
        sb2.append(", picker type: ");
        sb2.append(this.f51869e.getClass());
        sb2.append(", lb: ");
        sb2.append(this.f51866b.g().getClass());
        sb2.append(this.f51870f ? ", deactivated" : BuildConfig.VERSION_NAME);
        return sb2.toString();
    }
}
