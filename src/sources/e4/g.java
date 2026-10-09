package e4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class g implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f24802d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24805g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f24799a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24800b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24801c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f24803e = f.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24806h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f24807i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24808j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f24809k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f24810l = new ArrayList();

    public g(t tVar) {
        this.f24802d = tVar;
    }

    @Override // e4.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f24810l;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            if (!((g) obj).f24808j) {
                return;
            }
        }
        this.f24801c = true;
        t tVar = this.f24799a;
        if (tVar != null) {
            tVar.a(this);
        }
        if (this.f24800b) {
            this.f24802d.a(this);
            return;
        }
        int size2 = arrayList.size();
        g gVar = null;
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            g gVar2 = (g) obj2;
            if (!(gVar2 instanceof h)) {
                i11++;
                gVar = gVar2;
            }
        }
        if (gVar != null && i11 == 1 && gVar.f24808j) {
            h hVar = this.f24807i;
            if (hVar != null) {
                if (!hVar.f24808j) {
                    return;
                } else {
                    this.f24804f = this.f24806h * hVar.f24805g;
                }
            }
            d(gVar.f24805g + this.f24804f);
        }
        t tVar2 = this.f24799a;
        if (tVar2 != null) {
            tVar2.a(this);
        }
    }

    public final void b(t tVar) {
        this.f24809k.add(tVar);
        if (this.f24808j) {
            tVar.a(tVar);
        }
    }

    public final void c() {
        this.f24810l.clear();
        this.f24809k.clear();
        this.f24808j = false;
        this.f24805g = 0;
        this.f24801c = false;
        this.f24800b = false;
    }

    public void d(int i11) {
        if (this.f24808j) {
            return;
        }
        this.f24808j = true;
        this.f24805g = i11;
        ArrayList arrayList = this.f24809k;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24802d.f24827b.f23137k0);
        sb2.append(":");
        sb2.append(this.f24803e);
        sb2.append("(");
        sb2.append(this.f24808j ? Integer.valueOf(this.f24805g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f24810l.size());
        sb2.append(":d=");
        sb2.append(this.f24809k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
