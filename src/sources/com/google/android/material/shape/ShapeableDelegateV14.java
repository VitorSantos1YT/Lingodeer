package com.google.android.material.shape;

import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class ShapeableDelegateV14 extends ShapeableDelegate {
    @Override // com.google.android.material.shape.ShapeableDelegate
    public final void b(FrameLayout frameLayout) {
        if (this.f15314c == null || this.f15315d.isEmpty()) {
            return;
        }
        frameLayout.invalidate();
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public final boolean c() {
        return true;
    }
}
