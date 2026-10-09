package q;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements t4.a {
    public Drawable H;
    public Context K;
    public CharSequence L;
    public CharSequence M;
    public ColorStateList N;
    public PorterDuff.Mode O;
    public boolean P;
    public boolean Q;
    public int R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f47237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f47238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f47239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f47240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f47242f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f47243t;

    @Override // t4.a
    public final z4.c a() {
        return null;
    }

    @Override // t4.a
    public final t4.a b(z4.c cVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.H;
        if (drawable != null) {
            if (this.P || this.Q) {
                this.H = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.H = drawableMutate;
                if (this.P) {
                    drawableMutate.setTintList(this.N);
                }
                if (this.Q) {
                    this.H.setTintMode(this.O);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // t4.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f47243t;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f47242f;
    }

    @Override // t4.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.L;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.H;
    }

    @Override // t4.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.N;
    }

    @Override // t4.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.O;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f47239c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // t4.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f47241e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f47240d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f47237a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f47238b;
        return charSequence != null ? charSequence : this.f47237a;
    }

    @Override // t4.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.M;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.R & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.R & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.R & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.R & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c11) {
        this.f47242f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z11) {
        this.R = (z11 ? 1 : 0) | (this.R & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z11) {
        this.R = (z11 ? 2 : 0) | (this.R & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.L = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z11) {
        this.R = (z11 ? 16 : 0) | (this.R & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.H = drawable;
        c();
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.N = colorStateList;
        this.P = true;
        c();
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.O = mode;
        this.Q = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f47239c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c11) {
        this.f47240d = c11;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c11, char c12) {
        this.f47240d = c11;
        this.f47242f = Character.toLowerCase(c12);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f47237a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f47238b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.M = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z11) {
        this.R = (this.R & 8) | (z11 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // t4.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c11, int i11) {
        this.f47242f = Character.toLowerCase(c11);
        this.f47243t = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final t4.a setContentDescription(CharSequence charSequence) {
        this.L = charSequence;
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c11, int i11) {
        this.f47240d = c11;
        this.f47241e = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i11) {
        this.f47237a = this.K.getResources().getString(i11);
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final t4.a setTooltipText(CharSequence charSequence) {
        this.M = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i11) {
        this.H = this.K.getDrawable(i11);
        c();
        return this;
    }

    @Override // t4.a, android.view.MenuItem
    public final MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f47240d = c11;
        this.f47241e = KeyEvent.normalizeMetaState(i11);
        this.f47242f = Character.toLowerCase(c12);
        this.f47243t = KeyEvent.normalizeMetaState(i12);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i11) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i11) {
        return this;
    }
}
