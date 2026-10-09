package fv;

import a5.j;
import com.android.billingclient.api.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import ns.o;
import oz.x;
import ry.n;
import uv.k;
import uv.q;
import uv.r;
import uv.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f28188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f28189b = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f28190c = new j(this, 13);

    public static void f() {
        try {
            r.h();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        tp.g gVar = k.f53220a;
        if (((s) gVar.f52461b).c()) {
            gVar.o(o.f44007a);
        }
    }

    public final void a(int i11) {
        r.g(this.f28190c);
        q.f53227a.f(i11);
        this.f28189b.remove(Integer.valueOf(i11));
    }

    public final void b() {
        List<Integer> listA1;
        Set activeTaskIds = this.f28189b;
        m.e(activeTaskIds, "activeTaskIds");
        synchronized (activeTaskIds) {
            Set activeTaskIds2 = this.f28189b;
            m.e(activeTaskIds2, "activeTaskIds");
            listA1 = ry.m.a1(activeTaskIds2);
        }
        r.g(this.f28190c);
        for (Integer num : listA1) {
            r rVar = q.f53227a;
            m.c(num);
            rVar.f(num.intValue());
        }
        this.f28189b.clear();
    }

    public final void c(List dlEntries, d dVar, boolean z11) {
        m.f(dlEntries, "dlEntries");
        this.f28188a = dVar;
        int i11 = 0;
        h hVar = new h();
        j jVar = this.f28190c;
        if (jVar == null) {
            throw new IllegalArgumentException("create FileDownloadQueueSet must with valid target!");
        }
        hVar.f7509b = jVar;
        ArrayList arrayList = new ArrayList();
        int size = dlEntries.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar = (a) dlEntries.get(i12);
            uv.b bVar = new uv.b(aVar.f28182a);
            bVar.e(aVar.f28184c);
            bVar.f53188i = aVar;
            bVar.m = z11;
            arrayList.add(bVar);
        }
        ArrayList arrayList2 = new ArrayList(n.W(arrayList, 10));
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList.get(i13);
            i13++;
            arrayList2.add(Integer.valueOf(((uv.b) obj).a()));
        }
        this.f28189b.addAll(arrayList2);
        hVar.f7512e = 0;
        hVar.f7508a = false;
        uv.b[] bVarArr = new uv.b[arrayList.size()];
        hVar.f7513f = bVarArr;
        arrayList.toArray(bVarArr);
        hVar.f7510c = 0;
        hVar.f7511d = Boolean.FALSE;
        try {
            hVar.l();
        } catch (Exception e8) {
            int size3 = arrayList.size();
            while (i11 < size3) {
                Object obj2 = arrayList.get(i11);
                i11++;
                uv.b bVar2 = (uv.b) obj2;
                d dVar2 = this.f28188a;
                if (dVar2 != null) {
                    dVar2.f(bVar2, e8);
                }
            }
        }
    }

    public final void d(a dlEntry, d lingoDownloadListener) {
        m.f(dlEntry, "dlEntry");
        m.f(lingoDownloadListener, "lingoDownloadListener");
        e(dlEntry, false, lingoDownloadListener);
    }

    public final void e(a dlEntry, boolean z11, d lingoDownloadListener) {
        m.f(dlEntry, "dlEntry");
        m.f(lingoDownloadListener, "lingoDownloadListener");
        this.f28188a = lingoDownloadListener;
        uv.b bVar = new uv.b(x.q0(dlEntry.f28182a, "#", "%23"));
        bVar.e(dlEntry.f28184c);
        bVar.f53187h = this.f28190c;
        bVar.f53188i = dlEntry;
        bVar.f53190k = z11;
        bVar.f53189j = 0;
        bVar.m = true;
        this.f28189b.add(Integer.valueOf(bVar.a()));
        try {
            bVar.d();
        } catch (Exception unused) {
        }
        try {
            if (bVar.f53193o) {
                throw new IllegalStateException("If you start the task manually, it means this task doesn't belong to a queue, so you must not invoke BaseDownloadTask#ready() or InQueueTask#enqueue() before you start() this method. For detail: If this task doesn't belong to a queue, what is just an isolated task, you just need to invoke BaseDownloadTask#start() to start this task, that's all. In other words, If this task doesn't belong to a queue, you must not invoke BaseDownloadTask#ready() method or InQueueTask#enqueue() method before invoke BaseDownloadTask#start(), If you do that and if there is the same listener object to start a queue in another thread, this task may be assembled by the queue, in that case, when you invoke BaseDownloadTask#start() manually to start this task or this task is started by the queue, there is an exception buried in there, because this task object is started two times without declare BaseDownloadTask#reuse() : 1. you invoke BaseDownloadTask#start() manually;  2. the queue start this task automatically.");
            }
            bVar.f();
        } catch (Exception e8) {
            e8.printStackTrace();
            d dVar = this.f28188a;
            if (dVar != null) {
                dVar.f(bVar, e8);
            }
        }
    }
}
