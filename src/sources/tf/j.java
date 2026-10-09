package tf;

import android.app.Dialog;
import androidx.fragment.app.p0;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f52188a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, p0 p0Var) {
        super(p0Var, R.style.com_facebook_auth_dialog);
        this.f52188a = kVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f52188a.getClass();
        super.onBackPressed();
    }
}
