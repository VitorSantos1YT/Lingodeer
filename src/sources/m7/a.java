package m7;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v7.i f40942b;

    public /* synthetic */ a(l lVar, v7.i iVar, int i11) {
        this.f40941a = i11;
        this.f40942b = iVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
        switch (this.f40941a) {
            case 0:
                v7.i iVar = this.f40942b;
                Handler handler = iVar.f53620a;
                if (Build.VERSION.SDK_INT >= 30) {
                    iVar.a(j11);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j11 >> 32), (int) j11));
                }
                break;
            default:
                v7.i iVar2 = this.f40942b;
                Handler handler2 = iVar2.f53620a;
                if (Build.VERSION.SDK_INT >= 30) {
                    iVar2.a(j11);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j11 >> 32), (int) j11));
                }
                break;
        }
    }
}
