package o9;

import a5.f;
import android.os.Build;
import android.util.Log;
import kotlin.jvm.internal.m;
import l1.k1;
import l1.t;
import n9.c1;
import n9.e1;
import n9.r;
import n9.x;
import qy.b0;
import rt.zc;
import uz.i;
import uz.i1;
import uz.s0;
import z2.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f44747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f44748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f44749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f44750d;

    public b(i flow) {
        m.f(flow, "flow");
        this.f44747a = flow;
        a aVar = new a(this, (vy.i) p0.M.getValue(), flow instanceof s0 ? (e1) ry.m.s0(((s0) flow).a()) : null);
        this.f44748b = aVar;
        this.f44749c = t.B(aVar.b());
        n9.e eVar = (n9.e) aVar.f44745k.f53391a.getValue();
        if (eVar == null) {
            x xVar = d.f44754a;
            eVar = new n9.e(xVar.f43733a, xVar.f43734b, xVar.f43735c, xVar, null);
        }
        this.f44750d = t.B(eVar);
    }

    public final Object a(xy.i iVar) {
        Object objCollect = this.f44748b.f44745k.f53391a.collect(new zc(new b1.b(this, 14), 2), iVar);
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        b0 b0Var = b0.f48488a;
        if (objCollect != aVar) {
            objCollect = b0Var;
        }
        return objCollect == aVar ? objCollect : b0Var;
    }

    public final Object b(int i11) {
        Object value;
        Object value2;
        a aVar = this.f44748b;
        i1 i1Var = aVar.f44744j;
        do {
            value = i1Var.getValue();
            ((Boolean) value).getClass();
        } while (!i1Var.j(value, Boolean.TRUE));
        aVar.f44742h = true;
        aVar.f44743i = i11;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            String message = "Accessing item index[" + i11 + ']';
            m.f(message, "message");
        }
        f fVar = aVar.f44736b;
        if (fVar != null) {
            fVar.b(aVar.f44738d.a(i11));
        }
        c1 c1Var = aVar.f44738d;
        if (i11 < 0) {
            c1Var.getClass();
        } else if (i11 < c1Var.c()) {
            int i12 = i11 - c1Var.f43520c;
            if (i12 >= 0 && i12 < c1Var.f43519b) {
                c1Var.b(i12);
            }
            i1 i1Var2 = aVar.f44744j;
            do {
                value2 = i1Var2.getValue();
                ((Boolean) value2).getClass();
            } while (!i1Var2.j(value2, Boolean.FALSE));
            return ((r) this.f44749c.getValue()).get(i11);
        }
        StringBuilder sbI = w4.c.i(i11, "Index: ", ", Size: ");
        sbI.append(c1Var.c());
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    public final int c() {
        return ((r) this.f44749c.getValue()).b();
    }

    public final n9.e d() {
        return (n9.e) this.f44750d.getValue();
    }
}
