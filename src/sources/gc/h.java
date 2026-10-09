package gc;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Headers;
import ry.r;
import ry.x;
import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f29003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f29004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ic.a f29005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hc.d f29006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f29007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public jc.e f29008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Headers.Builder f29009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f29010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f29011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f29012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f29013l;
    public hc.h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public hc.f f29014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Lifecycle f29015o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public hc.h f29016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public hc.f f29017q;

    public h(Context context) {
        this.f29002a = context;
        this.f29003b = kc.f.f38055a;
        this.f29004c = null;
        this.f29005d = null;
        this.f29006e = null;
        this.f29007f = r.f50854a;
        this.f29008g = null;
        this.f29009h = null;
        this.f29010i = null;
        this.f29011j = true;
        this.f29012k = true;
        this.f29013l = null;
        this.m = null;
        this.f29014n = null;
        this.f29015o = null;
        this.f29016p = null;
        this.f29017q = null;
    }

    public final i a() {
        hc.h hVar;
        Object obj = this.f29004c;
        if (obj == null) {
            obj = k.f29043a;
        }
        Object obj2 = obj;
        ic.a aVar = this.f29005d;
        c cVar = this.f29003b;
        Bitmap.Config config = cVar.f28988g;
        hc.d dVar = this.f29006e;
        if (dVar == null) {
            dVar = cVar.f28987f;
        }
        hc.d dVar2 = dVar;
        jc.e eVar = this.f29008g;
        if (eVar == null) {
            eVar = cVar.f28986e;
        }
        jc.e eVar2 = eVar;
        Headers.Builder builder = this.f29009h;
        Headers headersD = builder != null ? builder.d() : null;
        if (headersD == null) {
            headersD = kc.h.f38059c;
        } else {
            Bitmap.Config[] configArr = kc.h.f38057a;
        }
        Headers headers = headersD;
        LinkedHashMap linkedHashMap = this.f29010i;
        p pVar = linkedHashMap != null ? new p(com.bumptech.glide.g.z(linkedHashMap)) : null;
        if (pVar == null) {
            pVar = p.f29068b;
        }
        p pVar2 = pVar;
        c cVar2 = this.f29003b;
        boolean z11 = cVar2.f28989h;
        cVar2.getClass();
        c cVar3 = this.f29003b;
        b bVar = cVar3.f28990i;
        b bVar2 = cVar3.f28991j;
        b bVar3 = cVar3.f28992k;
        y yVar = cVar3.f28982a;
        y yVar2 = cVar3.f28983b;
        y yVar3 = cVar3.f28984c;
        y yVar4 = cVar3.f28985d;
        Lifecycle lifecycle = this.f29015o;
        Context context = this.f29002a;
        if (lifecycle == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof LifecycleOwner) {
                    lifecycle = ((LifecycleOwner) baseContext).getLifecycle();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = g.f29000a;
            }
        }
        Lifecycle lifecycle2 = lifecycle;
        hc.h hVar2 = this.m;
        if (hVar2 == null) {
            hc.h cVar4 = this.f29016p;
            if (cVar4 == null) {
                cVar4 = new hc.c(context);
            }
            hVar = cVar4;
        } else {
            hVar = hVar2;
        }
        hc.f fVar = this.f29014n;
        if (fVar == null && (fVar = this.f29017q) == null) {
            if ((hVar2 instanceof hc.i ? (hc.i) hVar2 : null) != null) {
                throw null;
            }
            fVar = hc.f.FIT;
        }
        hc.f fVar2 = fVar;
        m mVar = this.f29013l;
        n nVar = mVar != null ? new n(com.bumptech.glide.g.z(mVar.f29058a)) : null;
        if (nVar == null) {
            nVar = n.f29059b;
        }
        return new i(context, obj2, aVar, config, dVar2, this.f29007f, eVar2, headers, pVar2, this.f29011j, z11, false, this.f29012k, bVar, bVar2, bVar3, yVar, yVar2, yVar3, yVar4, lifecycle2, hVar, fVar2, nVar, new d(this.m, this.f29014n, this.f29008g, this.f29006e), this.f29003b);
    }

    public final void b() {
        this.f29008g = new jc.a(100);
    }

    public h(i iVar, Context context) {
        this.f29002a = context;
        this.f29003b = iVar.f29042z;
        this.f29004c = iVar.f29019b;
        this.f29005d = iVar.f29020c;
        d dVar = iVar.f29041y;
        this.f29006e = dVar.f28996d;
        this.f29007f = iVar.f29023f;
        this.f29008g = dVar.f28995c;
        this.f29009h = iVar.f29025h.e();
        this.f29010i = x.k0(iVar.f29026i.f29069a);
        this.f29011j = iVar.f29027j;
        this.f29012k = iVar.m;
        this.f29013l = new m(iVar.f29040x);
        this.m = dVar.f28993a;
        this.f29014n = dVar.f28994b;
        if (iVar.f29018a == context) {
            this.f29015o = iVar.f29037u;
            this.f29016p = iVar.f29038v;
            this.f29017q = iVar.f29039w;
        } else {
            this.f29015o = null;
            this.f29016p = null;
            this.f29017q = null;
        }
    }
}
