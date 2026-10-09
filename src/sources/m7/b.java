package m7;

import android.os.HandlerThread;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40944b;

    public /* synthetic */ b(int i11, int i12) {
        this.f40943a = i12;
        this.f40944b = i11;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f40943a) {
            case 0:
                return new HandlerThread(c.q(this.f40944b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.q(this.f40944b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
