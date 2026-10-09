package dy;

import android.os.Process;
import ay.k0;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24599a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Runnable runnable) {
        super(runnable);
        this.f24599a = 3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.f24599a) {
            case 2:
                break;
            case 3:
                Process.setThreadPriority(9);
                super.run();
                return;
            default:
                super.run();
                return;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = m00.e.f40693h;
                ReentrantLock reentrantLock2 = m00.e.f40693h;
                reentrantLock2.lock();
                try {
                    m00.e eVarN = k0.n();
                    if (eVarN == m00.e.f40697l) {
                        m00.e.f40697l = null;
                        reentrantLock2.unlock();
                        return;
                    } else {
                        reentrantLock2.unlock();
                        if (eVarN != null) {
                            eVarN.j();
                        }
                    }
                } catch (Throwable th2) {
                    reentrantLock2.unlock();
                    throw th2;
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Runnable runnable, String str, int i11) {
        super(runnable, str);
        this.f24599a = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str) {
        super(str);
        this.f24599a = 2;
    }
}
