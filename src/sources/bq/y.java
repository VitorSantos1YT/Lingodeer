package bq;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f4992b;

    public y(fz.c cVar) {
        this.f4992b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v11) {
        kotlin.jvm.internal.m.f(v11, "v");
        if (SystemClock.elapsedRealtime() - this.f4991a < 500) {
            return;
        }
        this.f4992b.invoke(v11);
        this.f4991a = SystemClock.elapsedRealtime();
    }
}
