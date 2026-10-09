package a2;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AutofillId f295d;

    public a(AndroidComposeView androidComposeView, o oVar) {
        this.f292a = androidComposeView;
        this.f293b = oVar;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f294c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
        s sVarR = ue.f.r(androidComposeView);
        AutofillId autofillId = sVarR != null ? (AutofillId) sVarR.f318a : null;
        if (autofillId == null) {
            throw defpackage.e.t("Required value was null.");
        }
        this.f295d = autofillId;
    }
}
