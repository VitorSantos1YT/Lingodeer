package j10;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import hh.p0;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.greenrobot.greendao.database.a f35525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f35527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f35528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public org.greenrobot.greendao.database.d f35529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public org.greenrobot.greendao.database.d f35530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public org.greenrobot.greendao.database.d f35531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public org.greenrobot.greendao.database.d f35532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public org.greenrobot.greendao.database.d f35533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile String f35534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile String f35535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile String f35536l;

    public d(org.greenrobot.greendao.database.a aVar, String str, String[] strArr, String[] strArr2) {
        this.f35525a = aVar;
        this.f35526b = str;
        this.f35527c = strArr;
        this.f35528d = strArr2;
    }

    public final org.greenrobot.greendao.database.d a() {
        if (this.f35532h == null) {
            String str = this.f35526b;
            String[] strArr = this.f35528d;
            int i11 = c.f35524a;
            String strQ = p.q("\"", str, '\"');
            StringBuilder sb2 = new StringBuilder("DELETE FROM ");
            sb2.append(strQ);
            if (strArr != null && strArr.length > 0) {
                sb2.append(" WHERE ");
                c.a(sb2, strQ, strArr);
            }
            org.greenrobot.greendao.database.d dVarM = this.f35525a.m(sb2.toString());
            synchronized (this) {
                try {
                    if (this.f35532h == null) {
                        this.f35532h = dVarM;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f35532h != dVarM) {
                dVarM.close();
            }
        }
        return this.f35532h;
    }

    public final org.greenrobot.greendao.database.d b() {
        if (this.f35530f == null) {
            org.greenrobot.greendao.database.d dVarM = this.f35525a.m(c.b("INSERT OR REPLACE INTO ", this.f35526b, this.f35527c));
            synchronized (this) {
                try {
                    if (this.f35530f == null) {
                        this.f35530f = dVarM;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f35530f != dVarM) {
                dVarM.close();
            }
        }
        return this.f35530f;
    }

    public final org.greenrobot.greendao.database.d c() {
        if (this.f35529e == null) {
            org.greenrobot.greendao.database.d dVarM = this.f35525a.m(c.b("INSERT INTO ", this.f35526b, this.f35527c));
            synchronized (this) {
                try {
                    if (this.f35529e == null) {
                        this.f35529e = dVarM;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f35529e != dVarM) {
                dVarM.close();
            }
        }
        return this.f35529e;
    }

    public final String d() {
        if (this.f35534j == null) {
            this.f35534j = c.c(this.f35526b, this.f35527c);
        }
        return this.f35534j;
    }

    public final String e() {
        if (this.f35535k == null) {
            StringBuilder sb2 = new StringBuilder(d());
            sb2.append("WHERE ");
            c.a(sb2, "T", this.f35528d);
            this.f35535k = sb2.toString();
        }
        return this.f35535k;
    }

    public final org.greenrobot.greendao.database.d f() {
        if (this.f35531g == null) {
            String str = this.f35526b;
            String[] strArr = this.f35527c;
            String[] strArr2 = this.f35528d;
            int i11 = c.f35524a;
            String strQ = p.q("\"", str, '\"');
            StringBuilder sbQ = p0.q(ualZoVVCQs.mXNMPsrdeNKijmO, strQ, " SET ");
            for (int i12 = 0; i12 < strArr.length; i12++) {
                String str2 = strArr[i12];
                sbQ.append('\"');
                sbQ.append(str2);
                sbQ.append("\"=?");
                if (i12 < strArr.length - 1) {
                    sbQ.append(',');
                }
            }
            sbQ.append(" WHERE ");
            c.a(sbQ, strQ, strArr2);
            org.greenrobot.greendao.database.d dVarM = this.f35525a.m(sbQ.toString());
            synchronized (this) {
                try {
                    if (this.f35531g == null) {
                        this.f35531g = dVarM;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f35531g != dVarM) {
                dVarM.close();
            }
        }
        return this.f35531g;
    }
}
