package ce;

import android.os.Build;
import com.lingodeer.data.model.AchievementLevelType;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f6894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final File f6895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile x f6896h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6899c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6900d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6897a = AchievementLevelType.XP_LV_9;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f6893e = i11 < 29;
        f6894f = i11 >= 28;
        f6895g = new File("/proc/self/fd");
    }

    public static x a() {
        if (f6896h == null) {
            synchronized (x.class) {
                try {
                    if (f6896h == null) {
                        f6896h = new x();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f6896h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f6897a;
    }

    public final boolean c(int i11, int i12, boolean z11, boolean z12) {
        boolean z13;
        if (z11 && f6894f && ((!f6893e || this.f6900d.get()) && !z12 && i11 >= 0 && i12 >= 0)) {
            synchronized (this) {
                try {
                    int i13 = this.f6898b + 1;
                    this.f6898b = i13;
                    if (i13 >= 50) {
                        this.f6898b = 0;
                        this.f6899c = ((long) f6895g.list().length) < ((long) b());
                    }
                    z13 = this.f6899c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z13) {
                return true;
            }
        }
        return false;
    }
}
