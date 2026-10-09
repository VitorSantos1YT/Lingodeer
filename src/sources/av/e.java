package av;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import b0.q0;
import b0.s0;
import com.lingodeer.data.model.CourseWord;
import d0.l1;
import d0.o1;
import java.io.File;
import java.util.List;
import jt.m1;
import l1.i1;
import vt.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends xy.i implements fz.e {
    public Object H;
    public /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3122f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f3123t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ContentResolver contentResolver, Uri uri, i5.a aVar, tz.h hVar, Context context, vy.d dVar) {
        super(2, dVar);
        this.f3117a = 9;
        this.f3121e = contentResolver;
        this.f3122f = uri;
        this.f3123t = aVar;
        this.H = hVar;
        this.K = context;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0148 A[Catch: all -> 0x01ac, LOOP:1: B:42:0x0100->B:58:0x0148, LOOP_END, TryCatch #6 {all -> 0x01ac, blocks: (B:50:0x0131, B:66:0x015d, B:69:0x016c, B:73:0x0186, B:75:0x018f, B:54:0x013c, B:58:0x0148), top: B:118:0x0131 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01a7 -> B:81:0x01a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object e(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: av.e.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r2v7, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r2v9, types: [fz.c, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3117a) {
            case 0:
                return new e((i) this.f3119c, (File) this.f3120d, (String) this.f3121e, (fz.a) this.f3122f, (List) this.f3123t, (List) this.H, (fz.e) this.K, dVar, 0);
            case 1:
                e eVar = new e((q0) this.f3123t, (s0) this.H, (fz.c) this.K, dVar);
                eVar.f3122f = obj;
                return eVar;
            case 2:
                return new e((bc.g) this.f3119c, (kotlin.jvm.internal.y) this.f3120d, (kotlin.jvm.internal.y) this.f3121e, (gc.i) this.f3122f, this.f3123t, (kotlin.jvm.internal.y) this.H, (vb.c) this.K, dVar, 2);
            case 3:
                return new e((bc.g) this.f3119c, (gc.i) this.f3120d, this.f3121e, (gc.l) this.f3122f, (vb.c) this.f3123t, (ec.a) this.H, (bc.i) this.K, dVar, 3);
            case 4:
                return new e((m1) this.f3119c, (CourseWord) this.f3120d, (fz.c) this.f3121e, (fz.a) this.f3122f, (ht.o) this.f3123t, (i1) this.H, (fz.e) this.K, dVar, 4);
            case 5:
                e eVar2 = new e((l1) this.f3123t, (o1) this.H, (fz.c) this.K, dVar);
                eVar2.f3122f = obj;
                return eVar2;
            case 6:
                e eVar3 = new e((l1) this.f3123t, (i1.i0) this.H, (fz.c) this.K, dVar);
                eVar3.f3122f = obj;
                return eVar3;
            case 7:
                e eVar4 = new e((fz.a) this.f3122f, dVar);
                eVar4.K = obj;
                return eVar4;
            case 8:
                return new e((v0) this.K, (String) this.f3121e, dVar);
            default:
                e eVar5 = new e((ContentResolver) this.f3121e, (Uri) this.f3122f, (i5.a) this.f3123t, (tz.h) this.H, (Context) this.K, dVar);
                eVar5.f3120d = obj;
                return eVar5;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3117a) {
            case 0:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((e) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((e) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(q0 q0Var, s0 s0Var, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f3117a = 1;
        this.f3123t = q0Var;
        this.H = s0Var;
        this.K = (xy.i) cVar;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02da  */
    /* JADX WARN: Code duplicated, block: B:119:0x0300  */
    /* JADX WARN: Code duplicated, block: B:122:0x0304  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #10 {all -> 0x002f, blocks: (B:9:0x0029, B:20:0x0060, B:24:0x0072, B:26:0x007a, B:16:0x0042, B:19:0x0057), top: B:532:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:287:0x0603  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:476:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:477:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:480:0x0b0e  */
    /* JADX WARN: Code duplicated, block: B:482:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:486:0x0b47  */
    /* JADX WARN: Code duplicated, block: B:489:0x0b52  */
    /* JADX WARN: Code duplicated, block: B:494:0x0b5f  */
    /* JADX WARN: Code duplicated, block: B:586:0x0b61 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v39, types: [a00.a, int] */
    /* JADX WARN: Type inference failed for: r2v84, types: [a00.a, int] */
    /* JADX WARN: Type inference failed for: r2v99, types: [a00.a, int] */
    /* JADX WARN: Type inference failed for: r4v11, types: [fz.c] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v34, types: [fz.c] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v48, types: [fz.c] */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009f -> B:20:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 3122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: av.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(l1 l1Var, o1 o1Var, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f3117a = 5;
        this.f3123t = l1Var;
        this.H = o1Var;
        this.K = (xy.i) cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(l1 l1Var, i1.i0 i0Var, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f3117a = 6;
        this.f3123t = l1Var;
        this.H = i0Var;
        this.K = (xy.i) cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fz.a aVar, vy.d dVar) {
        super(2, dVar);
        this.f3117a = 7;
        this.f3122f = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3117a = i11;
        this.f3119c = obj;
        this.f3120d = obj2;
        this.f3121e = obj3;
        this.f3122f = obj4;
        this.f3123t = obj5;
        this.H = obj6;
        this.K = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v0 v0Var, String str, vy.d dVar) {
        super(2, dVar);
        this.f3117a = 8;
        this.K = v0Var;
        this.f3121e = str;
    }
}
