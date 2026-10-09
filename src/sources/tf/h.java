package tf;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52180b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f52179a = i11;
        this.f52180b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        switch (this.f52179a) {
            case 0:
                k this$0 = (k) this.f52180b;
                kotlin.jvm.internal.m.f(this$0, "this$0");
                View viewW = this$0.w(false);
                Dialog dialog = this$0.N;
                if (dialog != null) {
                    dialog.setContentView(viewW);
                }
                t tVar = this$0.f52193c0;
                if (tVar != null) {
                    this$0.D(tVar);
                }
                break;
            default:
                d0 loginManager = (d0) this.f52180b;
                if (!qf.a.b(uf.c.class)) {
                    try {
                        kotlin.jvm.internal.m.f(loginManager, "$loginManager");
                        loginManager.c();
                    } catch (Throwable th2) {
                        qf.a.a(uf.c.class, th2);
                    }
                    break;
                }
                break;
        }
    }
}
