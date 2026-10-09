package b7;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f4023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f4024c;

    public t(u uVar, t7.h hVar, Executor executor) {
        this.f4024c = uVar;
        this.f4022a = new WeakReference(hVar);
        this.f4023b = executor;
    }
}
