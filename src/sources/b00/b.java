package b00;

import com.bumptech.glide.e;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import rz.m;
import s20.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements OnCompleteListener, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f3759a;

    public /* synthetic */ b(m mVar) {
        this.f3759a = mVar;
    }

    @Override // s20.f
    public void c(File file) {
        kotlin.jvm.internal.m.f(file, "file");
        file.getPath();
        this.f3759a.resumeWith(file);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        m mVar = this.f3759a;
        if (exception != null) {
            mVar.resumeWith(e.l(exception));
        } else if (task.isCanceled()) {
            mVar.k(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // s20.f
    public void onError(Throwable e8) {
        kotlin.jvm.internal.m.f(e8, "e");
        this.f3759a.resumeWith(e.l(e8));
    }

    @Override // s20.f
    public void onStart() {
    }
}
