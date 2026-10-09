package v7;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import b7.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f53700e = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f53701a = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f53702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Choreographer f53703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53704d;

    public x() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = f0.f3975a;
        Handler handler = new Handler(looper, this);
        this.f53702b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        this.f53701a = j11;
        Choreographer choreographer = this.f53703c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 1) {
            try {
                this.f53703c = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e8) {
                b7.a.C("Vsync sampling disabled due to platform error", e8);
                return true;
            }
        }
        if (i11 == 2) {
            Choreographer choreographer = this.f53703c;
            if (choreographer != null) {
                int i12 = this.f53704d + 1;
                this.f53704d = i12;
                if (i12 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i11 != 3) {
                return false;
            }
            Choreographer choreographer2 = this.f53703c;
            if (choreographer2 != null) {
                int i13 = this.f53704d - 1;
                this.f53704d = i13;
                if (i13 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f53701a = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
