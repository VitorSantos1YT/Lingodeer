package yb;

import java.io.IOException;
import java.util.ArrayList;
import m00.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f57567b = new long[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f57568c = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f57569d = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f57570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f57571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bq.f f57572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f57573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f57574i;

    public b(e eVar, String str) {
        this.f57574i = eVar;
        this.f57566a = str;
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i11 = 0; i11 < 2; i11++) {
            sb2.append(i11);
            this.f57568c.add(this.f57574i.f57578a.e(sb2.toString()));
            sb2.append(".tmp");
            this.f57569d.add(this.f57574i.f57578a.e(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final c a() {
        if (!this.f57570e || this.f57572g != null || this.f57571f) {
            return null;
        }
        ArrayList arrayList = this.f57568c;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            e eVar = this.f57574i;
            if (i11 >= size) {
                this.f57573h++;
                return new c(eVar, this);
            }
            if (!eVar.R.h((a0) arrayList.get(i11))) {
                try {
                    eVar.p(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i11++;
        }
    }
}
