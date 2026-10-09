package zd;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f59145b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f59146a;

    public a0(z zVar) {
        this.f59146a = zVar;
    }

    @Override // zd.q
    public final boolean a(Object obj) {
        return f59145b.contains(((Uri) obj).getScheme());
    }

    @Override // zd.q
    public final p b(Object obj, int i11, int i12, td.j jVar) {
        com.bumptech.glide.load.data.d aVar;
        Uri uri = (Uri) obj;
        oe.b bVar = new oe.b(uri);
        z zVar = (z) this.f59146a;
        switch (zVar.f59206a) {
            case 0:
                aVar = new com.bumptech.glide.load.data.a(zVar.f59207b, uri, zVar.f59208c, 0);
                break;
            case 1:
                aVar = new com.bumptech.glide.load.data.a(zVar.f59207b, uri, zVar.f59208c, 1);
                break;
            default:
                aVar = new com.bumptech.glide.load.data.n(zVar.f59207b, uri, zVar.f59208c);
                break;
        }
        return new p(bVar, aVar);
    }
}
