package yr;

import com.lingodeer.data.model.CourseCharacterGroup;
import com.tbruyelle.rxpermissions3.BuildConfig;
import h00.s;
import java.util.ArrayList;
import java.util.List;
import ns.o;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import oz.q;
import qy.n;
import ry.r;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f57875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f57876b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, vy.d dVar) {
        super(2, dVar);
        this.f57876b = jVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        i iVar = new i(this.f57876b, dVar);
        iVar.f57875a = obj;
        return iVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String strString;
        Object objL;
        List list;
        j jVar = this.f57876b;
        r rVar = r.f50854a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        try {
            Request.Builder builder = new Request.Builder();
            jVar.getClass();
            builder.e("http://192.168.31.31:1515/AdminZG/hanzi-categories.json");
            builder.c("GET", null);
            Response responseC = jVar.f57877a.a(new Request(builder)).c();
            try {
                if (!responseC.R) {
                    responseC.close();
                    return rVar;
                }
                ResponseBody responseBody = responseC.f45164t;
                if (responseBody == null || (strString = responseBody.string()) == null) {
                    responseC.close();
                    return rVar;
                }
                try {
                    s sVar = xt.c.f56291a;
                    sVar.getClass();
                    objL = (h) sVar.b(h.Companion.serializer(), strString);
                } catch (Throwable th2) {
                    objL = com.bumptech.glide.e.l(th2);
                }
                if (objL instanceof n) {
                    objL = null;
                }
                h hVar = (h) objL;
                if (hVar == null || (list = hVar.f57874a) == null) {
                    list = rVar;
                }
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                int i11 = 0;
                for (Object obj2 : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        o.V();
                        throw null;
                    }
                    e eVar = (e) obj2;
                    List list2 = eVar.f57871c;
                    String str = eVar.f57869a;
                    String str2 = eVar.f57870b;
                    if (list2 == null) {
                        list2 = rVar;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!q.K0((String) obj3)) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (str2 != null && !q.K0(str2)) {
                        str = str2;
                    } else if (str == null || q.K0(str)) {
                        str = BuildConfig.VERSION_NAME;
                    }
                    arrayList.add(new CourseCharacterGroup(i11, i12, ry.m.y0(arrayList2, ";", null, null, null, 62), str, ry.m.y0(arrayList2, ";", null, null, null, 62), str));
                    i11 = i12;
                }
                responseC.close();
                return arrayList;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    o.m(responseC, th3);
                    throw th4;
                }
            }
        } catch (Exception unused) {
            return rVar;
        }
        return rVar;
    }
}
