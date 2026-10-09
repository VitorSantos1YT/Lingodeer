package o20;

import i0.pKy.shrCcjmOhAmRC;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f44510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f44512f;

    public /* synthetic */ f0(Method method, int i11, boolean z11, int i12) {
        this.f44509c = i12;
        this.f44510d = method;
        this.f44511e = i11;
        this.f44512f = z11;
    }

    @Override // o20.c1
    public final void a(q0 q0Var, Object obj) {
        switch (this.f44509c) {
            case 0:
                Map map = (Map) obj;
                int i11 = this.f44511e;
                Method method = this.f44510d;
                if (map == null) {
                    throw c1.m(method, i11, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw c1.m(method, i11, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    String str2 = shrCcjmOhAmRC.UgFGb;
                    if (value == null) {
                        throw c1.m(method, i11, ep.a.g("Field map contained null value for key '", str, str2), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw c1.m(method, i11, "Field map value '" + value + "' converted to null by " + b.class.getName() + " for key '" + str + str2, new Object[0]);
                    }
                    q0Var.a(str, string, this.f44512f);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i12 = this.f44511e;
                Method method2 = this.f44510d;
                if (map2 == null) {
                    throw c1.m(method2, i12, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (str3 == null) {
                        throw c1.m(method2, i12, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw c1.m(method2, i12, ep.a.g("Header map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    q0Var.b(str3, value2.toString(), this.f44512f);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i13 = this.f44511e;
                Method method3 = this.f44510d;
                if (map3 == null) {
                    throw c1.m(method3, i13, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str4 = (String) entry3.getKey();
                    if (str4 == null) {
                        throw c1.m(method3, i13, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw c1.m(method3, i13, ep.a.g("Query map contained null value for key '", str4, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw c1.m(method3, i13, "Query map value '" + value3 + "' converted to null by " + b.class.getName() + " for key '" + str4 + "'.", new Object[0]);
                    }
                    q0Var.d(str4, string2, this.f44512f);
                }
                return;
        }
    }
}
