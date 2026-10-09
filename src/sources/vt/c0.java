package vt;

import com.lingodeer.database.CharacterStrokeDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends xy.i implements fz.e {
    public final /* synthetic */ ArrayList H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f54181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f54182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54186f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f54187t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ArrayList arrayList, vy.d dVar) {
        super(2, dVar);
        this.H = arrayList;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        c0 c0Var = new c0(this.H, dVar);
        c0Var.f54187t = obj;
        return c0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((CharacterStrokeDatabase) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0080  */
    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0073 -> B:14:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x0088
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f54187t
            com.lingodeer.database.CharacterStrokeDatabase r0 = (com.lingodeer.database.CharacterStrokeDatabase) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r12.f54186f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L28
            if (r2 != r3) goto L20
            int r2 = r12.f54185e
            int r5 = r12.f54184d
            int r6 = r12.f54183c
            java.util.Iterator r7 = r12.f54182b
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.util.Collection r8 = r12.f54181a
            java.util.Collection r8 = (java.util.Collection) r8
            com.bumptech.glide.e.F(r13)
            goto L76
        L20:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L28:
            com.bumptech.glide.e.F(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r2 = r12.H
            java.util.Iterator r2 = r2.iterator()
            r8 = r13
            r7 = r2
            r2 = r4
            r5 = r2
            r6 = r5
        L3b:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L8c
            java.lang.Object r13 = r7.next()
            java.lang.String r13 = (java.lang.String) r13
            au.p r9 = r0.z()
            java.lang.String r13 = md.a.j(r13)
            java.lang.String r10 = "encryptDES(...)"
            kotlin.jvm.internal.m.e(r13, r10)
            r12.f54187t = r0
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10
            r12.f54181a = r10
            r10 = r7
            java.util.Iterator r10 = (java.util.Iterator) r10
            r12.f54182b = r10
            r12.f54183c = r6
            r12.f54184d = r5
            r12.f54185e = r2
            r12.f54186f = r3
            w9.s r10 = r9.f3057a
            au.f r11 = new au.f
            r11.<init>(r13, r9)
            java.lang.Object r13 = cf.x.C(r12, r10, r3, r4, r11)
            if (r13 != r1) goto L76
            return r1
        L76:
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = ry.m.s0(r13)
            com.lingodeer.database.model.CharacterStrokeEntity r13 = (com.lingodeer.database.model.CharacterStrokeEntity) r13
            if (r13 == 0) goto L85
            com.lingodeer.data.model.characterstroke.CharacterStroke r13 = com.lingodeer.data.model.characterstroke.CharacterStrokeKt.asExternalModel(r13)
            goto L86
        L85:
            r13 = 0
        L86:
            if (r13 == 0) goto L3b
            r8.add(r13)
            goto L3b
        L8c:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
