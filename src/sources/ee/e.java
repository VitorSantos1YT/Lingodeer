package ee;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.p;
import ge.i;
import m0.n;
import vd.b0;
import vd.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b0, y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f25488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25489b;

    public e(Drawable drawable, int i11) {
        this.f25489b = i11;
        pe.f.c(drawable, "Argument must not be null");
        this.f25488a = drawable;
    }

    @Override // vd.y
    public void a() {
        switch (this.f25489b) {
            case 1:
                ((i) ((ge.d) this.f25488a).f29140a.f29139b).f29165l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f25488a;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof ge.d) {
                    ((i) ((ge.d) drawable).f29140a.f29139b).f29165l.prepareToDraw();
                }
                break;
        }
    }

    @Override // vd.b0
    public final void b() {
        n nVar;
        n nVar2;
        n nVar3;
        switch (this.f25489b) {
            case 0:
                break;
            default:
                ge.d dVar = (ge.d) this.f25488a;
                dVar.stop();
                dVar.f29143d = true;
                i iVar = (i) dVar.f29140a.f29139b;
                p pVar = iVar.f29157d;
                iVar.f29156c.clear();
                Bitmap bitmap = iVar.f29165l;
                if (bitmap != null) {
                    iVar.f29158e.d(bitmap);
                    iVar.f29165l = null;
                }
                iVar.f29159f = false;
                ge.f fVar = iVar.f29162i;
                if (fVar != null) {
                    pVar.j(fVar);
                    iVar.f29162i = null;
                }
                ge.f fVar2 = iVar.f29164k;
                if (fVar2 != null) {
                    pVar.j(fVar2);
                    iVar.f29164k = null;
                }
                ge.f fVar3 = iVar.m;
                if (fVar3 != null) {
                    pVar.j(fVar3);
                    iVar.m = null;
                }
                sd.d dVar2 = iVar.f29154a;
                ob.e eVar = dVar2.f51561c;
                dVar2.f51570l = null;
                byte[] bArr = dVar2.f51567i;
                if (bArr != null && (nVar3 = (n) eVar.f44805c) != null) {
                    nVar3.i(bArr);
                }
                int[] iArr = dVar2.f51568j;
                if (iArr != null && (nVar2 = (n) eVar.f44805c) != null) {
                    nVar2.i(iArr);
                }
                Bitmap bitmap2 = dVar2.m;
                if (bitmap2 != null) {
                    ((wd.a) eVar.f44804b).d(bitmap2);
                }
                dVar2.m = null;
                dVar2.f51562d = null;
                dVar2.f51576s = null;
                byte[] bArr2 = dVar2.f51563e;
                if (bArr2 != null && (nVar = (n) eVar.f44805c) != null) {
                    nVar.i(bArr2);
                }
                iVar.f29163j = true;
                break;
        }
    }

    @Override // vd.b0
    public final int c() {
        switch (this.f25489b) {
            case 0:
                Drawable drawable = this.f25488a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                i iVar = (i) ((ge.d) this.f25488a).f29140a.f29139b;
                sd.d dVar = iVar.f29154a;
                return (dVar.f51568j.length * 4) + dVar.f51562d.limit() + dVar.f51567i.length + iVar.f29166n;
        }
    }

    @Override // vd.b0
    public final Class d() {
        switch (this.f25489b) {
            case 0:
                return this.f25488a.getClass();
            default:
                return ge.d.class;
        }
    }

    @Override // vd.b0
    public final Object get() {
        Drawable drawable = this.f25488a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    private final void e() {
    }
}
