package zd;

import android.content.res.Resources;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f59156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f59157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f59158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f59160e;

    public e(Resources.Theme theme, Resources resources, f fVar, int i11) {
        this.f59156a = theme;
        this.f59157b = resources;
        this.f59158c = fVar;
        this.f59159d = i11;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.f59158c.a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f59160e;
        if (obj != null) {
            try {
                this.f59158c.g(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final td.a d() {
        return td.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.k kVar, com.bumptech.glide.load.data.c cVar) {
        try {
            Object objB = this.f59158c.b(this.f59159d, this.f59156a, this.f59157b);
            this.f59160e = objB;
            cVar.f(objB);
        } catch (Resources.NotFoundException e8) {
            cVar.c(e8);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
