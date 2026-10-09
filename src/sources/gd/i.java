package gd;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wc.h f29100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f29102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f29103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f29104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f29105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f29106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ed.e f29107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f29108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f29109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f29110l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f29111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f29112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f29113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ed.a f29114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ob.l f29115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ed.b f29116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f29117t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h f29118u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f29119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a5.j f29120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a9.i f29121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fd.g f29122y;

    public i(List list, wc.h hVar, String str, long j11, g gVar, long j12, String str2, List list2, ed.e eVar, int i11, int i12, int i13, float f5, float f11, float f12, float f13, ed.a aVar, ob.l lVar, List list3, h hVar2, ed.b bVar, boolean z11, a5.j jVar, a9.i iVar, fd.g gVar2) {
        this.f29099a = list;
        this.f29100b = hVar;
        this.f29101c = str;
        this.f29102d = j11;
        this.f29103e = gVar;
        this.f29104f = j12;
        this.f29105g = str2;
        this.f29106h = list2;
        this.f29107i = eVar;
        this.f29108j = i11;
        this.f29109k = i12;
        this.f29110l = i13;
        this.m = f5;
        this.f29111n = f11;
        this.f29112o = f12;
        this.f29113p = f13;
        this.f29114q = aVar;
        this.f29115r = lVar;
        this.f29117t = list3;
        this.f29118u = hVar2;
        this.f29116s = bVar;
        this.f29119v = z11;
        this.f29120w = jVar;
        this.f29121x = iVar;
        this.f29122y = gVar2;
    }

    public final String a(String str) {
        int i11;
        StringBuilder sbN = ep.a.n(str);
        sbN.append(this.f29101c);
        sbN.append("\n");
        long j11 = this.f29104f;
        wc.h hVar = this.f29100b;
        i iVar = (i) hVar.f54965i.c(j11);
        if (iVar != null) {
            sbN.append("\t\tParents: ");
            sbN.append(iVar.f29101c);
            for (i iVar2 = (i) hVar.f54965i.c(iVar.f29104f); iVar2 != null; iVar2 = (i) hVar.f54965i.c(iVar2.f29104f)) {
                sbN.append("->");
                sbN.append(iVar2.f29101c);
            }
            sbN.append(str);
            sbN.append("\n");
        }
        List list = this.f29106h;
        if (!list.isEmpty()) {
            sbN.append(str);
            sbN.append("\tMasks: ");
            sbN.append(list.size());
            sbN.append("\n");
        }
        int i12 = this.f29108j;
        if (i12 != 0 && (i11 = this.f29109k) != 0) {
            sbN.append(str);
            sbN.append("\tBackground: ");
            sbN.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i12), Integer.valueOf(i11), Integer.valueOf(this.f29110l)));
        }
        List list2 = this.f29099a;
        if (!list2.isEmpty()) {
            sbN.append(str);
            sbN.append("\tShapes:\n");
            for (Object obj : list2) {
                sbN.append(str);
                sbN.append("\t\t");
                sbN.append(obj);
                sbN.append("\n");
            }
        }
        return sbN.toString();
    }

    public final String toString() {
        return a(BuildConfig.VERSION_NAME);
    }
}
