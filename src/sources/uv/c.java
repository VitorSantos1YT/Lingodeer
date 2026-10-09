package uv;

import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import aw.y;
import aw.z;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f53196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f53198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte f53199d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f53200e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f53201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f53202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f53203h;

    public c(b bVar, Object obj) {
        this.f53197b = obj;
        this.f53198c = bVar;
        this.f53196a = new j(bVar, this);
    }

    public final int a() {
        b bVar = this.f53198c;
        bVar.getClass();
        return bVar.a();
    }

    public final void b() {
        b bVar = this.f53198c;
        bVar.getClass();
        long j11 = this.f53201f;
        a aVar = this.f53200e;
        if (aVar.f53178d > 0) {
            long j12 = j11 - aVar.f53177c;
            aVar.f53175a = 0L;
            long jUptimeMillis = SystemClock.uptimeMillis() - aVar.f53178d;
            if (jUptimeMillis <= 0) {
                aVar.f53179e = (int) j12;
            } else {
                aVar.f53179e = (int) (j12 / jUptimeMillis);
            }
        }
        ArrayList arrayList = bVar.f53183d;
        if (arrayList != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                v vVar = (v) arrayList2.get(i11);
                WeakReference weakReference = vVar.f53237a;
                if (weakReference != null && weakReference.get() != null) {
                    ((w) weakReference.get()).a(vVar.f53238b);
                }
            }
        }
        t tVarD = q.f53227a.d();
        bVar.getClass();
        tVarD.d(bVar);
    }

    public final boolean c() {
        aw.p zVar;
        if (this.f53199d < 0) {
            return false;
        }
        this.f53199d = (byte) -2;
        b bVar = this.f53198c;
        o20.w wVar = o.f53224a;
        synchronized (wVar) {
            ((LinkedBlockingQueue) ((r) wVar.f44617b).f53231b).remove(this);
        }
        r rVar = q.f53227a;
        tp.g gVar = k.f53220a;
        if (((s) gVar.f52461b).c()) {
            gVar.e(bVar.a());
        }
        a10.f fVar = f.f53206a;
        fVar.b(bVar);
        if (bVar.f53180a.f53203h) {
            int iA = bVar.a();
            c cVar = bVar.f53180a;
            zVar = new aw.g(cVar.f53201f, iA, cVar.f53202g);
        } else {
            int iA2 = bVar.a();
            c cVar2 = bVar.f53180a;
            long j11 = cVar2.f53201f;
            int i11 = j11 > 2147483647L ? Integer.MAX_VALUE : (int) j11;
            long j12 = cVar2.f53202g;
            zVar = new z(iA2, i11, j12 <= 2147483647L ? (int) j12 : Integer.MAX_VALUE);
        }
        fVar.i(bVar, zVar);
        rVar.d().d(bVar);
        return true;
    }

    public final void d() throws IOException {
        b bVar = this.f53198c;
        if (bVar.f53185f == null) {
            String str = bVar.f53184e;
            int i11 = ew.f.f25949a;
            String absolutePath = null;
            if (TextUtils.isEmpty(null)) {
                absolutePath = (ns.o.f44007a.getExternalCacheDir() == null || !Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageDirectory().getFreeSpace() <= 0) ? ns.o.f44007a.getCacheDir().getAbsolutePath() : ns.o.f44007a.getExternalCacheDir().getAbsolutePath();
            }
            bVar.e(ew.f.c(absolutePath, ew.f.i(str)));
        }
        String strD = ew.f.d(bVar.f53185f);
        if (strD == null) {
            String str2 = bVar.f53185f;
            Locale locale = Locale.ENGLISH;
            throw new InvalidParameterException(ep.a.g("the provided mPath[", str2, "] is invalid, can't find its directory"));
        }
        File file = new File(strD);
        if (file.exists() || file.mkdirs() || file.exists()) {
            return;
        }
        String absolutePath2 = file.getAbsolutePath();
        Locale locale2 = Locale.ENGLISH;
        throw new IOException(ep.a.e("Create parent directory failed, please make sure you have permission to create file or directory on the path: ", absolutePath2));
    }

    public final aw.p e(Throwable th2) {
        this.f53199d = (byte) -1;
        int iA = a();
        long j11 = this.f53201f;
        return j11 > 2147483647L ? new aw.f(iA, j11, th2) : new y(iA, (int) j11, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(aw.p pVar) {
        int i11;
        b bVar = this.f53198c;
        byte bK = pVar.k();
        this.f53199d = bK;
        this.f53203h = pVar.f3238b;
        if (bK == -4) {
            a aVar = this.f53200e;
            aVar.f53179e = 0;
            aVar.f53175a = 0L;
            a10.f fVar = f.f53206a;
            int iA = bVar.a();
            synchronized (fVar.f291a) {
                try {
                    ArrayList arrayList = fVar.f291a;
                    int size = arrayList.size();
                    i11 = 0;
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        if (((b) obj).a() == iA) {
                            i11++;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i11 <= 1) {
                byte b3 = ((s) k.f53220a.f52461b).b(bVar.a());
                o00.a.P(this, "warn, but no mListener to receive, switch to pending %d %d", Integer.valueOf(bVar.a()), Integer.valueOf(b3));
                if (b3 > 0) {
                    this.f53199d = (byte) 1;
                    this.f53202g = pVar.e();
                    long jD = pVar.d();
                    this.f53201f = jD;
                    a aVar2 = this.f53200e;
                    aVar2.f53178d = SystemClock.uptimeMillis();
                    aVar2.f53177c = jD;
                    j jVar = this.f53196a;
                    aw.p pVarA = ((aw.n) pVar).a();
                    jVar.f53217b.getClass();
                    jVar.c(pVarA);
                    return;
                }
            }
            fVar.i(this.f53198c, pVar);
            return;
        }
        if (bK == -3) {
            pVar.n();
            this.f53201f = pVar.e();
            this.f53202g = pVar.e();
            f.f53206a.i(this.f53198c, pVar);
            return;
        }
        if (bK == -1) {
            pVar.l();
            this.f53201f = pVar.d();
            f.f53206a.i(this.f53198c, pVar);
            return;
        }
        if (bK == 1) {
            this.f53201f = pVar.d();
            this.f53202g = pVar.e();
            j jVar2 = this.f53196a;
            jVar2.f53217b.getClass();
            jVar2.c(pVar);
            return;
        }
        if (bK == 2) {
            this.f53202g = pVar.e();
            pVar.m();
            pVar.b();
            String strC = pVar.c();
            if (strC != null) {
                String str = bVar.f53186g;
                if (str != null) {
                    o00.a.P(this, "already has mFilename[%s], but assign mFilename[%s] again", str, strC);
                }
                this.f53198c.f53186g = strC;
            }
            a aVar3 = this.f53200e;
            long j11 = this.f53201f;
            aVar3.f53178d = SystemClock.uptimeMillis();
            aVar3.f53177c = j11;
            j jVar3 = this.f53196a;
            jVar3.f53217b.getClass();
            jVar3.c(pVar);
            return;
        }
        if (bK != 3) {
            if (bK != 5) {
                if (bK != 6) {
                    return;
                }
                j jVar4 = this.f53196a;
                jVar4.f53217b.getClass();
                jVar4.c(pVar);
                return;
            }
            this.f53201f = pVar.d();
            pVar.l();
            pVar.g();
            a aVar4 = this.f53200e;
            aVar4.f53179e = 0;
            aVar4.f53175a = 0L;
            j jVar5 = this.f53196a;
            jVar5.f53217b.getClass();
            jVar5.c(pVar);
            return;
        }
        this.f53201f = pVar.d();
        a aVar5 = this.f53200e;
        long jD2 = pVar.d();
        if (aVar5.f53175a == 0) {
            aVar5.f53176b = jD2;
            aVar5.f53175a = SystemClock.uptimeMillis();
        } else {
            long jUptimeMillis = SystemClock.uptimeMillis() - aVar5.f53175a;
            if (jUptimeMillis >= 1000 || (aVar5.f53179e == 0 && jUptimeMillis > 0)) {
                int i13 = (int) ((jD2 - aVar5.f53176b) / jUptimeMillis);
                aVar5.f53179e = i13;
                aVar5.f53179e = Math.max(0, i13);
                aVar5.f53176b = jD2;
                aVar5.f53175a = SystemClock.uptimeMillis();
            }
        }
        j jVar6 = this.f53196a;
        b bVar2 = jVar6.f53216a;
        bVar2.getClass();
        if (bVar2.f53191l <= 0) {
            return;
        }
        jVar6.f53217b.getClass();
        jVar6.c(pVar);
    }
}
