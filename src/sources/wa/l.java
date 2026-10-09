package wa;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import rt.m5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f54896a;

    static {
        m eVar;
        try {
            eVar = new m5((WebViewProviderFactoryBoundaryInterface) o00.a.g(WebViewProviderFactoryBoundaryInterface.class, md.a.k()), 7);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
        f54896a = eVar;
    }
}
