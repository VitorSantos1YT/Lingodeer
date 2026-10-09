package n0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42962b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f42963c;

    public j0(l0 l0Var, int i11) {
        this.f42963c = l0Var;
        this.f42961a = i11;
    }

    public final void a(int i11) {
        l0 l0Var = this.f42963c;
        bq.f fVar = l0Var.f42970c;
        if (fVar == null) {
            return;
        }
        this.f42962b.add(new z0(fVar, i11, l0Var.f42969b, null));
    }
}
