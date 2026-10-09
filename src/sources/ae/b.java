package ae;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import b7.c0;
import b7.f0;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m7.k;
import m7.l;
import v5.i;
import y6.d0;
import y6.p;
import zd.q;
import zd.r;
import zd.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements r, pe.g, k, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f666b;

    public /* synthetic */ b(Context context, int i11) {
        this.f665a = i11;
        this.f666b = context;
    }

    @Override // v5.i
    public void a(ob.f fVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new c0("EmojiCompatInitializer", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.fragment.app.d(this, fVar, threadPoolExecutor, 18));
    }

    @Override // pe.g
    public Object get() {
        return (ConnectivityManager) this.f666b.getSystemService("connectivity");
    }

    @Override // m7.k
    public l h(oi.c cVar) {
        Context context;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 && ((context = this.f666b) == null || i11 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new p20.c(21).h(cVar);
        }
        int i12 = d0.i(((p) cVar.f44927c).f57291n);
        b7.a.u("Creating an asynchronous MediaCodec adapter for track type " + f0.A(i12));
        return new ob.l(21, new m7.b(i12, 0), new m7.b(i12, 1)).h(cVar);
    }

    @Override // zd.r
    public q p(w wVar) {
        switch (this.f665a) {
            case 0:
                return new c(this.f666b, 0);
            default:
                return new zd.b(this.f666b, wVar.b(Integer.class, InputStream.class));
        }
    }

    public b(Context context) {
        this.f665a = 3;
        this.f666b = context.getApplicationContext();
    }
}
