package ve;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f53987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53988b;

    public e(View view, String viewMapKey) {
        m.f(view, "view");
        m.f(viewMapKey, "viewMapKey");
        this.f53987a = new WeakReference(view);
        this.f53988b = viewMapKey;
    }

    public final View a() {
        WeakReference weakReference = this.f53987a;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
