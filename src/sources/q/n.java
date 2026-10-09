package q;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements t4.a {
    public char H;
    public char L;
    public Drawable N;
    public final l P;
    public b0 Q;
    public MenuItem.OnMenuItemClickListener R;
    public CharSequence S;
    public CharSequence T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47290a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f47291a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47292b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public View f47293b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47294c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public z4.c f47295c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47296d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f47297d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f47298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f47300f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Intent f47301t;
    public int K = 4096;
    public int M = 4096;
    public int O = 0;
    public ColorStateList U = null;
    public PorterDuff.Mode V = null;
    public boolean W = false;
    public boolean X = false;
    public boolean Y = false;
    public int Z = 16;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f47299e0 = false;

    public n(l lVar, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        this.P = lVar;
        this.f47290a = i12;
        this.f47292b = i11;
        this.f47294c = i13;
        this.f47296d = i14;
        this.f47298e = charSequence;
        this.f47291a0 = i15;
    }

    public static void c(int i11, int i12, String str, StringBuilder sb2) {
        if ((i11 & i12) == i12) {
            sb2.append(str);
        }
    }

    @Override // t4.a
    public final z4.c a() {
        return this.f47295c0;
    }

    @Override // t4.a
    public final t4.a b(z4.c cVar) {
        z4.c cVar2 = this.f47295c0;
        if (cVar2 != null) {
            cVar2.f58815a = null;
        }
        this.f47293b0 = null;
        this.f47295c0 = cVar;
        this.P.p(true);
        z4.c cVar3 = this.f47295c0;
        if (cVar3 != null) {
            o oVar = (o) cVar3;
            oVar.f47302b = new lp.j(this, 9);
            oVar.f47303c.setVisibilityListener(oVar);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f47291a0 & 8) == 0) {
            return false;
        }
        if (this.f47293b0 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f47297d0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.P.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.Y && (this.W || this.X)) {
            drawable = drawable.mutate();
            if (this.W) {
                drawable.setTintList(this.U);
            }
            if (this.X) {
                drawable.setTintMode(this.V);
            }
            this.Y = false;
        }
        return drawable;
    }

    public final boolean e() {
        z4.c cVar;
        if ((this.f47291a0 & 8) != 0) {
            if (this.f47293b0 == null && (cVar = this.f47295c0) != null) {
                this.f47293b0 = ((o) cVar).f47303c.onCreateActionView(this);
            }
            if (this.f47293b0 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f47297d0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.P.f(this);
        }
        return false;
    }

    public final void f(boolean z11) {
        this.Z = (z11 ? 4 : 0) | (this.Z & (-5));
    }

    public final void g(boolean z11) {
        if (z11) {
            this.Z |= 32;
        } else {
            this.Z &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f47293b0;
        if (view != null) {
            return view;
        }
        z4.c cVar = this.f47295c0;
        if (cVar == null) {
            return null;
        }
        View viewOnCreateActionView = ((o) cVar).f47303c.onCreateActionView(this);
        this.f47293b0 = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // t4.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.M;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.L;
    }

    @Override // t4.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.S;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f47292b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return d(drawable);
        }
        int i11 = this.O;
        if (i11 == 0) {
            return null;
        }
        Drawable drawableK = jh.h.k(this.P.f47280a, i11);
        this.O = 0;
        this.N = drawableK;
        return d(drawableK);
    }

    @Override // t4.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.U;
    }

    @Override // t4.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.V;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f47301t;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f47290a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // t4.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.K;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.H;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f47294c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.Q;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f47298e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f47300f;
        return charSequence != null ? charSequence : this.f47298e;
    }

    @Override // t4.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.T;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.Q != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f47299e0;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.Z & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.Z & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.Z & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        z4.c cVar = this.f47295c0;
        if (cVar == null || !((o) cVar).f47303c.overridesItemVisibility()) {
            return (this.Z & 8) == 0;
        }
        return (this.Z & 8) == 0 && ((o) this.f47295c0).f47303c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i11;
        this.f47293b0 = view;
        this.f47295c0 = null;
        if (view != null && view.getId() == -1 && (i11 = this.f47290a) > 0) {
            view.setId(i11);
        }
        l lVar = this.P;
        lVar.M = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c11) {
        if (this.L == c11) {
            return this;
        }
        this.L = Character.toLowerCase(c11);
        this.P.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z11) {
        int i11 = this.Z;
        int i12 = (z11 ? 1 : 0) | (i11 & (-2));
        this.Z = i12;
        if (i11 != i12) {
            this.P.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z11) {
        int i11 = this.Z;
        int i12 = i11 & 4;
        l lVar = this.P;
        if (i12 == 0) {
            int i13 = (i11 & (-3)) | (z11 ? 2 : 0);
            this.Z = i13;
            if (i11 != i13) {
                lVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = lVar.f47285f;
        int size = arrayList.size();
        lVar.y();
        for (int i14 = 0; i14 < size; i14++) {
            n nVar = (n) arrayList.get(i14);
            if (nVar.f47292b == this.f47292b && (nVar.Z & 4) != 0 && nVar.isCheckable()) {
                boolean z12 = nVar == this;
                int i15 = nVar.Z;
                int i16 = (z12 ? 2 : 0) | (i15 & (-3));
                nVar.Z = i16;
                if (i15 != i16) {
                    nVar.P.p(false);
                }
            }
        }
        lVar.x();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z11) {
        if (z11) {
            this.Z |= 16;
        } else {
            this.Z &= -17;
        }
        this.P.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.O = 0;
        this.N = drawable;
        this.Y = true;
        this.P.p(false);
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.U = colorStateList;
        this.W = true;
        this.Y = true;
        this.P.p(false);
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.V = mode;
        this.X = true;
        this.Y = true;
        this.P.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f47301t = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c11) {
        if (this.H == c11) {
            return this;
        }
        this.H = c11;
        this.P.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f47297d0 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.R = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c11, char c12) {
        this.H = c11;
        this.L = Character.toLowerCase(c12);
        this.P.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i11) {
        int i12 = i11 & 3;
        if (i12 != 0 && i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f47291a0 = i11;
        l lVar = this.P;
        lVar.M = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i11) {
        setShowAsAction(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f47298e = charSequence;
        this.P.p(false);
        b0 b0Var = this.Q;
        if (b0Var != null) {
            b0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f47300f = charSequence;
        this.P.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z11) {
        int i11 = this.Z;
        int i12 = (z11 ? 0 : 8) | (i11 & (-9));
        this.Z = i12;
        if (i11 != i12) {
            l lVar = this.P;
            lVar.H = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f47298e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException(kHfjNGauVgdF.NsMkqoYXUE);
    }

    @Override // t4.a, android.view.MenuItem
    public final t4.a setContentDescription(CharSequence charSequence) {
        this.S = charSequence;
        this.P.p(false);
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final t4.a setTooltipText(CharSequence charSequence) {
        this.T = charSequence;
        this.P.p(false);
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c11, int i11) {
        if (this.L == c11 && this.M == i11) {
            return this;
        }
        this.L = Character.toLowerCase(c11);
        this.M = KeyEvent.normalizeMetaState(i11);
        this.P.p(false);
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c11, int i11) {
        if (this.H == c11 && this.K == i11) {
            return this;
        }
        this.H = c11;
        this.K = KeyEvent.normalizeMetaState(i11);
        this.P.p(false);
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.H = c11;
        this.K = KeyEvent.normalizeMetaState(i11);
        this.L = Character.toLowerCase(c12);
        this.M = KeyEvent.normalizeMetaState(i12);
        this.P.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i11) {
        this.N = null;
        this.O = i11;
        this.Y = true;
        this.P.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i11) {
        setTitle(this.P.f47280a.getString(i11));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i11) {
        int i12;
        l lVar = this.P;
        Context context = lVar.f47280a;
        View viewInflate = LayoutInflater.from(context).inflate(i11, (ViewGroup) new LinearLayout(context), false);
        this.f47293b0 = viewInflate;
        this.f47295c0 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i12 = this.f47290a) > 0) {
            viewInflate.setId(i12);
        }
        lVar.M = true;
        lVar.p(true);
        return this;
    }
}
