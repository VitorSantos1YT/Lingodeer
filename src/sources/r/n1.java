package r;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.h f48603a;

    public n1(androidx.appcompat.widget.h hVar) {
        this.f48603a = hVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i11) {
        androidx.appcompat.widget.h hVar = this.f48603a;
        py.b bVar = hVar.T;
        w wVar = hVar.f1095b0;
        if (i11 != 1 || wVar.getInputMethodMode() == 2 || wVar.getContentView() == null) {
            return;
        }
        hVar.X.removeCallbacks(bVar);
        bVar.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i11, int i12, int i13) {
    }
}
