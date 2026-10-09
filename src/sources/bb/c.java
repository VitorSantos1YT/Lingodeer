package bb;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.z;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f4062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7.d f4063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f4064c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4065d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f4066e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f4067f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, t7.d dVar) {
        this.f4062a = windowLayoutComponent;
        this.f4063b = dVar;
    }

    @Override // bb.a, ab.a
    public void a(Context context, s.a aVar, za.h hVar) {
        LinkedHashMap linkedHashMap = this.f4065d;
        ReentrantLock reentrantLock = this.f4064c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f4066e;
            if (multicastConsumer != null) {
                multicastConsumer.a(hVar);
                linkedHashMap2.put(hVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(hVar, context);
                multicastConsumer2.a(hVar);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(r.f50854a));
                } else {
                    this.f4067f.put(multicastConsumer2, this.f4063b.e(this.f4062a, z.a(WindowLayoutInfo.class), (Activity) context, new b(1, 0, MulticastConsumer.class, multicastConsumer2, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V")));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bb.a, ab.a
    public void b(za.h hVar) {
        LinkedHashMap linkedHashMap = this.f4065d;
        LinkedHashMap linkedHashMap2 = this.f4066e;
        ReentrantLock reentrantLock = this.f4064c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(hVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.f2778d;
            ReentrantLock reentrantLock2 = multicastConsumer.f2776b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(hVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(hVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    ya.d dVar = (ya.d) this.f4067f.remove(multicastConsumer);
                    if (dVar != null) {
                        dVar.f57547a.invoke(dVar.f57548b, dVar.f57549c);
                    }
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
