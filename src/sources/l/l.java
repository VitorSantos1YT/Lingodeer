package l;

import android.view.LayoutInflater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f39027a;

    public l(m mVar) {
        this.f39027a = mVar;
    }

    @Override // h.b
    public final void a(f.n nVar) {
        m mVar = this.f39027a;
        androidx.appcompat.app.a delegate = mVar.getDelegate();
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) delegate;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(bVar.M);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(bVar);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        mVar.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}
