package zd;

import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f59196e = new x(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f59197f = new y(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ob.m f59201d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f59198a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f59200c = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f59199b = f59196e;

    public w(ob.m mVar) {
        this.f59201d = mVar;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = this.f59198a;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                v vVar = (v) obj;
                if (!this.f59200c.contains(vVar) && vVar.f59193a.isAssignableFrom(cls)) {
                    this.f59200c.add(vVar);
                    arrayList.add(vVar.f59195c.p(this));
                    this.f59200c.remove(vVar);
                }
            }
        } catch (Throwable th2) {
            this.f59200c.clear();
            throw th2;
        }
        return arrayList;
    }

    public final synchronized q b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f59198a;
            int size = arrayList2.size();
            boolean z11 = false;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                v vVar = (v) obj;
                if (this.f59200c.contains(vVar)) {
                    z11 = true;
                } else if (vVar.f59193a.isAssignableFrom(cls) && vVar.f59194b.isAssignableFrom(cls2)) {
                    this.f59200c.add(vVar);
                    arrayList.add(vVar.f59195c.p(this));
                    this.f59200c.remove(vVar);
                }
            }
            if (arrayList.size() > 1) {
                x xVar = this.f59199b;
                ob.m mVar = this.f59201d;
                xVar.getClass();
                return new b(2, arrayList, mVar);
            }
            if (arrayList.size() == 1) {
                return (q) arrayList.get(0);
            }
            if (z11) {
                return f59197f;
            }
            throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th2) {
            this.f59200c.clear();
            throw th2;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = this.f59198a;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            v vVar = (v) obj;
            if (!arrayList.contains(vVar.f59194b) && vVar.f59193a.isAssignableFrom(cls)) {
                arrayList.add(vVar.f59194b);
            }
        }
        return arrayList;
    }
}
