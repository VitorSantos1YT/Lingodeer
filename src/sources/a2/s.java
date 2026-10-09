package a2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f318a;

    public /* synthetic */ s(Object obj) {
        this.f318a = obj;
    }

    public void a() {
        ((AutofillManager) this.f318a).commit();
    }

    public void b(AndroidComposeView androidComposeView, int i11, AutofillValue autofillValue) {
        ((AutofillManager) this.f318a).notifyValueChanged(androidComposeView, i11, autofillValue);
    }

    public void c(AndroidComposeView androidComposeView, int i11, Rect rect) {
        ((AutofillManager) this.f318a).notifyViewEntered(androidComposeView, i11, rect);
    }

    public void d(AndroidComposeView androidComposeView, int i11) {
        ((AutofillManager) this.f318a).notifyViewExited(androidComposeView, i11);
    }

    public void e(View view, int i11, boolean z11) {
        if (Build.VERSION.SDK_INT >= 27) {
            k.a(view, (AutofillManager) this.f318a, i11, z11);
        }
    }

    public void f(AndroidComposeView androidComposeView, int i11, Rect rect) {
        ((AutofillManager) this.f318a).requestAutofill(androidComposeView, i11, rect);
    }

    public AutofillId g() {
        return a10.b.c(this.f318a);
    }
}
