package qd;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f47710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f47711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f47712h;

    public b(String str, String str2, long j11, long j12, long j13, long j14, List list) {
        this.f47706b = str;
        this.f47707c = BuildConfig.VERSION_NAME.equals(str2) ? null : str2;
        this.f47708d = j11;
        this.f47709e = j12;
        this.f47710f = j13;
        this.f47711g = j14;
        this.f47712h = list;
    }

    public static b a(c cVar) throws IOException {
        if (d.i(cVar) != 538247942) {
            throw new IOException();
        }
        String strK = d.k(cVar);
        String strK2 = d.k(cVar);
        long j11 = d.j(cVar);
        long j12 = d.j(cVar);
        long j13 = d.j(cVar);
        long j14 = d.j(cVar);
        int i11 = d.i(cVar);
        if (i11 < 0) {
            throw new IOException(p.j(i11, "readHeaderList size="));
        }
        List arrayList = i11 == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(new pd.c(d.k(cVar).intern(), d.k(cVar).intern()));
        }
        return new b(strK, strK2, j11, j12, j13, j14, arrayList);
    }

    public final pd.a b(byte[] bArr) {
        pd.a aVar = new pd.a();
        aVar.f46761a = bArr;
        aVar.f46762b = this.f47707c;
        aVar.f46763c = this.f47708d;
        aVar.f46764d = this.f47709e;
        aVar.f46765e = this.f47710f;
        aVar.f46766f = this.f47711g;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List<pd.c> list = this.f47712h;
        for (pd.c cVar : list) {
            treeMap.put(cVar.f46776a, cVar.f46777b);
        }
        aVar.f46767g = treeMap;
        aVar.f46768h = Collections.unmodifiableList(list);
        return aVar;
    }

    public final boolean c(BufferedOutputStream bufferedOutputStream) {
        try {
            d.m(bufferedOutputStream, 538247942);
            d.o(bufferedOutputStream, this.f47706b);
            String str = this.f47707c;
            if (str == null) {
                str = BuildConfig.VERSION_NAME;
            }
            d.o(bufferedOutputStream, str);
            d.n(bufferedOutputStream, this.f47708d);
            d.n(bufferedOutputStream, this.f47709e);
            d.n(bufferedOutputStream, this.f47710f);
            d.n(bufferedOutputStream, this.f47711g);
            List<pd.c> list = this.f47712h;
            if (list != null) {
                d.m(bufferedOutputStream, list.size());
                for (pd.c cVar : list) {
                    d.o(bufferedOutputStream, cVar.f46776a);
                    d.o(bufferedOutputStream, cVar.f46777b);
                }
            } else {
                d.m(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException e8) {
            pd.p.a("%s", e8.toString());
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public b(String str, pd.a aVar) {
        String str2 = aVar.f46762b;
        long j11 = aVar.f46763c;
        long j12 = aVar.f46764d;
        long j13 = aVar.f46765e;
        long j14 = aVar.f46766f;
        ?? arrayList = aVar.f46768h;
        if (arrayList == 0) {
            Map map = aVar.f46767g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new pd.c((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j11, j12, j13, j14, arrayList);
    }
}
