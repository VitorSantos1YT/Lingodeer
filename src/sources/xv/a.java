package xv;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import nv.p;
import r.x2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bw.b f56584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f56585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f56587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f56588g;

    public a(b bVar, int i11, String str, String str2, bw.b bVar2) {
        this.f56582a = i11;
        this.f56583b = str;
        this.f56586e = str2;
        this.f56584c = bVar2;
        this.f56585d = bVar;
    }

    public final vv.a a() throws IllegalAccessException {
        String string;
        HashMap map;
        String str = this.f56583b;
        x2 x2Var = c.f56595a;
        vv.a aVarA = x2Var.a(str);
        bw.b bVar = this.f56584c;
        if (bVar != null && (map = bVar.f6389a) != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        aVarA.j(str2, (String) it.next());
                    }
                }
            }
        }
        long j11 = this.f56585d.f56589a;
        String str3 = this.f56586e;
        if (!TextUtils.isEmpty(str3)) {
            aVarA.j("If-Match", str3);
        }
        b bVar2 = this.f56585d;
        long j12 = bVar2.f56590b;
        long j13 = bVar2.f56591c;
        if (!bVar2.f56593e) {
            if (bVar2.f56594f && ew.d.f25940a.f25948h) {
                aVarA.c();
            }
            if (j13 == -1) {
                int i11 = ew.f.f25949a;
                Locale locale = Locale.ENGLISH;
                string = p.m(j12, "bytes=", "-");
            } else {
                int i12 = ew.f.f25949a;
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sbJ = w4.c.j(j12, "bytes=", "-");
                sbJ.append(j13);
                string = sbJ.toString();
            }
            aVarA.j(HttpHeaders.RANGE, string);
        }
        if (bVar == null || bVar.f6389a.get(HttpHeaders.USER_AGENT) == null) {
            int i13 = ew.f.f25949a;
            aVarA.j(HttpHeaders.USER_AGENT, "FileDownloader");
        }
        this.f56587f = aVarA.m();
        aVarA.b();
        ArrayList arrayList = new ArrayList();
        this.f56588g = arrayList;
        Map map2 = this.f56587f;
        int i14 = aVarA.i();
        String strK = aVarA.k(HttpHeaders.LOCATION);
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        do {
            if (i14 != 301 && i14 != 302 && i14 != 303 && i14 != 300 && i14 != 307 && i14 != 308) {
                arrayList.addAll(arrayList2);
                return aVarA;
            }
            if (strK == null) {
                Object[] objArr = {Integer.valueOf(i14), aVarA.f()};
                int i16 = ew.f.f25949a;
                throw new IllegalAccessException(String.format(Locale.ENGLISH, "receive %d (redirect) but the location is null with response [%s]", objArr));
            }
            aVarA.l();
            aVarA = x2Var.a(strK);
            for (Map.Entry entry2 : map2.entrySet()) {
                String str4 = (String) entry2.getKey();
                List list2 = (List) entry2.getValue();
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        aVarA.j(str4, (String) it2.next());
                    }
                }
            }
            arrayList2.add(strK);
            aVarA.b();
            i14 = aVarA.i();
            strK = aVarA.k(HttpHeaders.LOCATION);
            i15++;
        } while (i15 < 10);
        int i17 = ew.f.f25949a;
        throw new IllegalAccessException(String.format(Locale.ENGLISH, "redirect too many times! %s", arrayList2));
    }
}
