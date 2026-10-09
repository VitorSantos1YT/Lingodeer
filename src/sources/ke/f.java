package ke;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import kd.k;
import td.m;
import yc.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38141a;

    public f(int i11) {
        switch (i11) {
            case 1:
                this.f38141a = new ArrayList();
                break;
            default:
                this.f38141a = new ArrayList();
                break;
        }
    }

    public void a(Path path) {
        ArrayList arrayList = this.f38141a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v vVar = (v) arrayList.get(size);
            Matrix matrix = k.f38124a;
            if (vVar != null && !vVar.f57728a) {
                k.a(path, vVar.f57731d.m() / 100.0f, vVar.f57732e.m() / 100.0f, vVar.f57733f.m() / 360.0f);
            }
        }
    }

    public synchronized m b(Class cls) {
        int size = this.f38141a.size();
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = (e) this.f38141a.get(i11);
            if (eVar.f38139a.isAssignableFrom(cls)) {
                return eVar.f38140b;
            }
        }
        return null;
    }
}
