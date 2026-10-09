package zd;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements com.bumptech.glide.load.data.d, com.bumptech.glide.load.data.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f59186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y4.c f59187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.k f59189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.data.c f59190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f59191f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f59192t;

    public u(ArrayList arrayList, y4.c cVar) {
        this.f59187b = cVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f59186a = arrayList;
        this.f59188c = 0;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return ((com.bumptech.glide.load.data.d) this.f59186a.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        List list = this.f59191f;
        if (list != null) {
            this.f59187b.c(list);
        }
        this.f59191f = null;
        ArrayList arrayList = this.f59186a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((com.bumptech.glide.load.data.d) obj).b();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        List list = this.f59191f;
        pe.f.c(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f59192t = true;
        ArrayList arrayList = this.f59186a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((com.bumptech.glide.load.data.d) obj).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final td.a d() {
        return ((com.bumptech.glide.load.data.d) this.f59186a.get(0)).d();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.k kVar, com.bumptech.glide.load.data.c cVar) {
        this.f59189d = kVar;
        this.f59190e = cVar;
        this.f59191f = (List) this.f59187b.acquire();
        ((com.bumptech.glide.load.data.d) this.f59186a.get(this.f59188c)).e(kVar, this);
        if (this.f59192t) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        if (obj != null) {
            this.f59190e.f(obj);
        } else {
            g();
        }
    }

    public final void g() {
        if (this.f59192t) {
            return;
        }
        if (this.f59188c < this.f59186a.size() - 1) {
            this.f59188c++;
            e(this.f59189d, this.f59190e);
        } else {
            pe.f.b(this.f59191f);
            this.f59190e.c(new GlideException("Fetch failed", new ArrayList(this.f59191f)));
        }
    }
}
