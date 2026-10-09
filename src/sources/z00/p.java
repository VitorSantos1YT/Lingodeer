package z00;

import com.android.billingclient.api.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f58438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f58439h;

    public p(String str, String str2) {
        this.f58438g = str;
        this.f58439h = str2;
    }

    @Override // z00.t
    public final void a(c0 c0Var) {
        c0Var.f7470b++;
        t tVar = this.f58444b;
        while (tVar != null) {
            t tVar2 = tVar.f58447e;
            tVar.a(c0Var);
            tVar = tVar2;
        }
        c0Var.f7470b--;
    }

    @Override // z00.t
    public final String h() {
        return defpackage.e.n("destination=", this.f58438g, ", title=", this.f58439h);
    }
}
