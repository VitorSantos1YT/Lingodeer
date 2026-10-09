package py;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ExecutorService f47213e = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f47214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f47215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f47216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ob.c f47217d;

    public c(ViewGroup viewGroup, a aVar, ob.c cVar) {
        this.f47215b = aVar;
        this.f47217d = cVar;
        this.f47214a = new WeakReference(viewGroup.getContext());
        viewGroup.setDrawingCacheEnabled(true);
        viewGroup.destroyDrawingCache();
        viewGroup.setDrawingCacheQuality(524288);
        this.f47216c = viewGroup.getDrawingCache();
    }
}
