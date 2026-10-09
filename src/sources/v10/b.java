package v10;

import b0.h2;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import org.koin.core.error.InstanceCreationException;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u10.a f53471a;

    public b(u10.a aVar) {
        this.f53471a = aVar;
    }

    public Object a(oi.c cVar) throws InstanceCreationException {
        h2 h2Var = (h2) cVar.f44925a;
        StringBuilder sb2 = new StringBuilder("| (+) '");
        u10.a aVar = this.f53471a;
        sb2.append(aVar);
        sb2.append('\'');
        h2Var.V(sb2.toString());
        try {
            a20.a aVar2 = (a20.a) cVar.f44929e;
            if (aVar2 == null) {
                aVar2 = new a20.a(3, null);
            }
            return aVar.f52728c.invoke((e20.a) cVar.f44926b, aVar2);
        } catch (Exception e8) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e8);
            sb3.append("\n\t");
            StackTraceElement[] stackTrace = e8.getStackTrace();
            m.e(stackTrace, "getStackTrace(...)");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                m.e(className, "getClassName(...)");
                if (q.v0(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb3.append(ry.m.y0(arrayList, "\n\t", null, null, null, 62));
            String msg = "* Instance creation error : could not create instance for '" + aVar + "': " + sb3.toString();
            m.f(msg, "msg");
            h2Var.h0(w10.a.ERROR, msg);
            String msg2 = "Could not create instance for '" + aVar + '\'';
            m.f(msg2, "msg");
            throw new InstanceCreationException(msg2, e8);
        }
    }

    public abstract Object b(oi.c cVar);
}
