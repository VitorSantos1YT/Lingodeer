package ib;

import android.content.Intent;
import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f34318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34319d;

    public /* synthetic */ h(Object obj, int i11, int i12, Object obj2) {
        this.f34316a = i12;
        this.f34318c = obj;
        this.f34319d = obj2;
        this.f34317b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34316a) {
            case 0:
                ((i) this.f34318c).a((Intent) this.f34319d, this.f34317b);
                break;
            default:
                ((TextView) this.f34318c).setTypeface((Typeface) this.f34319d, this.f34317b);
                break;
        }
    }
}
