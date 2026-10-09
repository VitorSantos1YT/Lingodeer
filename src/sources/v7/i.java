package v7;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.ExoPlaybackException;
import b7.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f53620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f53621b;

    public i(j jVar, m7.l lVar) {
        this.f53621b = jVar;
        Handler handlerM = f0.m(this);
        this.f53620a = handlerM;
        lVar.e(this, handlerM);
    }

    public final void a(long j11) {
        j jVar = this.f53621b;
        if (this != jVar.R1 || jVar.f41019n0 == null) {
            return;
        }
        if (j11 == Long.MAX_VALUE) {
            jVar.W0 = true;
            return;
        }
        try {
            jVar.H0(j11);
        } catch (ExoPlaybackException e8) {
            jVar.X0 = e8;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i11 = message.arg1;
        int i12 = message.arg2;
        String str = f0.f3975a;
        a(((((long) i11) & 4294967295L) << 32) | (4294967295L & ((long) i12)));
        return true;
    }
}
