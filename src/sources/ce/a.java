package ce;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements td.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6832c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f6830a = i11;
        this.f6831b = obj;
        this.f6832c = obj2;
    }

    @Override // td.l
    public final vd.b0 a(Object obj, int i11, int i12, td.j jVar) {
        boolean z11;
        a0 a0Var;
        pe.e eVar;
        switch (this.f6830a) {
            case 0:
                vd.b0 b0VarA = ((td.l) this.f6831b).a(obj, i11, i12, jVar);
                Resources resources = (Resources) this.f6832c;
                if (b0VarA == null) {
                    return null;
                }
                return new c(resources, b0VarA);
            case 1:
                vd.b0 b0VarC = ((ee.f) this.f6831b).c((Uri) obj, jVar);
                if (b0VarC == null) {
                    return null;
                }
                return q.a((wd.a) this.f6832c, (Drawable) ((ee.e) b0VarC).get(), i11, i12);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof a0) {
                    a0Var = (a0) inputStream;
                    z11 = false;
                } else {
                    z11 = true;
                    a0Var = new a0(inputStream, (m0.n) this.f6832c);
                }
                ArrayDeque arrayDeque = pe.e.f46817c;
                synchronized (arrayDeque) {
                    eVar = (pe.e) arrayDeque.poll();
                    break;
                }
                if (eVar == null) {
                    eVar = new pe.e();
                }
                pe.e eVar2 = eVar;
                eVar2.f46818a = a0Var;
                pe.j jVar2 = new pe.j(eVar2);
                b1.p pVar = new b1.p(3, a0Var, eVar2);
                try {
                    o oVar = (o) this.f6831b;
                    c cVarA = oVar.a(new xq.c(jVar2, oVar.f6885d, oVar.f6884c), i11, i12, jVar, pVar);
                    eVar2.f46819b = null;
                    eVar2.f46818a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(eVar2);
                        break;
                    }
                    return cVarA;
                } finally {
                    eVar2.f46819b = null;
                    eVar2.f46818a = null;
                    ArrayDeque arrayDeque2 = pe.e.f46817c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(eVar2);
                        if (z11) {
                            a0Var.release();
                        }
                    }
                }
        }
    }

    @Override // td.l
    public final boolean b(Object obj, td.j jVar) {
        switch (this.f6830a) {
            case 0:
                return ((td.l) this.f6831b).b(obj, jVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((o) this.f6831b).getClass();
                return true;
        }
    }

    public a(Resources resources, td.l lVar) {
        this.f6830a = 0;
        this.f6832c = resources;
        this.f6831b = lVar;
    }
}
