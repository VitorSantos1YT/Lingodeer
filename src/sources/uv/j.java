package uv;

import android.os.Handler;
import hh.p0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import oz.x;
import rz.e0;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f53216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f53217b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f53219d = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedBlockingQueue f53218c = new LinkedBlockingQueue();

    public j(b bVar, c cVar) {
        this.f53216a = bVar;
        this.f53217b = cVar;
    }

    public final void a() {
        if (this.f53219d) {
            return;
        }
        aw.p pVar = (aw.p) this.f53218c.poll();
        byte bK = pVar.k();
        b bVar = this.f53216a;
        if (bVar == null) {
            int size = this.f53218c.size();
            int i11 = ew.f.f25949a;
            Locale locale = Locale.ENGLISH;
            throw new IllegalArgumentException(p0.l("can't handover the message, no master to receive this message(status[", bK, "]) size[", size, "]"));
        }
        c cVar = bVar.f53180a;
        a5.j jVar = bVar.f53187h;
        c cVar2 = bVar.f53181b;
        b(bK);
        if (jVar != null) {
            fv.c cVar3 = (fv.c) jVar.f385b;
            if (bK == 4) {
                try {
                    aw.p pVar2 = ((aw.a) pVar).f3219c;
                    this.f53217b.b();
                    c(pVar2);
                    return;
                } catch (Throwable th2) {
                    aw.p pVarE = cVar2.e(th2);
                    this.f53217b.b();
                    c(pVarE);
                    return;
                }
            }
            if (bK == -4) {
                fv.d dVar = cVar3.f28188a;
                if (dVar != null) {
                    dVar.a(bVar);
                    return;
                }
                return;
            }
            if (bK == -3) {
                fv.a aVar = bVar.f53188i;
                if (aVar != null) {
                    String str = bVar.f53185f;
                    kotlin.jvm.internal.m.e(str, "getPath(...)");
                    if (x.k0(str, ".zip", false) && !ry.l.D(ks.b.f38636a, aVar.f28183b)) {
                        yz.f fVar = o0.f50940a;
                        e0.B(e0.c(wz.m.f55536a), null, null, new fr.c(cVar3, bVar, aVar, (vy.d) null, 6), 3);
                        return;
                    } else {
                        fv.d dVar2 = cVar3.f28188a;
                        if (dVar2 != null) {
                            dVar2.c(bVar);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (bK == -2) {
                pVar.i();
                pVar.j();
                fv.d dVar3 = cVar3.f28188a;
                if (dVar3 != null) {
                    dVar3.d(bVar);
                    return;
                }
                return;
            }
            if (bK == -1) {
                Throwable e8 = pVar.l();
                kotlin.jvm.internal.m.f(e8, "e");
                e8.printStackTrace();
                fv.d dVar4 = cVar3.f28188a;
                if (dVar4 != null) {
                    dVar4.f(bVar, e8);
                    return;
                }
                return;
            }
            if (bK == 1) {
                pVar.i();
                pVar.j();
                fv.d dVar5 = cVar3.f28188a;
                if (dVar5 != null) {
                    dVar5.b(bVar);
                    return;
                }
                return;
            }
            if (bK == 2) {
                pVar.b();
                pVar.m();
                long j11 = cVar.f53201f;
                pVar.j();
                return;
            }
            if (bK != 3) {
                if (bK != 5) {
                    return;
                }
                pVar.l();
                pVar.g();
                pVar.i();
                return;
            }
            int i12 = pVar.i();
            long j12 = cVar.f53202g;
            int i13 = j12 > 2147483647L ? Integer.MAX_VALUE : (int) j12;
            fv.d dVar6 = cVar3.f28188a;
            if (dVar6 != null) {
                dVar6.e(bVar, i12, i13);
            }
        }
    }

    public final void b(int i11) {
        if (i11 < 0) {
            if (!this.f53218c.isEmpty()) {
                aw.p pVar = (aw.p) this.f53218c.peek();
                o00.a.P(this, "the messenger[%s](with id[%d]) has already accomplished all his job, but there still are some messages in parcel queue[%d] queue-top-status[%d]", this, Integer.valueOf(pVar.f3237a), Integer.valueOf(this.f53218c.size()), Byte.valueOf(pVar.k()));
            }
            this.f53216a = null;
        }
    }

    public final void c(aw.p pVar) {
        b bVar = this.f53216a;
        if (bVar == null) {
            return;
        }
        if (this.f53219d || bVar.f53187h == null) {
            ArrayList arrayList = bVar.f53183d;
            if (arrayList != null && arrayList.size() > 0 && pVar.k() == 4) {
                this.f53217b.b();
            }
            b(pVar.k());
            return;
        }
        this.f53218c.offer(pVar);
        ThreadPoolExecutor threadPoolExecutor = i.f53209e;
        i iVar = g.f53207a;
        iVar.getClass();
        this.f53216a.getClass();
        if (i.a(this)) {
            return;
        }
        if (i.f53210f <= 0 && !iVar.f53213b.isEmpty()) {
            synchronized (iVar.f53214c) {
                try {
                    if (!iVar.f53213b.isEmpty()) {
                        for (j jVar : iVar.f53213b) {
                            Handler handler = iVar.f53212a;
                            handler.sendMessage(handler.obtainMessage(1, jVar));
                        }
                    }
                    iVar.f53213b.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (i.f53210f <= 0) {
            Handler handler2 = iVar.f53212a;
            handler2.sendMessage(handler2.obtainMessage(1, this));
        } else {
            synchronized (iVar.f53214c) {
                iVar.f53213b.offer(this);
            }
            iVar.b();
        }
    }

    public final String toString() {
        int iA;
        b bVar = this.f53216a;
        if (bVar == null) {
            iA = -1;
        } else {
            bVar.getClass();
            iA = bVar.a();
        }
        String string = super.toString();
        int i11 = ew.f.f25949a;
        Locale locale = Locale.ENGLISH;
        return iA + ":" + string;
    }
}
