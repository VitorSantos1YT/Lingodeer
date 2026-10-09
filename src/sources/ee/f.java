package ee;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import fr.j3;
import java.util.List;
import nv.p;
import td.i;
import td.j;
import td.l;
import vd.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f25490b = new i("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, i.f52122e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25491a;

    public f(Context context) {
        this.f25491a = context.getApplicationContext();
    }

    @Override // td.l
    public final /* bridge */ /* synthetic */ b0 a(Object obj, int i11, int i12, j jVar) {
        return c((Uri) obj, jVar);
    }

    @Override // td.l
    public final boolean b(Object obj, j jVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final b0 c(Uri uri, j jVar) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f25491a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e8) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(p.n(uri, "Failed to obtain context or unrecognized Uri format for: "), e8);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(p.n(uri, "Failed to find resource id for: "));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(p.n(uri, "Unrecognized Uri format: "));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e10) {
                throw new IllegalArgumentException(p.n(uri, "Unrecognized Uri format: "), e10);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) jVar.c(f25490b) : null;
        Drawable drawableU = theme == null ? j3.u(context, contextCreatePackageContext, identifier, null) : j3.u(context, context, identifier, theme);
        if (drawableU != null) {
            return new e(drawableU, 0);
        }
        return null;
    }
}
