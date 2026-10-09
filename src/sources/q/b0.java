package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends l implements SubMenu {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final l f47250b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final n f47251c0;

    public b0(Context context, l lVar, n nVar) {
        super(context);
        this.f47250b0 = lVar;
        this.f47251c0 = nVar;
    }

    @Override // q.l
    public final boolean d(n nVar) {
        return this.f47250b0.d(nVar);
    }

    @Override // q.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f47250b0.e(lVar, menuItem);
    }

    @Override // q.l
    public final boolean f(n nVar) {
        return this.f47250b0.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f47251c0;
    }

    @Override // q.l
    public final String j() {
        n nVar = this.f47251c0;
        int i11 = nVar != null ? nVar.f47290a : 0;
        if (i11 == 0) {
            return null;
        }
        return nv.p.j(i11, "android:menu:actionviewstates:");
    }

    @Override // q.l
    public final l k() {
        return this.f47250b0.k();
    }

    @Override // q.l
    public final boolean m() {
        return this.f47250b0.m();
    }

    @Override // q.l
    public final boolean n() {
        return this.f47250b0.n();
    }

    @Override // q.l
    public final boolean o() {
        return this.f47250b0.o();
    }

    @Override // q.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z11) {
        this.f47250b0.setGroupDividerEnabled(z11);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f47251c0.setIcon(drawable);
        return this;
    }

    @Override // q.l, android.view.Menu
    public final void setQwertyMode(boolean z11) {
        this.f47250b0.setQwertyMode(z11);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i11) {
        w(0, null, i11, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i11) {
        w(i11, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i11) {
        this.f47251c0.setIcon(i11);
        return this;
    }
}
