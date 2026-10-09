package y6;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f57378a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f57379b = "media3.common";

    public static synchronized void a(String str) {
        if (f57378a.add(str)) {
            f57379b += ", " + str;
        }
    }
}
