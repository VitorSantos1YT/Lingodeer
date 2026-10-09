package h9;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SurfaceSyncGroup f32008a;

    public static /* synthetic */ void a(b0 b0Var, SurfaceView surfaceView, b2.a aVar) {
        b0Var.getClass();
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl == null) {
            return;
        }
        SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
        b0Var.f32008a = surfaceSyncGroup;
        b7.a.j(surfaceSyncGroup.add(rootSurfaceControl, new cf.c(8)));
        aVar.run();
        rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
    }

    public final void b() {
        SurfaceSyncGroup surfaceSyncGroup = this.f32008a;
        if (surfaceSyncGroup != null) {
            surfaceSyncGroup.markSyncReady();
            this.f32008a = null;
        }
    }
}
