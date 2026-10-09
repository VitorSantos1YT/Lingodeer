package vd;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g, com.bumptech.glide.load.data.c {
    public volatile zd.p H;
    public File K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f53855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f53856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f53857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53858d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public td.g f53859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f53860f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f53861t;

    public d(List list, h hVar, f fVar) {
        this.f53855a = list;
        this.f53856b = hVar;
        this.f53857c = fVar;
    }

    @Override // vd.g
    public final boolean a() {
        while (true) {
            List list = this.f53860f;
            boolean z11 = false;
            if (list != null && this.f53861t < list.size()) {
                this.H = null;
                while (!z11 && this.f53861t < this.f53860f.size()) {
                    List list2 = this.f53860f;
                    int i11 = this.f53861t;
                    this.f53861t = i11 + 1;
                    zd.q qVar = (zd.q) list2.get(i11);
                    File file = this.K;
                    h hVar = this.f53856b;
                    this.H = qVar.b(file, hVar.f53884e, hVar.f53885f, hVar.f53888i);
                    if (this.H != null && this.f53856b.c(this.H.f59182c.a()) != null) {
                        this.H.f59182c.e(this.f53856b.f53893o, this);
                        z11 = true;
                    }
                }
                return z11;
            }
            int i12 = this.f53858d + 1;
            this.f53858d = i12;
            if (i12 >= this.f53855a.size()) {
                return false;
            }
            td.g gVar = (td.g) this.f53855a.get(this.f53858d);
            h hVar2 = this.f53856b;
            File fileJ = hVar2.f53887h.a().j(new e(gVar, hVar2.f53892n));
            this.K = fileJ;
            if (fileJ != null) {
                this.f53859e = gVar;
                this.f53860f = this.f53856b.f53882c.a().f(fileJ);
                this.f53861t = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        this.f53857c.c(this.f53859e, exc, this.H.f59182c, td.a.DATA_DISK_CACHE);
    }

    @Override // vd.g
    public final void cancel() {
        zd.p pVar = this.H;
        if (pVar != null) {
            pVar.f59182c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        this.f53857c.b(this.f53859e, obj, this.H.f59182c, td.a.DATA_DISK_CACHE, this.f53859e);
    }
}
