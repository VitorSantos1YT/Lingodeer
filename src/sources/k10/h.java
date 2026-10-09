package k10;

import hh.p0;
import java.util.Date;
import org.greenrobot.greendao.DaoException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f37859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final org.greenrobot.greendao.d f37860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f37861e;

    public h(org.greenrobot.greendao.d dVar, String str, Object[] objArr) {
        for (int i11 = 0; i11 < objArr.length; i11++) {
            objArr[i11] = a(dVar, objArr[i11]);
        }
        this.f37858b = null;
        this.f37857a = false;
        this.f37859c = objArr;
        this.f37860d = dVar;
        this.f37861e = str;
    }

    public static Object a(org.greenrobot.greendao.d dVar, Object obj) {
        if (obj != null && obj.getClass().isArray()) {
            throw new DaoException("Illegal value: found array, but simple object required");
        }
        Class cls = dVar.f45724b;
        if (cls == Date.class) {
            if (obj instanceof Date) {
                return Long.valueOf(((Date) obj).getTime());
            }
            if (obj instanceof Long) {
                return obj;
            }
            throw new DaoException(p0.k(obj, "Illegal date value: expected java.util.Date or Long for value "));
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            if (obj instanceof Boolean) {
                return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            if (obj instanceof Number) {
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue != 0 && iIntValue != 1) {
                    throw new DaoException(p0.k(obj, "Illegal boolean value: numbers must be 0 or 1, but was "));
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
                if ("TRUE".equalsIgnoreCase(str)) {
                    return 1;
                }
                if ("FALSE".equalsIgnoreCase(str)) {
                    return 0;
                }
                throw new DaoException(p0.k(obj, "Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insensitive), but was "));
            }
        }
        return obj;
    }

    public h(org.greenrobot.greendao.d dVar, String str, Object obj) {
        this.f37858b = a(dVar, obj);
        this.f37857a = true;
        this.f37859c = null;
        this.f37860d = dVar;
        this.f37861e = str;
    }
}
