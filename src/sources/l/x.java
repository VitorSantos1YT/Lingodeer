package l;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f39065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a5.f f39066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.b f39070f;

    public x(androidx.appcompat.app.b bVar, Window.Callback callback) {
        this.f39070f = bVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f39065a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f39067c = true;
            callback.onContentChanged();
        } finally {
            this.f39067c = false;
        }
    }

    public final boolean b(int i11, Menu menu) {
        return this.f39065a.onMenuOpened(i11, menu);
    }

    public final void c(int i11, Menu menu) {
        this.f39065a.onPanelClosed(i11, menu);
    }

    public final void d(List list, Menu menu, int i11) {
        p.n.a(this.f39065a, list, menu, i11);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f39065a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z11 = this.f39068d;
        Window.Callback callback = this.f39065a;
        if (z11) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f39070f.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f39065a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            androidx.appcompat.app.b bVar = this.f39070f;
            bVar.B();
            a aVar = bVar.Q;
            if (aVar == null || !aVar.i(keyCode, keyEvent)) {
                z zVar = bVar.f815o0;
                if (zVar == null || !bVar.G(zVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (bVar.f815o0 == null) {
                        z zVarA = bVar.A(0);
                        bVar.H(zVarA, keyEvent);
                        boolean zG = bVar.G(zVarA, keyEvent.getKeyCode(), keyEvent);
                        zVarA.f39084k = false;
                        if (zG) {
                        }
                    }
                    return false;
                }
                z zVar2 = bVar.f815o0;
                if (zVar2 != null) {
                    zVar2.f39085l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f39065a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f39065a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f39065a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f39065a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f39065a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f39065a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f39067c) {
            this.f39065a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i11, Menu menu) {
        if (i11 != 0 || (menu instanceof q.l)) {
            return this.f39065a.onCreatePanelMenu(i11, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i11) {
        a5.f fVar = this.f39066b;
        if (fVar != null) {
            View view = i11 == 0 ? new View(((h0) fVar.f378b).f38983a.f48654a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f39065a.onCreatePanelView(i11);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f39065a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i11, MenuItem menuItem) {
        return this.f39065a.onMenuItemSelected(i11, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i11, Menu menu) {
        b(i11, menu);
        androidx.appcompat.app.b bVar = this.f39070f;
        if (i11 == 108) {
            bVar.B();
            a aVar = bVar.Q;
            if (aVar != null) {
                aVar.c(true);
            }
        } else {
            bVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i11, Menu menu) {
        if (this.f39069e) {
            this.f39065a.onPanelClosed(i11, menu);
            return;
        }
        c(i11, menu);
        androidx.appcompat.app.b bVar = this.f39070f;
        if (i11 == 108) {
            bVar.B();
            a aVar = bVar.Q;
            if (aVar != null) {
                aVar.c(false);
                return;
            }
            return;
        }
        if (i11 == 0) {
            z zVarA = bVar.A(i11);
            if (zVarA.m) {
                bVar.t(zVarA, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z11) {
        p.o.a(this.f39065a, z11);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i11, View view, Menu menu) {
        q.l lVar = menu instanceof q.l ? (q.l) menu : null;
        if (i11 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.Z = true;
        }
        a5.f fVar = this.f39066b;
        if (fVar != null && i11 == 0) {
            h0 h0Var = (h0) fVar.f378b;
            if (!h0Var.f38986d) {
                h0Var.f38983a.f48665l = true;
                h0Var.f38986d = true;
            }
        }
        boolean zOnPreparePanel = this.f39065a.onPreparePanel(i11, view, menu);
        if (lVar != null) {
            lVar.Z = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i11) {
        q.l lVar = this.f39070f.A(0).f39081h;
        if (lVar != null) {
            d(list, lVar, i11);
        } else {
            d(list, menu, i11);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return p.m.a(this.f39065a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f39065a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z11) {
        this.f39065a.onWindowFocusChanged(z11);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i11) {
        if (i11 != 0) {
            return p.m.b(this.f39065a, callback, i11);
        }
        androidx.appcompat.app.b bVar = this.f39070f;
        ob.i iVar = new ob.i(bVar.M, callback);
        p.c cVarN = bVar.n(iVar);
        if (cVarN != null) {
            return iVar.k(cVarN);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f39065a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
