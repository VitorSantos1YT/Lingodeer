package uv;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f53228c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f53229d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f53230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f53231b;

    public static void a(d dVar) {
        r rVar = e.f53205a;
        LinkedList linkedList = (LinkedList) ((HashMap) rVar.f53231b).get("event.service.connect.changed");
        if (linkedList == null) {
            synchronized ("event.service.connect.changed".intern()) {
                try {
                    linkedList = (LinkedList) ((HashMap) rVar.f53231b).get("event.service.connect.changed");
                    if (linkedList == null) {
                        HashMap map = (HashMap) rVar.f53231b;
                        linkedList = new LinkedList();
                        map.put("event.service.connect.changed", linkedList);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        synchronized ("event.service.connect.changed".intern()) {
            linkedList.add(dVar);
        }
    }

    public static void g(a5.j jVar) {
        int i11;
        o20.w wVar = o.f53224a;
        synchronized (wVar) {
            ((r) wVar.f44617b).c(jVar);
        }
        a10.f fVar = f.f53206a;
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (fVar.f291a) {
            try {
                ArrayList arrayList2 = fVar.f291a;
                int size = arrayList2.size();
                i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    b bVar = (b) obj;
                    if (bVar.f53187h == jVar) {
                        arrayList.add(bVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            b bVar2 = (b) obj2;
            bVar2.getClass();
            bVar2.c();
        }
    }

    public static void h() {
        b[] bVarArr;
        o20.w wVar = o.f53224a;
        synchronized (wVar) {
            r rVar = (r) wVar.f44617b;
            ((ThreadPoolExecutor) rVar.f53230a).shutdownNow();
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            rVar.f53231b = linkedBlockingQueue;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 15L, TimeUnit.SECONDS, linkedBlockingQueue, new ew.b("LauncherTask"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            rVar.f53230a = threadPoolExecutor;
        }
        a10.f fVar = f.f53206a;
        synchronized (fVar.f291a) {
            bVarArr = (b[]) fVar.f291a.toArray(new b[fVar.f291a.size()]);
        }
        for (b bVar : bVarArr) {
            bVar.getClass();
            bVar.c();
        }
        tp.g gVar = k.f53220a;
        if (((s) gVar.f52461b).c()) {
            gVar.l();
            return;
        }
        File fileB = u.b();
        if (!fileB.getParentFile().exists()) {
            fileB.getParentFile().mkdirs();
        }
        if (fileB.exists()) {
            o00.a.P(u.class, "marker file " + fileB.getAbsolutePath() + " exists", new Object[0]);
            return;
        }
        try {
            o00.a.p(u.class, "create marker file" + fileB.getAbsolutePath() + " " + fileB.createNewFile(), new Object[0]);
        } catch (IOException e8) {
            o00.a.B(6, u.class, null, "create marker file failed", e8);
        }
    }

    public void b(w00.d dVar) {
        ((ThreadPoolExecutor) this.f53230a).execute(new aw.t(27, this, dVar));
    }

    public void c(a5.j jVar) {
        int i11 = 0;
        if (jVar == null) {
            o00.a.P(this, "want to expire by listener, but the listener provided is null", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Runnable runnable : (LinkedBlockingQueue) this.f53231b) {
            p pVar = (p) runnable;
            c cVar = pVar.f53225a;
            if (cVar != null && cVar.f53198c.f53187h == jVar) {
                pVar.f53226b = true;
                arrayList.add(runnable);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((ThreadPoolExecutor) this.f53230a).remove((Runnable) obj);
        }
    }

    public t d() {
        if (((t) this.f53231b) == null) {
            synchronized (f53229d) {
                try {
                    if (((t) this.f53231b) == null) {
                        t tVar = new t();
                        this.f53231b = tVar;
                        a(tVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (t) this.f53231b;
    }

    public t7.d e() {
        if (((t7.d) this.f53230a) == null) {
            synchronized (f53228c) {
                try {
                    if (((t7.d) this.f53230a) == null) {
                        this.f53230a = new t7.d(4, (byte) 0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (t7.d) this.f53230a;
    }

    public void f(int i11) {
        int i12;
        a10.f fVar = f.f53206a;
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (fVar.f291a) {
            try {
                ArrayList arrayList2 = fVar.f291a;
                int size = arrayList2.size();
                i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    b bVar = (b) obj;
                    boolean z11 = true;
                    if (bVar.a() == i11) {
                        if (bVar.f53180a.f53199d >= 0) {
                            z11 = false;
                        }
                        if (!z11) {
                            arrayList.add(bVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList.isEmpty()) {
            o00.a.P(this, "request pause but not exist %d", Integer.valueOf(i11));
            return;
        }
        int size2 = arrayList.size();
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            b bVar2 = (b) obj2;
            bVar2.getClass();
            bVar2.c();
        }
        arrayList.size();
    }
}
