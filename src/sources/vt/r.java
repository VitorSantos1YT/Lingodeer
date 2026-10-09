package vt;

import com.lingodeer.database.UserDataDatabase;
import com.lingodeer.database.model.BookmarkFolderEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDataDatabase f54281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final au.i f54282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final au.m f54283c;

    public r(UserDataDatabase userDataDatabase, au.i iVar, au.m mVar) {
        this.f54281a = userDataDatabase;
        this.f54282b = iVar;
        this.f54283c = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(r rVar, String str, String str2, String str3, String str4, xy.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i11 = qVar.f54280d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                qVar.f54280d = i11 - Integer.MIN_VALUE;
            } else {
                qVar = new q(rVar, cVar);
            }
        } else {
            qVar = new q(rVar, cVar);
        }
        Object objC = qVar.f54278b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = qVar.f54280d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objC);
            if (oz.q.K0(str3)) {
                return u.f54290a;
            }
            if (str3.length() > 40) {
                return v.f54291a;
            }
            au.m mVar = rVar.f54283c;
            qVar.f54277a = str4;
            qVar.f54280d = 1;
            objC = cf.x.C(qVar, mVar.f3044a, true, false, new aj.c(str, str2, str3, 5));
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = qVar.f54277a;
            com.bumptech.glide.e.F(objC);
        }
        BookmarkFolderEntity bookmarkFolderEntity = (BookmarkFolderEntity) objC;
        if (bookmarkFolderEntity == null || kotlin.jvm.internal.m.a(bookmarkFolderEntity.getId(), str4)) {
            return null;
        }
        return t.f54286a;
    }

    public final Object b(String str, String str2, String str3, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        return rz.e0.M(yz.e.f58387a, new b0.x0(25, (Object) this, (Object) str3, (Object) str, (Object) str2, (vy.d) null, false), iVar);
    }

    public final Object c(String str, List list, xy.c cVar) {
        if (list.isEmpty()) {
            return qy.b0.f48488a;
        }
        yz.f fVar = rz.o0.f50940a;
        return rz.e0.M(yz.e.f58387a, new l(str, list, this, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:26:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007c -> B:22:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.lang.String r10, java.util.Set r11, xy.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof vt.m
            if (r0 == 0) goto L13
            r0 = r12
            vt.m r0 = (vt.m) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            vt.m r0 = new vt.m
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f54255f
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.H
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            int r10 = r0.f54254e
            int r11 = r0.f54253d
            int r2 = r0.f54252c
            java.util.Set r5 = r0.f54251b
            java.util.Set r5 = (java.util.Set) r5
            java.lang.String r6 = r0.f54250a
            com.bumptech.glide.e.F(r12)
            goto L81
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            com.bumptech.glide.e.F(r12)
            r12 = 100
            r2 = r12
            r12 = r11
            r11 = r3
        L44:
            if (r11 >= r2) goto L8d
            r5 = 1000000000(0x3b9aca00, float:0.0047237873)
            jz.a r6 = jz.e.f37398b
            r7 = 10000000(0x989680, float:1.4012985E-38)
            int r5 = r6.e(r7, r5)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            boolean r6 = r12.contains(r6)
            if (r6 != 0) goto L8b
            r0.f54250a = r10
            r6 = r12
            java.util.Set r6 = (java.util.Set) r6
            r0.f54251b = r6
            r0.f54252c = r2
            r0.f54253d = r11
            r0.f54254e = r5
            r0.H = r4
            au.m r6 = r9.f54283c
            w9.s r6 = r6.f3044a
            au.l r7 = new au.l
            r7.<init>(r10, r5)
            java.lang.Object r6 = cf.x.C(r0, r6, r4, r3, r7)
            if (r6 != r1) goto L7c
            return r1
        L7c:
            r8 = r6
            r6 = r10
            r10 = r5
            r5 = r12
            r12 = r8
        L81:
            if (r12 != 0) goto L89
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
        L89:
            r12 = r5
            r10 = r6
        L8b:
            int r11 = r11 + r4
            goto L44
        L8d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Unable to generate bookmark folder server id"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.r.d(java.lang.String, java.util.Set, xy.c):java.lang.Object");
    }

    public final bh.i0 e(String lan, String contentType) {
        kotlin.jvm.internal.m.f(lan, "lan");
        kotlin.jvm.internal.m.f(contentType, "contentType");
        return new bh.i0(qx.p.l(this.f54283c.f3044a, new String[]{"bookmark_folder"}, new au.g(lan, contentType, 1)), 13);
    }
}
