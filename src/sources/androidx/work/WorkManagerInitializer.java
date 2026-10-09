package androidx.work;

import android.content.Context;
import fb.c;
import fb.l;
import gb.p;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.m;
import na.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {
    static {
        l.c("WrkMgrInitializer");
    }

    @Override // na.b
    public final Object create(Context context) {
        l.b().getClass();
        c cVar = new c(new l());
        m.f(context, "context");
        p.F(context, cVar);
        p pVarE = p.E(context);
        m.e(pVarE, "getInstance(context)");
        return pVarE;
    }

    @Override // na.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
