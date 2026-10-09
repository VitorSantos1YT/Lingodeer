package mr;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import qy.b0;
import qy.o;
import rz.b2;
import rz.e0;
import rz.o0;
import vt.h1;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f41200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f41201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fv.c f41202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SimpleDateFormat f41203d = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f41204e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wz.d f41205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f41206g;

    public e(h1 h1Var, Context context, fv.c cVar) {
        this.f41200a = h1Var;
        this.f41201b = context;
        this.f41202c = cVar;
        b2 b2VarE = e0.e();
        f fVar = o0.f50940a;
        this.f41205f = e0.c(ew.a.w(b2VarE, yz.e.f58387a));
        this.f41206g = new ArrayList();
    }

    public final void a() {
        Object objL;
        ArrayList arrayList = this.f41206g;
        try {
            e0.i(this.f41205f, null);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                if (((Number) obj).intValue() != -1) {
                    arrayList2.add(obj);
                }
            }
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                this.f41202c.a(((Number) obj2).intValue());
            }
            arrayList.clear();
            objL = b0.f48488a;
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        Throwable thA = o.a(objL);
        if (thA != null) {
            thA.printStackTrace();
        }
    }
}
