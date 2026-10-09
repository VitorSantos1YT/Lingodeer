package uv;

import android.text.TextUtils;
import fr.p3;
import hh.p0;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f53180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f53181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f53183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f53184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f53185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f53186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a5.j f53187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fv.a f53188i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f53194p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53189j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f53190k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f53191l = 100;
    public boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile int f53192n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f53193o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f53195q = false;

    public b(String str) {
        this.f53184e = str;
        Object obj = new Object();
        this.f53194p = obj;
        c cVar = new c(this, obj);
        this.f53180a = cVar;
        this.f53181b = cVar;
    }

    public final int a() {
        int i11 = this.f53182c;
        if (i11 != 0) {
            return i11;
        }
        if (!TextUtils.isEmpty(this.f53185f)) {
            String str = this.f53184e;
            if (!TextUtils.isEmpty(str)) {
                String str2 = this.f53185f;
                int i12 = ew.f.f25949a;
                xv.c.f56595a.d().getClass();
                int iP = p3.p(str, str2, false);
                this.f53182c = iP;
                return iP;
            }
        }
        return 0;
    }

    public final boolean b() {
        ArrayList arrayList = q.f53227a.d().f53232b;
        return (!arrayList.isEmpty() && arrayList.contains(this)) || this.f53180a.f53199d > 0;
    }

    public final void c() {
        synchronized (this.f53194p) {
            this.f53180a.c();
        }
    }

    public final void d() {
        if (b()) {
            o00.a.P(this, "This task[%d] is running, if you want start the same task, please create a new one by FileDownloader#create", Integer.valueOf(a()));
            return;
        }
        this.f53192n = 0;
        this.f53193o = false;
        this.f53195q = false;
        c cVar = this.f53180a;
        cVar.getClass();
        cVar.f53203h = false;
        cVar.f53201f = 0L;
        cVar.f53202g = 0L;
        a aVar = cVar.f53200e;
        aVar.f53179e = 0;
        aVar.f53175a = 0L;
        if (cVar.f53199d < 0) {
            cVar.f53196a.f53219d = true;
            cVar.f53196a = new j(cVar.f53198c, cVar);
        } else {
            j jVar = cVar.f53196a;
            b bVar = cVar.f53198c;
            if (jVar.f53216a != null) {
                int i11 = ew.f.f25949a;
                Locale locale = Locale.ENGLISH;
                throw new IllegalStateException("the messenger is working, can't re-appointment for " + bVar);
            }
            jVar.f53216a = bVar;
            jVar.f53217b = cVar;
            jVar.f53218c = new LinkedBlockingQueue();
        }
        cVar.f53199d = (byte) 0;
    }

    public final void e(String str) {
        this.f53185f = str;
        this.f53186g = new File(str).getName();
    }

    public final int f() {
        if (this.f53180a.f53199d != 0) {
            if (!b()) {
                throw new IllegalStateException("This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again." + this.f53180a.toString());
            }
            int iA = a();
            int i11 = ew.f.f25949a;
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException(p0.h(iA, "This task is running ", ", if you want to start the same task, please create a new one by FileDownloader.create"));
        }
        if (this.f53192n == 0) {
            a5.j jVar = this.f53187h;
            this.f53192n = jVar != null ? jVar.hashCode() : hashCode();
        }
        c cVar = this.f53180a;
        synchronized (cVar.f53197b) {
            try {
                if (cVar.f53199d != 0) {
                    o00.a.P(cVar, "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d", Integer.valueOf(cVar.a()), Byte.valueOf(cVar.f53199d));
                } else {
                    cVar.f53199d = (byte) 10;
                    b bVar = cVar.f53198c;
                    try {
                        cVar.d();
                        o20.w wVar = o.f53224a;
                        synchronized (wVar) {
                            ((ThreadPoolExecutor) ((r) wVar.f44617b).f53230a).execute(new p(cVar));
                        }
                    } catch (Throwable th2) {
                        f.f53206a.b(bVar);
                        f.f53206a.i(bVar, cVar.e(th2));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return a();
    }

    public final String toString() {
        int iA = a();
        String string = super.toString();
        int i11 = ew.f.f25949a;
        Locale locale = Locale.ENGLISH;
        return iA + "@" + string;
    }
}
