package va;

import android.os.Build;
import android.webkit.WebSettings;
import c3.c;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import tp.e;
import wa.g;
import wa.j;
import wa.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static e a(WebSettings webSettings) {
        try {
            return new e((WebSettingsBoundaryInterface) o00.a.g(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) k.f54895a.f52461b).convertSettings(webSettings)), 2);
        } catch (ClassCastException e8) {
            if (Build.VERSION.SDK_INT == 30 && "android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                return new g(null, 2);
            }
            throw e8;
        }
    }

    public static void b(WebSettings webSettings) {
        if (!j.f54892a.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        a(webSettings).w();
    }

    public static void c(WebSettings webSettings) {
        wa.b bVar = j.f54894c;
        if (bVar.a()) {
            c.k(webSettings);
        } else {
            if (!bVar.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            a(webSettings).x();
        }
    }
}
