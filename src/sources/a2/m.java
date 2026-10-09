package a2;

import android.view.autofill.AutofillManager$AutofillCallback;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends AutofillManager$AutofillCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f311a = new m();

    public final void a(a aVar) {
        aVar.f294c.registerCallback(this);
    }

    public final void b(a aVar) {
        aVar.f294c.unregisterCallback(this);
    }
}
