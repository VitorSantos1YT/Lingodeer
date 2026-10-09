package dc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import com.tbruyelle.rxpermissions3.BuildConfig;
import gc.l;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kc.h;
import nv.p;
import okhttp3.HttpUrl;
import oz.q;
import ry.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23353a;

    public /* synthetic */ a(int i11) {
        this.f23353a = i11;
    }

    public final Object a(Object obj, l lVar) throws PackageManager.NameNotFoundException {
        String scheme;
        String authority;
        switch (this.f23353a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!h.c(uri) && ((scheme = uri.getScheme()) == null || scheme.equals("file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = BuildConfig.VERSION_NAME;
                    }
                    if (q.Y0(path, '/') && ((String) m.s0(uri.getPathSegments())) != null) {
                        if (!kotlin.jvm.internal.m.a(uri.getScheme(), "file")) {
                            return new File(uri.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null) {
                            return new File(path2);
                        }
                    }
                }
                return null;
            case 2:
                return ((HttpUrl) obj).f45053i;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = lVar.f29044a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (!kotlin.jvm.internal.m.a(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || q.K0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 == null) {
                    authority2 = BuildConfig.VERSION_NAME;
                }
                Resources resourcesForApplication = lVar.f29044a.getPackageManager().getResourcesForApplication(authority2);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                if (identifier == 0) {
                    throw new IllegalStateException(p.n(uri2, "Invalid android.resource URI: ").toString());
                }
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
