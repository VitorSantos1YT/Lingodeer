package b7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.billingclient.api.k0;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f4011i;

    public n(z00.a0 a0Var, a9.e eVar, z00.a0 a0Var2, a9.e eVar2, a9.e eVar3, n nVar, w00.b bVar) {
        this.f4003a = true;
        this.f4004b = false;
        this.f4005c = a0Var;
        this.f4006d = eVar;
        this.f4007e = a0Var2;
        this.f4008f = eVar2;
        this.f4009g = eVar3;
        this.f4010h = nVar;
        this.f4011i = bVar;
    }

    public void a(Object obj) {
        obj.getClass();
        synchronized (this.f4011i) {
            try {
                if (this.f4003a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f4008f).add(new m(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        a0 a0Var = (a0) this.f4006d;
        ArrayDeque arrayDeque = (ArrayDeque) this.f4009g;
        f();
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f4010h;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (!a0Var.f3950a.hasMessages(1)) {
            a0Var.getClass();
            z zVarB = a0.b();
            Message messageObtainMessage = a0Var.f3950a.obtainMessage(1);
            zVarB.f4046a = messageObtainMessage;
            Handler handler = a0Var.f3950a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            zVarB.a();
        }
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (zIsEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    public void c(int i11, k kVar) {
        f();
        ((ArrayDeque) this.f4010h).add(new j(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f4008f), i11, 0, kVar));
    }

    public void d() {
        f();
        synchronized (this.f4011i) {
            this.f4003a = true;
        }
        for (m mVar : (CopyOnWriteArraySet) this.f4008f) {
            l lVar = (l) this.f4007e;
            mVar.f4002d = true;
            if (mVar.f4001c) {
                mVar.f4001c = false;
                lVar.a(mVar.f3999a, mVar.f4000b.b());
            }
        }
        ((CopyOnWriteArraySet) this.f4008f).clear();
    }

    public void e(int i11, k kVar) {
        c(i11, kVar);
        b();
    }

    public void f() {
        if (this.f4004b) {
            a.j(Thread.currentThread() == ((a0) this.f4006d).f3950a.getLooper().getThread());
        }
    }

    public n(Looper looper, y yVar, l lVar) {
        this(new CopyOnWriteArraySet(), looper, yVar, lVar, true);
    }

    public n(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, y yVar, l lVar, boolean z11) {
        this.f4005c = yVar;
        this.f4008f = copyOnWriteArraySet;
        this.f4007e = lVar;
        this.f4011i = new Object();
        this.f4009g = new ArrayDeque();
        this.f4010h = new ArrayDeque();
        this.f4006d = yVar.a(looper, new Handler.Callback() { // from class: b7.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                n nVar = this.f3994a;
                for (m mVar : (CopyOnWriteArraySet) nVar.f4008f) {
                    l lVar2 = (l) nVar.f4007e;
                    if (!mVar.f4002d && mVar.f4001c) {
                        y6.n nVarB = mVar.f4000b.b();
                        mVar.f4000b = new k0(9);
                        mVar.f4001c = false;
                        lVar2.a(mVar.f3999a, nVarB);
                    }
                    if (((a0) nVar.f4006d).f3950a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f4004b = z11;
    }
}
