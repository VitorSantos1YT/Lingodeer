package p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.e f46246a = new n1.e(new e[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0063 -> B:19:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(f2.c r10, xy.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p0.b
            if (r0 == 0) goto L13
            r0 = r11
            p0.b r0 = (p0.b) r0
            int r1 = r0.f46245t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46245t = r1
            goto L18
        L13:
            p0.b r0 = new p0.b
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f46243e
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f46245t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r10 = r0.f46242d
            int r2 = r0.f46241c
            java.lang.Object[] r4 = r0.f46240b
            f2.c r5 = r0.f46239a
            com.bumptech.glide.e.F(r11)
            r11 = r5
            goto L66
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            com.bumptech.glide.e.F(r11)
            n1.e r11 = r9.f46246a
            java.lang.Object[] r2 = r11.f43112a
            int r11 = r11.f43114c
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r8
            r8 = r4
            r4 = r2
            r2 = r8
        L48:
            if (r2 >= r10) goto L68
            r5 = r4[r2]
            p0.e r5 = (p0.e) r5
            lt.e r6 = new lt.e
            r7 = 12
            r6.<init>(r11, r7)
            r0.f46239a = r11
            r0.f46240b = r4
            r0.f46241c = r2
            r0.f46242d = r10
            r0.f46245t = r3
            java.lang.Object r5 = android.support.v4.media.session.a.e(r5, r6, r0)
            if (r5 != r1) goto L66
            return r1
        L66:
            int r2 = r2 + r3
            goto L48
        L68:
            qy.b0 r10 = qy.b0.f48488a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.c.a(f2.c, xy.c):java.lang.Object");
    }
}
