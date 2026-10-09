package ye;

import android.content.Context;
import android.os.Bundle;
import jz.e;
import o20.i;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f57743b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f57744a;

    static {
        f57743b = e.f37398b.b() <= 1.0E-4d;
    }

    public a(Context context) {
        this.f57744a = new i(context, 23);
    }

    public final void a(String str, Bundle bundle) {
        if (f57743b && q.v0(str, "gps", false)) {
            this.f57744a.c(str, bundle);
        }
    }
}
