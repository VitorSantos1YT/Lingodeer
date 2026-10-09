package ge;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends me.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f29148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f29150f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap f29151t;

    public f(Handler handler, int i11, long j11) {
        this.f29148d = handler;
        this.f29149e = i11;
        this.f29150f = j11;
    }

    @Override // me.d
    public final void e(Object obj, ne.c cVar) {
        this.f29151t = (Bitmap) obj;
        Handler handler = this.f29148d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f29150f);
    }

    @Override // me.d
    public final void h(Drawable drawable) {
        this.f29151t = null;
    }
}
