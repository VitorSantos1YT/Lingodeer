package fb;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkerParameters f27111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f27112c = new AtomicInteger(-256);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27113d;

    public v(Context context, WorkerParameters workerParameters) {
        this.f27110a = context;
        this.f27111b = workerParameters;
    }

    public abstract a4.l a();

    public abstract a4.l b();
}
