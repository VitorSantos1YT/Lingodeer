package lf;

import android.content.Intent;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements re.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p20.c f40039b = new p20.c(18);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f40040c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f40041a = new HashMap();

    public final boolean a(int i11, int i12, Intent intent) {
        h hVar;
        h hVar2 = (h) this.f40041a.get(Integer.valueOf(i11));
        if (hVar2 != null) {
            return hVar2.a(intent, i12);
        }
        synchronized (f40039b) {
            hVar = (h) f40040c.get(Integer.valueOf(i11));
        }
        if (hVar != null) {
            return hVar.a(intent, i12);
        }
        return false;
    }
}
