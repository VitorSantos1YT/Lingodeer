package se;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReentrantReadWriteLock f51584a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f51585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f51586c;

    public static void a() {
        if (f51586c) {
            return;
        }
        f51584a.writeLock().lock();
        try {
            if (!f51586c) {
                f51585b = PreferenceManager.getDefaultSharedPreferences(re.s.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f51586c = true;
            }
        } finally {
            f51584a.writeLock().unlock();
        }
    }
}
