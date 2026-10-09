package fx;

import com.google.android.gms.tasks.Task;
import fb.g0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends uw.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28234b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f28233a = i11;
        this.f28234b = obj;
    }

    @Override // uw.h
    public final void c(uw.i iVar) {
        switch (this.f28233a) {
            case 0:
                c cVar = new c(iVar);
                iVar.b(cVar);
                try {
                    com.google.firebase.inappmessaging.internal.f fVar = (com.google.firebase.inappmessaging.internal.f) this.f28234b;
                    Task task = (Task) fVar.f20086b;
                    Executor executor = (Executor) fVar.f20087c;
                    task.addOnSuccessListener(executor, new com.google.firebase.inappmessaging.internal.q(cVar));
                    task.addOnFailureListener(executor, new com.google.firebase.inappmessaging.internal.q(cVar));
                } catch (Throwable th2) {
                    g0.D(th2);
                    cVar.b(th2);
                    return;
                }
                break;
            default:
                ((uw.b) this.f28234b).c(new m(iVar, 0));
                break;
        }
    }
}
