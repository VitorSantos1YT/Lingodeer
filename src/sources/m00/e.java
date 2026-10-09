package m00;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class e extends k0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f40693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Condition f40694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f40695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f40696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static e f40697l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f40699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40700g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f40693h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.m.e(conditionNewCondition, "newCondition(...)");
        f40694i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f40695j = millis;
        f40696k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j11 = this.f40722c;
        boolean z11 = this.f40720a;
        if (j11 != 0 || z11) {
            ReentrantLock reentrantLock = f40693h;
            reentrantLock.lock();
            try {
                if (this.f40698e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f40698e = 1;
                ay.k0.k(this, j11, z11);
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f40693h;
        reentrantLock.lock();
        try {
            int i11 = this.f40698e;
            this.f40698e = 0;
            if (i11 != 1) {
                boolean z11 = i11 == 2;
                reentrantLock.unlock();
                return z11;
            }
            e eVar = f40697l;
            while (eVar != null) {
                e eVar2 = eVar.f40699f;
                if (eVar2 == this) {
                    eVar.f40699f = this.f40699f;
                    this.f40699f = null;
                    reentrantLock.unlock();
                    return false;
                }
                eVar = eVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void j() {
    }
}
