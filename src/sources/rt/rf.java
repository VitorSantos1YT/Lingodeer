package rt;

import android.os.Handler;
import android.os.Looper;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f50349a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fv.c f50350b = new fv.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc f50351c = new mc(new v7(11), new os.a(25), new os.a(26), new v7(12), new v7(13), new os.a(27));

    public static void a(Object owner, List list, fz.c cVar, fz.a onFinished) {
        kotlin.jvm.internal.m.f(owner, "owner");
        kotlin.jvm.internal.m.f(onFinished, "onFinished");
        mc mcVar = f50351c;
        mcVar.getClass();
        Float fValueOf = Float.valueOf(1.0f);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            fv.a aVar = (fv.a) obj;
            if (hashSet.add(new kc(aVar.f28182a, aVar.f28184c))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            cVar.invoke(fValueOf);
            onFinished.invoke();
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        boolean z11 = false;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            fv.a aVar2 = (fv.a) obj2;
            linkedHashSet.add(new kc(aVar2.f28182a, aVar2.f28184c));
        }
        jc jcVar = new jc(owner, linkedHashSet, new LinkedHashSet(), cVar, onFinished);
        ArrayList arrayList2 = new ArrayList();
        cVar.invoke(Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
        synchronized (mcVar.f50090h) {
            try {
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    fv.a aVar3 = (fv.a) obj3;
                    kc kcVar = new kc(aVar3.f28182a, aVar3.f28184c);
                    if (!((LinkedHashMap) mcVar.f50091i).containsKey(kcVar)) {
                        if (((Boolean) ((v7) mcVar.f50084b).invoke(aVar3.f28184c)).booleanValue()) {
                            jcVar.f49938c.add(kcVar);
                        } else {
                            ((LinkedHashMap) mcVar.f50091i).put(kcVar, new hc(aVar3));
                            arrayList2.add(aVar3);
                        }
                    }
                }
                if (jcVar.f49938c.size() == jcVar.f49937b.size()) {
                    z11 = true;
                } else {
                    ((LinkedHashSet) mcVar.f50092j).add(jcVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            cVar.invoke(fValueOf);
            onFinished.invoke();
            return;
        }
        if (arrayList2.isEmpty()) {
            ((v7) mcVar.f50087e).invoke("joined existing resources: requested=" + arrayList.size());
            return;
        }
        v7 v7Var = (v7) mcVar.f50087e;
        int size3 = arrayList.size();
        int size4 = arrayList2.size();
        int size5 = (arrayList.size() - jcVar.f49938c.size()) - arrayList2.size();
        StringBuilder sbK = w4.c.k("starting resources: requested=", size3, ", new=", size4, ", joined=");
        sbK.append(size5);
        v7Var.invoke(sbK.toString());
        ((os.a) mcVar.f50085c).invoke(arrayList2, (aj.e) mcVar.f50093k);
    }
}
