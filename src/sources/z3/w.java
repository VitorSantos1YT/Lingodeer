package z3;

import android.graphics.Rect;
import androidx.compose.ui.window.PopupLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends x {
    @Override // z3.x
    public final void a(PopupLayout popupLayout, int i11, int i12) {
        popupLayout.setSystemGestureExclusionRects(ns.o.M(new Rect(0, 0, i11, i12)));
    }
}
