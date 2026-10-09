package of;

import java.util.Iterator;
import java.util.List;
import nf.e;
import ob.f;
import org.json.JSONException;
import org.json.JSONObject;
import re.b0;
import re.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f44908b;

    public /* synthetic */ b(int i11, List list) {
        this.f44907a = i11;
        this.f44908b = list;
    }

    @Override // re.u
    public final void a(b0 b0Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        switch (this.f44907a) {
            case 0:
                List list = this.f44908b;
                if (!qf.a.b(c.class)) {
                    try {
                        if (b0Var.f49125c == null && (jSONObject = b0Var.f49126d) != null && jSONObject.getBoolean("success")) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                f.j(((e) it.next()).f43765a);
                            }
                            break;
                        }
                    } catch (JSONException unused) {
                        return;
                    } catch (Throwable th2) {
                        qf.a.a(c.class, th2);
                        return;
                    }
                }
                break;
            default:
                List list2 = this.f44908b;
                try {
                    if (b0Var.f49125c == null && (jSONObject2 = b0Var.f49126d) != null && jSONObject2.getBoolean("success")) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            f.j(((e) it2.next()).f43765a);
                        }
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
