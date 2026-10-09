package r3;

import android.text.style.ClickableSpan;
import android.view.View;
import j3.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f48783a;

    public e(w wVar) {
        this.f48783a = wVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        w wVar = this.f48783a;
        uu.e eVarA = wVar.a();
        if (eVarA != null) {
            eVarA.a(wVar);
        }
    }
}
