package v7;

import android.hardware.display.DisplayManager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f53698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f53699b;

    public w(y yVar, DisplayManager displayManager) {
        this.f53699b = yVar;
        this.f53698a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i11) {
        if (i11 == 0) {
            y.a(this.f53699b, this.f53698a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i11) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i11) {
    }
}
