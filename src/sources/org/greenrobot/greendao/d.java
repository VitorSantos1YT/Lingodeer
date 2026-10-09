package org.greenrobot.greendao;

import java.util.Collection;
import k10.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f45724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45727e;

    public d(int i11, Class cls, String str, boolean z11, String str2) {
        this.f45723a = i11;
        this.f45724b = cls;
        this.f45725c = str;
        this.f45726d = z11;
        this.f45727e = str2;
    }

    public final h a(Integer num, Integer num2) {
        return new h(this, " BETWEEN ? AND ?", new Object[]{num, num2});
    }

    public final h b(Object obj) {
        return new h(this, "=?", obj);
    }

    public final h c(Collection collection) {
        return d(collection.toArray());
    }

    public final h d(Object... objArr) {
        StringBuilder sb2 = new StringBuilder(" IN (");
        int length = objArr.length;
        int i11 = j10.c.f35524a;
        for (int i12 = 0; i12 < length; i12++) {
            if (i12 < length - 1) {
                sb2.append("?,");
            } else {
                sb2.append('?');
            }
        }
        sb2.append(')');
        return new h(this, sb2.toString(), objArr);
    }

    public final h e(String str) {
        return new h(this, " LIKE ?", str);
    }
}
