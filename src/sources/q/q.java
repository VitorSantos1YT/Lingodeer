package q;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f47306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.view.menu.a f47307b;

    public q(androidx.appcompat.view.menu.a aVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f47307b = aVar;
        this.f47306a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f47306a.onMenuItemClick(this.f47307b.i(menuItem));
    }
}
