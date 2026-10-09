package b1;

import android.view.textclassifier.TextClassifier;
import bh.a1;
import bp.b5;
import bp.r2;
import bv.c0;
import com.google.api.Service;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.course.ui.CourseTestOutActivity;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScDetailAdapter;
import com.lingo.lingoskill.ui.base.FindPasswordActivity;
import com.lingo.lingoskill.ui.base.NewsFeedActivity;
import com.lingo.lingoskill.ui.base.NewsFeedWebActivity;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingo.me.MeAccountSettingsActivity;
import com.lingo.me.MeSettingsActivity;
import com.lingodeer.data.model.CourseLessonFinishStatus;
import com.lingodeer.data.model.CourseUnitFinishStatus;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.LoginHistory;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import jt.k0;
import jt.l0;
import jt.s0;
import l1.b1;
import rt.sf;
import rz.b0;
import rz.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i11, e2.v vVar, b1 b1Var, vy.d dVar) {
        super(2, dVar);
        this.f3768a = 14;
        this.f3769b = i11;
        this.f3770c = vVar;
        this.f3771d = b1Var;
    }

    /* JADX WARN: Type inference failed for: r1v36, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r1v54, types: [fz.e, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3768a) {
            case 0:
                return new c(0, (e) this.f3770c, (p) this.f3771d, dVar);
            case 1:
                return new c(1, (g1) this.f3770c, (m) this.f3771d, dVar);
            case 2:
                return new c(2, (r) this.f3770c, (b0.f) this.f3771d, dVar);
            case 3:
                return new c(3, (List) this.f3770c, (bh.t) this.f3771d, dVar);
            case 4:
                return new c(4, (a1) this.f3770c, (CourseLessonFinishStatus) this.f3771d, dVar);
            case 5:
                return new c(5, (a1) this.f3770c, (CourseUnitFinishStatus) this.f3771d, dVar);
            case 6:
                return new c(6, (FindPasswordActivity) this.f3770c, (String) this.f3771d, dVar);
            case 7:
                c cVar = new c((r2) this.f3771d, dVar, 7);
                cVar.f3770c = obj;
                return cVar;
            case 8:
                return new c(8, (r2) this.f3770c, (LoginHistory) this.f3771d, dVar);
            case 9:
                return new c((NewsFeedActivity) this.f3771d, dVar, 9);
            case 10:
                return new c(10, (NewsFeedWebActivity) this.f3770c, (String) this.f3771d, dVar);
            case 11:
                return new c((b5) this.f3771d, dVar, 11);
            case 12:
                return new c((UpdateLessonActivity) this.f3771d, dVar, 12);
            case 13:
                return new c(13, (b0.d) this.f3770c, (c0) this.f3771d, dVar);
            case 14:
                return new c(this.f3769b, (e2.v) this.f3770c, (b1) this.f3771d, dVar);
            case 15:
                return new c(15, (k0) this.f3770c, (CourseWord) this.f3771d, dVar);
            case 16:
                return new c(16, (l0) this.f3770c, (CourseWord) this.f3771d, dVar);
            case 17:
                return new c(17, (x1.p) this.f3770c, (b1) this.f3771d, dVar);
            case 18:
                return new c(18, (s0) this.f3770c, (List) this.f3771d, dVar);
            case 19:
                return new c((w9.s) this.f3770c, (fz.c) this.f3771d, dVar);
            case 20:
                return new c(20, (CourseTestIndexActivity) this.f3770c, (sf) this.f3771d, dVar);
            case 21:
                return new c(21, (CourseTestOutActivity) this.f3770c, (b1) this.f3771d, dVar);
            case 22:
                return new c(22, (ScDetailAdapter) this.f3770c, (String) this.f3771d, dVar);
            case 23:
                return new c(23, (ScDetailAdapter) this.f3770c, (List) this.f3771d, dVar);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new c(24, (File) this.f3770c, (MeAccountSettingsActivity) this.f3771d, dVar);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new c(25, (MeSettingsActivity) this.f3770c, (com.google.accompanist.permissions.a) this.f3771d, dVar);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new c(26, (h0.i) this.f3770c, (h0.f) this.f3771d, dVar);
            case 27:
                return new c(27, (h0.i) this.f3770c, (h0.g) this.f3771d, dVar);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new c((TextClassifier) this.f3770c, (fz.e) this.f3771d, dVar);
            default:
                c cVar2 = new c((e6.c) this.f3771d, dVar, 29);
                cVar2.f3770c = obj;
                return cVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvocationTargetException {
        switch (this.f3768a) {
            case 0:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((c) create((String) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                c cVar = (c) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                cVar.invokeSuspend(b0Var);
                return b0Var;
            case 15:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((c) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((c) create((m6.l) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f3768a = i11;
        this.f3770c = obj;
        this.f3771d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0399  */
    /* JADX WARN: Code duplicated, block: B:419:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:420:0x0a57 A[Catch: all -> 0x0a0e, TryCatch #0 {all -> 0x0a0e, blocks: (B:395:0x0a0a, B:423:0x0a65, B:417:0x0a4e, B:420:0x0a57, B:401:0x0a16, B:402:0x0a1a, B:415:0x0a48, B:416:0x0a4d, B:410:0x0a35, B:412:0x0a3e), top: B:448:0x09fe }] */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x036a, code lost:
    
        if (((fr.o0) r2).P(true, r27) == r1) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0a62, code lost:
    
        if (rz.e0.m(500, r27) == r0) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0ac8, code lost:
    
        if (uz.w0.l((uz.w0) r1, r2, r27) == r0) goto L444;
     */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r14v20, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r14v29, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:421:0x0a62 -> B:423:0x0a65). Please report as a decompilation issue!!! */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.IllegalAccessException, javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 2834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(TextClassifier textClassifier, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f3768a = 28;
        this.f3770c = textClassifier;
        this.f3771d = (xy.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3768a = i11;
        this.f3771d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(w9.s sVar, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f3768a = 19;
        this.f3770c = sVar;
        this.f3771d = (xy.i) cVar;
    }
}
