package ae;

import com.bumptech.glide.load.data.k;
import java.util.ArrayDeque;
import td.i;
import td.j;
import zd.n;
import zd.o;
import zd.p;
import zd.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f663b = i.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tp.e f664a;

    public a(tp.e eVar) {
        this.f664a = eVar;
    }

    @Override // zd.q
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // zd.q
    public final p b(Object obj, int i11, int i12, j jVar) {
        zd.h hVar = (zd.h) obj;
        tp.e eVar = this.f664a;
        if (eVar != null) {
            n nVar = (n) eVar.f52454b;
            o oVarA = o.a(hVar);
            Object objA = nVar.a(oVarA);
            ArrayDeque arrayDeque = o.f59178b;
            synchronized (arrayDeque) {
                arrayDeque.offer(oVarA);
            }
            zd.h hVar2 = (zd.h) objA;
            if (hVar2 == null) {
                nVar.d(o.a(hVar), hVar);
            } else {
                hVar = hVar2;
            }
        }
        return new p(hVar, new k(hVar, ((Integer) jVar.c(f663b)).intValue()));
    }
}
