package j0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35249a;

    public /* synthetic */ b(int i11) {
        this.f35249a = i11;
    }

    public static final a c(int i11, String str) {
        WeakHashMap weakHashMap = o2.f35353v;
        return new a(i11, str);
    }

    public static final k2 d(int i11, String str) {
        WeakHashMap weakHashMap = o2.f35353v;
        return new k2(new b1(0, 0, 0, 0), str);
    }

    public static o2 e(l1.n nVar) {
        o2 o2Var;
        l1.s sVar = (l1.s) nVar;
        View view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
        WeakHashMap weakHashMap = o2.f35353v;
        synchronized (weakHashMap) {
            try {
                Object o2Var2 = weakHashMap.get(view);
                if (o2Var2 == null) {
                    o2Var2 = new o2(view);
                    weakHashMap.put(view, o2Var2);
                }
                o2Var = (o2) o2Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean zH = sVar.h(o2Var) | sVar.h(view);
        Object objQ = sVar.Q();
        if (zH || objQ == l1.m.f39353a) {
            objQ = new com.google.accompanist.permissions.a(29, o2Var, view);
            sVar.o0(objQ);
        }
        l1.t.c(o2Var, (fz.c) objQ, sVar);
        return o2Var;
    }

    @Override // j0.f
    public void b(v3.c cVar, int i11, int[] iArr, v3.m mVar, int[] iArr2) {
        switch (this.f35249a) {
            case 0:
                i.b(iArr, iArr2, false);
                break;
            case 1:
                i.c(i11, iArr, iArr2, false);
                break;
            case 2:
                if (mVar != v3.m.Ltr) {
                    i.b(iArr, iArr2, true);
                } else {
                    i.c(i11, iArr, iArr2, false);
                }
                break;
            default:
                if (mVar != v3.m.Ltr) {
                    i.c(i11, iArr, iArr2, true);
                } else {
                    i.b(iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f35249a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
