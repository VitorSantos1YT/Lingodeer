package lu;

import android.content.Context;
import ay.k0;
import com.android.billingclient.api.d;
import hh.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f40329a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f40330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f40331c;

    public b(Context context) {
        com.android.billingclient.api.c cVar = new com.android.billingclient.api.c(context);
        cVar.f7468c = new c(this, 9);
        cVar.f7467b = new k0(6);
        this.f40331c = cVar.a();
    }
}
