package z6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f58944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f58945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f58946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f58947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f58948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f58949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f58950h;

    public g() {
        ByteBuffer byteBuffer = f.f58943a;
        this.f58948f = byteBuffer;
        this.f58949g = byteBuffer;
        e eVar = e.f58938e;
        this.f58946d = eVar;
        this.f58947e = eVar;
        this.f58944b = eVar;
        this.f58945c = eVar;
    }

    @Override // z6.f
    public boolean a() {
        return this.f58950h && this.f58949g == f.f58943a;
    }

    @Override // z6.f
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f58949g;
        this.f58949g = f.f58943a;
        return byteBuffer;
    }

    @Override // z6.f
    public final void d() {
        this.f58950h = true;
        h();
    }

    @Override // z6.f
    public final e e(e eVar) {
        this.f58946d = eVar;
        this.f58947e = f(eVar);
        return isActive() ? this.f58947e : e.f58938e;
    }

    public abstract e f(e eVar);

    @Override // z6.f
    public final void flush() {
        this.f58949g = f.f58943a;
        this.f58950h = false;
        this.f58944b = this.f58946d;
        this.f58945c = this.f58947e;
        g();
    }

    @Override // z6.f
    public boolean isActive() {
        return this.f58947e != e.f58938e;
    }

    public final ByteBuffer j(int i11) {
        if (this.f58948f.capacity() < i11) {
            this.f58948f = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.f58948f.clear();
        }
        ByteBuffer byteBuffer = this.f58948f;
        this.f58949g = byteBuffer;
        return byteBuffer;
    }

    @Override // z6.f
    public final void reset() {
        ByteBuffer byteBuffer = f.f58943a;
        this.f58949g = byteBuffer;
        this.f58950h = false;
        this.f58948f = byteBuffer;
        e eVar = e.f58938e;
        this.f58946d = eVar;
        this.f58947e = eVar;
        this.f58944b = eVar;
        this.f58945c = eVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
