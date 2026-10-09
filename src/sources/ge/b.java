package ge;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import gb.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m0.n;
import td.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p20.c f29131f = new p20.c(13);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f29132g = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f29134b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ob.e f29137e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p20.c f29136d = f29131f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f29135c = f29132g;

    public b(Context context, ArrayList arrayList, wd.a aVar, n nVar) {
        this.f29133a = context.getApplicationContext();
        this.f29134b = arrayList;
        this.f29137e = new ob.e(11, aVar, nVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // td.l
    public final vd.b0 a(java.lang.Object r8, int r9, int r10, td.j r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            ge.a r8 = r7.f29135c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f29130a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            sd.c r0 = (sd.c) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            sd.c r0 = new sd.c     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f51556b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f51555a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            sd.b r0 = new sd.b     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f51557c = r0     // Catch: java.lang.Throwable -> L54
            r5.f51558d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f51556b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f51556b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            ee.e r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            ge.a r9 = r1.f29135c
            r9.a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            ge.a r9 = r1.f29135c
            r9.a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.b.a(java.lang.Object, int, int, td.j):vd.b0");
    }

    @Override // td.l
    public final boolean b(Object obj, td.j jVar) {
        return !((Boolean) jVar.c(j.f29170b)).booleanValue() && r.x(this.f29134b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final ee.e c(ByteBuffer byteBuffer, int i11, int i12, sd.c cVar, td.j jVar) {
        boolean zIsLoggable;
        int i13 = pe.h.f46822a;
        SystemClock.elapsedRealtimeNanos();
        try {
            sd.b bVarB = cVar.b();
            if (bVarB.f51546c > 0 && bVarB.f51545b == 0) {
                Bitmap.Config config = jVar.c(j.f29169a) == td.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(bVarB.f51550g / i12, bVarB.f51549f / i11);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                p20.c cVar2 = this.f29136d;
                ob.e eVar = this.f29137e;
                cVar2.getClass();
                sd.d dVar = new sd.d(eVar, bVarB, byteBuffer, iMax);
                dVar.c(config);
                dVar.f51569k = (dVar.f51569k + 1) % dVar.f51570l.f51546c;
                Bitmap bitmapB = dVar.b();
                if (bitmapB != null) {
                    return new ee.e(new d(new c(new i(com.bumptech.glide.c.c(this.f29133a), dVar, i11, i12, bitmapB), 0)), 1);
                }
                if (zIsLoggable) {
                    return null;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
