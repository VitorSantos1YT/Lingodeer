package of;

import bq.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.j0;
import lf.j1;
import nf.e;
import ob.f;
import org.json.JSONArray;
import ry.m;
import ry.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f44909a = new AtomicBoolean(false);

    public static final void a() {
        File[] fileArrListFiles;
        if (qf.a.b(c.class)) {
            return;
        }
        try {
            if (j1.w()) {
                return;
            }
            File fileQ = f.q();
            if (fileQ == null) {
                fileArrListFiles = new File[0];
            } else {
                fileArrListFiles = fileQ.listFiles(new j0(6));
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                arrayList.add(o00.a.A(file));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                if (((e) obj).a()) {
                    arrayList2.add(obj);
                }
            }
            List listS0 = m.S0(arrayList2, new h(14));
            JSONArray jSONArray = new JSONArray();
            Iterator it = hz.b.U(0, Math.min(listS0.size(), 5)).iterator();
            while (((lz.f) it).f40537c) {
                jSONArray.put(listS0.get(((w) it).nextInt()));
            }
            f.J("anr_reports", jSONArray, new b(0, listS0));
        } catch (Throwable th2) {
            qf.a.a(c.class, th2);
        }
    }
}
