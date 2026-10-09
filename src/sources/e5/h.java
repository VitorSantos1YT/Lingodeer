package e5;

import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static void a(NestedScrollView nestedScrollView, float f5) {
        try {
            nestedScrollView.setFrameContentVelocity(f5);
        } catch (LinkageError unused) {
        }
    }
}
