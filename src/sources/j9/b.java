package j9;

import android.app.Activity;
import android.content.Context;
import hh.p0;
import j3.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@b0("activity")
public class b extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f36182c;

    public b(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        for (Object obj : nz.n.U(context, new i0(25))) {
            if (((Context) obj) instanceof Activity) {
                this.f36182c = (Activity) obj;
            }
        }
        obj = null;
        this.f36182c = (Activity) obj;
    }

    @Override // j9.c0
    public final q a() {
        return new a(this);
    }

    @Override // j9.c0
    public final q c(q qVar) {
        throw new IllegalStateException(p0.i(((a) qVar).f36242b.f3958a, " does not have an Intent set.", new StringBuilder("Destination ")).toString());
    }

    @Override // j9.c0
    public final boolean f() {
        Activity activity = this.f36182c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
