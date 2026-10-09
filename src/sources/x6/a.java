package x6;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f55802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f55803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55805d;

    public a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f55802a = intentFilter;
        this.f55803b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Receiver{");
        sb2.append(this.f55803b);
        sb2.append(" filter=");
        sb2.append(this.f55802a);
        if (this.f55805d) {
            sb2.append(" DEAD");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
