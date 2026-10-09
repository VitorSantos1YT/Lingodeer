package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements vy.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f43434a = new z0();

    /* JADX WARN: Can't wrap try/catch for region: R(4:31|17|18|33) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        r2 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r13.f43290a = r12;
        r13.f43291b = r4;
        r13.f43293d = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (rz.e0.m(r4, r13) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:27:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.io.FileOutputStream r12, xy.c r13) throws java.io.IOException {
        /*
            boolean r0 = r13 instanceof n5.i0
            if (r0 == 0) goto L13
            r0 = r13
            n5.i0 r0 = (n5.i0) r0
            int r1 = r0.f43293d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43293d = r1
            goto L18
        L13:
            n5.i0 r0 = new n5.i0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f43292c
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f43293d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            long r4 = r0.f43291b
            java.io.FileOutputStream r12 = r0.f43290a
            com.bumptech.glide.e.F(r13)
            r13 = r0
            goto L75
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            com.bumptech.glide.e.F(r13)
            r4 = 10
            r13 = r0
        L3a:
            r6 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
        */
        //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
        /*
            if (r0 > 0) goto L7a
            java.nio.channels.FileChannel r6 = r12.getChannel()     // Catch: java.io.IOException -> L58
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r7 = 0
            java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L58
            kotlin.jvm.internal.m.e(r0, r2)     // Catch: java.io.IOException -> L58
            r1 = r0
            goto L8d
        L58:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            if (r2 == 0) goto L79
            java.lang.String r6 = "Resource deadlock would occur"
            r7 = 0
            boolean r2 = oz.q.v0(r2, r6, r7)
            if (r2 != r3) goto L79
            r13.f43290a = r12
            r13.f43291b = r4
            r13.f43293d = r3
            java.lang.Object r0 = rz.e0.m(r4, r13)
            if (r0 != r1) goto L75
            goto L8d
        L75:
            r0 = 2
            long r6 = (long) r0
            long r4 = r4 * r6
            goto L3a
        L79:
            throw r0
        L7a:
            java.nio.channels.FileChannel r6 = r12.getChannel()
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r7 = 0
            java.nio.channels.FileLock r1 = r6.lock(r7, r9, r11)
            kotlin.jvm.internal.m.e(r1, r2)
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.z0.a(java.io.FileOutputStream, xy.c):java.lang.Object");
    }
}
