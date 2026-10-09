package z2;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f58538a;

    public g(h hVar) {
        this.f58538a = hVar;
    }

    public final void a(b1 b1Var) {
        ClipboardManager clipboardManager = this.f58538a.f58568a;
        if (b1Var != null) {
            clipboardManager.setPrimaryClip(b1Var.f58509a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            u0.a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME));
        }
    }
}
