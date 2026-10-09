package wf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.m;
import lf.j1;
import re.s;
import xf.o;
import xf.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class f {
    public static void e(o oVar) {
        if (oVar == null) {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
        Uri uri = oVar.f56047b;
        if (uri == null) {
            throw new FacebookException("ShareVideo does not have a LocalUrl specified");
        }
        if (!"content".equalsIgnoreCase(uri.getScheme()) && !"file".equalsIgnoreCase(uri.getScheme())) {
            throw new FacebookException("ShareVideo must reference a video that is on the device");
        }
    }

    public final void a(xf.h medium) {
        m.f(medium, "medium");
        if (medium instanceof xf.k) {
            c((xf.k) medium);
        } else {
            if (!(medium instanceof o)) {
                throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{medium.getClass().getSimpleName()}, 1)));
            }
            e((o) medium);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public void b(xf.i mediaContent) {
        m.f(mediaContent, "mediaContent");
        ?? r9 = mediaContent.f56034t;
        if (r9 == 0 || r9.isEmpty()) {
            throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
        }
        if (r9.size() > 6) {
            throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1)));
        }
        Iterator it = r9.iterator();
        while (it.hasNext()) {
            a((xf.h) it.next());
        }
    }

    public void c(xf.k photo) {
        m.f(photo, "photo");
        Bitmap bitmap = photo.f56039b;
        Uri uri = photo.f56040c;
        if (bitmap == null && uri == null) {
            throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
        if (bitmap == null && j1.z(uri)) {
            throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
        if (bitmap == null && j1.z(uri)) {
            return;
        }
        Context contextA = s.a();
        String strB = s.b();
        PackageManager packageManager = contextA.getPackageManager();
        if (packageManager != null) {
            String strConcat = "com.facebook.app.FacebookContentProvider".concat(strB);
            if (packageManager.resolveContentProvider(strConcat, 0) == null) {
                throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", Arrays.copyOf(new Object[]{strConcat}, 1)).toString());
            }
        }
    }

    public void d(xf.m mVar) {
        g.a(mVar, this);
    }

    public void f(p videoContent) {
        m.f(videoContent, "videoContent");
        e(videoContent.L);
        xf.k kVar = videoContent.K;
        if (kVar != null) {
            c(kVar);
        }
    }
}
