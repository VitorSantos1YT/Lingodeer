package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import bb.g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m;
import y4.a;
import za.h;
import za.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class MulticastConsumer implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2775a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f2777c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f2776b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2778d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.f2775a = context;
    }

    public final void a(h hVar) {
        ReentrantLock reentrantLock = this.f2776b;
        reentrantLock.lock();
        try {
            j jVar = this.f2777c;
            if (jVar != null) {
                hVar.accept(jVar);
            }
            this.f2778d.add(hVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // y4.a
    public void accept(WindowLayoutInfo value) {
        m.f(value, "value");
        ReentrantLock reentrantLock = this.f2776b;
        reentrantLock.lock();
        try {
            j jVarB = g.b(this.f2775a, value);
            this.f2777c = jVarB;
            Iterator it = this.f2778d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).accept(jVarB);
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
