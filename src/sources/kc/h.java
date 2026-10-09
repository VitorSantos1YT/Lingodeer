package kc;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.Closeable;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.Headers;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f38057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f38058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Headers f38059c;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f38057a = i11 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f38058b = i11 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f38059c = new Headers.Builder().d();
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e8) {
            throw e8;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || q.K0(str)) {
            return null;
        }
        String strF1 = q.f1(q.f1(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(q.b1(q.b1(strF1, strF1, '/'), BuildConfig.VERSION_NAME, '.'));
    }

    public static final boolean c(Uri uri) {
        return kotlin.jvm.internal.m.a(uri.getScheme(), "file") && kotlin.jvm.internal.m.a((String) ry.m.s0(uri.getPathSegments()), "android_asset");
    }

    public static final int d(jh.h hVar, hc.f fVar) {
        if (hVar instanceof hc.a) {
            return ((hc.a) hVar).f32177a;
        }
        int i11 = g.f38056a[fVar.ordinal()];
        if (i11 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i11 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
