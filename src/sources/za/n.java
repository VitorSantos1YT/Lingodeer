package za;

import android.os.Build;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final db.d f59081b;

    public n() {
        this.f59081b = Build.VERSION.SDK_INT >= 34 ? db.e.f23351b : db.a.f23345g;
        o.b(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
