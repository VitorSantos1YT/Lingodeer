package ge;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29153b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f29152a = i11;
        this.f29153b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f29152a) {
            case 0:
                i iVar = (i) this.f29153b;
                int i11 = message.what;
                if (i11 == 1) {
                    iVar.b((f) message.obj);
                    return true;
                }
                if (i11 == 2) {
                    iVar.f29157d.j((f) message.obj);
                }
                return false;
            default:
                int i12 = message.what;
                if (i12 != 0) {
                    try {
                        ((wv.b) this.f29153b).f55484f.set(i12);
                        ((wv.b) this.f29153b).m(i12);
                        ((wv.b) this.f29153b).f55483e.add(Integer.valueOf(i12));
                    } finally {
                        ((wv.b) this.f29153b).f55484f.set(0);
                        if (((wv.b) this.f29153b).f55485t != null) {
                            LockSupport.unpark(((wv.b) this.f29153b).f55485t);
                            ((wv.b) this.f29153b).f55485t = null;
                        }
                    }
                } else if (((wv.b) this.f29153b).f55485t != null) {
                    LockSupport.unpark(((wv.b) this.f29153b).f55485t);
                    ((wv.b) this.f29153b).f55485t = null;
                }
                return false;
        }
    }
}
