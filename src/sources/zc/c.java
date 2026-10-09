package zc;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59089a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ld.a f59091c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f59092d = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ld.a f59090b = b(CropImageView.DEFAULT_ASPECT_RATIO);

    public c(List list) {
        this.f59089a = list;
    }

    @Override // zc.b
    public final boolean a(float f5) {
        ld.a aVar = this.f59091c;
        ld.a aVar2 = this.f59090b;
        if (aVar == aVar2 && this.f59092d == f5) {
            return true;
        }
        this.f59091c = aVar2;
        this.f59092d = f5;
        return false;
    }

    public final ld.a b(float f5) {
        List list = this.f59089a;
        ld.a aVar = (ld.a) nv.p.g(1, list);
        if (f5 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            ld.a aVar2 = (ld.a) list.get(size);
            if (this.f59090b != aVar2 && f5 >= aVar2.b() && f5 < aVar2.a()) {
                return aVar2;
            }
        }
        return (ld.a) list.get(0);
    }

    @Override // zc.b
    public final ld.a c() {
        return this.f59090b;
    }

    @Override // zc.b
    public final boolean d(float f5) {
        ld.a aVar = this.f59090b;
        if (f5 >= aVar.b() && f5 < aVar.a()) {
            return !this.f59090b.c();
        }
        this.f59090b = b(f5);
        return true;
    }

    @Override // zc.b
    public final float f() {
        return ((ld.a) nv.p.g(1, this.f59089a)).a();
    }

    @Override // zc.b
    public final float g() {
        return ((ld.a) this.f59089a.get(0)).b();
    }

    @Override // zc.b
    public final boolean isEmpty() {
        return false;
    }
}
