package ch;

import android.content.Context;
import android.graphics.Bitmap;
import com.lingo.course.ui.CourseTestActivity;
import java.io.File;
import l1.b1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends xy.i implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7104a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7109f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7110t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(CourseTestActivity courseTestActivity, boolean z11, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, vy.d dVar) {
        super(2, dVar);
        this.f7107d = courseTestActivity;
        this.f7106c = z11;
        this.f7108e = b1Var;
        this.f7109f = b1Var2;
        this.f7110t = b1Var3;
        this.H = b1Var4;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f7104a) {
            case 0:
                return new u((CourseTestActivity) this.f7107d, this.f7106c, (b1) this.f7108e, (b1) this.f7109f, (b1) this.f7110t, (b1) this.H, dVar);
            case 1:
                return new u((cu.g) this.f7107d, (Context) this.f7108e, (String) this.f7109f, (File) this.f7110t, (String) this.H, this.f7106c, dVar);
            case 2:
                u uVar = new u((kotlin.jvm.internal.w) this.f7109f, (n5.v) this.f7110t, this.H, this.f7106c, dVar);
                uVar.f7108e = obj;
                return uVar;
            default:
                return new u((zs.f) this.f7107d, (Context) this.f7108e, (zs.a) this.f7109f, this.f7106c, (String) this.f7110t, (Bitmap) this.H, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7104a) {
            case 0:
                return ((u) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((u) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((u) create((n5.e0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((u) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0120, code lost:
    
        if (r12.b(r9, r20) == r0) goto L41;
     */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(cu.g gVar, Context context, String str, File file, String str2, boolean z11, vy.d dVar) {
        super(2, dVar);
        this.f7107d = gVar;
        this.f7108e = context;
        this.f7109f = str;
        this.f7110t = file;
        this.H = str2;
        this.f7106c = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kotlin.jvm.internal.w wVar, n5.v vVar, Object obj, boolean z11, vy.d dVar) {
        super(2, dVar);
        this.f7109f = wVar;
        this.f7110t = vVar;
        this.H = obj;
        this.f7106c = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zs.f fVar, Context context, zs.a aVar, boolean z11, String str, Bitmap bitmap, vy.d dVar) {
        super(2, dVar);
        this.f7107d = fVar;
        this.f7108e = context;
        this.f7109f = aVar;
        this.f7106c = z11;
        this.f7110t = str;
        this.H = bitmap;
    }
}
