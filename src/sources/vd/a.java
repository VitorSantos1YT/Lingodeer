package vd;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53839a;

    public /* synthetic */ a(int i11) {
        this.f53839a = i11;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f53839a) {
            case 0:
                return new Thread(new py.b(runnable, 7), "glide-active-resources");
            default:
                return new w4.i(runnable);
        }
    }
}
