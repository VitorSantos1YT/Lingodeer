package vb;

import ac.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kc.k;
import okhttp3.HttpUrl;
import qy.l;
import qy.q;
import rz.b2;
import rz.e0;
import rz.o0;
import wz.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f53828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc.c f53829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f53830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f53831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ob.c f53832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f53833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f53834g;

    public i(Context context, gc.c cVar, q qVar, q qVar2, q qVar3, b bVar, k kVar) {
        this.f53828a = context;
        this.f53829b = cVar;
        this.f53830c = qVar;
        this.f53831d = kVar;
        b2 b2VarE = e0.e();
        yz.f fVar = o0.f50940a;
        e0.c(ew.a.w(b2VarE, m.f55536a.f51961d).plus(new h(this)));
        kc.m mVar = new kc.m(this);
        ob.c cVar2 = new ob.c(this, mVar);
        this.f53832e = cVar2;
        a9.i iVar = new a9.i();
        iVar.f517a = ry.m.c1(bVar.f53809a);
        iVar.f518b = ry.m.c1(bVar.f53810b);
        iVar.f519c = ry.m.c1(bVar.f53811c);
        iVar.f520d = ry.m.c1(bVar.f53812d);
        iVar.f521e = ry.m.c1(bVar.f53813e);
        iVar.e(new dc.a(2), HttpUrl.class);
        int i11 = 5;
        iVar.e(new dc.a(i11), String.class);
        iVar.e(new dc.a(1), Uri.class);
        int i12 = 4;
        iVar.e(new dc.a(i12), Uri.class);
        int i13 = 3;
        iVar.e(new dc.a(i13), Integer.class);
        int i14 = 0;
        iVar.e(new dc.a(i14), byte[].class);
        cc.c cVar3 = new cc.c();
        ArrayList arrayList = (ArrayList) iVar.f519c;
        arrayList.add(new l(cVar3, Uri.class));
        arrayList.add(new l(new cc.a(kVar.f38065a), File.class));
        iVar.d(new j(qVar3, qVar2, kVar.f38067c), Uri.class);
        iVar.d(new ac.a(i11), File.class);
        iVar.d(new ac.a(i14), Uri.class);
        iVar.d(new ac.a(i13), Uri.class);
        iVar.d(new ac.a(6), Uri.class);
        iVar.d(new ac.a(i12), Drawable.class);
        iVar.d(new ac.a(1), Bitmap.class);
        iVar.d(new ac.a(2), ByteBuffer.class);
        xb.b bVar2 = new xb.b(kVar.f38068d, kVar.f38069e);
        ArrayList arrayList2 = (ArrayList) iVar.f521e;
        arrayList2.add(bVar2);
        List listY = com.bumptech.glide.g.y((ArrayList) iVar.f517a);
        this.f53833f = new b(listY, com.bumptech.glide.g.y((ArrayList) iVar.f518b), com.bumptech.glide.g.y(arrayList), com.bumptech.glide.g.y((ArrayList) iVar.f520d), com.bumptech.glide.g.y(arrayList2));
        this.f53834g = ry.m.G0(new bc.g(this, mVar, cVar2), listY);
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d0 A[Catch: all -> 0x00d4, TryCatch #3 {all -> 0x00d4, blocks: (B:43:0x00c6, B:45:0x00d0, B:48:0x00d9, B:50:0x00e4, B:51:0x00e7), top: B:101:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4 A[Catch: all -> 0x00d4, TryCatch #3 {all -> 0x00d4, blocks: (B:43:0x00c6, B:45:0x00d0, B:48:0x00d9, B:50:0x00e4, B:51:0x00e7), top: B:101:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0134 A[Catch: all -> 0x0160, TryCatch #1 {all -> 0x0160, blocks: (B:61:0x012e, B:63:0x0134, B:70:0x0156, B:66:0x0143, B:69:0x0150, B:75:0x0162, B:77:0x0166, B:80:0x0177, B:81:0x017c), top: B:98:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x0143 A[Catch: all -> 0x0160, TryCatch #1 {all -> 0x0160, blocks: (B:61:0x012e, B:63:0x0134, B:70:0x0156, B:66:0x0143, B:69:0x0150, B:75:0x0162, B:77:0x0166, B:80:0x0177, B:81:0x017c), top: B:98:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0150 A[Catch: all -> 0x0160, TryCatch #1 {all -> 0x0160, blocks: (B:61:0x012e, B:63:0x0134, B:70:0x0156, B:66:0x0143, B:69:0x0150, B:75:0x0162, B:77:0x0166, B:80:0x0177, B:81:0x017c), top: B:98:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0162 A[Catch: all -> 0x0160, TryCatch #1 {all -> 0x0160, blocks: (B:61:0x012e, B:63:0x0134, B:70:0x0156, B:66:0x0143, B:69:0x0150, B:75:0x0162, B:77:0x0166, B:80:0x0177, B:81:0x017c), top: B:98:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0166 A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #1 {all -> 0x0160, blocks: (B:61:0x012e, B:63:0x0134, B:70:0x0156, B:66:0x0143, B:69:0x0150, B:75:0x0162, B:77:0x0166, B:80:0x0177, B:81:0x017c), top: B:98:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0177 A[Catch: all -> 0x0160, TRY_ENTER, TryCatch #1 {all -> 0x0160, blocks: (B:61:0x012e, B:63:0x0134, B:70:0x0156, B:66:0x0143, B:69:0x0150, B:75:0x0162, B:77:0x0166, B:80:0x0177, B:81:0x017c), top: B:98:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x018f A[Catch: all -> 0x019e, TryCatch #7 {all -> 0x019e, blocks: (B:88:0x018b, B:90:0x018f, B:93:0x01a0, B:94:0x01a9), top: B:109:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01a0 A[Catch: all -> 0x019e, TryCatch #7 {all -> 0x019e, blocks: (B:88:0x018b, B:90:0x018f, B:93:0x01a0, B:94:0x01a9), top: B:109:0x018b }] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (kc.d.a(r0, r2) == r3) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(vb.i r20, gc.i r21, int r22, xy.c r23) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.i.a(vb.i, gc.i, int, xy.c):java.lang.Object");
    }

    public static void b(gc.e eVar, ic.a aVar, c cVar) {
        gc.i iVar = eVar.f28998b;
        if (aVar instanceof wb.j) {
            jc.f fVarA = iVar.f29024g.a((wb.j) aVar, eVar);
            if (!(fVarA instanceof jc.d)) {
                cVar.getClass();
                fVarA.a();
            }
        }
        cVar.getClass();
        iVar.getClass();
    }
}
