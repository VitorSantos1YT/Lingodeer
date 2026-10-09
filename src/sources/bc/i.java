package bc;

import android.content.Context;
import android.media.MediaPlayer;
import gc.j;
import gc.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4127g;

    public i(gc.i iVar, List list, int i11, gc.i iVar2, hc.g gVar, vb.c cVar, boolean z11) {
        this.f4123c = iVar;
        this.f4125e = list;
        this.f4121a = i11;
        this.f4124d = iVar2;
        this.f4126f = gVar;
        this.f4127g = cVar;
        this.f4122b = z11;
    }

    public void a(String str) {
        ((ArrayList) this.f4124d).add(str);
        ((ArrayList) this.f4123c).add(0);
    }

    public void b(gc.i iVar, g gVar) {
        Context context = iVar.f29018a;
        gc.i iVar2 = (gc.i) this.f4123c;
        if (context != iVar2.f29018a) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's context.").toString());
        }
        if (iVar.f29019b == k.f29043a) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot set the request's data to null.").toString());
        }
        if (iVar.f29020c != iVar2.f29020c) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's target.").toString());
        }
        if (iVar.f29037u != iVar2.f29037u) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (iVar.f29038v == iVar2.f29038v) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public void c() {
        ((ArrayList) this.f4124d).clear();
        ((ArrayList) this.f4123c).clear();
        this.f4122b = false;
        this.f4121a = 0;
    }

    public void d() {
        a9.i iVar = (a9.i) this.f4126f;
        MediaPlayer mediaPlayer = (MediaPlayer) iVar.f519c;
        if (mediaPlayer != null ? mediaPlayer.isPlaying() : false) {
            iVar.y();
        }
        e();
    }

    public boolean e() {
        a9.i iVar = (a9.i) this.f4126f;
        ArrayList arrayList = (ArrayList) this.f4124d;
        if (arrayList.size() == 0) {
            return false;
        }
        String str = (String) arrayList.get(this.f4121a);
        if (((Integer) ((ArrayList) this.f4123c).get(this.f4121a)).intValue() == 0) {
            iVar.v(str);
            return true;
        }
        try {
            iVar.f517a = ((Context) this.f4125e).getAssets().openFd(str);
            iVar.f518b = null;
            iVar.w();
            return true;
        } catch (IOException e8) {
            e8.printStackTrace();
            ((dm.a) this.f4127g).k(1);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object f(gc.i iVar, xy.c cVar) {
        h hVar;
        gc.i iVar2;
        g gVar;
        i iVar3;
        List list = (List) this.f4125e;
        int i11 = this.f4121a;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f4120e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                hVar.f4120e = i12 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objD = hVar.f4118c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = hVar.f4120e;
        if (i13 == 0) {
            com.bumptech.glide.e.F(objD);
            if (i11 > 0) {
                iVar2 = iVar;
                b(iVar2, (g) list.get(i11 - 1));
            } else {
                iVar2 = iVar;
            }
            gVar = (g) list.get(i11);
            i iVar4 = new i((gc.i) this.f4123c, (List) this.f4125e, i11 + 1, iVar2, (hc.g) this.f4126f, (vb.c) this.f4127g, this.f4122b);
            hVar.f4116a = this;
            hVar.f4117b = gVar;
            hVar.f4120e = 1;
            objD = gVar.d(iVar4, hVar);
            if (objD == aVar) {
                return aVar;
            }
            iVar3 = this;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = hVar.f4117b;
            iVar3 = hVar.f4116a;
            com.bumptech.glide.e.F(objD);
        }
        j jVar = (j) objD;
        iVar3.b(jVar.b(), gVar);
        return jVar;
    }

    public void g() {
        a9.i iVar = (a9.i) this.f4126f;
        MediaPlayer mediaPlayer = (MediaPlayer) iVar.f519c;
        if (mediaPlayer != null ? mediaPlayer.isPlaying() : false) {
            iVar.y();
            c();
        }
    }

    public i(Context context) {
        this.f4123c = new ArrayList();
        this.f4124d = new ArrayList();
        this.f4121a = 0;
        this.f4122b = false;
        this.f4125e = context;
        a9.i iVar = new a9.i(1);
        this.f4126f = iVar;
        dm.a aVar = new dm.a(this, 5);
        this.f4127g = aVar;
        iVar.f520d = aVar;
    }
}
