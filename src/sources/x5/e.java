package x5;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import qp.m3;
import re.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f55791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f55792b;

    public e(KeyListener keyListener) {
        e0 e0Var = new e0(12);
        this.f55791a = keyListener;
        this.f55792b = e0Var;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i11) {
        this.f55791a.clearMetaKeyState(view, editable, i11);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f55791a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i11, KeyEvent keyEvent) {
        boolean zD;
        boolean z11;
        this.f55792b.getClass();
        if (i11 != 67) {
            zD = i11 != 112 ? false : m3.d(editable, keyEvent, true);
        } else {
            zD = m3.d(editable, keyEvent, false);
        }
        if (zD) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z11 = true;
        } else {
            z11 = false;
        }
        return z11 || this.f55791a.onKeyDown(view, editable, i11, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f55791a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i11, KeyEvent keyEvent) {
        return this.f55791a.onKeyUp(view, editable, i11, keyEvent);
    }
}
