package wb;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f54931a = v3.b.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hc.e f54932b;

    static {
        hc.g gVar = hc.g.f32180c;
        f54932b = new hc.e();
    }

    public static final gc.i a(Object obj, l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.e0(1087186730);
        if (obj instanceof gc.i) {
            gc.i iVar = (gc.i) obj;
            sVar.p(false);
            return iVar;
        }
        Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
        sVar.e0(-1245195153);
        boolean zF = sVar.f(context) | sVar.f(obj);
        Object objQ = sVar.Q();
        if (zF || objQ == l1.m.f39353a) {
            gc.h hVar = new gc.h(context);
            hVar.f29004c = obj;
            objQ = hVar.a();
            sVar.o0(objQ);
        }
        gc.i iVar2 = (gc.i) objQ;
        sVar.p(false);
        sVar.p(false);
        return iVar2;
    }
}
