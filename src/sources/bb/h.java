package bb;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m;
import za.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements y4.a, Consumer2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4071a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f4073c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f4072b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f4074d = new LinkedHashSet();

    public h(Context context) {
        this.f4071a = context;
    }

    public final void a(za.h hVar) {
        ReentrantLock reentrantLock = this.f4072b;
        reentrantLock.lock();
        try {
            j jVar = this.f4073c;
            if (jVar != null) {
                hVar.accept(jVar);
            }
            this.f4074d.add(hVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // y4.a
    public final void accept(Object obj) {
        WindowLayoutInfo value = (WindowLayoutInfo) obj;
        m.f(value, "value");
        ReentrantLock reentrantLock = this.f4072b;
        reentrantLock.lock();
        try {
            j jVarB = g.b(this.f4071a, value);
            this.f4073c = jVarB;
            Iterator it = this.f4074d.iterator();
            while (it.hasNext()) {
                ((y4.a) it.next()).accept(jVarB);
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
