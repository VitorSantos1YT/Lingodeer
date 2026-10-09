package z4;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f58876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f58877b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f58878c = new HashMap();

    public o(Runnable runnable) {
        this.f58876a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f58877b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.b1) ((p) it.next())).f1625a.p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(p pVar) {
        this.f58877b.remove(pVar);
        n nVar = (n) this.f58878c.remove(pVar);
        if (nVar != null) {
            nVar.f58873a.removeObserver(nVar.f58874b);
            nVar.f58874b = null;
        }
        this.f58876a.run();
    }
}
