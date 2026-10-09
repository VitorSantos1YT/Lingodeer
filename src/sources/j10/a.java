package j10;

import java.lang.reflect.Field;
import java.util.ArrayList;
import ob.l;
import org.greenrobot.greendao.DaoException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Cloneable {
    public final boolean H;
    public final d K;
    public i10.a L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.greenrobot.greendao.database.a f35514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final org.greenrobot.greendao.d[] f35516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f35517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f35518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f35519f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final org.greenrobot.greendao.d f35520t;

    public a(org.greenrobot.greendao.database.a aVar, Class cls) {
        this.f35514a = aVar;
        try {
            this.f35515b = (String) cls.getField("TABLENAME").get(null);
            org.greenrobot.greendao.d[] dVarArrD = d(cls);
            this.f35516c = dVarArrD;
            this.f35517d = new String[dVarArrD.length];
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            org.greenrobot.greendao.d dVar = null;
            for (int i11 = 0; i11 < dVarArrD.length; i11++) {
                org.greenrobot.greendao.d dVar2 = dVarArrD[i11];
                String str = dVar2.f45727e;
                this.f35517d[i11] = str;
                if (dVar2.f45726d) {
                    arrayList.add(str);
                    dVar = dVar2;
                } else {
                    arrayList2.add(str);
                }
            }
            this.f35519f = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            this.f35518e = strArr;
            org.greenrobot.greendao.d dVar3 = strArr.length == 1 ? dVar : null;
            this.f35520t = dVar3;
            this.K = new d(aVar, this.f35515b, this.f35517d, strArr);
            if (dVar3 == null) {
                this.H = false;
            } else {
                Class cls2 = dVar3.f45724b;
                this.H = cls2.equals(Long.TYPE) || cls2.equals(Long.class) || cls2.equals(Integer.TYPE) || cls2.equals(Integer.class) || cls2.equals(Short.TYPE) || cls2.equals(Short.class) || cls2.equals(Byte.TYPE) || cls2.equals(Byte.class);
            }
        } catch (Exception e8) {
            throw new DaoException("Could not init DAOConfig", e8);
        }
    }

    public static org.greenrobot.greendao.d[] d(Class cls) throws IllegalAccessException {
        Field[] declaredFields = Class.forName(cls.getName().concat("$Properties")).getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 9) == 9) {
                Object obj = field.get(null);
                if (obj instanceof org.greenrobot.greendao.d) {
                    arrayList.add((org.greenrobot.greendao.d) obj);
                }
            }
        }
        org.greenrobot.greendao.d[] dVarArr = new org.greenrobot.greendao.d[arrayList.size()];
        int size = arrayList.size();
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            org.greenrobot.greendao.d dVar = (org.greenrobot.greendao.d) obj2;
            int i12 = dVar.f45723a;
            if (dVarArr[i12] != null) {
                throw new DaoException("Duplicate property ordinals");
            }
            dVarArr[i12] = dVar;
        }
        return dVarArr;
    }

    public final void a() {
        i10.a aVar = this.L;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public final void c(i10.c cVar) {
        if (cVar == i10.c.None) {
            this.L = null;
            return;
        }
        if (cVar != i10.c.Session) {
            throw new IllegalArgumentException("Unsupported type: " + cVar);
        }
        if (this.H) {
            this.L = new i10.b();
        } else {
            this.L = new l(13);
        }
    }

    public final Object clone() {
        return new a(this);
    }

    public a(a aVar) {
        this.f35514a = aVar.f35514a;
        this.f35515b = aVar.f35515b;
        this.f35516c = aVar.f35516c;
        this.f35517d = aVar.f35517d;
        this.f35518e = aVar.f35518e;
        this.f35519f = aVar.f35519f;
        this.f35520t = aVar.f35520t;
        this.K = aVar.K;
        this.H = aVar.H;
    }
}
