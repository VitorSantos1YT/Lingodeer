package x9;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import qh.d;
import re.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f55970c = new e0(13);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f55971d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f55972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f55973b;

    public a(String str, boolean z11) {
        ReentrantLock reentrantLock;
        synchronized (f55970c) {
            try {
                LinkedHashMap linkedHashMap = f55971d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f55972a = reentrantLock;
        this.f55973b = z11 ? new d(str) : null;
    }
}
