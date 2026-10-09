package k10;

import org.greenrobot.greendao.DaoException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.greenrobot.greendao.a f37840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lp.b f37841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f37843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Thread f37844e = Thread.currentThread();

    public a(org.greenrobot.greendao.a aVar, String str, String[] strArr) {
        this.f37840a = aVar;
        this.f37841b = new lp.b(aVar, 10);
        this.f37842c = str;
        this.f37843d = strArr;
    }

    public static String[] b(Object[] objArr) {
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = objArr[i11];
            if (obj != null) {
                strArr[i11] = obj.toString();
            } else {
                strArr[i11] = null;
            }
        }
        return strArr;
    }

    public final void a() {
        if (Thread.currentThread() != this.f37844e) {
            throw new DaoException("Method may be called only in owner thread, use forCurrentThread to get an instance for this thread");
        }
    }
}
