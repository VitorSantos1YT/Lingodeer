package av;

import com.stkouyu.listener.OnRecorderListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends OnRecorderListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f3192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz.m f3193b;

    public s(AtomicBoolean atomicBoolean, rz.m mVar) {
        this.f3192a = atomicBoolean;
        this.f3193b = mVar;
    }

    @Override // com.stkouyu.listener.OnRecorderListener
    public final void onScore(String result) {
        kotlin.jvm.internal.m.f(result, "result");
        if (this.f3192a.compareAndSet(false, true)) {
            this.f3193b.resumeWith(result);
        }
    }

    @Override // com.stkouyu.listener.OnRecorderListener
    public final void onStartRecordFail(String reason) {
        kotlin.jvm.internal.m.f(reason, "reason");
        if (this.f3192a.compareAndSet(false, true)) {
            this.f3193b.resumeWith(null);
        }
    }

    @Override // com.stkouyu.listener.OnRecorderListener
    public final void onPause() {
    }

    @Override // com.stkouyu.listener.OnRecorderListener
    public final void onRecordEnd() {
    }

    @Override // com.stkouyu.listener.OnRecorderListener
    public final void onStart() {
    }

    @Override // com.stkouyu.listener.OnRecorderListener
    public final void onRecording(int i11, int i12) {
    }

    @Override // com.stkouyu.listener.OnRecorderListener
    public final void onTick(long j11, double d5) {
    }
}
