package k10;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final org.greenrobot.greendao.a f37846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f37847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f37848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37849e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(org.greenrobot.greendao.a aVar, String str, String[] strArr, int i11, byte b3) {
        this(aVar, str, strArr);
        this.f37849e = i11;
    }

    public final a a() {
        switch (this.f37849e) {
            case 0:
                return new d(this.f37846b, this.f37845a, (String[]) this.f37847c.clone());
            case 1:
                return new e(this.f37846b, this.f37845a, (String[]) this.f37847c.clone());
            default:
                return new f(this.f37846b, this.f37845a, (String[]) this.f37847c.clone());
        }
    }

    public final a b() {
        a aVarA;
        long id2 = Thread.currentThread().getId();
        synchronized (this.f37848d) {
            try {
                WeakReference weakReference = (WeakReference) this.f37848d.get(Long.valueOf(id2));
                aVarA = weakReference != null ? (a) weakReference.get() : null;
                if (aVarA == null) {
                    c();
                    aVarA = a();
                    this.f37848d.put(Long.valueOf(id2), new WeakReference(aVarA));
                } else {
                    String[] strArr = this.f37847c;
                    System.arraycopy(strArr, 0, aVarA.f37843d, 0, strArr.length);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarA;
    }

    public final void c() {
        synchronized (this.f37848d) {
            try {
                Iterator it = this.f37848d.entrySet().iterator();
                while (it.hasNext()) {
                    if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c(org.greenrobot.greendao.a aVar, String str, String[] strArr) {
        this.f37846b = aVar;
        this.f37845a = str;
        this.f37847c = strArr;
        this.f37848d = new HashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(org.greenrobot.greendao.a aVar, String str, String[] strArr, int i11) {
        this(aVar, str, strArr);
        this.f37849e = 2;
    }
}
