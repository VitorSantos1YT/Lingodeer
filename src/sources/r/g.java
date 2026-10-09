package r;

import android.view.View;
import androidx.appcompat.widget.ScrollingTabContainerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48567c;

    public /* synthetic */ g(int i11, Object obj, Object obj2) {
        this.f48565a = i11;
        this.f48567c = obj;
        this.f48566b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q.j jVar;
        switch (this.f48565a) {
            case 0:
                e eVar = (e) this.f48566b;
                androidx.appcompat.widget.c cVar = (androidx.appcompat.widget.c) this.f48567c;
                q.l lVar = cVar.f1070c;
                if (lVar != null && (jVar = lVar.f47284e) != null) {
                    jVar.i(lVar);
                }
                View view = (View) cVar.H;
                if (view != null && view.getWindowToken() != null) {
                    if (eVar.b()) {
                        cVar.V = eVar;
                    } else if (eVar.f47314e != null) {
                        eVar.d(0, 0, false, false);
                        cVar.V = eVar;
                    }
                }
                cVar.X = null;
                break;
            default:
                View view2 = (View) this.f48566b;
                int left = view2.getLeft();
                ScrollingTabContainerView scrollingTabContainerView = (ScrollingTabContainerView) this.f48567c;
                scrollingTabContainerView.smoothScrollTo(left - ((scrollingTabContainerView.getWidth() - view2.getWidth()) / 2), 0);
                scrollingTabContainerView.f960a = null;
                break;
        }
    }
}
