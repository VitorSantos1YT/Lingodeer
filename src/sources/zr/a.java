package zr;

import android.content.Context;
import android.net.Uri;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f59284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f59285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f59286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f59287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Context context, Uri uri, vy.d dVar) {
        super(2, dVar);
        this.f59285c = bVar;
        this.f59286d = context;
        this.f59287e = uri;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        a aVar = new a(this.f59285c, this.f59286d, this.f59287e, dVar);
        aVar.f59284b = obj;
        return aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r0 == r4) goto L30;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zr.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
