package m6;

import android.content.Context;
import jr.i0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import rz.e0;
import rz.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends vy.a implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f40915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e6.l f40916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f40917c;

    /* JADX WARN: Illegal instructions before constructor call */
    public q(w wVar, e6.l lVar, Context context) {
        z zVar = z.f50977a;
        this.f40915a = wVar;
        this.f40916b = lVar;
        this.f40917c = context;
        super(zVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void c(Throwable th2, vy.i iVar) {
        e6.l lVar = this.f40916b;
        Context context = this.f40917c;
        w wVar = this.f40915a;
        e0.B(wVar, null, null, new i0(lVar, context, th2, wVar, null, 4), 3);
    }
}
