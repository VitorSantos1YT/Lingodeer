package wa;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f54890d;

    public h() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f54890d = Pattern.compile("\\A\\d+");
    }

    @Override // wa.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // wa.c
    public final boolean b() {
        int i11;
        PackageInfo packageInfoA;
        boolean zB = super.b();
        if (!zB || (i11 = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        int i12 = va.b.f53806a;
        if (i11 >= 26) {
            packageInfoA = z6.c.h();
        } else {
            try {
                packageInfoA = va.b.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoA = null;
            }
        }
        if (packageInfoA == null) {
            return false;
        }
        Matcher matcher = this.f54890d.matcher(packageInfoA.versionName);
        return matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
