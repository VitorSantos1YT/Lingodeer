package q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class y extends ae.d implements Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f47321c;

    public y(Context context, l lVar) {
        super(context);
        if (lVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f47321c = lVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return i(this.f47321c.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f47321c.addIntentOptions(i11, i12, i13, componentName, intentArr, intent, i14, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i15 = 0; i15 < length; i15++) {
                menuItemArr[i15] = i(menuItemArr2[i15]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f47321c.addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        t0 t0Var = (t0) this.f670b;
        if (t0Var != null) {
            t0Var.clear();
        }
        this.f47321c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f47321c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i11) {
        return i(this.f47321c.findItem(i11));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i11) {
        return i(this.f47321c.getItem(i11));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f47321c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return this.f47321c.isShortcutKey(i11, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i11, int i12) {
        return this.f47321c.performIdentifierAction(i11, i12);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        return this.f47321c.performShortcut(i11, keyEvent, i12);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i11) {
        if (((t0) this.f670b) != null) {
            int i12 = 0;
            while (true) {
                t0 t0Var = (t0) this.f670b;
                if (i12 >= t0Var.f56767c) {
                    break;
                }
                if (((t4.a) t0Var.f(i12)).getGroupId() == i11) {
                    ((t0) this.f670b).h(i12);
                    i12--;
                }
                i12++;
            }
        }
        this.f47321c.removeGroup(i11);
    }

    @Override // android.view.Menu
    public final void removeItem(int i11) {
        if (((t0) this.f670b) != null) {
            int i12 = 0;
            while (true) {
                t0 t0Var = (t0) this.f670b;
                if (i12 >= t0Var.f56767c) {
                    break;
                }
                if (((t4.a) t0Var.f(i12)).getItemId() == i11) {
                    ((t0) this.f670b).h(i12);
                    break;
                }
                i12++;
            }
        }
        this.f47321c.removeItem(i11);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i11, boolean z11, boolean z12) {
        this.f47321c.setGroupCheckable(i11, z11, z12);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i11, boolean z11) {
        this.f47321c.setGroupEnabled(i11, z11);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i11, boolean z11) {
        this.f47321c.setGroupVisible(i11, z11);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z11) {
        this.f47321c.setQwertyMode(z11);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f47321c.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11) {
        return i(this.f47321c.add(i11));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11) {
        return this.f47321c.addSubMenu(i11);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return i(this.f47321c.add(i11, i12, i13, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        return this.f47321c.addSubMenu(i11, i12, i13, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, int i14) {
        return i(this.f47321c.add(i11, i12, i13, i14));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return this.f47321c.addSubMenu(i11, i12, i13, i14);
    }
}
