package p7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicLong f46460b = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f46461a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(d7.h hVar) {
        this(Collections.EMPTY_MAP);
        Uri uri = hVar.f23224a;
    }

    public s(Map map) {
        this.f46461a = map;
    }
}
