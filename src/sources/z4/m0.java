package z4;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i11) {
        view.setImportantForAutofill(i11);
    }
}
