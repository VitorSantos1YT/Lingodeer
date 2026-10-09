package q;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f47304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.view.menu.a f47305b;

    public p(androidx.appcompat.view.menu.a aVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f47305b = aVar;
        this.f47304a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f47304a.onMenuItemActionCollapse(this.f47305b.i(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f47304a.onMenuItemActionExpand(this.f47305b.i(menuItem));
    }
}
