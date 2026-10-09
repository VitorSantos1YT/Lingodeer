package a2;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static AutofillValue a(String str) {
        return AutofillValue.forText(str);
    }

    public static AutofillValue b(boolean z11) {
        return AutofillValue.forToggle(z11);
    }

    public static void c(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void d(ViewStructure viewStructure, AutofillId autofillId, int i11) {
        viewStructure.setAutofillId(autofillId, i11);
    }

    public static void e(ViewStructure viewStructure, int i11) {
        viewStructure.setAutofillType(i11);
    }

    public static void f(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void g(ViewStructure viewStructure, boolean z11) {
        viewStructure.setDataIsSensitive(z11);
    }

    public static void h(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }
}
