package r;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q.a f48643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f48644b;

    public s2(t2 t2Var) {
        this.f48644b = t2Var;
        Context context = t2Var.f48654a.getContext();
        CharSequence charSequence = t2Var.f48661h;
        q.a aVar = new q.a();
        aVar.f47241e = 4096;
        aVar.f47243t = 4096;
        aVar.N = null;
        aVar.O = null;
        aVar.P = false;
        aVar.Q = false;
        aVar.R = 16;
        aVar.K = context;
        aVar.f47237a = charSequence;
        this.f48643a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        t2 t2Var = this.f48644b;
        Window.Callback callback = t2Var.f48664k;
        if (callback == null || !t2Var.f48665l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f48643a);
    }
}
