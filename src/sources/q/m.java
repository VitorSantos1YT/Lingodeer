package q;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f47287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l.k f47288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f47289c;

    @Override // q.u
    public final void d(l lVar, boolean z11) {
        l.k kVar;
        if ((z11 || lVar == this.f47287a) && (kVar = this.f47288b) != null) {
            kVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        b0 b0Var = this.f47287a;
        h hVar = this.f47289c;
        if (hVar.f47272f == null) {
            hVar.f47272f = new g(hVar);
        }
        b0Var.q(hVar.f47272f.getItem(i11), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f47289c.d(this.f47287a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        b0 b0Var = this.f47287a;
        if (i11 == 82 || i11 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f47288b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f47288b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                b0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return b0Var.performShortcut(i11, keyEvent, 0);
    }

    @Override // q.u
    public final boolean q(l lVar) {
        return false;
    }
}
