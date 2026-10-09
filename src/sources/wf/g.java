package wf;

import android.net.Uri;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lf.j1;
import xf.m;
import xf.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f55118a = new e(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f55119b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f55120c = new e(0);

    public static final void a(m mVar, f fVar) {
        if (mVar != null) {
            xf.k kVar = mVar.H;
            xf.h hVar = mVar.f56045t;
            if (hVar != null || kVar != null) {
                if (hVar != null) {
                    fVar.a(hVar);
                }
                if (kVar != null) {
                    fVar.c(kVar);
                    return;
                }
                return;
            }
        }
        throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
    }

    public static void b(xf.d dVar, f fVar) {
        if (dVar == null) {
            throw new FacebookException("Must provide non-null content to share");
        }
        if (dVar instanceof xf.f) {
            xf.f linkContent = (xf.f) dVar;
            fVar.getClass();
            kotlin.jvm.internal.m.f(linkContent, "linkContent");
            Uri uri = linkContent.f56025a;
            if (uri != null && !j1.z(uri)) {
                throw new FacebookException("Content Url must be an http:// or https:// url");
            }
            return;
        }
        if (dVar instanceof xf.l) {
            List list = ((xf.l) dVar).f56044t;
            if (list == null || list.isEmpty()) {
                throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
            }
            if (list.size() > 6) {
                throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1)));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fVar.c((xf.k) it.next());
            }
            return;
        }
        if (dVar instanceof p) {
            fVar.f((p) dVar);
            return;
        }
        if (dVar instanceof xf.i) {
            fVar.b((xf.i) dVar);
            return;
        }
        if (dVar instanceof xf.c) {
            if (j1.y(((xf.c) dVar).f56024t)) {
                throw new FacebookException("Must specify a non-empty effectId");
            }
        } else if (dVar instanceof m) {
            fVar.d((m) dVar);
        }
    }
}
