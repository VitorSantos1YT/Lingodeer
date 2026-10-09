package bb;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class d extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f4068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f4069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f4070i;

    public d(WindowLayoutComponent windowLayoutComponent, t7.d dVar) {
        super(windowLayoutComponent, dVar);
        this.f4068g = new ReentrantLock();
        this.f4069h = new LinkedHashMap();
        this.f4070i = new LinkedHashMap();
    }

    @Override // bb.c, bb.a, ab.a
    public final void a(Context context, s.a aVar, za.h hVar) {
        LinkedHashMap linkedHashMap = this.f4069h;
        ReentrantLock reentrantLock = this.f4068g;
        reentrantLock.lock();
        try {
            h hVar2 = (h) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f4070i;
            if (hVar2 != null) {
                hVar2.a(hVar);
                linkedHashMap2.put(hVar, context);
            } else {
                h hVar3 = new h(context);
                linkedHashMap.put(context, hVar3);
                linkedHashMap2.put(hVar, context);
                hVar3.a(hVar);
                this.f4062a.addWindowLayoutInfoListener(context, hVar3);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bb.c, bb.a, ab.a
    public final void b(za.h hVar) {
        LinkedHashMap linkedHashMap = this.f4069h;
        LinkedHashMap linkedHashMap2 = this.f4070i;
        ReentrantLock reentrantLock = this.f4068g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(hVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            h hVar2 = (h) linkedHashMap.get(context);
            if (hVar2 == null) {
                reentrantLock.unlock();
                return;
            }
            ReentrantLock reentrantLock2 = hVar2.f4072b;
            reentrantLock2.lock();
            try {
                hVar2.f4074d.remove(hVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(hVar);
                if (hVar2.f4074d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.f4062a.removeWindowLayoutInfoListener(hVar2);
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
