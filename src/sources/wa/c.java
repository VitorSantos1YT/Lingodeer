package wa;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f54885c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54887b;

    public c(String str, String str2) {
        this.f54886a = str;
        this.f54887b = str2;
        f54885c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f54883a;
        String str = this.f54887b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":dev");
        return hashSet.contains(sb2.toString());
    }
}
