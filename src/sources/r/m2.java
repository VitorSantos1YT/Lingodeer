package r;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f48602b;

    public /* synthetic */ m2(Toolbar toolbar, int i11) {
        this.f48601a = i11;
        this.f48602b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48601a) {
            case 0:
                o2 o2Var = this.f48602b.f1051r0;
                q.n nVar = o2Var == null ? null : o2Var.f48619b;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                this.f48602b.n();
                break;
        }
    }
}
