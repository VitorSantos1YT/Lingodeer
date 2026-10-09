package ya;

import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    static {
        z.a(e.class).g();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            int i11 = c.f57546a;
            i iVar = i.STRICT;
            return 0;
        } catch (NullPointerException unused2) {
            int i12 = c.f57546a;
            i iVar2 = i.STRICT;
            return 0;
        } catch (UnsupportedOperationException unused3) {
            int i13 = c.f57546a;
            i iVar3 = i.STRICT;
            return 0;
        }
    }
}
