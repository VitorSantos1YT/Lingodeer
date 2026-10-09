package e6;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements vy.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ x f25076a = new x();

    public static void a(int i11) {
        synchronized (UnmanagedSessionReceiver.f1908a) {
            if (UnmanagedSessionReceiver.f1909b.get(Integer.valueOf(i11)) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(Context context, int i11, xy.c cVar) throws Throwable {
        v0 v0Var;
        g6.f fVarN;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i12 = v0Var.f25062e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                v0Var.f25062e = i12 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(this, cVar);
            }
        } else {
            v0Var = new v0(this, cVar);
        }
        Object objC = v0Var.f25060c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = v0Var.f25062e;
        try {
            if (i13 == 0) {
                com.bumptech.glide.e.F(objC);
                v0Var.f25058a = context;
                v0Var.f25059b = i11;
                v0Var.f25062e = 1;
                objC = n6.f.f43456a.c(context, d1.f24889a, "appWidgetLayout-" + i11, v0Var);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = v0Var.f25059b;
                context = v0Var.f25058a;
                com.bumptech.glide.e.F(objC);
            }
            fVarN = (g6.f) objC;
        } catch (CorruptionException unused) {
            fVarN = g6.f.n();
        } catch (IOException unused2) {
            fVarN = g6.f.n();
        }
        Context context2 = context;
        int i14 = i11;
        androidx.glance.appwidget.protobuf.a0<g6.h> a0VarO = fVarN.o();
        int iW = ry.x.W(ry.n.W(a0VarO, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (g6.h hVar : a0VarO) {
            linkedHashMap.put(hVar.m(), new Integer(hVar.n()));
        }
        LinkedHashMap linkedHashMapK0 = ry.x.k0(linkedHashMap);
        return new w0(context2, linkedHashMapK0, fVarN.p(), i14, ry.m.e1(linkedHashMapK0.values()));
    }
}
